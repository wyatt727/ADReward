package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes3.dex */
public final class zzbeo {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbeo(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put(t2.h.h, "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public static final zzbel zzf() {
        return new zzbel(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime(), null, null);
    }

    public final zzben zza() {
        zzben zzbenVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            for (zzbel zzbelVar : this.zza) {
                long jZza = zzbelVar.zza();
                String strZzc = zzbelVar.zzc();
                zzbel zzbelVarZzb = zzbelVar.zzb();
                if (zzbelVarZzb != null && jZza > 0) {
                    long jZza2 = jZza - zzbelVarZzb.zza();
                    sb.append(strZzc);
                    sb.append('.');
                    sb.append(jZza2);
                    sb.append(AbstractJsonLexerKt.COMMA);
                    if (zBooleanValue) {
                        if (map.containsKey(Long.valueOf(zzbelVarZzb.zza()))) {
                            StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbelVarZzb.zza()));
                            sb2.append(SignatureVisitor.EXTENDS);
                            sb2.append(strZzc);
                        } else {
                            map.put(Long.valueOf(zzbelVarZzb.zza()), new StringBuilder(strZzc));
                        }
                    }
                }
            }
            this.zza.clear();
            String string = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (zBooleanValue) {
                for (Map.Entry entry : map.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime()));
                    sb3.append(AbstractJsonLexerKt.COMMA);
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                string = sb3.toString();
            }
            zzbenVar = new zzben(sb.toString(), string);
        }
        return zzbenVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzu.zzo().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbeo zzbeoVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbee zzbeeVarZzg;
        if (TextUtils.isEmpty(str2) || (zzbeeVarZzg = com.google.android.gms.ads.internal.zzu.zzo().zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbek zzbekVarZza = zzbeeVarZzg.zza(str);
            Map map = this.zzb;
            map.put(str, zzbekVarZza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbel zzbelVar, long j, String... strArr) {
        synchronized (this.zzc) {
            for (int i = 0; i <= 0; i++) {
                this.zza.add(new zzbel(j, strArr[i], zzbelVar));
            }
        }
        return true;
    }
}
