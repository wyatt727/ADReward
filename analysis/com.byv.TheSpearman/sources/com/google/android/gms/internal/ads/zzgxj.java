package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgxj implements zzggh {
    private static final byte[] zza = {0};
    private final zzgsa zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgxj(zzgpm zzgpmVar) throws GeneralSecurityException {
        this.zzb = new zzgxg(zzgpmVar.zzd().zzd(zzgfs.zza()));
        this.zzc = zzgpmVar.zzb().zzb();
        this.zzd = zzgpmVar.zzc().zzc();
        if (zzgpmVar.zzb().zzf().equals(zzgpt.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzggh zza(zzgpm zzgpmVar) throws GeneralSecurityException {
        return new zzgxj(zzgpmVar);
    }

    public static zzggh zzb(zzgqd zzgqdVar) throws GeneralSecurityException {
        return new zzgxj(zzgqdVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzgwl.zzb(this.zzd, this.zzb.zza(zzgwl.zzb(bArr, bArr2), this.zzc)) : zzgwl.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgxj(zzgqd zzgqdVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(String.valueOf(zzgqdVar.zzb().zzf()));
        this.zzb = new zzgxi("HMAC".concat(strValueOf), new SecretKeySpec(zzgqdVar.zzd().zzd(zzgfs.zza()), "HMAC"));
        this.zzc = zzgqdVar.zzb().zzb();
        this.zzd = zzgqdVar.zzc().zzc();
        if (zzgqdVar.zzb().zzg().equals(zzgqm.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgxj(zzgsa zzgsaVar, int i) throws GeneralSecurityException {
        this.zzb = zzgsaVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgsaVar.zza(new byte[0], i);
    }
}
