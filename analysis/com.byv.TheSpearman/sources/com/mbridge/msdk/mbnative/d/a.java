package com.mbridge.msdk.mbnative.d;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: AdListenerProxy.java */
/* loaded from: classes4.dex */
public class a implements NativeListener.NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3134a = "a";
    private NativeListener.NativeAdListener b;
    private boolean c = false;
    private String d;
    private Context e;
    private boolean f;

    public final void a(boolean z) {
        this.f = z;
    }

    public final void a(String str) {
        this.d = str;
    }

    public a() {
    }

    public a(NativeListener.NativeAdListener nativeAdListener) {
        this.b = nativeAdListener;
    }

    public final boolean a() {
        return this.c;
    }

    public final void b() {
        this.c = true;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.c = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.b != null) {
                if (copyOnWriteArrayList.size() > 0) {
                    this.b.onAdLoaded(copyOnWriteArrayList, i);
                } else {
                    this.b.onAdLoaded(list, i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(CampaignEx campaignEx, String str) {
        this.c = false;
        NativeListener.NativeAdListener nativeAdListener = this.b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.e == null) {
                this.e = c.m().c();
            }
            if (TextUtils.isEmpty(this.d)) {
                return;
            }
            com.mbridge.msdk.mbnative.e.a.a(this.e, str, this.d, this.f, campaignEx);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        this.c = false;
        NativeListener.NativeAdListener nativeAdListener = this.b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.e == null) {
                this.e = c.m().c();
            }
            if (TextUtils.isEmpty(this.d)) {
                return;
            }
            com.mbridge.msdk.mbnative.e.a.a(this.e, str, this.d, this.f, (CampaignEx) null);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i) {
        NativeListener.NativeAdListener nativeAdListener = this.b;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i);
        }
    }
}
