package com.google.android.gms.games;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.FirstPartyScopes;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.stats.Stats;
import com.google.android.gms.games.video.Videos;
import com.google.android.gms.internal.games.zzae;
import com.google.android.gms.internal.games.zzai;
import com.google.android.gms.internal.games.zzaq;
import com.google.android.gms.internal.games.zzaz;
import com.google.android.gms.internal.games.zzba;
import com.google.android.gms.internal.games.zzbj;
import com.google.android.gms.internal.games.zzbu;
import com.google.android.gms.internal.games.zzck;
import com.google.android.gms.internal.games.zzcm;
import com.google.android.gms.internal.games.zzcw;
import com.google.android.gms.internal.games.zzdg;
import com.google.android.gms.internal.games.zzdq;
import com.google.android.gms.internal.games.zzee;
import com.google.android.gms.internal.games.zzei;
import com.google.android.gms.internal.games.zzeq;
import com.google.android.gms.internal.games.zzo;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class Games {

    @Deprecated
    public static final Api<GamesOptions> API;

    @Deprecated
    public static final Achievements Achievements;
    static final Api.ClientKey<com.google.android.gms.games.internal.zzf> CLIENT_KEY;
    public static final String EXTRA_PLAYER_IDS = "players";
    public static final String EXTRA_STATUS = "status";

    @Deprecated
    public static final Events Events;

    @Deprecated
    public static final GamesMetadata GamesMetadata;

    @Deprecated
    public static final Leaderboards Leaderboards;

    @Deprecated
    public static final Players Players;
    public static final Scope SCOPE_GAMES;
    public static final Scope SCOPE_GAMES_LITE;
    public static final Scope SCOPE_GAMES_SNAPSHOTS;

    @Deprecated
    public static final Snapshots Snapshots;

    @Deprecated
    public static final Stats Stats;

    @Deprecated
    public static final Videos Videos;
    private static final Api.AbstractClientBuilder<com.google.android.gms.games.internal.zzf, GamesOptions> zzaf;
    private static final Api.AbstractClientBuilder<com.google.android.gms.games.internal.zzf, GamesOptions> zzag;
    public static final Scope zzah;
    private static final Api<GamesOptions> zzai;

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    @Deprecated
    public interface GetServerAuthCodeResult extends Result {
        String getCode();
    }

    private Games() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    static abstract class zza extends Api.AbstractClientBuilder<com.google.android.gms.games.internal.zzf, GamesOptions> {
        private zza() {
        }

        @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
        public int getPriority() {
            return 1;
        }

        @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
        public /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, GamesOptions gamesOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            GamesOptions gamesOptionsBuild = gamesOptions;
            if (gamesOptionsBuild == null) {
                gamesOptionsBuild = new GamesOptions.Builder((zze) null).build();
            }
            return new com.google.android.gms.games.internal.zzf(context, looper, clientSettings, gamesOptionsBuild, connectionCallbacks, onConnectionFailedListener);
        }

        /* synthetic */ zza(zze zzeVar) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    public static abstract class zzb<T extends Result> extends BaseImplementation.ApiMethodImpl<T, com.google.android.gms.games.internal.zzf> {
        public zzb(GoogleApiClient googleApiClient) {
            super(Games.CLIENT_KEY, googleApiClient);
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        public /* bridge */ /* synthetic */ void setResult(Object obj) {
            super.setResult((zzb<T>) obj);
        }
    }

    public static com.google.android.gms.games.internal.zzf zza(GoogleApiClient googleApiClient) {
        return zza(googleApiClient, true);
    }

    public static com.google.android.gms.games.internal.zzf zza(GoogleApiClient googleApiClient, boolean z) {
        Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        Preconditions.checkState(googleApiClient.isConnected(), "GoogleApiClient must be connected.");
        return zzb(googleApiClient, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    static abstract class zzc extends zzb<Status> {
        private zzc(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public /* synthetic */ Result createFailedResult(Status status) {
            return status;
        }

        /* synthetic */ zzc(GoogleApiClient googleApiClient, zze zzeVar) {
            this(googleApiClient);
        }
    }

    public static com.google.android.gms.games.internal.zzf zzb(GoogleApiClient googleApiClient, boolean z) {
        Api<GamesOptions> api = API;
        Preconditions.checkState(googleApiClient.hasApi(api), "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean zHasConnectedApi = googleApiClient.hasConnectedApi(api);
        if (z && !zHasConnectedApi) {
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        }
        if (zHasConnectedApi) {
            return (com.google.android.gms.games.internal.zzf) googleApiClient.getClient(CLIENT_KEY);
        }
        return null;
    }

    @Deprecated
    public static String getCurrentAccountName(GoogleApiClient googleApiClient) {
        return zza(googleApiClient, true).zzaj();
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    public static final class GamesOptions implements GoogleSignInOptionsExtension, Api.ApiOptions.HasGoogleSignInAccountOptions, Api.ApiOptions.Optional {
        public final boolean zzaj;
        public final boolean zzak;
        public final int zzal;
        public final boolean zzam;
        public final int zzan;
        public final String zzao;
        public final ArrayList<String> zzap;
        public final boolean zzaq;
        public final boolean zzar;
        public final GoogleSignInAccount zzas;
        public final String zzat;
        private final int zzau;
        public final int zzav;
        public final int zzaw;

        private GamesOptions(boolean z, boolean z2, int i, boolean z3, int i2, String str, ArrayList<String> arrayList, boolean z4, boolean z5, GoogleSignInAccount googleSignInAccount, String str2, int i3, int i4, int i5) {
            this.zzaj = z;
            this.zzak = z2;
            this.zzal = i;
            this.zzam = z3;
            this.zzan = i2;
            this.zzao = str;
            this.zzap = arrayList;
            this.zzaq = z4;
            this.zzar = z5;
            this.zzas = googleSignInAccount;
            this.zzat = str2;
            this.zzau = i3;
            this.zzav = i4;
            this.zzaw = i5;
        }

        @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
        public final int getExtensionType() {
            return 1;
        }

        /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
        public static final class Builder {
            private static final AtomicInteger zzax = new AtomicInteger(0);
            private boolean zzaj;
            private boolean zzak;
            private int zzal;
            private boolean zzam;
            private int zzan;
            private String zzao;
            private ArrayList<String> zzap;
            private boolean zzaq;
            private boolean zzar;
            GoogleSignInAccount zzas;
            private String zzat;
            private int zzau;
            private int zzav;
            private int zzaw;

            private Builder() {
                this.zzaj = false;
                this.zzak = true;
                this.zzal = 17;
                this.zzam = false;
                this.zzan = 4368;
                this.zzao = null;
                this.zzap = new ArrayList<>();
                this.zzaq = false;
                this.zzar = false;
                this.zzas = null;
                this.zzat = null;
                this.zzau = 0;
                this.zzav = 8;
                this.zzaw = 0;
            }

            private Builder(GamesOptions gamesOptions) {
                this.zzaj = false;
                this.zzak = true;
                this.zzal = 17;
                this.zzam = false;
                this.zzan = 4368;
                this.zzao = null;
                this.zzap = new ArrayList<>();
                this.zzaq = false;
                this.zzar = false;
                this.zzas = null;
                this.zzat = null;
                this.zzau = 0;
                this.zzav = 8;
                this.zzaw = 0;
                if (gamesOptions != null) {
                    this.zzaj = gamesOptions.zzaj;
                    this.zzak = gamesOptions.zzak;
                    this.zzal = gamesOptions.zzal;
                    this.zzam = gamesOptions.zzam;
                    this.zzan = gamesOptions.zzan;
                    this.zzao = gamesOptions.zzao;
                    this.zzap = gamesOptions.zzap;
                    this.zzaq = gamesOptions.zzaq;
                    this.zzar = gamesOptions.zzar;
                    this.zzas = gamesOptions.zzas;
                    this.zzat = gamesOptions.zzat;
                    this.zzau = gamesOptions.zzau;
                    this.zzav = gamesOptions.zzav;
                    this.zzaw = gamesOptions.zzaw;
                }
            }

            public final Builder setShowConnectingPopup(boolean z) {
                this.zzak = z;
                this.zzal = 17;
                return this;
            }

            public final Builder setShowConnectingPopup(boolean z, int i) {
                this.zzak = z;
                this.zzal = i;
                return this;
            }

            public final Builder setSdkVariant(int i) {
                this.zzan = i;
                return this;
            }

            public final GamesOptions build() {
                return new GamesOptions(this.zzaj, this.zzak, this.zzal, this.zzam, this.zzan, this.zzao, this.zzap, this.zzaq, this.zzar, this.zzas, this.zzat, this.zzau, this.zzav, this.zzaw, null);
            }

            /* synthetic */ Builder(zze zzeVar) {
                this();
            }

            /* synthetic */ Builder(GamesOptions gamesOptions, zze zzeVar) {
                this(gamesOptions);
            }
        }

        public final boolean equals(Object obj) {
            String str;
            GoogleSignInAccount googleSignInAccount;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GamesOptions)) {
                return false;
            }
            GamesOptions gamesOptions = (GamesOptions) obj;
            return this.zzaj == gamesOptions.zzaj && this.zzak == gamesOptions.zzak && this.zzal == gamesOptions.zzal && this.zzam == gamesOptions.zzam && this.zzan == gamesOptions.zzan && ((str = this.zzao) != null ? str.equals(gamesOptions.zzao) : gamesOptions.zzao == null) && this.zzap.equals(gamesOptions.zzap) && this.zzaq == gamesOptions.zzaq && this.zzar == gamesOptions.zzar && ((googleSignInAccount = this.zzas) != null ? googleSignInAccount.equals(gamesOptions.zzas) : gamesOptions.zzas == null) && TextUtils.equals(this.zzat, gamesOptions.zzat) && this.zzau == gamesOptions.zzau && this.zzav == gamesOptions.zzav && this.zzaw == gamesOptions.zzaw;
        }

        public final int hashCode() {
            int i = ((((((((((this.zzaj ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzak ? 1 : 0)) * 31) + this.zzal) * 31) + (this.zzam ? 1 : 0)) * 31) + this.zzan) * 31;
            String str = this.zzao;
            int iHashCode = (((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.zzap.hashCode()) * 31) + (this.zzaq ? 1 : 0)) * 31) + (this.zzar ? 1 : 0)) * 31;
            GoogleSignInAccount googleSignInAccount = this.zzas;
            int iHashCode2 = (iHashCode + (googleSignInAccount == null ? 0 : googleSignInAccount.hashCode())) * 31;
            String str2 = this.zzat;
            return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.zzau) * 31) + this.zzav) * 31) + this.zzaw;
        }

        @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
        public final List<Scope> getImpliedScopes() {
            return Collections.singletonList(Games.SCOPE_GAMES_LITE);
        }

        @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
        public final Bundle toBundle() {
            return zzj();
        }

        public final Bundle zzj() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.zzaj);
            bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", this.zzak);
            bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", this.zzal);
            bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", this.zzam);
            bundle.putInt("com.google.android.gms.games.key.sdkVariant", this.zzan);
            bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", this.zzao);
            bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.zzap);
            bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", this.zzaq);
            bundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", this.zzar);
            bundle.putParcelable("com.google.android.gms.games.key.googleSignInAccount", this.zzas);
            bundle.putString("com.google.android.gms.games.key.realClientPackageName", this.zzat);
            bundle.putInt("com.google.android.gms.games.key.API_VERSION", this.zzav);
            bundle.putInt("com.google.android.gms.games.key.authenticationStrategy", this.zzaw);
            return bundle;
        }

        public static Builder builder() {
            return new Builder((zze) null);
        }

        public static Builder zza(GamesOptions gamesOptions) {
            return new Builder(gamesOptions, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Builder zza(GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
            Builder builder = new Builder(null, 0 == true ? 1 : 0);
            builder.zzas = googleSignInAccount;
            return builder;
        }

        @Override // com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
        public final GoogleSignInAccount getGoogleSignInAccount() {
            return this.zzas;
        }

        /* synthetic */ GamesOptions(boolean z, boolean z2, int i, boolean z3, int i2, String str, ArrayList arrayList, boolean z4, boolean z5, GoogleSignInAccount googleSignInAccount, String str2, int i3, int i4, int i5, zze zzeVar) {
            this(z, z2, i, z3, i2, str, arrayList, z4, z5, googleSignInAccount, str2, i3, i4, i5);
        }
    }

    @Deprecated
    public static PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new zzf(googleApiClient));
    }

    private static GamesOptions zza(GoogleSignInAccount googleSignInAccount) {
        return GamesOptions.zza(googleSignInAccount, null).setSdkVariant(1052947).build();
    }

    private static GamesOptions zza(GamesOptions gamesOptions, GoogleSignInAccount googleSignInAccount) {
        GamesOptions.Builder builderZza = GamesOptions.zza(gamesOptions);
        builderZza.zzas = googleSignInAccount;
        return builderZza.setSdkVariant(1052947).build();
    }

    public static GamesMetadataClient getGamesMetadataClient(Activity activity, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzaz(activity, zza(googleSignInAccount));
    }

    public static GamesMetadataClient getGamesMetadataClient(Activity activity, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzaz(activity, zza(gamesOptions, googleSignInAccount));
    }

    public static GamesMetadataClient getGamesMetadataClient(Context context, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzaz(context, zza(googleSignInAccount));
    }

    public static GamesMetadataClient getGamesMetadataClient(Context context, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzaz(context, zza(gamesOptions, googleSignInAccount));
    }

    public static AchievementsClient getAchievementsClient(Activity activity, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new com.google.android.gms.internal.games.zzf(activity, zza(googleSignInAccount));
    }

    public static AchievementsClient getAchievementsClient(Activity activity, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new com.google.android.gms.internal.games.zzf(activity, zza(gamesOptions, googleSignInAccount));
    }

    public static AchievementsClient getAchievementsClient(Context context, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new com.google.android.gms.internal.games.zzf(context, zza(googleSignInAccount));
    }

    public static AchievementsClient getAchievementsClient(Context context, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new com.google.android.gms.internal.games.zzf(context, zza(gamesOptions, googleSignInAccount));
    }

    public static EventsClient getEventsClient(Activity activity, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzae(activity, zza(googleSignInAccount));
    }

    public static EventsClient getEventsClient(Activity activity, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzae(activity, zza(gamesOptions, googleSignInAccount));
    }

    public static EventsClient getEventsClient(Context context, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzae(context, zza(googleSignInAccount));
    }

    public static EventsClient getEventsClient(Context context, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzae(context, zza(gamesOptions, googleSignInAccount));
    }

    public static LeaderboardsClient getLeaderboardsClient(Activity activity, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzbj(activity, zza(googleSignInAccount));
    }

    public static LeaderboardsClient getLeaderboardsClient(Activity activity, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzbj(activity, zza(gamesOptions, googleSignInAccount));
    }

    public static LeaderboardsClient getLeaderboardsClient(Context context, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzbj(context, zza(googleSignInAccount));
    }

    public static LeaderboardsClient getLeaderboardsClient(Context context, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzbj(context, zza(gamesOptions, googleSignInAccount));
    }

    public static PlayersClient getPlayersClient(Activity activity, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzcm(activity, zza(googleSignInAccount));
    }

    public static PlayersClient getPlayersClient(Activity activity, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzcm(activity, zza(gamesOptions, googleSignInAccount));
    }

    public static PlayersClient getPlayersClient(Context context, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzcm(context, zza(googleSignInAccount));
    }

    public static PlayersClient getPlayersClient(Context context, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzcm(context, zza(gamesOptions, googleSignInAccount));
    }

    public static SnapshotsClient getSnapshotsClient(Activity activity, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzdg(activity, zza(googleSignInAccount));
    }

    public static SnapshotsClient getSnapshotsClient(Activity activity, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzdg(activity, zza(gamesOptions, googleSignInAccount));
    }

    public static SnapshotsClient getSnapshotsClient(Context context, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzdg(context, zza(googleSignInAccount));
    }

    public static SnapshotsClient getSnapshotsClient(Context context, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzdg(context, zza(gamesOptions, googleSignInAccount));
    }

    public static PlayerStatsClient getPlayerStatsClient(Activity activity, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzck(activity, zza(googleSignInAccount));
    }

    public static PlayerStatsClient getPlayerStatsClient(Activity activity, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzck(activity, zza(gamesOptions, googleSignInAccount));
    }

    public static PlayerStatsClient getPlayerStatsClient(Context context, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzck(context, zza(googleSignInAccount));
    }

    public static PlayerStatsClient getPlayerStatsClient(Context context, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzck(context, zza(gamesOptions, googleSignInAccount));
    }

    public static VideosClient getVideosClient(Activity activity, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzei(activity, zza(googleSignInAccount));
    }

    public static VideosClient getVideosClient(Activity activity, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzei(activity, zza(gamesOptions, googleSignInAccount));
    }

    public static VideosClient getVideosClient(Context context, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzei(context, zza(googleSignInAccount));
    }

    public static VideosClient getVideosClient(Context context, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzei(context, zza(gamesOptions, googleSignInAccount));
    }

    public static GamesClient getGamesClient(Activity activity, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzaq(activity, zza(googleSignInAccount));
    }

    public static GamesClient getGamesClient(Activity activity, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzaq(activity, zza(gamesOptions, googleSignInAccount));
    }

    public static GamesClient getGamesClient(Context context, GoogleSignInAccount googleSignInAccount) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzaq(context, zza(googleSignInAccount));
    }

    public static GamesClient getGamesClient(Context context, GoogleSignInAccount googleSignInAccount, GamesOptions gamesOptions) {
        Preconditions.checkNotNull(googleSignInAccount, "GoogleSignInAccount must not be null");
        return new zzaq(context, zza(gamesOptions, googleSignInAccount));
    }

    static {
        Api.ClientKey<com.google.android.gms.games.internal.zzf> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zze zzeVar = new zze();
        zzaf = zzeVar;
        zzg zzgVar = new zzg();
        zzag = zzgVar;
        SCOPE_GAMES = new Scope(Scopes.GAMES);
        SCOPE_GAMES_LITE = new Scope(Scopes.GAMES_LITE);
        SCOPE_GAMES_SNAPSHOTS = new Scope(Scopes.DRIVE_APPFOLDER);
        API = new Api<>("Games.API", zzeVar, clientKey);
        zzah = new Scope(FirstPartyScopes.GAMES_1P);
        zzai = new Api<>("Games.API_1P", zzgVar, clientKey);
        GamesMetadata = new zzba();
        Achievements = new zzo();
        Events = new zzai();
        Leaderboards = new zzbu();
        Players = new zzcw();
        Snapshots = new zzdq();
        Stats = new zzee();
        Videos = new zzeq();
    }
}
