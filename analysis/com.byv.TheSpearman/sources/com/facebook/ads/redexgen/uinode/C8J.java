package com.facebook.ads.redexgen.uinode;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.8J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8J {
    public static Sensor A00;
    public static Sensor A01;
    public static SensorEventListener A02;
    public static SensorEventListener A03;
    public static SensorManager A04;
    public static Map<String, String> A05;
    public static byte[] A06;
    public static String[] A07 = {"b6J5OF3acjfDP5XdyeFWlX714gZNNS0V", "bvdY52fd394YA8DHF2AacKmBhwZUhhl0", "30Yy9fi50QmMl9Boio33GGJ", "ecsdrzPzIBVEjJjtjF1fiRSY0Jbv5jtj", "QghajC4mni0N20aoGlTyG9Kdg8iFV0DW", "aGbfNp7N5f3KMLUY6R1I1ytOxUov95yg", "", ""};
    public static String[] A08;
    public static final AtomicReference<String> A09;
    public static volatile float[] A0A;
    public static volatile float[] A0B;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-97, -12, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, -67, -65, -48, -59, -46, -59, -48, -43, 41, 54, 44, 58, 55, 49, 44, -10, 49, 54, 60, 45, 54, 60, -10, 41, 43, 60, 49, 55, 54, -10, 10, 9, 28, 28, 13, 26, 33, 39, 11, 16, 9, 22, 15, 13, 12, 23, 44, 23, 31, 34, 23, 24, 34, 27, 21, 35, 27, 35, 37, 40, 47, 33, 32, 51, 51, 36, 49, 56, -4, 1, -6, 11, 0, 2, 7, 0, 35, 47, 34, 34, 28, 48, 45, 30, 32, 34, -18, -20, -11, -20, -7, -16, -22, 19, 12, 29, 12, 19, -60, -63, -58, -77, -58, -69, -63, -64, -79, -60, -76, -78, -67, -74, 4, -10, -1, 4, 0, 3, 8, 9, -10, 9, 10, 8, 45, 40, 45, 26, 37, 24, 38, 30, 38, 40, 43, 50, 16, 17, -49};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A08(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String strValueOf = String.valueOf(statFs.getAvailableBlocks() * statFs.getBlockSize());
        A09.set(strValueOf);
        A05.put(A01(92, 10, 111), strValueOf);
    }

    static {
        A03();
        A04 = null;
        A00 = null;
        A01 = null;
        A05 = new ConcurrentHashMap();
        A08 = new String[]{A01(Opcodes.DCMPG, 1, 74), A01(153, 1, 74), A01(154, 1, 7)};
        A09 = new AtomicReference<>();
    }

    public static String A00() {
        return A09.get();
    }

    public static Map<String, String> A02() {
        HashMap map = new HashMap();
        Map<String, String> currentAnalogInfo = A05;
        map.putAll(currentAnalogInfo);
        A0C(map);
        return map;
    }

    public static synchronized void A06() {
        SensorManager sensorManager = A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(A02);
        }
        A02 = null;
    }

    public static synchronized void A07() {
        SensorManager sensorManager = A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(A03);
        }
        A03 = null;
    }

    public static void A09(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(A01(16, 8, 14))).getMemoryInfo(memoryInfo);
        A05.put(A01(61, 16, 104), String.valueOf(memoryInfo.availMem));
        if (Build.VERSION.SDK_INT >= 16) {
            A05.put(A01(140, 12, 107), String.valueOf(memoryInfo.totalMem));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context, com.facebook.ads.redexgen.X.7f] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.facebook.ads.redexgen.X.7f] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Intent] */
    public static void A0A(C05357f c05357f) {
        try {
            c05357f = AbstractC0857Kx.A00(c05357f, null, new IntentFilter(A01(24, 37, 122)));
            if (c05357f == 0) {
                return;
            }
            int intExtra = c05357f.getIntExtra(A01(109, 5, 89), -1);
            int scale = c05357f.getIntExtra(A01(123, 5, 3), -1);
            int level = c05357f.getIntExtra(A01(134, 6, 71), -1);
            boolean z = level == 2 || level == 5;
            float f = 0.0f;
            String[] strArr = A07;
            if (strArr[0].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "GHijperGL49tDJqi3Nx4WNVKDHMQfhGE";
            strArr2[3] = "9fIc9CBmAIH6SFr3nVJHHtzAM5Z6ICxj";
            if (scale > 0) {
                f = (intExtra / scale) * 100.0f;
            }
            A05.put(A01(77, 7, 113), String.valueOf(f));
            A05.put(A01(84, 8, 75), z ? A01(1, 1, 117) : A01(0, 1, 33));
        } catch (IllegalArgumentException e) {
            c05357f.A07().A9a(A01(102, 7, 57), C8A.A1T, new C8B(e));
        }
    }

    public static synchronized void A0B(C05357f c05357f) {
        A09(c05357f);
        A0A(c05357f);
        if (A04 == null) {
            SensorManager sensorManager = (SensorManager) c05357f.getSystemService(A01(128, 6, 67));
            A04 = sensorManager;
            if (sensorManager == null) {
                return;
            }
        }
        if (A00 == null) {
            A00 = A04.getDefaultSensor(1);
        }
        if (A01 == null) {
            A01 = A04.getDefaultSensor(4);
        }
        C8G c8g = null;
        if (A02 == null) {
            C8H c8h = new C8H();
            A02 = c8h;
            Sensor sensor = A00;
            if (sensor != null) {
                A04.registerListener(c8h, sensor, 3);
            }
        }
        if (A03 == null) {
            C8I c8i = new C8I();
            A03 = c8i;
            Sensor sensor2 = A01;
            if (sensor2 != null) {
                A04.registerListener(c8i, sensor2, 3);
            }
        }
    }

    public static void A0C(Map<String, String> map) {
        float[] fArr = A0A;
        float[] fArr2 = A0B;
        if (fArr != null) {
            int iMin = Math.min(A08.length, fArr.length);
            for (int i = 0; i < iMin; i++) {
                map.put(A01(2, 14, 65) + A08[i], String.valueOf(fArr[i]));
            }
        }
        if (fArr2 != null) {
            int iMin2 = Math.min(A08.length, fArr2.length);
            for (int i2 = 0; i2 < iMin2; i2++) {
                map.put(A01(114, 9, 4) + A08[i2], String.valueOf(fArr2[i2]));
            }
        }
    }
}
