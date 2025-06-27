'use strict';
console.log('[+] Ad module tracing script attached');

// List of keywords to look for in module names
const adKeywords = ['unity', 'ad', 'gms', 'firebase', 'monetize', 'reward'];

// Track all currently loaded modules
console.log('[*] Initially loaded modules that might be ad-related:');
const initialModules = new Set();
Process.enumerateModules().forEach(function(module) {
    const lowerName = module.name.toLowerCase();
    if (adKeywords.some(keyword => lowerName.includes(keyword))) {
        console.log('    - ' + module.name + ' (base: ' + module.base + ', size: ' + module.size + ')');
        initialModules.add(module.name);
    }
});

// Set up a hook for when new modules are loaded
const dlopen = Module.findExportByName(null, "dlopen");
if (dlopen !== null) {
    Interceptor.attach(dlopen, {
        onEnter: function(args) {
            this.path = args[0].readUtf8String();
        },
        onLeave: function(retval) {
            if (this.path !== null) {
                const lowerPath = this.path.toLowerCase();
                if (adKeywords.some(keyword => lowerPath.includes(keyword))) {
                    console.log('[+] New ad-related library loaded: ' + this.path);
                }
            }
        }
    });
    console.log('[*] Attached to dlopen, monitoring for new ad-related libraries...');
} else {
    console.log('[-] Could not find dlopen');
}

// Hook Android API calls that might be related to ads
const loadClass = Module.findExportByName('libdvm.so', '_Z18dvmDefineClassNativePKcP7_jclassP7_jobject');
if (loadClass !== null) {
    Interceptor.attach(loadClass, {
        onEnter: function(args) {
            const className = args[0].readUtf8String();
            const lowerClassName = className.toLowerCase();
            if (adKeywords.some(keyword => lowerClassName.includes(keyword))) {
                console.log('[+] Ad-related class being loaded: ' + className);
            }
        }
    });
    console.log('[*] Attached to dvmDefineClassNative, monitoring for ad-related classes...');
} else {
    console.log('[-] Could not find dvmDefineClassNative');
}

console.log('[*] Ad module tracing setup complete'); 