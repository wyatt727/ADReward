package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public enum zzjq {
    DOUBLE(0, zzjs.SCALAR, zzkf.DOUBLE),
    FLOAT(1, zzjs.SCALAR, zzkf.FLOAT),
    INT64(2, zzjs.SCALAR, zzkf.LONG),
    UINT64(3, zzjs.SCALAR, zzkf.LONG),
    INT32(4, zzjs.SCALAR, zzkf.INT),
    FIXED64(5, zzjs.SCALAR, zzkf.LONG),
    FIXED32(6, zzjs.SCALAR, zzkf.INT),
    BOOL(7, zzjs.SCALAR, zzkf.BOOLEAN),
    STRING(8, zzjs.SCALAR, zzkf.STRING),
    MESSAGE(9, zzjs.SCALAR, zzkf.MESSAGE),
    BYTES(10, zzjs.SCALAR, zzkf.BYTE_STRING),
    UINT32(11, zzjs.SCALAR, zzkf.INT),
    ENUM(12, zzjs.SCALAR, zzkf.ENUM),
    SFIXED32(13, zzjs.SCALAR, zzkf.INT),
    SFIXED64(14, zzjs.SCALAR, zzkf.LONG),
    SINT32(15, zzjs.SCALAR, zzkf.INT),
    SINT64(16, zzjs.SCALAR, zzkf.LONG),
    GROUP(17, zzjs.SCALAR, zzkf.MESSAGE),
    DOUBLE_LIST(18, zzjs.VECTOR, zzkf.DOUBLE),
    FLOAT_LIST(19, zzjs.VECTOR, zzkf.FLOAT),
    INT64_LIST(20, zzjs.VECTOR, zzkf.LONG),
    UINT64_LIST(21, zzjs.VECTOR, zzkf.LONG),
    INT32_LIST(22, zzjs.VECTOR, zzkf.INT),
    FIXED64_LIST(23, zzjs.VECTOR, zzkf.LONG),
    FIXED32_LIST(24, zzjs.VECTOR, zzkf.INT),
    BOOL_LIST(25, zzjs.VECTOR, zzkf.BOOLEAN),
    STRING_LIST(26, zzjs.VECTOR, zzkf.STRING),
    MESSAGE_LIST(27, zzjs.VECTOR, zzkf.MESSAGE),
    BYTES_LIST(28, zzjs.VECTOR, zzkf.BYTE_STRING),
    UINT32_LIST(29, zzjs.VECTOR, zzkf.INT),
    ENUM_LIST(30, zzjs.VECTOR, zzkf.ENUM),
    SFIXED32_LIST(31, zzjs.VECTOR, zzkf.INT),
    SFIXED64_LIST(32, zzjs.VECTOR, zzkf.LONG),
    SINT32_LIST(33, zzjs.VECTOR, zzkf.INT),
    SINT64_LIST(34, zzjs.VECTOR, zzkf.LONG),
    DOUBLE_LIST_PACKED(35, zzjs.PACKED_VECTOR, zzkf.DOUBLE),
    FLOAT_LIST_PACKED(36, zzjs.PACKED_VECTOR, zzkf.FLOAT),
    INT64_LIST_PACKED(37, zzjs.PACKED_VECTOR, zzkf.LONG),
    UINT64_LIST_PACKED(38, zzjs.PACKED_VECTOR, zzkf.LONG),
    INT32_LIST_PACKED(39, zzjs.PACKED_VECTOR, zzkf.INT),
    FIXED64_LIST_PACKED(40, zzjs.PACKED_VECTOR, zzkf.LONG),
    FIXED32_LIST_PACKED(41, zzjs.PACKED_VECTOR, zzkf.INT),
    BOOL_LIST_PACKED(42, zzjs.PACKED_VECTOR, zzkf.BOOLEAN),
    UINT32_LIST_PACKED(43, zzjs.PACKED_VECTOR, zzkf.INT),
    ENUM_LIST_PACKED(44, zzjs.PACKED_VECTOR, zzkf.ENUM),
    SFIXED32_LIST_PACKED(45, zzjs.PACKED_VECTOR, zzkf.INT),
    SFIXED64_LIST_PACKED(46, zzjs.PACKED_VECTOR, zzkf.LONG),
    SINT32_LIST_PACKED(47, zzjs.PACKED_VECTOR, zzkf.INT),
    SINT64_LIST_PACKED(48, zzjs.PACKED_VECTOR, zzkf.LONG),
    GROUP_LIST(49, zzjs.VECTOR, zzkf.MESSAGE),
    MAP(50, zzjs.MAP, zzkf.VOID);

    private static final zzjq[] zzaz;
    private static final Type[] zzba = new Type[0];
    private final zzkf zzbc;
    private final int zzbd;
    private final zzjs zzbe;
    private final Class<?> zzbf;
    private final boolean zzbg;

    public final int zza() {
        return this.zzbd;
    }

    static {
        zzjq[] zzjqVarArrValues = values();
        zzaz = new zzjq[zzjqVarArrValues.length];
        for (zzjq zzjqVar : zzjqVarArrValues) {
            zzaz[zzjqVar.zzbd] = zzjqVar;
        }
    }

    zzjq(int i, zzjs zzjsVar, zzkf zzkfVar) {
        int i2;
        this.zzbd = i;
        this.zzbe = zzjsVar;
        this.zzbc = zzkfVar;
        int iOrdinal = zzjsVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            this.zzbf = zzkfVar.zza();
        } else {
            this.zzbf = null;
        }
        this.zzbg = (zzjsVar != zzjs.SCALAR || (i2 = zzjp.zza[zzkfVar.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : true;
    }
}
