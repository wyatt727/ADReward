package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import java.util.concurrent.Semaphore;

/* compiled from: SocketRequestTask.java */
/* loaded from: classes4.dex */
public final class k extends com.mbridge.msdk.foundation.same.e.a {
    private Context b;
    private String c;
    private String d;
    private String e;
    private CampaignEx f;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private com.mbridge.msdk.click.entity.a k;
    private JumpLoaderResult l;
    private f m;
    private j n;

    /* renamed from: a, reason: collision with root package name */
    private final Semaphore f2534a = new Semaphore(0);
    private final m.a o = new m.a() { // from class: com.mbridge.msdk.click.k.1
        @Override // com.mbridge.msdk.click.m.a
        public final boolean c(String str) {
            return false;
        }

        @Override // com.mbridge.msdk.click.m.a
        public final boolean a(String str) {
            boolean zA = k.a(k.this, str);
            if (zA) {
                a();
            }
            return zA;
        }

        @Override // com.mbridge.msdk.click.m.a
        public final boolean b(String str) {
            boolean zA = k.a(k.this, str);
            if (zA) {
                a();
            }
            return zA;
        }

        @Override // com.mbridge.msdk.click.m.a
        public final void a(String str, boolean z, String str2) {
            k.a(k.this, str);
            k.this.l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                k.this.l.setSuccess(true);
                if (k.this.n != null) {
                    k.this.n.a(k.this.l);
                }
                k.c(k.this);
            }
        }

        @Override // com.mbridge.msdk.click.m.a
        public final void a(int i, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                k.this.l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                k.this.l.setContent(str3);
            }
            k.a(k.this, str);
            a();
        }
    };

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void pauseTask(boolean z) {
    }

    public k(com.mbridge.msdk.click.entity.b bVar) {
        this.b = bVar.a();
        this.c = bVar.b();
        this.d = bVar.c();
        this.e = bVar.d();
        this.f = bVar.e();
        this.g = bVar.f();
        this.h = bVar.g();
        this.i = bVar.i();
        this.j = bVar.h();
    }

    public final void a(f fVar) {
        this.m = fVar;
    }

    public final void a(j jVar) {
        this.n = jVar;
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void runTask() {
        f fVar = this.m;
        if (fVar != null) {
            fVar.a(null);
        }
        JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
        this.l = jumpLoaderResult;
        jumpLoaderResult.setUrl(this.c);
        JumpLoaderResult jumpLoaderResultA = a(this.c);
        this.l = jumpLoaderResultA;
        if (!TextUtils.isEmpty(jumpLoaderResultA.getExceptionMsg())) {
            this.l.setSuccess(true);
        }
        if (this.mState != a.b.RUNNING) {
            j jVar = this.n;
            if (jVar != null) {
                jVar.a(this.l);
                return;
            }
            return;
        }
        if (!this.l.isSuccess()) {
            j jVar2 = this.n;
            if (jVar2 != null) {
                jVar2.a(this.l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.k;
        if (aVar != null) {
            this.l.setStatusCode(aVar.f);
        }
        JumpLoaderResult jumpLoaderResult2 = this.l;
        com.mbridge.msdk.click.entity.a aVar2 = this.k;
        String str = this.d;
        String str2 = this.e;
        Context context = this.b;
        m.a aVar3 = this.o;
        j jVar3 = this.n;
        Semaphore semaphore = this.f2534a;
        if (!ah.a.b(jumpLoaderResult2.getUrl()) && 200 == aVar2.f && !TextUtils.isEmpty(jumpLoaderResult2.getContent()) && !jumpLoaderResult2.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
            jumpLoaderResult2.setType(2);
            if (!TextUtils.isEmpty(jumpLoaderResult2.getContent())) {
                new m().a(str, str2, context, jumpLoaderResult2.getUrl(), jumpLoaderResult2.getContent(), aVar3);
            } else {
                try {
                    new m().a(str, str2, context, jumpLoaderResult2.getUrl(), aVar3);
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("TAG", "webview spider start error");
                    }
                }
            }
            semaphore.acquireUninterruptibly();
            return;
        }
        if (aVar2 != null) {
            jumpLoaderResult2.setType(1);
            jumpLoaderResult2.setExceptionMsg(aVar2.h);
            jumpLoaderResult2.setStatusCode(aVar2.f);
            jumpLoaderResult2.setHeader(aVar2.a());
            jumpLoaderResult2.setContent(aVar2.g);
        }
        String url = jumpLoaderResult2.getUrl();
        if (ah.a.b(url)) {
            jumpLoaderResult2.setCode(1);
            jumpLoaderResult2.setUrl(url);
            jumpLoaderResult2.setjumpDone(true);
        } else {
            jumpLoaderResult2.setCode(2);
            jumpLoaderResult2.setUrl(url);
        }
        if (jVar3 != null) {
            jVar3.a(jumpLoaderResult2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170 A[LOOP:0: B:16:0x003c->B:66:0x0170, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0178 A[EDGE_INSN: B:73:0x0178->B:67:0x0178 BREAK  A[LOOP:0: B:16:0x003c->B:66:0x0170], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.k.a(java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    private String b(String str) {
        if (this.j) {
            String strA = com.mbridge.msdk.c.g.a(this.b, str);
            if (!TextUtils.isEmpty(strA)) {
                str = str + strA;
            }
        }
        com.mbridge.msdk.f.b.a();
        return str;
    }

    static /* synthetic */ boolean a(k kVar, String str) {
        CampaignEx campaignEx = kVar.f;
        JumpLoaderResult jumpLoaderResult = kVar.l;
        if (ah.a.b(jumpLoaderResult.getUrl())) {
            jumpLoaderResult.setCode(1);
            jumpLoaderResult.setUrl(str);
            jumpLoaderResult.setjumpDone(true);
            return true;
        }
        jumpLoaderResult.setCode(2);
        jumpLoaderResult.setUrl(str);
        return false;
    }

    static /* synthetic */ void c(k kVar) {
        kVar.f2534a.release();
    }
}
