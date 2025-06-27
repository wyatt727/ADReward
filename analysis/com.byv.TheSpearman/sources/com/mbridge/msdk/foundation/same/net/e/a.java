package com.mbridge.msdk.foundation.same.net.e;

import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.File;

/* compiled from: FileDownloadRequest.java */
/* loaded from: classes4.dex */
public class a extends i<Void> {
    private static final String c = "a";
    private File d;
    private File e;

    @Override // com.mbridge.msdk.foundation.same.net.i
    public final int b() {
        return 1;
    }

    public a(File file, String str) {
        super(0, str);
        this.d = file;
        this.e = new File(file + ".tmp");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        r18.a(r16);
     */
    @Override // com.mbridge.msdk.foundation.same.net.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(com.mbridge.msdk.foundation.same.net.f.b r17, com.mbridge.msdk.foundation.same.net.c r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r7 = r16
            java.lang.String r8 = "Error occured when calling InputStream.close"
            java.util.List r0 = r17.b()
            java.lang.String r1 = "Content-Length"
            java.lang.String r0 = com.mbridge.msdk.foundation.same.net.g.b.a(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L20
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            r9 = r0
            goto L21
        L20:
            r9 = r2
        L21:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 > 0) goto L2c
            java.lang.String r1 = com.mbridge.msdk.foundation.same.net.e.a.c
            java.lang.String r4 = "Response doesn't present Content-Length!"
            com.mbridge.msdk.foundation.tools.ad.c(r1, r4)
        L2c:
            r11 = 0
            if (r0 <= 0) goto L4a
            java.io.File r0 = r7.d
            long r0 = r0.length()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L4a
            java.io.File r0 = r7.d
            java.io.File r1 = r7.e
            r0.renameTo(r1)
            r1 = r18
            r2 = r16
            r3 = r9
            r5 = r9
            r1.a(r2, r3, r5)
            return r11
        L4a:
            java.io.RandomAccessFile r12 = new java.io.RandomAccessFile
            java.io.File r0 = r7.e
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = "rw"
            r12.<init>(r0, r1)
            r12.setLength(r2)
            java.io.InputStream r1 = r17.a()     // Catch: java.lang.Throwable -> Lb4
            java.util.List r0 = r17.b()     // Catch: java.lang.Throwable -> Lb1
            boolean r0 = com.mbridge.msdk.foundation.same.net.g.b.b(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L73
            boolean r0 = r1 instanceof java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> Lb1
            if (r0 != 0) goto L73
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> Lb1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb1
            r13 = r0
            goto L74
        L73:
            r13 = r1
        L74:
            r0 = 6144(0x1800, float:8.61E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> Lae
        L78:
            int r1 = r13.read(r0)     // Catch: java.lang.Throwable -> Lae
            r4 = -1
            if (r1 == r4) goto L9f
            r4 = 0
            r12.write(r0, r4, r1)     // Catch: java.lang.Throwable -> Lae
            long r4 = (long) r1     // Catch: java.lang.Throwable -> Lae
            long r14 = r2 + r4
            r1 = r18
            r2 = r16
            r3 = r9
            r5 = r14
            r1.a(r2, r3, r5)     // Catch: java.lang.Throwable -> Lae
            boolean r1 = r16.q()     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto L9b
            r1 = r18
            r1.a(r7)     // Catch: java.lang.Throwable -> Lae
            goto L9f
        L9b:
            r1 = r18
            r2 = r14
            goto L78
        L9f:
            if (r13 == 0) goto Laa
            r13.close()     // Catch: java.lang.Exception -> La5
            goto Laa
        La5:
            java.lang.String r0 = com.mbridge.msdk.foundation.same.net.e.a.c
            com.mbridge.msdk.foundation.tools.ad.b(r0, r8)
        Laa:
            r12.close()
            return r11
        Lae:
            r0 = move-exception
            r11 = r13
            goto Lb5
        Lb1:
            r0 = move-exception
            r11 = r1
            goto Lb5
        Lb4:
            r0 = move-exception
        Lb5:
            if (r11 == 0) goto Lc0
            r11.close()     // Catch: java.lang.Exception -> Lbb
            goto Lc0
        Lbb:
            java.lang.String r1 = com.mbridge.msdk.foundation.same.net.e.a.c
            com.mbridge.msdk.foundation.tools.ad.b(r1, r8)
        Lc0:
            r12.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.e.a.a(com.mbridge.msdk.foundation.same.net.f.b, com.mbridge.msdk.foundation.same.net.c):byte[]");
    }

    @Override // com.mbridge.msdk.foundation.same.net.i
    protected final k<Void> a(com.mbridge.msdk.foundation.same.net.f.c cVar) {
        if (!q()) {
            if (this.e.canRead() && this.e.length() > 0) {
                if (this.e.renameTo(this.d)) {
                    return k.a(null, cVar);
                }
                ad.c(c, "Can't rename the download temporary file!");
                return k.a(new com.mbridge.msdk.foundation.same.net.b.a(4, cVar));
            }
            ad.c(c, "Download temporary file was invalid!");
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(4, cVar));
        }
        return k.a(new com.mbridge.msdk.foundation.same.net.b.a(-2, cVar));
    }
}
