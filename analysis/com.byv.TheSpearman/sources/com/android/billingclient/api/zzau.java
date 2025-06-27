package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzgq;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
final class zzau extends ResultReceiver {
    final /* synthetic */ ExternalOfferInformationDialogListener zza;
    final /* synthetic */ BillingClientImpl zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzau(BillingClientImpl billingClientImpl, Handler handler, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        super(handler);
        this.zza = externalOfferInformationDialogListener;
        this.zzb = billingClientImpl;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        if (i != 0) {
            if (bundle == null) {
                this.zzb.zzf.zza(zzbx.zzb(97, 25, zzca.zzj));
                this.zza.onExternalOfferInformationDialogResponse(zzca.zzj);
                return;
            } else {
                builderNewBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
                int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                this.zzb.zzf.zza(zzbx.zzc(i2 != 0 ? zzgq.zza(i2) : 23, 25, builderNewBuilder.build(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        this.zza.onExternalOfferInformationDialogResponse(builderNewBuilder.build());
    }
}
