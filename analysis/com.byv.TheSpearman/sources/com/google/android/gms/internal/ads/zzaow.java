package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaow implements zzadf {

    @Deprecated
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzaot
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzaow.zza;
            return new zzadf[]{new zzaow(1, 1, zzalf.zza, new zzfv(0L), new zzanl(0), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES)};
        }
    };
    private final List zzb;
    private final zzfo zzc;
    private final SparseIntArray zzd;
    private final zzaoz zze;
    private final zzalf zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzaos zzj;
    private zzaor zzk;
    private zzadi zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzaow() {
        this(1, 1, zzalf.zza, new zzfv(0L), new zzanl(0), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b5  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadg r19, com.google.android.gms.internal.ads.zzaec r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaow.zzb(com.google.android.gms.internal.ads.zzadg, com.google.android.gms.internal.ads.zzaec):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzl = zzadiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(long r9, long r11) {
        /*
            r8 = this;
            java.util.List r9 = r8.zzb
            int r9 = r9.size()
            r10 = 0
            r0 = r10
        L8:
            r1 = 0
            if (r0 >= r9) goto L37
            java.util.List r3 = r8.zzb
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.internal.ads.zzfv r3 = (com.google.android.gms.internal.ads.zzfv) r3
            long r4 = r3.zzf()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            long r4 = r3.zzd()
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L34
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto L34
        L31:
            r3.zzi(r11)
        L34:
            int r0 = r0 + 1
            goto L8
        L37:
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 == 0) goto L42
            com.google.android.gms.internal.ads.zzaor r9 = r8.zzk
            if (r9 == 0) goto L42
            r9.zzd(r11)
        L42:
            com.google.android.gms.internal.ads.zzfo r9 = r8.zzc
            r9.zzH(r10)
            android.util.SparseIntArray r9 = r8.zzd
            r9.clear()
            r9 = r10
        L4d:
            android.util.SparseArray r11 = r8.zzg
            int r11 = r11.size()
            if (r9 >= r11) goto L63
            android.util.SparseArray r11 = r8.zzg
            java.lang.Object r11 = r11.valueAt(r9)
            com.google.android.gms.internal.ads.zzapb r11 = (com.google.android.gms.internal.ads.zzapb) r11
            r11.zzc()
            int r9 = r9 + 1
            goto L4d
        L63:
            r8.zzq = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaow.zze(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzf(com.google.android.gms.internal.ads.zzadg r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzfo r0 = r6.zzc
            byte[] r0 = r0.zzM()
            com.google.android.gms.internal.ads.zzact r7 = (com.google.android.gms.internal.ads.zzact) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.zzm(r0, r1, r2, r1)
            r2 = r1
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = r1
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaow.zzf(com.google.android.gms.internal.ads.zzadg):boolean");
    }

    public zzaow(int i, int i2, zzalf zzalfVar, zzfv zzfvVar, zzaoz zzaozVar, int i3) {
        this.zze = zzaozVar;
        this.zzf = zzalfVar;
        this.zzb = Collections.singletonList(zzfvVar);
        this.zzc = new zzfo(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzaos(TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
        this.zzl = zzadi.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(sparseArray2.keyAt(i4), (zzapb) sparseArray2.valueAt(i4));
        }
        this.zzg.put(0, new zzaoo(new zzaou(this)));
    }
}
