'use strict';

console.log('[+] Minimal hook script attached');

// Try to hook a simple native function as a test
var open = Module.getExportByName(null, 'open');
console.log('[*] Found open at: ' + open);

try {
    Interceptor.attach(open, {
        onEnter: function(args) {
            var path = args[0].readUtf8String();
            console.log('[*] open: ' + path);
        }
    });
    console.log('[+] Successfully hooked open()');
} catch(e) {
    console.log('[-] Failed to hook open(): ' + e);
}

console.log('[+] Minimal hook script completed'); 