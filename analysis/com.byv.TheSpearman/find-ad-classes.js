'use strict';
console.log('[*] Ad class finder script loaded');

// Define ad-related keywords to search for
const adKeywords = [
  'ad', 'ads', 'advert', 'unity', 'gms', 'admob', 'reward',
  'banner', 'interstitial', 'monetize', 'mediation'
];

function findAdClasses() {
  try {
    if (Java.available) {
      console.log('[+] Java is available, scanning for ad-related classes...');
      
      // Get all loaded classes using Java.enumerateLoadedClassesSync()
      console.log('[*] Enumerating loaded classes...');
      
      // This works differently in Frida 16.x
      Java.enumerateLoadedClasses({
        onMatch: function(className) {
          const lowerClassName = className.toLowerCase();
          // Check if class name contains any ad-related keyword
          for (let i = 0; i < adKeywords.length; i++) {
            if (lowerClassName.indexOf(adKeywords[i]) !== -1) {
              console.log('[+] Potentially ad-related class: ' + className);
              break;
            }
          }
        },
        onComplete: function() {
          console.log('[*] Enumeration complete');
        }
      });
    } else {
      console.log('[-] Java is not available');
    }
  } catch (e) {
    console.log('[-] Error in findAdClasses: ' + e);
  }
}

findAdClasses();
console.log('[*] Ad class finder execution completed'); 