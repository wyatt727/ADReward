package com.my.target;

import android.content.Context;
import com.my.target.c;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.AudioData;
import com.my.target.d;
import com.my.target.instreamads.InstreamAudioAd;
import com.my.target.instreamads.InstreamAudioAdPlayer;
import com.my.target.l;
import com.my.target.n2;
import com.my.target.o5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final InstreamAudioAd f4172a;
    public final MenuFactory b;
    public final a3 d;
    public final j e;
    public final o5.a f;
    public final n2 g;
    public final y0 h;
    public f i;
    public String j;
    public c5<AudioData> k;
    public b5<AudioData> l;
    public InstreamAudioAd.InstreamAudioAdBanner m;
    public List<InstreamAudioAd.InstreamAdCompanionBanner> n;
    public List<b5<AudioData>> o;
    public float q;
    public int r;
    public int s;
    public int t;
    public final d.a c = new a();
    public float[] p = new float[0];

    public class a implements d.a {
        public a() {
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            InstreamAudioAd.InstreamAudioAdListener listener = w2.this.f4172a.getListener();
            if (listener != null) {
                w2 w2Var = w2.this;
                listener.onBannerShouldClose(w2Var.f4172a, w2Var.m);
                ba.a("InstreamAudioAdEngine: onBannerShouldClose called by adChoicesOption");
            }
        }
    }

    public class b implements n2.b {
        public b() {
        }

        @Override // com.my.target.n2.b
        public void a(float f, float f2, b5 b5Var) {
            InstreamAudioAd.InstreamAudioAdListener listener;
            w2 w2Var = w2.this;
            if (w2Var.k == null || w2Var.l != b5Var || w2Var.m == null || (listener = w2Var.f4172a.getListener()) == null) {
                return;
            }
            listener.onBannerTimeLeftChange(f, f2, w2.this.f4172a);
        }

        @Override // com.my.target.n2.b
        public void a(b5 b5Var) {
            w2 w2Var = w2.this;
            if (w2Var.k == null || w2Var.l != b5Var || w2Var.m == null) {
                return;
            }
            ba.a("InstreamAudioAdEngine: Ad shown, banner Id = " + b5Var.getId());
            InstreamAudioAd.InstreamAudioAdListener listener = w2.this.f4172a.getListener();
            if (listener != null) {
                w2 w2Var2 = w2.this;
                listener.onBannerStart(w2Var2.f4172a, w2Var2.m);
            }
        }

        @Override // com.my.target.n2.b
        public void a(String str, b5 b5Var) {
            w2 w2Var = w2.this;
            if (w2Var.k == null || w2Var.l != b5Var) {
                return;
            }
            InstreamAudioAd.InstreamAudioAdListener listener = w2Var.f4172a.getListener();
            if (listener != null) {
                listener.onError(str, w2.this.f4172a);
            }
            w2.this.f();
        }

        @Override // com.my.target.n2.b
        public void b(b5 b5Var) {
            w2 w2Var = w2.this;
            if (w2Var.k == null || w2Var.l != b5Var || w2Var.m == null) {
                return;
            }
            InstreamAudioAd.InstreamAudioAdListener listener = w2Var.f4172a.getListener();
            if (listener != null) {
                w2 w2Var2 = w2.this;
                listener.onBannerComplete(w2Var2.f4172a, w2Var2.m);
            }
            w2.this.f();
        }

        @Override // com.my.target.n2.b
        public void c(b5 b5Var) {
            InstreamAudioAd.InstreamAudioAdListener listener;
            w2 w2Var = w2.this;
            if (w2Var.k == null || w2Var.l != b5Var || w2Var.m == null || (listener = w2Var.f4172a.getListener()) == null) {
                return;
            }
            w2 w2Var2 = w2.this;
            listener.onBannerComplete(w2Var2.f4172a, w2Var2.m);
        }
    }

    public w2(InstreamAudioAd instreamAudioAd, a3 a3Var, j jVar, o5.a aVar, MenuFactory menuFactory) {
        this.f4172a = instreamAudioAd;
        this.d = a3Var;
        this.e = jVar;
        this.f = aVar;
        n2 n2VarH = n2.h();
        this.g = n2VarH;
        n2VarH.a(new b());
        this.h = y0.a();
        this.b = menuFactory;
    }

    public static w2 a(InstreamAudioAd instreamAudioAd, a3 a3Var, j jVar, o5.a aVar, MenuFactory menuFactory) {
        return new w2(instreamAudioAd, a3Var, jVar, aVar, menuFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c5 c5Var, float f, a3 a3Var, m mVar) {
        a((c5<AudioData>) c5Var, a3Var, mVar, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c5 c5Var, a3 a3Var, m mVar) {
        a((c5<AudioData>) c5Var, a3Var, mVar);
    }

    public final e1 a(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        String str;
        b5<AudioData> b5Var;
        if (this.n == null || this.m == null || (b5Var = this.l) == null) {
            str = "InstreamAudioAdEngine: Can't find companion banner - no playing banner";
        } else {
            ArrayList<e1> companionBanners = b5Var.getCompanionBanners();
            int iIndexOf = this.n.indexOf(instreamAdCompanionBanner);
            if (iIndexOf >= 0 && iIndexOf < companionBanners.size()) {
                return companionBanners.get(iIndexOf);
            }
            str = "InstreamAudioAdEngine: Can't find companion banner - provided instreamAdCompanionBanner not found in current playing banner";
        }
        ba.a(str);
        return null;
    }

    public void a() {
        this.g.c();
    }

    public void a(float f) {
        this.g.c(f);
    }

    public void a(int i) {
        this.r = i;
    }

    public void a(Context context) {
        ba.a("InstreamAudioAdEngine: handleAdChoicesClick called");
        f fVar = this.i;
        if (fVar != null) {
            if (fVar.b()) {
                return;
            }
            this.i.a(context);
            this.i.a(this.c);
            return;
        }
        ba.a("InstreamAudioAdEngine: hasn't adChoicesOptions");
        if (this.j != null) {
            ba.a("InstreamAudioAdEngine: open adChoicesClickLink");
            j3.a(this.j, context);
        }
    }

    public final void a(b5 b5Var, String str) {
        if (b5Var == null) {
            ba.a("InstreamAudioAdEngine: Can't send stat: banner is null");
            return;
        }
        Context contextD = this.g.d();
        if (contextD == null) {
            ba.a("InstreamAudioAdEngine: Can't send stat: context is null");
        } else {
            w9.a(b5Var.getStatHolder().b(str), contextD);
        }
    }

    public final void a(c5<AudioData> c5Var) {
        if (c5Var == this.k) {
            if ("midroll".equals(c5Var.h())) {
                this.k.b(this.t);
            }
            this.k = null;
            this.l = null;
            this.m = null;
            this.s = -1;
            InstreamAudioAd.InstreamAudioAdListener listener = this.f4172a.getListener();
            if (listener != null) {
                listener.onComplete(c5Var.h(), this.f4172a);
            }
        }
    }

    public final void a(c5<AudioData> c5Var, float f) {
        s sVarJ = c5Var.j();
        if (sVarJ == null) {
            a(c5Var);
            return;
        }
        if (!"midroll".equals(c5Var.h())) {
            a(sVarJ, c5Var);
            return;
        }
        sVarJ.c(true);
        sVarJ.b(f);
        ArrayList<s> arrayList = new ArrayList<>();
        arrayList.add(sVarJ);
        ba.a("InstreamAudioAdEngine: Using doAfter service for point - " + f);
        a(arrayList, c5Var, f);
    }

    public final void a(c5<AudioData> c5Var, a3 a3Var, m mVar) {
        if (a3Var != null) {
            c5<AudioData> c5VarA = a3Var.a(c5Var.h());
            if (c5VarA != null) {
                c5Var.a(c5VarA);
            }
            if (c5Var == this.k) {
                this.o = c5Var.d();
                f();
                return;
            }
            return;
        }
        if (mVar != null) {
            ba.a("InstreamAudioAdEngine: Loading doAfter service failed - " + mVar.b);
        }
        if (c5Var == this.k) {
            a(c5Var, this.q);
        }
    }

    public final void a(c5<AudioData> c5Var, a3 a3Var, m mVar, float f) {
        if (a3Var != null) {
            c5<AudioData> c5VarA = a3Var.a(c5Var.h());
            if (c5VarA != null) {
                c5Var.a(c5VarA);
            }
            if (c5Var == this.k && f == this.q) {
                b(c5Var, f);
                return;
            }
            return;
        }
        if (mVar != null) {
            ba.a("InstreamAudioAdEngine: Loading midpoint services failed - " + mVar.b);
        }
        if (c5Var == this.k && f == this.q) {
            a(c5Var, f);
        }
    }

    public void a(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner, Context context) {
        e1 e1VarA = a(instreamAdCompanionBanner);
        if (e1VarA == null) {
            ba.a("InstreamAudioAdEngine: Can't handle click - companion banner not found");
        } else {
            this.h.a(e1VarA, context);
        }
    }

    public void a(InstreamAudioAdPlayer instreamAudioAdPlayer) {
        this.g.a(instreamAudioAdPlayer);
    }

    public final void a(s sVar, final c5<AudioData> c5Var) {
        Context contextD = this.g.d();
        if (contextD == null) {
            ba.a("InstreamAudioAdEngine: Can't load doAfter service - context is null");
            return;
        }
        ba.a("InstreamAudioAdEngine: Loading doAfter service - " + sVar.b);
        x2.a(sVar, this.e, this.f, this.r).a(new l.b() { // from class: com.my.target.w2$$ExternalSyntheticLambda0
            @Override // com.my.target.l.b
            public final void a(q qVar, m mVar) {
                this.f$0.b(c5Var, (a3) qVar, mVar);
            }
        }).a(this.f.a(), contextD);
    }

    public void a(String str) {
        j();
        c5<AudioData> c5VarA = this.d.a(str);
        this.k = c5VarA;
        if (c5VarA == null) {
            ba.a("InstreamAudioAdEngine: No section with name " + str);
            return;
        }
        this.g.a(c5VarA.e());
        this.t = this.k.f();
        this.s = -1;
        this.o = this.k.d();
        f();
    }

    public final void a(ArrayList<s> arrayList, final c5<AudioData> c5Var, final float f) {
        Context contextD = this.g.d();
        if (contextD == null) {
            ba.a("InstreamAudioAdEngine: Can't load midpoint services - context is null");
            return;
        }
        ba.a("InstreamAudioAdEngine: Loading midpoint services for point - " + f);
        x2.a(arrayList, this.e, this.f, this.r).a(new l.b() { // from class: com.my.target.w2$$ExternalSyntheticLambda1
            @Override // com.my.target.l.b
            public final void a(q qVar, m mVar) {
                this.f$0.a(c5Var, f, (a3) qVar, mVar);
            }
        }).a(this.f.a(), contextD);
    }

    public void a(float[] fArr) {
        this.p = fArr;
    }

    public InstreamAudioAd.InstreamAudioAdBanner b() {
        return this.m;
    }

    public void b(float f) {
        j();
        float[] fArr = this.p;
        int length = fArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (Float.compare(fArr[i], f) == 0) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            ba.a("InstreamAudioAdEngine: Attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
            return;
        }
        c5<AudioData> c5VarA = this.d.a("midroll");
        this.k = c5VarA;
        if (c5VarA != null) {
            this.g.a(c5VarA.e());
            this.t = this.k.f();
            this.s = -1;
            this.q = f;
            b(this.k, f);
        }
    }

    public final void b(c5<AudioData> c5Var, float f) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c5Var.d().iterator();
        while (it.hasNext()) {
            b5 b5Var = (b5) it.next();
            if (b5Var.getPoint() == f) {
                arrayList.add(b5Var);
            }
        }
        int size = arrayList.size();
        if (size > 0 && this.s < size - 1) {
            this.o = arrayList;
            f();
            return;
        }
        ArrayList<s> arrayListA = c5Var.a(f);
        if (arrayListA.size() > 0) {
            a(arrayListA, c5Var, f);
            return;
        }
        ba.a("InstreamAudioAdEngine: There is no one midpoint service for point - " + f);
        a(c5Var, f);
    }

    public void b(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context contextD = this.g.d();
        if (contextD == null) {
            ba.a("InstreamAudioAdEngine: Can't handle click - context is null");
            return;
        }
        e1 e1VarA = a(instreamAdCompanionBanner);
        if (e1VarA == null) {
            ba.a("InstreamAudioAdEngine: Can't handle click - companion banner not found");
        } else {
            this.h.a(e1VarA, contextD);
        }
    }

    public InstreamAudioAdPlayer c() {
        return this.g.e();
    }

    public void c(InstreamAudioAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context contextD = this.g.d();
        if (contextD == null) {
            ba.a("InstreamAudioAdEngine: Can't handle show - context is null");
            return;
        }
        e1 e1VarA = a(instreamAdCompanionBanner);
        if (e1VarA == null) {
            ba.a("InstreamAudioAdEngine: Can't handle show - companion banner not found");
        } else {
            w9.a(e1VarA.getStatHolder().b("playbackStarted"), contextD);
        }
    }

    public float d() {
        return this.g.f();
    }

    public void e() {
        if (this.k != null) {
            this.g.i();
        }
    }

    public void f() {
        List<b5<AudioData>> list;
        c5<AudioData> c5Var = this.k;
        if (c5Var == null) {
            return;
        }
        if (this.t == 0 || (list = this.o) == null) {
            a(c5Var, this.q);
            return;
        }
        int i = this.s + 1;
        if (i >= list.size()) {
            a(this.k, this.q);
            return;
        }
        this.s = i;
        b5<AudioData> b5Var = this.o.get(i);
        if ("statistics".equals(b5Var.getType())) {
            a(b5Var, "playbackStarted");
            f();
            return;
        }
        int i2 = this.t;
        if (i2 > 0) {
            this.t = i2 - 1;
        }
        this.l = b5Var;
        this.m = InstreamAudioAd.InstreamAudioAdBanner.newBanner(b5Var);
        this.n = new ArrayList(this.m.companionBanners);
        c adChoices = this.l.getAdChoices();
        List<c.a> listA = null;
        if (adChoices != null) {
            this.j = adChoices.b();
            listA = adChoices.a();
        }
        if (listA != null) {
            this.i = f.a(listA, this.b);
        }
        this.g.a(b5Var);
    }

    public void g() {
        if (this.k != null) {
            this.g.j();
        }
    }

    public void h() {
        a(this.l, "closedByUser");
        j();
    }

    public void i() {
        a(this.l, "closedByUser");
        this.g.k();
        f();
    }

    public void j() {
        if (this.k != null) {
            this.g.k();
            a(this.k);
        }
    }
}
