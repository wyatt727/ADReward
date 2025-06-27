package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhiz extends zzhir {
    private static final zzhje zza = zzhiw.zza(Collections.emptyMap());

    /* synthetic */ zzhiz(Map map, zzhix zzhixVar) {
        super(map);
    }

    public static zzhiy zzc(int i) {
        return new zzhiy(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzb = zzhis.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzb.put(entry.getKey(), ((zzhje) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzb);
    }
}
