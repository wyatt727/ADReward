package com.unity3d.scar.adapter.common;

import com.unity3d.scar.adapter.common.IUnityAdsError;

/* loaded from: classes4.dex */
public interface IAdsErrorHandler<T extends IUnityAdsError> {
    void handleError(T t);
}
