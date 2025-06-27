package com.bytedance.adsdk.lottie.Pm;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NetworkCache.java */
/* loaded from: classes2.dex */
public class VwS {
    private final Kbd EYQ;

    public VwS(Kbd kbd) {
        this.EYQ = kbd;
    }

    Pair<Td, InputStream> EYQ(String str) {
        Td td;
        try {
            File fileMZx = mZx(str);
            if (fileMZx == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileMZx);
            if (fileMZx.getAbsolutePath().endsWith(".zip")) {
                td = Td.ZIP;
            } else {
                td = Td.JSON;
            }
            fileMZx.getAbsolutePath();
            return new Pair<>(td, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    File EYQ(String str, InputStream inputStream, Td td) throws IOException {
        File file = new File(EYQ(), EYQ(str, td, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                    } else {
                        fileOutputStream.flush();
                        return file;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    void EYQ(String str, Td td) {
        File file = new File(EYQ(), EYQ(str, td, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File mZx(String str) throws FileNotFoundException {
        File file = new File(EYQ(), EYQ(str, Td.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(EYQ(), EYQ(str, Td.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File EYQ() {
        File fileEYQ = this.EYQ.EYQ();
        if (fileEYQ.isFile()) {
            fileEYQ.delete();
        }
        if (!fileEYQ.exists()) {
            fileEYQ.mkdirs();
        }
        return fileEYQ;
    }

    private static String EYQ(String str, Td td, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? td.EYQ() : td.Td);
        return sb.toString();
    }
}
