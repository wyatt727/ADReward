package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes3.dex */
final class zzae extends zzz {
    private final zzag zza;

    zzae(zzag zzagVar, int i) {
        super(zzagVar.size(), i);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
