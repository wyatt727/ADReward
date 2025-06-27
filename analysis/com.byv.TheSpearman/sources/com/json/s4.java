package com.json;

import android.util.Pair;
import com.json.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class s4 implements Runnable {
    private static final String e = "Content-Type";
    private static final String f = "application/json";

    /* renamed from: a, reason: collision with root package name */
    private f6 f2107a;
    String b;
    String c;
    ArrayList<l4> d;

    public s4(f6 f6Var, String str, String str2, ArrayList<l4> arrayList) {
        this.f2107a = f6Var;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = false;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            xb xbVarB = u6.b(this.c, this.b, arrayList);
            if (xbVarB != null) {
                int i = xbVarB.f2441a;
                if (i == 200 || i == 204) {
                    z = true;
                }
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e2.getLocalizedMessage());
        }
        f6 f6Var = this.f2107a;
        if (f6Var != null) {
            f6Var.a(this.d, z);
        }
    }
}
