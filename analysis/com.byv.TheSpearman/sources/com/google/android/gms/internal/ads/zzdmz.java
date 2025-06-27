package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzdmz implements zzdlg {
    private final zzbrd zza;
    private final zzczi zzb;
    private final zzcyo zzc;
    private final zzdgl zzd;
    private final Context zze;
    private final zzffn zzf;
    private final VersionInfoParcel zzg;
    private final zzfgi zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbqz zzl;
    private final zzbra zzm;

    public zzdmz(zzbqz zzbqzVar, zzbra zzbraVar, zzbrd zzbrdVar, zzczi zzcziVar, zzcyo zzcyoVar, zzdgl zzdglVar, Context context, zzffn zzffnVar, VersionInfoParcel versionInfoParcel, zzfgi zzfgiVar) {
        this.zzl = zzbqzVar;
        this.zzm = zzbraVar;
        this.zza = zzbrdVar;
        this.zzb = zzcziVar;
        this.zzc = zzcyoVar;
        this.zzd = zzdglVar;
        this.zze = context;
        this.zzf = zzffnVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzfgiVar;
    }

    private final void zzb(View view) {
        try {
            zzbrd zzbrdVar = this.zza;
            if (zzbrdVar != null && !zzbrdVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkv)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbqz zzbqzVar = this.zzl;
            if (zzbqzVar != null && !zzbqzVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkv)).booleanValue()) {
                    this.zzd.zzdG();
                    return;
                }
                return;
            }
            zzbra zzbraVar = this.zzm;
            if (zzbraVar == null || zzbraVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkv)).booleanValue()) {
                this.zzd.zzdG();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final boolean zzA() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final boolean zzB() {
        return this.zzf.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final boolean zzC(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzk(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzm(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzo(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzf.zzM) {
            zzb(view2);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzu.zzs().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbrd zzbrdVar = this.zza;
                if (zzbrdVar != null && !zzbrdVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbqz zzbqzVar = this.zzl;
                if (zzbqzVar != null && !zzbqzVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbra zzbraVar = this.zzm;
                if (zzbraVar == null || zzbraVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzt(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzu(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzv() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzx(zzbiy zzbiyVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc A[Catch: JSONException -> 0x0045, RemoteException -> 0x0122, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0122, blocks: (B:2:0x0000, B:4:0x001c, B:8:0x0026, B:11:0x002f, B:13:0x0036, B:14:0x0045, B:16:0x004b, B:18:0x0057, B:21:0x0062, B:24:0x0069, B:26:0x007f, B:28:0x0087, B:43:0x00a6, B:33:0x0091, B:37:0x009a, B:46:0x00ad, B:47:0x00b1, B:48:0x00c6, B:50:0x00cc, B:54:0x00de, B:56:0x00ec, B:58:0x00f8, B:60:0x00fc, B:62:0x010d, B:64:0x0111), top: B:72:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzdlg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzy(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdmz.zzy(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzz(View view, Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbrd zzbrdVar = this.zza;
            if (zzbrdVar != null) {
                zzbrdVar.zzz(iObjectWrapperWrap);
                return;
            }
            zzbqz zzbqzVar = this.zzl;
            if (zzbqzVar != null) {
                zzbqzVar.zzw(iObjectWrapperWrap);
                return;
            }
            zzbra zzbraVar = this.zzm;
            if (zzbraVar != null) {
                zzbraVar.zzu(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to call untrackView", e);
        }
    }
}
