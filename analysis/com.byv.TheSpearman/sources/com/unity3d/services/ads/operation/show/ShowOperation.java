package com.unity3d.services.ads.operation.show;

import com.json.i1;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AdOperation;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class ShowOperation extends AdOperation implements IShowOperation {
    private ShowOperationState showOperationState;

    public ShowOperation(ShowOperationState showOperationState, IWebViewBridgeInvocation iWebViewBridgeInvocation) {
        super(iWebViewBridgeInvocation, i1.u);
        this.showOperationState = showOperationState;
    }

    @Override // com.unity3d.services.ads.operation.show.IShowOperation
    public ShowOperationState getShowOperationState() {
        return this.showOperationState;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(String str, final UnityAds.UnityAdsShowError unityAdsShowError, final String str2) {
        ShowOperationState showOperationState = this.showOperationState;
        if (showOperationState == null || showOperationState.listener == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.1
            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                if (ShowOperation.this.showOperationState != null) {
                    ShowOperation.this.showOperationState.onUnityAdsShowFailure(unityAdsShowError, str2);
                }
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(final String str) {
        if (this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.2
            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                if (ShowOperation.this.showOperationState != null) {
                    ShowOperation.this.showOperationState.onUnityAdsShowStart(str);
                }
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(String str) {
        if (this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.3
            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                if (ShowOperation.this.showOperationState != null) {
                    ShowOperation.this.showOperationState.onUnityAdsShowClick();
                }
            }
        });
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(String str, final UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.operation.show.ShowOperation.4
            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                if (ShowOperation.this.showOperationState != null) {
                    ShowOperation.this.showOperationState.onUnityAdsShowComplete(unityAdsShowCompletionState);
                }
            }
        });
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public String getId() {
        return this.showOperationState.id;
    }
}
