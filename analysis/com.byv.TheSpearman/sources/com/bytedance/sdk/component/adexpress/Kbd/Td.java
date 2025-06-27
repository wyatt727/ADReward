package com.bytedance.sdk.component.adexpress.Kbd;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* compiled from: TTAndroidObjectProxy.java */
/* loaded from: classes2.dex */
public class Td {
    private WeakReference<mZx> EYQ;

    public Td(mZx mzx) {
        this.EYQ = new WeakReference<>(mzx);
    }

    public void EYQ(mZx mzx) {
        this.EYQ = new WeakReference<>(mzx);
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<mZx> weakReference = this.EYQ;
        return (weakReference == null || weakReference.get() == null) ? "" : this.EYQ.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<mZx> weakReference = this.EYQ;
        return (weakReference == null || weakReference.get() == null) ? "" : this.EYQ.get().appInfo();
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<mZx> weakReference = this.EYQ;
        return (weakReference == null || weakReference.get() == null) ? "" : this.EYQ.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<mZx> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<mZx> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<mZx> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().muteVideo(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<mZx> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<mZx> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<mZx> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().clickEvent(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<mZx> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().skipVideo();
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<mZx> weakReference = this.EYQ;
        return (weakReference == null || weakReference.get() == null) ? "" : this.EYQ.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<mZx> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().initRenderFinish();
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<mZx> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().EYQ(str);
    }

    @JavascriptInterface
    public void chooseAdResult(String str) {
        WeakReference<mZx> weakReference = this.EYQ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.EYQ.get().chooseAdResult(str);
    }
}
