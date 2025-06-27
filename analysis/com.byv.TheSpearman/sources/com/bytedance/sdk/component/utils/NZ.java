package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTNetworkUtils.java */
/* loaded from: classes2.dex */
public class NZ {
    private static final Object EYQ = new Object();
    private static final Map<EYQ, Object> mZx = new ConcurrentHashMap();
    private static AtomicBoolean Td = new AtomicBoolean(false);
    private static volatile int Pm = -1;
    private static volatile long Kbd = 0;
    private static volatile int IPb = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
    private static UB VwS = null;
    private static final AtomicBoolean QQ = new AtomicBoolean(false);

    /* compiled from: TTNetworkUtils.java */
    public interface EYQ {
        void EYQ(Context context, Intent intent, boolean z, int i);
    }

    public static int EYQ(Context context, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Kbd + j <= jElapsedRealtime) {
            return mZx(context);
        }
        if (Pm == -1) {
            return mZx(context);
        }
        if (jElapsedRealtime - Kbd >= IPb) {
            mZx(context, (Intent) null, false, false);
        }
        return Pm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(final Context context, final Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            Pm = 0;
        } else if (QQ.compareAndSet(false, true)) {
            com.bytedance.sdk.component.VwS.IPb.mZx(new com.bytedance.sdk.component.VwS.QQ("getNetworkType") { // from class: com.bytedance.sdk.component.utils.NZ.1
                @Override // java.lang.Runnable
                public void run() {
                    int unused = NZ.Pm = z2 ? 0 : NZ.mZx(context);
                    NZ.QQ.set(false);
                    if (z) {
                        NZ.mZx(context, intent, NZ.Pm, z2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(Context context, Intent intent, int i, boolean z) {
        Map<EYQ, Object> map = mZx;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (EYQ eyq : map.keySet()) {
            if (eyq != null) {
                eyq.EYQ(context, intent, !z, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mZx(Context context) {
        Pm = Td(context);
        Kbd = SystemClock.elapsedRealtime();
        return Pm;
    }

    private static int Td(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        UB ub = VwS;
                        return (ub == null || !ub.EYQ(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static void EYQ(EYQ eyq, Context context) {
        if (eyq == null) {
            return;
        }
        if (!Td.get()) {
            try {
                context.registerReceiver(new mZx(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                Td.set(true);
            } catch (Throwable unused) {
            }
        }
        mZx.put(eyq, EYQ);
    }

    public static void EYQ(EYQ eyq) {
        if (eyq == null) {
            return;
        }
        mZx.remove(eyq);
    }

    /* compiled from: TTNetworkUtils.java */
    private static class mZx extends BroadcastReceiver {
        private mZx() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (NZ.mZx != null && NZ.mZx.size() > 0) {
                z = true;
            }
            NZ.mZx(context, intent, z, booleanExtra);
        }
    }
}
