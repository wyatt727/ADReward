package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
final class zzad {
    static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
