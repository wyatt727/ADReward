package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfpb extends AsyncTask {
    private zzfpc zza;
    protected final zzfot zzd;

    public zzfpb(zzfot zzfotVar) {
        this.zzd = zzfotVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfpc zzfpcVar = this.zza;
        if (zzfpcVar != null) {
            zzfpcVar.zza(this);
        }
    }

    public final void zzb(zzfpc zzfpcVar) {
        this.zza = zzfpcVar;
    }
}
