package com.bytedance.sdk.component.VwS;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.pi;
import com.json.t2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: PoolTaskStatistics.java */
/* loaded from: classes2.dex */
public class Pm {
    private static AtomicInteger Td = new AtomicInteger(0);
    public static final String[] EYQ = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] mZx = {"tt_pangle", "bd_tracker"};
    private static int Pm = 0;
    private static int Kbd = 0;

    public static void EYQ() {
        try {
            mZx();
        } catch (Throwable unused) {
        }
    }

    private static void mZx() {
        int i;
        String str;
        Td tdHX = IPb.HX();
        if (tdHX == null) {
            return;
        }
        int i2 = 1;
        int iAddAndGet = Td.addAndGet(1);
        if (IPb.Td < 0 || iAddAndGet % IPb.Td != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap map = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean zEYQ = pi.EYQ();
        int size = allStackTraces.size();
        if (size > Kbd) {
            Kbd = size;
        }
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i4 += i2;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb = new StringBuilder("\n");
            if (zEYQ) {
                sb.append("Thread Name is : " + key.getName());
                sb.append("\n");
            }
            String str2 = null;
            int length = value.length;
            int i5 = 0;
            while (i5 < length) {
                String string = value[i5].toString();
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                if (zEYQ) {
                    sb.append(string + "\n");
                }
                if (TextUtils.isEmpty(str2)) {
                    if (EYQ(string, EYQ)) {
                        str = string;
                    } else {
                        str = string;
                        if (EYQ(key.getName(), mZx)) {
                        }
                    }
                    i3++;
                    str2 = str;
                }
                i5++;
                it = it2;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            if (zEYQ) {
                if (TextUtils.isEmpty(str2)) {
                    i = 1;
                } else {
                    String str3 = str2 + t2.i.c + key.getName();
                    EYQ eyq = (EYQ) map.get(str3);
                    if (eyq != null) {
                        i = 1;
                        eyq.EYQ(eyq.EYQ() + 1);
                    } else {
                        i = 1;
                        eyq = new EYQ(str3, 1, sb.toString(), key.getName());
                    }
                    map.put(str3, eyq);
                }
                if (!TextUtils.isEmpty(sb.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i4 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb.toString());
                }
            } else {
                i = 1;
            }
            i2 = i;
            it = it3;
        }
        if (i3 > Pm) {
            Pm = i3;
        }
        if (zEYQ) {
            Log.e("PoolTaskStatistics", "SDK current threads=" + i3 + ", SDK Max threads=" + Pm + ", Application threads = " + size + ", Application max threads = " + Kbd);
            Iterator it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                Log.i("PoolTaskStatistics", ((EYQ) ((Map.Entry) it4.next()).getValue()).toString());
            }
        }
        tdHX.EYQ(new com.bytedance.sdk.component.VwS.mZx.EYQ(i3, Pm, size, Kbd));
    }

    private static boolean EYQ(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* compiled from: PoolTaskStatistics.java */
    public static class EYQ {
        public int EYQ;
        public String Pm;
        public String Td;
        public String mZx;

        public EYQ(String str, int i, String str2, String str3) {
            this.EYQ = 0;
            this.mZx = null;
            this.Td = null;
            this.Pm = null;
            this.Td = str;
            this.EYQ = i;
            this.Pm = str2;
            this.mZx = str3;
        }

        public void EYQ(int i) {
            this.EYQ = i;
        }

        public int EYQ() {
            return this.EYQ;
        }

        public String toString() {
            return "ThreadModel{times=" + this.EYQ + ", name='" + this.mZx + "', lastStackStack='" + this.Td + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
