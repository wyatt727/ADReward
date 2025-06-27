package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z0 extends ak {
    @Override // com.applovin.impl.ak
    protected we a(ze zeVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return a(new xg(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static we a(xg xgVar) {
        xgVar.d(12);
        int iD = (xgVar.d() + xgVar.a(12)) - 4;
        xgVar.d(44);
        xgVar.e(xgVar.a(12));
        xgVar.d(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strA = null;
            if (xgVar.d() >= iD) {
                break;
            }
            xgVar.d(48);
            int iA = xgVar.a(8);
            xgVar.d(4);
            int iD2 = xgVar.d() + xgVar.a(12);
            String strA2 = null;
            while (xgVar.d() < iD2) {
                int iA2 = xgVar.a(8);
                int iA3 = xgVar.a(8);
                int iD3 = xgVar.d() + iA3;
                if (iA2 == 2) {
                    int iA4 = xgVar.a(16);
                    xgVar.d(8);
                    if (iA4 == 3) {
                        while (xgVar.d() < iD3) {
                            strA = xgVar.a(xgVar.a(8), Charsets.US_ASCII);
                            int iA5 = xgVar.a(8);
                            for (int i = 0; i < iA5; i++) {
                                xgVar.e(xgVar.a(8));
                            }
                        }
                    }
                } else if (iA2 == 21) {
                    strA2 = xgVar.a(iA3, Charsets.US_ASCII);
                }
                xgVar.c(iD3 * 8);
            }
            xgVar.c(iD2 * 8);
            if (strA != null && strA2 != null) {
                arrayList.add(new y0(iA, strA + strA2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we(arrayList);
    }
}
