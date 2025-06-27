package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdpf extends zzbhx {
    private final Context zza;
    private final zzdky zzb;
    private zzdly zzc;
    private zzdkt zzd;

    public zzdpf(Context context, zzdky zzdkyVar, zzdly zzdlyVar, zzdkt zzdktVar) {
        this.zza = context;
        this.zzb = zzdkyVar;
        this.zzc = zzdlyVar;
        this.zzd = zzdktVar;
    }

    private final zzbgs zzd(String str) {
        return new zzdpe(this, NativeCustomFormatAd.ASSET_NAME_VIDEO);
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final zzbhb zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final zzbhe zzg(String str) {
        return (zzbhe) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final List zzk() {
        try {
            SimpleArrayMap simpleArrayMapZzh = this.zzb.zzh();
            SimpleArrayMap simpleArrayMapZzi = this.zzb.zzi();
            String[] strArr = new String[simpleArrayMapZzh.size() + simpleArrayMapZzi.size()];
            int i = 0;
            for (int i2 = 0; i2 < simpleArrayMapZzh.size(); i2++) {
                strArr[i] = (String) simpleArrayMapZzh.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < simpleArrayMapZzi.size(); i3++) {
                strArr[i] = (String) simpleArrayMapZzi.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final void zzl() {
        zzdkt zzdktVar = this.zzd;
        if (zzdktVar != null) {
            zzdktVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final void zzm() {
        try {
            String strZzC = this.zzb.zzC();
            if (Objects.equals(strZzC, "Google")) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(strZzC)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            zzdkt zzdktVar = this.zzd;
            if (zzdktVar != null) {
                zzdktVar.zzf(strZzC, false);
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final void zzn(String str) {
        zzdkt zzdktVar = this.zzd;
        if (zzdktVar != null) {
            zzdktVar.zzE(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final void zzo() {
        zzdkt zzdktVar = this.zzd;
        if (zzdktVar != null) {
            zzdktVar.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdkt zzdktVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzu() == null || (zzdktVar = this.zzd) == null) {
            return;
        }
        zzdktVar.zzI((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final boolean zzq() {
        zzdkt zzdktVar = this.zzd;
        return (zzdktVar == null || zzdktVar.zzV()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdly zzdlyVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdlyVar = this.zzc) == null || !zzdlyVar.zzf((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzq().zzap(zzd(NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdly zzdlyVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdlyVar = this.zzc) == null || !zzdlyVar.zzg((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzs().zzap(zzd(NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final boolean zzt() {
        zzfmy zzfmyVarZzu = this.zzb.zzu();
        if (zzfmyVarZzu == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzi(zzfmyVarZzu);
        if (this.zzb.zzr() == null) {
            return true;
        }
        this.zzb.zzr().zzd("onSdkLoaded", new ArrayMap());
        return true;
    }
}
