package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzank implements zzano {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzfn zzc = new zzfn(new byte[7], 7);
    private final zzfo zzd = new zzfo(Arrays.copyOf(zza, 10));
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzaem zzh;
    private zzaem zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzaem zzv;
    private long zzw;

    public zzank(boolean z, String str, int i) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 256;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzaem zzaemVar, long j, int i, int i2) {
        this.zzj = 4;
        this.zzk = i;
        this.zzv = zzaemVar;
        this.zzw = j;
        this.zzt = i2;
    }

    private final boolean zzk(zzfo zzfoVar, byte[] bArr, int i) {
        int iMin = Math.min(zzfoVar.zzb(), i - this.zzk);
        zzfoVar.zzG(bArr, this.zzk, iMin);
        int i2 = this.zzk + iMin;
        this.zzk = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzfo zzfoVar, byte[] bArr, int i) {
        if (zzfoVar.zzb() < i) {
            return false;
        }
        zzfoVar.zzG(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0270, code lost:
    
        r16.zzj = 1;
        r16.zzk = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0276, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0279, code lost:
    
        r17.zzK(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x025d, code lost:
    
        r16.zzq = (r11 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0265, code lost:
    
        if (1 == ((r11 & 1) ^ 1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0267, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0269, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026a, code lost:
    
        r16.zzm = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x026e, code lost:
    
        if (r16.zzn != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025d A[EDGE_INSN: B:143:0x025d->B:94:0x025d BREAK  A[LOOP:1: B:48:0x01ab->B:168:0x01ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0215  */
    @Override // com.google.android.gms.internal.ads.zzano
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzfo r17) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzank.zza(com.google.android.gms.internal.ads.zzfo):void");
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zzg = zzapaVar.zzb();
        zzaem zzaemVarZzw = zzadiVar.zzw(zzapaVar.zza(), 1);
        this.zzh = zzaemVarZzw;
        this.zzv = zzaemVarZzw;
        if (!this.zzb) {
            this.zzi = new zzade();
            return;
        }
        zzapaVar.zzc();
        zzaem zzaemVarZzw2 = zzadiVar.zzw(zzapaVar.zza(), 5);
        this.zzi = zzaemVarZzw2;
        zzak zzakVar = new zzak();
        zzakVar.zzK(zzapaVar.zzb());
        zzakVar.zzW("application/id3");
        zzaemVarZzw2.zzl(zzakVar.zzac());
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzu = j;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        this.zzu = -9223372036854775807L;
        zzg();
    }
}
