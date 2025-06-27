package com.my.target;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.c;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.VideoData;
import com.my.target.d;
import com.my.target.i3;
import com.my.target.instreamads.InstreamAd;
import com.my.target.instreamads.InstreamAdPlayer;
import com.my.target.instreamads.InstreamAdVideoMotionPlayer;
import com.my.target.l;
import com.my.target.o5;
import com.my.target.u2;
import com.my.target.y8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final InstreamAd f4080a;
    public final s2 b;
    public final j c;
    public final u2 d;
    public final i3 e;
    public final y0 f;
    public final o5.a g;
    public final MenuFactory h;
    public y8 j;
    public h3 k;
    public f0 l;
    public InstreamAd.InstreamAdBanner m;
    public InstreamAd.InstreamAdVideoMotionBanner n;
    public List<InstreamAd.InstreamAdCompanionBanner> o;
    public List<f0> p;
    public f q;
    public String r;
    public float u;
    public int v;
    public int w;
    public int x;
    public final d.a i = new a();
    public float[] s = new float[0];
    public int t = 0;

    public class a implements d.a {
        public a() {
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            InstreamAd.InstreamAdListener listener = o2.this.f4080a.getListener();
            if (listener == null) {
                ba.a("InstreamAdEngine: can't call onBannerShouldClose callback, instreamAdListener is null");
                return;
            }
            if (o2.this.l.getType().equals("video-motion")) {
                ba.a("InstreamAdEngine: onVideoMotionBannerShouldClose called by adChoicesOption");
                o2 o2Var = o2.this;
                listener.onVideoMotionBannerShouldClose(o2Var.f4080a, o2Var.n);
            } else {
                if (o2.this.l.getType().equals("video")) {
                    ba.a("InstreamAdEngine: onBannerShouldClose called by adChoicesOption");
                    listener.onBannerShouldClose();
                    return;
                }
                ba.a("InstreamAdEngine: ignore " + o2.this.l.getType() + " banner type for closing by adChoicesOption");
            }
        }
    }

    public static final class b implements y8.b {

        /* renamed from: a, reason: collision with root package name */
        public final b9 f4082a;
        public final y0 b;
        public final WeakReference<Context> c;

        public b(b9 b9Var, y0 y0Var, Context context) {
            this.f4082a = b9Var;
            this.b = y0Var;
            this.c = new WeakReference<>(context.getApplicationContext());
        }

        @Override // com.my.target.y8.b
        public void a() {
            Context context = this.c.get();
            if (context == null) {
                return;
            }
            w9.a(this.f4082a.getStatHolder().b("playbackStarted"), context);
        }

        @Override // com.my.target.y8.b
        public void a(String str) {
            Context context = this.c.get();
            if (context == null) {
                return;
            }
            z4.a("WebView error").e(str).c(this.f4082a.getId()).b(context);
        }

        @Override // com.my.target.y8.b
        public void b(String str) {
            Context context = this.c.get();
            if (context == null) {
                return;
            }
            this.b.a(this.f4082a, str, context);
        }
    }

    public class c implements u2.a {
        public c() {
        }

        @Override // com.my.target.u2.a
        public void a(float f, float f2, b5 b5Var) {
            InstreamAd.InstreamAdListener listener;
            o2 o2Var = o2.this;
            if (o2Var.k == null || o2Var.l != b5Var || o2Var.m == null || (listener = o2Var.f4080a.getListener()) == null) {
                return;
            }
            listener.onBannerTimeLeftChange(f, f2, o2.this.f4080a);
        }

        @Override // com.my.target.u2.a
        public void a(b5 b5Var) {
            InstreamAd.InstreamAdListener listener;
            o2 o2Var = o2.this;
            if (o2Var.k == null || o2Var.l != b5Var || o2Var.m == null || (listener = o2Var.f4080a.getListener()) == null) {
                return;
            }
            o2 o2Var2 = o2.this;
            listener.onBannerResume(o2Var2.f4080a, o2Var2.m);
        }

        @Override // com.my.target.u2.a
        public void a(String str, b5 b5Var) {
            o2 o2Var = o2.this;
            if (o2Var.k == null || o2Var.l != b5Var || o2Var.m == null) {
                return;
            }
            InstreamAd.InstreamAdListener listener = o2Var.f4080a.getListener();
            if (listener != null) {
                listener.onError(str, o2.this.f4080a);
            }
            o2.this.h();
        }

        @Override // com.my.target.u2.a
        public void b(b5 b5Var) {
            o2 o2Var = o2.this;
            if (o2Var.k == null || o2Var.l != b5Var || o2Var.m == null) {
                return;
            }
            b9 shoppableBanner = b5Var.getShoppableBanner();
            if (shoppableBanner != null && o2.this.f() && o2.this.j != null) {
                if (System.currentTimeMillis() - o2.this.j.b() < shoppableBanner.getInteractionTimeoutMillis()) {
                    o2.this.a(shoppableBanner, "shoppableReplay");
                    o2.this.d.a(b5Var, true);
                    return;
                } else {
                    o2.this.d.l();
                    o2.this.t = 2;
                }
            }
            InstreamAdPlayer player = o2.this.f4080a.getPlayer();
            if (player != null) {
                player.stopAdVideo();
            }
            InstreamAd.InstreamAdListener listener = o2.this.f4080a.getListener();
            if (listener != null) {
                o2 o2Var2 = o2.this;
                listener.onBannerComplete(o2Var2.f4080a, o2Var2.m);
            }
            o2 o2Var3 = o2.this;
            if (o2Var3.t == 0) {
                o2Var3.h();
            }
        }

        @Override // com.my.target.u2.a
        public void c(b5 b5Var) {
            InstreamAd.InstreamAdListener listener;
            o2 o2Var = o2.this;
            if (o2Var.k == null || o2Var.l != b5Var || o2Var.m == null || (listener = o2Var.f4080a.getListener()) == null) {
                return;
            }
            o2 o2Var2 = o2.this;
            listener.onBannerPause(o2Var2.f4080a, o2Var2.m);
        }

        @Override // com.my.target.u2.a
        public void d(b5 b5Var) {
            o2 o2Var = o2.this;
            if (o2Var.k == null || o2Var.l != b5Var || o2Var.m == null || o2Var.t != 0) {
                return;
            }
            ba.a("InstreamAdEngine$VideoControllerListener: Ad shown, banner Id = " + b5Var.getId());
            InstreamAd.InstreamAdListener listener = o2.this.f4080a.getListener();
            if (listener != null) {
                o2 o2Var2 = o2.this;
                listener.onBannerStart(o2Var2.f4080a, o2Var2.m);
            }
        }

        @Override // com.my.target.u2.a
        public void e(b5 b5Var) {
            InstreamAd.InstreamAdListener listener;
            o2 o2Var = o2.this;
            if (o2Var.k == null || o2Var.l != b5Var || o2Var.m == null || (listener = o2Var.f4080a.getListener()) == null) {
                return;
            }
            o2 o2Var2 = o2.this;
            listener.onBannerComplete(o2Var2.f4080a, o2Var2.m);
        }
    }

    public class d implements i3.a {
        public d() {
        }

        @Override // com.my.target.i3.a
        public void a(ja jaVar) {
            o2 o2Var = o2.this;
            if (o2Var.k == null || o2Var.l != jaVar || o2Var.n == null) {
                return;
            }
            InstreamAdPlayer player = o2Var.f4080a.getPlayer();
            if (player != null) {
                player.stopAdVideo();
            }
            InstreamAd.InstreamAdListener listener = o2.this.f4080a.getListener();
            if (listener != null) {
                o2 o2Var2 = o2.this;
                listener.onVideoMotionBannerComplete(o2Var2.f4080a, o2Var2.n);
            }
            o2 o2Var3 = o2.this;
            if (o2Var3.t == 0) {
                o2Var3.h();
            }
        }

        @Override // com.my.target.i3.a
        public void b(ja jaVar) {
            InstreamAd.InstreamAdListener listener;
            o2 o2Var = o2.this;
            if (o2Var.k == null || o2Var.l != jaVar || o2Var.n == null || (listener = o2Var.f4080a.getListener()) == null) {
                return;
            }
            o2 o2Var2 = o2.this;
            listener.onVideoMotionBannerStart(o2Var2.f4080a, o2Var2.n);
        }
    }

    public o2(InstreamAd instreamAd, s2 s2Var, j jVar, o5.a aVar, MenuFactory menuFactory) {
        this.f4080a = instreamAd;
        this.b = s2Var;
        this.c = jVar;
        this.g = aVar;
        u2 u2VarI = u2.i();
        this.d = u2VarI;
        u2VarI.a(new c());
        y0 y0VarA = y0.a();
        this.f = y0VarA;
        i3 i3VarA = i3.a(y0VarA);
        this.e = i3VarA;
        i3VarA.a(new d());
        this.h = menuFactory;
    }

    public static o2 a(InstreamAd instreamAd, s2 s2Var, j jVar, o5.a aVar, MenuFactory menuFactory) {
        return new o2(instreamAd, s2Var, jVar, aVar, menuFactory);
    }

    public View a(Context context) {
        String str;
        y8 y8Var = this.j;
        if (y8Var != null) {
            return y8Var.c();
        }
        f0 f0Var = this.l;
        if (f0Var == null) {
            str = "InstreamAdEngine: no current banner";
        } else {
            b9 shoppableBanner = f0Var.getShoppableBanner();
            if (shoppableBanner != null) {
                y8 y8Var2 = new y8(shoppableBanner, new c9(shoppableBanner, this.f, this.l.getShoppableAdsData(), context), context);
                this.j = y8Var2;
                y8Var2.a(new b(shoppableBanner, this.f, context));
                return this.j.c();
            }
            str = "InstreamAdEngine: no shoppable banner";
        }
        ba.a(str);
        return null;
    }

    public e1 a(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        String str;
        f0 f0Var;
        if (this.o == null || this.m == null || (f0Var = this.l) == null) {
            str = "InstreamAdEngine: can't find companion banner - no playing banner";
        } else {
            ArrayList<e1> companionBanners = f0Var.getCompanionBanners();
            int iIndexOf = this.o.indexOf(instreamAdCompanionBanner);
            if (iIndexOf >= 0 && iIndexOf < companionBanners.size()) {
                return companionBanners.get(iIndexOf);
            }
            str = "InstreamAdEngine: can't find companion banner - provided instreamAdCompanionBanner not found in current playing banner";
        }
        ba.a(str);
        return null;
    }

    public void a() {
        this.d.c();
        b();
    }

    public void a(float f) {
        this.d.b(f);
    }

    public void a(int i) {
        this.v = i;
    }

    public void a(com.my.target.b bVar, String str) {
        if (bVar == null) {
            ba.a("InstreamAdEngine: Can't send stat - banner is null");
            return;
        }
        Context contextD = this.d.d();
        if (contextD == null) {
            ba.a("InstreamAdEngine: Can't send stat - context is null");
        } else {
            w9.a(bVar.getStatHolder().b(str), contextD);
        }
    }

    public void a(h3 h3Var) {
        if (h3Var != this.k) {
            return;
        }
        b();
        if ("midroll".equals(h3Var.h())) {
            this.k.b(this.x);
        }
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.w = -1;
        InstreamAd.InstreamAdListener listener = this.f4080a.getListener();
        if (listener != null) {
            listener.onComplete(h3Var.h(), this.f4080a);
        }
    }

    public void a(h3 h3Var, float f) {
        s sVarJ = h3Var.j();
        if (sVarJ == null) {
            a(h3Var);
            return;
        }
        if (!"midroll".equals(h3Var.h())) {
            a(sVarJ, h3Var);
            return;
        }
        sVarJ.c(true);
        sVarJ.b(f);
        ArrayList<s> arrayList = new ArrayList<>();
        arrayList.add(sVarJ);
        ba.a("InstreamAdEngine: Using doAfter service for point - " + f);
        a(arrayList, h3Var, f);
    }

    public void a(h3 h3Var, s2 s2Var, IAdLoadingError iAdLoadingError, float f) {
        if (s2Var != null) {
            h3 h3VarA = s2Var.a(h3Var.h());
            if (h3VarA != null) {
                h3Var.a(h3VarA);
            }
            if (h3Var == this.k && f == this.u) {
                b(h3Var, f);
                return;
            }
            return;
        }
        if (iAdLoadingError != null) {
            ba.a("InstreamAdEngine: loading midpoint services failed - " + iAdLoadingError);
        }
        if (h3Var == this.k && f == this.u) {
            a(h3Var, f);
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(h3 h3Var, s2 s2Var, m mVar) {
        if (s2Var != null) {
            h3 h3VarA = s2Var.a(h3Var.h());
            if (h3VarA != null) {
                h3Var.a(h3VarA);
            }
            if (h3Var == this.k) {
                this.p = h3Var.d();
                h();
                return;
            }
            return;
        }
        if (mVar != null) {
            ba.a("InstreamAdEngine: Loading doAfter service failed - " + mVar.b);
        }
        if (h3Var == this.k) {
            a(h3Var, this.u);
        }
    }

    public void a(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner, Context context) {
        e1 e1VarA = a(instreamAdCompanionBanner);
        if (e1VarA == null) {
            ba.a("InstreamAdEngine: can't handle click - companion banner is null");
        } else {
            this.f.a(e1VarA, context);
        }
    }

    public void a(InstreamAdPlayer instreamAdPlayer) {
        this.d.a(instreamAdPlayer);
    }

    public void a(InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer) {
        this.e.a(instreamAdVideoMotionPlayer);
    }

    public void a(s sVar, final h3 h3Var) {
        Context contextD = this.d.d();
        if (contextD == null) {
            ba.a("InstreamAdEngine: Can't load doAfter service: context is null");
            return;
        }
        ba.a("InstreamAdEngine: Loading doAfter service - " + sVar.b);
        p2.a(sVar, this.c, this.g, this.v).a(new l.b() { // from class: com.my.target.o2$$ExternalSyntheticLambda0
            @Override // com.my.target.l.b
            public final void a(q qVar, m mVar) {
                this.f$0.b(h3Var, (s2) qVar, mVar);
            }
        }).a(this.g.a(), contextD);
    }

    public void a(String str) {
        a(str, "shoppableAdsItemClick");
        a(str, CampaignEx.JSON_NATIVE_VIDEO_CLICK);
    }

    public void a(String str, String str2) {
        Context contextD = this.d.d();
        if (contextD == null) {
            ba.a("InstreamAdEngine: Can't send stat - context is null");
            return;
        }
        f0 f0Var = this.l;
        if (f0Var == null) {
            ba.a("InstreamAdEngine: hasn't current banner");
            return;
        }
        z8 shoppableAdsData = f0Var.getShoppableAdsData();
        if (shoppableAdsData == null) {
            ba.a("InstreamAdEngine: hasn't shoppableAdsData");
            return;
        }
        boolean z = false;
        Iterator<m3> it = shoppableAdsData.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            m3 next = it.next();
            if (str.equals(next.id)) {
                z = true;
                w9.a(next.f4053a.b(str2), contextD);
                break;
            }
        }
        if (z) {
            w9.a(shoppableAdsData.b().b(str2), contextD);
        } else {
            ba.a("InstreamAdEngine: wrong shoppableAdsItemId");
        }
    }

    public void a(ArrayList<s> arrayList, final h3 h3Var, final float f) {
        Context contextD = this.d.d();
        if (contextD == null) {
            ba.a("InstreamAdEngine: can't load midpoint services - context is null");
            return;
        }
        ba.a("InstreamAdEngine: Loading midpoint services for point - " + f);
        p2.a(arrayList, this.c, this.g, this.v).a(new l.b() { // from class: com.my.target.o2$$ExternalSyntheticLambda1
            @Override // com.my.target.l.b
            public final void a(q qVar, m mVar) {
                this.f$0.a(h3Var, f, (s2) qVar, mVar);
            }
        }).a(this.g.a(), contextD);
    }

    public void a(boolean z) {
        a(this.l, z ? "fullscreenOn" : "fullscreenOff");
    }

    public void a(float[] fArr) {
        this.s = fArr;
    }

    public void b() {
        this.t = 0;
        y8 y8Var = this.j;
        if (y8Var == null) {
            return;
        }
        y8Var.a();
        this.j.a((y8.b) null);
        this.j = null;
    }

    public void b(float f) {
        l();
        float[] fArr = this.s;
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
            ba.a("InstreamAdEngine: Attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
            return;
        }
        h3 h3VarA = this.b.a("midroll");
        this.k = h3VarA;
        if (h3VarA != null) {
            this.d.b(h3VarA.e());
            this.x = this.k.f();
            this.w = -1;
            this.u = f;
            b(this.k, f);
        }
    }

    public void b(Context context) {
        ba.a("InstreamAdEngine: handleAdChoicesClick called");
        f fVar = this.q;
        if (fVar != null) {
            if (fVar.b()) {
                return;
            }
            this.q.a(context);
            this.q.a(this.i);
            return;
        }
        ba.a("InstreamAdEngine: hasn't adChoicesOptions");
        if (this.r != null) {
            ba.a("InstreamAdEngine: open adChoicesClickLink");
            j3.a(this.r, context);
        }
    }

    public void b(h3 h3Var, float f) {
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : h3Var.d()) {
            if (f0Var.getPoint() == f) {
                arrayList.add(f0Var);
            }
        }
        int size = arrayList.size();
        if (size > 0 && this.w < size - 1) {
            this.p = arrayList;
            h();
            return;
        }
        ArrayList<s> arrayListA = h3Var.a(f);
        if (arrayListA.size() > 0) {
            a(arrayListA, h3Var, f);
            return;
        }
        ba.a("InstreamAdEngine: There is no one midpoint service for point - " + f);
        a(h3Var, f);
    }

    public void b(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context contextD = this.d.d();
        if (contextD == null) {
            ba.a("InstreamAdEngine: can't handle click - context is null");
        } else {
            a(instreamAdCompanionBanner, contextD);
        }
    }

    public void b(InstreamAdPlayer instreamAdPlayer) {
        this.d.b(instreamAdPlayer);
    }

    public void b(String str) {
        a(str, "shoppableAdsItemShow");
        a(str, com.json.i1.u);
    }

    public void b(boolean z) {
        f0 f0Var = this.l;
        if (f0Var == null || f0Var.getShoppableBanner() == null) {
            return;
        }
        if (!z && this.t == 2) {
            h();
        }
        this.t = z ? 1 : 0;
        a(this.l, z ? "shoppableOn" : "shoppableOff");
    }

    public InstreamAdPlayer c() {
        return this.d.e();
    }

    public void c(InstreamAd.InstreamAdCompanionBanner instreamAdCompanionBanner) {
        Context contextD = this.d.d();
        if (contextD == null) {
            ba.a("can't handle show: context is null");
            return;
        }
        e1 e1VarA = a(instreamAdCompanionBanner);
        if (e1VarA == null) {
            ba.a("can't handle show: companion banner not found");
        } else {
            w9.a(e1VarA.getStatHolder().b("playbackStarted"), contextD);
        }
    }

    public void c(String str) {
        l();
        h3 h3VarA = this.b.a(str);
        this.k = h3VarA;
        if (h3VarA == null) {
            ba.a("InstreamAdEngine: No section with name " + str);
            return;
        }
        this.d.b(h3VarA.e());
        this.x = this.k.f();
        this.w = -1;
        this.p = this.k.d();
        h();
    }

    public float d() {
        return this.d.f();
    }

    public void e() {
        if (this.l == null) {
            ba.a("InstreamAdEngine: can't handle click - no playing banner");
            return;
        }
        Context contextD = this.d.d();
        if (contextD == null) {
            ba.a("InstreamAdEngine: can't handle click - context is null");
        } else {
            this.f.a(this.l, contextD);
        }
    }

    public boolean f() {
        return this.t != 0;
    }

    public void g() {
        if (this.k != null) {
            this.d.j();
        }
    }

    public void h() {
        List<f0> list;
        b();
        h3 h3Var = this.k;
        if (h3Var == null) {
            return;
        }
        if (this.x == 0 || (list = this.p) == null) {
            a(h3Var, this.u);
            return;
        }
        int i = this.w + 1;
        if (i >= list.size()) {
            a(this.k, this.u);
            return;
        }
        this.w = i;
        f0 f0Var = this.p.get(i);
        if ("statistics".equals(f0Var.getType())) {
            a(f0Var, "playbackStarted");
            h();
            return;
        }
        int i2 = this.x;
        if (i2 > 0) {
            this.x = i2 - 1;
        }
        this.l = f0Var;
        com.my.target.c adChoices = f0Var.getAdChoices();
        List<c.a> listA = null;
        if (adChoices != null) {
            this.r = adChoices.b();
            listA = adChoices.a();
        }
        if (listA != null) {
            this.q = f.a(listA, this.h);
        }
        if (f0Var instanceof b5) {
            b5<VideoData> b5Var = (b5) f0Var;
            if (b5Var.getMediaData() instanceof VideoData) {
                this.m = InstreamAd.InstreamAdBanner.newBanner(f0Var);
                this.o = new ArrayList(this.m.companionBanners);
                this.d.a(b5Var);
                return;
            }
            return;
        }
        if (!(f0Var instanceof ja)) {
            ba.a("InstreamAdEngine: failed play instreamAd banner, can't recognize type ");
            return;
        }
        ja jaVar = (ja) f0Var;
        InstreamAd.InstreamAdVideoMotionBanner instreamAdVideoMotionBannerNewBanner = InstreamAd.InstreamAdVideoMotionBanner.newBanner(jaVar);
        this.n = instreamAdVideoMotionBannerNewBanner;
        if (instreamAdVideoMotionBannerNewBanner == null) {
            ba.a("InstreamAdEngine: can't create instreamAdVideoMotionBanner");
        } else {
            this.e.a(jaVar, instreamAdVideoMotionBannerNewBanner);
        }
    }

    public void i() {
        if (this.k != null) {
            this.d.k();
        }
    }

    public void j() {
        a(this.l, "closedByUser");
        this.d.m();
        l();
    }

    public void k() {
        a(this.l, "closedByUser");
        this.d.m();
        this.d.l();
        h();
    }

    public void l() {
        if (this.k != null) {
            this.d.l();
            a(this.k);
        }
    }
}
