package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;

@Deprecated
/* loaded from: classes2.dex */
final class RtspTrackTiming {
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.rtsp.RtspTrackTiming> parseTrackTiming(java.lang.String r18, android.net.Uri r19) throws com.google.android.exoplayer2.ParserException, java.lang.NumberFormatException {
        /*
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>()
            java.lang.String r1 = ","
            r2 = r18
            java.lang.String[] r1 = com.google.android.exoplayer2.util.Util.split(r2, r1)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto Lc8
            r5 = r1[r4]
            java.lang.String r6 = ";"
            java.lang.String[] r6 = com.google.android.exoplayer2.util.Util.split(r5, r6)
            int r7 = r6.length
            r12 = r3
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
            r14 = -1
        L23:
            if (r12 >= r7) goto L97
            r15 = r6[r12]
            java.lang.String r11 = "="
            java.lang.String[] r11 = com.google.android.exoplayer2.util.Util.splitAtFirst(r15, r11)     // Catch: java.lang.Exception -> L91
            r10 = r11[r3]     // Catch: java.lang.Exception -> L91
            r3 = 1
            r11 = r11[r3]     // Catch: java.lang.Exception -> L91
            int r3 = r10.hashCode()     // Catch: java.lang.Exception -> L91
            r16 = r1
            r1 = 113759(0x1bc5f, float:1.5941E-40)
            r17 = r2
            r2 = 2
            if (r3 == r1) goto L5f
            r1 = 116079(0x1c56f, float:1.62661E-40)
            if (r3 == r1) goto L55
            r1 = 1524180539(0x5ad9263b, float:3.05610524E16)
            if (r3 == r1) goto L4b
            goto L69
        L4b:
            java.lang.String r1 = "rtptime"
            boolean r1 = r10.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r1 == 0) goto L69
            r1 = r2
            goto L6a
        L55:
            java.lang.String r1 = "url"
            boolean r1 = r10.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r1 == 0) goto L69
            r1 = 0
            goto L6a
        L5f:
            java.lang.String r1 = "seq"
            boolean r1 = r10.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r1 == 0) goto L69
            r1 = 1
            goto L6a
        L69:
            r1 = -1
        L6a:
            if (r1 == 0) goto L83
            r3 = 1
            if (r1 == r3) goto L7c
            if (r1 != r2) goto L76
            long r8 = java.lang.Long.parseLong(r11)     // Catch: java.lang.Exception -> L91
            goto L80
        L76:
            r0 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r10, r0)     // Catch: java.lang.Exception -> L91
            throw r0     // Catch: java.lang.Exception -> L91
        L7c:
            int r14 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Exception -> L91
        L80:
            r1 = r19
            goto L89
        L83:
            r1 = r19
            android.net.Uri r13 = resolveUri(r11, r1)     // Catch: java.lang.Exception -> L91
        L89:
            int r12 = r12 + 1
            r1 = r16
            r2 = r17
            r3 = 0
            goto L23
        L91:
            r0 = move-exception
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r15, r0)
            throw r0
        L97:
            r16 = r1
            r17 = r2
            r1 = r19
            if (r13 == 0) goto Lc2
            java.lang.String r2 = r13.getScheme()
            if (r2 == 0) goto Lc2
            r2 = -1
            if (r14 != r2) goto Lb1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 == 0) goto Lc2
        Lb1:
            com.google.android.exoplayer2.source.rtsp.RtspTrackTiming r2 = new com.google.android.exoplayer2.source.rtsp.RtspTrackTiming
            r2.<init>(r8, r14, r13)
            r0.add(r2)
            int r4 = r4 + 1
            r1 = r16
            r2 = r17
            r3 = 0
            goto L10
        Lc2:
            r0 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.createForMalformedManifest(r5, r0)
            throw r0
        Lc8:
            com.google.common.collect.ImmutableList r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.RtspTrackTiming.parseTrackTiming(java.lang.String, android.net.Uri):com.google.common.collect.ImmutableList");
    }

    static Uri resolveUri(String str, Uri uri) {
        Assertions.checkArgument(((String) Assertions.checkNotNull(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        if (((String) Assertions.checkNotNull(uri3.getHost())).equals(uri.getHost())) {
            return uri3;
        }
        if (string.endsWith("/")) {
            return UriUtil.resolveToUri(string, str);
        }
        return UriUtil.resolveToUri(string + "/", str);
    }

    private RtspTrackTiming(long j, int i, Uri uri) {
        this.rtpTimestamp = j;
        this.sequenceNumber = i;
        this.uri = uri;
    }
}
