package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzjl<T extends zzjn<T>> {
    private static final zzjl zzb = new zzjl(true);
    final zzmb<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    static int zza(zzni zzniVar, int i, Object obj) {
        int iZzf = zzjc.zzf(i);
        if (zzniVar == zzni.zzj) {
            zzjy.zza((zzli) obj);
            iZzf <<= 1;
        }
        return iZzf + zza(zzniVar, obj);
    }

    private static int zza(zzni zzniVar, Object obj) {
        switch (zzjo.zzb[zzniVar.ordinal()]) {
            case 1:
                return zzjc.zza(((Double) obj).doubleValue());
            case 2:
                return zzjc.zza(((Float) obj).floatValue());
            case 3:
                return zzjc.zzb(((Long) obj).longValue());
            case 4:
                return zzjc.zze(((Long) obj).longValue());
            case 5:
                return zzjc.zzc(((Integer) obj).intValue());
            case 6:
                return zzjc.zza(((Long) obj).longValue());
            case 7:
                return zzjc.zzb(((Integer) obj).intValue());
            case 8:
                return zzjc.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzjc.zza((zzli) obj);
            case 10:
                if (obj instanceof zzki) {
                    return zzjc.zza((zzki) obj);
                }
                return zzjc.zzb((zzli) obj);
            case 11:
                if (obj instanceof zzii) {
                    return zzjc.zza((zzii) obj);
                }
                return zzjc.zza((String) obj);
            case 12:
                if (obj instanceof zzii) {
                    return zzjc.zza((zzii) obj);
                }
                return zzjc.zza((byte[]) obj);
            case 13:
                return zzjc.zzg(((Integer) obj).intValue());
            case 14:
                return zzjc.zzd(((Integer) obj).intValue());
            case 15:
                return zzjc.zzc(((Long) obj).longValue());
            case 16:
                return zzjc.zze(((Integer) obj).intValue());
            case 17:
                return zzjc.zzd(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzjx) {
                    return zzjc.zza(((zzjx) obj).zza());
                }
                return zzjc.zza(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zza(zzjn<?> zzjnVar, Object obj) {
        zzni zzniVarZzb = zzjnVar.zzb();
        int iZza = zzjnVar.zza();
        if (zzjnVar.zze()) {
            List list = (List) obj;
            int iZza2 = 0;
            if (zzjnVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iZza2 += zza(zzniVarZzb, it.next());
                }
                return zzjc.zzf(iZza) + iZza2 + zzjc.zzg(iZza2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                iZza2 += zza(zzniVarZzb, iZza, it2.next());
            }
            return iZza2;
        }
        return zza(zzniVarZzb, iZza, obj);
    }

    public final int zza() {
        int iZza = 0;
        for (int i = 0; i < this.zza.zza(); i++) {
            iZza += zza((Map.Entry) this.zza.zzb(i));
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            iZza += zza((Map.Entry) it.next());
        }
        return iZza;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzns.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzki) {
                return zzjc.zza(entry.getKey().zza(), (zzki) value);
            }
            return zzjc.zza(entry.getKey().zza(), (zzli) value);
        }
        return zza((zzjn<?>) key, value);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public static <T extends zzjn<T>> zzjl<T> zzb() {
        return zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzjl zzjlVar = new zzjl();
        for (int i = 0; i < this.zza.zza(); i++) {
            Map.Entry<K, Object> entryZzb = this.zza.zzb(i);
            zzjlVar.zzb((zzjn) entryZzb.getKey(), entryZzb.getValue());
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzjlVar.zzb((zzjn) entry.getKey(), entry.getValue());
        }
        zzjlVar.zzd = this.zzd;
        return zzjlVar;
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzln) {
            return ((zzln) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (!(obj instanceof zzki)) {
            return obj;
        }
        return zzki.zza();
    }

    final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zzd) {
            return new zzkj(this.zza.zzc().iterator());
        }
        return this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zzd) {
            return new zzkj(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    private zzjl() {
        this.zza = zzmb.zza(16);
    }

    private zzjl(zzmb<T, Object> zzmbVar) {
        this.zza = zzmbVar;
        zze();
    }

    private zzjl(boolean z) {
        this(zzmb.zza(0));
        zze();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zza(); i++) {
            Map.Entry<K, Object> entryZzb = this.zza.zzb(i);
            if (entryZzb.getValue() instanceof zzjv) {
                ((zzjv) entryZzb.getValue()).zzch();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final void zza(zzjl<T> zzjlVar) {
        for (int i = 0; i < zzjlVar.zza.zza(); i++) {
            zzb((Map.Entry) zzjlVar.zza.zzb(i));
        }
        Iterator it = zzjlVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzli zzliVarZzah;
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzki;
        if (key.zze()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZza = zza((zzjl<T>) key);
            if (objZza == null) {
                objZza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZza).add(zza(it.next()));
            }
            this.zza.zza((zzmb<T, Object>) key, (T) objZza);
            return;
        }
        if (key.zzc() != zzns.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzmb<T, Object>) key, (T) zza(value));
            return;
        }
        Object objZza2 = zza((zzjl<T>) key);
        if (objZza2 == null) {
            this.zza.zza((zzmb<T, Object>) key, (T) zza(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            value = zzki.zza();
        }
        if (objZza2 instanceof zzln) {
            zzliVarZzah = key.zza((zzln) objZza2, (zzln) value);
        } else {
            zzliVarZzah = key.zza(((zzli) objZza2).zzcg(), (zzli) value).zzah();
        }
        this.zza.zza((zzmb<T, Object>) key, (T) zzliVarZzah);
    }

    private final void zzb(T t, Object obj) {
        if (t.zze()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                zzc(t, obj2);
            }
            obj = arrayList;
        } else {
            zzc(t, obj);
        }
        if (obj instanceof zzki) {
            this.zzd = true;
        }
        this.zza.zza((zzmb<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzc(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.measurement.zzni r0 = r5.zzb()
            com.google.android.gms.internal.measurement.zzjy.zza(r6)
            int[] r1 = com.google.android.gms.internal.measurement.zzjo.zza
            com.google.android.gms.internal.measurement.zzns r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = r2
            goto L47
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzli
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzki
            if (r0 == 0) goto L18
            goto L34
        L23:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzjx
            if (r0 == 0) goto L18
            goto L34
        L2c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzii
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
        L34:
            r0 = r1
            goto L47
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.google.android.gms.internal.measurement.zzni r5 = r5.zzb()
            com.google.android.gms.internal.measurement.zzns r5 = r5.zzb()
            r3[r1] = r5
            r5 = 2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r3[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjl.zzc(com.google.android.gms.internal.measurement.zzjn, java.lang.Object):void");
    }

    static void zza(zzjc zzjcVar, zzni zzniVar, int i, Object obj) throws IOException {
        if (zzniVar == zzni.zzj) {
            zzli zzliVar = (zzli) obj;
            zzjy.zza(zzliVar);
            zzjcVar.zzj(i, 3);
            zzliVar.zza(zzjcVar);
            zzjcVar.zzj(i, 4);
        }
        zzjcVar.zzj(i, zzniVar.zza());
        switch (zzjo.zzb[zzniVar.ordinal()]) {
            case 1:
                zzjcVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzjcVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzjcVar.zzh(((Long) obj).longValue());
                break;
            case 4:
                zzjcVar.zzh(((Long) obj).longValue());
                break;
            case 5:
                zzjcVar.zzi(((Integer) obj).intValue());
                break;
            case 6:
                zzjcVar.zzf(((Long) obj).longValue());
                break;
            case 7:
                zzjcVar.zzh(((Integer) obj).intValue());
                break;
            case 8:
                zzjcVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzli) obj).zza(zzjcVar);
                break;
            case 10:
                zzjcVar.zzc((zzli) obj);
                break;
            case 11:
                if (obj instanceof zzii) {
                    zzjcVar.zzb((zzii) obj);
                    break;
                } else {
                    zzjcVar.zzb((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof zzii) {
                    zzjcVar.zzb((zzii) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzjcVar.zzb(bArr, 0, bArr.length);
                    break;
                }
            case 13:
                zzjcVar.zzk(((Integer) obj).intValue());
                break;
            case 14:
                zzjcVar.zzh(((Integer) obj).intValue());
                break;
            case 15:
                zzjcVar.zzf(((Long) obj).longValue());
                break;
            case 16:
                zzjcVar.zzj(((Integer) obj).intValue());
                break;
            case 17:
                zzjcVar.zzg(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzjx) {
                    zzjcVar.zzi(((zzjx) obj).zza());
                    break;
                } else {
                    zzjcVar.zzi(((Integer) obj).intValue());
                    break;
                }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjl) {
            return this.zza.equals(((zzjl) obj).zza);
        }
        return false;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i = 0; i < this.zza.zza(); i++) {
            if (!zzc(this.zza.zzb(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzjn<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzns.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!zzb(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzlk) {
            return ((zzlk) obj).i_();
        }
        if (obj instanceof zzki) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
}
