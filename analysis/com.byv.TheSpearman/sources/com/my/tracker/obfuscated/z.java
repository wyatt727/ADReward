package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.my.tracker.MyTrackerConfig;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class z<T> {

    public interface a {
        String a();

        void a(OutputStream outputStream);
    }

    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        boolean f4273a;
        T b;
        String c;

        private b() {
        }

        static <T> b<T> c() {
            return new b<>();
        }

        public T a() {
            return this.b;
        }

        public boolean b() {
            return this.f4273a;
        }
    }

    public static z<String> a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (okHttpClientProvider != null) {
            try {
                return new m0(okHttpClientProvider);
            } catch (Throwable th) {
                z0.a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new x();
    }

    public static z<String> a(a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        if (okHttpClientProvider != null) {
            try {
                return new n0(aVar, okHttpClientProvider, z);
            } catch (Throwable th) {
                z0.a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new y(aVar, z);
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    public abstract b<T> a(String str);
}
