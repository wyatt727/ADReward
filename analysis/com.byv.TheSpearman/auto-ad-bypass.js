// Auto-ad-bypass script for com.byv.TheSpearman
// Simplified version focusing on essential hooks

console.log('[*] Ad bypass script loaded');

// Define a minimal hook installation function
function installHooks() {
  try {
    Java.perform(function() {
      console.log('[+] Java bridge is working!');
      
      // Try to hook Unity ads
      try {
        var UnityAds = Java.use('com.unity3d.ads.UnityAds');
        console.log('[+] Found UnityAds class');
        
        // Hook isReady method
        try {
          UnityAds.isReady.overload('java.lang.String').implementation = function(placementId) {
            console.log('[+] UnityAds.isReady("' + placementId + '") called → returning true');
            return true;
          };
          console.log('[+] Hooked UnityAds.isReady successfully');
        } catch (e) {
          console.log('[-] Error hooking UnityAds.isReady: ' + e);
        }
        
        // Hook show method
        try {
          UnityAds.show.overload('android.app.Activity', 'java.lang.String').implementation = function(activity, placementId) {
            console.log('[+] UnityAds.show("' + placementId + '") called → faking reward');
            return;
          };
          console.log('[+] Hooked UnityAds.show successfully');
        } catch (e) {
          console.log('[-] Error hooking UnityAds.show: ' + e);
        }
      } catch (e) {
        console.log('[-] UnityAds class not found: ' + e);
      }
      
      // Try to hook Google Unity ads
      try {
        var GoogleUnityAds = Java.use('com.google.unity.ads.UnityRewardedAd');
        console.log('[+] Found Google Unity ads class');
      } catch (e) {
        console.log('[-] Google Unity ads class not found: ' + e);
      }
      
      // Try to hook AdMob
      try {
        var RewardedAd = Java.use('com.google.android.gms.ads.rewarded.RewardedAd');
        console.log('[+] Found AdMob RewardedAd class');
        
        // Hook any available method
        try {
          // Just try to hook a simple method first
          if (RewardedAd.isLoaded) {
            RewardedAd.isLoaded.implementation = function() {
              console.log('[+] RewardedAd.isLoaded() called → returning true');
              return true;
            };
            console.log('[+] Hooked RewardedAd.isLoaded successfully');
          }
        } catch (e) {
          console.log('[-] Error hooking RewardedAd methods: ' + e);
        }
      } catch (e) {
        console.log('[-] AdMob RewardedAd class not found: ' + e);
      }
      
      console.log('[+] Hook installation completed');
    });
  } catch (e) {
    console.log('[!] Error in installHooks: ' + e);
  }
}

// Wait for app to load
console.log('[*] Waiting 10 seconds before installing hooks...');
setTimeout(installHooks, 10000);

// Set up a timer to retry periodically
console.log('[*] Setting up periodic retry every 10 seconds');
setInterval(function() {
  console.log('[*] Retrying hook installation...');
  installHooks();
}, 10000);

// Try to hook Activity.onResume to reinstall hooks when app comes to foreground
setTimeout(function() {
  console.log('[*] Setting up Activity.onResume hook...');
  try {
    Java.perform(function() {
      try {
        var Activity = Java.use('android.app.Activity');
        console.log('[+] Found Activity class');
        
        var originalOnResume = Activity.onResume.overload();
        Activity.onResume.implementation = function() {
          console.log('[*] Activity resumed');
          originalOnResume.call(this);
          
          // Reinstall hooks when app comes to foreground
          setTimeout(installHooks, 1000);
        };
        console.log('[+] Hooked Activity.onResume successfully');
      } catch (e) {
        console.log('[-] Error hooking Activity.onResume: ' + e);
      }
    });
  } catch (e) {
    console.log('[!] Error setting up Activity.onResume hook: ' + e);
  }
}, 15000);

// Minimal ad bypass script for com.byv.TheSpearman
console.log('[*] Minimal ad bypass script loaded');

// Wait for app to load
setTimeout(function() {
  console.log('[*] Starting minimal hook installation...');
  
  try {
    // Use a try/catch for each step to identify where the error is occurring
    try {
      console.log('[*] Step 1: Checking if Java is available');
      if (!Java.available) {
        console.log('[-] Java is not available');
        return;
      }
      console.log('[+] Java is available');
    } catch (e) {
      console.log('[!] Error in Step 1: ' + e);
      return;
    }
    
    try {
      console.log('[*] Step 2: Calling Java.perform');
      Java.perform(function() {
        console.log('[+] Inside Java.perform callback');
        
        try {
          console.log('[*] Step 3: Finding UnityAds class');
          var UnityAds = Java.use('com.unity3d.ads.UnityAds');
          console.log('[+] Found UnityAds class');
          
          try {
            console.log('[*] Step 4: Checking if isReady method exists');
            if (UnityAds.isReady) {
              console.log('[+] isReady method exists');
              
              try {
                console.log('[*] Step 5: Hooking isReady method');
                UnityAds.isReady.overload('java.lang.String').implementation = function(placementId) {
                  console.log('[+] UnityAds.isReady("' + placementId + '") called → returning true');
                  return true;
                };
                console.log('[+] Successfully hooked isReady method');
              } catch (e) {
                console.log('[!] Error in Step 5: ' + e);
              }
            } else {
              console.log('[-] isReady method does not exist');
            }
          } catch (e) {
            console.log('[!] Error in Step 4: ' + e);
          }
        } catch (e) {
          console.log('[!] Error in Step 3: ' + e);
          
          // Try a different class
          try {
            console.log('[*] Step 3b: Finding Activity class');
            var Activity = Java.use('android.app.Activity');
            console.log('[+] Found Activity class');
          } catch (e) {
            console.log('[!] Error in Step 3b: ' + e);
          }
        }
      });
      console.log('[+] Java.perform completed');
    } catch (e) {
      console.log('[!] Error in Step 2: ' + e);
    }
  } catch (e) {
    console.log('[!] Error in outer try block: ' + e);
  }
}, 10000);

// Set up a timer to retry
setTimeout(function() {
  console.log('[*] Retrying after 20 seconds...');
  
  try {
    Java.perform(function() {
      console.log('[+] Second attempt Java.perform working');
      
      // Try to hook a simple Android class
      try {
        var Context = Java.use('android.content.Context');
        console.log('[+] Found Context class');
      } catch (e) {
        console.log('[-] Error finding Context class: ' + e);
      }
    });
  } catch (e) {
    console.log('[!] Error in second attempt: ' + e);
  }
}, 20000); 