package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
final class zzba extends com.google.android.gms.internal.play_billing.zzc {
    final AlternativeBillingOnlyReportingDetailsListener zza;
    final zzby zzb;

    /* synthetic */ zzba(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, zzby zzbyVar, zzaz zzazVar) {
        this.zza = alternativeBillingOnlyReportingDetailsListener;
        this.zzb = zzbyVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.zzb.zza(zzbx.zzb(71, 15, zzca.zzj));
            this.zza.onAlternativeBillingOnlyTokenResponse(zzca.zzj, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzca.zza(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iZzb);
            this.zzb.zza(zzbx.zzb(23, 15, billingResultZza));
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResultZza, null);
            return;
        }
        try {
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResultZza, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e);
            this.zzb.zza(zzbx.zzb(72, 15, zzca.zzj));
            this.zza.onAlternativeBillingOnlyTokenResponse(zzca.zzj, null);
        }
    }
}
