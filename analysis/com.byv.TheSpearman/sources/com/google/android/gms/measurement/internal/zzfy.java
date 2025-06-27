package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.json.t2;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzfy {
    private static final AtomicReference<String[]> zza = new AtomicReference<>();
    private static final AtomicReference<String[]> zzb = new AtomicReference<>();
    private static final AtomicReference<String[]> zzc = new AtomicReference<>();
    private final zzfx zzd;

    private final String zza(Object[] objArr) {
        String strValueOf;
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(t2.i.d);
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                strValueOf = zza((Bundle) obj);
            } else {
                strValueOf = String.valueOf(obj);
            }
            if (strValueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strValueOf);
            }
        }
        sb.append(t2.i.e);
        return sb.toString();
    }

    protected final String zza(Bundle bundle) {
        String strValueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(zzb(str));
            sb.append(t2.i.b);
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strValueOf = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strValueOf = zza((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                strValueOf = zza(((ArrayList) obj).toArray());
            } else {
                strValueOf = String.valueOf(obj);
            }
            sb.append(strValueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String zza(zzbd zzbdVar) {
        String strZza = null;
        if (zzbdVar == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return zzbdVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzbdVar.zzc);
        sb.append(",name=");
        sb.append(zza(zzbdVar.zza));
        sb.append(",params=");
        zzbc zzbcVar = zzbdVar.zzb;
        if (zzbcVar != null) {
            if (!this.zzd.zza()) {
                strZza = zzbcVar.toString();
            } else {
                strZza = zza(zzbcVar.zzb());
            }
        }
        sb.append(strZza);
        return sb.toString();
    }

    protected final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zza(str, zziu.zzc, zziu.zza, zza);
    }

    protected final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zza(str, zziw.zzb, zziw.zza, zzb);
    }

    protected final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return zza(str, zziv.zzb, zziv.zza, zzc);
    }

    private static String zza(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    public zzfy(zzfx zzfxVar) {
        this.zzd = zzfxVar;
    }
}
