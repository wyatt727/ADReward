package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.Players;
import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public class ProfileSettingsEntity extends com.google.android.gms.games.internal.zzb implements Players.zza {
    public static final Parcelable.Creator<ProfileSettingsEntity> CREATOR = new zze();
    private final boolean zzbh;
    private final String zzbj;
    private final Status zzdw;
    private final boolean zzhp;
    private final boolean zzhq;
    private final StockProfileImageEntity zzhr;
    private final boolean zzhs;
    private final boolean zzht;
    private final int zzhu;
    private final boolean zzhv;
    private final boolean zzhw;
    private final int zzhx;
    private final int zzhy;

    ProfileSettingsEntity(Status status, String str, boolean z, boolean z2, boolean z3, StockProfileImageEntity stockProfileImageEntity, boolean z4, boolean z5, int i, boolean z6, boolean z7, int i2, int i3) {
        this.zzdw = status;
        this.zzbj = str;
        this.zzhp = z;
        this.zzbh = z2;
        this.zzhq = z3;
        this.zzhr = stockProfileImageEntity;
        this.zzhs = z4;
        this.zzht = z5;
        this.zzhu = i;
        this.zzhv = z6;
        this.zzhw = z7;
        this.zzhx = i2;
        this.zzhy = i3;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final String zzk() {
        return this.zzbj;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final boolean zzv() {
        return this.zzhp;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final boolean zzn() {
        return this.zzbh;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final boolean zzt() {
        return this.zzhq;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final StockProfileImage zzu() {
        return this.zzhr;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final boolean zzw() {
        return this.zzhs;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final boolean zzx() {
        return this.zzht;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final boolean zzy() {
        return this.zzhv;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final boolean zzz() {
        return this.zzhw;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzdw;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final int zzaa() {
        return this.zzhu;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final int zzab() {
        return this.zzhx;
    }

    @Override // com.google.android.gms.games.Players.zza
    public final int zzac() {
        return this.zzhy;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzbj, Boolean.valueOf(this.zzhp), Boolean.valueOf(this.zzbh), Boolean.valueOf(this.zzhq), this.zzdw, this.zzhr, Boolean.valueOf(this.zzhs), Boolean.valueOf(this.zzht), Integer.valueOf(this.zzhu), Boolean.valueOf(this.zzhv), Boolean.valueOf(this.zzhw), Integer.valueOf(this.zzhx), Integer.valueOf(this.zzhy));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Players.zza)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Players.zza zzaVar = (Players.zza) obj;
        return Objects.equal(this.zzbj, zzaVar.zzk()) && Objects.equal(Boolean.valueOf(this.zzhp), Boolean.valueOf(zzaVar.zzv())) && Objects.equal(Boolean.valueOf(this.zzbh), Boolean.valueOf(zzaVar.zzn())) && Objects.equal(Boolean.valueOf(this.zzhq), Boolean.valueOf(zzaVar.zzt())) && Objects.equal(this.zzdw, zzaVar.getStatus()) && Objects.equal(this.zzhr, zzaVar.zzu()) && Objects.equal(Boolean.valueOf(this.zzhs), Boolean.valueOf(zzaVar.zzw())) && Objects.equal(Boolean.valueOf(this.zzht), Boolean.valueOf(zzaVar.zzx())) && this.zzhu == zzaVar.zzaa() && this.zzhv == zzaVar.zzy() && this.zzhw == zzaVar.zzz() && this.zzhx == zzaVar.zzab() && this.zzhy == zzaVar.zzac();
    }

    public String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("GamerTag", this.zzbj).add("IsGamerTagExplicitlySet", Boolean.valueOf(this.zzhp)).add("IsProfileVisible", Boolean.valueOf(this.zzbh)).add("IsVisibilityExplicitlySet", Boolean.valueOf(this.zzhq)).add("Status", this.zzdw).add("StockProfileImage", this.zzhr).add("IsProfileDiscoverable", Boolean.valueOf(this.zzhs)).add("AutoSignIn", Boolean.valueOf(this.zzht)).add("httpErrorCode", Integer.valueOf(this.zzhu)).add("IsSettingsChangesProhibited", Boolean.valueOf(this.zzhv));
        char[] cArr = {128, 171, 171, Typography.registered, Typography.paragraph, 133, Typography.plusMinus, 168, 164, 173, Typography.pound, 136, 173, 181, 168, 179, 164, 178};
        for (int i = 0; i < 18; i++) {
            cArr[i] = (char) (cArr[i] - '?');
        }
        Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add(new String(cArr), Boolean.valueOf(this.zzhw)).add("ProfileVisibility", Integer.valueOf(this.zzhx));
        char[] cArr2 = {166, 171, Typography.registered, 161, Typography.nbsp, 171, 158, 165, Typography.plusMinus, 168, 164, 173, Typography.pound, 178, 158, 171, 168, 178, 179, 158, 181, 168, 178, 168, 161, 168, 171, 168, 179, 184};
        for (int i2 = 0; i2 < 30; i2++) {
            cArr2[i2] = (char) (cArr2[i2] - '?');
        }
        return toStringHelperAdd2.add(new String(cArr2), Integer.valueOf(this.zzhy)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzbj, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzhp);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzbh);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzhq);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzhr, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzhs);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzht);
        SafeParcelWriter.writeInt(parcel, 9, this.zzhu);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzhv);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzhw);
        SafeParcelWriter.writeInt(parcel, 12, this.zzhx);
        SafeParcelWriter.writeInt(parcel, 13, this.zzhy);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
