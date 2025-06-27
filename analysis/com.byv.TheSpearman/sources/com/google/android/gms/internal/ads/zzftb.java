package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzftb extends zzfsp {
    private zzfxh<Integer> zza;
    private zzfxh<Integer> zzb;
    private zzfta zzc;
    private HttpURLConnection zzd;

    zzftb() {
        this(new zzfxh() { // from class: com.google.android.gms.internal.ads.zzfsr
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return zzftb.zzf();
            }
        }, new zzfxh() { // from class: com.google.android.gms.internal.ads.zzfss
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return zzftb.zzg();
            }
        }, null);
    }

    zzftb(zzfxh<Integer> zzfxhVar, zzfxh<Integer> zzfxhVar2, zzfta zzftaVar) {
        this.zza = zzfxhVar;
        this.zzb = zzfxhVar2;
        this.zzc = zzftaVar;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfsq.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfsq.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfta zzftaVar = this.zzc;
        Objects.requireNonNull(zzftaVar);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzftaVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfta zzftaVar, final int i, final int i2) throws IOException {
        this.zza = new zzfxh() { // from class: com.google.android.gms.internal.ads.zzfst
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzfxh() { // from class: com.google.android.gms.internal.ads.zzfsu
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = zzftaVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzfxh() { // from class: com.google.android.gms.internal.ads.zzfsv
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzfxh() { // from class: com.google.android.gms.internal.ads.zzfsw
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = new zzfta() { // from class: com.google.android.gms.internal.ads.zzfsx
            @Override // com.google.android.gms.internal.ads.zzfta
            public final URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i) throws IOException {
        this.zza = new zzfxh() { // from class: com.google.android.gms.internal.ads.zzfsy
            @Override // com.google.android.gms.internal.ads.zzfxh
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzc = new zzfta() { // from class: com.google.android.gms.internal.ads.zzfsz
            @Override // com.google.android.gms.internal.ads.zzfta
            public final URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzm();
    }
}
