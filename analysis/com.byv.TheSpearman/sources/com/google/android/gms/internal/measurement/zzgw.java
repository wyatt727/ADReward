package com.google.android.gms.internal.measurement;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzgw implements zzhf {
    private final SimpleArrayMap<String, SimpleArrayMap<String, String>> zza;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    @Override // com.google.android.gms.internal.measurement.zzhf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zza(android.net.Uri r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L8
            java.lang.String r3 = r2.toString()
            goto La
        L8:
            if (r3 == 0) goto L16
        La:
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String>> r2 = r1.zza
            if (r2 != 0) goto Lf
            goto L16
        Lf:
            java.lang.Object r2 = r2.get(r3)
            androidx.collection.SimpleArrayMap r2 = (androidx.collection.SimpleArrayMap) r2
            goto L17
        L16:
            r2 = r0
        L17:
            if (r2 != 0) goto L1a
            return r0
        L1a:
            if (r4 == 0) goto L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
        L2b:
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgw.zza(android.net.Uri, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    zzgw(SimpleArrayMap<String, SimpleArrayMap<String, String>> simpleArrayMap) {
        this.zza = simpleArrayMap;
    }
}
