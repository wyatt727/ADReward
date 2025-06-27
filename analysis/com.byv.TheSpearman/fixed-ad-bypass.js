'use strict';
console.log('[*] Ad bypass script loaded');

// Try to detect when the Java VM is ready - with timeout
let javaChecks = 0;
const MAX_JAVA_CHECKS = 20; // About 10 seconds maximum wait time

// Safe way to attempt Java hooking - won't crash if Java isn't available
function attemptJavaHooks() {
    try {
        if (!Java.available) {
            javaChecks++;
            if (javaChecks < MAX_JAVA_CHECKS) {
                console.log('[*] Java not yet available, will retry in 500ms... (' + javaChecks + '/' + MAX_JAVA_CHECKS + ')');
                setTimeout(attemptJavaHooks, 500);
            } else {
                console.log('[-] Java VM did not become available within timeout period');
                console.log('[*] Continuing with native-only hooks');
            }
            return;
        }
        
        console.log('[+] Java VM is available - installing Java hooks');
        
        Java.perform(function() {
            try {
                // Try to hook Unity ad classes
                try {
                    var UnityAds = Java.use('com.unity3d.ads.UnityAds');
                    if (UnityAds) {
                        console.log('[+] Found UnityAds class, hooking methods');
                        
                        // Hook isReady to always return true
                        if (UnityAds.isReady) {
                            UnityAds.isReady.overload('java.lang.String').implementation = function() {
                                console.log('[+] UnityAds.isReady called - returning true');
                                return true;
                            };
                        }
                        
                        // Hook show to do nothing
                        if (UnityAds.show) {
                            UnityAds.show.overload('android.app.Activity', 'java.lang.String').implementation = function() {
                                console.log('[+] UnityAds.show called - blocked');
                                return;
                            };
                        }
                    }
                } catch (e) {
                    console.log('[-] UnityAds not found: ' + e);
                }
                
                // Try to hook Google rewarded ads
                try {
                    var RewardedAd = Java.use('com.google.android.gms.ads.rewarded.RewardedAd');
                    if (RewardedAd) {
                        console.log('[+] Found RewardedAd class, hooking methods');
                        
                        // Hook isLoaded to always return true
                        if (RewardedAd.isLoaded) {
                            RewardedAd.isLoaded.implementation = function() {
                                console.log('[+] RewardedAd.isLoaded called - returning true');
                                return true;
                            };
                        }
                    }
                } catch (e) {
                    console.log('[-] RewardedAd not found: ' + e);
                }
                
                console.log('[+] Java hooks installed successfully');
            } catch (e) {
                console.log('[-] Error setting up Java hooks: ' + e);
            }
        });
    } catch (e) {
        console.log('[-] Error in Java hook attempt: ' + e);
    }
}

// Set up native hooks
function setupNativeHooks() {
    try {
        // Listen for Unity ad-related library loads
        Interceptor.attach(Module.findExportByName(null, 'dlopen'), {
            onEnter: function(args) {
                this.path = args[0].readUtf8String();
            },
            onLeave: function(retval) {
                if (this.path !== null) {
                    const lowerPath = this.path.toLowerCase();
                    if (lowerPath.includes('unity') || lowerPath.includes('ads')) {
                        console.log('[+] Potentially interesting library loaded: ' + this.path);
                    }
                }
            }
        });
        
        console.log('[+] Native hooks installed successfully');
    } catch (e) {
        console.log('[-] Error setting up native hooks: ' + e);
    }
}

// Start both types of hooks
console.log('[*] Starting ad bypass');
setupNativeHooks();
attemptJavaHooks();

console.log('[+] Ad bypass script initialized'); 