package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.PlayersClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzcm extends zzac implements PlayersClient {
    public zzcm(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }

    public zzcm(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<String> getCurrentPlayerId() {
        return doRead(zzbh.zzd(zzcp.zzev));
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<Player> getCurrentPlayer() {
        return doRead(zzbh.zzd(zzco.zzev));
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<AnnotatedData<Player>> getCurrentPlayer(final boolean z) {
        return doRead(zzbh.zzd(new RemoteCall(z) { // from class: com.google.android.gms.internal.games.zzcr
            private final boolean zzex;

            {
                this.zzex = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<AnnotatedData<Player>>) obj2, this.zzex);
            }
        }));
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<AnnotatedData<Player>> loadPlayer(String str) {
        return loadPlayer(str, false);
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<AnnotatedData<Player>> loadPlayer(final String str, final boolean z) {
        return doRead(zzbh.zzd(new RemoteCall(str, z) { // from class: com.google.android.gms.internal.games.zzcq
            private final String zzew;
            private final boolean zzfn;

            {
                this.zzew = str;
                this.zzfn = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<AnnotatedData<Player>>) obj2, this.zzew, this.zzfn);
            }
        }));
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<AnnotatedData<PlayerBuffer>> loadRecentlyPlayedWithPlayers(int i, boolean z) {
        return zza("played_with", i, z);
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<AnnotatedData<PlayerBuffer>> loadMoreRecentlyPlayedWithPlayers(int i) {
        return zzd("played_with", i);
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<Intent> getCompareProfileIntent(final Player player) {
        return doRead(zzbh.zzd(new RemoteCall(player) { // from class: com.google.android.gms.internal.games.zzct
            private final Player zzga;

            {
                this.zzga = player;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzf) obj).zza(new PlayerEntity(this.zzga)));
            }
        }));
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<Intent> getCompareProfileIntentWithAlternativeNameHints(final String str, final String str2, final String str3) {
        return zza(new RemoteCall(str, str2, str3) { // from class: com.google.android.gms.internal.games.zzcs
            private final String zzew;
            private final String zzfm;
            private final String zzfz;

            {
                this.zzew = str;
                this.zzfz = str2;
                this.zzfm = str3;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzac) ((com.google.android.gms.games.internal.zzf) obj).getService()).zza(this.zzew, this.zzfz, this.zzfm));
            }
        });
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<Intent> getCompareProfileIntent(String str) {
        return getCompareProfileIntentWithAlternativeNameHints(str, null, null);
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<Intent> getPlayerSearchIntent() {
        return doRead(zzbh.zzd(zzcv.zzev));
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<AnnotatedData<PlayerBuffer>> loadFriends(int i, boolean z) {
        return zza("friends_all", i, z);
    }

    @Override // com.google.android.gms.games.PlayersClient
    public final Task<AnnotatedData<PlayerBuffer>> loadMoreFriends(int i) {
        return zzd("friends_all", i);
    }

    private final Task<AnnotatedData<PlayerBuffer>> zza(final String str, final int i, final boolean z) {
        return doRead(zzbh.zzd(new RemoteCall(str, i, z) { // from class: com.google.android.gms.internal.games.zzcu
            private final String zzew;
            private final int zzey;
            private final boolean zzgb;

            {
                this.zzew = str;
                this.zzey = i;
                this.zzgb = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<AnnotatedData<PlayerBuffer>>) obj2, this.zzew, this.zzey, false, this.zzgb);
            }
        }));
    }

    private final Task<AnnotatedData<PlayerBuffer>> zzd(final String str, final int i) {
        return doRead(zzbh.zzd(new RemoteCall(str, i) { // from class: com.google.android.gms.internal.games.zzcx
            private final String zzew;
            private final int zzey;

            {
                this.zzew = str;
                this.zzey = i;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<AnnotatedData<PlayerBuffer>>) obj2, this.zzew, this.zzey, true, false);
            }
        }));
    }
}
