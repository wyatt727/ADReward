package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* compiled from: FileUtils.java */
/* loaded from: classes2.dex */
public class IPb {
    public static File EYQ(Context context, boolean z, String str, String str2) {
        String strMZx = mZx(context);
        if (z) {
            str = EYQ(context) + "-" + str;
        }
        if (strMZx != null && !strMZx.endsWith(File.separator)) {
            strMZx = strMZx + File.separator;
        }
        String str3 = strMZx + str;
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(str3, str2);
    }

    public static File EYQ(Context context, boolean z, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z) {
            str = EYQ(context) + "-" + str;
        }
        if (absolutePath != null && !absolutePath.endsWith(File.separator)) {
            absolutePath = absolutePath + File.separator;
        }
        File file = new File(absolutePath + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String mZx(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static List<File> EYQ(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new EYQ(null));
        return listAsList;
    }

    public static void mZx(File file) throws IOException {
        if (file.exists()) {
            pi.EYQ("splashLoadAd", "update file modify time");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            Kbd(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    public static void Td(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            try {
                file.delete();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    Td(file2);
                } else {
                    try {
                        file2.delete();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        try {
            file.delete();
        } catch (Throwable unused3) {
        }
    }

    private static void Kbd(File file) throws IOException {
        long length = file.length();
        if (length == 0) {
            IPb(file);
            return;
        }
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
            long j = length - 1;
            try {
                randomAccessFile2.seek(j);
                byte b = randomAccessFile2.readByte();
                randomAccessFile2.seek(j);
                randomAccessFile2.write(b);
                randomAccessFile2.close();
            } catch (Throwable unused) {
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private static void IPb(File file) throws IOException {
        if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    /* compiled from: FileUtils.java */
    private static final class EYQ implements Comparator<File> {
        private int EYQ(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }

        private EYQ() {
        }

        /* synthetic */ EYQ(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.Comparator
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return EYQ(file.lastModified(), file2.lastModified());
        }
    }

    public static byte[] Pm(File file) {
        FileInputStream fileInputStream;
        Long lValueOf;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                lValueOf = Long.valueOf(file.length());
                fileInputStream = new FileInputStream(file);
            } catch (Throwable unused) {
                fileInputStream = null;
            }
            try {
                byte[] bArr = new byte[lValueOf.intValue()];
                if (fileInputStream.read(bArr) == lValueOf.longValue()) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused2) {
                    }
                    return bArr;
                }
            } catch (Throwable unused3) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    /* compiled from: FileUtils.java */
    /* renamed from: com.bytedance.sdk.component.utils.IPb$1, reason: invalid class name */
    static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    public static String EYQ(Context context) {
        String strEYQ = hYh.EYQ(context);
        return (TextUtils.isEmpty(strEYQ) || !strEYQ.contains(":")) ? strEYQ : strEYQ.replace(":", "-");
    }
}
