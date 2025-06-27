package com.android.billingclient.api;

import android.content.Context;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
final class zzdi {
    private static boolean zza = false;

    static synchronized boolean zza(Context context) {
        if (zza) {
            return false;
        }
        zza = true;
        return false;
    }
}
