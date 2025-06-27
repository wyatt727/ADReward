package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfwj {
    private final String zza;
    private final zzfwh zzb;
    private zzfwh zzc;

    /* synthetic */ zzfwj(String str, zzfwi zzfwiVar) {
        zzfwh zzfwhVar = new zzfwh();
        this.zzb = zzfwhVar;
        this.zzc = zzfwhVar;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzfwh zzfwhVar = this.zzb.zzb;
        String str = "";
        while (zzfwhVar != null) {
            Object obj = zzfwhVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzfwhVar = zzfwhVar.zzb;
            str = ", ";
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final zzfwj zza(@CheckForNull Object obj) {
        zzfwh zzfwhVar = new zzfwh();
        this.zzc.zzb = zzfwhVar;
        this.zzc = zzfwhVar;
        zzfwhVar.zza = obj;
        return this;
    }
}
