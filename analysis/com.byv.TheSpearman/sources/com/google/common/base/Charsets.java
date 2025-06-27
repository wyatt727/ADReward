package com.google.common.base;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class Charsets {
    public static final Charset US_ASCII = Charset.forName(C.ASCII_NAME);
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Charset UTF_8 = Charset.forName(C.UTF8_NAME);
    public static final Charset UTF_16BE = Charset.forName("UTF-16BE");
    public static final Charset UTF_16LE = Charset.forName("UTF-16LE");
    public static final Charset UTF_16 = Charset.forName(C.UTF16_NAME);

    private Charsets() {
    }
}
