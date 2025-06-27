'use strict';

console.log('[+] Native hook script attached');

// Find the open function
try {
    var openPtr = Module.findExportByName(null, 'open');
    console.log('[+] Found open function at: ' + openPtr);
    
    // Set up a hook on the open function
    Interceptor.attach(openPtr, {
        onEnter: function(args) {
            var path = args[0].readUtf8String();
            console.log('[*] open: ' + path);
        }
    });
    console.log('[+] Successfully hooked open function');
} catch(e) {
    console.log('[-] Failed to hook open: ' + e);
}

console.log('[+] Native hook script completed'); 