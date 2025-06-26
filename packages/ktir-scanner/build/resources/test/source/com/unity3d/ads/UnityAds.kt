package com.unity3d.ads

/**
 * Mock UnityAds class for testing
 */
class UnityAds {
    enum class FinishState {
        COMPLETED,
        SKIPPED,
        ERROR
    }
    
    enum class UnityAdsError {
        NOT_INITIALIZED,
        INITIALIZE_FAILED,
        INVALID_ARGUMENT,
        VIDEO_PLAYER_ERROR,
        INIT_SANITY_CHECK_FAIL,
        AD_BLOCKER_DETECTED,
        FILE_IO_ERROR,
        DEVICE_ID_ERROR,
        SHOW_ERROR,
        INTERNAL_ERROR
    }
}
