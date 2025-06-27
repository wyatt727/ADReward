package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzaq extends zzac implements GamesClient {
    public zzaq(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }

    public zzaq(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<Void> setGravityForPopups(final int i) {
        return zzb(new RemoteCall(i) { // from class: com.google.android.gms.internal.games.zzat
            private final int zzdr;

            {
                this.zzdr = i;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.games.internal.zzf) obj).zzn(this.zzdr);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<Void> setViewForPopups(final View view) {
        return zzb(new RemoteCall(view) { // from class: com.google.android.gms.internal.games.zzas
            private final View zzfj;

            {
                this.zzfj = view;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.games.internal.zzf) obj).zza(this.zzfj);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<String> getCurrentAccountName() {
        return zza(zzav.zzev);
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<String> getAppId() {
        return zza(zzau.zzev);
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<Intent> getSettingsIntent() {
        return zza(zzax.zzev);
    }

    @Override // com.google.android.gms.games.GamesClient
    public final Task<Bundle> getActivationHint() {
        return doRead(new zzaw(this));
    }
}
