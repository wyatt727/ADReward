package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SameFileTool.java */
/* loaded from: classes4.dex */
public final class ab extends k {
    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (gVarB == null) {
                com.mbridge.msdk.c.h.a();
                gVarB = com.mbridge.msdk.c.i.a();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - (gVarB.i() * 1000);
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.lastModified() + jCurrentTimeMillis < jCurrentTimeMillis2) {
                            a(file2);
                            try {
                                File file3 = new File(str + ".zip");
                                if (file3.exists() && file3.isFile()) {
                                    a(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.tools.ab.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                    if (gVarB == null) {
                        com.mbridge.msdk.c.h.a();
                        gVarB = com.mbridge.msdk.c.i.a();
                    }
                    ab.a(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_RES_MANAGER_DIR), gVarB.S());
                    ab.a(System.currentTimeMillis() - (gVarB.i() * 1000));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
    }

    public static void b() {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.ab.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                        String strA = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC);
                        try {
                            File file = new File(strA);
                            if (file.exists() && file.isDirectory()) {
                                for (File file2 : ab.b(strA)) {
                                    if (file2.exists() && file2.isFile()) {
                                        file2.delete();
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public static File[] b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(long j) {
        try {
            Iterator<File> it = c(new File(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_RES_MANAGER_DIR))).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.lastModified() < j && next.exists() && next.isFile()) {
                    next.delete();
                }
            }
        } catch (Throwable th) {
            ad.a("SameFileTool", th.getMessage(), th);
        }
    }

    public static String a(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (!file.isDirectory()) {
                return "";
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    a(file2);
                }
                file.delete();
                return "";
            }
            file.delete();
            return "";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    private static ArrayList<File> c(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new FileFilter() { // from class: com.mbridge.msdk.foundation.tools.ab.3
            @Override // java.io.FileFilter
            public final boolean accept(File file3) {
                return !file3.isHidden() || file3.isDirectory();
            }
        })) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(c(file2));
            }
        }
        return arrayList;
    }

    public static String c(String str) {
        return !TextUtils.isEmpty(str) ? SameMD5.getMD5(ao.b(str.trim())) : "";
    }

    private static long d(File file) throws Exception {
        long jAvailable = 0;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            jAvailable = fileInputStream2.available();
                            fileInputStream = fileInputStream2;
                        } catch (Exception e) {
                            e = e;
                            fileInputStream = fileInputStream2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return jAvailable;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                        ad.b("获取文件大小", "文件不存在!");
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return jAvailable;
    }

    private static long e(File file) throws Exception {
        long jD;
        File[] fileArrListFiles = file.listFiles();
        long j = 0;
        if (fileArrListFiles != null) {
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (fileArrListFiles[i].isDirectory()) {
                    jD = e(fileArrListFiles[i]);
                } else {
                    jD = d(fileArrListFiles[i]);
                }
                j += jD;
            }
        }
        return j;
    }

    public static List<String> a(String str, String str2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e) {
            ad.b("SameFileTool", e.getMessage());
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str + File.separator + "template_config.json");
            if (file.isFile() && file.exists()) {
                String strB = b(file);
                if (TextUtils.isEmpty(strB)) {
                    return arrayList;
                }
                try {
                    JSONArray jSONArray = new JSONArray(strB);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject != null && str2.equals(jSONObject.optString("xml_type"))) {
                            arrayList.add(str + File.separator + jSONObject.optString("name"));
                            if (jSONObject.has("ext_template")) {
                                jSONObject.put("folder_dir", str);
                                arrayList.add(jSONObject.toString());
                            }
                        }
                    }
                    return arrayList;
                } catch (JSONException e2) {
                    ad.b("SameFileTool", e2.getMessage());
                    return arrayList;
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(2:(3:41|7|(1:9)(0))|39) */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.io.File r4) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L4a
            r4.<init>()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L4a
        L13:
            java.lang.String r2 = r1.readLine()     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            if (r2 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            r3.<init>()     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            r3.append(r2)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            r4.append(r2)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L4a
            goto L13
        L2e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L42
        L32:
            r2 = move-exception
            goto L3c
        L34:
            r2 = move-exception
            r4 = r0
            goto L3c
        L37:
            r4 = move-exception
            goto L4c
        L39:
            r2 = move-exception
            r4 = r0
            r1 = r4
        L3c:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L42
            goto L2e
        L42:
            if (r4 == 0) goto L49
            java.lang.String r4 = r4.toString()
            return r4
        L49:
            return r0
        L4a:
            r4 = move-exception
            r0 = r1
        L4c:
            if (r0 == 0) goto L51
            r0.close()     // Catch: java.io.IOException -> L51
        L51:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ab.b(java.io.File):java.lang.String");
    }

    public static boolean d(String str) {
        if (com.mbridge.msdk.foundation.same.c.f.a(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    private static void e(String str) {
        try {
            ArrayList<File> arrayListC = c(new File(str));
            Collections.sort(arrayListC, new Comparator<File>() { // from class: com.mbridge.msdk.foundation.tools.ab.4
                @Override // java.util.Comparator
                public final boolean equals(Object obj) {
                    return true;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    long jLastModified = file.lastModified() - file2.lastModified();
                    if (jLastModified > 0) {
                        return 1;
                    }
                    return jLastModified == 0 ? 0 : -1;
                }
            });
            int size = (arrayListC.size() - 1) / 2;
            for (int i = 0; i < size; i++) {
                File file = arrayListC.get(i);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
            ad.b("SameFileTool", "del memory failed");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x010e, code lost:
    
        if (r12 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0110, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0114, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0115, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.a("SameFileTool", com.mbridge.msdk.newreward.function.common.MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0123, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0126, code lost:
    
        if (r12 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0128, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x012c, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012d, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.a("SameFileTool", com.mbridge.msdk.newreward.function.common.MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.ab.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean a(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException e2) {
                e2.printStackTrace();
                return true;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    static /* synthetic */ void a(String str, int i) {
        try {
            if (e(new File(str)) > i * 1048576) {
                e(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
            ad.b("SameFileTool", "clean memory failed");
        }
    }
}
