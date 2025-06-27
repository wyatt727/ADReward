package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhcw extends RuntimeException {
    public zzhcw(zzhbl zzhblVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhak zza() {
        return new zzhak(getMessage());
    }
}
