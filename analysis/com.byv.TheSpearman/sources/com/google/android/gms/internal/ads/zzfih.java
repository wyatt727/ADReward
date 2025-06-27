package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfih implements zzfig {
    private final Object[] zza;

    public zzfih(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, int i, String str2, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzlVar.zzb));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(zzlVar.zzc));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzlVar.zzc.getString("npa"));
        }
        if (hashSet.contains(AndroidBridgeConstants.SEGMENT_GENDER)) {
            arrayList.add(Integer.valueOf(zzlVar.zzd));
        }
        if (hashSet.contains("keywords")) {
            List list = zzlVar.zze;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzf));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzlVar.zzg));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzh));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzlVar.zzi);
        }
        if (hashSet.contains(FirebaseAnalytics.Param.LOCATION)) {
            Location location = zzlVar.zzk;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzlVar.zzl);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(zzlVar.zzm));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(zzlVar.zzn));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = zzlVar.zzo;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzlVar.zzp);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzlVar.zzq);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzr));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzlVar.zzt));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzlVar.zzu);
        }
        if (hashSet.contains("orientation")) {
            if (zzwVar != null) {
                arrayList.add(Integer.valueOf(zzwVar.zza));
            } else {
                arrayList.add(null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? AbstractJsonLexerKt.NULL : obj instanceof Bundle ? zza((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfig
    public final boolean equals(Object obj) {
        if (obj instanceof zzfih) {
            return Arrays.equals(this.zza, ((zzfih) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfig
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        Object[] objArr = this.zza;
        return "[PoolKey#" + Arrays.hashCode(objArr) + " " + Arrays.toString(objArr) + t2.i.e;
    }
}
