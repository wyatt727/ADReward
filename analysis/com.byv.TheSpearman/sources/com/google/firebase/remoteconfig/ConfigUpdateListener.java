package com.google.firebase.remoteconfig;

import javax.annotation.Nonnull;

/* loaded from: classes2.dex */
public interface ConfigUpdateListener {
    void onError(@Nonnull FirebaseRemoteConfigException firebaseRemoteConfigException);

    void onUpdate(ConfigUpdate configUpdate);
}
