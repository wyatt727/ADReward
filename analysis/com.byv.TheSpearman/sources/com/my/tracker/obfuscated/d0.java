package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.z;
import java.net.Inet4Address;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d0 {
    final String b;
    final MyTrackerConfig.OkHttpClientProvider c;

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<byte[]> f4219a = new AtomicReference<>();
    boolean d = false;

    public d0(a1 a1Var) {
        this.b = a(a1Var.l());
        this.c = a1Var.k();
    }

    static String a(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://ip4." + url.getAuthority();
        } catch (Throwable th) {
            z0.a("Ipv4DataProvider: error occurred while creating IPv4 url", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        z0.a("Ipv4DataProvider: get IPv4 address");
        byte[] bArr = j.f4236a;
        try {
            z.b<String> bVarA = z.a(this.c).a(this.b);
            if (!bVarA.b()) {
                z0.a("Ipv4DataProvider: unsuccessful response from server");
                synchronized (this.f4219a) {
                    this.f4219a.set(bArr);
                    this.f4219a.notify();
                }
                return;
            }
            String strA = bVarA.a();
            if (TextUtils.isEmpty(strA)) {
                z0.a("Ipv4DataProvider: empty response from server");
                synchronized (this.f4219a) {
                    this.f4219a.set(bArr);
                    this.f4219a.notify();
                }
                return;
            }
            String strOptString = new JSONObject(strA).optString("ip");
            if (TextUtils.isEmpty(strOptString)) {
                z0.a("Ipv4DataProvider: IP is empty");
                synchronized (this.f4219a) {
                    this.f4219a.set(bArr);
                    this.f4219a.notify();
                }
                return;
            }
            z0.a("Ipv4DataProvider: IPv4 address is received " + strOptString);
            byte[] address = Inet4Address.getByName(strOptString).getAddress();
            synchronized (this.f4219a) {
                this.f4219a.set(address);
                this.f4219a.notify();
            }
        } catch (Throwable th) {
            try {
                z0.b("Ipv4DataProvider: failed to get IPv4 address", th);
                synchronized (this.f4219a) {
                    this.f4219a.set(bArr);
                    this.f4219a.notify();
                }
            } catch (Throwable th2) {
                synchronized (this.f4219a) {
                    this.f4219a.set(bArr);
                    this.f4219a.notify();
                    throw th2;
                }
            }
        }
    }

    public void a(Context context) {
        if (this.d) {
            return;
        }
        this.d = true;
        if (TextUtils.isEmpty(this.b)) {
            z0.a("Ipv4DataProvider: no IPv4 url");
            this.f4219a.set(j.f4236a);
        } else {
            g.b(new Runnable() { // from class: com.my.tracker.obfuscated.d0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a();
                }
            });
            this.d = true;
        }
    }

    public void a(s0 s0Var, Context context) {
        String str;
        byte[] bArr = this.f4219a.get();
        if (bArr == null) {
            try {
                z0.a("Ipv4DataProvider: waiting for collecting data");
                synchronized (this.f4219a) {
                    this.f4219a.wait(1000L);
                }
                z0.a("Ipv4DataProvider: timeout for collecting IPv4 has exceeded");
                bArr = this.f4219a.get();
            } catch (Throwable unused) {
                z0.a("Ipv4DataProvider: attempt to block thread retrieving IPv4 finished unsuccessfully");
            }
        }
        if (bArr == null) {
            str = "Ipv4DataProvider: data hasn't been collected yet";
        } else {
            if (bArr != j.f4236a) {
                s0Var.b(bArr);
                return;
            }
            str = "Ipv4DataProvider: error occurred while collecting data";
        }
        z0.a(str);
    }

    public void b(Context context) {
    }
}
