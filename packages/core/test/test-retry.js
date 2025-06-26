import { retry } from '../src/utils/retry.js';

describe('Retry helper', () => {
  it('should resolve immediately when function succeeds', async () => {
    const fn = jest.fn().mockResolvedValue('success');
    const result = await retry(fn, 3, 10);
    
    expect(result).toBe('success');
    expect(fn).toHaveBeenCalledTimes(1);
  });
  
  it('should retry until max attempts when function fails', async () => {
    const error = new Error('test error');
    const fn = jest.fn().mockRejectedValue(error);
    
    await expect(retry(fn, 3, 10)).rejects.toThrow(error);
    expect(fn).toHaveBeenCalledTimes(3);
  });
  
  it('should retry and then succeed', async () => {
    const fn = jest.fn()
      .mockRejectedValueOnce(new Error('first fail'))
      .mockRejectedValueOnce(new Error('second fail'))
      .mockResolvedValue('success');
    
    const result = await retry(fn, 3, 10);
    
    expect(result).toBe('success');
    expect(fn).toHaveBeenCalledTimes(3);
  });
  
  it('should apply exponential backoff', async () => {
    jest.useFakeTimers();
    
    const fn = jest.fn()
      .mockRejectedValueOnce(new Error('first fail'))
      .mockRejectedValueOnce(new Error('second fail'))
      .mockResolvedValue('success');
    
    const promise = retry(fn, 3, 100);
    
    expect(fn).toHaveBeenCalledTimes(1);
    
    // First retry after 100ms
    jest.advanceTimersByTime(100);
    expect(fn).toHaveBeenCalledTimes(2);
    
    // Second retry after 200ms (100 * 2^1)
    jest.advanceTimersByTime(200);
    expect(fn).toHaveBeenCalledTimes(3);
    
    jest.useRealTimers();
    await promise;
  });
  
  it('should use network retry pattern', async () => {
    const fn = jest.fn().mockResolvedValue('success');
    await retry.network(fn);
    
    expect(fn).toHaveBeenCalledTimes(1);
  });
  
  it('should use adb retry pattern', async () => {
    const fn = jest.fn().mockResolvedValue('success');
    await retry.adb(fn);
    
    expect(fn).toHaveBeenCalledTimes(1);
  });
  
  it('should use java retry pattern', async () => {
    const fn = jest.fn().mockResolvedValue('success');
    await retry.java(fn);
    
    expect(fn).toHaveBeenCalledTimes(1);
  });
}); 