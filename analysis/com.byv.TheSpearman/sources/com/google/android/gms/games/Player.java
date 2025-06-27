package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public interface Player extends Parcelable, Freezable<Player> {
    public static final long CURRENT_XP_UNKNOWN = -1;
    public static final long TIMESTAMP_UNKNOWN = -1;

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FriendsListVisibilityStatus {
        public static final int FEATURE_UNAVAILABLE = 3;
        public static final int REQUEST_REQUIRED = 2;
        public static final int UNKNOWN = 0;
        public static final int VISIBLE = 1;
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerFriendStatus {
        public static final int FRIEND = 4;
        public static final int NO_RELATIONSHIP = 0;
        public static final int UNKNOWN = -1;
    }

    Uri getBannerImageLandscapeUri();

    @Deprecated
    String getBannerImageLandscapeUrl();

    Uri getBannerImagePortraitUri();

    @Deprecated
    String getBannerImagePortraitUrl();

    CurrentPlayerInfo getCurrentPlayerInfo();

    String getDisplayName();

    void getDisplayName(CharArrayBuffer charArrayBuffer);

    Uri getHiResImageUri();

    @Deprecated
    String getHiResImageUrl();

    Uri getIconImageUri();

    @Deprecated
    String getIconImageUrl();

    @Deprecated
    long getLastPlayedWithTimestamp();

    PlayerLevelInfo getLevelInfo();

    String getName();

    String getPlayerId();

    PlayerRelationshipInfo getRelationshipInfo();

    long getRetrievedTimestamp();

    String getTitle();

    void getTitle(CharArrayBuffer charArrayBuffer);

    boolean hasHiResImage();

    boolean hasIconImage();

    String zzk();

    boolean zzl();

    @Deprecated
    int zzm();

    boolean zzn();

    com.google.android.gms.games.internal.player.zza zzo();

    long zzp();
}
