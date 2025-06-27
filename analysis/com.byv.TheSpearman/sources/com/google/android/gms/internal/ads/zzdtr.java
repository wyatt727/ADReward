package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdtr {
    public static final zzfzn zza;
    public static final zzfzn zzb;
    private final String zzc;
    private final zzdtq zzd;
    private final zzdtq zze;

    static {
        zzdtq zzdtqVar = zzdtq.PUBLIC_API_CALL;
        zzdtq zzdtqVar2 = zzdtq.PUBLIC_API_CALLBACK;
        zzdtr zzdtrVar = new zzdtr("tqgt", zzdtqVar, zzdtqVar2);
        zzdtq zzdtqVar3 = zzdtq.PUBLIC_API_CALL;
        zzdtq zzdtqVar4 = zzdtq.DYNAMITE_ENTER;
        zzdtr zzdtrVar2 = new zzdtr("l.dl", zzdtqVar3, zzdtqVar4);
        zzdtq zzdtqVar5 = zzdtq.CLIENT_SIGNALS_START;
        zzdtr zzdtrVar3 = new zzdtr("l.rcc", zzdtqVar4, zzdtqVar5);
        zzdtq zzdtqVar6 = zzdtq.CLIENT_SIGNALS_END;
        zzdtr zzdtrVar4 = new zzdtr("l.cs", zzdtqVar5, zzdtqVar6);
        zzdtr zzdtrVar5 = new zzdtr("l.cts", zzdtqVar6, zzdtq.SERVICE_CONNECTED);
        zzdtq zzdtqVar7 = zzdtq.GMS_SIGNALS_START;
        zzdtq zzdtqVar8 = zzdtq.GMS_SIGNALS_END;
        zzdtr zzdtrVar6 = new zzdtr("l.gs", zzdtqVar7, zzdtqVar8);
        zzdtq zzdtqVar9 = zzdtq.GET_SIGNALS_SDKCORE_START;
        zzdtr zzdtrVar7 = new zzdtr("l.jse", zzdtqVar8, zzdtqVar9);
        zzdtq zzdtqVar10 = zzdtq.GET_SIGNALS_SDKCORE_END;
        zza = zzfzn.zzs(zzdtrVar, zzdtrVar2, zzdtrVar3, zzdtrVar4, zzdtrVar5, zzdtrVar6, zzdtrVar7, new zzdtr("l.gs-sdkcore", zzdtqVar9, zzdtqVar10), new zzdtr("l.gs-pp", zzdtqVar10, zzdtqVar2));
        zzdtq zzdtqVar11 = zzdtq.PUBLIC_API_CALL;
        zzdtr zzdtrVar8 = new zzdtr("l.al", zzdtqVar11, zzdtq.PUBLIC_API_CALLBACK);
        zzdtq zzdtqVar12 = zzdtq.DYNAMITE_ENTER;
        zzdtr zzdtrVar9 = new zzdtr("l.dl", zzdtqVar11, zzdtqVar12);
        zzdtq zzdtqVar13 = zzdtq.CLIENT_SIGNALS_START;
        zzdtr zzdtrVar10 = new zzdtr("l.rcc", zzdtqVar12, zzdtqVar13);
        zzdtq zzdtqVar14 = zzdtq.CLIENT_SIGNALS_END;
        zzdtr zzdtrVar11 = new zzdtr("l.cs", zzdtqVar13, zzdtqVar14);
        zzdtr zzdtrVar12 = new zzdtr("l.cts", zzdtqVar14, zzdtq.SERVICE_CONNECTED);
        zzdtq zzdtqVar15 = zzdtq.GMS_SIGNALS_START;
        zzdtq zzdtqVar16 = zzdtq.GMS_SIGNALS_END;
        zzdtr zzdtrVar13 = new zzdtr("l.gs", zzdtqVar15, zzdtqVar16);
        zzdtq zzdtqVar17 = zzdtq.GET_AD_DICTIONARY_SDKCORE_START;
        zzdtr zzdtrVar14 = new zzdtr("l.jse", zzdtqVar16, zzdtqVar17);
        zzdtq zzdtqVar18 = zzdtq.GET_AD_DICTIONARY_SDKCORE_END;
        zzdtr zzdtrVar15 = new zzdtr("l.gad-js", zzdtqVar17, zzdtqVar18);
        zzdtq zzdtqVar19 = zzdtq.HTTP_RESPONSE_READY;
        zzb = zzfzn.zzt(zzdtrVar8, zzdtrVar9, zzdtrVar10, zzdtrVar11, zzdtrVar12, zzdtrVar13, zzdtrVar14, zzdtrVar15, new zzdtr("l.http", zzdtqVar18, zzdtqVar19), new zzdtr("l.nml-js", zzdtqVar19, zzdtq.SERVER_RESPONSE_PARSE_START));
    }

    public zzdtr(String str, zzdtq zzdtqVar, zzdtq zzdtqVar2) {
        this.zzc = str;
        this.zzd = zzdtqVar;
        this.zze = zzdtqVar2;
    }

    public final zzdtq zza() {
        return this.zzd;
    }

    public final zzdtq zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }
}
