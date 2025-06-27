package com.facebook.ads.redexgen.uinode;

import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public class I8 implements Comparator<I9> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(I9 i9, I9 i92) {
        if (i9.A00 < i92.A00) {
            return -1;
        }
        return i92.A00 < i9.A00 ? 1 : 0;
    }
}
