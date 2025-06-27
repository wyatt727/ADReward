package com.my.target;

import android.content.Context;
import com.my.target.common.models.AudioData;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class z2 extends p<a3> {
    public static z2 a() {
        return new z2();
    }

    @Override // com.my.target.p
    public a3 a(a3 a3Var, j jVar, n nVar, Context context) {
        ArrayList<c5<AudioData>> arrayListC = a3Var.c();
        Iterator<c5<AudioData>> it = arrayListC.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<c5<AudioData>> it2 = arrayListC.iterator();
        while (it2.hasNext()) {
            Iterator it3 = it2.next().d().iterator();
            while (it3.hasNext()) {
                c adChoices = ((b5) it3.next()).getAdChoices();
                if (adChoices != null) {
                    ImageData imageDataC = adChoices.c();
                    imageDataC.useCache(true);
                    arrayList.add(imageDataC);
                }
            }
        }
        if (arrayList.size() > 0) {
            m2.a(arrayList).c(context);
        }
        return a3Var;
    }
}
