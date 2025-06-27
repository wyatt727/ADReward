package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzewg implements zzewr {
    private final zzgep zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final String zzd;

    zzewg(zzgep zzgepVar, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.zza = zzgepVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzewh zzc() throws Exception {
        boolean zIsCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean zZzE = com.google.android.gms.ads.internal.util.zzt.zzE(this.zzb);
        String str = this.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean zZzF = com.google.android.gms.ads.internal.util.zzt.zzF();
        com.google.android.gms.ads.internal.zzu.zzp();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        int i = applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
        Context context = this.zzb;
        return new zzewh(zIsCallerInstantApp, zZzE, str, zZzF, i, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
