package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgoo {
    private final Class zza;
    private zzgoq zzd;
    private Map zzb = new HashMap();
    private final List zzc = new ArrayList();
    private zzgrs zze = zzgrs.zza;

    /* synthetic */ zzgoo(Class cls, zzgon zzgonVar) {
        this.zza = cls;
    }

    private final zzgoo zze(Object obj, zzgft zzgftVar, zzgvb zzgvbVar, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (this.zzb == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (zzgvbVar.zzd() != zzgur.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        zzgvv zzgvvVar = zzgvv.UNKNOWN_PREFIX;
        int iOrdinal = zzgvbVar.zzg().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgvbVar.zza()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgvbVar.zza()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgvbVar.zza()).array();
        } else {
            bArrArray = zzgfo.zza;
        }
        zzgoq zzgoqVar = new zzgoq(obj, zzgxm.zzb(bArrArray), zzgvbVar.zzd(), zzgvbVar.zzg(), zzgvbVar.zza(), zzgvbVar.zzc().zzg(), zzgftVar, null);
        Map map = this.zzb;
        List list = this.zzc;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzgoqVar);
        List list2 = (List) map.put(zzgoqVar.zzb, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(zzgoqVar);
            map.put(zzgoqVar.zzb, Collections.unmodifiableList(arrayList2));
        }
        list.add(zzgoqVar);
        if (z) {
            if (this.zzd != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzd = zzgoqVar;
        }
        return this;
    }

    public final zzgoo zza(Object obj, zzgft zzgftVar, zzgvb zzgvbVar) throws GeneralSecurityException {
        zze(obj, zzgftVar, zzgvbVar, false);
        return this;
    }

    public final zzgoo zzb(Object obj, zzgft zzgftVar, zzgvb zzgvbVar) throws GeneralSecurityException {
        zze(obj, zzgftVar, zzgvbVar, true);
        return this;
    }

    public final zzgoo zzc(zzgrs zzgrsVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzgrsVar;
        return this;
    }

    public final zzgos zzd() throws GeneralSecurityException {
        Map map = this.zzb;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzgos zzgosVar = new zzgos(map, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzgosVar;
    }
}
