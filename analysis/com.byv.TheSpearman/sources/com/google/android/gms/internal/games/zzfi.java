package com.google.android.gms.internal.games;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzfi extends com.google.android.gms.games.internal.zzb {
    public static final Parcelable.Creator<zzfi> CREATOR = new zzfh();
    private final IBinder zzjn;
    private final Bundle zzjp;

    public zzfi(zzfg zzfgVar) {
        this.zzjp = zzfgVar.zzce();
        this.zzjn = zzfgVar.zzjn;
    }

    zzfi(Bundle bundle, IBinder iBinder) {
        this.zzjp = bundle;
        this.zzjn = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zzjp, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzjn, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
