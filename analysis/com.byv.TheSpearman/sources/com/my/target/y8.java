package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.my.target.f9;
import com.my.target.pa;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class y8 implements f9.a {

    /* renamed from: a, reason: collision with root package name */
    public final b9 f4194a;
    public final WeakReference<Context> b;
    public final pa c;
    public final pa.a d;
    public final q7 e;
    public WeakReference<f9> f;
    public b g;

    public class a extends pa.a {
        public a() {
        }

        @Override // com.my.target.pa.a
        public void a() {
            ba.a("ShoppableAdPresenter: shoppable ad is shown, id=" + y8.this.f4194a.getId());
            b bVar = y8.this.g;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.my.target.pa.a
        public void a(boolean z) {
            StringBuilder sb = new StringBuilder();
            sb.append("ShoppableAdPresenter: shoppable ad has changed visibility to ");
            sb.append(z ? "visible" : "gone");
            ba.a(sb.toString());
        }
    }

    public interface b {
        void a();

        void a(String str);

        void b(String str);
    }

    public y8(b9 b9Var, q7 q7Var, Context context) {
        a aVar = new a();
        this.d = aVar;
        ba.a("ShoppableAdPresenter: create presenter");
        this.f4194a = b9Var;
        this.b = new WeakReference<>(context);
        this.e = q7Var;
        pa paVarB = pa.b(b9Var.getViewability(), b9Var.getStatHolder());
        this.c = paVarB;
        paVarB.a(aVar);
    }

    public void a() {
        f9 f9Var;
        ba.a("ShoppableAdPresenter: destroy presenter");
        this.c.a((pa.a) null);
        this.c.d();
        WeakReference<f9> weakReference = this.f;
        if (weakReference != null && (f9Var = weakReference.get()) != null) {
            f9Var.setListener(null);
        }
        this.f = null;
    }

    @Override // com.my.target.f9.a
    public void a(int i, String str, String str2) {
        b bVar = this.g;
        if (bVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("WebView error - ");
        sb.append(i);
        if (!TextUtils.isEmpty(str)) {
            sb.append(", ");
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(", ");
            sb.append(str2);
        }
        bVar.a(sb.toString());
    }

    public void a(b bVar) {
        this.g = bVar;
    }

    @Override // com.my.target.f9.a
    public void a(String str) {
        ba.a("ShoppableAdPresenter: on shoppable view click, url - " + str);
        b bVar = this.g;
        if (bVar != null) {
            bVar.b(str);
        }
    }

    public long b() {
        f9 f9Var;
        WeakReference<f9> weakReference = this.f;
        if (weakReference == null || (f9Var = weakReference.get()) == null) {
            return 0L;
        }
        return f9Var.getAndResetInteractionEnd();
    }

    public View c() {
        f9 f9Var;
        WeakReference<f9> weakReference = this.f;
        if (weakReference != null && (f9Var = weakReference.get()) != null) {
            return f9Var;
        }
        Context context = this.b.get();
        if (context == null) {
            ba.a("ShoppableAdPresenter: context is null");
            return null;
        }
        f9 f9Var2 = new f9(context);
        f9Var2.setListener(this);
        f9Var2.a(this.e);
        this.c.b(f9Var2);
        f9Var2.a(null, this.f4194a.getSource(), "text/html", com.json.m4.M, null);
        this.f = new WeakReference<>(f9Var2);
        return f9Var2;
    }
}
