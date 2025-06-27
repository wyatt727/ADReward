package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.json.t2;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdky {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbgx zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzcgm zzi;
    private zzcgm zzj;
    private zzcgm zzk;
    private zzfmy zzl;
    private ListenableFuture zzm;
    private zzcbw zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbhe zzs;
    private zzbhe zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdky zzag(zzbqz zzbqzVar) {
        try {
            zzdkx zzdkxVarZzak = zzak(zzbqzVar.zzg(), null);
            zzbgx zzbgxVarZzh = zzbqzVar.zzh();
            View view = (View) zzam(zzbqzVar.zzj());
            String strZzo = zzbqzVar.zzo();
            List listZzr = zzbqzVar.zzr();
            String strZzm = zzbqzVar.zzm();
            Bundle bundleZzf = zzbqzVar.zzf();
            String strZzn = zzbqzVar.zzn();
            View view2 = (View) zzam(zzbqzVar.zzk());
            IObjectWrapper iObjectWrapperZzl = zzbqzVar.zzl();
            String strZzq = zzbqzVar.zzq();
            String strZzp = zzbqzVar.zzp();
            double dZze = zzbqzVar.zze();
            zzbhe zzbheVarZzi = zzbqzVar.zzi();
            zzdky zzdkyVar = new zzdky();
            zzdkyVar.zza = 2;
            zzdkyVar.zzb = zzdkxVarZzak;
            zzdkyVar.zzc = zzbgxVarZzh;
            zzdkyVar.zzd = view;
            zzdkyVar.zzZ("headline", strZzo);
            zzdkyVar.zze = listZzr;
            zzdkyVar.zzZ("body", strZzm);
            zzdkyVar.zzh = bundleZzf;
            zzdkyVar.zzZ("call_to_action", strZzn);
            zzdkyVar.zzo = view2;
            zzdkyVar.zzq = iObjectWrapperZzl;
            zzdkyVar.zzZ("store", strZzq);
            zzdkyVar.zzZ("price", strZzp);
            zzdkyVar.zzr = dZze;
            zzdkyVar.zzs = zzbheVarZzi;
            return zzdkyVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdky zzah(zzbra zzbraVar) {
        try {
            zzdkx zzdkxVarZzak = zzak(zzbraVar.zzf(), null);
            zzbgx zzbgxVarZzg = zzbraVar.zzg();
            View view = (View) zzam(zzbraVar.zzi());
            String strZzo = zzbraVar.zzo();
            List listZzp = zzbraVar.zzp();
            String strZzm = zzbraVar.zzm();
            Bundle bundleZze = zzbraVar.zze();
            String strZzn = zzbraVar.zzn();
            View view2 = (View) zzam(zzbraVar.zzj());
            IObjectWrapper iObjectWrapperZzk = zzbraVar.zzk();
            String strZzl = zzbraVar.zzl();
            zzbhe zzbheVarZzh = zzbraVar.zzh();
            zzdky zzdkyVar = new zzdky();
            zzdkyVar.zza = 1;
            zzdkyVar.zzb = zzdkxVarZzak;
            zzdkyVar.zzc = zzbgxVarZzg;
            zzdkyVar.zzd = view;
            zzdkyVar.zzZ("headline", strZzo);
            zzdkyVar.zze = listZzp;
            zzdkyVar.zzZ("body", strZzm);
            zzdkyVar.zzh = bundleZze;
            zzdkyVar.zzZ("call_to_action", strZzn);
            zzdkyVar.zzo = view2;
            zzdkyVar.zzq = iObjectWrapperZzk;
            zzdkyVar.zzZ(t2.h.F0, strZzl);
            zzdkyVar.zzt = zzbheVarZzh;
            return zzdkyVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdky zzai(zzbqz zzbqzVar) {
        try {
            return zzal(zzak(zzbqzVar.zzg(), null), zzbqzVar.zzh(), (View) zzam(zzbqzVar.zzj()), zzbqzVar.zzo(), zzbqzVar.zzr(), zzbqzVar.zzm(), zzbqzVar.zzf(), zzbqzVar.zzn(), (View) zzam(zzbqzVar.zzk()), zzbqzVar.zzl(), zzbqzVar.zzq(), zzbqzVar.zzp(), zzbqzVar.zze(), zzbqzVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdky zzaj(zzbra zzbraVar) {
        try {
            return zzal(zzak(zzbraVar.zzf(), null), zzbraVar.zzg(), (View) zzam(zzbraVar.zzi()), zzbraVar.zzo(), zzbraVar.zzp(), zzbraVar.zzm(), zzbraVar.zze(), zzbraVar.zzn(), (View) zzam(zzbraVar.zzj()), zzbraVar.zzk(), null, null, -1.0d, zzbraVar.zzh(), zzbraVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdkx zzak(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbrd zzbrdVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdkx(zzdqVar, zzbrdVar);
    }

    private static zzdky zzal(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbgx zzbgxVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbhe zzbheVar, String str6, float f) {
        zzdky zzdkyVar = new zzdky();
        zzdkyVar.zza = 6;
        zzdkyVar.zzb = zzdqVar;
        zzdkyVar.zzc = zzbgxVar;
        zzdkyVar.zzd = view;
        zzdkyVar.zzZ("headline", str);
        zzdkyVar.zze = list;
        zzdkyVar.zzZ("body", str2);
        zzdkyVar.zzh = bundle;
        zzdkyVar.zzZ("call_to_action", str3);
        zzdkyVar.zzo = view2;
        zzdkyVar.zzq = iObjectWrapper;
        zzdkyVar.zzZ("store", str4);
        zzdkyVar.zzZ("price", str5);
        zzdkyVar.zzr = d;
        zzdkyVar.zzs = zzbheVar;
        zzdkyVar.zzZ(t2.h.F0, str6);
        zzdkyVar.zzR(f);
        return zzdkyVar;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdky zzt(zzbrd zzbrdVar) {
        try {
            return zzal(zzak(zzbrdVar.zzj(), zzbrdVar), zzbrdVar.zzk(), (View) zzam(zzbrdVar.zzm()), zzbrdVar.zzs(), zzbrdVar.zzv(), zzbrdVar.zzq(), zzbrdVar.zzi(), zzbrdVar.zzr(), (View) zzam(zzbrdVar.zzn()), zzbrdVar.zzo(), zzbrdVar.zzu(), zzbrdVar.zzt(), zzbrdVar.zze(), zzbrdVar.zzl(), zzbrdVar.zzp(), zzbrdVar.zzf());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcgm zzcgmVar = this.zzi;
        if (zzcgmVar != null) {
            zzcgmVar.destroy();
            this.zzi = null;
        }
        zzcgm zzcgmVar2 = this.zzj;
        if (zzcgmVar2 != null) {
            zzcgmVar2.destroy();
            this.zzj = null;
        }
        zzcgm zzcgmVar3 = this.zzk;
        if (zzcgmVar3 != null) {
            zzcgmVar3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzcbw zzcbwVar = this.zzn;
        if (zzcbwVar != null) {
            zzcbwVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzbgx zzbgxVar) {
        this.zzc = zzbgxVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zzg = zzelVar;
    }

    public final synchronized void zzM(zzbhe zzbheVar) {
        this.zzs = zzbheVar;
    }

    public final synchronized void zzN(String str, zzbgr zzbgrVar) {
        if (zzbgrVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbgrVar);
        }
    }

    public final synchronized void zzO(zzcgm zzcgmVar) {
        this.zzj = zzcgmVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbhe zzbheVar) {
        this.zzt = zzbheVar;
    }

    public final synchronized void zzR(float f) {
        this.zzx = f;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcgm zzcgmVar) {
        this.zzk = zzcgmVar;
    }

    public final synchronized void zzU(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzfmy zzfmyVar) {
        this.zzl = zzfmyVar;
    }

    public final synchronized void zzX(zzcbw zzcbwVar) {
        this.zzn = zzcbwVar;
    }

    public final synchronized void zzY(double d) {
        this.zzr = d;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i) {
        this.zza = i;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcgm zzcgmVar) {
        this.zzi = zzcgmVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized SimpleArrayMap zzh() {
        return this.zzv;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbgx zzl() {
        return this.zzc;
    }

    public final zzbhe zzm() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbhd.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized zzbhe zzn() {
        return this.zzs;
    }

    public final synchronized zzbhe zzo() {
        return this.zzt;
    }

    public final synchronized zzcbw zzp() {
        return this.zzn;
    }

    public final synchronized zzcgm zzq() {
        return this.zzj;
    }

    public final synchronized zzcgm zzr() {
        return this.zzk;
    }

    public final synchronized zzcgm zzs() {
        return this.zzi;
    }

    public final synchronized zzfmy zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized ListenableFuture zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF(t2.h.F0);
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
