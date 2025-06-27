package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhbd implements zzhch {
    private static final zzhbj zza = new zzhbb();
    private final zzhbj zzb;

    public zzhbd() {
        zzhbj zzhbjVar;
        zzhbj[] zzhbjVarArr = new zzhbj[2];
        zzhbjVarArr[0] = zzgzo.zza();
        try {
            zzhbjVar = (zzhbj) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzhbjVar = zza;
        }
        zzhbjVarArr[1] = zzhbjVar;
        zzhbc zzhbcVar = new zzhbc(zzhbjVarArr);
        byte[] bArr = zzhai.zzd;
        this.zzb = zzhbcVar;
    }

    private static boolean zzb(zzhbi zzhbiVar) {
        return zzhbiVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhch
    public final zzhcg zza(Class cls) {
        zzhci.zzs(cls);
        zzhbi zzhbiVarZzb = this.zzb.zzb(cls);
        return zzhbiVarZzb.zzb() ? zzgzv.class.isAssignableFrom(cls) ? zzhbp.zzc(zzhci.zzn(), zzgzi.zzb(), zzhbiVarZzb.zza()) : zzhbp.zzc(zzhci.zzm(), zzgzi.zza(), zzhbiVarZzb.zza()) : zzgzv.class.isAssignableFrom(cls) ? zzb(zzhbiVarZzb) ? zzhbo.zzl(cls, zzhbiVarZzb, zzhbs.zzb(), zzhaz.zze(), zzhci.zzn(), zzgzi.zzb(), zzhbh.zzb()) : zzhbo.zzl(cls, zzhbiVarZzb, zzhbs.zzb(), zzhaz.zze(), zzhci.zzn(), null, zzhbh.zzb()) : zzb(zzhbiVarZzb) ? zzhbo.zzl(cls, zzhbiVarZzb, zzhbs.zza(), zzhaz.zzd(), zzhci.zzm(), zzgzi.zza(), zzhbh.zza()) : zzhbo.zzl(cls, zzhbiVarZzb, zzhbs.zza(), zzhaz.zzd(), zzhci.zzm(), null, zzhbh.zza());
    }
}
