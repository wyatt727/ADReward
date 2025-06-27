package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfwc implements zzfws {
    protected zzfwc() {
    }

    public static zzfwc zzc(char c) {
        return new zzfvz(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
