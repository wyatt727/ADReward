package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.json.t2;
import com.my.target.ads.Reward;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zziq {
    public static final zziq zza = new zziq(null, null, 100);
    private final EnumMap<zza, zzit> zzb;
    private final int zzc;

    static String zza(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static boolean zza(int i, int i2) {
        return ((i == -20 && i2 == -30) || ((i == -30 && i2 == -20) || i == i2)) || i < i2;
    }

    static char zza(zzit zzitVar) {
        if (zzitVar == null) {
            return SignatureVisitor.SUPER;
        }
        int iOrdinal = zzitVar.ordinal();
        if (iOrdinal == 1) {
            return SignatureVisitor.EXTENDS;
        }
        if (iOrdinal == 2) {
            return '0';
        }
        if (iOrdinal != 3) {
            return SignatureVisitor.SUPER;
        }
        return '1';
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final int hashCode() {
        int iHashCode = this.zzc * 17;
        Iterator<zzit> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        Iterator it = this.zzb.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strZzb = zzb((zzit) entry.getValue());
            if (strZzb != null) {
                bundle.putString(((zza) entry.getKey()).zze, strZzb);
            }
        }
        return bundle;
    }

    static zzit zza(String str) {
        if (str == null) {
            return zzit.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzit.GRANTED;
        }
        if (str.equals("denied")) {
            return zzit.DENIED;
        }
        return zzit.UNINITIALIZED;
    }

    public final zzit zzc() {
        zzit zzitVar = this.zzb.get(zza.AD_STORAGE);
        return zzitVar == null ? zzit.UNINITIALIZED : zzitVar;
    }

    public final zzit zzd() {
        zzit zzitVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        return zzitVar == null ? zzit.UNINITIALIZED : zzitVar;
    }

    static zzit zza(char c) {
        if (c == '+') {
            return zzit.DEFAULT;
        }
        if (c == '0') {
            return zzit.DENIED;
        }
        if (c == '1') {
            return zzit.GRANTED;
        }
        return zzit.UNINITIALIZED;
    }

    static zzit zza(Boolean bool) {
        if (bool == null) {
            return zzit.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return zzit.GRANTED;
        }
        return zzit.DENIED;
    }

    public static zziq zza(Bundle bundle, int i) {
        if (bundle == null) {
            return new zziq(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzis.STORAGE.zzd) {
            enumMap.put((EnumMap) zzaVar, (zza) zza(bundle.getString(zzaVar.zze)));
        }
        return new zziq(enumMap, i);
    }

    public static zziq zza(zzit zzitVar, zzit zzitVar2, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put((EnumMap) zza.AD_STORAGE, (zza) zzitVar);
        enumMap.put((EnumMap) zza.ANALYTICS_STORAGE, (zza) zzitVar2);
        return new zziq(enumMap, -10);
    }

    public static zziq zzb(String str) {
        return zza(str, 100);
    }

    public static zziq zza(String str, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zzaVarArrZza = zzis.STORAGE.zza();
        for (int i2 = 0; i2 < zzaVarArrZza.length; i2++) {
            zza zzaVar = zzaVarArrZza[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put((EnumMap) zzaVar, (zza) zza(str.charAt(i3)));
            } else {
                enumMap.put((EnumMap) zzaVar, (zza) zzit.UNINITIALIZED);
            }
        }
        return new zziq(enumMap, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zziq zza(com.google.android.gms.measurement.internal.zziq r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zziq$zza> r1 = com.google.android.gms.measurement.internal.zziq.zza.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzis r1 = com.google.android.gms.measurement.internal.zzis.STORAGE
            com.google.android.gms.measurement.internal.zziq$zza[] r1 = com.google.android.gms.measurement.internal.zzis.zza(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L54
            r4 = r1[r3]
            java.util.EnumMap<com.google.android.gms.measurement.internal.zziq$zza, com.google.android.gms.measurement.internal.zzit> r5 = r8.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzit r5 = (com.google.android.gms.measurement.internal.zzit) r5
            java.util.EnumMap<com.google.android.gms.measurement.internal.zziq$zza, com.google.android.gms.measurement.internal.zzit> r6 = r9.zzb
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.measurement.internal.zzit r6 = (com.google.android.gms.measurement.internal.zzit) r6
            if (r5 != 0) goto L26
            goto L37
        L26:
            if (r6 != 0) goto L29
            goto L4c
        L29:
            com.google.android.gms.measurement.internal.zzit r7 = com.google.android.gms.measurement.internal.zzit.UNINITIALIZED
            if (r5 != r7) goto L2e
            goto L37
        L2e:
            com.google.android.gms.measurement.internal.zzit r7 = com.google.android.gms.measurement.internal.zzit.UNINITIALIZED
            if (r6 != r7) goto L33
            goto L4c
        L33:
            com.google.android.gms.measurement.internal.zzit r7 = com.google.android.gms.measurement.internal.zzit.DEFAULT
            if (r5 != r7) goto L39
        L37:
            r5 = r6
            goto L4c
        L39:
            com.google.android.gms.measurement.internal.zzit r7 = com.google.android.gms.measurement.internal.zzit.DEFAULT
            if (r6 != r7) goto L3e
            goto L4c
        L3e:
            com.google.android.gms.measurement.internal.zzit r7 = com.google.android.gms.measurement.internal.zzit.DENIED
            if (r5 == r7) goto L4a
            com.google.android.gms.measurement.internal.zzit r5 = com.google.android.gms.measurement.internal.zzit.DENIED
            if (r6 != r5) goto L47
            goto L4a
        L47:
            com.google.android.gms.measurement.internal.zzit r5 = com.google.android.gms.measurement.internal.zzit.GRANTED
            goto L4c
        L4a:
            com.google.android.gms.measurement.internal.zzit r5 = com.google.android.gms.measurement.internal.zzit.DENIED
        L4c:
            if (r5 == 0) goto L51
            r0.put(r4, r5)
        L51:
            int r3 = r3 + 1
            goto Lf
        L54:
            com.google.android.gms.measurement.internal.zziq r9 = new com.google.android.gms.measurement.internal.zziq
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziq.zza(com.google.android.gms.measurement.internal.zziq):com.google.android.gms.measurement.internal.zziq");
    }

    public final zziq zzb(zziq zziqVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzis.STORAGE.zzd) {
            zzit zzitVar = this.zzb.get(zzaVar);
            if (zzitVar == zzit.UNINITIALIZED) {
                zzitVar = zziqVar.zzb.get(zzaVar);
            }
            if (zzitVar != null) {
                enumMap.put((EnumMap) zzaVar, (zza) zzitVar);
            }
        }
        return new zziq(enumMap, this.zzc);
    }

    public final Boolean zze() {
        zzit zzitVar = this.zzb.get(zza.AD_STORAGE);
        if (zzitVar == null) {
            return null;
        }
        int iOrdinal = zzitVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return true;
    }

    public final Boolean zzf() {
        zzit zzitVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        if (zzitVar == null) {
            return null;
        }
        int iOrdinal = zzitVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return true;
    }

    static String zzb(zzit zzitVar) {
        int iOrdinal = zzitVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public static String zza(Bundle bundle) {
        String string;
        zza[] zzaVarArr = zzis.STORAGE.zzd;
        int length = zzaVarArr.length;
        int i = 0;
        while (true) {
            Boolean bool = null;
            if (i >= length) {
                return null;
            }
            zza zzaVar = zzaVarArr[i];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string != null) {
                    if (string.equals("granted")) {
                        bool = Boolean.TRUE;
                    } else if (string.equals("denied")) {
                        bool = Boolean.FALSE;
                    }
                }
                if (bool == null) {
                    return string;
                }
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzg() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzis r1 = com.google.android.gms.measurement.internal.zzis.STORAGE
            com.google.android.gms.measurement.internal.zziq$zza[] r1 = r1.zza()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap<com.google.android.gms.measurement.internal.zziq$zza, com.google.android.gms.measurement.internal.zzit> r5 = r7.zzb
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzit r4 = (com.google.android.gms.measurement.internal.zzit) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zziq.zzg():java.lang.String");
    }

    public final String zzh() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzis.STORAGE.zza()) {
            sb.append(zza(this.zzb.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zza(this.zzc));
        for (zza zzaVar : zzis.STORAGE.zzd) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append(t2.i.b);
            zzit zzitVar = this.zzb.get(zzaVar);
            if (zzitVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = zzitVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append(Reward.DEFAULT);
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        return sb.toString();
    }

    private zziq(EnumMap<zza, zzit> enumMap, int i) {
        EnumMap<zza, zzit> enumMap2 = new EnumMap<>(zza.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }

    public zziq(Boolean bool, Boolean bool2, int i) {
        EnumMap<zza, zzit> enumMap = new EnumMap<>(zza.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap<zza, zzit>) zza.AD_STORAGE, (zza) zza(bool));
        enumMap.put((EnumMap<zza, zzit>) zza.ANALYTICS_STORAGE, (zza) zza(bool2));
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziq)) {
            return false;
        }
        zziq zziqVar = (zziq) obj;
        for (zza zzaVar : zzis.STORAGE.zzd) {
            if (this.zzb.get(zzaVar) != zziqVar.zzb.get(zzaVar)) {
                return false;
            }
        }
        return this.zzc == zziqVar.zzc;
    }

    public final boolean zza(zziq zziqVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zziqVar.zza(zzaVar) && zza(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzi() {
        return zza(zza.AD_STORAGE);
    }

    public final boolean zza(zza zzaVar) {
        return this.zzb.get(zzaVar) != zzit.DENIED;
    }

    public final boolean zzj() {
        return zza(zza.ANALYTICS_STORAGE);
    }

    public final boolean zzk() {
        Iterator<zzit> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzit.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zziq zziqVar) {
        return zzb(zziqVar, (zza[]) this.zzb.keySet().toArray(new zza[0]));
    }

    public final boolean zzb(zziq zziqVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzit zzitVar = this.zzb.get(zzaVar);
            zzit zzitVar2 = zziqVar.zzb.get(zzaVar);
            if (zzitVar == zzit.DENIED && zzitVar2 != zzit.DENIED) {
                return true;
            }
        }
        return false;
    }
}
