package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzarj {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzarj(String str, zzapz zzapzVar) {
        String str2 = zzapzVar.zzb;
        long j = zzapzVar.zzc;
        long j2 = zzapzVar.zzd;
        long j3 = zzapzVar.zze;
        long j4 = zzapzVar.zzf;
        List arrayList = zzapzVar.zzh;
        if (arrayList == null) {
            Map map = zzapzVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzaqi((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    static zzarj zza(zzark zzarkVar) throws IOException {
        if (zzarm.zze(zzarkVar) != 538247942) {
            throw new IOException();
        }
        String strZzh = zzarm.zzh(zzarkVar);
        String strZzh2 = zzarm.zzh(zzarkVar);
        long jZzf = zzarm.zzf(zzarkVar);
        long jZzf2 = zzarm.zzf(zzarkVar);
        long jZzf3 = zzarm.zzf(zzarkVar);
        long jZzf4 = zzarm.zzf(zzarkVar);
        int iZze = zzarm.zze(zzarkVar);
        if (iZze < 0) {
            throw new IOException("readHeaderList size=" + iZze);
        }
        List listEmptyList = iZze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < iZze; i++) {
            listEmptyList.add(new zzaqi(zzarm.zzh(zzarkVar).intern(), zzarm.zzh(zzarkVar).intern()));
        }
        return new zzarj(strZzh, strZzh2, jZzf, jZzf2, jZzf3, jZzf4, listEmptyList);
    }

    private zzarj(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
