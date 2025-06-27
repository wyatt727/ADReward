package com.my.target;

/* loaded from: classes4.dex */
public final class d2 extends a2<String> {
    public static d2 a() {
        return new d2();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v16, types: [T, java.lang.String] */
    @Override // com.my.target.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.my.target.b2<java.lang.String> a(java.lang.String r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, android.content.Context r8) {
        /*
            r4 = this;
            com.my.target.b2 r6 = new com.my.target.b2
            r6.<init>()
            com.my.target.l1 r7 = com.my.target.l1.a(r8)
            r8 = 0
            if (r7 == 0) goto Ld2
            java.lang.String r0 = r7.c(r5)
            r6.d = r0
            r1 = 1
            if (r0 == 0) goto L18
            r6.b = r1
            return r6
        L18:
            r0 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r2.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "HttpVideoRequest: Send video request - "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lac
            r2.append(r5)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lac
            com.my.target.ba.a(r2)     // Catch: java.lang.Throwable -> Lac
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> Lac
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Lac
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> Lac
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> Lac
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setReadTimeout(r0)     // Catch: java.lang.Throwable -> La9
            r2.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> La9
            r2.setInstanceFollowRedirects(r1)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "connection"
            java.lang.String r1 = "close"
            r2.setRequestProperty(r0, r1)     // Catch: java.lang.Throwable -> La9
            r2.connect()     // Catch: java.lang.Throwable -> La9
            int r0 = r2.getResponseCode()     // Catch: java.lang.Throwable -> La9
            r6.c = r0     // Catch: java.lang.Throwable -> La9
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.String r3 = "HttpVideoRequest: "
            if (r0 != r1) goto L82
            java.io.InputStream r0 = r2.getInputStream()     // Catch: java.lang.Throwable -> La9
            java.io.File r5 = r7.b(r0, r5)     // Catch: java.lang.Throwable -> La9
            if (r5 == 0) goto L6a
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> La9
            r6.d = r5     // Catch: java.lang.Throwable -> La9
            goto Lcc
        L6a:
            r6.f3927a = r8     // Catch: java.lang.Throwable -> La9
            java.lang.String r5 = "Video request error - can't save video to disk cache"
            r6.e = r5     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r5.<init>()     // Catch: java.lang.Throwable -> La9
            r5.append(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = r6.e     // Catch: java.lang.Throwable -> La9
            r5.append(r7)     // Catch: java.lang.Throwable -> La9
        L7d:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La9
            goto La5
        L82:
            r6.f3927a = r8     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r5.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = "Video request error - response code "
            r5.append(r7)     // Catch: java.lang.Throwable -> La9
            r5.append(r0)     // Catch: java.lang.Throwable -> La9
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La9
            r6.e = r5     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r5.<init>()     // Catch: java.lang.Throwable -> La9
            r5.append(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = r6.e     // Catch: java.lang.Throwable -> La9
            r5.append(r7)     // Catch: java.lang.Throwable -> La9
            goto L7d
        La5:
            com.my.target.ba.a(r5)     // Catch: java.lang.Throwable -> La9
            goto Lcc
        La9:
            r5 = move-exception
            r0 = r2
            goto Lad
        Lac:
            r5 = move-exception
        Lad:
            r6.f3927a = r8
            java.lang.String r5 = r5.getMessage()
            r6.e = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "HttpVideoRequest: Video request error - "
            r5.append(r7)
            java.lang.String r7 = r6.e
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.my.target.ba.a(r5)
            r2 = r0
        Lcc:
            if (r2 == 0) goto Ld1
            r2.disconnect()
        Ld1:
            return r6
        Ld2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "HttpVideoRequest: Unable to open disk cache and load/save video "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.my.target.ba.a(r5)
            r6.f3927a = r8
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.d2.a(java.lang.String, java.lang.String, java.util.Map, android.content.Context):com.my.target.b2");
    }
}
