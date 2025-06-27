package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.json.t2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaes {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzby zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = zzfx.zza;
            String[] strArrSplit = str.split(t2.i.b, 2);
            if (strArrSplit.length != 2) {
                zzfe.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzagi.zzb(new zzfo(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    zzfe.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzaia(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzby(arrayList);
    }

    public static zzaep zzc(zzfo zzfoVar, boolean z, boolean z2) throws zzcc {
        if (z) {
            zzd(3, zzfoVar, false);
        }
        String strZzA = zzfoVar.zzA((int) zzfoVar.zzs(), zzfwd.zzc);
        int length = strZzA.length();
        long jZzs = zzfoVar.zzs();
        String[] strArr = new String[(int) jZzs];
        int length2 = length + 15;
        for (int i = 0; i < jZzs; i++) {
            String strZzA2 = zzfoVar.zzA((int) zzfoVar.zzs(), zzfwd.zzc);
            strArr[i] = strZzA2;
            length2 = length2 + 4 + strZzA2.length();
        }
        if (z2 && (zzfoVar.zzm() & 1) == 0) {
            throw zzcc.zza("framing bit expected to be set", null);
        }
        return new zzaep(strZzA, strArr, length2 + 1);
    }

    public static boolean zzd(int i, zzfo zzfoVar, boolean z) throws zzcc {
        if (zzfoVar.zzb() < 7) {
            if (z) {
                return false;
            }
            throw zzcc.zza("too short header: " + zzfoVar.zzb(), null);
        }
        if (zzfoVar.zzm() != i) {
            if (z) {
                return false;
            }
            throw zzcc.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzfoVar.zzm() == 118 && zzfoVar.zzm() == 111 && zzfoVar.zzm() == 114 && zzfoVar.zzm() == 98 && zzfoVar.zzm() == 105 && zzfoVar.zzm() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzcc.zza("expected characters 'vorbis'", null);
    }
}
