'use strict';
console.log('[*] Simplified ad bypass script loaded');

// Try after a sufficient delay
setTimeout(function() {
  try {
    if (Java.available) {
      console.log('[+] Java is available, setting up hooks');
      
      Java.perform(function() {
        try {
          // Unity Ads hooks
          var UnityAds = Java.use('com.unity3d.ads.UnityAds');
          if (UnityAds) {
            console.log('[+] Found UnityAds class');
            
            if (UnityAds.isReady) {
              // Make isReady always return true
              UnityAds.isReady.overload('java.lang.String').implementation = function() { 
                console.log('[+] UnityAds.isReady called - returning true');
                return true; 
              };
              console.log('[+] Hooked UnityAds.isReady');
            }
            
            if (UnityAds.show) {
              // Make show do nothing
              UnityAds.show.overload('android.app.Activity','java.lang.String').implementation = function() {
                console.log('[+] UnityAds.show called - blocked');
              };
              console.log('[+] Hooked UnityAds.show');
            }
          }
        } catch (e) {
          console.log('[-] Failed to hook UnityAds: ' + e);
        }
        
        try {
          // Google AdMob hooks
          var RewardedAd = Java.use('com.google.android.gms.ads.rewarded.RewardedAd');
          if (RewardedAd) {
            console.log('[+] Found RewardedAd class');
            
            if (RewardedAd.isLoaded) {
              RewardedAd.isLoaded.implementation = function() {
                console.log('[+] RewardedAd.isLoaded called - returning true');
                return true;
              };
              console.log('[+] Hooked RewardedAd.isLoaded');
            }
          }
        } catch (e) {
          console.log('[-] Failed to hook RewardedAd: ' + e);
        }
      });
    } else {
      console.log('[-] Java not available');
    }
  } catch (e) {
    console.log('[-] Error in ad bypass: ' + e);
  }
}, 3000);  // Wait 3 seconds for Java VM to fully initialize

console.log('[*] Waiting for Java VM to initialize...'); 