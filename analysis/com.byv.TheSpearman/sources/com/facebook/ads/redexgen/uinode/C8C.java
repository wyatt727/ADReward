package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8C {
    public static AtomicInteger A00;
    public static byte[] A01;
    public static String[] A02 = {"TEIgz1GSUxi0w6HxI", "WqDufwBE7AlvD41n6qdN4YbCXU2LtDad", "95AkSvnB6didgYS0", "q9Pm9O4XheyxpjJIaV85netzFUNpUTJ1", "laKi0sQOm1cRNFPmXQKezZzTFfBBOlTJ", "R9By8R7rHrFXxi8d0eZrOpOQKJFwFXXr", "DNKj97yZe49oXEmfRz7aINNiwqbkjDQZ", "HsAQREGxpVIGFVt11mTJ2r8ajNtMZb1h"};
    public static final Object A03;
    public static final String A04;
    public static final Map<String, Integer> A05;
    public static final Set<String> A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C8E A01(String str, C05357f c05357f, Map<String, String> map) {
        C8E c8e = null;
        try {
            c8e = new C8E(c05357f.A08().A01(), c05357f.A08().A02(), new C05497y(str, map, true).A02());
            A0C(c8e, c05357f);
            return c8e;
        } catch (Exception unused) {
            return c8e;
        }
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JSONArray A04(C05357f c05357f, int i) {
        AnonymousClass89 anonymousClass89A07;
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                try {
                    if (new File(c05357f.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c05357f)).exists()) {
                        fileInputStreamOpenFileInput = c05357f.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c05357f));
                        inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null || i == 0) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(line);
                            if (!jSONObject.has(A02(260, 7, 27))) {
                                jSONObject.put(A02(260, 7, 27), String.valueOf(0));
                            }
                            String string = jSONObject.getString(A02(343, 2, 126));
                            if (!A06.contains(string)) {
                                int i2 = jSONObject.getInt(A02(260, 7, 27));
                                Map<String, Integer> map = A05;
                                if (map.containsKey(string)) {
                                    jSONObject.put(A02(260, 7, 27), String.valueOf(map.get(string)));
                                } else {
                                    A0E(string, i2);
                                }
                                jSONArray.put(jSONObject);
                                if (i > 0) {
                                    i--;
                                }
                            }
                        }
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            e = e;
                            anonymousClass89A07 = c05357f.A07();
                            anonymousClass89A07.A3c(e);
                            return jSONArray;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                } catch (IOException | JSONException e2) {
                    c05357f.A07().A3c(e2);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            e = e3;
                            anonymousClass89A07 = c05357f.A07();
                            anonymousClass89A07.A3c(e);
                            return jSONArray;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
            } finally {
                if (bufferedReader != null) {
                    try {
                    } catch (IOException e4) {
                    }
                }
            }
        }
        return jSONArray;
    }

    public static void A06() {
        A01 = new byte[]{7, 95, 83, 55, 1, 28, 3, 48, 28, 6, 29, 7, 22, 1, 73, 83, Utf8.REPLACEMENT_BYTE, 29, 18, 91, 8, 92, 24, 25, 16, 25, 8, 25, 92, 24, 25, 30, 9, 27, 92, 25, 10, 25, 18, 8, 15, 92, 26, 21, 16, 25, 82, 14, 44, 35, 106, 57, 109, 41, 40, 33, 40, 57, 40, 109, 43, 36, 33, 40, 108, 119, 118, 113, 102, 116, 108, 99, 97, 118, 117, 42, 25, 10, 1, 27, 44, 0, 26, 1, 27, 41, 45, 46, 26, 11, 6, 10, 1, 12, 10, 33, 10, 27, 24, 0, 29, 4, 31, 58, Base64.padSymbol, 40, 42, 111, 43, 42, 45, 58, 40, 111, 42, 57, 42, 33, 59, 60, 111, 41, 38, 35, 42, 97, 69, 9, 38, 35, 42, 111, 60, 38, 53, 42, 117, 111, 111, 87, 85, 76, 76, 89, 88, 28, 89, 74, 89, 82, 72, 79, 18, 40, 16, 18, 11, 11, 18, 21, 28, 91, 24, 20, 9, 9, 14, 11, 15, 30, 31, 91, 31, 30, 25, 14, 28, 91, 30, 13, 30, 21, 15, 91, 23, 18, 21, 30, 85, 98, 68, 79, 95, 88, 81, 22, 66, 89, 22, 67, 70, 82, 87, 66, 83, 22, 67, 88, 68, 83, 85, 89, 68, 82, 83, 82, 22, 82, 83, 84, 67, 81, 122, 89, 81, 115, 64, 83, 88, 66, 24, 22, 87, 82, 82, 95, 88, 81, 22, 66, 89, 22, 121, 88, 81, 89, 95, 88, 81, 115, 64, 83, 88, 66, 24, 58, 17, 0, 8, 21, 6, 19, 19, 2, 10, 23, 19, 88, 93, 72, 93, Byte.MAX_VALUE, 126, 68, 119, 116, 124, 124, 114, 117, 124, 43, 42, 45, 58, 40, 35, 32, 40, 60, 91, 84, 83, 84, 78, 85, 88, 89, 29, 88, 75, 88, 83, 73, 29, 78, 85, 82, 72, 81, 89, 29, 83, 82, 73, 29, 95, 88, 29, 72, 77, 89, 92, 73, 88, 89, 29, 73, 82, 29, 114, 83, 90, 82, 84, 83, 90, 120, 75, 88, 83, 73, 19, 107, 102, 126, 104, 126, 126, 100, 98, 99, 82, 100, 105, 72, 94, 72, 72, 82, 84, 85, 100, 79, 82, 86, 94, 105, 113, 115, 106, 106, Byte.MAX_VALUE, 126, 95, 108, Byte.MAX_VALUE, 116, 110, 105, 58, 39, 58, 49, 55, 32, 54, 59, 50, 39, 75, 77, 90, 76, 65, 72, 93, 103, 91, 87, 92, 93, 119, 106, 110, 102, 85, 88, 81, 68};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0G(C05357f c05357f) {
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            int i = 0;
            FileInputStream fileInputStreamOpenFileInput = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStreamOpenFileOutput = null;
            try {
                try {
                    if (new File(c05357f.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c05357f)).exists()) {
                        fileInputStreamOpenFileInput = c05357f.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c05357f));
                        inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(line);
                            String string = jSONObject.getString(A02(343, 2, 126));
                            if (!A06.contains(string)) {
                                Map<String, Integer> map = A05;
                                if (map.containsKey(string)) {
                                    Integer num = map.get(string);
                                    Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
                                    int iA02 = Ij.A02(c05357f);
                                    if (iA02 <= -1 || numValueOf.intValue() <= iA02 - 1) {
                                        jSONObject.put(A02(260, 7, 27), String.valueOf(numValueOf));
                                        jSONArray.put(jSONObject);
                                    } else {
                                        A0D(string);
                                        i++;
                                    }
                                } else {
                                    jSONArray.put(jSONObject);
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            sb.append(jSONArray.getJSONObject(i2).toString()).append('\n');
                        }
                        fileOutputStreamOpenFileOutput = c05357f.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c05357f), 0);
                        fileOutputStreamOpenFileOutput.write(sb.toString().getBytes());
                    }
                    A09(c05357f, A00(c05357f));
                    if (i > 0) {
                        c05357f.A07().A9a(A02(271, 10, 103), C8A.A2W, new C8B(A02(138, 15, 64), A02(367, 16, 102) + i));
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            c05357f.A07().A3c(e);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    A06.clear();
                    A05.clear();
                    return true;
                } finally {
                    if (bufferedReader != null) {
                        try {
                        } catch (IOException e2) {
                        }
                    }
                }
            } catch (IOException | JSONException e3) {
                c05357f.A07().A3c(e3);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        c05357f.A07().A3c(e4);
                        A06.clear();
                        A05.clear();
                        return false;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    fileOutputStreamOpenFileOutput.close();
                }
                A06.clear();
                A05.clear();
                return false;
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fa A[Catch: IOException -> 0x0208, all -> 0x0252, TryCatch #5 {IOException -> 0x0208, blocks: (B:94:0x01eb, B:96:0x01f0, B:98:0x01f5, B:100:0x01fa, B:102:0x01ff, B:104:0x0204), top: B:137:0x01eb, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ff A[Catch: IOException -> 0x0208, all -> 0x0252, TryCatch #5 {IOException -> 0x0208, blocks: (B:94:0x01eb, B:96:0x01f0, B:98:0x01f5, B:100:0x01fa, B:102:0x01ff, B:104:0x0204), top: B:137:0x01eb, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0204 A[Catch: IOException -> 0x0208, all -> 0x0252, TRY_LEAVE, TryCatch #5 {IOException -> 0x0208, blocks: (B:94:0x01eb, B:96:0x01f0, B:98:0x01f5, B:100:0x01fa, B:102:0x01ff, B:104:0x0204), top: B:137:0x01eb, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0227 A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:115:0x0222, B:117:0x0227, B:119:0x022c, B:121:0x0231, B:123:0x0236, B:125:0x023b), top: B:139:0x0222, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:115:0x0222, B:117:0x0227, B:119:0x022c, B:121:0x0231, B:123:0x0236, B:125:0x023b), top: B:139:0x0222, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0231 A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:115:0x0222, B:117:0x0227, B:119:0x022c, B:121:0x0231, B:123:0x0236, B:125:0x023b), top: B:139:0x0222, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0236 A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:115:0x0222, B:117:0x0227, B:119:0x022c, B:121:0x0231, B:123:0x0236, B:125:0x023b), top: B:139:0x0222, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023b A[Catch: IOException -> 0x023f, all -> 0x0252, TRY_LEAVE, TryCatch #6 {IOException -> 0x023f, blocks: (B:115:0x0222, B:117:0x0227, B:119:0x022c, B:121:0x0231, B:123:0x0236, B:125:0x023b), top: B:139:0x0222, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f0 A[Catch: IOException -> 0x0208, all -> 0x0252, TryCatch #5 {IOException -> 0x0208, blocks: (B:94:0x01eb, B:96:0x01f0, B:98:0x01f5, B:100:0x01fa, B:102:0x01ff, B:104:0x0204), top: B:137:0x01eb, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f5 A[Catch: IOException -> 0x0208, all -> 0x0252, TryCatch #5 {IOException -> 0x0208, blocks: (B:94:0x01eb, B:96:0x01f0, B:98:0x01f5, B:100:0x01fa, B:102:0x01ff, B:104:0x0204), top: B:137:0x01eb, outer: #14 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0H(com.facebook.ads.redexgen.uinode.C05357f r17) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C8C.A0H(com.facebook.ads.redexgen.X.7f):boolean");
    }

    static {
        A06();
        A04 = C8C.class.getName();
        A03 = new Object();
        A06 = Collections.synchronizedSet(new HashSet());
        A05 = Collections.synchronizedMap(new HashMap());
        A00 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) - A06.size();
    }

    public static JSONArray A03(C05357f c05357f) {
        return A04(c05357f, -1);
    }

    public static JSONObject A05(C8E c8e) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 126), UUID.randomUUID().toString());
        jSONObject.put(A02(406, 4, 93), c8e.A03());
        jSONObject.put(A02(402, 4, 127), C0865Lf.A02(c8e.A01()));
        jSONObject.put(A02(355, 12, 71), C0865Lf.A02(c8e.A00()));
        jSONObject.put(A02(345, 10, 113), c8e.A02());
        jSONObject.put(A02(267, 4, 64), c8e.A04() != null ? new JSONObject(c8e.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 27), String.valueOf(0));
        return jSONObject;
    }

    public static void A07(Context context) {
        synchronized (A03) {
            File file = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), context));
            if (file.exists()) {
                file.delete();
            }
            A09(context, 0);
            A06.clear();
            A05.clear();
        }
    }

    public static void A08(Context context) {
        A09(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) + 1);
    }

    public static void A09(Context context, int i) {
        int i2 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (i >= 0) {
            i2 = i;
        }
        editorEdit.putInt(A02(75, 10, 19), i2).apply();
    }

    public static void A0A(C05357f c05357f, String str) {
        File file = new File(c05357f.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            c05357f.A07().A3c(new RuntimeException(A02(47, 18, 49)));
        }
    }

    public static void A0B(C1206Ym c1206Ym, String str) {
        Map<String, Integer> map = A05;
        Integer num = map.get(str);
        if (num == null) {
            if (c1206Ym.A04().A8z()) {
                Log.e(A04, A02(189, 66, 74));
            }
            num = 0;
        } else {
            map.remove(str);
        }
        map.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void A0C(C8E c8e, C05357f c05357f) {
        if (c8e != null && c05357f != null) {
            synchronized (A03) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c05357f);
                    File file = new File(c05357f.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int debugLogFileSizeLimit = Ij.A07(c05357f);
                        long length = file.length();
                        if (debugLogFileSizeLimit > 0 && length > debugLogFileSizeLimit) {
                            boolean zDelete = file.delete();
                            A09(c05357f, 0);
                            A06.clear();
                            A05.clear();
                            if (zDelete) {
                                Map<String, String> mapA4n = c05357f.A03().A4n();
                                mapA4n.put(A02(383, 7, 62), A02(271, 10, 103));
                                mapA4n.put(A02(390, 12, 68), String.valueOf(IronSourceConstants.IS_CAP_SESSION));
                                A01(A02(102, 36, 51) + length + A02(1, 15, 15) + A00.getAndIncrement(), c05357f, mapA4n);
                                return;
                            }
                            String processSpecificName2 = A02(85, 17, 19);
                            Log.e(processSpecificName2, A02(16, 31, 0));
                        }
                    }
                    JSONObject jSONObjectA05 = A05(c8e);
                    FileOutputStream outputStream = c05357f.openFileOutput(processSpecificName, 32768);
                    outputStream.write((jSONObjectA05.toString() + A02(0, 1, 113)).getBytes());
                    outputStream.close();
                    A08(c05357f);
                } catch (Exception e) {
                    c05357f.A07().A3c(e);
                }
            }
        }
    }

    public static void A0D(String str) {
        A05.remove(str);
        A06.add(str);
    }

    public static void A0E(String str, int i) {
        if (!A06.contains(str)) {
            Map<String, Integer> map = A05;
            boolean zContainsKey = map.containsKey(str);
            if (A02[7].charAt(23) == 'F') {
                throw new RuntimeException();
            }
            A02[6] = "rEqe91lv7lznGuMpeMm8YlOivWfc8wjs";
            if (zContainsKey) {
                map.remove(str);
            }
            map.put(str, Integer.valueOf(i));
            return;
        }
        throw new RuntimeException(A02(290, 53, 65));
    }

    public static boolean A0F(C05357f c05357f) {
        if (Ij.A0O(c05357f)) {
            return A0H(c05357f);
        }
        boolean zA0G = A0G(c05357f);
        String[] strArr = A02;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "3ABJ1YchwKShiC4YrWnTlA0erUDCQvCN";
        strArr2[1] = "wuaZskSkctYpKQ1vHIoiu3NDqUJM9HRQ";
        return zA0G;
    }

    public static boolean A0I(String str) {
        return A06.contains(str) || A05.containsKey(str);
    }
}
