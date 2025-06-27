package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcfz extends zzcde implements zzhy, zzms {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcfk zzc;
    private final zzyx zzd;
    private final zzcdm zze;
    private final WeakReference zzf;
    private final zzwn zzg;
    private zzjj zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcdd zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcfm zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzcfz(android.content.Context r4, com.google.android.gms.internal.ads.zzcdm r5, com.google.android.gms.internal.ads.zzcdn r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfz.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcdm, com.google.android.gms.internal.ads.zzcdn, java.lang.Integer):void");
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j = this.zzn;
                Map mapZze = ((zzht) this.zzs.remove(0)).zze();
                long j2 = 0;
                if (mapZze != null) {
                    Iterator it = mapZze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzfvx.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j + j2;
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzH() {
        zzjj zzjjVar = this.zzh;
        if (zzjjVar != null) {
            zzjjVar.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzI(long j) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzd(), j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzJ(int i) {
        this.zzc.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzK(int i) {
        this.zzc.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzL(zzcdd zzcddVar) {
        this.zzk = zzcddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzM(int i) {
        this.zzc.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzN(int i) {
        this.zzc.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzO(boolean z) {
        this.zzh.zzr(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzQ(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzy();
            if (i >= 2) {
                return;
            }
            zzyx zzyxVar = this.zzd;
            zzyj zzyjVarZzc = zzyxVar.zzf().zzc();
            zzyjVarZzc.zzp(i, !z);
            zzyxVar.zzl(zzyjVarZzc);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzR(int i) throws SocketException {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcfj zzcfjVar = (zzcfj) ((WeakReference) it.next()).get();
            if (zzcfjVar != null) {
                zzcfjVar.zzm(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzS(Surface surface, boolean z) {
        zzjj zzjjVar = this.zzh;
        if (zzjjVar != null) {
            zzjjVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzT(float f, boolean z) {
        zzjj zzjjVar = this.zzh;
        if (zzjjVar != null) {
            zzjjVar.zzt(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzV() {
        return this.zzh != null;
    }

    final /* synthetic */ zzgv zzW(String str, boolean z) {
        zzcfz zzcfzVar = true != z ? null : this;
        zzcdm zzcdmVar = this.zze;
        return new zzcgc(str, zzcfzVar, zzcdmVar.zzd, zzcdmVar.zzf, zzcdmVar.zzn, zzcdmVar.zzo);
    }

    final /* synthetic */ zzgv zzX(String str, boolean z) {
        zzcfz zzcfzVar = true != z ? null : this;
        zzcdm zzcdmVar = this.zze;
        zzcfj zzcfjVar = new zzcfj(str, zzcfzVar, zzcdmVar.zzd, zzcdmVar.zzf, zzcdmVar.zzi);
        this.zzu.add(new WeakReference(zzcfjVar));
        return zzcfjVar;
    }

    final /* synthetic */ zzgv zzY(String str, boolean z) {
        zzhe zzheVar = new zzhe();
        zzheVar.zzf(str);
        zzheVar.zze(true != z ? null : this);
        zzheVar.zzc(this.zze.zzd);
        zzheVar.zzd(this.zze.zzf);
        zzheVar.zzb(true);
        return zzheVar.zza();
    }

    final /* synthetic */ zzgv zzZ(zzgu zzguVar) {
        zzgv zzgvVarZza = zzguVar.zza();
        zzcfx zzcfxVar = new zzcfx(this);
        return new zzcfm(this.zzb, zzgvVarZza, this.zzo, this.zzp, this, zzcfxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zza(zzgv zzgvVar, zzhb zzhbVar, boolean z, int i) {
        this.zzl += i;
    }

    final zzvj zzaa(Uri uri) {
        zzar zzarVar = new zzar();
        zzarVar.zzb(uri);
        zzbp zzbpVarZzc = zzarVar.zzc();
        zzwn zzwnVar = this.zzg;
        zzwnVar.zza(this.zze.zzg);
        return zzwnVar.zzb(zzbpVarZzc);
    }

    final /* synthetic */ void zzab(boolean z, long j) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            zzcddVar.zzi(z, j);
        }
    }

    final /* synthetic */ zzmf[] zzac(Handler handler, zzabv zzabvVar, zzqg zzqgVar, zzxn zzxnVar, zzug zzugVar) {
        zztq zztqVar = zztq.zzb;
        Context context = this.zzb;
        zzrx zzrxVar = new zzrx(context, new zztc(context), zztqVar, false, handler, zzqgVar, new zzrd(context).zzd());
        zztq zztqVar2 = zztq.zzb;
        Context context2 = this.zzb;
        return new zzmf[]{zzrxVar, new zzaaw(context2, new zztc(context2), zztqVar2, 0L, false, handler, zzabvVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzb(zzgv zzgvVar, zzhb zzhbVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzc(zzgv zzgvVar, zzhb zzhbVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzd(zzgv zzgvVar, zzhb zzhbVar, boolean z) {
        if (zzgvVar instanceof zzht) {
            synchronized (this.zzq) {
                this.zzs.add((zzht) zzgvVar);
            }
        } else if (zzgvVar instanceof zzcfm) {
            this.zzt = (zzcfm) zzgvVar;
            final zzcdn zzcdnVar = (zzcdn) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue() && zzcdnVar != null && this.zzt.zzn()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfv
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = zzcfz.zza;
                        zzcdnVar.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zze(zzmq zzmqVar, zzam zzamVar, zzis zzisVar) {
        zzcdn zzcdnVar = (zzcdn) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue() || zzcdnVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzamVar.zzl;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzcdnVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzf(zzmq zzmqVar, int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzg(zzmq zzmqVar, zzvd zzvdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzh(zzmq zzmqVar, int i, long j) {
        this.zzm += i;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzi(zzco zzcoVar, zzmr zzmrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzj(zzmq zzmqVar, zzuy zzuyVar, zzvd zzvdVar, IOException iOException, boolean z) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            if (this.zze.zzk) {
                zzcddVar.zzl("onLoadException", iOException);
            } else {
                zzcddVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzk(zzmq zzmqVar, int i) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            zzcddVar.zzm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzl(zzmq zzmqVar, zzce zzceVar) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            zzcddVar.zzk("onPlayerError", zzceVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzm(zzmq zzmqVar, zzcn zzcnVar, zzcn zzcnVar2, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzn(zzmq zzmqVar, Object obj, long j) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            zzcddVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzo(zzmq zzmqVar, zzir zzirVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzp(zzmq zzmqVar, zzam zzamVar, zzis zzisVar) {
        zzcdn zzcdnVar = (zzcdn) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue() || zzcdnVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzamVar.zzt));
        map.put("bitRate", String.valueOf(zzamVar.zzi));
        map.put("resolution", zzamVar.zzr + "x" + zzamVar.zzs);
        String str = zzamVar.zzl;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzcdnVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzq(zzmq zzmqVar, zzdp zzdpVar) {
        zzcdd zzcddVar = this.zzk;
        if (zzcddVar != null) {
            zzcddVar.zzD(zzdpVar.zzc, zzdpVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final long zzz() {
        return this.zzh.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzvj zzvyVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzvyVar = zzaa(uriArr[0]);
            } else {
                zzvj[] zzvjVarArr = new zzvj[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzvjVarArr[i] = zzaa(uriArr[i]);
                }
                zzvyVar = new zzvy(false, false, zzvjVarArr);
            }
            this.zzh.zzB(zzvyVar);
            this.zzh.zzp();
            zzE().incrementAndGet();
        }
    }
}
