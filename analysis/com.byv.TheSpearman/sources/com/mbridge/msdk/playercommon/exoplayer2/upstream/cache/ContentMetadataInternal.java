package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.net.Uri;

/* loaded from: classes4.dex */
final class ContentMetadataInternal {
    private static final String METADATA_NAME_CONTENT_LENGTH = "exo_len";
    private static final String METADATA_NAME_REDIRECTED_URI = "exo_redir";
    private static final String PREFIX = "exo_";

    public static long getContentLength(ContentMetadata contentMetadata) {
        return contentMetadata.get("exo_len", -1L);
    }

    public static void setContentLength(ContentMetadataMutations contentMetadataMutations, long j) {
        contentMetadataMutations.set("exo_len", j);
    }

    public static void removeContentLength(ContentMetadataMutations contentMetadataMutations) {
        contentMetadataMutations.remove("exo_len");
    }

    public static Uri getRedirectedUri(ContentMetadata contentMetadata) {
        String str = contentMetadata.get("exo_redir", (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static void setRedirectedUri(ContentMetadataMutations contentMetadataMutations, Uri uri) {
        contentMetadataMutations.set("exo_redir", uri.toString());
    }

    public static void removeRedirectedUri(ContentMetadataMutations contentMetadataMutations) {
        contentMetadataMutations.remove("exo_redir");
    }

    private ContentMetadataInternal() {
    }
}
