package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzkw implements zzlz {
    private static final zzlf zza = new zzkv();
    private final zzlf zzb;

    private static zzlf zza() {
        try {
            return (zzlf) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zza;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlz
    public final <T> zzma<T> zza(Class<T> cls) {
        zzmc.zza((Class<?>) cls);
        zzlg zzlgVarZza = this.zzb.zza(cls);
        if (zzlgVarZza.zzc()) {
            if (zzjv.class.isAssignableFrom(cls)) {
                return zzlo.zza(zzmc.zzb(), zzjm.zzb(), zzlgVarZza.zza());
            }
            return zzlo.zza(zzmc.zza(), zzjm.zza(), zzlgVarZza.zza());
        }
        if (zzjv.class.isAssignableFrom(cls)) {
            if (zza(zzlgVarZza)) {
                return zzlm.zza(cls, zzlgVarZza, zzls.zzb(), zzkn.zzb(), zzmc.zzb(), zzjm.zzb(), zzld.zzb());
            }
            return zzlm.zza(cls, zzlgVarZza, zzls.zzb(), zzkn.zzb(), zzmc.zzb(), (zzjk<?>) null, zzld.zzb());
        }
        if (zza(zzlgVarZza)) {
            return zzlm.zza(cls, zzlgVarZza, zzls.zza(), zzkn.zza(), zzmc.zza(), zzjm.zza(), zzld.zza());
        }
        return zzlm.zza(cls, zzlgVarZza, zzls.zza(), zzkn.zza(), zzmc.zza(), (zzjk<?>) null, zzld.zza());
    }

    public zzkw() {
        this(new zzkx(zzjt.zza(), zza()));
    }

    private zzkw(zzlf zzlfVar) {
        this.zzb = (zzlf) zzjy.zza(zzlfVar, "messageInfoFactory");
    }

    private static boolean zza(zzlg zzlgVar) {
        return zzky.zza[zzlgVar.zzb().ordinal()] != 1;
    }
}
