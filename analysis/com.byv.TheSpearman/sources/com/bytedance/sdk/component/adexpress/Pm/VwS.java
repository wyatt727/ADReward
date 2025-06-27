package com.bytedance.sdk.component.adexpress.Pm;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: UrlUtils.java */
/* loaded from: classes2.dex */
public class VwS {
    public static EYQ EYQ(String str) {
        EYQ eyq = EYQ.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        eyq = EYQ.CSS;
                    } else if (path.endsWith(".js")) {
                        eyq = EYQ.JS;
                    } else if (path.endsWith(".jpg") || path.endsWith(".gif") || path.endsWith(".png") || path.endsWith(".jpeg") || path.endsWith(".webp") || path.endsWith(".bmp") || path.endsWith(".ico")) {
                        eyq = EYQ.IMAGE;
                    } else if (path.endsWith(".html")) {
                        eyq = EYQ.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return eyq;
    }

    public static boolean mZx(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null) {
            return false;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }

    /* compiled from: UrlUtils.java */
    public enum EYQ {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        private String Kbd;

        EYQ(String str) {
            this.Kbd = str;
        }

        public String EYQ() {
            return this.Kbd;
        }
    }
}
