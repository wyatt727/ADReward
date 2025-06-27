package com.json.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.nearby.messages.Message;
import com.json.b6;
import com.json.ca;
import com.json.o7;
import com.json.t2;
import com.json.wc;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IronSourceStorageUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2281a = "supersonicads";
    private static wc b = null;
    private static boolean c = false;

    private static void a(Context context) {
        wc wcVar = b;
        if (wcVar != null && wcVar.b()) {
            deleteCacheDirectories(context);
        }
        wc wcVar2 = b;
        if (wcVar2 == null || !wcVar2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static boolean a() {
        wc wcVar = b;
        return (wcVar != null && wcVar.a()) || Build.VERSION.SDK_INT > 28;
    }

    private static File b(Context context) {
        b6 b6VarC = ca.h().c();
        wc wcVar = b;
        return (wcVar == null || !wcVar.d()) ? b6VarC.t(context) : b6VarC.e(context);
    }

    private static File b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(f2281a);
        sb.append(str);
        return new File(sb.toString());
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) throws JSONException {
        Object objC;
        String name;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    objC = c(file2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (objC instanceof JSONArray) {
                    name = "files";
                } else if (objC instanceof JSONObject) {
                    name = file2.getName();
                }
                jSONObject.put(name, c(file2));
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(o7 o7Var, JSONObject jSONObject) throws Exception {
        String name;
        JSONObject jSONObjectBuildFilesMapOfDirectory;
        if (o7Var == null || !o7Var.isDirectory()) {
            return new JSONObject();
        }
        File[] fileArrListFiles = o7Var.listFiles();
        if (fileArrListFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : fileArrListFiles) {
            o7 o7Var2 = new o7(file.getPath());
            if (o7Var2.isFile()) {
                name = o7Var2.getName();
                jSONObjectBuildFilesMapOfDirectory = o7Var2.a();
                if (jSONObject.has(name)) {
                    jSONObjectBuildFilesMapOfDirectory = SDKUtils.mergeJSONObjects(jSONObjectBuildFilesMapOfDirectory, jSONObject.getJSONObject(name));
                }
            } else if (o7Var2.isDirectory()) {
                name = o7Var2.getName();
                jSONObjectBuildFilesMapOfDirectory = buildFilesMapOfDirectory(o7Var2, jSONObject);
            }
            jSONObject2.put(name, jSONObjectBuildFilesMapOfDirectory);
        }
        return jSONObject2;
    }

    private static File c(Context context) {
        b6 b6VarC = ca.h().c();
        wc wcVar = b;
        return (wcVar == null || !wcVar.d()) ? b6VarC.v(context) : b6VarC.k(context);
    }

    private static Object c(File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    public static void deleteCacheDirectories(Context context) {
        b6 b6VarC = ca.h().c();
        a(b6VarC.e(context));
        a(b6VarC.k(context));
    }

    public static synchronized boolean deleteFile(o7 o7Var) {
        if (!o7Var.exists()) {
            return false;
        }
        return o7Var.delete();
    }

    public static void deleteFilesDirectories(Context context) {
        b6 b6VarC = ca.h().c();
        a(b6VarC.t(context));
        a(b6VarC.v(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean deleteFolder(java.lang.String r2) {
        /*
            java.lang.Class<com.ironsource.sdk.utils.IronSourceStorageUtils> r0 = com.json.sdk.utils.IronSourceStorageUtils.class
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L19
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            boolean r2 = deleteFolderContentRecursive(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L16
            boolean r2 = r1.delete()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            monitor-exit(r0)
            return r2
        L19:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.sdk.utils.IronSourceStorageUtils.deleteFolder(java.lang.String):boolean");
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zDeleteFolderContentRecursive = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteFolderContentRecursive &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    zDeleteFolderContentRecursive = false;
                }
            }
        }
        return zDeleteFolderContentRecursive;
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        wc wcVar = b;
        if (wcVar == null || !wcVar.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (canonicalPath2.startsWith(canonicalPath)) {
                return;
            }
            throw new Exception(t2.c.w + canonicalPath2);
        }
    }

    public static String getCachedFilesMap(String str, String str2) throws JSONException {
        JSONObject jSONObjectBuildFilesMap = buildFilesMap(str, str2);
        try {
            jSONObjectBuildFilesMap.put("path", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObjectBuildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File fileB;
        if (!a() || !SDKUtils.isExternalStorageAvailable() || (fileB = b(context)) == null || !fileB.canWrite()) {
            return c(context).getPath();
        }
        c = true;
        return fileB.getPath();
    }

    public static ArrayList<o7> getFilesInFolderRecursive(o7 o7Var) {
        if (o7Var == null || !o7Var.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<o7> arrayList = new ArrayList<>();
        File[] fileArrListFiles = o7Var.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                o7 o7Var2 = new o7(file.getPath());
                if (o7Var2.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(o7Var2));
                }
                if (o7Var2.isFile()) {
                    arrayList.add(o7Var2);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File fileB = b(new File(getDiskCacheDirPath(context)));
        if (!fileB.exists()) {
            fileB.mkdir();
        }
        return fileB.getPath();
    }

    public static long getTotalSizeOfDir(o7 o7Var) {
        long totalSizeOfDir;
        long j = 0;
        if (o7Var != null && o7Var.isDirectory()) {
            File[] fileArrListFiles = o7Var.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file : fileArrListFiles) {
                o7 o7Var2 = new o7(file.getPath());
                if (o7Var2.isFile()) {
                    totalSizeOfDir = o7Var2.length();
                } else if (o7Var2.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(o7Var2);
                }
                j += totalSizeOfDir;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(Context context, wc wcVar) {
        b = wcVar;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(o7 o7Var) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(o7Var));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[Message.MAX_CONTENT_SIZE_BYTES];
            int i = 0;
            while (true) {
                int i2 = byteArrayInputStream.read(bArr2);
                if (i2 == -1) {
                    return i;
                }
                fileOutputStream.write(bArr2, 0, i2);
                i += i2;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }
}
