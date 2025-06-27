package com.applovin.impl;

import com.applovin.impl.ro;

/* loaded from: classes.dex */
public final class no {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f727a;
    public final String b;
    public final ro.a c;
    public final int d;
    public final byte[] e;

    public no(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        a1.a((bArr2 == null) ^ (i == 0));
        this.f727a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        this.c = new ro.a(a(str), bArr, i2, i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            default:
                kc.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
