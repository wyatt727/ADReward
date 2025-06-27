package com.google.android.gms.internal.measurement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public class zzni {
    public static final zzni zza;
    public static final zzni zzb;
    public static final zzni zzc;
    public static final zzni zzd;
    public static final zzni zze;
    public static final zzni zzf;
    public static final zzni zzg;
    public static final zzni zzh;
    public static final zzni zzi;
    public static final zzni zzj;
    public static final zzni zzk;
    public static final zzni zzl;
    public static final zzni zzm;
    public static final zzni zzn;
    public static final zzni zzo;
    public static final zzni zzp;
    public static final zzni zzq;
    public static final zzni zzr;
    private static final /* synthetic */ zzni[] zzs;
    private final zzns zzt;
    private final int zzu;

    public final int zza() {
        return this.zzu;
    }

    public final zzns zzb() {
        return this.zzt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        zzni zzniVar = new zzni("DOUBLE", 0, zzns.DOUBLE, 1);
        zza = zzniVar;
        zzni zzniVar2 = new zzni("FLOAT", 1, zzns.FLOAT, 5);
        zzb = zzniVar2;
        zzni zzniVar3 = new zzni("INT64", 2, zzns.LONG, 0);
        zzc = zzniVar3;
        zzni zzniVar4 = new zzni("UINT64", 3, zzns.LONG, 0);
        zzd = zzniVar4;
        zzni zzniVar5 = new zzni("INT32", 4, zzns.INT, 0);
        zze = zzniVar5;
        zzni zzniVar6 = new zzni("FIXED64", 5, zzns.LONG, 1);
        zzf = zzniVar6;
        zzni zzniVar7 = new zzni("FIXED32", 6, zzns.INT, 5);
        zzg = zzniVar7;
        zzni zzniVar8 = new zzni("BOOL", 7, zzns.BOOLEAN, 0);
        zzh = zzniVar8;
        int i = 2;
        zznl zznlVar = new zznl("STRING", zzns.STRING);
        zzi = zznlVar;
        zznn zznnVar = new zznn("GROUP", zzns.MESSAGE);
        zzj = zznnVar;
        zznp zznpVar = new zznp("MESSAGE", zzns.MESSAGE);
        zzk = zznpVar;
        zznr zznrVar = new zznr("BYTES", zzns.BYTE_STRING);
        zzl = zznrVar;
        zzni zzniVar9 = new zzni("UINT32", 12, zzns.INT, 0);
        zzm = zzniVar9;
        zzni zzniVar10 = new zzni("ENUM", 13, zzns.ENUM, 0);
        zzn = zzniVar10;
        zzni zzniVar11 = new zzni("SFIXED32", 14, zzns.INT, 5);
        zzo = zzniVar11;
        zzni zzniVar12 = new zzni("SFIXED64", 15, zzns.LONG, 1);
        zzp = zzniVar12;
        zzni zzniVar13 = new zzni("SINT32", 16, zzns.INT, 0);
        zzq = zzniVar13;
        zzni zzniVar14 = new zzni("SINT64", 17, zzns.LONG, 0);
        zzr = zzniVar14;
        zzs = new zzni[]{zzniVar, zzniVar2, zzniVar3, zzniVar4, zzniVar5, zzniVar6, zzniVar7, zzniVar8, zznlVar, zznnVar, zznpVar, zznrVar, zzniVar9, zzniVar10, zzniVar11, zzniVar12, zzniVar13, zzniVar14};
    }

    private zzni(String str, int i, zzns zznsVar, int i2) {
        this.zzt = zznsVar;
        this.zzu = i2;
    }

    public static zzni[] values() {
        return (zzni[]) zzs.clone();
    }
}
