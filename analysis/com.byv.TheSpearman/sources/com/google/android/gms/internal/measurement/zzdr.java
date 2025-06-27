package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzds;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.0 */
/* loaded from: classes3.dex */
final class zzdr extends zzds.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzds zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdr(zzds zzdsVar, String str, String str2, Context context, Bundle bundle) {
        super(zzdsVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
        this.zzg = zzdsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzds.zza
    public final void zza() {
        String str;
        String str2;
        String str3;
        try {
            if (this.zzg.zzc(this.zzc, this.zzd)) {
                String str4 = this.zzd;
                str2 = this.zzc;
                str3 = str4;
                str = this.zzg.zzc;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.zze);
            zzds zzdsVar = this.zzg;
            zzdsVar.zzj = zzdsVar.zza(this.zze, true);
            if (this.zzg.zzj == null) {
                Log.w(this.zzg.zzc, "Failed to connect to measurement client.");
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.zze, ModuleDescriptor.MODULE_ID);
            ((zzdd) Preconditions.checkNotNull(this.zzg.zzj)).initialize(ObjectWrapper.wrap(this.zze), new zzdq(92000L, Math.max(localVersion, r0), DynamiteModule.getRemoteVersion(this.zze, ModuleDescriptor.MODULE_ID) < localVersion, str, str2, str3, this.zzf, com.google.android.gms.measurement.internal.zzhg.zza(this.zze)), this.zza);
        } catch (Exception e) {
            this.zzg.zza(e, true, false);
        }
    }
}
