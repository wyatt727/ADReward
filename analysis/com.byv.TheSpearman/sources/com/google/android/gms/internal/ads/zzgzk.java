package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgzk {
    private static final zzgzk zzb = new zzgzk(true);
    final zzhct zza = new zzhcj(16);
    private boolean zzc;
    private boolean zzd;

    private zzgzk() {
    }

    static int zza(zzhdn zzhdnVar, int i, Object obj) {
        int iZzD = zzgza.zzD(i << 3);
        if (zzhdnVar == zzhdn.GROUP) {
            zzhbl zzhblVar = (zzhbl) obj;
            byte[] bArr = zzhai.zzd;
            if (zzhblVar instanceof zzgxr) {
                throw null;
            }
            iZzD += iZzD;
        }
        return iZzD + zzb(zzhdnVar, obj);
    }

    static int zzb(zzhdn zzhdnVar, Object obj) {
        int iZzd;
        int iZzD;
        zzhdn zzhdnVar2 = zzhdn.DOUBLE;
        zzhdo zzhdoVar = zzhdo.INT;
        switch (zzhdnVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                int i = zzgza.zzf;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                int i2 = zzgza.zzf;
                return 4;
            case INT64:
                return zzgza.zzE(((Long) obj).longValue());
            case UINT64:
                return zzgza.zzE(((Long) obj).longValue());
            case INT32:
                return zzgza.zzE(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                int i3 = zzgza.zzf;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                int i4 = zzgza.zzf;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                int i5 = zzgza.zzf;
                return 1;
            case STRING:
                if (!(obj instanceof zzgyj)) {
                    return zzgza.zzC((String) obj);
                }
                int i6 = zzgza.zzf;
                iZzd = ((zzgyj) obj).zzd();
                iZzD = zzgza.zzD(iZzd);
                break;
            case GROUP:
                int i7 = zzgza.zzf;
                return ((zzhbl) obj).zzaY();
            case MESSAGE:
                if (!(obj instanceof zzhaq)) {
                    return zzgza.zzz((zzhbl) obj);
                }
                int i8 = zzgza.zzf;
                iZzd = ((zzhaq) obj).zza();
                iZzD = zzgza.zzD(iZzd);
                break;
            case BYTES:
                if (!(obj instanceof zzgyj)) {
                    int i9 = zzgza.zzf;
                    iZzd = ((byte[]) obj).length;
                    iZzD = zzgza.zzD(iZzd);
                    break;
                } else {
                    int i10 = zzgza.zzf;
                    iZzd = ((zzgyj) obj).zzd();
                    iZzD = zzgza.zzD(iZzd);
                    break;
                }
            case UINT32:
                return zzgza.zzD(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof zzgzz ? zzgza.zzE(((zzgzz) obj).zza()) : zzgza.zzE(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                int i11 = zzgza.zzf;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                int i12 = zzgza.zzf;
                return 8;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                return zzgza.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                return zzgza.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzD + iZzd;
    }

    public static int zzc(zzgzj zzgzjVar, Object obj) {
        zzhdn zzhdnVarZzd = zzgzjVar.zzd();
        int iZza = zzgzjVar.zza();
        if (!zzgzjVar.zzg()) {
            return zza(zzhdnVarZzd, iZza, obj);
        }
        List list = (List) obj;
        int iZza2 = 0;
        if (!zzgzjVar.zzf()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iZza2 += zza(zzhdnVarZzd, iZza, it.next());
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iZza2 += zzb(zzhdnVarZzd, it2.next());
        }
        return zzgza.zzD(iZza << 3) + iZza2 + zzgza.zzD(iZza2);
    }

    public static zzgzk zze() {
        return zzb;
    }

    private static Object zzm(Object obj) {
        if (obj instanceof zzhbq) {
            return ((zzhbq) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzn(Map.Entry entry) {
        zzhbl zzhblVarZzbr;
        zzgzj zzgzjVar = (zzgzj) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzhaq;
        if (zzgzjVar.zzg()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZzf = zzf(zzgzjVar);
            if (objZzf == null) {
                objZzf = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZzf).add(zzm(it.next()));
            }
            this.zza.put(zzgzjVar, objZzf);
            return;
        }
        if (zzgzjVar.zze() != zzhdo.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzgzjVar, zzm(value));
            return;
        }
        Object objZzf2 = zzf(zzgzjVar);
        if (objZzf2 == null) {
            this.zza.put(zzgzjVar, zzm(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (objZzf2 instanceof zzhbq) {
            zzhblVarZzbr = zzgzjVar.zzc((zzhbq) objZzf2, (zzhbq) value);
        } else {
            zzhbk zzhbkVarZzcZ = ((zzhbl) objZzf2).zzcZ();
            zzgzjVar.zzb(zzhbkVarZzcZ, (zzhbl) value);
            zzhblVarZzbr = zzhbkVarZzcZ.zzbr();
        }
        this.zza.put(zzgzjVar, zzhblVarZzbr);
    }

    private static boolean zzo(Map.Entry entry) {
        zzgzj zzgzjVar = (zzgzj) entry.getKey();
        if (zzgzjVar.zze() != zzhdo.MESSAGE) {
            return true;
        }
        if (!zzgzjVar.zzg()) {
            return zzp(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!zzp(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzp(Object obj) {
        if (obj instanceof zzhbm) {
            return ((zzhbm) obj).zzbw();
        }
        if (obj instanceof zzhaq) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzq(Map.Entry entry) {
        int i;
        int iZzD;
        int iZzD2;
        zzgzj zzgzjVar = (zzgzj) entry.getKey();
        Object value = entry.getValue();
        if (zzgzjVar.zze() != zzhdo.MESSAGE || zzgzjVar.zzg() || zzgzjVar.zzf()) {
            return zzc(zzgzjVar, value);
        }
        if (value instanceof zzhaq) {
            int iZza = ((zzgzj) entry.getKey()).zza();
            int iZzD3 = zzgza.zzD(8);
            i = iZzD3 + iZzD3;
            iZzD = zzgza.zzD(16) + zzgza.zzD(iZza);
            int iZzD4 = zzgza.zzD(24);
            int iZza2 = ((zzhaq) value).zza();
            iZzD2 = iZzD4 + zzgza.zzD(iZza2) + iZza2;
        } else {
            int iZza3 = ((zzgzj) entry.getKey()).zza();
            int iZzD5 = zzgza.zzD(8);
            i = iZzD5 + iZzD5;
            iZzD = zzgza.zzD(16) + zzgza.zzD(iZza3);
            iZzD2 = zzgza.zzD(24) + zzgza.zzz((zzhbl) value);
        }
        return i + iZzD + iZzD2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzr(com.google.android.gms.internal.ads.zzgzj r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzhdn r0 = r4.zzd()
            byte[] r1 = com.google.android.gms.internal.ads.zzhai.zzd
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.ads.zzhdn r1 = com.google.android.gms.internal.ads.zzhdn.DOUBLE
            com.google.android.gms.internal.ads.zzhdo r1 = com.google.android.gms.internal.ads.zzhdo.INT
            com.google.android.gms.internal.ads.zzhdo r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhbl
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhaq
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgzz
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgyj
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.ads.zzhdn r4 = r4.zzd()
            com.google.android.gms.internal.ads.zzhdo r4 = r4.zza()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgzk.zzr(com.google.android.gms.internal.ads.zzgzj, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgzk zzgzkVar = new zzgzk();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzgzkVar.zzk((zzgzj) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgzkVar.zzk((zzgzj) entry.getKey(), entry.getValue());
        }
        zzgzkVar.zzd = this.zzd;
        return zzgzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgzk) {
            return this.zza.equals(((zzgzk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int iZzq = 0;
        for (int i = 0; i < this.zza.zzb(); i++) {
            iZzq += zzq(this.zza.zzg(i));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzq += zzq((Map.Entry) it.next());
        }
        return iZzq;
    }

    public final Object zzf(zzgzj zzgzjVar) {
        Object obj = this.zza.get(zzgzjVar);
        if (!(obj instanceof zzhaq)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzg() {
        return this.zzd ? new zzhap(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzh(zzgzj zzgzjVar, Object obj) {
        List arrayList;
        if (!((zzgzs) zzgzjVar).zzd) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        zzr(zzgzjVar, obj);
        Object objZzf = zzf(zzgzjVar);
        if (objZzf == null) {
            arrayList = new ArrayList();
            this.zza.put(zzgzjVar, arrayList);
        } else {
            arrayList = (List) objZzf;
        }
        arrayList.add(obj);
    }

    public final void zzi() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            if (entryZzg.getValue() instanceof zzgzv) {
                ((zzgzv) entryZzg.getValue()).zzbV();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzj(zzgzk zzgzkVar) {
        for (int i = 0; i < zzgzkVar.zza.zzb(); i++) {
            zzn(zzgzkVar.zza.zzg(i));
        }
        Iterator it = zzgzkVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzn((Map.Entry) it.next());
        }
    }

    public final void zzk(zzgzj zzgzjVar, Object obj) {
        if (!zzgzjVar.zzg()) {
            zzr(zzgzjVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzr(zzgzjVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof zzhaq) {
            this.zzd = true;
        }
        this.zza.put(zzgzjVar, obj);
    }

    public final boolean zzl() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzo(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzo((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzgzk(boolean z) {
        zzi();
        zzi();
    }
}
