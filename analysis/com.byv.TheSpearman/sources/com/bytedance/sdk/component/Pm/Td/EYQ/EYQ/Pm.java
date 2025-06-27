package com.bytedance.sdk.component.Pm.Td.EYQ.EYQ;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: Util.java */
/* loaded from: classes2.dex */
final class Pm {
    static final Charset EYQ = Charset.forName(C.ASCII_NAME);
    static final Charset mZx = Charset.forName(C.UTF8_NAME);

    static void EYQ(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                EYQ(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
            }
        }
    }
}
