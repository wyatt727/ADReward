package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaji {
    private static final byte[] zza;

    static {
        int i = zzfx.zza;
        zza = "OpusHead".getBytes(zzfwd.zzc);
    }

    public static zzby zza(zzaiy zzaiyVar) {
        zzgb zzgbVar;
        zzaiz zzaizVarZzb = zzaiyVar.zzb(Atom.TYPE_hdlr);
        zzaiz zzaizVarZzb2 = zzaiyVar.zzb(Atom.TYPE_keys);
        zzaiz zzaizVarZzb3 = zzaiyVar.zzb(Atom.TYPE_ilst);
        if (zzaizVarZzb != null && zzaizVarZzb2 != null && zzaizVarZzb3 != null && zzg(zzaizVarZzb.zza) == 1835299937) {
            zzfo zzfoVar = zzaizVarZzb2.zza;
            zzfoVar.zzK(12);
            int iZzg = zzfoVar.zzg();
            String[] strArr = new String[iZzg];
            for (int i = 0; i < iZzg; i++) {
                int iZzg2 = zzfoVar.zzg();
                zzfoVar.zzL(4);
                strArr[i] = zzfoVar.zzA(iZzg2 - 8, zzfwd.zzc);
            }
            zzfo zzfoVar2 = zzaizVarZzb3.zza;
            zzfoVar2.zzK(8);
            ArrayList arrayList = new ArrayList();
            while (zzfoVar2.zzb() > 8) {
                int iZzd = zzfoVar2.zzd() + zzfoVar2.zzg();
                int iZzg3 = zzfoVar2.zzg() - 1;
                if (iZzg3 < 0 || iZzg3 >= iZzg) {
                    zzfe.zzf("AtomParsers", "Skipped metadata with unknown key index: " + iZzg3);
                } else {
                    String str = strArr[iZzg3];
                    int i2 = zzajr.zzb;
                    while (true) {
                        int iZzd2 = zzfoVar2.zzd();
                        if (iZzd2 >= iZzd) {
                            zzgbVar = null;
                            break;
                        }
                        int iZzg4 = zzfoVar2.zzg();
                        if (zzfoVar2.zzg() == 1684108385) {
                            int iZzg5 = zzfoVar2.zzg();
                            int iZzg6 = zzfoVar2.zzg();
                            int i3 = iZzg4 - 16;
                            byte[] bArr = new byte[i3];
                            zzfoVar2.zzG(bArr, 0, i3);
                            zzgbVar = new zzgb(str, bArr, iZzg6, iZzg5);
                            break;
                        }
                        zzfoVar2.zzK(iZzd2 + iZzg4);
                    }
                    if (zzgbVar != null) {
                        arrayList.add(zzgbVar);
                    }
                }
                zzfoVar2.zzK(iZzd);
            }
            if (!arrayList.isEmpty()) {
                return new zzby(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzby zzb(com.google.android.gms.internal.ads.zzaiz r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaji.zzb(com.google.android.gms.internal.ads.zzaiz):com.google.android.gms.internal.ads.zzby");
    }

    public static zzgh zzc(zzfo zzfoVar) {
        long jZzt;
        long jZzt2;
        zzfoVar.zzK(8);
        if (zzaja.zze(zzfoVar.zzg()) == 0) {
            jZzt = zzfoVar.zzu();
            jZzt2 = zzfoVar.zzu();
        } else {
            jZzt = zzfoVar.zzt();
            jZzt2 = zzfoVar.zzt();
        }
        return new zzgh(jZzt, jZzt2, zzfoVar.zzu());
    }

    /* JADX WARN: Removed duplicated region for block: B:310:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0b6a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List zzd(com.google.android.gms.internal.ads.zzaiy r56, com.google.android.gms.internal.ads.zzadv r57, long r58, com.google.android.gms.internal.ads.zzae r60, boolean r61, boolean r62, com.google.android.gms.internal.ads.zzfwf r63) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 2932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaji.zzd(com.google.android.gms.internal.ads.zzaiy, com.google.android.gms.internal.ads.zzadv, long, com.google.android.gms.internal.ads.zzae, boolean, boolean, com.google.android.gms.internal.ads.zzfwf):java.util.List");
    }

    public static void zze(zzfo zzfoVar) {
        int iZzd = zzfoVar.zzd();
        zzfoVar.zzL(4);
        if (zzfoVar.zzg() != 1751411826) {
            iZzd += 4;
        }
        zzfoVar.zzK(iZzd);
    }

    private static int zzf(zzfo zzfoVar) {
        int iZzm = zzfoVar.zzm();
        int i = iZzm & 127;
        while ((iZzm & 128) == 128) {
            iZzm = zzfoVar.zzm();
            i = (i << 7) | (iZzm & 127);
        }
        return i;
    }

    private static int zzg(zzfo zzfoVar) {
        zzfoVar.zzK(16);
        return zzfoVar.zzg();
    }

    private static Pair zzh(zzfo zzfoVar, int i, int i2) throws zzcc {
        Integer num;
        zzakc zzakcVar;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int iZzd = zzfoVar.zzd();
        while (iZzd - i < i2) {
            zzfoVar.zzK(iZzd);
            int iZzg = zzfoVar.zzg();
            zzadj.zzb(iZzg > 0, "childAtomSize must be positive");
            if (zzfoVar.zzg() == 1936289382) {
                int i5 = iZzd + 8;
                int i6 = 0;
                int i7 = -1;
                String strZzA = null;
                Integer numValueOf = null;
                while (i5 - iZzd < iZzg) {
                    zzfoVar.zzK(i5);
                    int iZzg2 = zzfoVar.zzg();
                    int iZzg3 = zzfoVar.zzg();
                    if (iZzg3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzfoVar.zzg());
                    } else if (iZzg3 == 1935894637) {
                        zzfoVar.zzL(4);
                        strZzA = zzfoVar.zzA(4, zzfwd.zzc);
                    } else if (iZzg3 == 1935894633) {
                        i7 = i5;
                        i6 = iZzg2;
                    }
                    i5 += iZzg2;
                }
                if ("cenc".equals(strZzA) || "cbc1".equals(strZzA) || "cens".equals(strZzA) || "cbcs".equals(strZzA)) {
                    zzadj.zzb(numValueOf != null, "frma atom is mandatory");
                    zzadj.zzb(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = numValueOf;
                            zzakcVar = null;
                            break;
                        }
                        zzfoVar.zzK(i8);
                        int iZzg4 = zzfoVar.zzg();
                        if (zzfoVar.zzg() == 1952804451) {
                            int iZze = zzaja.zze(zzfoVar.zzg());
                            zzfoVar.zzL(1);
                            if (iZze == 0) {
                                zzfoVar.zzL(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iZzm = zzfoVar.zzm();
                                int i9 = (iZzm & 240) >> 4;
                                i3 = iZzm & 15;
                                i4 = i9;
                            }
                            boolean z = zzfoVar.zzm() == 1;
                            int iZzm2 = zzfoVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzfoVar.zzG(bArr2, 0, 16);
                            if (z && iZzm2 == 0) {
                                int iZzm3 = zzfoVar.zzm();
                                byte[] bArr3 = new byte[iZzm3];
                                zzfoVar.zzG(bArr3, 0, iZzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            zzakcVar = new zzakc(z, strZzA, iZzm2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += iZzg4;
                        }
                    }
                    zzadj.zzb(zzakcVar != null, "tenc atom is mandatory");
                    int i10 = zzfx.zza;
                    pairCreate = Pair.create(num, zzakcVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzd += iZzg;
        }
        return null;
    }

    private static zzby zzi(zzfo zzfoVar) {
        short sZzD = zzfoVar.zzD();
        zzfoVar.zzL(2);
        String strZzA = zzfoVar.zzA(sZzD, zzfwd.zzc);
        int iMax = Math.max(strZzA.lastIndexOf(43), strZzA.lastIndexOf(45));
        try {
            return new zzby(-9223372036854775807L, new zzge(Float.parseFloat(strZzA.substring(0, iMax)), Float.parseFloat(strZzA.substring(iMax, strZzA.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzajc zzj(zzfo zzfoVar, int i) {
        zzfoVar.zzK(i + 12);
        zzfoVar.zzL(1);
        zzf(zzfoVar);
        zzfoVar.zzL(2);
        int iZzm = zzfoVar.zzm();
        if ((iZzm & 128) != 0) {
            zzfoVar.zzL(2);
        }
        if ((iZzm & 64) != 0) {
            zzfoVar.zzL(zzfoVar.zzm());
        }
        if ((iZzm & 32) != 0) {
            zzfoVar.zzL(2);
        }
        zzfoVar.zzL(1);
        zzf(zzfoVar);
        String strZzd = zzcb.zzd(zzfoVar.zzm());
        if ("audio/mpeg".equals(strZzd) || "audio/vnd.dts".equals(strZzd) || "audio/vnd.dts.hd".equals(strZzd)) {
            return new zzajc(strZzd, null, -1L, -1L);
        }
        zzfoVar.zzL(4);
        long jZzu = zzfoVar.zzu();
        long jZzu2 = zzfoVar.zzu();
        zzfoVar.zzL(1);
        int iZzf = zzf(zzfoVar);
        byte[] bArr = new byte[iZzf];
        zzfoVar.zzG(bArr, 0, iZzf);
        return new zzajc(strZzd, bArr, jZzu2 <= 0 ? -1L : jZzu2, jZzu > 0 ? jZzu : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0271 A[ADDED_TO_REGION, LOOP:12: B:103:0x0271->B:107:0x027b, LOOP_START, PHI: r16
      0x0271: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:102:0x026f, B:107:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x025f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173 A[PHI: r9
      0x0173: PHI (r9v4 int) = (r9v3 int), (r9v3 int), (r9v35 int), (r9v3 int) binds: [B:36:0x00cf, B:43:0x00e9, B:60:0x0172, B:42:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzake zzk(com.google.android.gms.internal.ads.zzakb r40, com.google.android.gms.internal.ads.zzaiy r41, com.google.android.gms.internal.ads.zzadv r42) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaji.zzk(com.google.android.gms.internal.ads.zzakb, com.google.android.gms.internal.ads.zzaiy, com.google.android.gms.internal.ads.zzadv):com.google.android.gms.internal.ads.zzake");
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzm(com.google.android.gms.internal.ads.zzfo r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, com.google.android.gms.internal.ads.zzae r33, com.google.android.gms.internal.ads.zzaje r34, int r35) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaji.zzm(com.google.android.gms.internal.ads.zzfo, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzae, com.google.android.gms.internal.ads.zzaje, int):void");
    }
}
