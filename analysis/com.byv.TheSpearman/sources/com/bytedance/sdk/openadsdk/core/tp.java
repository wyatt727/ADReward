package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.NZ;
import com.bytedance.sdk.openadsdk.utils.FH;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IPManger.java */
/* loaded from: classes2.dex */
public class tp {
    private static final AtomicInteger EYQ = new AtomicInteger(0);
    private static final AtomicBoolean mZx = new AtomicBoolean(false);

    public static void EYQ(String str) {
        AtomicBoolean atomicBoolean = mZx;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.hu.QQ(hu.EYQ())) {
                atomicBoolean.set(false);
            } else {
                EYQ.EYQ();
                Td(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Td(final String str) {
        com.bytedance.sdk.openadsdk.utils.xt.Td(new com.bytedance.sdk.component.VwS.QQ("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.tp.1
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                final String strSOZ = com.bytedance.sdk.openadsdk.core.settings.KO.Jpu().sOZ();
                com.bytedance.sdk.openadsdk.tp.Td.EYQ(0, strSOZ);
                if (TextUtils.isEmpty(strSOZ)) {
                    com.bytedance.sdk.openadsdk.tp.Td.EYQ(-1, strSOZ, -1, "url is null");
                    return;
                }
                com.bytedance.sdk.component.IPb.mZx.Pm pmMZx = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().mZx();
                try {
                    pmMZx.EYQ(strSOZ);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.NZ.EYQ(hu.EYQ(), 0L));
                    jSONObject.put("device_id", Long.parseLong(str));
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.mZx.EYQ.Td.EYQ().mZx());
                    JSONObject jSONObjectEYQ = com.bytedance.sdk.component.utils.EYQ.EYQ(jSONObject);
                    if (tp.mZx(jSONObjectEYQ)) {
                        jSONObject = jSONObjectEYQ;
                    }
                    pmMZx.mZx("Content-Type", "application/json; charset=utf-8");
                    if (tp.mZx(jSONObject)) {
                        pmMZx.mZx("Content-Encoding", "union_sdk_encode");
                    }
                    pmMZx.mZx("User-Agent", FH.Td());
                    pmMZx.EYQ(jSONObject);
                    pmMZx.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.tp.1.1
                        @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                        public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) {
                            if (mzx.IPb()) {
                                com.bytedance.sdk.openadsdk.tp.Td.EYQ(1, strSOZ);
                            } else {
                                com.bytedance.sdk.openadsdk.tp.Td.EYQ(-1, strSOZ, mzx.EYQ(), mzx.mZx());
                                tp.Pm();
                            }
                        }

                        @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                        public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.tp.Td.EYQ(-1, strSOZ, 1, iOException.getMessage());
                            }
                            tp.Pm();
                        }
                    });
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.tp.Td.EYQ(-1, strSOZ, -2, e.getMessage());
                    com.bytedance.sdk.component.utils.pi.mZx("build ipv6 request failed:" + e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mZx(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Td() {
        EYQ.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Pm() {
        if (EYQ.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.xt.EYQ().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tp.2
                @Override // java.lang.Runnable
                public void run() {
                    tp.Td(MxO.EYQ(hu.EYQ()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* compiled from: IPManger.java */
    private static class EYQ implements NZ.EYQ {
        private static final AtomicBoolean EYQ = new AtomicBoolean(false);
        private static volatile long mZx = -1;

        private EYQ() {
        }

        public static void EYQ() {
            if (EYQ.compareAndSet(false, true)) {
                mZx = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.NZ.EYQ(new EYQ(), hu.EYQ());
            }
        }

        public void mZx() {
            com.bytedance.sdk.component.utils.NZ.EYQ(this);
        }

        @Override // com.bytedance.sdk.component.utils.NZ.EYQ
        public void EYQ(Context context, Intent intent, boolean z, int i) {
            if (System.currentTimeMillis() - mZx >= 2000 && i != 0) {
                tp.Td();
                tp.Td(MxO.EYQ(hu.EYQ()));
                mZx();
            }
        }
    }
}
