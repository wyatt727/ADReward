package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadataClient;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzaz extends zzac implements GamesMetadataClient {
    public zzaz(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }

    public zzaz(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.GamesMetadataClient
    public final Task<Game> getCurrentGame() {
        return zza(zzay.zzev);
    }

    @Override // com.google.android.gms.games.GamesMetadataClient
    public final Task<AnnotatedData<Game>> loadGame() {
        return zza(zzbb.zzev);
    }
}
