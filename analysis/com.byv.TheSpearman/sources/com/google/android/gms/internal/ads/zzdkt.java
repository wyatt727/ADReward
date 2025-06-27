package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdkt extends zzctv {
    public static final zzfzn zzc = zzfzn.zzr("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzbaa zzA;
    private final Executor zzd;
    private final zzdky zze;
    private final zzdlg zzf;
    private final zzdly zzg;
    private final zzdld zzh;
    private final zzdlj zzi;
    private final zzhip zzj;
    private final zzhip zzk;
    private final zzhip zzl;
    private final zzhip zzm;
    private final zzhip zzn;
    private zzdmu zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbzz zzs;
    private final zzawo zzt;
    private final VersionInfoParcel zzu;
    private final Context zzv;
    private final zzdkv zzw;
    private final zzeod zzx;
    private final Map zzy;
    private final List zzz;

    public zzdkt(zzctu zzctuVar, Executor executor, zzdky zzdkyVar, zzdlg zzdlgVar, zzdly zzdlyVar, zzdld zzdldVar, zzdlj zzdljVar, zzhip zzhipVar, zzhip zzhipVar2, zzhip zzhipVar3, zzhip zzhipVar4, zzhip zzhipVar5, zzbzz zzbzzVar, zzawo zzawoVar, VersionInfoParcel versionInfoParcel, Context context, zzdkv zzdkvVar, zzeod zzeodVar, zzbaa zzbaaVar) {
        super(zzctuVar);
        this.zzd = executor;
        this.zze = zzdkyVar;
        this.zzf = zzdlgVar;
        this.zzg = zzdlyVar;
        this.zzh = zzdldVar;
        this.zzi = zzdljVar;
        this.zzj = zzhipVar;
        this.zzk = zzhipVar2;
        this.zzl = zzhipVar3;
        this.zzm = zzhipVar4;
        this.zzn = zzhipVar5;
        this.zzs = zzbzzVar;
        this.zzt = zzawoVar;
        this.zzu = versionInfoParcel;
        this.zzv = context;
        this.zzw = zzdkvVar;
        this.zzx = zzeodVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzbaaVar;
    }

    public static boolean zzW(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkn)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        long jZzw = com.google.android.gms.ads.internal.util.zzt.zzw(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jZzw >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzko)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzY(Map map) {
        if (map != null) {
            zzfzn zzfznVar = zzc;
            int size = zzfznVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzfznVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzZ() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhV)).booleanValue()) {
            return null;
        }
        zzdmu zzdmuVar = this.zzo;
        if (zzdmuVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper iObjectWrapperZzj = zzdmuVar.zzj();
        if (iObjectWrapperZzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzj);
        }
        return zzdly.zza;
    }

    private final void zzaa(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfc)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        ListenableFuture listenableFutureZzw = this.zze.zzw();
        if (listenableFutureZzw == null) {
            return;
        }
        zzgee.zzr(listenableFutureZzw, new zzdkr(this, "Google", true), this.zzd);
    }

    private final synchronized void zzab(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzZ());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(View view, zzfmy zzfmyVar) {
        zzcgm zzcgmVarZzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzfmyVar == null || zzcgmVarZzr == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzh(zzfmyVar, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzy(zzdmu zzdmuVar) {
        Iterator<String> itKeys;
        View view;
        zzawk zzawkVarZzc;
        if (!this.zzp) {
            this.zzo = zzdmuVar;
            this.zzg.zze(zzdmuVar);
            this.zzf.zzy(zzdmuVar.zzf(), zzdmuVar.zzm(), zzdmuVar.zzn(), zzdmuVar, zzdmuVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcy)).booleanValue() && (zzawkVarZzc = this.zzt.zzc()) != null) {
                zzawkVarZzc.zzo(zzdmuVar.zzf());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbK)).booleanValue()) {
                zzffn zzffnVar = this.zzb;
                if (zzffnVar.zzal && (itKeys = zzffnVar.zzak.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                        this.zzy.put(next, false);
                        if (weakReference != null && (view = (View) weakReference.get()) != null) {
                            zzazz zzazzVar = new zzazz(this.zzv, view);
                            this.zzz.add(zzazzVar);
                            zzazzVar.zzc(new zzdkq(this, next));
                        }
                    }
                }
            }
            if (zzdmuVar.zzi() != null) {
                zzdmuVar.zzi().zzc(this.zzs);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzdmu zzdmuVar) {
        this.zzf.zzz(zzdmuVar.zzf(), zzdmuVar.zzl());
        if (zzdmuVar.zzh() != null) {
            zzdmuVar.zzh().setClickable(false);
            zzdmuVar.zzh().removeAllViews();
        }
        if (zzdmuVar.zzi() != null) {
            zzdmuVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[Catch: all -> 0x00ee, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:17:0x0047, B:20:0x005b, B:21:0x0063, B:23:0x0069, B:25:0x007d, B:27:0x0083, B:30:0x0088, B:32:0x008e, B:35:0x0093, B:37:0x00a5, B:39:0x00ab, B:42:0x00b0, B:44:0x00c2, B:46:0x00ce, B:48:0x00d8, B:50:0x00e2, B:55:0x00e9), top: B:61:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[Catch: all -> 0x00ee, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:17:0x0047, B:20:0x005b, B:21:0x0063, B:23:0x0069, B:25:0x007d, B:27:0x0083, B:30:0x0088, B:32:0x008e, B:35:0x0093, B:37:0x00a5, B:39:0x00ab, B:42:0x00b0, B:44:0x00c2, B:46:0x00ce, B:48:0x00d8, B:50:0x00e2, B:55:0x00e9), top: B:61:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzA(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto L7
            goto Le7
        L7:
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzbK     // Catch: java.lang.Throwable -> Lee
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> Lee
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lee
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto L45
            com.google.android.gms.internal.ads.zzffn r0 = r3.zzb     // Catch: java.lang.Throwable -> Lee
            boolean r0 = r0.zzal     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto L45
            java.util.Map r0 = r3.zzy     // Catch: java.lang.Throwable -> Lee
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> Lee
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lee
        L29:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lee
            java.util.Map r2 = r3.zzy     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> Lee
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Lee
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> Lee
            if (r1 != 0) goto L29
            goto Le7
        L45:
            if (r7 != 0) goto L88
            com.google.android.gms.internal.ads.zzbdq r7 = com.google.android.gms.internal.ads.zzbdz.zzdN     // Catch: java.lang.Throwable -> Lee
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r7 = r0.zza(r7)     // Catch: java.lang.Throwable -> Lee
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lee
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lee
            if (r7 == 0) goto Le7
            if (r5 == 0) goto Le7
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> Lee
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lee
        L63:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto Le7
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> Lee
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lee
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lee
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto L63
            boolean r0 = zzW(r0)     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto L63
            r3.zzab(r4, r5, r6)     // Catch: java.lang.Throwable -> Lee
            monitor-exit(r3)
            return
        L88:
            android.view.View r7 = r3.zzY(r5)     // Catch: java.lang.Throwable -> Lee
            if (r7 != 0) goto L93
            r3.zzab(r4, r5, r6)     // Catch: java.lang.Throwable -> Lee
            monitor-exit(r3)
            return
        L93:
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzdO     // Catch: java.lang.Throwable -> Lee
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> Lee
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lee
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto Lb0
            boolean r7 = zzW(r7)     // Catch: java.lang.Throwable -> Lee
            if (r7 == 0) goto Le7
            r3.zzab(r4, r5, r6)     // Catch: java.lang.Throwable -> Lee
            monitor-exit(r3)
            return
        Lb0:
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzdP     // Catch: java.lang.Throwable -> Lee
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> Lee
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lee
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lee
            if (r0 == 0) goto Le9
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> Lee
            r0.<init>()     // Catch: java.lang.Throwable -> Lee
            r1 = 0
            boolean r1 = r7.getGlobalVisibleRect(r0, r1)     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto Le7
            int r1 = r7.getHeight()     // Catch: java.lang.Throwable -> Lee
            int r2 = r0.height()     // Catch: java.lang.Throwable -> Lee
            if (r1 != r2) goto Le7
            int r7 = r7.getWidth()     // Catch: java.lang.Throwable -> Lee
            int r0 = r0.width()     // Catch: java.lang.Throwable -> Lee
            if (r7 != r0) goto Le7
            r3.zzab(r4, r5, r6)     // Catch: java.lang.Throwable -> Lee
            monitor-exit(r3)
            return
        Le7:
            monitor-exit(r3)
            return
        Le9:
            r3.zzab(r4, r5, r6)     // Catch: java.lang.Throwable -> Lee
            monitor-exit(r3)
            return
        Lee:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdkt.zzA(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzf.zzj(zzcwVar);
    }

    public final synchronized void zzC(View view, View view2, Map map, Map map2, boolean z) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z, zzZ());
        if (this.zzr) {
            zzdky zzdkyVar = this.zze;
            if (zzdkyVar.zzs() != null) {
                zzdkyVar.zzs().zzd("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    public final synchronized void zzD(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlj)).booleanValue()) {
            zzdmu zzdmuVar = this.zzo;
            if (zzdmuVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdmuVar instanceof zzdls;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzw(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized void zzE(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzF(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzG() {
        zzdmu zzdmuVar = this.zzo;
        if (zzdmuVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdmuVar instanceof zzdls;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx(z);
                }
            });
        }
    }

    public final synchronized void zzH() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzI(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfc)).booleanValue()) {
            zzac(view, this.zze.zzu());
            return;
        }
        zzcbw zzcbwVarZzp = this.zze.zzp();
        if (zzcbwVarZzp == null) {
            return;
        }
        zzgee.zzr(zzcbwVarZzp, new zzdks(this, view), this.zzd);
    }

    public final synchronized void zzJ(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzK(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzL(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzM() {
        this.zzf.zzv();
    }

    public final synchronized void zzN(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzw(zzcsVar);
    }

    public final synchronized void zzO(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzx.zza(zzdgVar);
    }

    public final synchronized void zzP(zzbiy zzbiyVar) {
        this.zzf.zzx(zzbiyVar);
    }

    public final synchronized void zzQ(final zzdmu zzdmuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbI)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzy(zzdmuVar);
                }
            });
        } else {
            zzy(zzdmuVar);
        }
    }

    public final synchronized void zzR(final zzdmu zzdmuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbI)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzz(zzdmuVar);
                }
            });
        } else {
            zzz(zzdmuVar);
        }
    }

    public final boolean zzS() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzT() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzU() {
        return this.zzf.zzB();
    }

    public final boolean zzV() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzX(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzC = this.zzf.zzC(bundle);
        this.zzq = zZzC;
        return zZzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdko
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzv();
            }
        });
        super.zzb();
    }

    public final zzdkv zzc() {
        return this.zzw;
    }

    public final zzfmy zzf(String str, boolean z) {
        String str2;
        zzege zzegeVar;
        zzegd zzegdVar;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return null;
        }
        zzdky zzdkyVar = this.zze;
        zzcgm zzcgmVarZzr = zzdkyVar.zzr();
        zzcgm zzcgmVarZzs = zzdkyVar.zzs();
        if (zzcgmVarZzr == null && zzcgmVarZzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z2 = false;
        boolean z3 = zzcgmVarZzr != null;
        boolean z4 = zzcgmVarZzs != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfa)).booleanValue()) {
            this.zzh.zza();
            int iZzb = this.zzh.zza().zzb();
            int i = iZzb - 1;
            if (i != 0) {
                if (i != 1) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unknown omid media type: " + (iZzb != 1 ? iZzb != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return null;
                }
                if (zzcgmVarZzr == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
                z4 = false;
                z2 = true;
            } else {
                if (zzcgmVarZzs == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid media type was video but there was no video webview.");
                    return null;
                }
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzcgmVarZzr = zzcgmVarZzs;
        }
        zzcgmVarZzr.zzG();
        if (!com.google.android.gms.ads.internal.zzu.zzA().zzj(this.zzv)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        VersionInfoParcel versionInfoParcel = this.zzu;
        String str3 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
        if (z4) {
            zzegdVar = zzegd.VIDEO;
            zzegeVar = zzege.DEFINED_BY_JAVASCRIPT;
        } else {
            zzdky zzdkyVar2 = this.zze;
            zzegd zzegdVar2 = zzegd.NATIVE_DISPLAY;
            zzegeVar = zzdkyVar2.zzc() == 3 ? zzege.UNSPECIFIED : zzege.ONE_PIXEL;
            zzegdVar = zzegdVar2;
        }
        zzfmy zzfmyVarZzb = com.google.android.gms.ads.internal.zzu.zzA().zzb(str3, zzcgmVarZzr.zzG(), "", "javascript", str2, str, zzegeVar, zzegdVar, this.zzb.zzam);
        if (zzfmyVarZzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.zze.zzW(zzfmyVarZzb);
        zzcgmVarZzr.zzaq(zzfmyVarZzb);
        if (z4) {
            com.google.android.gms.ads.internal.zzu.zzA().zzh(zzfmyVarZzb, zzcgmVarZzs.zzF());
            this.zzr = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzu.zzA().zzi(zzfmyVarZzb);
            zzcgmVarZzr.zzd("onSdkLoaded", new ArrayMap());
        }
        return zzfmyVarZzb;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzZ());
    }

    @Override // com.google.android.gms.internal.ads.zzctv
    public final void zzj() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkl
            @Override // java.lang.Runnable
            public final void run() {
                zzdkt.zzr(this.zza);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdlg zzdlgVar = this.zzf;
            Objects.requireNonNull(zzdlgVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkm
                @Override // java.lang.Runnable
                public final void run() {
                    zzdlgVar.zzp();
                }
            });
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzZ());
    }

    public final void zzt(View view) {
        zzfmy zzfmyVarZzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzfmyVarZzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzf(zzfmyVarZzu, view);
    }

    public final synchronized void zzu() {
        this.zzf.zzh();
    }

    final /* synthetic */ void zzv() {
        this.zzf.zzi();
        this.zze.zzI();
    }

    final /* synthetic */ void zzw(View view, boolean z, int i) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), i);
    }

    final /* synthetic */ void zzx(boolean z) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), 0);
    }

    public static /* synthetic */ void zzr(zzdkt zzdktVar) {
        try {
            zzdky zzdkyVar = zzdktVar.zze;
            int iZzc = zzdkyVar.zzc();
            if (iZzc == 1) {
                if (zzdktVar.zzi.zzb() != null) {
                    zzdktVar.zzaa("Google", true);
                    zzdktVar.zzi.zzb().zze((zzbhv) zzdktVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 2) {
                if (zzdktVar.zzi.zza() != null) {
                    zzdktVar.zzaa("Google", true);
                    zzdktVar.zzi.zza().zze((zzbht) zzdktVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 3) {
                if (zzdktVar.zzi.zzd(zzdkyVar.zzA()) != null) {
                    if (zzdktVar.zze.zzs() != null) {
                        zzdktVar.zzf("Google", true);
                    }
                    zzdktVar.zzi.zzd(zzdktVar.zze.zzA()).zze((zzbhy) zzdktVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 6) {
                if (zzdktVar.zzi.zzf() != null) {
                    zzdktVar.zzaa("Google", true);
                    zzdktVar.zzi.zzf().zze((zzbjb) zzdktVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzc != 7) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrong native template id!");
                return;
            }
            zzdlj zzdljVar = zzdktVar.zzi;
            if (zzdljVar.zzg() != null) {
                zzdljVar.zzg().zzg((zzbnl) zzdktVar.zzm.zzb());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }
}
