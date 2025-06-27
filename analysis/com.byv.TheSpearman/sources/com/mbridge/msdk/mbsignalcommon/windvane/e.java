package com.mbridge.msdk.mbsignalcommon.windvane;

import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: MimeTypeEnum.java */
/* loaded from: classes4.dex */
public enum e {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", MimeTypes.IMAGE_JPEG),
    JPEG("jpep", MimeTypes.IMAGE_JPEG),
    PNG("png", MimeTypes.IMAGE_PNG),
    WEBP("webp", MimeTypes.IMAGE_WEBP),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");

    private String j;
    private String k;

    e(String str, String str2) {
        this.j = str;
        this.k = str2;
    }

    public final String a() {
        return this.j;
    }

    public final String b() {
        return this.k;
    }
}
