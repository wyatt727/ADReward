package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: StringSetEncoder.java */
/* loaded from: classes4.dex */
final class am implements FastKV.a<Set<String>> {

    /* renamed from: a, reason: collision with root package name */
    static final am f2979a = new am();

    @Override // com.mbridge.msdk.foundation.tools.FastKV.a
    public final String a() {
        return "StringSet";
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.a
    public final /* synthetic */ byte[] a(Set<String> set) {
        Set<String> set2 = set;
        if (set2.isEmpty()) {
            return new byte[0];
        }
        int size = set2.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i = 0;
        int i2 = 0;
        for (String str : set2) {
            if (str == null) {
                i += 5;
                iArr[i2] = -1;
            } else {
                int iA = p.a(str);
                strArr[i2] = str;
                iArr[i2] = iA;
                i += ((iA >> 7) == 0 ? 1 : (iA >> 14) == 0 ? 2 : (iA >> 21) == 0 ? 3 : (iA >> 28) == 0 ? 4 : 5) + iA;
            }
            i2++;
        }
        p pVar = new p(i);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            int i5 = pVar.b;
            int i6 = i4;
            while ((i6 & (-128)) != 0) {
                pVar.f2994a[i5] = (byte) ((i6 & 127) | 128);
                i6 >>>= 7;
                i5++;
            }
            pVar.f2994a[i5] = (byte) i6;
            pVar.b = i5 + 1;
            if (i4 >= 0) {
                pVar.b(strArr[i3]);
            }
        }
        return pVar.f2994a;
    }

    private am() {
    }

    @Override // com.mbridge.msdk.foundation.tools.FastKV.a
    public final /* synthetic */ Set<String> a(byte[] bArr, int i, int i2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            p pVar = new p(bArr, i);
            int i3 = i + i2;
            while (pVar.b < i3) {
                byte[] bArr2 = pVar.f2994a;
                int i4 = pVar.b;
                pVar.b = i4 + 1;
                int i5 = bArr2[i4];
                if ((i5 >> 7) != 0) {
                    byte[] bArr3 = pVar.f2994a;
                    int i6 = pVar.b;
                    pVar.b = i6 + 1;
                    i5 = (i5 & 127) | (bArr3[i6] << 7);
                    if ((i5 >> 14) != 0) {
                        byte[] bArr4 = pVar.f2994a;
                        int i7 = pVar.b;
                        pVar.b = i7 + 1;
                        i5 = (i5 & 16383) | (bArr4[i7] << 14);
                        if ((i5 >> 21) != 0) {
                            byte[] bArr5 = pVar.f2994a;
                            int i8 = pVar.b;
                            pVar.b = i8 + 1;
                            i5 = (i5 & 2097151) | (bArr5[i8] << 21);
                            if ((i5 >> 28) != 0) {
                                byte[] bArr6 = pVar.f2994a;
                                int i9 = pVar.b;
                                pVar.b = i9 + 1;
                                i5 = (i5 & 268435455) | (bArr6[i9] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(pVar.a(i5));
            }
            if (pVar.b != i3) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }
}
