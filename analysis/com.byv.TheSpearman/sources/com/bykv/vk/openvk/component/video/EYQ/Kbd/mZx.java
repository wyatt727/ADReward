package com.bykv.vk.openvk.component.video.EYQ.Kbd;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: VideoFilesUtils.java */
/* loaded from: classes.dex */
public class mZx {
    public static long EYQ(String str, String str2) {
        File fileTd = Td(str, str2);
        if (fileTd.exists()) {
            return fileTd.length();
        }
        File fileMZx = mZx(str, str2);
        if (fileMZx.exists()) {
            return fileMZx.length();
        }
        return 0L;
    }

    public static File mZx(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    public static File Td(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static void EYQ(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek(i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable unused) {
        }
    }
}
