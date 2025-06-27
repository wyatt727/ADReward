package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbyt implements RewardItem {
    private final zzbyg zza;

    public zzbyt(zzbyg zzbygVar) {
        this.zza = zzbygVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            try {
                return zzbygVar.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            try {
                return zzbygVar.zzf();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
