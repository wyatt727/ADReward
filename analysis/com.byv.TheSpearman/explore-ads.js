// Frida script to explore ad-related classes in TheSpearman

'use strict';
console.log('[*] Ad exploration script loaded, waiting for Java VM...');

setTimeout(function() {
  Java.perform(function() {
    console.log('[+] Java VM initialized');
    
    // List all loaded classes that might be related to ads
    console.log('[*] Searching for ad-related classes...');
    
    var adKeywords = ['ad', 'ads', 'advert', 'reward', 'unity', 'admob', 'monetize'];
    var classes = Java.enumerateLoadedClasses();
    
    adKeywords.forEach(function(keyword) {
      console.log('[*] Classes containing "' + keyword + '":');
      classes.forEach(function(className) {
        if (className.toLowerCase().indexOf(keyword.toLowerCase()) !== -1) {
          console.log('    - ' + className);
        }
      });
    });
    
    // Try to find specific ad-related functionality
    try {
      console.log('[*] Checking if UnityAds is present...');
      var UnityAds = Java.use('com.unity3d.ads.UnityAds');
      console.log('[+] UnityAds found! Methods:');
      Object.getOwnPropertyNames(UnityAds.class.__proto__).forEach(function(method) {
        if (method !== 'constructor' && method !== '$classWrapper') {
          console.log('    - ' + method);
        }
      });
    } catch (e) {
      console.log('[-] UnityAds not found or not loaded yet');
    }
    
    try {
      console.log('[*] Checking if Google RewardedAd is present...');
      var RewardedAd = Java.use('com.google.android.gms.ads.rewarded.RewardedAd');
      console.log('[+] Google RewardedAd found! Methods:');
      Object.getOwnPropertyNames(RewardedAd.class.__proto__).forEach(function(method) {
        if (method !== 'constructor' && method !== '$classWrapper') {
          console.log('    - ' + method);
        }
      });
    } catch (e) {
      console.log('[-] Google RewardedAd not found or not loaded yet');
    }
    
    console.log('[*] Ad exploration complete');
  });
}, 1000);  // Wait 1 second for Java to initialize 