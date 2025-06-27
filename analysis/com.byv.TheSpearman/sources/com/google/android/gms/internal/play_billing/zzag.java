package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzag extends zzac {
    private final zzai zza;

    zzag(zzai zzaiVar, int i) {
        super(zzaiVar.size(), i);
        this.zza = zzaiVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
