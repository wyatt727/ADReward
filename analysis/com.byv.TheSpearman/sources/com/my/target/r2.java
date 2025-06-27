package com.my.target;

import android.content.Context;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class r2 extends p<s2> {
    public static r2 a() {
        return new r2();
    }

    @Override // com.my.target.p
    public s2 a(s2 s2Var, j jVar, n nVar, Context context) {
        Iterator<h3> it = s2Var.c().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<h3> it2 = s2Var.c().iterator();
        while (it2.hasNext()) {
            Iterator<f0> it3 = it2.next().d().iterator();
            while (it3.hasNext()) {
                c adChoices = it3.next().getAdChoices();
                if (adChoices != null) {
                    ImageData imageDataC = adChoices.c();
                    imageDataC.useCache(true);
                    arrayList.add(imageDataC);
                }
            }
        }
        if (arrayList.size() > 0) {
            m2.a(arrayList).a(jVar.getSlotId(), (String) null).c(context);
        }
        return s2Var;
    }
}
