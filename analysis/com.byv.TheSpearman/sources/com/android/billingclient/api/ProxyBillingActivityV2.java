package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContracts;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {
    private ActivityResultLauncher zza;
    private ActivityResultLauncher zzb;
    private ResultReceiver zzc;
    private ResultReceiver zzd;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zza = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.android.billingclient.api.zzcv
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                this.zza.zza((ActivityResult) obj);
            }
        });
        this.zzb = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.android.billingclient.api.zzcw
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                this.zza.zzb((ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.zzc = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.zzd = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzj("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.zzc = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.zza.launch(new IntentSenderRequest.Builder(pendingIntent).build());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.zzd = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.zzb.launch(new IntentSenderRequest.Builder(pendingIntent2).build());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.zzd;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }

    final void zza(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int responseCode = com.google.android.gms.internal.play_billing.zzb.zze(data, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    final void zzb(ActivityResult activityResult) {
        Intent data = activityResult.getData();
        int responseCode = com.google.android.gms.internal.play_billing.zzb.zze(data, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzd;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.getResultCode()), Integer.valueOf(responseCode)));
        }
        finish();
    }
}
