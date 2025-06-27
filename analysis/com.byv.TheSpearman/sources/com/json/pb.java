package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;

/* loaded from: classes4.dex */
public enum pb {
    PER_DAY("d"),
    PER_HOUR(CmcdHeadersFactory.STREAMING_FORMAT_HLS);


    /* renamed from: a, reason: collision with root package name */
    public String f2063a;

    pb(String str) {
        this.f2063a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f2063a;
    }
}
