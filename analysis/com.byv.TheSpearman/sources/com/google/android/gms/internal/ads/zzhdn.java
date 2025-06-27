package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzhdn {
    DOUBLE(zzhdo.DOUBLE, 1),
    FLOAT(zzhdo.FLOAT, 5),
    INT64(zzhdo.LONG, 0),
    UINT64(zzhdo.LONG, 0),
    INT32(zzhdo.INT, 0),
    FIXED64(zzhdo.LONG, 1),
    FIXED32(zzhdo.INT, 5),
    BOOL(zzhdo.BOOLEAN, 0),
    STRING(zzhdo.STRING, 2),
    GROUP(zzhdo.MESSAGE, 3),
    MESSAGE(zzhdo.MESSAGE, 2),
    BYTES(zzhdo.BYTE_STRING, 2),
    UINT32(zzhdo.INT, 0),
    ENUM(zzhdo.ENUM, 0),
    SFIXED32(zzhdo.INT, 5),
    SFIXED64(zzhdo.LONG, 1),
    SINT32(zzhdo.INT, 0),
    SINT64(zzhdo.LONG, 0);

    private final zzhdo zzt;

    zzhdn(zzhdo zzhdoVar, int i) {
        this.zzt = zzhdoVar;
    }

    public final zzhdo zza() {
        return this.zzt;
    }
}
