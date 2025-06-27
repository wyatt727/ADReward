package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1239Zu implements InterfaceC04563w {
    public final /* synthetic */ C0695Eg A00;
    public final /* synthetic */ C04543u A01;

    public C1239Zu(C0695Eg c0695Eg, C04543u c04543u) {
        this.A00 = c0695Eg;
        this.A01 = c04543u;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04563w
    public final Object A4W(int i) {
        C04523s compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04563w
    public final List<Object> A5h(String str, int i) {
        List<C04523s> listA03 = this.A01.A03(str, i);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = listA03.size();
        for (int i2 = 0; i2 < infoCount; i2++) {
            arrayList.add(listA03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04563w
    public final boolean ADx(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
