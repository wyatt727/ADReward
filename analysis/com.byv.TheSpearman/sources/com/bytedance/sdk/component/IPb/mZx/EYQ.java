package com.bytedance.sdk.component.IPb.mZx;

import android.text.TextUtils;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: DownloadExecutor.java */
/* loaded from: classes2.dex */
public class EYQ extends Td {
    public File EYQ;
    public File mZx;

    public EYQ(MxO mxO) {
        super(mxO);
    }

    public void EYQ(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.EYQ = new File(str, str2);
        this.mZx = new File(str, str2 + ".temp");
    }

    public void EYQ(final com.bytedance.sdk.component.IPb.EYQ.EYQ eyq) {
        File file = this.EYQ;
        if (file == null || this.mZx == null) {
            if (eyq != null) {
                eyq.EYQ(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.EYQ.length() != 0 && eyq != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.IPb.mZx mzx = new com.bytedance.sdk.component.IPb.mZx(true, 200, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            mzx.EYQ(this.EYQ);
            eyq.EYQ(this, mzx);
            return;
        }
        long length = this.mZx.length();
        final long j = length >= 0 ? length : 0L;
        pi.EYQ eyq2 = new pi.EYQ();
        eyq2.EYQ((Object) mZx());
        mZx("Range", "bytes=" + j + "-");
        if (TextUtils.isEmpty(this.IPb)) {
            eyq.EYQ(this, new IOException("Url is Empty"));
            return;
        }
        try {
            eyq2.EYQ(this.IPb);
            EYQ(eyq2);
            this.Td.EYQ(eyq2.EYQ().mZx()).EYQ(new com.bytedance.sdk.component.mZx.EYQ.Td() { // from class: com.bytedance.sdk.component.IPb.mZx.EYQ.1
                @Override // com.bytedance.sdk.component.mZx.EYQ.Td
                public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx mzx2, IOException iOException) {
                    com.bytedance.sdk.component.IPb.EYQ.EYQ eyq3 = eyq;
                    if (eyq3 != null) {
                        eyq3.EYQ(EYQ.this, iOException);
                    }
                    EYQ.this.Td();
                }

                /* JADX WARN: Removed duplicated region for block: B:125:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:138:0x018a A[EDGE_INSN: B:138:0x018a->B:69:0x018a BREAK  A[LOOP:1: B:53:0x0150->B:66:0x0181], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x018f A[Catch: all -> 0x0185, TryCatch #4 {all -> 0x0185, blocks: (B:57:0x0162, B:59:0x0168, B:64:0x0175, B:71:0x018f, B:74:0x019b, B:76:0x01a5, B:78:0x01b1, B:80:0x01bf, B:81:0x01ce, B:82:0x01db, B:86:0x01f8), top: B:122:0x0162 }] */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01db A[Catch: all -> 0x0185, TryCatch #4 {all -> 0x0185, blocks: (B:57:0x0162, B:59:0x0168, B:64:0x0175, B:71:0x018f, B:74:0x019b, B:76:0x01a5, B:78:0x01b1, B:80:0x01bf, B:81:0x01ce, B:82:0x01db, B:86:0x01f8), top: B:122:0x0162 }] */
                /* JADX WARN: Removed duplicated region for block: B:84:0x01f4  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01f7  */
                @Override // com.bytedance.sdk.component.mZx.EYQ.Td
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx r20, com.bytedance.sdk.component.mZx.EYQ.KO r21) throws java.io.IOException {
                    /*
                        Method dump skipped, instructions count: 581
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.IPb.mZx.EYQ.AnonymousClass1.EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx, com.bytedance.sdk.component.mZx.EYQ.KO):void");
                }
            });
        } catch (IllegalArgumentException unused) {
            eyq.EYQ(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0228 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01cb A[EDGE_INSN: B:180:0x01cb->B:83:0x01cb BREAK  A[LOOP:1: B:70:0x0196->B:82:0x01c6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e A[Catch: all -> 0x0230, TryCatch #9 {all -> 0x0230, blocks: (B:64:0x017f, B:66:0x0185, B:68:0x0189, B:69:0x018f, B:70:0x0196, B:72:0x019e, B:74:0x01ae, B:80:0x01ba, B:85:0x01d0, B:93:0x01e8, B:95:0x01f0, B:97:0x01fa, B:99:0x0204, B:109:0x021e, B:90:0x01de), top: B:165:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d0 A[Catch: all -> 0x0230, TryCatch #9 {all -> 0x0230, blocks: (B:64:0x017f, B:66:0x0185, B:68:0x0189, B:69:0x018f, B:70:0x0196, B:72:0x019e, B:74:0x01ae, B:80:0x01ba, B:85:0x01d0, B:93:0x01e8, B:95:0x01f0, B:97:0x01fa, B:99:0x0204, B:109:0x021e, B:90:0x01de), top: B:165:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01de A[Catch: all -> 0x0230, TryCatch #9 {all -> 0x0230, blocks: (B:64:0x017f, B:66:0x0185, B:68:0x0189, B:69:0x018f, B:70:0x0196, B:72:0x019e, B:74:0x01ae, B:80:0x01ba, B:85:0x01d0, B:93:0x01e8, B:95:0x01f0, B:97:0x01fa, B:99:0x0204, B:109:0x021e, B:90:0x01de), top: B:165:0x017f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.component.IPb.mZx EYQ() {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.IPb.mZx.EYQ.EYQ():com.bytedance.sdk.component.IPb.mZx");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Kbd(Map<String, String> map) {
        if (TextUtils.equals(map.get(HttpHeaders.ACCEPT_RANGES), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get(HttpHeaders.CONTENT_RANGE);
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long IPb(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean VwS(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td() {
        try {
            this.EYQ.delete();
        } catch (Throwable unused) {
        }
        try {
            this.mZx.delete();
        } catch (Throwable unused2) {
        }
    }
}
