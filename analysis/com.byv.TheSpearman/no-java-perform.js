'use strict';
console.log('[*] No Java.perform bypass script loaded');

// Check Java availability in a loop with timeout
let checkCount = 0;
const MAX_CHECKS = 20;

function checkJavaAndHook() {
  try {
    checkCount++;
    console.log(`[*] Checking Java availability (${checkCount}/${MAX_CHECKS})...`);
    
    if (Java.available) {
      console.log('[+] Java is available!');
      
      // Define our hook functions
      function hookUnityAds() {
        try {
          console.log('[*] Attempting to find UnityAds class...');
          // Instead of Java.use, try direct class lookup
          var UnityAdsClass = Java.vm.getEnv().findClass('com/unity3d/ads/UnityAds');
          if (UnityAdsClass) {
            console.log('[+] Found UnityAds class');
          }
        } catch (e) {
          console.log('[-] Error finding UnityAds class: ' + e);
        }
      }
      
      // Try to hook
      hookUnityAds();
      console.log('[*] Script completed execution');
    } else {
      if (checkCount < MAX_CHECKS) {
        setTimeout(checkJavaAndHook, 500);
      } else {
        console.log('[-] Java VM not available after multiple attempts');
      }
    }
  } catch (e) {
    console.log('[-] Error in hook attempt: ' + e);
  }
}

// Start checking
checkJavaAndHook(); 