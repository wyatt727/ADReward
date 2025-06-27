package com.google.android.gms.internal.games;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzgl extends zzgk {
    private final zzgj zznm = new zzgj();

    zzgl() {
    }

    @Override // com.google.android.gms.internal.games.zzgk
    public final void zza(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.zznm.zza(th, true).add(th2);
    }
}
