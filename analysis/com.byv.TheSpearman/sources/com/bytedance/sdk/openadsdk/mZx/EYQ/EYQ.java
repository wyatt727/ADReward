package com.bytedance.sdk.openadsdk.mZx.EYQ;

/* compiled from: ADEventMonitor.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static final mZx EYQ = new mZx(0);
    public static final mZx mZx = new mZx(1);
    public static final mZx Td = new mZx(2);
    public static final mZx Pm = new mZx(0);
    public static final mZx Kbd = new mZx(1);
    public static final mZx IPb = new mZx(2);

    public static void EYQ(mZx mzx, boolean z, int i, long j) {
        try {
            mzx.VwS.getAndSet(true);
            if (z) {
                mzx.EYQ.incrementAndGet();
                mzx.Td.addAndGet(j);
                return;
            }
            mzx.mZx.incrementAndGet();
            Integer num = mzx.IPb.get(Integer.valueOf(i));
            if (num != null) {
                mzx.IPb.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
            } else {
                mzx.IPb.put(Integer.valueOf(i), 1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void EYQ(mZx mzx, boolean z) {
        try {
            mzx.VwS.getAndSet(true);
            if (z) {
                mzx.EYQ.incrementAndGet();
            } else {
                mzx.mZx.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    public static void EYQ(mZx mzx) {
        try {
            mzx.VwS.getAndSet(true);
            mzx.Kbd.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void EYQ() {
        try {
            mZx mzx = EYQ;
            if (mzx.VwS.get()) {
                com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", mzx.EYQ().toString());
            }
            mZx mzx2 = mZx;
            if (mzx2.VwS.get()) {
                com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_net_state", "tt_sdk_event_net_state", mzx2.EYQ().toString());
            }
            mZx mzx3 = Td;
            if (mzx3.VwS.get()) {
                com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", mzx3.EYQ().toString());
            }
            mZx mzx4 = Pm;
            if (mzx4.VwS.get()) {
                com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", mzx4.mZx().toString());
            }
            mZx mzx5 = Kbd;
            if (mzx5.VwS.get()) {
                com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_db_state", "tt_sdk_event_db_state", mzx5.mZx().toString());
            }
            mZx mzx6 = IPb;
            if (mzx6.VwS.get()) {
                com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", mzx6.mZx().toString());
            }
        } catch (Throwable unused) {
        }
    }

    public static void mZx() {
        try {
            com.bytedance.sdk.openadsdk.tp.Td.mZx("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.mZx("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_net_ad");
            com.bytedance.sdk.openadsdk.tp.Td.mZx("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.mZx("tt_sdk_event_net_state", "tt_sdk_event_net_state", ""));
            com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_net_state");
            com.bytedance.sdk.openadsdk.tp.Td.mZx("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.mZx("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_net_trail");
            com.bytedance.sdk.openadsdk.tp.Td.mZx("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.mZx("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_db_ad");
            com.bytedance.sdk.openadsdk.tp.Td.mZx("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.mZx("tt_sdk_event_db_state", "tt_sdk_event_db_state", ""));
            com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_db_state");
            com.bytedance.sdk.openadsdk.tp.Td.mZx("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.mZx("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("tt_sdk_event_db_trail");
        } catch (Throwable unused) {
        }
    }
}
