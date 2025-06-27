package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.json.id;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzfid extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfid> CREATOR = new zzfie();

    @Nullable
    public final Context zza;
    public final zzfia zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfia[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfid(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfia[] zzfiaVarArrValues = zzfia.values();
        this.zzh = zzfiaVarArrValues;
        int[] iArrZza = zzfib.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfic.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfiaVarArrValues[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = iArrZza[i5];
        this.zzk = i6;
        int i7 = iArrZza2[i6];
    }

    @Nullable
    public static zzfid zza(zzfia zzfiaVar, Context context) {
        if (zzfiaVar == zzfia.Rewarded) {
            return new zzfid(context, zzfiaVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgw)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgC)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgE)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgG), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgy), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgA));
        }
        if (zzfiaVar == zzfia.Interstitial) {
            return new zzfid(context, zzfiaVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgx)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgD)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgF)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgH), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgz), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgB));
        }
        if (zzfiaVar != zzfia.AppOpen) {
            return null;
        }
        return new zzfid(context, zzfiaVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgK)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgM)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgN)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgI), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgJ), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgL));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfid(@Nullable Context context, zzfia zzfiaVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfia.values();
        this.zzl = zzfib.zza();
        this.zzm = zzfic.zza();
        this.zza = context;
        this.zzi = zzfiaVar.ordinal();
        this.zzb = zzfiaVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        id.g.equals(str3);
        this.zzk = 0;
    }
}
