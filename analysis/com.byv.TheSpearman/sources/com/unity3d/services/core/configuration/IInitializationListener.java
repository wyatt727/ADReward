package com.unity3d.services.core.configuration;

/* loaded from: classes4.dex */
public interface IInitializationListener {
    void onSdkInitializationFailed(String str, ErrorState errorState, int i);

    void onSdkInitialized();
}
