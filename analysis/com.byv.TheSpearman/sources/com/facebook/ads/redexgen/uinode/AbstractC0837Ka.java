package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Ka, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0837Ka {
    public static String[] A00 = {"XnOcKNlJJ8CDQQR", "VGhv6FkZrITxQRu9gbMUemqcetkh7B5f", "vVz2BTpV32jHfI", "d8hV", "Sy49NQqrKXgvTEWwSBtXX6HecYQBIBGU", "Db46iG0BOxvexN4G9aNEWNZ9mU0XJx13", "mKukGrwwCcIhJco4KmzrvmgYUSCtT5hL", "T8hiTRn5Amgadg81lccjSSIUWb1StHzV"};
    public static final AtomicReference<KZ> A01 = new AtomicReference<>(null);

    public static KZ A00() {
        KZ kz = A01.get();
        if (A00[5].charAt(26) != '0') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[7] = "JAkiPTeS8Sgp4wJmZ2cE1Xuhf0WoAHfE";
        strArr[4] = "TWyum6rZOmg61QmMcVNeRxvFtffIUfDC";
        if (kz == null) {
            KZ errorLogger = new C1107Un();
            return errorLogger;
        }
        return kz;
    }

    public static void A01(KZ kz) {
        A01.set(kz);
    }
}
