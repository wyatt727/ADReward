package com.mbridge.msdk.newreward.a.b;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: ReqRewardUnitSettingService.java */
/* loaded from: classes4.dex */
public final class l implements com.mbridge.msdk.newreward.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private String f3283a;

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        int iD;
        if (obj == null) {
            throw new IOException("ReqRewardUnitSettingService doReq: params is null");
        }
        com.mbridge.msdk.newreward.function.g.c cVar = (com.mbridge.msdk.newreward.function.g.c) obj;
        String strK = com.mbridge.msdk.foundation.controller.c.m().k();
        this.f3283a = cVar.b();
        cVar.b(com.mbridge.msdk.newreward.function.d.b.g.b);
        if (com.mbridge.msdk.videocommon.d.b.a().d(this.f3283a)) {
            return;
        }
        com.mbridge.msdk.videocommon.d.b.a().a(this.f3283a);
        try {
            com.mbridge.msdk.videocommon.d.c cVarF = com.mbridge.msdk.videocommon.d.b.a().f(strK, this.f3283a);
            cVar.b(cVarF == null ? "" : cVarF.j());
        } catch (Throwable th) {
            ad.b("ReqRewardUnitSettingService", th.getMessage());
        }
        try {
            String str = com.mbridge.msdk.foundation.same.net.g.d.f().r ? com.mbridge.msdk.foundation.same.net.g.d.f().J : com.mbridge.msdk.foundation.same.net.g.d.f().I;
            if (com.mbridge.msdk.foundation.same.net.g.d.f().r) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uri", str);
                jSONObject.put("data", cVar.d());
                com.mbridge.msdk.foundation.same.net.m.a().a(com.mbridge.msdk.foundation.same.net.g.d.f().l, com.mbridge.msdk.foundation.same.net.g.d.f().p, jSONObject.toString(), true, new b(this.f3283a, bVar));
                return;
            }
            com.mbridge.msdk.newreward.function.d.b.g gVar = new com.mbridge.msdk.newreward.function.d.b.g(str);
            gVar.a(cVar.c());
            gVar.a((com.mbridge.msdk.newreward.function.d.b.e) new b(this.f3283a, bVar));
            byte[] bArrO = gVar.o();
            int length = bArrO != null ? bArrO.length : 0;
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.foundation.same.net.h.e.h, String.valueOf(length));
            gVar.a((Map<String, String>) map);
            if (bArrO != null && (iD = com.mbridge.msdk.foundation.same.net.g.d.f().d()) > 0 && length > iD) {
                gVar.a(1);
                gVar.a("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            }
            com.mbridge.msdk.newreward.function.d.b.f.a().a(gVar);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /* compiled from: ReqRewardUnitSettingService.java */
    private static final class b implements com.mbridge.msdk.foundation.same.net.e<JSONObject>, com.mbridge.msdk.newreward.function.d.b.e {

        /* renamed from: a, reason: collision with root package name */
        private final String f3285a;
        private final com.mbridge.msdk.newreward.a.b.b b;

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onCancel() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onFinish() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onNetworking() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onPreExecute() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onProgressChange(long j, long j2) {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onRetry() {
        }

        public b(String str, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f3285a = str;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f3285a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, aVar.getMessage()), this.b));
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onSuccess(com.mbridge.msdk.foundation.same.net.k<JSONObject> kVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f3285a);
            MBridgeTaskManager.commonExecute(new c(this.f3285a, kVar.c, this.b));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(JSONObject jSONObject, p<JSONObject> pVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f3285a);
            MBridgeTaskManager.commonExecute(new c(this.f3285a, jSONObject, this.b));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(p<JSONObject> pVar, com.mbridge.msdk.newreward.function.d.b.d dVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f3285a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, dVar.a()), this.b));
        }
    }

    /* compiled from: ReqRewardUnitSettingService.java */
    private static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f3286a;
        private JSONObject b;
        private final com.mbridge.msdk.newreward.a.b.b c;

        public c(String str, JSONObject jSONObject, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f3286a = str;
            this.b = jSONObject;
            this.c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.c == null || this.b == null) {
                return;
            }
            com.mbridge.msdk.videocommon.d.c cVarC = null;
            try {
                String strK = com.mbridge.msdk.foundation.controller.c.m().k();
                if (ai.a(this.b)) {
                    JSONObject jSONObjectOptJSONObject = this.b.optJSONObject("data");
                    this.b = jSONObjectOptJSONObject;
                    if (jSONObjectOptJSONObject != null) {
                        if (jSONObjectOptJSONObject.optInt("vtag_status", 0) == 1) {
                            String strE = com.mbridge.msdk.videocommon.d.b.a().e(strK, this.f3286a);
                            if (!TextUtils.isEmpty(strE)) {
                                this.b = com.mbridge.msdk.c.h.a().a(new JSONObject(strE), this.b);
                            }
                        }
                        if (com.mbridge.msdk.videocommon.d.b.e(this.b.toString())) {
                            this.b.put("current_time", System.currentTimeMillis());
                            com.mbridge.msdk.videocommon.d.b.a().a(strK, this.f3286a, this.b.toString());
                        }
                        cVarC = com.mbridge.msdk.videocommon.d.c.c(this.b.toString());
                    }
                } else {
                    com.mbridge.msdk.videocommon.d.b.a().d(strK, this.f3286a);
                }
                this.c.a(cVarC);
            } catch (Throwable th) {
                ad.b("ReqRewardUnitSettingService", th.getMessage());
            }
        }
    }

    /* compiled from: ReqRewardUnitSettingService.java */
    private static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.c.b f3284a;
        private final com.mbridge.msdk.newreward.a.b.b b;

        public a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f3284a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.foundation.c.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.b;
            if (bVar2 == null || (bVar = this.f3284a) == null) {
                return;
            }
            bVar2.a(bVar);
        }
    }
}
