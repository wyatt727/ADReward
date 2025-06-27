package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcfc extends zzcey {
    public zzcfc(zzcdn zzcdnVar) {
        super(zzcdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final boolean zzt(String str) {
        String strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcdn zzcdnVar = (zzcdn) this.zzc.get();
        if (zzcdnVar != null && strZzf != null) {
            zzcdnVar.zzt(strZzf, this);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
