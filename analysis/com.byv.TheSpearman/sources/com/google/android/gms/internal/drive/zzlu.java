package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzlu<T> implements zzmf<T> {
    private static final int[] zzub = new int[0];
    private static final Unsafe zzuc = zznd.zzff();
    private final int[] zzud;
    private final Object[] zzue;
    private final int zzuf;
    private final int zzug;
    private final zzlq zzuh;
    private final boolean zzui;
    private final boolean zzuj;
    private final boolean zzuk;
    private final boolean zzul;
    private final int[] zzum;
    private final int zzun;
    private final int zzuo;
    private final zzly zzup;
    private final zzla zzuq;
    private final zzmx<?, ?> zzur;
    private final zzjy<?> zzus;
    private final zzll zzut;

    private zzlu(int[] iArr, Object[] objArr, int i, int i2, zzlq zzlqVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzly zzlyVar, zzla zzlaVar, zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzll zzllVar) {
        this.zzud = iArr;
        this.zzue = objArr;
        this.zzuf = i;
        this.zzug = i2;
        this.zzuj = zzlqVar instanceof zzkk;
        this.zzuk = z;
        this.zzui = zzjyVar != null && zzjyVar.zze(zzlqVar);
        this.zzul = false;
        this.zzum = iArr2;
        this.zzun = i3;
        this.zzuo = i4;
        this.zzup = zzlyVar;
        this.zzuq = zzlaVar;
        this.zzur = zzmxVar;
        this.zzus = zzjyVar;
        this.zzuh = zzlqVar;
        this.zzut = zzllVar;
    }

    static <T> zzlu<T> zza(Class<T> cls, zzlo zzloVar, zzly zzlyVar, zzla zzlaVar, zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzll zzllVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        boolean z;
        int i17;
        zzme zzmeVar;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int i20;
        Class<?> cls2;
        String str;
        int iObjectFieldOffset2;
        int i21;
        Field fieldZza;
        int i22;
        char cCharAt9;
        int i23;
        Field fieldZza2;
        Field fieldZza3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        char cCharAt14;
        if (zzloVar instanceof zzme) {
            zzme zzmeVar2 = (zzme) zzloVar;
            int i28 = 0;
            boolean z2 = zzmeVar2.zzec() == zzkk.zze.zzsg;
            String strZzek = zzmeVar2.zzek();
            int length = strZzek.length();
            int iCharAt3 = strZzek.charAt(0);
            if (iCharAt3 >= 55296) {
                int i29 = iCharAt3 & 8191;
                int i30 = 1;
                int i31 = 13;
                while (true) {
                    i = i30 + 1;
                    cCharAt14 = strZzek.charAt(i30);
                    if (cCharAt14 < 55296) {
                        break;
                    }
                    i29 |= (cCharAt14 & 8191) << i31;
                    i31 += 13;
                    i30 = i;
                }
                iCharAt3 = i29 | (cCharAt14 << i31);
            } else {
                i = 1;
            }
            int i32 = i + 1;
            int iCharAt4 = strZzek.charAt(i);
            if (iCharAt4 >= 55296) {
                int i33 = iCharAt4 & 8191;
                int i34 = 13;
                while (true) {
                    i27 = i32 + 1;
                    cCharAt13 = strZzek.charAt(i32);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt13 & 8191) << i34;
                    i34 += 13;
                    i32 = i27;
                }
                iCharAt4 = i33 | (cCharAt13 << i34);
                i32 = i27;
            }
            if (iCharAt4 == 0) {
                i6 = 0;
                iCharAt = 0;
                i4 = 0;
                iCharAt2 = 0;
                i5 = 0;
                iArr = zzub;
                i3 = 0;
            } else {
                int i35 = i32 + 1;
                int iCharAt5 = strZzek.charAt(i32);
                if (iCharAt5 >= 55296) {
                    int i36 = iCharAt5 & 8191;
                    int i37 = 13;
                    while (true) {
                        i14 = i35 + 1;
                        cCharAt8 = strZzek.charAt(i35);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i36 |= (cCharAt8 & 8191) << i37;
                        i37 += 13;
                        i35 = i14;
                    }
                    iCharAt5 = i36 | (cCharAt8 << i37);
                    i35 = i14;
                }
                int i38 = i35 + 1;
                int iCharAt6 = strZzek.charAt(i35);
                if (iCharAt6 >= 55296) {
                    int i39 = iCharAt6 & 8191;
                    int i40 = 13;
                    while (true) {
                        i13 = i38 + 1;
                        cCharAt7 = strZzek.charAt(i38);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i39 |= (cCharAt7 & 8191) << i40;
                        i40 += 13;
                        i38 = i13;
                    }
                    iCharAt6 = i39 | (cCharAt7 << i40);
                    i38 = i13;
                }
                int i41 = i38 + 1;
                iCharAt = strZzek.charAt(i38);
                if (iCharAt >= 55296) {
                    int i42 = iCharAt & 8191;
                    int i43 = 13;
                    while (true) {
                        i12 = i41 + 1;
                        cCharAt6 = strZzek.charAt(i41);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i42 |= (cCharAt6 & 8191) << i43;
                        i43 += 13;
                        i41 = i12;
                    }
                    iCharAt = i42 | (cCharAt6 << i43);
                    i41 = i12;
                }
                int i44 = i41 + 1;
                int iCharAt7 = strZzek.charAt(i41);
                if (iCharAt7 >= 55296) {
                    int i45 = iCharAt7 & 8191;
                    int i46 = 13;
                    while (true) {
                        i11 = i44 + 1;
                        cCharAt5 = strZzek.charAt(i44);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i45 |= (cCharAt5 & 8191) << i46;
                        i46 += 13;
                        i44 = i11;
                    }
                    iCharAt7 = i45 | (cCharAt5 << i46);
                    i44 = i11;
                }
                int i47 = i44 + 1;
                iCharAt2 = strZzek.charAt(i44);
                if (iCharAt2 >= 55296) {
                    int i48 = iCharAt2 & 8191;
                    int i49 = 13;
                    while (true) {
                        i10 = i47 + 1;
                        cCharAt4 = strZzek.charAt(i47);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i48 |= (cCharAt4 & 8191) << i49;
                        i49 += 13;
                        i47 = i10;
                    }
                    iCharAt2 = i48 | (cCharAt4 << i49);
                    i47 = i10;
                }
                int i50 = i47 + 1;
                int iCharAt8 = strZzek.charAt(i47);
                if (iCharAt8 >= 55296) {
                    int i51 = iCharAt8 & 8191;
                    int i52 = 13;
                    while (true) {
                        i9 = i50 + 1;
                        cCharAt3 = strZzek.charAt(i50);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i51 |= (cCharAt3 & 8191) << i52;
                        i52 += 13;
                        i50 = i9;
                    }
                    iCharAt8 = i51 | (cCharAt3 << i52);
                    i50 = i9;
                }
                int i53 = i50 + 1;
                int iCharAt9 = strZzek.charAt(i50);
                if (iCharAt9 >= 55296) {
                    int i54 = iCharAt9 & 8191;
                    int i55 = i53;
                    int i56 = 13;
                    while (true) {
                        i8 = i55 + 1;
                        cCharAt2 = strZzek.charAt(i55);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i54 |= (cCharAt2 & 8191) << i56;
                        i56 += 13;
                        i55 = i8;
                    }
                    iCharAt9 = i54 | (cCharAt2 << i56);
                    i2 = i8;
                } else {
                    i2 = i53;
                }
                int i57 = i2 + 1;
                int iCharAt10 = strZzek.charAt(i2);
                if (iCharAt10 >= 55296) {
                    int i58 = iCharAt10 & 8191;
                    int i59 = i57;
                    int i60 = 13;
                    while (true) {
                        i7 = i59 + 1;
                        cCharAt = strZzek.charAt(i59);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i58 |= (cCharAt & 8191) << i60;
                        i60 += 13;
                        i59 = i7;
                    }
                    iCharAt10 = i58 | (cCharAt << i60);
                    i57 = i7;
                }
                int[] iArr2 = new int[iCharAt10 + iCharAt8 + iCharAt9];
                int i61 = (iCharAt5 << 1) + iCharAt6;
                i3 = iCharAt7;
                i4 = i61;
                i5 = iCharAt10;
                i28 = iCharAt5;
                i32 = i57;
                int i62 = iCharAt8;
                iArr = iArr2;
                i6 = i62;
            }
            Unsafe unsafe = zzuc;
            Object[] objArrZzel = zzmeVar2.zzel();
            Class<?> cls3 = zzmeVar2.zzee().getClass();
            int i63 = i32;
            int[] iArr3 = new int[iCharAt2 * 3];
            Object[] objArr = new Object[iCharAt2 << 1];
            int i64 = i5 + i6;
            int i65 = i5;
            int i66 = i63;
            int i67 = i64;
            int i68 = 0;
            int i69 = 0;
            while (i66 < length) {
                int i70 = i66 + 1;
                int iCharAt11 = strZzek.charAt(i66);
                int i71 = length;
                if (iCharAt11 >= 55296) {
                    int i72 = iCharAt11 & 8191;
                    int i73 = i70;
                    int i74 = 13;
                    while (true) {
                        i26 = i73 + 1;
                        cCharAt12 = strZzek.charAt(i73);
                        i15 = i5;
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i72 |= (cCharAt12 & 8191) << i74;
                        i74 += 13;
                        i73 = i26;
                        i5 = i15;
                    }
                    iCharAt11 = i72 | (cCharAt12 << i74);
                    i16 = i26;
                } else {
                    i15 = i5;
                    i16 = i70;
                }
                int i75 = i16 + 1;
                int iCharAt12 = strZzek.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i25 = i77 + 1;
                        cCharAt11 = strZzek.charAt(i77);
                        z = z2;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i76 |= (cCharAt11 & 8191) << i78;
                        i78 += 13;
                        i77 = i25;
                        z2 = z;
                    }
                    iCharAt12 = i76 | (cCharAt11 << i78);
                    i17 = i25;
                } else {
                    z = z2;
                    i17 = i75;
                }
                int i79 = iCharAt12 & 255;
                int i80 = i3;
                if ((iCharAt12 & 1024) != 0) {
                    iArr[i68] = i69;
                    i68++;
                }
                int i81 = iCharAt;
                if (i79 >= 51) {
                    int i82 = i17 + 1;
                    int iCharAt13 = strZzek.charAt(i17);
                    char c = 55296;
                    if (iCharAt13 >= 55296) {
                        int i83 = iCharAt13 & 8191;
                        int i84 = 13;
                        while (true) {
                            i24 = i82 + 1;
                            cCharAt10 = strZzek.charAt(i82);
                            if (cCharAt10 < c) {
                                break;
                            }
                            i83 |= (cCharAt10 & 8191) << i84;
                            i84 += 13;
                            i82 = i24;
                            c = 55296;
                        }
                        iCharAt13 = i83 | (cCharAt10 << i84);
                        i82 = i24;
                    }
                    int i85 = i79 - 51;
                    int i86 = i82;
                    if (i85 == 9 || i85 == 17) {
                        objArr[((i69 / 3) << 1) + 1] = objArrZzel[i4];
                        i4++;
                    } else if (i85 == 12 && (iCharAt3 & 1) == 1) {
                        objArr[((i69 / 3) << 1) + 1] = objArrZzel[i4];
                        i4++;
                    }
                    int i87 = iCharAt13 << 1;
                    Object obj = objArrZzel[i87];
                    if (obj instanceof Field) {
                        fieldZza2 = (Field) obj;
                    } else {
                        fieldZza2 = zza(cls3, (String) obj);
                        objArrZzel[i87] = fieldZza2;
                    }
                    zzmeVar = zzmeVar2;
                    String str2 = strZzek;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza2);
                    int i88 = i87 + 1;
                    Object obj2 = objArrZzel[i88];
                    if (obj2 instanceof Field) {
                        fieldZza3 = (Field) obj2;
                    } else {
                        fieldZza3 = zza(cls3, (String) obj2);
                        objArrZzel[i88] = fieldZza3;
                    }
                    cls2 = cls3;
                    i19 = i4;
                    i17 = i86;
                    str = str2;
                    i21 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i20 = i28;
                } else {
                    zzmeVar = zzmeVar2;
                    String str3 = strZzek;
                    int i89 = i4 + 1;
                    Field fieldZza4 = zza(cls3, (String) objArrZzel[i4]);
                    if (i79 == 9 || i79 == 17) {
                        i18 = 1;
                        objArr[((i69 / 3) << 1) + 1] = fieldZza4.getType();
                    } else {
                        if (i79 == 27 || i79 == 49) {
                            i18 = 1;
                            i23 = i89 + 1;
                            objArr[((i69 / 3) << 1) + 1] = objArrZzel[i89];
                        } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                            i18 = 1;
                            if ((iCharAt3 & 1) == 1) {
                                i23 = i89 + 1;
                                objArr[((i69 / 3) << 1) + 1] = objArrZzel[i89];
                            }
                        } else if (i79 == 50) {
                            int i90 = i65 + 1;
                            iArr[i65] = i69;
                            int i91 = (i69 / 3) << 1;
                            int i92 = i89 + 1;
                            objArr[i91] = objArrZzel[i89];
                            if ((iCharAt12 & 2048) != 0) {
                                i89 = i92 + 1;
                                objArr[i91 + 1] = objArrZzel[i92];
                                i65 = i90;
                                i18 = 1;
                            } else {
                                i89 = i92;
                                i18 = 1;
                                i65 = i90;
                            }
                        } else {
                            i18 = 1;
                        }
                        i89 = i23;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                    if ((iCharAt3 & 1) != i18 || i79 > 17) {
                        i19 = i89;
                        i20 = i28;
                        cls2 = cls3;
                        str = str3;
                        iObjectFieldOffset2 = 0;
                        i21 = 0;
                        if (i79 >= 18 && i79 <= 49) {
                            iArr[i67] = iObjectFieldOffset;
                            i67++;
                        }
                    } else {
                        int i93 = i17 + 1;
                        str = str3;
                        int iCharAt14 = str.charAt(i17);
                        if (iCharAt14 >= 55296) {
                            int i94 = iCharAt14 & 8191;
                            int i95 = 13;
                            while (true) {
                                i22 = i93 + 1;
                                cCharAt9 = str.charAt(i93);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i94 |= (cCharAt9 & 8191) << i95;
                                i95 += 13;
                                i93 = i22;
                            }
                            iCharAt14 = i94 | (cCharAt9 << i95);
                            i93 = i22;
                        }
                        int i96 = (i28 << 1) + (iCharAt14 / 32);
                        Object obj3 = objArrZzel[i96];
                        i19 = i89;
                        if (obj3 instanceof Field) {
                            fieldZza = (Field) obj3;
                        } else {
                            fieldZza = zza(cls3, (String) obj3);
                            objArrZzel[i96] = fieldZza;
                        }
                        i20 = i28;
                        cls2 = cls3;
                        i21 = iCharAt14 % 32;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
                        i17 = i93;
                        if (i79 >= 18) {
                            iArr[i67] = iObjectFieldOffset;
                            i67++;
                        }
                    }
                }
                int i97 = i69 + 1;
                iArr3[i69] = iCharAt11;
                int i98 = i97 + 1;
                iArr3[i97] = iObjectFieldOffset | ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & 512) != 0 ? 536870912 : 0) | (i79 << 20);
                i69 = i98 + 1;
                iArr3[i98] = (i21 << 20) | iObjectFieldOffset2;
                i28 = i20;
                strZzek = str;
                i66 = i17;
                cls3 = cls2;
                i3 = i80;
                length = i71;
                i5 = i15;
                z2 = z;
                iCharAt = i81;
                i4 = i19;
                zzmeVar2 = zzmeVar;
            }
            return new zzlu<>(iArr3, objArr, iCharAt, i3, zzmeVar2.zzee(), z2, false, iArr, i5, i64, zzlyVar, zzlaVar, zzmxVar, zzjyVar, zzllVar);
        }
        ((zzms) zzloVar).zzec();
        int i99 = zzkk.zze.zzsg;
        throw new NoSuchMethodError();
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final T newInstance() {
        return (T) this.zzup.newInstance(this.zzuh);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.equals(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int hashCode(T t) {
        int i;
        int iZzu;
        int length = this.zzud.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzas = zzas(i3);
            int i4 = this.zzud[i3];
            long j = 1048575 & iZzas;
            int iHashCode = 37;
            switch ((iZzas & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(Double.doubleToLongBits(zznd.zzn(t, j)));
                    i2 = i + iZzu;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzu = Float.floatToIntBits(zznd.zzm(t, j));
                    i2 = i + iZzu;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzu = zzkm.zze(zznd.zzl(t, j));
                    i2 = i + iZzu;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzu = ((String) zznd.zzo(t, j)).hashCode();
                    i2 = i + iZzu;
                    break;
                case 9:
                    Object objZzo = zznd.zzo(t, j);
                    if (objZzo != null) {
                        iHashCode = objZzo.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzu = zznd.zzo(t, j).hashCode();
                    i2 = i + iZzu;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzu = zznd.zzj(t, j);
                    i2 = i + iZzu;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + iZzu;
                    break;
                case 17:
                    Object objZzo2 = zznd.zzo(t, j);
                    if (objZzo2 != null) {
                        iHashCode = objZzo2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iZzu = zznd.zzo(t, j).hashCode();
                    i2 = i + iZzu;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzu = zznd.zzo(t, j).hashCode();
                    i2 = i + iZzu;
                    break;
                case 51:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(Double.doubleToLongBits(zze(t, j)));
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = Float.floatToIntBits(zzf(t, j));
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zze(zzi(t, j));
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = ((String) zznd.zzo(t, j)).hashCode();
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zznd.zzo(t, j).hashCode();
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zznd.zzo(t, j).hashCode();
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzg(t, j);
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zzkm.zzu(zzh(t, j));
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        iZzu = zznd.zzo(t, j).hashCode();
                        i2 = i + iZzu;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzur.zzr(t).hashCode();
        return this.zzui ? (iHashCode2 * 53) + this.zzus.zzb(t).hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzc(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzud.length; i += 3) {
            int iZzas = zzas(i);
            long j = 1048575 & iZzas;
            int i2 = this.zzud[i];
            switch ((iZzas & 267386880) >>> 20) {
                case 0:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza(t, j, zznd.zzn(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzm(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza(t, j, zznd.zzl(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzuq.zza(t, t2, j);
                    break;
                case 50:
                    zzmh.zza(this.zzut, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza((zzlu<T>) t2, i2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb((zzlu<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza((zzlu<T>) t2, i2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb((zzlu<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzuk) {
            return;
        }
        zzmh.zza(this.zzur, t, t2);
        if (this.zzui) {
            zzmh.zza(this.zzus, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long jZzas = zzas(i) & 1048575;
        if (zza((zzlu<T>) t2, i)) {
            Object objZzo = zznd.zzo(t, jZzas);
            Object objZzo2 = zznd.zzo(t2, jZzas);
            if (objZzo != null && objZzo2 != null) {
                zznd.zza(t, jZzas, zzkm.zza(objZzo, objZzo2));
                zzb((zzlu<T>) t, i);
            } else if (objZzo2 != null) {
                zznd.zza(t, jZzas, objZzo2);
                zzb((zzlu<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int iZzas = zzas(i);
        int i2 = this.zzud[i];
        long j = iZzas & 1048575;
        if (zza((zzlu<T>) t2, i2, i)) {
            Object objZzo = zznd.zzo(t, j);
            Object objZzo2 = zznd.zzo(t2, j);
            if (objZzo != null && objZzo2 != null) {
                zznd.zza(t, j, zzkm.zza(objZzo, objZzo2));
                zzb((zzlu<T>) t, i2, i);
            } else if (objZzo2 != null) {
                zznd.zza(t, j, objZzo2);
                zzb((zzlu<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:421:0x090b A[PHI: r6
      0x090b: PHI (r6v4 int) = 
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v16 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v17 int)
      (r6v1 int)
     binds: [B:256:0x0545, B:459:0x09b0, B:453:0x0994, B:450:0x0982, B:447:0x0973, B:444:0x0966, B:441:0x0959, B:437:0x094e, B:434:0x0943, B:431:0x0936, B:428:0x0929, B:425:0x0916, B:396:0x081f, B:390:0x0802, B:384:0x07e5, B:378:0x07c8, B:372:0x07aa, B:366:0x078c, B:360:0x076e, B:354:0x0750, B:348:0x0732, B:342:0x0714, B:336:0x06f6, B:330:0x06d8, B:324:0x06ba, B:318:0x069c, B:313:0x0668, B:310:0x065b, B:307:0x064b, B:304:0x063b, B:301:0x062b, B:298:0x061d, B:295:0x0610, B:292:0x0603, B:286:0x05e5, B:283:0x05d1, B:280:0x05bf, B:277:0x05af, B:274:0x059f, B:439:0x0955, B:271:0x0592, B:268:0x0584, B:265:0x0574, B:262:0x0564, B:420:0x090a, B:259:0x054e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzn(T r20) {
        /*
            Method dump skipped, instructions count: 2986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zzn(java.lang.Object):int");
    }

    private static <UT, UB> int zza(zzmx<UT, UB> zzmxVar, T t) {
        return zzmxVar.zzn(zzmxVar.zzr(t));
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zznd.zzo(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r14, com.google.android.gms.internal.drive.zzns r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zza(java.lang.Object, com.google.android.gms.internal.drive.zzns):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzb(T r19, com.google.android.gms.internal.drive.zzns r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zzb(java.lang.Object, com.google.android.gms.internal.drive.zzns):void");
    }

    private final <K, V> void zza(zzns zznsVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zznsVar.zza(i, this.zzut.zzm(zzaq(i2)), this.zzut.zzi(obj));
        }
    }

    private static <UT, UB> void zza(zzmx<UT, UB> zzmxVar, T t, zzns zznsVar) throws IOException {
        zzmxVar.zza(zzmxVar.zzr(t), zznsVar);
    }

    private static zzmy zzo(Object obj) {
        zzkk zzkkVar = (zzkk) obj;
        zzmy zzmyVar = zzkkVar.zzrq;
        if (zzmyVar != zzmy.zzfa()) {
            return zzmyVar;
        }
        zzmy zzmyVarZzfb = zzmy.zzfb();
        zzkkVar.zzrq = zzmyVarZzfb;
        return zzmyVarZzfb;
    }

    private static int zza(byte[] bArr, int i, int i2, zznm zznmVar, Class<?> cls, zziz zzizVar) throws IOException {
        switch (zzlv.zzox[zznmVar.ordinal()]) {
            case 1:
                int iZzb = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Boolean.valueOf(zzizVar.zznl != 0);
                return iZzb;
            case 2:
                return zziy.zze(bArr, i, zzizVar);
            case 3:
                zzizVar.zznm = Double.valueOf(zziy.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzizVar.zznm = Integer.valueOf(zziy.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzizVar.zznm = Long.valueOf(zziy.zzb(bArr, i));
                return i + 8;
            case 8:
                zzizVar.zznm = Float.valueOf(zziy.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZza = zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = Integer.valueOf(zzizVar.zznk);
                return iZza;
            case 12:
            case 13:
                int iZzb2 = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Long.valueOf(zzizVar.zznl);
                return iZzb2;
            case 14:
                return zziy.zza(zzmd.zzej().zzf(cls), bArr, i, i2, zzizVar);
            case 15:
                int iZza2 = zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = Integer.valueOf(zzjo.zzw(zzizVar.zznk));
                return iZza2;
            case 16:
                int iZzb3 = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Long.valueOf(zzjo.zzk(zzizVar.zznl));
                return iZzb3;
            case 17:
                return zziy.zzd(bArr, i, zzizVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zziz zzizVar) throws IOException {
        int iZza;
        int iZza2 = i;
        Unsafe unsafe = zzuc;
        zzkp zzkpVarZzr = (zzkp) unsafe.getObject(t, j2);
        if (!zzkpVarZzr.zzbo()) {
            int size = zzkpVarZzr.size();
            zzkpVarZzr = zzkpVarZzr.zzr(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, zzkpVarZzr);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzju zzjuVar = (zzju) zzkpVarZzr;
                    int iZza3 = zziy.zza(bArr, iZza2, zzizVar);
                    int i8 = zzizVar.zznk + iZza3;
                    while (iZza3 < i8) {
                        zzjuVar.zzc(zziy.zzc(bArr, iZza3));
                        iZza3 += 8;
                    }
                    if (iZza3 == i8) {
                        return iZza3;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 1) {
                    zzju zzjuVar2 = (zzju) zzkpVarZzr;
                    zzjuVar2.zzc(zziy.zzc(bArr, i));
                    while (true) {
                        int i9 = iZza2 + 8;
                        if (i9 >= i2) {
                            return i9;
                        }
                        iZza2 = zziy.zza(bArr, i9, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i9;
                        }
                        zzjuVar2.zzc(zziy.zzc(bArr, iZza2));
                    }
                }
                return iZza2;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzkh zzkhVar = (zzkh) zzkpVarZzr;
                    int iZza4 = zziy.zza(bArr, iZza2, zzizVar);
                    int i10 = zzizVar.zznk + iZza4;
                    while (iZza4 < i10) {
                        zzkhVar.zzc(zziy.zzd(bArr, iZza4));
                        iZza4 += 4;
                    }
                    if (iZza4 == i10) {
                        return iZza4;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 5) {
                    zzkh zzkhVar2 = (zzkh) zzkpVarZzr;
                    zzkhVar2.zzc(zziy.zzd(bArr, i));
                    while (true) {
                        int i11 = iZza2 + 4;
                        if (i11 >= i2) {
                            return i11;
                        }
                        iZza2 = zziy.zza(bArr, i11, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i11;
                        }
                        zzkhVar2.zzc(zziy.zzd(bArr, iZza2));
                    }
                }
                return iZza2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzle zzleVar = (zzle) zzkpVarZzr;
                    int iZza5 = zziy.zza(bArr, iZza2, zzizVar);
                    int i12 = zzizVar.zznk + iZza5;
                    while (iZza5 < i12) {
                        iZza5 = zziy.zzb(bArr, iZza5, zzizVar);
                        zzleVar.zzv(zzizVar.zznl);
                    }
                    if (iZza5 == i12) {
                        return iZza5;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 0) {
                    zzle zzleVar2 = (zzle) zzkpVarZzr;
                    int iZzb = zziy.zzb(bArr, iZza2, zzizVar);
                    zzleVar2.zzv(zzizVar.zznl);
                    while (iZzb < i2) {
                        int iZza6 = zziy.zza(bArr, iZzb, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZzb;
                        }
                        iZzb = zziy.zzb(bArr, iZza6, zzizVar);
                        zzleVar2.zzv(zzizVar.zznl);
                    }
                    return iZzb;
                }
                return iZza2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zziy.zza(bArr, iZza2, (zzkp<?>) zzkpVarZzr, zzizVar);
                }
                if (i5 == 0) {
                    return zziy.zza(i3, bArr, i, i2, (zzkp<?>) zzkpVarZzr, zzizVar);
                }
                return iZza2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzle zzleVar3 = (zzle) zzkpVarZzr;
                    int iZza7 = zziy.zza(bArr, iZza2, zzizVar);
                    int i13 = zzizVar.zznk + iZza7;
                    while (iZza7 < i13) {
                        zzleVar3.zzv(zziy.zzb(bArr, iZza7));
                        iZza7 += 8;
                    }
                    if (iZza7 == i13) {
                        return iZza7;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 1) {
                    zzle zzleVar4 = (zzle) zzkpVarZzr;
                    zzleVar4.zzv(zziy.zzb(bArr, i));
                    while (true) {
                        int i14 = iZza2 + 8;
                        if (i14 >= i2) {
                            return i14;
                        }
                        iZza2 = zziy.zza(bArr, i14, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i14;
                        }
                        zzleVar4.zzv(zziy.zzb(bArr, iZza2));
                    }
                }
                return iZza2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzkl zzklVar = (zzkl) zzkpVarZzr;
                    int iZza8 = zziy.zza(bArr, iZza2, zzizVar);
                    int i15 = zzizVar.zznk + iZza8;
                    while (iZza8 < i15) {
                        zzklVar.zzam(zziy.zza(bArr, iZza8));
                        iZza8 += 4;
                    }
                    if (iZza8 == i15) {
                        return iZza8;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 5) {
                    zzkl zzklVar2 = (zzkl) zzkpVarZzr;
                    zzklVar2.zzam(zziy.zza(bArr, i));
                    while (true) {
                        int i16 = iZza2 + 4;
                        if (i16 >= i2) {
                            return i16;
                        }
                        iZza2 = zziy.zza(bArr, i16, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i16;
                        }
                        zzklVar2.zzam(zziy.zza(bArr, iZza2));
                    }
                }
                return iZza2;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzja zzjaVar = (zzja) zzkpVarZzr;
                    iZza = zziy.zza(bArr, iZza2, zzizVar);
                    int i17 = zzizVar.zznk + iZza;
                    while (iZza < i17) {
                        iZza = zziy.zzb(bArr, iZza, zzizVar);
                        zzjaVar.addBoolean(zzizVar.zznl != 0);
                    }
                    if (iZza != i17) {
                        throw zzkq.zzdi();
                    }
                    return iZza;
                }
                if (i5 == 0) {
                    zzja zzjaVar2 = (zzja) zzkpVarZzr;
                    iZza2 = zziy.zzb(bArr, iZza2, zzizVar);
                    zzjaVar2.addBoolean(zzizVar.zznl != 0);
                    while (iZza2 < i2) {
                        int iZza9 = zziy.zza(bArr, iZza2, zzizVar);
                        if (i3 == zzizVar.zznk) {
                            iZza2 = zziy.zzb(bArr, iZza9, zzizVar);
                            zzjaVar2.addBoolean(zzizVar.zznl != 0);
                        }
                    }
                }
                return iZza2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZza10 = zziy.zza(bArr, iZza2, zzizVar);
                        int i18 = zzizVar.zznk;
                        if (i18 < 0) {
                            throw zzkq.zzdj();
                        }
                        if (i18 == 0) {
                            zzkpVarZzr.add("");
                        } else {
                            zzkpVarZzr.add(new String(bArr, iZza10, i18, zzkm.UTF_8));
                            iZza10 += i18;
                        }
                        while (iZza10 < i2) {
                            int iZza11 = zziy.zza(bArr, iZza10, zzizVar);
                            if (i3 != zzizVar.zznk) {
                                return iZza10;
                            }
                            iZza10 = zziy.zza(bArr, iZza11, zzizVar);
                            int i19 = zzizVar.zznk;
                            if (i19 < 0) {
                                throw zzkq.zzdj();
                            }
                            if (i19 == 0) {
                                zzkpVarZzr.add("");
                            } else {
                                zzkpVarZzr.add(new String(bArr, iZza10, i19, zzkm.UTF_8));
                                iZza10 += i19;
                            }
                        }
                        return iZza10;
                    }
                    int iZza12 = zziy.zza(bArr, iZza2, zzizVar);
                    int i20 = zzizVar.zznk;
                    if (i20 < 0) {
                        throw zzkq.zzdj();
                    }
                    if (i20 == 0) {
                        zzkpVarZzr.add("");
                    } else {
                        int i21 = iZza12 + i20;
                        if (!zznf.zze(bArr, iZza12, i21)) {
                            throw zzkq.zzdn();
                        }
                        zzkpVarZzr.add(new String(bArr, iZza12, i20, zzkm.UTF_8));
                        iZza12 = i21;
                    }
                    while (iZza12 < i2) {
                        int iZza13 = zziy.zza(bArr, iZza12, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZza12;
                        }
                        iZza12 = zziy.zza(bArr, iZza13, zzizVar);
                        int i22 = zzizVar.zznk;
                        if (i22 < 0) {
                            throw zzkq.zzdj();
                        }
                        if (i22 == 0) {
                            zzkpVarZzr.add("");
                        } else {
                            int i23 = iZza12 + i22;
                            if (!zznf.zze(bArr, iZza12, i23)) {
                                throw zzkq.zzdn();
                            }
                            zzkpVarZzr.add(new String(bArr, iZza12, i22, zzkm.UTF_8));
                            iZza12 = i23;
                        }
                    }
                    return iZza12;
                }
                return iZza2;
            case 27:
                if (i5 == 2) {
                    return zziy.zza(zzap(i6), i3, bArr, i, i2, zzkpVarZzr, zzizVar);
                }
                return iZza2;
            case 28:
                if (i5 == 2) {
                    int iZza14 = zziy.zza(bArr, iZza2, zzizVar);
                    int i24 = zzizVar.zznk;
                    if (i24 < 0) {
                        throw zzkq.zzdj();
                    }
                    if (i24 > bArr.length - iZza14) {
                        throw zzkq.zzdi();
                    }
                    if (i24 == 0) {
                        zzkpVarZzr.add(zzjc.zznq);
                    } else {
                        zzkpVarZzr.add(zzjc.zzb(bArr, iZza14, i24));
                        iZza14 += i24;
                    }
                    while (iZza14 < i2) {
                        int iZza15 = zziy.zza(bArr, iZza14, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZza14;
                        }
                        iZza14 = zziy.zza(bArr, iZza15, zzizVar);
                        int i25 = zzizVar.zznk;
                        if (i25 < 0) {
                            throw zzkq.zzdj();
                        }
                        if (i25 > bArr.length - iZza14) {
                            throw zzkq.zzdi();
                        }
                        if (i25 == 0) {
                            zzkpVarZzr.add(zzjc.zznq);
                        } else {
                            zzkpVarZzr.add(zzjc.zzb(bArr, iZza14, i25));
                            iZza14 += i25;
                        }
                    }
                    return iZza14;
                }
                return iZza2;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZza = zziy.zza(i3, bArr, i, i2, (zzkp<?>) zzkpVarZzr, zzizVar);
                    }
                    return iZza2;
                }
                iZza = zziy.zza(bArr, iZza2, (zzkp<?>) zzkpVarZzr, zzizVar);
                zzkk zzkkVar = (zzkk) t;
                zzmy zzmyVar = zzkkVar.zzrq;
                if (zzmyVar == zzmy.zzfa()) {
                    zzmyVar = null;
                }
                zzmy zzmyVar2 = (zzmy) zzmh.zza(i4, zzkpVarZzr, zzar(i6), zzmyVar, this.zzur);
                if (zzmyVar2 != null) {
                    zzkkVar.zzrq = zzmyVar2;
                }
                return iZza;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkl zzklVar3 = (zzkl) zzkpVarZzr;
                    int iZza16 = zziy.zza(bArr, iZza2, zzizVar);
                    int i26 = zzizVar.zznk + iZza16;
                    while (iZza16 < i26) {
                        iZza16 = zziy.zza(bArr, iZza16, zzizVar);
                        zzklVar3.zzam(zzjo.zzw(zzizVar.zznk));
                    }
                    if (iZza16 == i26) {
                        return iZza16;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 0) {
                    zzkl zzklVar4 = (zzkl) zzkpVarZzr;
                    int iZza17 = zziy.zza(bArr, iZza2, zzizVar);
                    zzklVar4.zzam(zzjo.zzw(zzizVar.zznk));
                    while (iZza17 < i2) {
                        int iZza18 = zziy.zza(bArr, iZza17, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZza17;
                        }
                        iZza17 = zziy.zza(bArr, iZza18, zzizVar);
                        zzklVar4.zzam(zzjo.zzw(zzizVar.zznk));
                    }
                    return iZza17;
                }
                return iZza2;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzle zzleVar5 = (zzle) zzkpVarZzr;
                    int iZza19 = zziy.zza(bArr, iZza2, zzizVar);
                    int i27 = zzizVar.zznk + iZza19;
                    while (iZza19 < i27) {
                        iZza19 = zziy.zzb(bArr, iZza19, zzizVar);
                        zzleVar5.zzv(zzjo.zzk(zzizVar.zznl));
                    }
                    if (iZza19 == i27) {
                        return iZza19;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 0) {
                    zzle zzleVar6 = (zzle) zzkpVarZzr;
                    int iZzb2 = zziy.zzb(bArr, iZza2, zzizVar);
                    zzleVar6.zzv(zzjo.zzk(zzizVar.zznl));
                    while (iZzb2 < i2) {
                        int iZza20 = zziy.zza(bArr, iZzb2, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return iZzb2;
                        }
                        iZzb2 = zziy.zzb(bArr, iZza20, zzizVar);
                        zzleVar6.zzv(zzjo.zzk(zzizVar.zznl));
                    }
                    return iZzb2;
                }
                return iZza2;
            case 49:
                if (i5 == 3) {
                    zzmf zzmfVarZzap = zzap(i6);
                    int i28 = (i3 & (-8)) | 4;
                    iZza2 = zziy.zza(zzmfVarZzap, bArr, i, i2, i28, zzizVar);
                    zzkpVarZzr.add(zzizVar.zznm);
                    while (iZza2 < i2) {
                        int iZza21 = zziy.zza(bArr, iZza2, zzizVar);
                        if (i3 == zzizVar.zznk) {
                            iZza2 = zziy.zza(zzmfVarZzap, bArr, iZza21, i2, i28, zzizVar);
                            zzkpVarZzr.add(zzizVar.zznm);
                        }
                    }
                }
                return iZza2;
            default:
                return iZza2;
        }
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zziz zzizVar) throws IOException {
        Unsafe unsafe = zzuc;
        Object objZzaq = zzaq(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzut.zzj(object)) {
            Object objZzl = this.zzut.zzl(objZzaq);
            this.zzut.zzb(objZzl, object);
            unsafe.putObject(t, j, objZzl);
            object = objZzl;
        }
        zzlj<?, ?> zzljVarZzm = this.zzut.zzm(objZzaq);
        Map<?, ?> mapZzh = this.zzut.zzh(object);
        int iZza = zziy.zza(bArr, i, zzizVar);
        int i4 = zzizVar.zznk;
        if (i4 < 0 || i4 > i2 - iZza) {
            throw zzkq.zzdi();
        }
        int i5 = i4 + iZza;
        K k = zzljVarZzm.zztv;
        V v = zzljVarZzm.zztx;
        while (iZza < i5) {
            int iZza2 = iZza + 1;
            int i6 = bArr[iZza];
            if (i6 < 0) {
                iZza2 = zziy.zza(i6, bArr, iZza2, zzizVar);
                i6 = zzizVar.zznk;
            }
            int i7 = iZza2;
            int i8 = i6 >>> 3;
            int i9 = i6 & 7;
            if (i8 == 1) {
                if (i9 == zzljVarZzm.zztu.zzfk()) {
                    iZza = zza(bArr, i7, i2, zzljVarZzm.zztu, (Class<?>) null, zzizVar);
                    k = (K) zzizVar.zznm;
                } else {
                    iZza = zziy.zza(i6, bArr, i7, i2, zzizVar);
                }
            } else if (i8 == 2 && i9 == zzljVarZzm.zztw.zzfk()) {
                iZza = zza(bArr, i7, i2, zzljVarZzm.zztw, zzljVarZzm.zztx.getClass(), zzizVar);
                v = zzizVar.zznm;
            } else {
                iZza = zziy.zza(i6, bArr, i7, i2, zzizVar);
            }
        }
        if (iZza != i5) {
            throw zzkq.zzdm();
        }
        mapZzh.put(k, v);
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zziz zzizVar) throws IOException {
        int iZzb;
        Unsafe unsafe = zzuc;
        long j2 = this.zzud[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zziy.zzc(bArr, i)));
                    iZzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zziy.zzd(bArr, i)));
                    iZzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    iZzb = zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(t, j, Long.valueOf(zzizVar.zznl));
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    iZzb = zziy.zza(bArr, i, zzizVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzizVar.zznk));
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zziy.zzb(bArr, i)));
                    iZzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zziy.zza(bArr, i)));
                    iZzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    iZzb = zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzizVar.zznl != 0));
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int iZza = zziy.zza(bArr, i, zzizVar);
                    int i9 = zzizVar.zznk;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zznf.zze(bArr, iZza, iZza + i9)) {
                            throw zzkq.zzdn();
                        }
                        unsafe.putObject(t, j, new String(bArr, iZza, i9, zzkm.UTF_8));
                        iZza += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return iZza;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int iZza2 = zziy.zza(zzap(i8), bArr, i, i2, zzizVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzizVar.zznm);
                    } else {
                        unsafe.putObject(t, j, zzkm.zza(object, zzizVar.zznm));
                    }
                    unsafe.putInt(t, j2, i4);
                    return iZza2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    iZzb = zziy.zze(bArr, i, zzizVar);
                    unsafe.putObject(t, j, zzizVar.zznm);
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int iZza3 = zziy.zza(bArr, i, zzizVar);
                    int i10 = zzizVar.zznk;
                    zzko zzkoVarZzar = zzar(i8);
                    if (zzkoVarZzar == null || zzkoVarZzar.zzan(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        iZzb = iZza3;
                        unsafe.putInt(t, j2, i4);
                        return iZzb;
                    }
                    zzo(t).zzb(i3, Long.valueOf(i10));
                    return iZza3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    iZzb = zziy.zza(bArr, i, zzizVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzjo.zzw(zzizVar.zznk)));
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    iZzb = zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(t, j, Long.valueOf(zzjo.zzk(zzizVar.zznl)));
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    iZzb = zziy.zza(zzap(i8), bArr, i, i2, (i3 & (-8)) | 4, zzizVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzizVar.zznm);
                    } else {
                        unsafe.putObject(t, j, zzkm.zza(object2, zzizVar.zznm));
                    }
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                return i;
            default:
                return i;
        }
    }

    private final zzmf zzap(int i) {
        int i2 = (i / 3) << 1;
        zzmf zzmfVar = (zzmf) this.zzue[i2];
        if (zzmfVar != null) {
            return zzmfVar;
        }
        zzmf<T> zzmfVarZzf = zzmd.zzej().zzf((Class) this.zzue[i2 + 1]);
        this.zzue[i2] = zzmfVarZzf;
        return zzmfVarZzf;
    }

    private final Object zzaq(int i) {
        return this.zzue[(i / 3) << 1];
    }

    private final zzko zzar(int i) {
        return (zzko) this.zzue[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x048e, code lost:
    
        if (r0 == r1) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0490, code lost:
    
        r27.putInt(r13, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0496, code lost:
    
        r5 = null;
        r11 = r10.zzun;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x049d, code lost:
    
        if (r11 >= r10.zzuo) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x049f, code lost:
    
        r1 = r10.zzum[r11];
        r6 = r10.zzur;
        r2 = r10.zzud[r1];
        r0 = com.google.android.gms.internal.drive.zznd.zzo(r13, r10.zzas(r1) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04b4, code lost:
    
        if (r0 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04b7, code lost:
    
        r4 = r10.zzar(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04bb, code lost:
    
        if (r4 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04be, code lost:
    
        r5 = zza(r1, r2, r10.zzut.zzh(r0), r4, (com.google.android.gms.internal.drive.zzko) r5, (com.google.android.gms.internal.drive.zzmx<UT, com.google.android.gms.internal.drive.zzko>) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04ca, code lost:
    
        r5 = (com.google.android.gms.internal.drive.zzmy) r5;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04cf, code lost:
    
        if (r5 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04d1, code lost:
    
        r10.zzur.zzf(r13, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04d6, code lost:
    
        if (r8 != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04da, code lost:
    
        if (r7 != r34) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04e1, code lost:
    
        throw com.google.android.gms.internal.drive.zzkq.zzdm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04e4, code lost:
    
        if (r7 > r34) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04e6, code lost:
    
        if (r9 != r8) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04e8, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04ed, code lost:
    
        throw com.google.android.gms.internal.drive.zzkq.zzdm();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zza(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.drive.zziz r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.drive.zziz):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0211, code lost:
    
        if (r0 == r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
    
        if (r0 == r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0232, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e4, code lost:
    
        if (r0 == r15) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0062. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.drive.zziz r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.drive.zziz):void");
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzd(T t) {
        int i;
        int i2 = this.zzun;
        while (true) {
            i = this.zzuo;
            if (i2 >= i) {
                break;
            }
            long jZzas = zzas(this.zzum[i2]) & 1048575;
            Object objZzo = zznd.zzo(t, jZzas);
            if (objZzo != null) {
                zznd.zza(t, jZzas, this.zzut.zzk(objZzo));
            }
            i2++;
        }
        int length = this.zzum.length;
        while (i < length) {
            this.zzuq.zza(t, this.zzum[i]);
            i++;
        }
        this.zzur.zzd(t);
        if (this.zzui) {
            this.zzus.zzd(t);
        }
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzko zzkoVar, UB ub, zzmx<UT, UB> zzmxVar) {
        zzlj<?, ?> zzljVarZzm = this.zzut.zzm(zzaq(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzkoVar.zzan(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmxVar.zzez();
                }
                zzjk zzjkVarZzu = zzjc.zzu(zzli.zza(zzljVarZzm, next.getKey(), next.getValue()));
                try {
                    zzli.zza(zzjkVarZzu.zzby(), zzljVarZzm, next.getKey(), next.getValue());
                    zzmxVar.zza((zzmx<UT, UB>) ub, i2, zzjkVarZzu.zzbx());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.drive.zzmf] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.drive.zzmf] */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzp(T r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzlu.zzp(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzmf zzmfVar) {
        return zzmfVar.zzp(zznd.zzo(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzns zznsVar) throws IOException {
        if (obj instanceof String) {
            zznsVar.zza(i, (String) obj);
        } else {
            zznsVar.zza(i, (zzjc) obj);
        }
    }

    private final int zzas(int i) {
        return this.zzud[i + 1];
    }

    private final int zzat(int i) {
        return this.zzud[i + 2];
    }

    private static <T> double zze(T t, long j) {
        return ((Double) zznd.zzo(t, j)).doubleValue();
    }

    private static <T> float zzf(T t, long j) {
        return ((Float) zznd.zzo(t, j)).floatValue();
    }

    private static <T> int zzg(T t, long j) {
        return ((Integer) zznd.zzo(t, j)).intValue();
    }

    private static <T> long zzh(T t, long j) {
        return ((Long) zznd.zzo(t, j)).longValue();
    }

    private static <T> boolean zzi(T t, long j) {
        return ((Boolean) zznd.zzo(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzlu<T>) t, i) == zza((zzlu<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzuk) {
            return zza((zzlu<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzuk) {
            int iZzas = zzas(i);
            long j = iZzas & 1048575;
            switch ((iZzas & 267386880) >>> 20) {
                case 0:
                    return zznd.zzn(t, j) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                case 1:
                    return zznd.zzm(t, j) != 0.0f;
                case 2:
                    return zznd.zzk(t, j) != 0;
                case 3:
                    return zznd.zzk(t, j) != 0;
                case 4:
                    return zznd.zzj(t, j) != 0;
                case 5:
                    return zznd.zzk(t, j) != 0;
                case 6:
                    return zznd.zzj(t, j) != 0;
                case 7:
                    return zznd.zzl(t, j);
                case 8:
                    Object objZzo = zznd.zzo(t, j);
                    if (objZzo instanceof String) {
                        return !((String) objZzo).isEmpty();
                    }
                    if (objZzo instanceof zzjc) {
                        return !zzjc.zznq.equals(objZzo);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zznd.zzo(t, j) != null;
                case 10:
                    return !zzjc.zznq.equals(zznd.zzo(t, j));
                case 11:
                    return zznd.zzj(t, j) != 0;
                case 12:
                    return zznd.zzj(t, j) != 0;
                case 13:
                    return zznd.zzj(t, j) != 0;
                case 14:
                    return zznd.zzk(t, j) != 0;
                case 15:
                    return zznd.zzj(t, j) != 0;
                case 16:
                    return zznd.zzk(t, j) != 0;
                case 17:
                    return zznd.zzo(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int iZzat = zzat(i);
        return (zznd.zzj(t, (long) (iZzat & 1048575)) & (1 << (iZzat >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zzuk) {
            return;
        }
        int iZzat = zzat(i);
        long j = iZzat & 1048575;
        zznd.zza((Object) t, j, zznd.zzj(t, j) | (1 << (iZzat >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return zznd.zzj(t, (long) (zzat(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zznd.zza((Object) t, zzat(i2) & 1048575, i);
    }

    private final int zzau(int i) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, 0);
    }

    private final int zzp(int i, int i2) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, i2);
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzud.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzud[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
