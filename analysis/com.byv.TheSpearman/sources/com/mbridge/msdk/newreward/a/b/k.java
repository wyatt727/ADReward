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

/* compiled from: ReqRewardSettingService.java */
/* loaded from: classes4.dex */
public final class k implements com.mbridge.msdk.newreward.a.b.a {
    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        int iD;
        if (obj == null) {
            throw new IOException("ReqRewardSettingService doReq: params is null");
        }
        com.mbridge.msdk.newreward.function.g.c cVar = (com.mbridge.msdk.newreward.function.g.c) obj;
        cVar.b(com.mbridge.msdk.newreward.function.d.b.g.f3350a);
        if (com.mbridge.msdk.videocommon.d.b.a().d()) {
            return;
        }
        com.mbridge.msdk.videocommon.d.b.a().a(true);
        try {
            com.mbridge.msdk.videocommon.d.a aVarE = com.mbridge.msdk.videocommon.d.b.a().e();
            cVar.b(aVarE == null ? "" : aVarE.a());
        } catch (Throwable th) {
            ad.b("ReqRewardSettingService", th.getMessage());
        }
        try {
            String str = com.mbridge.msdk.foundation.same.net.g.d.f().r ? com.mbridge.msdk.foundation.same.net.g.d.f().J : com.mbridge.msdk.foundation.same.net.g.d.f().I;
            if (com.mbridge.msdk.foundation.same.net.g.d.f().r) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uri", str);
                jSONObject.put("data", cVar.d());
                com.mbridge.msdk.foundation.same.net.m.a().a(com.mbridge.msdk.foundation.same.net.g.d.f().l, com.mbridge.msdk.foundation.same.net.g.d.f().p, jSONObject.toString(), true, new c(bVar));
                return;
            }
            com.mbridge.msdk.newreward.function.d.b.g gVar = new com.mbridge.msdk.newreward.function.d.b.g(str);
            gVar.a(cVar.c());
            gVar.a((com.mbridge.msdk.newreward.function.d.b.e) new c(bVar));
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

    /* compiled from: ReqRewardSettingService.java */
    private static final class c implements com.mbridge.msdk.foundation.same.net.e<JSONObject>, com.mbridge.msdk.newreward.function.d.b.e {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f3282a;

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

        public c(com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f3282a = bVar;
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, aVar.getMessage()), this.f3282a));
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onSuccess(com.mbridge.msdk.foundation.same.net.k<JSONObject> kVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new b(kVar.c, this.f3282a));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(JSONObject jSONObject, p<JSONObject> pVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new b(jSONObject, this.f3282a));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(p<JSONObject> pVar, com.mbridge.msdk.newreward.function.d.b.d dVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, dVar.a()), this.f3282a));
        }
    }

    /* compiled from: ReqRewardSettingService.java */
    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f3281a;
        private final com.mbridge.msdk.newreward.a.b.b b;

        public b(JSONObject jSONObject, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f3281a = jSONObject;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b == null || this.f3281a == null) {
                return;
            }
            com.mbridge.msdk.videocommon.d.a aVarA = null;
            try {
                String strK = com.mbridge.msdk.foundation.controller.c.m().k();
                if (ai.a(this.f3281a)) {
                    JSONObject jSONObjectOptJSONObject = this.f3281a.optJSONObject("data");
                    this.f3281a = jSONObjectOptJSONObject;
                    if (jSONObjectOptJSONObject != null) {
                        if (jSONObjectOptJSONObject.optInt("vtag_status", 0) == 1) {
                            String strG = com.mbridge.msdk.videocommon.d.b.a().g(strK);
                            if (!TextUtils.isEmpty(strG)) {
                                this.f3281a = com.mbridge.msdk.c.h.a().a(new JSONObject(strG), this.f3281a);
                            }
                        }
                        this.f3281a.put("current_time", System.currentTimeMillis());
                        com.mbridge.msdk.videocommon.d.b.a().c(strK, this.f3281a.toString());
                        aVarA = com.mbridge.msdk.videocommon.d.a.a(this.f3281a.toString());
                    }
                } else {
                    com.mbridge.msdk.videocommon.d.b.a().f(strK);
                }
                this.b.a(aVarA);
            } catch (Throwable th) {
                ad.b("ReqRewardSettingService", th.getMessage());
            }
        }
    }

    /* compiled from: ReqRewardSettingService.java */
    private static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.c.b f3280a;
        private final com.mbridge.msdk.newreward.a.b.b b;

        public a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f3280a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.foundation.c.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.b;
            if (bVar2 == null || (bVar = this.f3280a) == null) {
                return;
            }
            bVar2.a(bVar);
        }
    }
}
