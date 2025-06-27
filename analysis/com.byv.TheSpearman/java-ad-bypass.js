'use strict';

console.log('[+] Java ad bypass script attached');

// Wait for Java VM to be available
setTimeout(function() {
    if (Java.available) {
        console.log('[+] Java runtime available, setting up ad bypass');
        
        Java.perform(function() {
            console.log('[+] Inside Java.perform');
            
            // Function to hook classes safely
            function safeHook(className, hookFn) {
                try {
                    var classObj = Java.use(className);
                    hookFn(classObj);
                    console.log('[+] Successfully hooked: ' + className);
                } catch (e) {
                    console.log('[-] Failed to hook ' + className + ': ' + e);
                }
            }
            
            // Hook Unity Ads
            safeHook('com.unity3d.ads.UnityAds', function(UnityAds) {
                // Hook isReady method to always return true
                if (UnityAds.isReady) {
                    UnityAds.isReady.overload('java.lang.String').implementation = function(placementId) {
                        console.log('[+] UnityAds.isReady called with placement: ' + placementId);
                        console.log('[+] Returning true to simulate ad ready');
                        return true;
                    };
                }
                
                // Hook show method to do nothing
                if (UnityAds.show) {
                    UnityAds.show.overload('android.app.Activity', 'java.lang.String').implementation = function(activity, placementId) {
                        console.log('[+] UnityAds.show called - blocking ad display');
                        console.log('[+] Placment ID: ' + placementId);
                        // Return without showing the ad
                        return;
                    };
                }
            });
            
            // Hook Google AdMob RewardedAd
            safeHook('com.google.android.gms.ads.rewarded.RewardedAd', function(RewardedAd) {
                // Hook isLoaded to return true
                if (RewardedAd.isLoaded) {
                    RewardedAd.isLoaded.implementation = function() {
                        console.log('[+] RewardedAd.isLoaded called - returning true');
                        return true;
                    };
                }
            });
            
            console.log('[+] Ad bypass hooks installed');
        });
    } else {
        console.log('[-] Java runtime not available');
    }
}, 1000);  // Wait 1 second for Java VM to initialize

console.log('[+] Java ad bypass script execution completed'); 