import { PipelineHooks } from '../src/hooks.js';
import { Plugin, PluginDescriptor } from '../src/pluginLoader.js';

describe('Pipeline hooks system', () => {
  let hooks;
  
  beforeEach(() => {
    hooks = new PipelineHooks();
  });
  
  it('should register plugins successfully', async () => {
    // Create a mock plugin
    const mockPlugin = {
      register: jest.fn().mockReturnValue({
        name: 'test-plugin',
        version: '1.0.0',
        description: 'Test plugin for hooks'
      })
    };
    
    const descriptor = await hooks.registerPlugin(mockPlugin);
    
    expect(mockPlugin.register).toHaveBeenCalledWith(hooks);
    expect(descriptor).toEqual({
      name: 'test-plugin',
      version: '1.0.0',
      description: 'Test plugin for hooks'
    });
  });
  
  it('should execute beforeScan hooks', async () => {
    const callback = jest.fn();
    hooks.beforeScan.tapPromise('TestPlugin', callback);
    
    const context = { dexDir: '/test/path', families: ['admob'] };
    await hooks.beforeScan.promise(context);
    
    expect(callback).toHaveBeenCalledWith(context);
  });
  
  it('should execute afterScan hooks', async () => {
    const callback = jest.fn();
    hooks.afterScan.tapPromise('TestPlugin', callback);
    
    const context = { dexDir: '/test/path', families: ['admob'] };
    const components = { admob: [{ className: 'TestClass', methodName: 'testMethod' }] };
    await hooks.afterScan.promise(context, components);
    
    expect(callback).toHaveBeenCalledWith(context, components);
  });
  
  it('should execute beforeFridaGenerate hooks', async () => {
    const callback = jest.fn();
    hooks.beforeFridaGenerate.tapPromise('TestPlugin', callback);
    
    const context = { packageName: 'com.example.app' };
    await hooks.beforeFridaGenerate.promise(context);
    
    expect(callback).toHaveBeenCalledWith(context);
  });
  
  it('should execute afterFridaGenerate hooks', async () => {
    const callback = jest.fn();
    hooks.afterFridaGenerate.tapPromise('TestPlugin', callback);
    
    const context = { packageName: 'com.example.app' };
    const paths = { script: '/path/to/script.js', deploy: '/path/to/deploy.sh' };
    await hooks.afterFridaGenerate.promise(context, paths);
    
    expect(callback).toHaveBeenCalledWith(context, paths);
  });
  
  it('should allow plugins to register CLI commands', () => {
    const program = {
      command: jest.fn().mockReturnThis(),
      description: jest.fn().mockReturnThis(),
      action: jest.fn().mockReturnThis()
    };
    
    hooks.registerCommands.tap('TestPlugin', (p) => {
      p.command('test')
        .description('Test command')
        .action(() => {});
    });
    
    hooks.registerCommands.call(program);
    
    expect(program.command).toHaveBeenCalledWith('test');
    expect(program.description).toHaveBeenCalledWith('Test command');
  });
  
  it('should execute hooks in order for AsyncSeriesHooks', async () => {
    const results = [];
    
    hooks.beforeScan.tapPromise('Plugin1', async (ctx) => {
      await new Promise(resolve => setTimeout(resolve, 5));
      results.push('Plugin1');
      return ctx;
    });
    
    hooks.beforeScan.tapPromise('Plugin2', async (ctx) => {
      results.push('Plugin2');
      return ctx;
    });
    
    await hooks.beforeScan.promise({ test: true });
    
    expect(results).toEqual(['Plugin1', 'Plugin2']);
  });
  
  it('should execute hooks in parallel for AsyncParallelHooks', async () => {
    const onAdDetectedStart = [];
    const onAdDetectedEnd = [];
    
    hooks.onAdDetected.tapPromise('Plugin1', async (adInfo) => {
      onAdDetectedStart.push('Plugin1');
      await new Promise(resolve => setTimeout(resolve, 20));
      onAdDetectedEnd.push('Plugin1');
    });
    
    hooks.onAdDetected.tapPromise('Plugin2', async (adInfo) => {
      onAdDetectedStart.push('Plugin2');
      await new Promise(resolve => setTimeout(resolve, 5));
      onAdDetectedEnd.push('Plugin2');
    });
    
    await hooks.onAdDetected.promise({ family: 'test', className: 'Test', methodName: 'test' });
    
    expect(onAdDetectedStart).toEqual(['Plugin1', 'Plugin2']);
    expect(onAdDetectedEnd).toEqual(['Plugin2', 'Plugin1']);
  });
}); 