package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public final class zzfl extends RuntimeException {
    public zzfl(zzek zzekVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzdn zza() {
        return new zzdn(getMessage());
    }
}
