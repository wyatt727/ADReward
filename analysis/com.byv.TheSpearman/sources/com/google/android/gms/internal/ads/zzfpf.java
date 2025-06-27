package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfpf extends zzfpa {
    public zzfpf(zzfot zzfotVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfotVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfok.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfpb, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfpb
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfnq zzfnqVarZza;
        if (!TextUtils.isEmpty(str) && (zzfnqVarZza = zzfnq.zza()) != null) {
            for (zzfnc zzfncVar : zzfnqVarZza.zzc()) {
                if (this.zza.contains(zzfncVar.zzh())) {
                    zzfncVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
