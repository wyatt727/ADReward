package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfpe extends zzfpa {
    public zzfpe(zzfot zzfotVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfotVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfnq zzfnqVarZza = zzfnq.zza();
        if (zzfnqVarZza != null) {
            for (zzfnc zzfncVar : zzfnqVarZza.zzc()) {
                if (this.zza.contains(zzfncVar.zzh())) {
                    zzfncVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfpb, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfpb
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
