package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.games.Game;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class ExperienceEventRef extends DataBufferRef implements ExperienceEvent {
    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbq() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Game getGame() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbr() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbs() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String getIconImageUrl() {
        return getString(CampaignEx.JSON_KEY_ICON_URL);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Uri getIconImageUri() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbt() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbu() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbv() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int getType() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zzbw() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }

    public final String toString() {
        throw new NoSuchMethodError();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        throw new NoSuchMethodError();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ ExperienceEvent freeze() {
        throw new NoSuchMethodError();
    }
}
