package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfcf implements zzfde {
    private zzcxx zza;
    private final Executor zzb = zzgev.zzb();

    public final zzcxx zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzfdf zzfdfVar, zzfdd zzfddVar, zzcxx zzcxxVar) {
        zzcxw zzcxwVarZza = zzfddVar.zza(zzfdfVar.zzb);
        zzcxwVarZza.zzb(new zzfdi(true));
        zzcxx zzcxxVar2 = (zzcxx) zzcxwVarZza.zzh();
        this.zza = zzcxxVar2;
        final zzcvd zzcvdVarZzb = zzcxxVar2.zzb();
        final zzfif zzfifVar = new zzfif();
        return zzgee.zzm(zzgee.zzn(zzgdv.zzu(zzcvdVarZzb.zzj()), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzfcd
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                zzffz zzffzVar = (zzffz) obj;
                zzfifVar.zzb = zzffzVar;
                Iterator it = zzffzVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzffn) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zzcvdVarZzb.zzi(zzgee.zzh(zzffzVar));
                    }
                }
                return zzgee.zzh(null);
            }
        }, this.zzb), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzfce
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                zzfif zzfifVar2 = zzfifVar;
                zzfifVar2.zzc = (zzctv) obj;
                return zzfifVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfdf zzfdfVar, zzfdd zzfddVar, Object obj) {
        return zzb(zzfdfVar, zzfddVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
