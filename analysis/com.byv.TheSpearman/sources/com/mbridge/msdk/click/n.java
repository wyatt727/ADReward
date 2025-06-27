package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import java.util.concurrent.Semaphore;

/* compiled from: WebViewSpiderLoader.java */
/* loaded from: classes4.dex */
public final class n extends e implements a.InterfaceC0268a {

    /* renamed from: a, reason: collision with root package name */
    private f f2543a;
    private JumpLoaderResult b;
    private boolean d;
    private Context e;
    private com.mbridge.msdk.foundation.same.e.b f;
    private com.mbridge.msdk.click.entity.a g;
    private boolean c = true;
    private Handler h = new Handler(Looper.getMainLooper());

    public n(Context context) {
        this.e = context;
        this.f = new com.mbridge.msdk.foundation.same.e.b(context, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, f fVar, boolean z, String str2, String str3, CampaignEx campaignEx, boolean z2, boolean z3, int i) {
        a aVar;
        this.f2543a = fVar;
        this.d = z;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.e);
        bVar.a(str);
        bVar.c(z);
        bVar.b(str2);
        bVar.c(str3);
        bVar.a(campaignEx);
        bVar.a(z2);
        bVar.b(z3);
        bVar.a(i);
        if (str.startsWith("tcp")) {
            k kVar = new k(bVar);
            kVar.a(this.f2543a);
            kVar.a(new j() { // from class: com.mbridge.msdk.click.n.1
                @Override // com.mbridge.msdk.click.j
                public final void a(JumpLoaderResult jumpLoaderResult) {
                    n.this.b = jumpLoaderResult;
                }
            });
            aVar = kVar;
        } else {
            aVar = new a(this.e, str, str2, str3, campaignEx, z2, z3, i);
        }
        this.f.a(aVar, this);
    }

    @Override // com.mbridge.msdk.click.e
    public final void a() {
        this.c = false;
    }

    @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0268a
    public final void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.c) {
            this.h.post(new Runnable() { // from class: com.mbridge.msdk.click.n.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (n.this.f2543a != null) {
                        if (n.this.b.isSuccess()) {
                            n.this.f2543a.b(n.this.b);
                        } else {
                            n.this.f2543a.a(n.this.b, n.this.b.getMsg());
                        }
                    }
                }
            });
        }
    }

    /* compiled from: WebViewSpiderLoader.java */
    private class a extends com.mbridge.msdk.foundation.same.e.a {
        private final Context c;
        private String d;
        private String e;
        private String f;
        private CampaignEx g;
        private boolean h;
        private boolean i;
        private int j;
        private final Semaphore b = new Semaphore(0);
        private m.a k = new m.a() { // from class: com.mbridge.msdk.click.n.a.1
            @Override // com.mbridge.msdk.click.m.a
            public final boolean c(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean a(String str) {
                boolean zA = a.a(a.this, str);
                if (zA) {
                    a();
                }
                return zA;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean b(String str) {
                boolean zA = a.a(a.this, str);
                if (zA) {
                    a();
                }
                return zA;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(String str, boolean z, String str2) {
                a.a(a.this, str);
                n.this.b.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(int i, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    n.this.b.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    n.this.b.setContent(str3);
                }
                a.a(a.this, str);
                a();
            }

            private void a() {
                synchronized (n.this) {
                    n.this.b.setSuccess(true);
                    a.a(a.this);
                }
            }
        };

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z) {
        }

        public a(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z, boolean z2, int i) {
            this.c = context;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = campaignEx;
            this.h = z;
            this.i = z2;
            this.j = i;
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            if (n.this.f2543a != null) {
                n.this.f2543a.a(null);
            }
            n.this.b = new JumpLoaderResult();
            n.this.b.setUrl(this.d);
            n.this.b = a(this.d, this.h, this.i, this.g, this.j);
            if (!TextUtils.isEmpty(n.this.b.getExceptionMsg())) {
                n.this.b.setSuccess(true);
            }
            if (n.this.c && n.this.b.isSuccess()) {
                if (n.this.g != null) {
                    n.this.b.setStatusCode(n.this.g.f);
                }
                CampaignEx campaignEx = this.g;
                JumpLoaderResult jumpLoaderResult = n.this.b;
                com.mbridge.msdk.click.entity.a aVar = n.this.g;
                String str = this.e;
                String str2 = this.f;
                Context context = this.c;
                m.a aVar2 = this.k;
                Semaphore semaphore = this.b;
                if (!ah.a.b(jumpLoaderResult.getUrl()) && 200 == aVar.f && !TextUtils.isEmpty(jumpLoaderResult.getContent()) && !jumpLoaderResult.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
                    jumpLoaderResult.setType(2);
                    if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                        new m().a(str, str2, context, jumpLoaderResult.getUrl(), jumpLoaderResult.getContent(), aVar2);
                    } else {
                        try {
                            new m().a(str, str2, context, jumpLoaderResult.getUrl(), aVar2);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("WebViewSpiderLoaderDiff", e.getMessage());
                            }
                        }
                    }
                    semaphore.acquireUninterruptibly();
                    return;
                }
                if (aVar != null) {
                    jumpLoaderResult.setType(1);
                    jumpLoaderResult.setExceptionMsg(aVar.h);
                    jumpLoaderResult.setStatusCode(aVar.f);
                    jumpLoaderResult.setHeader(aVar.a());
                    jumpLoaderResult.setContent(aVar.g);
                }
                o.a(jumpLoaderResult.getUrl(), campaignEx, jumpLoaderResult);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01f8 A[EDGE_INSN: B:89:0x01f8->B:81:0x01f8 BREAK  A[LOOP:0: B:21:0x0059->B:71:0x019c], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r16, boolean r17, boolean r18, com.mbridge.msdk.foundation.entity.CampaignEx r19, int r20) {
            /*
                Method dump skipped, instructions count: 505
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.n.a.a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.entity.JumpLoaderResult");
        }

        private boolean a(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        static /* synthetic */ boolean a(a aVar, String str) {
            return o.a(str, aVar.g, n.this.b);
        }

        static /* synthetic */ void a(a aVar) {
            aVar.b.release();
        }
    }
}
