package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzmd extends zzii {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzcx[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzmd(Collection collection, zzxb zzxbVar) {
        zzcx[] zzcxVarArr = new zzcx[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzcxVarArr[i2] = ((zzlm) it.next()).zza();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zzlm) it2.next()).zzb();
            i++;
        }
        this(zzcxVarArr, objArr, zzxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final int zzq(int i) {
        return zzfx.zzb(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final int zzr(int i) {
        return zzfx.zzb(this.zzg, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final int zzs(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final int zzt(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final zzcx zzu(int i) {
        return this.zzh[i];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    protected final Object zzv(int i) {
        return this.zzi[i];
    }

    final List zzw() {
        return Arrays.asList(this.zzh);
    }

    public final zzmd zzx(zzxb zzxbVar) {
        zzcx[] zzcxVarArr = new zzcx[this.zzh.length];
        int i = 0;
        while (true) {
            zzcx[] zzcxVarArr2 = this.zzh;
            if (i >= zzcxVarArr2.length) {
                return new zzmd(zzcxVarArr, this.zzi, zzxbVar);
            }
            zzcxVarArr[i] = new zzmc(this, zzcxVarArr2[i]);
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzmd(zzcx[] zzcxVarArr, Object[] objArr, zzxb zzxbVar) {
        super(false, zzxbVar);
        int i = 0;
        this.zzh = zzcxVarArr;
        int length = zzcxVarArr.length;
        this.zzf = new int[length];
        this.zzg = new int[length];
        this.zzi = objArr;
        this.zzj = new HashMap();
        int iZzc = 0;
        int iZzb = 0;
        int i2 = 0;
        while (i < zzcxVarArr.length) {
            zzcx zzcxVar = zzcxVarArr[i];
            this.zzh[i2] = zzcxVar;
            this.zzg[i2] = iZzc;
            this.zzf[i2] = iZzb;
            iZzc += zzcxVar.zzc();
            iZzb += this.zzh[i2].zzb();
            this.zzj.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.zzd = iZzc;
        this.zze = iZzb;
    }
}
