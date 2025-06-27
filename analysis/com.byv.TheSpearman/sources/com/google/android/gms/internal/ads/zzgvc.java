package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgvc extends zzgzv implements zzhbm {
    private static final zzgvc zza;
    private static volatile zzhbt zzb;
    private int zzc;
    private zzhah zzd = zzbK();

    static {
        zzgvc zzgvcVar = new zzgvc();
        zza = zzgvcVar;
        zzgzv.zzca(zzgvc.class, zzgvcVar);
    }

    private zzgvc() {
    }

    public static zzguz zzd() {
        return (zzguz) zza.zzaZ();
    }

    public static zzgvc zzg(InputStream inputStream, zzgzf zzgzfVar) throws IOException {
        return (zzgvc) zzgzv.zzbu(zza, inputStream, zzgzfVar);
    }

    static /* synthetic */ void zzj(zzgvc zzgvcVar, zzgvb zzgvbVar) {
        zzgvbVar.getClass();
        zzhah zzhahVar = zzgvcVar.zzd;
        if (!zzhahVar.zzc()) {
            zzgvcVar.zzd = zzgzv.zzbL(zzhahVar);
        }
        zzgvcVar.zzd.add(zzgvbVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    protected final Object zzde(zzgzu zzgzuVar, Object obj, Object obj2) {
        zzgzu zzgzuVar2 = zzgzu.GET_MEMOIZED_IS_INITIALIZED;
        zzguy zzguyVar = null;
        switch (zzgzuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgvb.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvc();
            case NEW_BUILDER:
                return new zzguz(zzguyVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhbt zzgzqVar = zzb;
                if (zzgzqVar == null) {
                    synchronized (zzgvc.class) {
                        zzgzqVar = zzb;
                        if (zzgzqVar == null) {
                            zzgzqVar = new zzgzq(zza);
                            zzb = zzgzqVar;
                        }
                    }
                }
                return zzgzqVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzgvb zze(int i) {
        return (zzgvb) this.zzd.get(i);
    }

    public final List zzh() {
        return this.zzd;
    }
}
