package com.my.target;

import android.content.Context;

/* loaded from: classes4.dex */
public class p9 extends p<q9> {
    public static p9 a() {
        return new p9();
    }

    @Override // com.my.target.p
    public q9 a(q9 q9Var, j jVar, n nVar, Context context) {
        j9 j9VarC = q9Var.c();
        if (j9VarC != null) {
            c adChoices = j9VarC.getAdChoices();
            if (adChoices == null) {
                return q9Var;
            }
            m2.a(adChoices.c()).a(jVar.getSlotId(), j9VarC.getId()).c(context);
            return q9Var;
        }
        e5 e5VarB = q9Var.b();
        if (e5VarB != null && e5VarB.b()) {
            return q9Var;
        }
        nVar.a(m.r);
        return null;
    }
}
