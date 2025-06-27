package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class r8 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<t8> f4114a;
    public final ArrayList<t7> b;
    public int c = -1;

    public r8(v9 v9Var) {
        ArrayList<t8> arrayList = new ArrayList<>();
        Iterator<u9> it = v9Var.b("playheadTimerValue").iterator();
        while (it.hasNext()) {
            u9 next = it.next();
            if (next instanceof t8) {
                arrayList.add((t8) next);
            }
        }
        this.f4114a = arrayList;
        ArrayList<t7> arrayList2 = new ArrayList<>();
        this.b = arrayList2;
        v9Var.b(arrayList2);
    }

    public static r8 a(v9 v9Var) {
        return new r8(v9Var);
    }

    public void a(int i, int i2, Context context) {
        if (i2 < 0 || i < 0 || i == this.c) {
            return;
        }
        this.c = i;
        if (!this.f4114a.isEmpty() && i != 0) {
            Iterator<t8> it = this.f4114a.iterator();
            while (it.hasNext()) {
                a(i, it.next(), context);
            }
        }
        ArrayList arrayList = new ArrayList();
        while (!this.b.isEmpty()) {
            if (this.b.get(r0.size() - 1).e() > i) {
                break;
            }
            arrayList.add(this.b.remove(r0.size() - 1));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        w9.a(arrayList, context);
    }

    public final void a(int i, t8 t8Var, Context context) {
        int iF = t8Var.f();
        int iD = t8Var.d();
        if ((iF <= i && (iD == 0 || iD >= i)) && (i - iF) % t8Var.e() == 0) {
            String strReplace = t8Var.b().replace("[CONTENTPLAYHEAD]", String.valueOf(i));
            if (TextUtils.isEmpty(strReplace)) {
                return;
            }
            w9.c(strReplace, context);
        }
    }
}
