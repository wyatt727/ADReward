package com.my.target;

import android.content.Context;
import com.my.target.t;
import java.util.Map;

/* loaded from: classes4.dex */
public class r6 extends t.a {
    public static r6 b() {
        return new r6();
    }

    @Override // com.my.target.t.a
    public int a(j jVar, Context context) {
        return s7.a(context).c();
    }

    @Override // com.my.target.t.a
    public Map<String, String> a(j jVar, o5 o5Var, Context context) {
        Map<String, String> mapA = super.a(jVar, o5Var, context);
        Map<String, String> mapSnapshot = q6.d().snapshot();
        if (mapSnapshot != null && mapSnapshot.size() > 0) {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (String str : mapSnapshot.keySet()) {
                if (z) {
                    sb.append(",");
                } else {
                    z = true;
                }
                sb.append(str);
            }
            String string = sb.toString();
            mapA.put("exb", string);
            ba.a("NativeAdServiceBuilder: Exclude list - " + string);
        }
        return mapA;
    }
}
