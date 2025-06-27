package com.mbridge.msdk.foundation.same.g;

import android.webkit.DownloadListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: MBDownloadListener.java */
/* loaded from: classes4.dex */
public final class a implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    private String f2859a;
    private CampaignEx b;

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
    }

    public a(CampaignEx campaignEx) {
        this.b = campaignEx;
    }

    public a() {
    }

    public final void a(String str) {
        this.f2859a = str;
    }
}
