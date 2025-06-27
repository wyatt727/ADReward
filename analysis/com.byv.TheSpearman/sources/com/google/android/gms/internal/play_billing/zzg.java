package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public abstract class zzg extends zzw implements zzh {
    public zzg() {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzw
    protected final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzx.zza(parcel, Bundle.CREATOR);
        zzx.zzb(parcel);
        zza(bundle);
        return true;
    }
}
