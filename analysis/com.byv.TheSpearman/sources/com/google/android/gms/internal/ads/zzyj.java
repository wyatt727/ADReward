package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzyj extends zzdf {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    @Deprecated
    public zzyj() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    private final void zzx() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    public final /* synthetic */ zzdf zzf(int i, int i2, boolean z) {
        super.zzf(i, i2, true);
        return this;
    }

    public final zzyj zzp(int i, boolean z) {
        if (this.zzi.get(i) != z) {
            if (z) {
                this.zzi.put(i, true);
            } else {
                this.zzi.delete(i);
            }
        }
        return this;
    }

    public zzyj(Context context) throws NumberFormatException {
        super.zze(context);
        Point pointZzv = zzfx.zzv(context);
        zzf(pointZzv.x, pointZzv.y, true);
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    /* synthetic */ zzyj(zzyl zzylVar, zzyi zzyiVar) {
        super(zzylVar);
        this.zza = zzylVar.zzI;
        this.zzb = zzylVar.zzK;
        this.zzc = zzylVar.zzM;
        this.zzd = zzylVar.zzR;
        this.zze = zzylVar.zzS;
        this.zzf = zzylVar.zzT;
        this.zzg = zzylVar.zzV;
        SparseArray sparseArray = zzylVar.zzaq;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.zzh = sparseArray2;
        this.zzi = zzylVar.zzar.clone();
    }
}
