package com.applovin.impl;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import com.applovin.impl.w5;
import com.google.android.exoplayer2.PlaybackException;

/* loaded from: classes.dex */
public abstract class b7 {
    public static int a(Exception exc, int i) {
        int i2 = yp.f1214a;
        if (i2 >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (i2 >= 23 && c.a(exc)) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i2 >= 18 && a.b(exc)) {
            return 6002;
        }
        if (i2 >= 18 && a.a(exc)) {
            return PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (exc instanceof tp) {
            return 6001;
        }
        if (exc instanceof w5.e) {
            return 6003;
        }
        if (exc instanceof ub) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i == 1) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static final class a {
        public static boolean b(Throwable th) {
            return th instanceof NotProvisionedException;
        }

        public static boolean a(Throwable th) {
            return th instanceof DeniedByServerException;
        }
    }

    private static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return r2.a(yp.a(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    private static final class c {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }
}
