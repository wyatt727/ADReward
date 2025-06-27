package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgph extends RuntimeException {
    public zzgph(String str) {
        super(str);
    }

    public static Object zza(zzgpg zzgpgVar) {
        try {
            return zzgpgVar.zza();
        } catch (Exception e) {
            throw new zzgph(e);
        }
    }

    public zzgph(String str, Throwable th) {
        super(str, th);
    }

    public zzgph(Throwable th) {
        super(th);
    }
}
