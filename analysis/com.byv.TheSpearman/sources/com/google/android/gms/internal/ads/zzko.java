package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.json.t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzko extends zzm implements zzjj {
    public static final /* synthetic */ int zzd = 0;
    private final zzmo zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzmj zzG;
    private zzck zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private zzam zzK;
    private zzam zzL;
    private Object zzM;
    private Surface zzN;
    private int zzO;
    private zzfp zzP;
    private zzir zzQ;
    private zzir zzR;
    private int zzS;
    private zzk zzT;
    private float zzU;
    private boolean zzV;
    private zzee zzW;
    private boolean zzX;
    private boolean zzY;
    private zzaa zzZ;
    private zzdp zzaa;
    private zzbv zzab;
    private zzly zzac;
    private int zzad;
    private long zzae;
    private final zzjk zzaf;
    private zzxb zzag;
    final zzzg zzb;
    final zzck zzc;
    private final zzeo zze;
    private final Context zzf;
    private final zzco zzg;
    private final zzmf[] zzh;
    private final zzzf zzi;
    private final zzev zzj;
    private final zzkz zzk;
    private final zzfb zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcu zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzvg zzq;
    private final zzmp zzr;
    private final Looper zzs;
    private final zzzn zzt;
    private final zzel zzu;
    private final zzkk zzv;
    private final zzkm zzw;
    private final zzil zzx;
    private final zzip zzy;
    private final zzmn zzz;

    static {
        zzbq.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzmp, com.google.android.gms.internal.ads.zzzm, java.lang.Object] */
    public zzko(zzji zzjiVar, zzco zzcoVar) {
        zzeo zzeoVar = new zzeo(zzel.zza);
        this.zze = zzeoVar;
        try {
            zzfe.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.3.0] [" + zzfx.zze + t2.i.e);
            Context applicationContext = zzjiVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? Apply = zzjiVar.zzh.apply(zzjiVar.zzb);
            this.zzr = Apply;
            this.zzT = zzjiVar.zzj;
            this.zzO = zzjiVar.zzk;
            this.zzV = false;
            this.zzB = zzjiVar.zzo;
            zzkk zzkkVar = new zzkk(this, null);
            this.zzv = zzkkVar;
            zzkm zzkmVar = new zzkm(null);
            this.zzw = zzkmVar;
            Handler handler = new Handler(zzjiVar.zzi);
            zzmf[] zzmfVarArrZza = ((zzjb) zzjiVar.zzc).zza.zza(handler, zzkkVar, zzkkVar, zzkkVar, zzkkVar);
            this.zzh = zzmfVarArrZza;
            int length = zzmfVarArrZza.length;
            zzzf zzzfVar = (zzzf) zzjiVar.zze.zza();
            this.zzi = zzzfVar;
            this.zzq = zzji.zza(((zzjc) zzjiVar.zzd).zza);
            zzzr zzzrVarZzg = zzzr.zzg(((zzjf) zzjiVar.zzg).zza);
            this.zzt = zzzrVarZzg;
            this.zzp = zzjiVar.zzl;
            this.zzG = zzjiVar.zzm;
            Looper looper = zzjiVar.zzi;
            this.zzs = looper;
            zzel zzelVar = zzjiVar.zzb;
            this.zzu = zzelVar;
            this.zzg = zzcoVar;
            zzfb zzfbVar = new zzfb(looper, zzelVar, new zzez() { // from class: com.google.android.gms.internal.ads.zzke
                @Override // com.google.android.gms.internal.ads.zzez
                public final void zza(Object obj, zzah zzahVar) {
                }
            });
            this.zzl = zzfbVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzag = new zzxb(0);
            int length2 = zzmfVarArrZza.length;
            zzzg zzzgVar = new zzzg(new zzmi[2], new zzyz[2], zzdk.zza, null);
            this.zzb = zzzgVar;
            this.zzn = new zzcu();
            zzci zzciVar = new zzci();
            zzciVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzzfVar.zzn();
            zzciVar.zzd(29, true);
            zzciVar.zzd(23, false);
            zzciVar.zzd(25, false);
            zzciVar.zzd(33, false);
            zzciVar.zzd(26, false);
            zzciVar.zzd(34, false);
            zzck zzckVarZze = zzciVar.zze();
            this.zzc = zzckVarZze;
            zzci zzciVar2 = new zzci();
            zzciVar2.zzb(zzckVarZze);
            zzciVar2.zza(4);
            zzciVar2.zza(10);
            this.zzH = zzciVar2.zze();
            this.zzj = zzelVar.zzb(looper, null);
            zzjk zzjkVar = new zzjk(this);
            this.zzaf = zzjkVar;
            this.zzac = zzly.zzg(zzzgVar);
            Apply.zzR(zzcoVar, looper);
            this.zzk = new zzkz(zzmfVarArrZza, zzzfVar, zzzgVar, (zzlc) zzjiVar.zzf.zza(), zzzrVarZzg, 0, false, Apply, this.zzG, zzjiVar.zzs, zzjiVar.zzn, false, looper, zzelVar, zzjkVar, zzfx.zza < 31 ? new zzpb(zzjiVar.zzr) : zzkf.zza(applicationContext, this, zzjiVar.zzp, zzjiVar.zzr), null);
            this.zzU = 1.0f;
            this.zzI = zzbv.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzJ = zzbvVar;
            this.zzab = zzbvVar;
            int iGenerateAudioSessionId = -1;
            this.zzad = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            if (audioManager != null) {
                iGenerateAudioSessionId = audioManager.generateAudioSessionId();
            }
            this.zzS = iGenerateAudioSessionId;
            this.zzW = zzee.zza;
            this.zzX = true;
            Objects.requireNonNull(Apply);
            zzfbVar.zzb(Apply);
            zzzrVarZzg.zze(new Handler(looper), Apply);
            copyOnWriteArraySet.add(zzkkVar);
            this.zzx = new zzil(zzjiVar.zza, handler, zzkkVar);
            this.zzy = new zzip(zzjiVar.zza, handler, zzkkVar);
            zzfx.zzG(null, null);
            this.zzz = new zzmn(zzjiVar.zza);
            this.zzA = new zzmo(zzjiVar.zza);
            this.zzZ = new zzy(0).zza();
            this.zzaa = zzdp.zza;
            this.zzP = zzfp.zza;
            zzzfVar.zzk(this.zzT);
            zzag(1, 10, Integer.valueOf(this.zzS));
            zzag(2, 10, Integer.valueOf(this.zzS));
            zzag(1, 3, this.zzT);
            zzag(2, 4, Integer.valueOf(this.zzO));
            zzag(2, 5, 0);
            zzag(1, 9, Boolean.valueOf(this.zzV));
            zzag(2, 7, zzkmVar);
            zzag(6, 8, zzkmVar);
            zzeoVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzP(zzko zzkoVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkoVar.zzai(surface);
        zzkoVar.zzN = surface;
    }

    private final int zzW(zzly zzlyVar) {
        return zzlyVar.zza.zzo() ? this.zzad : zzlyVar.zza.zzn(zzlyVar.zzb.zza, this.zzn).zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzX(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzY(zzly zzlyVar) {
        if (!zzlyVar.zzb.zzb()) {
            return zzfx.zzu(zzZ(zzlyVar));
        }
        zzlyVar.zza.zzn(zzlyVar.zzb.zza, this.zzn);
        if (zzlyVar.zzc == -9223372036854775807L) {
            long j = zzlyVar.zza.zze(zzW(zzlyVar), this.zza, 0L).zzn;
            return zzfx.zzu(0L);
        }
        int i = zzfx.zza;
        return zzfx.zzu(0L) + zzfx.zzu(zzlyVar.zzc);
    }

    private final long zzZ(zzly zzlyVar) {
        if (zzlyVar.zza.zzo()) {
            return zzfx.zzr(this.zzae);
        }
        boolean z = zzlyVar.zzo;
        long j = zzlyVar.zzr;
        if (zzlyVar.zzb.zzb()) {
            return j;
        }
        zzab(zzlyVar.zza, zzlyVar.zzb, j);
        return j;
    }

    private static long zzaa(zzly zzlyVar) {
        zzcw zzcwVar = new zzcw();
        zzcu zzcuVar = new zzcu();
        zzlyVar.zza.zzn(zzlyVar.zzb.zza, zzcuVar);
        long j = zzlyVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzlyVar.zza.zze(zzcuVar.zzd, zzcwVar, 0L).zzn;
        return 0L;
    }

    private final long zzab(zzcx zzcxVar, zzvh zzvhVar, long j) {
        zzcxVar.zzn(zzvhVar.zza, this.zzn);
        return j;
    }

    private final Pair zzac(zzcx zzcxVar, int i, long j) {
        if (zzcxVar.zzo()) {
            this.zzad = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzae = j;
            return null;
        }
        if (i == -1 || i >= zzcxVar.zzc()) {
            i = zzcxVar.zzg(false);
            long j2 = zzcxVar.zze(i, this.zza, 0L).zzn;
            j = zzfx.zzu(0L);
        }
        return zzcxVar.zzl(this.zza, this.zzn, i, zzfx.zzr(j));
    }

    private final zzly zzad(zzly zzlyVar, zzcx zzcxVar, Pair pair) {
        zzek.zzd(zzcxVar.zzo() || pair != null);
        zzcx zzcxVar2 = zzlyVar.zza;
        long jZzY = zzY(zzlyVar);
        zzly zzlyVarZzf = zzlyVar.zzf(zzcxVar);
        if (zzcxVar.zzo()) {
            zzvh zzvhVarZzh = zzly.zzh();
            long jZzr = zzfx.zzr(this.zzae);
            zzly zzlyVarZza = zzlyVarZzf.zzb(zzvhVarZzh, jZzr, jZzr, jZzr, 0L, zzxk.zza, this.zzb, zzfzn.zzm()).zza(zzvhVarZzh);
            zzlyVarZza.zzp = zzlyVarZza.zzr;
            return zzlyVarZza;
        }
        Object obj = zzlyVarZzf.zzb.zza;
        int i = zzfx.zza;
        boolean z = !obj.equals(pair.first);
        zzvh zzvhVar = z ? new zzvh(pair.first, -1L) : zzlyVarZzf.zzb;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzr2 = zzfx.zzr(jZzY);
        if (!zzcxVar2.zzo()) {
            zzcxVar2.zzn(obj, this.zzn);
        }
        if (z || jLongValue < jZzr2) {
            zzek.zzf(!zzvhVar.zzb());
            zzly zzlyVarZza2 = zzlyVarZzf.zzb(zzvhVar, jLongValue, jLongValue, jLongValue, 0L, z ? zzxk.zza : zzlyVarZzf.zzh, z ? this.zzb : zzlyVarZzf.zzi, z ? zzfzn.zzm() : zzlyVarZzf.zzj).zza(zzvhVar);
            zzlyVarZza2.zzp = jLongValue;
            return zzlyVarZza2;
        }
        if (jLongValue != jZzr2) {
            zzek.zzf(!zzvhVar.zzb());
            long jMax = Math.max(0L, zzlyVarZzf.zzq - (jLongValue - jZzr2));
            long j = zzlyVarZzf.zzp;
            if (zzlyVarZzf.zzk.equals(zzlyVarZzf.zzb)) {
                j = jLongValue + jMax;
            }
            zzly zzlyVarZzb = zzlyVarZzf.zzb(zzvhVar, jLongValue, jLongValue, jLongValue, jMax, zzlyVarZzf.zzh, zzlyVarZzf.zzi, zzlyVarZzf.zzj);
            zzlyVarZzb.zzp = j;
            return zzlyVarZzb;
        }
        int iZza = zzcxVar.zza(zzlyVarZzf.zzk.zza);
        if (iZza != -1 && zzcxVar.zzd(iZza, this.zzn, false).zzd == zzcxVar.zzn(zzvhVar.zza, this.zzn).zzd) {
            return zzlyVarZzf;
        }
        zzcxVar.zzn(zzvhVar.zza, this.zzn);
        long jZzh = zzvhVar.zzb() ? this.zzn.zzh(zzvhVar.zzb, zzvhVar.zzc) : this.zzn.zze;
        zzly zzlyVarZza3 = zzlyVarZzf.zzb(zzvhVar, zzlyVarZzf.zzr, zzlyVarZzf.zzr, zzlyVarZzf.zzd, jZzh - zzlyVarZzf.zzr, zzlyVarZzf.zzh, zzlyVarZzf.zzi, zzlyVarZzf.zzj).zza(zzvhVar);
        zzlyVarZza3.zzp = jZzh;
        return zzlyVarZza3;
    }

    private final zzmb zzae(zzma zzmaVar) {
        int iZzW = zzW(this.zzac);
        zzcx zzcxVar = this.zzac.zza;
        if (iZzW == -1) {
            iZzW = 0;
        }
        zzel zzelVar = this.zzu;
        zzkz zzkzVar = this.zzk;
        return new zzmb(zzkzVar, zzmaVar, zzcxVar, iZzW, zzelVar, zzkzVar.zzb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(final int i, final int i2) {
        if (i == this.zzP.zzb() && i2 == this.zzP.zza()) {
            return;
        }
        this.zzP = new zzfp(i, i2);
        zzfb zzfbVar = this.zzl;
        zzfbVar.zzd(24, new zzey() { // from class: com.google.android.gms.internal.ads.zzkb
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                int i3 = zzko.zzd;
                ((zzcl) obj).zzo(i, i2);
            }
        });
        zzfbVar.zzc();
        zzag(2, 14, new zzfp(i, i2));
    }

    private final void zzag(int i, int i2, Object obj) {
        zzmf[] zzmfVarArr = this.zzh;
        int length = zzmfVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzmf zzmfVar = zzmfVarArr[i3];
            if (zzmfVar.zzb() == i) {
                zzmb zzmbVarZzae = zzae(zzmfVar);
                zzmbVarZzae.zzf(i2);
                zzmbVarZzae.zze(obj);
                zzmbVarZzae.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzah() {
        zzag(1, 2, Float.valueOf(this.zzU * this.zzy.zza()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzai(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzmf[] zzmfVarArr = this.zzh;
        int length = zzmfVarArr.length;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            zzmf zzmfVar = zzmfVarArr[i];
            if (zzmfVar.zzb() == 2) {
                zzmb zzmbVarZzae = zzae(zzmfVar);
                zzmbVarZzae.zzf(1);
                zzmbVarZzae.zze(obj);
                zzmbVarZzae.zzd();
                arrayList.add(zzmbVarZzae);
            }
        }
        Object obj2 = this.zzM;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzmb) it.next()).zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.zzM;
            Surface surface = this.zzN;
            if (obj3 == surface) {
                surface.release();
                this.zzN = null;
            }
        }
        this.zzM = obj;
        if (z) {
            zzaj(zziz.zzd(new zzla(3), 1003));
        }
    }

    private final void zzaj(zziz zzizVar) {
        zzly zzlyVar = this.zzac;
        zzly zzlyVarZza = zzlyVar.zza(zzlyVar.zzb);
        zzlyVarZza.zzp = zzlyVarZza.zzr;
        zzlyVarZza.zzq = 0L;
        zzly zzlyVarZze = zzlyVarZza.zze(1);
        if (zzizVar != null) {
            zzlyVarZze = zzlyVarZze.zzd(zzizVar);
        }
        this.zzC++;
        this.zzk.zzo();
        zzal(zzlyVarZze, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzak(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzly zzlyVar = this.zzac;
        if (zzlyVar.zzl == z2 && zzlyVar.zzm == i3) {
            return;
        }
        this.zzC++;
        boolean z3 = zzlyVar.zzo;
        zzly zzlyVarZzc = zzlyVar.zzc(z2, i3);
        this.zzk.zzn(z2, i3);
        zzal(zzlyVarZzc, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029e  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzal(final com.google.android.gms.internal.ads.zzly r44, final int r45, final int r46, boolean r47, int r48, long r49, int r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzko.zzal(com.google.android.gms.internal.ads.zzly, int, int, boolean, int, long, int, boolean):void");
    }

    private final void zzam() {
        int iZzf = zzf();
        if (iZzf == 2 || iZzf == 3) {
            zzan();
            boolean z = this.zzac.zzo;
            zzv();
            zzv();
        }
    }

    private final void zzan() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzX) {
                throw new IllegalStateException(str);
            }
            zzfe.zzg("ExoPlayerImpl", str, this.zzY ? null : new IllegalStateException());
            this.zzY = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzA(zzms zzmsVar) {
        zzan();
        this.zzr.zzQ(zzmsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzB(zzvj zzvjVar) {
        zzan();
        List listSingletonList = Collections.singletonList(zzvjVar);
        zzan();
        zzan();
        zzW(this.zzac);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzag = this.zzag.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            zzlv zzlvVar = new zzlv((zzvj) listSingletonList.get(i2), this.zzp);
            arrayList.add(zzlvVar);
            this.zzo.add(i2, new zzkn(zzlvVar.zzb, zzlvVar.zza));
        }
        this.zzag = this.zzag.zzg(0, arrayList.size());
        zzmd zzmdVar = new zzmd(this.zzo, this.zzag);
        if (!zzmdVar.zzo() && zzmdVar.zzc() < 0) {
            throw new zzan(zzmdVar, -1, -9223372036854775807L);
        }
        int iZzg = zzmdVar.zzg(false);
        zzly zzlyVarZzad = zzad(this.zzac, zzmdVar, zzac(zzmdVar, iZzg, -9223372036854775807L));
        int i3 = zzlyVarZzad.zze;
        if (iZzg != -1 && i3 != 1) {
            i3 = (zzmdVar.zzo() || iZzg >= zzmdVar.zzc()) ? 4 : 2;
        }
        zzly zzlyVarZze = zzlyVarZzad.zze(i3);
        this.zzk.zzq(arrayList, iZzg, zzfx.zzr(-9223372036854775807L), this.zzag);
        zzal(zzlyVarZze, 0, 1, (this.zzac.zzb.zza.equals(zzlyVarZze.zzb.zza) || this.zzac.zza.zzo()) ? false : true, 4, zzZ(zzlyVarZze), -1, false);
    }

    public final zziz zzE() {
        zzan();
        return this.zzac.zzf;
    }

    final /* synthetic */ void zzS(zzkx zzkxVar) {
        long j;
        boolean z;
        int i = this.zzC - zzkxVar.zzb;
        this.zzC = i;
        boolean z2 = true;
        if (zzkxVar.zzc) {
            this.zzD = zzkxVar.zzd;
            this.zzE = true;
        }
        if (zzkxVar.zze) {
            this.zzF = zzkxVar.zzf;
        }
        if (i == 0) {
            zzcx zzcxVar = zzkxVar.zza.zza;
            if (!this.zzac.zza.zzo() && zzcxVar.zzo()) {
                this.zzad = -1;
                this.zzae = 0L;
            }
            if (!zzcxVar.zzo()) {
                List listZzw = ((zzmd) zzcxVar).zzw();
                zzek.zzf(listZzw.size() == this.zzo.size());
                for (int i2 = 0; i2 < listZzw.size(); i2++) {
                    ((zzkn) this.zzo.get(i2)).zzc((zzcx) listZzw.get(i2));
                }
            }
            if (this.zzE) {
                if (zzkxVar.zza.zzb.equals(this.zzac.zzb) && zzkxVar.zza.zzd == this.zzac.zzr) {
                    z2 = false;
                }
                if (!z2) {
                    j = -9223372036854775807L;
                } else if (zzcxVar.zzo() || zzkxVar.zza.zzb.zzb()) {
                    j = zzkxVar.zza.zzd;
                } else {
                    zzly zzlyVar = zzkxVar.zza;
                    zzvh zzvhVar = zzlyVar.zzb;
                    j = zzlyVar.zzd;
                    zzab(zzcxVar, zzvhVar, j);
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzE = false;
            zzal(zzkxVar.zza, 1, this.zzF, z, this.zzD, j, -1, false);
        }
    }

    final /* synthetic */ void zzT(final zzkx zzkxVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzS(zzkxVar);
            }
        });
    }

    final /* synthetic */ void zzU(zzcl zzclVar) {
        zzclVar.zza(this.zzH);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i, long j, int i2, boolean z) {
        zzan();
        zzek.zzd(i >= 0);
        this.zzr.zzu();
        zzcx zzcxVar = this.zzac.zza;
        if (zzcxVar.zzo() || i < zzcxVar.zzc()) {
            this.zzC++;
            if (zzx()) {
                zzfe.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkx zzkxVar = new zzkx(this.zzac);
                zzkxVar.zza(1);
                this.zzaf.zza.zzT(zzkxVar);
                return;
            }
            zzly zzlyVarZze = this.zzac;
            int i3 = zzlyVarZze.zze;
            if (i3 == 3 || (i3 == 4 && !zzcxVar.zzo())) {
                zzlyVarZze = this.zzac.zze(2);
            }
            int iZzd = zzd();
            zzly zzlyVarZzad = zzad(zzlyVarZze, zzcxVar, zzac(zzcxVar, i, j));
            this.zzk.zzl(zzcxVar, i, zzfx.zzr(j));
            zzal(zzlyVarZzad, 0, 1, true, 1, zzZ(zzlyVarZzad), iZzd, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzb() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzc() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzd() {
        zzan();
        int iZzW = zzW(this.zzac);
        if (iZzW == -1) {
            return 0;
        }
        return iZzW;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zze() {
        zzan();
        if (this.zzac.zza.zzo()) {
            return 0;
        }
        zzly zzlyVar = this.zzac;
        return zzlyVar.zza.zza(zzlyVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzf() {
        zzan();
        return this.zzac.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzg() {
        zzan();
        return this.zzac.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzh() {
        zzan();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzi() {
        zzan();
        if (zzx()) {
            zzly zzlyVar = this.zzac;
            return zzlyVar.zzk.equals(zzlyVar.zzb) ? zzfx.zzu(this.zzac.zzp) : zzl();
        }
        zzan();
        if (this.zzac.zza.zzo()) {
            return this.zzae;
        }
        zzly zzlyVar2 = this.zzac;
        long j = 0;
        if (zzlyVar2.zzk.zzd != zzlyVar2.zzb.zzd) {
            return zzfx.zzu(zzlyVar2.zza.zze(zzd(), this.zza, 0L).zzo);
        }
        long j2 = zzlyVar2.zzp;
        if (this.zzac.zzk.zzb()) {
            zzly zzlyVar3 = this.zzac;
            zzlyVar3.zza.zzn(zzlyVar3.zzk.zza, this.zzn).zzi(this.zzac.zzk.zzb);
        } else {
            j = j2;
        }
        zzly zzlyVar4 = this.zzac;
        zzab(zzlyVar4.zza, zzlyVar4.zzk, j);
        return zzfx.zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzj() {
        zzan();
        return zzY(this.zzac);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzk() {
        zzan();
        return zzfx.zzu(zzZ(this.zzac));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzl() {
        zzan();
        if (zzx()) {
            zzly zzlyVar = this.zzac;
            zzvh zzvhVar = zzlyVar.zzb;
            zzlyVar.zza.zzn(zzvhVar.zza, this.zzn);
            return zzfx.zzu(this.zzn.zzh(zzvhVar.zzb, zzvhVar.zzc));
        }
        zzcx zzcxVarZzn = zzn();
        if (zzcxVarZzn.zzo()) {
            return -9223372036854775807L;
        }
        return zzfx.zzu(zzcxVarZzn.zze(zzd(), this.zza, 0L).zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzm() {
        zzan();
        return zzfx.zzu(this.zzac.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcx zzn() {
        zzan();
        return this.zzac.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzdk zzo() {
        zzan();
        return this.zzac.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzp() {
        zzan();
        zzip zzipVar = this.zzy;
        boolean zZzv = zzv();
        int iZzb = zzipVar.zzb(zZzv, 2);
        zzak(zZzv, iZzb, zzX(zZzv, iZzb));
        zzly zzlyVar = this.zzac;
        if (zzlyVar.zze != 1) {
            return;
        }
        zzly zzlyVarZzd = zzlyVar.zzd(null);
        zzly zzlyVarZze = zzlyVarZzd.zze(true == zzlyVarZzd.zza.zzo() ? 4 : 2);
        this.zzC++;
        this.zzk.zzk();
        zzal(zzlyVarZze, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzq() {
        zzfe.zze("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.3.0] [" + zzfx.zze + "] [" + zzbq.zza() + t2.i.e);
        zzan();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzfb zzfbVar = this.zzl;
            zzfbVar.zzd(10, new zzey() { // from class: com.google.android.gms.internal.ads.zzkc
                @Override // com.google.android.gms.internal.ads.zzey
                public final void zza(Object obj) {
                    ((zzcl) obj).zzj(zziz.zzd(new zzla(1), 1003));
                }
            });
            zzfbVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        boolean z = this.zzac.zzo;
        zzly zzlyVarZze = this.zzac.zze(1);
        this.zzac = zzlyVarZze;
        zzly zzlyVarZza = zzlyVarZze.zza(zzlyVarZze.zzb);
        this.zzac = zzlyVarZza;
        zzlyVarZza.zzp = zzlyVarZza.zzr;
        this.zzac.zzq = 0L;
        this.zzr.zzP();
        this.zzi.zzj();
        Surface surface = this.zzN;
        if (surface != null) {
            surface.release();
            this.zzN = null;
        }
        this.zzW = zzee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzr(boolean z) {
        zzan();
        int iZzb = this.zzy.zzb(z, zzf());
        zzak(z, iZzb, zzX(z, iZzb));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzs(Surface surface) {
        zzan();
        zzai(surface);
        int i = surface == null ? 0 : -1;
        zzaf(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzt(float f) {
        zzan();
        final float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzU == fMax) {
            return;
        }
        this.zzU = fMax;
        zzah();
        zzfb zzfbVar = this.zzl;
        zzfbVar.zzd(22, new zzey() { // from class: com.google.android.gms.internal.ads.zzjs
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                int i = zzko.zzd;
                ((zzcl) obj).zzs(fMax);
            }
        });
        zzfbVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzu() {
        zzan();
        this.zzy.zzb(zzv(), 1);
        zzaj(null);
        this.zzW = new zzee(zzfzn.zzm(), this.zzac.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzv() {
        zzan();
        return this.zzac.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzw() {
        zzan();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzx() {
        zzan();
        return this.zzac.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final int zzy() {
        zzan();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzz(zzms zzmsVar) {
        this.zzr.zzt(zzmsVar);
    }
}
