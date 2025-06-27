package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.util.GmsVersion;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel {
    @Override // com.google.android.gms.common.internal.DowngradeableSafeParcel
    public boolean prepareForClientVersion(int i) {
        setShouldDowngrade(!zzb(Integer.valueOf(i)));
        return true;
    }

    protected static boolean zzb(Integer num) {
        if (num == null) {
            return false;
        }
        return GmsVersion.isAtLeastFenacho(num.intValue());
    }
}
