package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.event.Events;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzai implements Events {
    @Override // com.google.android.gms.games.event.Events
    public final PendingResult<Events.LoadEventsResult> loadByIds(GoogleApiClient googleApiClient, boolean z, String... strArr) {
        return googleApiClient.enqueue(new zzal(this, googleApiClient, z, strArr));
    }

    @Override // com.google.android.gms.games.event.Events
    public final PendingResult<Events.LoadEventsResult> load(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.enqueue(new zzak(this, googleApiClient, z));
    }

    @Override // com.google.android.gms.games.event.Events
    public final void increment(GoogleApiClient googleApiClient, String str, int i) {
        com.google.android.gms.games.internal.zzf zzfVarZzb = Games.zzb(googleApiClient, false);
        if (zzfVarZzb == null) {
            return;
        }
        if (zzfVarZzb.isConnected()) {
            zzfVarZzb.zzb(str, i);
        } else {
            googleApiClient.execute(new zzan(this, googleApiClient, str, i));
        }
    }
}
