package com.applovin.impl;

import java.io.EOFException;

/* loaded from: classes.dex */
public abstract class l8 {
    public static void a(boolean z, String str) throws ah {
        if (!z) {
            throw ah.a(str, null);
        }
    }

    public static boolean b(j8 j8Var, byte[] bArr, int i, int i2) {
        try {
            j8Var.d(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean a(j8 j8Var, byte[] bArr, int i, int i2, boolean z) throws EOFException {
        try {
            return j8Var.b(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int a(j8 j8Var, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int iB = j8Var.b(bArr, i + i3, i2 - i3);
            if (iB == -1) {
                break;
            }
            i3 += iB;
        }
        return i3;
    }

    public static boolean a(j8 j8Var, int i) {
        try {
            j8Var.a(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
