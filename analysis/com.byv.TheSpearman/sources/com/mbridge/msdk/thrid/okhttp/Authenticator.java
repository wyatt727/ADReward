package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public interface Authenticator {
    public static final Authenticator NONE = new Authenticator() { // from class: com.mbridge.msdk.thrid.okhttp.Authenticator.1
        @Override // com.mbridge.msdk.thrid.okhttp.Authenticator
        public Request authenticate(@Nullable Route route, Response response) {
            return null;
        }
    };

    @Nullable
    Request authenticate(@Nullable Route route, Response response) throws IOException;
}
