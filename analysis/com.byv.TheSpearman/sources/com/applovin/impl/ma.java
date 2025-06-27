package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.g5;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public interface ma extends g5 {

    public interface b extends g5.a {
        @Override // com.applovin.impl.g5.a
        ma a();
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final Map f641a = new HashMap();
        private Map b;

        public synchronized Map a() {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.f641a));
            }
            return this.b;
        }
    }

    public static class c extends h5 {
        public final j5 b;
        public final int c;

        private static int a(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static c a(IOException iOException, j5 j5Var, int i) {
            int i2;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i2 = 1004;
            } else {
                i2 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i2 == 2007) {
                return new a(iOException, j5Var);
            }
            return new c(iOException, j5Var, i2, i);
        }

        public c(j5 j5Var, int i, int i2) {
            super(a(i, i2));
            this.b = j5Var;
            this.c = i2;
        }

        public c(IOException iOException, j5 j5Var, int i, int i2) {
            super(iOException, a(i, i2));
            this.b = j5Var;
            this.c = i2;
        }

        public c(String str, j5 j5Var, int i, int i2) {
            super(str, a(i, i2));
            this.b = j5Var;
            this.c = i2;
        }

        public c(String str, IOException iOException, j5 j5Var, int i, int i2) {
            super(str, iOException, a(i, i2));
            this.b = j5Var;
            this.c = i2;
        }
    }

    public static final class a extends c {
        public a(IOException iOException, j5 j5Var) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, j5Var, 2007, 1);
        }
    }

    public static final class d extends c {
        public final String d;

        public d(String str, j5 j5Var) {
            super("Invalid content type: " + str, j5Var, 2003, 1);
            this.d = str;
        }
    }

    public static final class e extends c {
        public final int d;
        public final String f;
        public final Map g;
        public final byte[] h;

        public e(int i, String str, IOException iOException, Map map, j5 j5Var, byte[] bArr) {
            super("Response code: " + i, iOException, j5Var, 2004, 1);
            this.d = i;
            this.f = str;
            this.g = map;
            this.h = bArr;
        }
    }
}
