'use strict';
console.log('[+] Basic script attached');

// Just try to list some basic process information
console.log('[*] Process name: ' + Process.getCurrentThreadId());
console.log('[*] Architecture: ' + Process.arch);
console.log('[*] Platform: ' + Process.platform);

// Try to enumerate modules
console.log('[*] Enumerating modules:');
Process.enumerateModules()
  .slice(0, 10)  // Just show first 10 to avoid overwhelming output
  .forEach(function(module) {
    console.log('    - ' + module.name);
  });

console.log('[*] Script execution finished'); 