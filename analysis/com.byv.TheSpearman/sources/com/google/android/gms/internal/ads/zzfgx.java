package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfgx {
    public zzfgx() {
        try {
            zzggr.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgyg zzgygVarZzt = zzgyj.zzt();
        try {
            zzgfm.zzb(zzgge.zzb(zzgfw.zza(zzgnq.zzb().zza("AES128_GCM"))), zzgfl.zzb(zzgygVarZzt));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(zzgygVarZzt.zzb().zzB(), 11);
        zzgygVarZzt.zzc();
        return strEncodeToString;
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzduc zzducVar) {
        zzgge zzggeVarZzc = zzc(str);
        if (zzggeVarZzc == null) {
            return null;
        }
        try {
            byte[] bArrZza = ((zzgfj) zzggeVarZzc.zzd(zzgox.zza(), zzgfj.class)).zza(bArr, bArr2);
            zzducVar.zzb().put("ds", "1");
            return new String(bArrZza, C.UTF8_NAME);
        } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CryptoUtils.decrypt");
            zzducVar.zzb().put("dsf", e.toString());
            return null;
        }
    }

    @Nullable
    private static final zzgge zzc(String str) {
        try {
            return zzgfm.zza(zzgfk.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
