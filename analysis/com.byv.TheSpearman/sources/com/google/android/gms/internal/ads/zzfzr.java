package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfzr extends zzfzg {

    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfzr() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfzg, com.google.android.gms.internal.ads.zzfzh
    public final /* bridge */ /* synthetic */ zzfzh zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfzr zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i = 0; i < 2; i++) {
                zzf(objArr[i]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    zzfzr(int i) {
        super(i);
        this.zzd = new Object[zzfzs.zzh(i)];
    }

    public final zzfzr zzh(Iterable iterable) {
        Objects.requireNonNull(iterable);
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfzs zzi() {
        zzfzs zzfzsVarZzv;
        int i = this.zzb;
        if (i == 0) {
            return zzgbf.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgbq(obj);
        }
        if (this.zzd == null || zzfzs.zzh(i) != this.zzd.length) {
            zzfzsVarZzv = zzfzs.zzv(this.zzb, this.zza);
            this.zzb = zzfzsVarZzv.size();
        } else {
            int i2 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzfzs.zzw(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            zzfzsVarZzv = new zzgbf(objArrCopyOf, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzfzsVarZzv;
    }

    public final zzfzr zzf(Object obj) {
        Objects.requireNonNull(obj);
        if (this.zzd != null) {
            int iZzh = zzfzs.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzh <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzfzf.zza(iHashCode);
                while (true) {
                    int i = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iZza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
