package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class l1 {
    public static final FilenameFilter b = new FilenameFilter() { // from class: com.my.target.l1$$ExternalSyntheticLambda0
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("mytrg_");
        }
    };
    public static final FilenameFilter c = new FilenameFilter() { // from class: com.my.target.l1$$ExternalSyntheticLambda1
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.endsWith(".mp4");
        }
    };
    public static volatile l1 d;

    /* renamed from: a, reason: collision with root package name */
    public final File f4035a;

    public l1(File file) {
        this.f4035a = file;
    }

    public static l1 a(Context context) {
        l1 l1Var = d;
        if (l1Var == null) {
            synchronized (l1.class) {
                l1Var = d;
                if (l1Var == null) {
                    File cacheDir = context.getCacheDir();
                    boolean zMkdir = true;
                    if (cacheDir != null && !cacheDir.exists()) {
                        zMkdir = cacheDir.mkdir();
                    }
                    if (!zMkdir) {
                        ba.c("DiskCache is unable to create cache dir");
                        return null;
                    }
                    File file = new File(cacheDir, "mytargetcache");
                    if (!file.exists()) {
                        zMkdir = file.mkdir();
                    }
                    if (!zMkdir) {
                        ba.c("DiskCache is unable to create cache dir");
                        return null;
                    }
                    if (file.isDirectory() && file.canWrite()) {
                        l1 l1Var2 = new l1(file);
                        d = l1Var2;
                        l1Var = l1Var2;
                    }
                }
            }
        }
        return l1Var;
    }

    public final int a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
        int i = 0;
        while (true) {
            try {
                int i2 = bufferedInputStream.read(bArr, 0, 8192);
                if (i2 == -1) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, i2);
                i += i2;
            } finally {
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (Throwable th) {
            ba.a("DiskCache: Error - " + th.getMessage());
        }
        try {
            bufferedInputStream.close();
        } catch (Throwable th2) {
            ba.a("DiskCache: Error - " + th2.getMessage());
        }
        return i;
    }

    public synchronized Bitmap a(String str) {
        String str2;
        a();
        File fileA = a(str, ".img");
        if (fileA.exists()) {
            ba.a("DiskCache: Get image - " + fileA.getPath());
            try {
                return BitmapFactory.decodeFile(fileA.getAbsolutePath());
            } catch (OutOfMemoryError e) {
                System.gc();
                ba.c("DiskCache OOME, trying once again");
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    return BitmapFactory.decodeFile(fileA.getAbsolutePath(), options);
                } catch (OutOfMemoryError unused) {
                    str2 = "DiskCache OOME, called twice - " + e;
                    ba.c(str2);
                    return null;
                }
            } catch (Throwable th) {
                str2 = "DiskCache exception - " + th;
                ba.c(str2);
                return null;
            }
        }
        return null;
    }

    public synchronized File a(int i, String str, boolean z) {
        OutputStreamWriter outputStreamWriter;
        a();
        File fileA = a(Integer.toString(i), ".json");
        ba.a("DiskCache: Save text - " + fileA.getPath());
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (fileA.exists() && z) {
            jCurrentTimeMillis = fileA.lastModified();
        }
        try {
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileA), Charset.forName(C.UTF8_NAME).newEncoder());
            try {
                outputStreamWriter.write(str);
                outputStreamWriter.close();
                if (!fileA.setLastModified(jCurrentTimeMillis)) {
                    ba.a("DiskCache: Unable to set last modified to file - " + fileA.getPath());
                }
                return fileA;
            } catch (Throwable th) {
                th = th;
                ba.c("DiskCache exception - " + th);
                if (outputStreamWriter != null) {
                    try {
                        outputStreamWriter.close();
                    } catch (Throwable unused) {
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStreamWriter = null;
        }
    }

    public synchronized File a(InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        a();
        File fileA = a(str, ".img");
        ba.a("DiskCache: Save image - " + fileA.getPath());
        try {
            fileOutputStream = new FileOutputStream(fileA);
            try {
                a(inputStream, fileOutputStream);
                try {
                    fileOutputStream.close();
                } catch (Throwable th) {
                    ba.c("DiskCache exception - " + th);
                }
                return fileA;
            } catch (Throwable th2) {
                th = th2;
                try {
                    ba.c("DiskCache exception - " + th);
                    return null;
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            ba.c("DiskCache exception - " + th3);
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public final File a(String str, String str2) {
        return new File(this.f4035a.getAbsolutePath() + File.separator + ("mytrg_" + m1.c(str) + str2));
    }

    public synchronized String a(int i, long j) {
        FileInputStream fileInputStream;
        String str;
        a();
        File fileA = a(Integer.toString(i), ".json");
        if (fileA.exists()) {
            if (fileA.isFile() && fileA.lastModified() + j < System.currentTimeMillis()) {
                ba.a("DiskCache: Remove expired file - " + fileA.getPath());
                if (!fileA.delete()) {
                    ba.a("DiskCache: Unable to delete file - " + fileA.getAbsolutePath());
                }
                return null;
            }
            ba.a("DiskCache: Get text - " + fileA.getPath());
            try {
                fileInputStream = new FileInputStream(fileA);
                try {
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, C.UTF8_NAME));
                    char[] cArr = new char[1024];
                    while (true) {
                        int i2 = bufferedReader.read(cArr);
                        if (i2 == -1) {
                            break;
                        }
                        sb.append(new String(cArr, 0, i2));
                    }
                    if (sb.length() != 0) {
                        String string = sb.toString();
                        try {
                            fileInputStream.close();
                        } catch (Throwable th) {
                            ba.c("DiskCache exception - " + th);
                        }
                        return string;
                    }
                    ba.a("DiskCache: Error - cache file is empty");
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        str = "DiskCache exception - " + th2;
                        ba.c(str);
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        ba.c("DiskCache exception - " + th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th4) {
                                str = "DiskCache exception - " + th4;
                                ba.c(str);
                                return null;
                            }
                        }
                        return null;
                    } finally {
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
            }
        }
        return null;
    }

    public synchronized void a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f4035a.lastModified() + 604800000 < jCurrentTimeMillis) {
                File[] fileArrListFiles = this.f4035a.listFiles(b);
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.isFile() && file.lastModified() + 604800000 < jCurrentTimeMillis) {
                            ba.a("DiskCache: Remove expired file - " + file.getPath());
                            if (!file.delete()) {
                                ba.a("DiskCache: Unable to delete file - " + file.getAbsolutePath());
                            }
                        }
                    }
                }
                if (!this.f4035a.setLastModified(jCurrentTimeMillis)) {
                    ba.a("DiskCache: Unable to set last modified to dir - " + this.f4035a.getAbsolutePath());
                }
            }
            File[] fileArrListFiles2 = this.f4035a.listFiles(c);
            if (fileArrListFiles2 != null && fileArrListFiles2.length > 10) {
                Arrays.sort(fileArrListFiles2, new Comparator() { // from class: com.my.target.l1$$ExternalSyntheticLambda2
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
                    }
                });
                for (int length = fileArrListFiles2.length - 1; length >= 10; length--) {
                    String path = fileArrListFiles2[length].getPath();
                    ba.a("DiskCache: Remove redundant video - " + path);
                    if (!fileArrListFiles2[length].delete()) {
                        ba.a("DiskCache: Unable to remove file - " + path);
                    }
                }
            }
        } catch (Throwable th) {
            ba.c("DiskCache exception - " + th);
        }
    }

    public synchronized File b(InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        a();
        File fileA = a(str, ".mp4");
        ba.a("DiskCache: Save video - " + fileA.getPath());
        try {
            fileOutputStream = new FileOutputStream(fileA);
            try {
                a(inputStream, fileOutputStream);
                try {
                    fileOutputStream.close();
                } catch (Throwable th) {
                    ba.c("DiskCache exception - " + th);
                }
                return fileA;
            } catch (Throwable th2) {
                th = th2;
                try {
                    ba.c("DiskCache exception - " + th);
                    return null;
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            ba.c("DiskCache exception - " + th3);
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public String b(String str) {
        return b(str, ".img");
    }

    public final synchronized String b(String str, String str2) {
        a();
        File fileA = a(str, str2);
        if (fileA.exists()) {
            ba.a("DiskCache: Get path - " + fileA.getPath());
            try {
                return fileA.getAbsolutePath();
            } catch (Throwable th) {
                ba.c("DiskCache exception - " + th);
            }
        }
        return null;
    }

    public String c(String str) {
        return b(str, ".mp4");
    }
}
