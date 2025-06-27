package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzji;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public abstract class zzju<T extends zzji> {
    private static String zza = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    static <T extends zzji> T zza(Class<T> cls) {
        String str;
        ClassLoader classLoader = zzju.class.getClassLoader();
        if (cls.equals(zzji.class)) {
            str = zza;
        } else {
            if (!cls.getPackage().equals(zzju.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((zzju) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzju.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzju) it.next()).zza()));
                } catch (ServiceConfigurationError e5) {
                    Logger.getLogger(zzjc.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load " + cls.getSimpleName(), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    protected abstract T zza();
}
