#!/usr/bin/env node
import fs from 'fs';
import path from 'path';
import { watch } from '../dist/watch.js';

async function main() {
  try {
    const scriptPath = path.resolve('watch-test/test-script.js');
    
    // Create test directory and script if they don't exist
    if (!fs.existsSync('watch-test')) {
      fs.mkdirSync('watch-test', { recursive: true });
    }
    
    if (!fs.existsSync(scriptPath)) {
      fs.writeFileSync(scriptPath, 'console.log("Initial script");');
    }
    
    console.log('Starting watch mode integration test');
    
    // Mock the actual Frida execution for testing
    const mockFridaExecution = {
      packageName: 'com.example.test',
      scriptPath,
      mockMode: true // Don't actually spawn Frida
    };
    
    const { onReload } = await watch(mockFridaExecution);
    
    // Register reload callback to log reload events
    onReload(() => {
      console.log('RELOAD EVENT DETECTED');
      fs.writeFileSync('watch-test/reload-log.txt', 'RELOAD EVENT DETECTED at ' + new Date().toISOString());
    });
    
    console.log('Watch mode started, waiting for file changes...');
  } catch (error) {
    console.error('Error:', error);
    process.exit(1);
  }
}

main(); 