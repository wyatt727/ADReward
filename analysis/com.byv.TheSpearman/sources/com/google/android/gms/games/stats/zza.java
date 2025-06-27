package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zza extends DataBufferRef implements PlayerStats {
    private Bundle zzlw;

    zza(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getAverageSessionLength() {
        return getFloat("ave_session_length_minutes");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getChurnProbability() {
        return getFloat("churn_probability");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getDaysSinceLastPlayed() {
        return getInteger("days_since_last_played");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getNumberOfPurchases() {
        return getInteger("num_purchases");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getNumberOfSessions() {
        return getInteger("num_sessions");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSessionPercentile() {
        return getFloat("num_sessions_percentile");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSpendPercentile() {
        return getFloat("spend_percentile");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSpendProbability() {
        if (hasColumn("spend_probability")) {
            return getFloat("spend_probability");
        }
        return -1.0f;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getHighSpenderProbability() {
        if (hasColumn("high_spender_probability")) {
            return getFloat("high_spender_probability");
        }
        return -1.0f;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getTotalSpendNext28Days() {
        if (hasColumn("total_spend_next_28_days")) {
            return getFloat("total_spend_next_28_days");
        }
        return -1.0f;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final Bundle zzcm() {
        Bundle bundle = this.zzlw;
        if (bundle != null) {
            return bundle;
        }
        this.zzlw = new Bundle();
        String string = getString("unknown_raw_keys");
        String string2 = getString("unknown_raw_values");
        if (string != null && string2 != null) {
            String[] strArrSplit = string.split(",");
            String[] strArrSplit2 = string2.split(",");
            Asserts.checkState(strArrSplit.length <= strArrSplit2.length, "Invalid raw arguments!");
            for (int i = 0; i < strArrSplit.length; i++) {
                this.zzlw.putString(strArrSplit[i], strArrSplit2[i]);
            }
        }
        return this.zzlw;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return PlayerStatsEntity.zza(this);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object obj) {
        return PlayerStatsEntity.zza(this, obj);
    }

    public final String toString() {
        return PlayerStatsEntity.zzb(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ((PlayerStatsEntity) ((PlayerStats) freeze())).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ PlayerStats freeze() {
        return new PlayerStatsEntity(this);
    }
}
