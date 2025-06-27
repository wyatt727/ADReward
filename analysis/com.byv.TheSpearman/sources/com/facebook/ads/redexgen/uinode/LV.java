package com.facebook.ads.redexgen.uinode;

import java.io.Writer;

/* loaded from: assets/audience_network.dex */
public class LV extends Writer {
    public static String[] A03 = {"m3VYVt1tyYlWEg8H2HS3pUr0VsrhpbIN", "rEdvzR", "IUQqTrakmjCy7RtoUebGZ8YLkwuKbv7t", "x1ufNW", "e7NtJ1", "AK7iWzpXctzvcUrQA38QQTSmPkrm2HP", "25DCnOqD1cr08G9nl6wTfczykol7NaSA", "0bM1VBntYb2o4FFsMu8yzxmwObMsLmHM"};
    public int A00;
    public char[] A01 = new char[1024];
    public final LU A02;

    public LV(LU lu) {
        this.A02 = lu;
    }

    private void A00() {
        this.A02.AE8(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(char[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            r3 = r7
        L1:
            int r4 = r7 + r8
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.LV.A03
            r0 = 3
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L1b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.LV.A03
            java.lang.String r1 = "5m1TKypG4e5yu"
            r0 = 5
            r2[r0] = r1
            if (r3 >= r4) goto L40
            char r1 = r6[r3]
            r0 = 10
            if (r1 == r0) goto L31
            int r2 = r5.A00
            char[] r1 = r5.A01
            int r0 = r1.length
            if (r2 != r0) goto L37
        L31:
            r5.A00()
        L34:
            int r3 = r3 + 1
            goto L1
        L37:
            char r0 = r6[r3]
            r1[r2] = r0
            int r0 = r2 + 1
            r5.A00 = r0
            goto L34
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.LV.write(char[], int, int):void");
    }
}
