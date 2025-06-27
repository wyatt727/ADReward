package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzajp implements zzadf {

    @Deprecated
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzajl
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzajp.zza;
            return new zzadf[]{new zzajp(zzalf.zza, 32)};
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzam zzc;
    private zzajo zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private zzadi zzF;
    private zzaem[] zzG;
    private zzaem[] zzH;
    private boolean zzI;
    private final zzalf zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzfo zzg;
    private final zzfo zzh;
    private final zzfo zzi;
    private final byte[] zzj;
    private final zzfo zzk;
    private final zzagg zzl;
    private final zzfo zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private zzfzn zzp;
    private int zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private zzfo zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzW("application/x-emsg");
        zzc = zzakVar.zzac();
    }

    @Deprecated
    public zzajp() {
        this(zzalf.zza, 32, null, null, zzfzn.zzm(), null);
    }

    private static int zza(int i) throws zzcc {
        if (i >= 0) {
            return i;
        }
        throw zzcc.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzae zzg(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajp.zzg(java.util.List):com.google.android.gms.internal.ads.zzae");
    }

    private final void zzh() {
        this.zzq = 0;
        this.zzt = 0;
    }

    private static void zzi(zzfo zzfoVar, int i, zzakd zzakdVar) throws zzcc {
        zzfoVar.zzK(i + 8);
        int iZzg = zzfoVar.zzg() & ViewCompat.MEASURED_SIZE_MASK;
        if ((iZzg & 1) != 0) {
            throw zzcc.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iZzg & 2) != 0;
        int iZzp = zzfoVar.zzp();
        if (iZzp == 0) {
            Arrays.fill(zzakdVar.zzl, 0, zzakdVar.zze, false);
            return;
        }
        int i2 = zzakdVar.zze;
        if (iZzp != i2) {
            throw zzcc.zza("Senc sample count " + iZzp + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzakdVar.zzl, 0, iZzp, z);
        zzakdVar.zza(zzfoVar.zzb());
        zzfo zzfoVar2 = zzakdVar.zzn;
        zzfoVar.zzG(zzfoVar2.zzM(), 0, zzfoVar2.zze());
        zzakdVar.zzn.zzK(0);
        zzakdVar.zzo = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x063b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzj(long r47) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajp.zzj(long):void");
    }

    private static final zzajk zzk(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzajk) sparseArray.valueAt(0);
        }
        zzajk zzajkVar = (zzajk) sparseArray.get(i);
        Objects.requireNonNull(zzajkVar);
        return zzajkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0245, code lost:
    
        r5.zzs(r10, r20, r33.zzB, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0258, code lost:
    
        if (r33.zzo.isEmpty() != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025a, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzajn) r33.zzo.removeFirst();
        r33.zzw -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x026d, code lost:
    
        if (r1.zzb == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026f, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0270, code lost:
    
        r5 = r33.zzG;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0274, code lost:
    
        if (r8 >= r6) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0276, code lost:
    
        r5[r8].zzs(r3, 1, r1.zzc, r33.zzw, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x028e, code lost:
    
        if (r2.zzk() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0290, code lost:
    
        r33.zzA = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0292, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0293, code lost:
    
        r33.zzq = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0296, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (r33.zzq != 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        r3 = r2.zzb();
        r33.zzB = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r2.zzf >= r2.zzi) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.zzact) r34).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (r1 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
    
        r3.zzL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r3.zzL(r3.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
    
        if (r2.zzk() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
    
        r33.zzA = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
    
        r33.zzB = r3 - 8;
        ((com.google.android.gms.internal.ads.zzact) r34).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if (com.google.android.exoplayer2.util.MimeTypes.AUDIO_AC4.equals(r2.zzd.zza.zzf.zzm) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
    
        r33.zzC = r2.zzc(r33.zzB, 7);
        com.google.android.gms.internal.ads.zzach.zzb(r33.zzB, r33.zzk);
        r2.zza.zzq(r33.zzk, 7);
        r3 = r33.zzC + 7;
        r33.zzC = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        r3 = r2.zzc(r33.zzB, 0);
        r33.zzC = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
    
        r33.zzB += r3;
        r33.zzq = 4;
        r33.zzD = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013d, code lost:
    
        if (r6 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013f, code lost:
    
        r3 = r33.zzC;
        r4 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        if (r3 >= r4) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
    
        r33.zzC += r5.zzf(r34, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
    
        r13 = r33.zzh.zzM();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0166, code lost:
    
        if (r33.zzC >= r33.zzB) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0168, code lost:
    
        r12 = r33.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016c, code lost:
    
        if (r12 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016e, code lost:
    
        ((com.google.android.gms.internal.ads.zzact) r34).zzn(r13, r6, r14, r9);
        r33.zzh.zzK(r9);
        r12 = r33.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017f, code lost:
    
        if (r12 <= 0) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0181, code lost:
    
        r33.zzD = r12 - 1;
        r33.zzg.zzK(r9);
        r5.zzq(r33.zzg, 4);
        r5.zzq(r33.zzh, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0198, code lost:
    
        if (r33.zzH.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019a, code lost:
    
        r12 = r3.zzf.zzm;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.zzgl.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a8, code lost:
    
        if ("video/avc".equals(r12) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ac, code lost:
    
        if ((r17 & 31) == r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01af, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b5, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bc, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bf, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c0, code lost:
    
        r33.zzE = r9;
        r33.zzC += 5;
        r33.zzB += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d4, code lost:
    
        throw com.google.android.gms.internal.ads.zzcc.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d7, code lost:
    
        if (r33.zzE == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d9, code lost:
    
        r33.zzi.zzH(r12);
        ((com.google.android.gms.internal.ads.zzact) r34).zzn(r33.zzi.zzM(), 0, r33.zzD, false);
        r5.zzq(r33.zzi, r33.zzD);
        r4 = r33.zzD;
        r8 = r33.zzi;
        r8 = com.google.android.gms.internal.ads.zzgl.zzb(r8.zzM(), r8.zze());
        r33.zzi.zzK("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r33.zzi.zzJ(r8);
        com.google.android.gms.internal.ads.zzacq.zza(r10, r33.zzi, r33.zzH);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x021e, code lost:
    
        r4 = r5.zzf(r34, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0224, code lost:
    
        r33.zzC += r4;
        r33.zzD -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0230, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0234, code lost:
    
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023c, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023e, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0243, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadg r34, com.google.android.gms.internal.ads.zzaec r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajp.zzb(com.google.android.gms.internal.ads.zzadg, com.google.android.gms.internal.ads.zzaec):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzF = zzadiVar;
        zzh();
        zzaem[] zzaemVarArr = new zzaem[2];
        this.zzG = zzaemVarArr;
        int i = 0;
        zzaem[] zzaemVarArr2 = (zzaem[]) zzfx.zzO(zzaemVarArr, 0);
        this.zzG = zzaemVarArr2;
        for (zzaem zzaemVar : zzaemVarArr2) {
            zzaemVar.zzl(zzc);
        }
        this.zzH = new zzaem[this.zze.size()];
        int i2 = 100;
        while (i < this.zzH.length) {
            int i3 = i2 + 1;
            zzaem zzaemVarZzw = this.zzF.zzw(i2, 3);
            zzaemVarZzw.zzl((zzam) this.zze.get(i));
            this.zzH[i] = zzaemVarZzw;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        int size = this.zzf.size();
        for (int i = 0; i < size; i++) {
            ((zzajo) this.zzf.valueAt(i)).zzi();
        }
        this.zzo.clear();
        this.zzw = 0;
        this.zzx = j2;
        this.zzn.clear();
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        zzaej zzaejVarZza = zzaka.zza(zzadgVar);
        this.zzp = zzaejVarZza != null ? zzfzn.zzn(zzaejVarZza) : zzfzn.zzm();
        return zzaejVarZza == null;
    }

    public zzajp(zzalf zzalfVar, int i) {
        this(zzalfVar, 32, null, null, zzfzn.zzm(), null);
    }

    public zzajp(zzalf zzalfVar, int i, zzfv zzfvVar, zzakb zzakbVar, List list, zzaem zzaemVar) {
        this.zzd = zzalfVar;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzagg();
        this.zzm = new zzfo(16);
        this.zzg = new zzfo(zzgl.zza);
        this.zzh = new zzfo(5);
        this.zzi = new zzfo();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzfo(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzp = zzfzn.zzm();
        this.zzy = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzF = zzadi.zza;
        this.zzG = new zzaem[0];
        this.zzH = new zzaem[0];
    }
}
