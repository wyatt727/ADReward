package com.bytedance.sdk.component.adexpress.EYQ.mZx;

import com.bytedance.sdk.component.utils.pi;
import com.json.m4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* compiled from: Version.java */
/* loaded from: classes2.dex */
public class QQ {
    private static com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ EYQ;

    public static void EYQ() throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(Kbd.QQ(), "temp_pkg_info.json");
            Long lValueOf = Long.valueOf(file.length());
            if (lValueOf.longValue() > 0 && file.exists() && file.isFile()) {
                byte[] bArr = new byte[lValueOf.intValue()];
                fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ EYQ2 = com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ.EYQ(new JSONObject(new String(bArr, m4.M)));
                    if (EYQ2 != null) {
                        EYQ = EYQ2;
                        EYQ.Td();
                    }
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        pi.EYQ("Version", "version init error", th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th3;
                    }
                }
            }
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
        }
    }

    public static synchronized com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ mZx() {
        return EYQ;
    }

    public static synchronized void EYQ(com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq) {
        if (eyq != null) {
            if (eyq.VwS()) {
                EYQ = eyq;
            }
        }
    }

    public static void Td() {
        Kbd.EYQ(Kbd.QQ(), mZx(), "temp_pkg_info.json");
    }

    public static boolean EYQ(String str) {
        return Kbd.EYQ(mZx(), str);
    }

    public static boolean mZx(com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq) {
        return Kbd.Td(mZx(), eyq);
    }

    public static void Pm() {
        Kbd.mZx(Kbd.QQ(), mZx(), "temp_pkg_info.json");
        EYQ = null;
    }
}
