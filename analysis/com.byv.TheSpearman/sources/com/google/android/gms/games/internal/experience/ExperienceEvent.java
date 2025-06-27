package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public interface ExperienceEvent extends Parcelable, Freezable<ExperienceEvent> {
    Game getGame();

    Uri getIconImageUri();

    @Deprecated
    String getIconImageUrl();

    int getType();

    String zzbq();

    String zzbr();

    String zzbs();

    long zzbt();

    long zzbu();

    long zzbv();

    int zzbw();
}
