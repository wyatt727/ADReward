package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaam implements zzdm {
    private static final zzfxh zza = zzfxk.zza(new zzfxh() { // from class: com.google.android.gms.internal.ads.zzaak
        @Override // com.google.android.gms.internal.ads.zzfxh
        public final Object zza() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object objInvoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                Objects.requireNonNull(objInvoke);
                return (zzdm) objInvoke;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    });

    private zzaam() {
    }

    /* synthetic */ zzaam(zzaal zzaalVar) {
    }
}
