package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* compiled from: PreHandlerLoadReceiver.java */
/* loaded from: classes4.dex */
public final class e implements com.mbridge.msdk.newreward.function.c.b.a {

    /* renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.e f3315a;
    com.mbridge.msdk.newreward.function.c.c b;

    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) throws MBridgeError {
        com.mbridge.msdk.newreward.function.f.e eVarR;
        com.mbridge.msdk.videocommon.d.c cVarB;
        Queue<Integer> queueB;
        Integer numPoll;
        try {
            Map map = (Map) bVar.b();
            this.f3315a = (com.mbridge.msdk.newreward.a.e) map.get("adapter_model");
            this.b = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            try {
                if (com.mbridge.msdk.foundation.same.a.d.k != null && com.mbridge.msdk.foundation.same.a.d.k.size() > 0) {
                    com.mbridge.msdk.foundation.same.a.d.k.clear();
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(this.f3315a.A());
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.newreward.a.e eVar = this.f3315a;
                if (eVar.u() == 2 && TextUtils.isEmpty(eVar.C())) {
                    com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880035, "errorCode: 3507 errorMessage: data load failed, errorMsg is bidToken null");
                    throw new MBridgeError(bVarB.a(), bVarB.b());
                }
                if (MBridgeSDKImpl.map != null) {
                    if (((MBridgeDailyPlayModel) this.b.a(new HashMap(), com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).isOverDailyCap()) {
                        bVar2.a(new com.mbridge.msdk.foundation.c.b(880019));
                        return;
                    }
                    com.mbridge.msdk.newreward.a.e eVar2 = this.f3315a;
                    int iIntValue = 25000;
                    if (eVar2 != null && (eVarR = eVar2.r()) != null && (cVarB = eVarR.b()) != null && (queueB = cVarB.B()) != null && queueB.size() != 0 && (numPoll = queueB.poll()) != null) {
                        iIntValue = numPoll.intValue() * 1000;
                    }
                    eVar2.e(iIntValue);
                    bVar2.a((Object) null);
                    return;
                }
                com.mbridge.msdk.foundation.c.b bVarB2 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is not init sdk");
                throw new MBridgeError(bVarB2.a(), bVarB2.b());
            } catch (MBridgeError e3) {
                bVar2.a(new com.mbridge.msdk.foundation.c.b(e3.getErrorCode(), e3.getErrorMessage()));
            }
        } catch (Exception e4) {
            bVar2.a(new com.mbridge.msdk.foundation.c.b(880020, e4.getMessage()));
        }
    }
}
