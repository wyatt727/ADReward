package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public interface Game extends Parcelable, Freezable<Game> {
    boolean areSnapshotsEnabled();

    int getAchievementTotalCount();

    String getApplicationId();

    String getDescription();

    void getDescription(CharArrayBuffer charArrayBuffer);

    String getDeveloperName();

    void getDeveloperName(CharArrayBuffer charArrayBuffer);

    String getDisplayName();

    void getDisplayName(CharArrayBuffer charArrayBuffer);

    Uri getFeaturedImageUri();

    @Deprecated
    String getFeaturedImageUrl();

    Uri getHiResImageUri();

    @Deprecated
    String getHiResImageUrl();

    Uri getIconImageUri();

    @Deprecated
    String getIconImageUrl();

    int getLeaderboardCount();

    String getPrimaryCategory();

    String getSecondaryCategory();

    String getThemeColor();

    boolean hasGamepadSupport();

    boolean isMuted();

    boolean zzc();

    boolean zzd();

    boolean zze();

    String zzf();

    @Deprecated
    boolean zzg();

    @Deprecated
    boolean zzh();
}
