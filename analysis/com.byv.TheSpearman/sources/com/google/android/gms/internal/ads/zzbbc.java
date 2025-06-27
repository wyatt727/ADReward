package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbbc {
    private final int zza;
    private final zzbaz zzb = new zzbbe();

    public zzbbc(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbbb zzbbbVar = new zzbbb();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzbba(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbbd.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzbbh.zzc(strArrZzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbbbVar.zzb.write(this.zzb.zzb(((zzbbg) it.next()).zzb));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzbbbVar.toString();
    }
}
