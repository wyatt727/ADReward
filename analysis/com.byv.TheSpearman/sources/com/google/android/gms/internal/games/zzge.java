package com.google.android.gms.internal.games;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzge {
    static boolean zza(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
