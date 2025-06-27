package com.mbridge.msdk.newreward.a.b;

import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.io.IOException;
import java.util.Map;

/* compiled from: ReqCampaignService.java */
/* loaded from: classes4.dex */
public final class c implements com.mbridge.msdk.newreward.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.a.e f3259a;

    public c(com.mbridge.msdk.newreward.a.e eVar) {
        this.f3259a = eVar;
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        int iD;
        if (obj == null) {
            throw new IOException("ReqCampaignService doReq: params is null");
        }
        try {
            long jG = this.f3259a.g();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jG <= 0) {
                this.f3259a.b(jElapsedRealtime);
                jG = jElapsedRealtime;
            }
            com.mbridge.msdk.newreward.function.g.d dVar = (com.mbridge.msdk.newreward.function.g.d) obj;
            Map<String, String> mapF = dVar.f();
            com.mbridge.msdk.newreward.function.d.b.h hVar = new com.mbridge.msdk.newreward.function.d.b.h(dVar.b(), dVar.c(), dVar.d(), Math.max(this.f3259a.I() - (jElapsedRealtime - jG), 0L), dVar.e());
            hVar.a(mapF);
            hVar.b(this.f3259a.z());
            hVar.a((com.mbridge.msdk.newreward.function.d.b.c) new C0281c(bVar));
            byte[] bArrO = hVar.o();
            int length = bArrO != null ? bArrO.length : 0;
            hVar.a(com.mbridge.msdk.foundation.same.net.h.e.h, String.valueOf(length));
            if (bArrO != null && (iD = com.mbridge.msdk.foundation.same.net.g.d.f().d()) > 0 && length > iD) {
                hVar.a(1);
                hVar.b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            }
            com.mbridge.msdk.newreward.function.d.b.f.a().b().a(hVar);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /* compiled from: ReqCampaignService.java */
    /* renamed from: com.mbridge.msdk.newreward.a.b.c$c, reason: collision with other inner class name */
    private static class C0281c implements com.mbridge.msdk.newreward.function.d.b.c {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f3262a;

        public C0281c(com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f3262a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar) {
            MBridgeTaskManager.commonExecute(new b(bVar, this.f3262a));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, false, 402, this.f3262a, aVar.i()));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, long j, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, false, 405, this.f3262a, aVar.i()));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, true, 401, this.f3262a, aVar.i()));
        }
    }

    /* compiled from: ReqCampaignService.java */
    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f3261a;
        private final com.mbridge.msdk.newreward.a.b.b b;

        public b(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f3261a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.newreward.function.d.a.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.b;
            if (bVar2 == null || (bVar = this.f3261a) == null) {
                return;
            }
            try {
                bVar2.a(bVar);
            } catch (Exception e) {
                ad.a("ReqCampaignService", "run: ", e);
            }
        }
    }

    /* compiled from: ReqCampaignService.java */
    private static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f3260a;
        private final com.mbridge.msdk.newreward.function.d.b.b b;
        private final boolean c;
        private final int d;
        private final com.mbridge.msdk.newreward.a.b.b e;
        private final String f;

        public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.b bVar2, boolean z, int i, com.mbridge.msdk.newreward.a.b.b bVar3, String str) {
            this.f3260a = bVar;
            this.b = bVar2;
            this.c = z;
            this.d = i;
            this.e = bVar3;
            this.f = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.newreward.a.b.b bVar = this.e;
            if (bVar == null || this.b == null) {
                return;
            }
            try {
                bVar.a(a(this.d));
            } catch (Exception e) {
                ad.a("ReqCampaignService", "run: ", e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9, types: [com.mbridge.msdk.foundation.c.b] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.mbridge.msdk.foundation.c.b a(int r11) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.a.b.c.a.a(int):com.mbridge.msdk.foundation.c.b");
        }
    }
}
