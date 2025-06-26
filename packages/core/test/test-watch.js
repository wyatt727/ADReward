#!/usr/bin/env node
import path from 'path';
import fs from 'fs/promises';
import { fileURLToPath } from 'url';
import { watchFridaScript } from '../dist/watch.js';
import fs from 'fs';
import { watch } from '../src/watch.js';
import EventEmitter from 'events';

// Mock Frida script for testing
const __dirname = path.dirname(fileURLToPath(import.meta.url));
const scriptPath = path.join(__dirname, 'test-script.js');

// Create a test script file if it doesn't exist
async function createTestScript() {
  try {
    await fs.access(scriptPath);
  } catch (error) {
    // File doesn't exist, create it
    await fs.writeFile(scriptPath, `
// Test Frida script
Java.perform(() => {
  console.log("Frida script loaded");
  
  // Test hook
  const TestClass = Java.use("java.lang.String");
  TestClass.toString.implementation = function() {
    console.log("String.toString() called");
    return this.toString();
  };
});
`);
  }
}

// Main function
async function main() {
  try {
    // Create test script
    await createTestScript();
    console.log(`Test script created at: ${scriptPath}`);
    
    console.log("Starting watch mode. Edit the test script to see changes detected.");
    console.log("Press Ctrl+C to exit.");
    
    // Start watching (we won't actually run Frida, just test the watcher)
    const stopWatching = await watchFridaScript({
      scriptPath,
      packageName: "com.example.app",
      useReload: false // Force legacy mode for testing
    });
    
    // Keep process running and handle Ctrl+C
    process.on('SIGINT', () => {
      console.log('Stopping watch mode');
      stopWatching();
      process.exit(0);
    });
    
    // Keep process alive
    await new Promise(() => {});
  } catch (error) {
    console.error('Error:', error);
    process.exit(1);
  }
}

// Mock Frida for testing
jest.mock('child_process', () => {
  const mockExeca = {
    stdout: new EventEmitter(),
    stderr: new EventEmitter(),
    kill: jest.fn(),
    pid: 12345
  };
  
  return {
    spawn: jest.fn().mockImplementation(() => mockExeca),
    execa: {
      command: jest.fn().mockResolvedValue({ stdout: 'Frida 16.0.8' }),
    }
  };
});

describe('Watch mode functionality', () => {
  const tempScriptPath = path.join(__dirname, 'temp-watch-test.js');
  
  beforeEach(() => {
    // Create a temporary script file for testing
    fs.writeFileSync(tempScriptPath, 'console.log("Initial script");');
    
    // Reset mocks
    jest.clearAllMocks();
  });
  
  afterEach(() => {
    // Clean up temporary file
    if (fs.existsSync(tempScriptPath)) {
      fs.unlinkSync(tempScriptPath);
    }
  });
  
  it('should initialize watch mode correctly', async () => {
    const { childProcess, watcher } = await watch({
      packageName: 'com.example.test',
      scriptPath: tempScriptPath,
      deviceId: 'emulator-5554'
    });
    
    expect(childProcess).toBeDefined();
    expect(watcher).toBeDefined();
    
    // Clean up
    watcher.close();
  });
  
  it('should detect file changes and reload script', async () => {
    const { childProcess, watcher, onReload } = await watch({
      packageName: 'com.example.test',
      scriptPath: tempScriptPath,
      deviceId: 'emulator-5554'
    });
    
    // Set up reload spy
    const reloadSpy = jest.fn();
    onReload(reloadSpy);
    
    // Wait a bit for watcher to initialize
    await new Promise(resolve => setTimeout(resolve, 100));
    
    // Modify the script file
    fs.writeFileSync(tempScriptPath, 'console.log("Modified script");');
    
    // Wait for the file change to be detected
    await new Promise(resolve => setTimeout(resolve, 300));
    
    expect(reloadSpy).toHaveBeenCalled();
    
    // Clean up
    watcher.close();
  });
  
  it('should use --reload flag with Frida 16+', async () => {
    const { spawn } = require('child_process');
    const { execa } = require('child_process');
    
    // Mock Frida version to 16.0.0
    execa.command.mockResolvedValue({ stdout: 'Frida 16.0.0' });
    
    await watch({
      packageName: 'com.example.test',
      scriptPath: tempScriptPath,
      deviceId: 'emulator-5554'
    });
    
    expect(spawn).toHaveBeenCalledWith(
      'frida',
      expect.arrayContaining(['--reload']),
      expect.anything()
    );
  });
  
  it('should restart process for Frida <16', async () => {
    const { spawn } = require('child_process');
    const { execa } = require('child_process');
    
    // Mock Frida version to an older version
    execa.command.mockResolvedValue({ stdout: 'Frida 15.2.0' });
    
    const { childProcess, watcher, restart } = await watch({
      packageName: 'com.example.test',
      scriptPath: tempScriptPath,
      deviceId: 'emulator-5554'
    });
    
    // Spy on restart
    const restartSpy = jest.spyOn({ restart }, 'restart');
    
    // Simulate file change
    await restart();
    
    expect(childProcess.kill).toHaveBeenCalled();
    expect(spawn).toHaveBeenCalledTimes(2); // Initial spawn + restart
    
    // Clean up
    watcher.close();
  });
});

main(); 