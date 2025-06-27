package com.my.target;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.my.target.common.MyTargetManager;
import com.my.target.o5;
import com.my.target.q;
import com.my.target.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class l<T extends q> {
    public static String f = "ad.mail.ru";
    public static String g = "https://";

    /* renamed from: a, reason: collision with root package name */
    public final a<T> f4033a;
    public final j b;
    public final o5.a c;
    public String d;
    public b<T> e;

    public interface a<T extends q> {
        boolean a();

        t b();

        p<T> c();

        o<T> d();
    }

    public interface b<T extends q> {
        void a(T t, m mVar);
    }

    public l(a<T> aVar, j jVar, o5.a aVar2) {
        this.f4033a = aVar;
        this.b = jVar;
        this.c = aVar2;
    }

    public static void a(o5 o5Var, int i, long j) {
        o5Var.a(i, System.currentTimeMillis() - j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(o5 o5Var, Context context, q qVar, m mVar) {
        a((l<T>) qVar, mVar, o5Var, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(o5 o5Var, List list, t tVar, s7 s7Var, Context context, b bVar, s sVar, String str) {
        a(sVar, str, o5Var, (List<String>) list, tVar, s7Var, context, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(q qVar, m mVar) {
        b<T> bVar = this.e;
        if (bVar != null) {
            bVar.a(qVar, mVar);
            this.e = null;
        }
    }

    public static long b(o5 o5Var, int i, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        o5Var.b(i, jCurrentTimeMillis - j);
        return jCurrentTimeMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final o5 o5Var, final Context context) {
        a(o5Var, context, new b() { // from class: com.my.target.l$$ExternalSyntheticLambda0
            @Override // com.my.target.l.b
            public final void a(q qVar, m mVar) {
                this.f$0.a(o5Var, context, qVar, mVar);
            }
        });
    }

    public final l<T> a(b<T> bVar) {
        this.e = bVar;
        return this;
    }

    public l<T> a(final o5 o5Var, Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (!MyTargetManager.isSdkInitialized()) {
            MyTargetManager.initSdk(applicationContext);
        }
        c0.a(new Runnable() { // from class: com.my.target.l$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(o5Var, applicationContext);
            }
        });
        return this;
    }

    public T a(T t, n nVar, Context context) {
        p<T> pVarC;
        return (t == null || (pVarC = this.f4033a.c()) == null) ? t : (T) pVarC.a(t, this.b, nVar, context);
    }

    public T a(List<s> list, T t, o<T> oVar, x1 x1Var, o5 o5Var, n nVar, Context context) {
        if (list.size() <= 0) {
            return t;
        }
        Iterator<s> it = list.iterator();
        T t2 = t;
        while (it.hasNext()) {
            t2 = a(it.next(), (s) t2, (o<s>) oVar, x1Var, o5Var, nVar, context).b;
        }
        return t2;
    }

    public u<b2<String>, T> a(s sVar, T t, o<T> oVar, x1 x1Var, o5 o5Var, n nVar, Context context) {
        int i;
        b2<String> b2Var;
        Context context2;
        s sVar2;
        q qVarA = t;
        long jCurrentTimeMillis = System.currentTimeMillis();
        b2<String> b2VarA = x1Var.a(sVar.b, null, context);
        a(o5Var, 1, jCurrentTimeMillis);
        if (!b2VarA.d()) {
            return new u<>(b2VarA, qVarA);
        }
        w9.a(sVar.a("serviceRequested"), context);
        int iA = qVarA != null ? t.a() : 0;
        String strC = b2VarA.c();
        if (strC != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            q qVarA2 = oVar.a(strC, sVar, t, this.b, this.c, o5Var, null, nVar, context);
            a(o5Var, 2, jCurrentTimeMillis2);
            i = iA;
            b2Var = b2VarA;
            context2 = context;
            sVar2 = sVar;
            qVarA = a((List<s>) sVar.D(), (ArrayList<s>) qVarA2, (o<ArrayList<s>>) oVar, x1Var, o5Var, nVar, context);
        } else {
            i = iA;
            b2Var = b2VarA;
            context2 = context;
            sVar2 = sVar;
        }
        T t2 = qVarA;
        if (i == (t2 != null ? t2.a() : 0)) {
            w9.a(sVar2.a("serviceAnswerEmpty"), context2);
            s sVarW = sVar.w();
            if (sVarW != null) {
                t2 = a(sVarW, (s) t2, (o<s>) oVar, x1Var, o5Var, nVar, context).b;
            }
        }
        return new u<>(b2Var, t2);
    }

    public u<b2<String>, String> a(s sVar, x1 x1Var, Map<String, String> map, Context context) {
        b2<String> b2VarB = x1Var.b(sVar.b, sVar.f4116a, map, context);
        if (b2VarB.d()) {
            return new u<>(b2VarB, b2VarB.c());
        }
        this.d = b2VarB.a();
        return new u<>(b2VarB, null);
    }

    public final void a(b2<String> b2Var, b<T> bVar) {
        m mVar;
        if (b2Var == null) {
            mVar = m.c;
        } else {
            int iB = b2Var.b();
            String str = iB + " – " + b2Var.a();
            if (iB == 403) {
                mVar = m.f;
            } else if (iB == 404) {
                mVar = m.g;
            } else if (iB == 408) {
                mVar = m.e;
            } else if (iB != 500) {
                if (iB != 504) {
                    bVar.a(null, iB == 200 ? m.j : m.a(1000, str));
                    return;
                }
                mVar = m.e;
            } else {
                mVar = m.h;
            }
        }
        bVar.a(null, mVar);
    }

    public void a(final o5 o5Var, final Context context, final b<T> bVar) {
        a5.c(context);
        if (!x1.a(context)) {
            bVar.a(null, m.d);
            return;
        }
        final s7 s7VarA = s7.a(context);
        final ArrayList arrayList = new ArrayList();
        String strF = s7VarA.f();
        if (!TextUtils.isEmpty(strF)) {
            Collections.addAll(arrayList, strF.split(","));
        }
        arrayList.add(f);
        final t tVarB = this.f4033a.b();
        tVarB.a((String) arrayList.get(0), this.b, o5Var, context, new t.b() { // from class: com.my.target.l$$ExternalSyntheticLambda1
            @Override // com.my.target.t.b
            public final void a(s sVar, String str) {
                this.f$0.a(o5Var, arrayList, tVarB, s7VarA, context, bVar, sVar, str);
            }
        });
    }

    public void a(final T t, final m mVar, o5 o5Var, Context context) {
        o5Var.b(context);
        if (this.e == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            c0.d(new Runnable() { // from class: com.my.target.l$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(t, mVar);
                }
            });
        } else {
            this.e.a(t, mVar);
            this.e = null;
        }
    }

    public final void a(s sVar, String str, o5 o5Var, List<String> list, t tVar, s7 s7Var, Context context, b<T> bVar) {
        long j;
        String str2;
        String strJoin;
        s7 s7Var2;
        b<T> bVar2;
        Context context2;
        o5 o5Var2;
        if (sVar == null) {
            bVar.a(null, m.o);
            return;
        }
        x1 x1VarA = x1.a();
        o5Var.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        int i = 0;
        int size = list.size() - 1;
        b2<String> b2Var = null;
        while (true) {
            if (i > size) {
                j = jCurrentTimeMillis;
                break;
            }
            String str3 = list.get(i);
            StringBuilder sb2 = new StringBuilder();
            b2<String> b2Var2 = b2Var;
            sb2.append(g);
            sb2.append(str3);
            sb2.append("/mobile/");
            j = jCurrentTimeMillis;
            u<b2<String>, String> uVarA = a(tVar.a(sb2.toString(), this.b, sVar.f4116a), x1VarA, map, context);
            b2<String> b2Var3 = uVarA.f4138a;
            b2Var = b2Var3 != null ? b2Var3 : b2Var2;
            String str4 = uVarA.b;
            if (o.a(str4)) {
                str2 = str4;
                break;
            }
            if (i == size) {
                break;
            }
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(str3);
            map.put("X-Failed-Hosts", sb.toString());
            i++;
            jCurrentTimeMillis = j;
        }
        str2 = null;
        if (str2 == null) {
            a(b2Var, bVar);
            return;
        }
        long jB = b(o5Var, 1, j);
        List<String> arrayList = new ArrayList<>();
        o<T> oVarD = this.f4033a.d();
        n nVarB = n.b();
        q qVarA = oVarD.a(str2, sVar, null, this.b, this.c, o5Var, arrayList, nVarB, context);
        b(o5Var, 2, jB);
        if (arrayList.isEmpty()) {
            s7Var2 = s7Var;
            strJoin = null;
        } else {
            strJoin = TextUtils.join(",", arrayList);
            s7Var2 = s7Var;
        }
        s7Var2.f(strJoin);
        if (this.f4033a.a()) {
            bVar2 = bVar;
            context2 = context;
            o5Var2 = o5Var;
            qVarA = a(sVar.D(), (List<s>) qVarA, (o<List<s>>) oVarD, x1VarA, o5Var, nVarB, context);
        } else {
            bVar2 = bVar;
            context2 = context;
            o5Var2 = o5Var;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        q qVarA2 = a((l<T>) qVarA, nVarB, context2);
        b(o5Var2, 3, jCurrentTimeMillis2);
        bVar2.a(qVarA2, nVarB.a());
    }
}
