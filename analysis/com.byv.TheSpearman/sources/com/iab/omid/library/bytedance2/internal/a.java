package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class a implements d.a {
    private static a f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f1489a = new com.iab.omid.library.bytedance2.utils.f();
    private Date b;
    private boolean c;
    private d d;
    private boolean e;

    private a(d dVar) {
        this.d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() throws JSONException {
        if (!this.c || this.b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public void a(Context context) {
        if (this.c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.e = this.d.c();
        this.c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z) throws JSONException {
        if (!this.e && z) {
            d();
        }
        this.e = z;
    }

    public Date b() {
        Date date = this.b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f1489a.a();
        Date date = this.b;
        if (date == null || dateA.after(date)) {
            this.b = dateA;
            c();
        }
    }
}
