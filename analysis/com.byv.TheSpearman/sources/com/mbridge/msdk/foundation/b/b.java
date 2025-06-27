package com.mbridge.msdk.foundation.b;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.x;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: CandidateEntity.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f2753a;
    private double b;
    private String c;
    private String d;
    private int e;
    private long f;
    private int g;
    private long h;
    private String i;
    private long j;

    public final long a() {
        return this.j;
    }

    public final void a(long j) {
        this.j = j;
    }

    public final CopyOnWriteArrayList<CampaignEx> b() {
        return this.f2753a;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f2753a = copyOnWriteArrayList;
    }

    public final double c() {
        return this.b;
    }

    public final void a(String str) throws NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = x.a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            double d = Double.parseDouble(strA);
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            this.b = d;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String d() {
        return this.c;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final String e() {
        return this.d;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final int f() {
        return this.e;
    }

    public final void a(int i) {
        this.e = i;
    }

    public final int g() {
        return this.g;
    }

    public final void b(int i) {
        this.g = i;
    }

    public final long h() {
        return this.h;
    }

    public final void b(long j) {
        this.h = j;
    }

    public final void d(String str) {
        this.i = str;
    }

    public final void c(long j) {
        this.f = j;
    }
}
