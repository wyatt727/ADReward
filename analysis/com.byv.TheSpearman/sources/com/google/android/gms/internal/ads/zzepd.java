package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzepd implements zzewr {
    private final zzgep zza;
    private final zzgep zzb;
    private final Context zzc;
    private final zzfgi zzd;
    private final View zze;

    public zzepd(zzgep zzgepVar, zzgep zzgepVar2, Context context, zzfgi zzfgiVar, ViewGroup viewGroup) {
        this.zza = zzgepVar;
        this.zzb = zzgepVar2;
        this.zzc = context;
        this.zzd = zzfgiVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        zzbdz.zza(this.zzc);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkJ)).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        }) : this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzd();
            }
        });
    }

    final /* synthetic */ zzepe zzc() throws Exception {
        return new zzepe(this.zzc, this.zzd.zze, zze());
    }

    final /* synthetic */ zzepe zzd() throws Exception {
        return new zzepe(this.zzc, this.zzd.zze, zze());
    }
}
