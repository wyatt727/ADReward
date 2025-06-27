package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.nio.ByteBuffer;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzace {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] zzd = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, 192, 224, 256, 320, RendererCapabilities.MODE_SUPPORT_MASK, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, Opcodes.F2I, Opcodes.FRETURN, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & Utf8.REPLACEMENT_BYTE);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    public static zzam zzc(zzfo zzfoVar, String str, String str2, zzae zzaeVar) {
        zzfn zzfnVar = new zzfn();
        zzfnVar.zzi(zzfoVar);
        int i = zzc[zzfnVar.zzd(2)];
        zzfnVar.zzm(8);
        int i2 = zze[zzfnVar.zzd(3)];
        if (zzfnVar.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzfnVar.zzd(5)] * 1000;
        zzfnVar.zze();
        zzfoVar.zzK(zzfnVar.zzb());
        zzak zzakVar = new zzak();
        zzakVar.zzK(str);
        zzakVar.zzW("audio/ac3");
        zzakVar.zzy(i2);
        zzakVar.zzX(i);
        zzakVar.zzE(zzaeVar);
        zzakVar.zzN(str2);
        zzakVar.zzx(i3);
        zzakVar.zzR(i3);
        return zzakVar.zzac();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzam zzd(com.google.android.gms.internal.ads.zzfo r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.zzae r10) {
        /*
            com.google.android.gms.internal.ads.zzfn r0 = new com.google.android.gms.internal.ads.zzfn
            r0.<init>()
            r0.zzi(r7)
            r1 = 13
            int r1 = r0.zzd(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.zzm(r2)
            r3 = 2
            int r3 = r0.zzd(r3)
            int[] r4 = com.google.android.gms.internal.ads.zzace.zzc
            r3 = r4[r3]
            r4 = 10
            r0.zzm(r4)
            int[] r4 = com.google.android.gms.internal.ads.zzace.zze
            int r5 = r0.zzd(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.zzd(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.zzm(r2)
            r2 = 4
            int r2 = r0.zzd(r2)
            r0.zzm(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.zzm(r2)
            int r2 = r0.zzd(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.zzm(r5)
        L4f:
            int r2 = r0.zza()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.zzm(r6)
            int r2 = r0.zzd(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.zze()
            int r0 = r0.zzb()
            r7.zzK(r0)
            com.google.android.gms.internal.ads.zzak r7 = new com.google.android.gms.internal.ads.zzak
            r7.<init>()
            r7.zzK(r8)
            r7.zzW(r2)
            r7.zzy(r4)
            r7.zzX(r3)
            r7.zzE(r10)
            r7.zzN(r9)
            r7.zzR(r1)
            com.google.android.gms.internal.ads.zzam r7 = r7.zzac()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzace.zzd(com.google.android.gms.internal.ads.zzfo, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzae):com.google.android.gms.internal.ads.zzam");
    }

    public static zzacd zze(zzfn zzfnVar) {
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzc = zzfnVar.zzc();
        zzfnVar.zzm(40);
        int iZzd = zzfnVar.zzd(5);
        zzfnVar.zzk(iZzc);
        int i12 = -1;
        if (iZzd > 10) {
            zzfnVar.zzm(16);
            int iZzd2 = zzfnVar.zzd(2);
            if (iZzd2 == 0) {
                i12 = 0;
            } else if (iZzd2 == 1) {
                i12 = 1;
            } else if (iZzd2 == 2) {
                i12 = 2;
            }
            zzfnVar.zzm(3);
            int iZzd3 = zzfnVar.zzd(11) + 1;
            int iZzd4 = zzfnVar.zzd(2);
            if (iZzd4 == 3) {
                i8 = zzd[zzfnVar.zzd(2)];
                i9 = 6;
                i7 = 3;
            } else {
                int iZzd5 = zzfnVar.zzd(2);
                int i13 = zzb[iZzd5];
                i7 = iZzd5;
                i8 = zzc[iZzd4];
                i9 = i13;
            }
            int i14 = iZzd3 + iZzd3;
            int i15 = (i14 * i8) / (i9 * 32);
            int iZzd6 = zzfnVar.zzd(3);
            boolean zZzo = zzfnVar.zzo();
            i = zze[iZzd6] + (zZzo ? 1 : 0);
            zzfnVar.zzm(10);
            if (zzfnVar.zzo()) {
                zzfnVar.zzm(8);
            }
            if (iZzd6 == 0) {
                zzfnVar.zzm(5);
                if (zzfnVar.zzo()) {
                    zzfnVar.zzm(8);
                }
                i10 = 0;
                iZzd6 = 0;
            } else {
                i10 = iZzd6;
            }
            if (i12 == 1) {
                if (zzfnVar.zzo()) {
                    zzfnVar.zzm(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzfnVar.zzo()) {
                if (i10 > 2) {
                    zzfnVar.zzm(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzfnVar.zzm(6);
                }
                if ((i10 & 4) != 0) {
                    zzfnVar.zzm(6);
                }
                if (zZzo && zzfnVar.zzo()) {
                    zzfnVar.zzm(5);
                }
                if (i11 == 0) {
                    if (zzfnVar.zzo()) {
                        zzfnVar.zzm(6);
                    }
                    if (i10 == 0 && zzfnVar.zzo()) {
                        zzfnVar.zzm(6);
                    }
                    if (zzfnVar.zzo()) {
                        zzfnVar.zzm(6);
                    }
                    int iZzd7 = zzfnVar.zzd(2);
                    if (iZzd7 == 1) {
                        zzfnVar.zzm(5);
                    } else if (iZzd7 == 2) {
                        zzfnVar.zzm(12);
                    } else if (iZzd7 == 3) {
                        int iZzd8 = zzfnVar.zzd(5);
                        if (zzfnVar.zzo()) {
                            zzfnVar.zzm(5);
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                if (zzfnVar.zzo()) {
                                    zzfnVar.zzm(4);
                                }
                                if (zzfnVar.zzo()) {
                                    zzfnVar.zzm(4);
                                }
                            }
                        }
                        if (zzfnVar.zzo()) {
                            zzfnVar.zzm(5);
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(7);
                                if (zzfnVar.zzo()) {
                                    zzfnVar.zzm(8);
                                }
                            }
                        }
                        zzfnVar.zzm((iZzd8 + 2) * 8);
                        zzfnVar.zze();
                    }
                    if (i10 < 2) {
                        if (zzfnVar.zzo()) {
                            zzfnVar.zzm(14);
                        }
                        if (iZzd6 == 0 && zzfnVar.zzo()) {
                            zzfnVar.zzm(14);
                        }
                    }
                    if (!zzfnVar.zzo()) {
                        i11 = 0;
                    } else if (i7 == 0) {
                        zzfnVar.zzm(5);
                        i11 = 0;
                        i7 = 0;
                    } else {
                        for (int i16 = 0; i16 < i9; i16++) {
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(5);
                            }
                        }
                        i11 = 0;
                    }
                }
            }
            if (zzfnVar.zzo()) {
                zzfnVar.zzm(5);
                if (i10 == 2) {
                    zzfnVar.zzm(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzfnVar.zzm(2);
                }
                if (zzfnVar.zzo()) {
                    zzfnVar.zzm(8);
                }
                if (i10 == 0 && zzfnVar.zzo()) {
                    zzfnVar.zzm(8);
                }
                if (iZzd4 < 3) {
                    zzfnVar.zzl();
                }
            }
            if (i11 == 0 && i7 != 3) {
                zzfnVar.zzl();
            }
            if (i11 == 2 && (i7 == 3 || zzfnVar.zzo())) {
                zzfnVar.zzm(6);
            }
            str = (zzfnVar.zzo() && zzfnVar.zzd(6) == 1 && zzfnVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i12;
            i4 = i14;
            i5 = i8;
            i6 = i9 * 256;
            i3 = i15;
        } else {
            zzfnVar.zzm(32);
            int iZzd9 = zzfnVar.zzd(2);
            String str2 = iZzd9 == 3 ? null : "audio/ac3";
            int iZzd10 = zzfnVar.zzd(6);
            int i17 = zzf[iZzd10 / 2] * 1000;
            int iZzf = zzf(iZzd9, iZzd10);
            zzfnVar.zzm(8);
            int iZzd11 = zzfnVar.zzd(3);
            if ((iZzd11 & 1) != 0 && iZzd11 != 1) {
                zzfnVar.zzm(2);
            }
            if ((iZzd11 & 4) != 0) {
                zzfnVar.zzm(2);
            }
            if (iZzd11 == 2) {
                zzfnVar.zzm(2);
            }
            int i18 = iZzd9 < 3 ? zzc[iZzd9] : -1;
            i = zze[iZzd11] + (zzfnVar.zzo() ? 1 : 0);
            str = str2;
            i2 = -1;
            i3 = i17;
            i4 = iZzf;
            i5 = i18;
            i6 = 1536;
        }
        return new zzacd(str, i2, i, i5, i4, i6, i3, null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
