package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.2.0 */
/* loaded from: classes3.dex */
final class zzdb extends zzcy {
    private final zzdd zza;

    zzdb(zzdd zzddVar, int i) {
        super(zzddVar.size(), i);
        this.zza = zzddVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcy
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
