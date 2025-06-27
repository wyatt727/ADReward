package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.ca;

/* loaded from: classes.dex */
public class k extends View {

    /* renamed from: a, reason: collision with root package name */
    private final ca f262a;
    private boolean b;

    interface a {
        void a();

        void onFailure();
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f262a.b();
    }

    public void a(a aVar) {
        if (this.b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f262a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.onFailure();
            }
        } else {
            setBackground(drawableA);
            this.b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public k(ca caVar, Context context) {
        super(context);
        this.f262a = caVar;
        setClickable(false);
        setFocusable(false);
    }
}
