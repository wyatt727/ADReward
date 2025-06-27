package com.applovin.impl;

import com.applovin.impl.d9;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.nio.ByteBuffer;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f579a = {1, 2, 3, 6};
    private static final int[] b = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] c = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, 192, 224, 256, 320, RendererCapabilities.MODE_SUPPORT_MASK, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, Opcodes.F2I, Opcodes.FRETURN, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f580a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        private b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f580a = str;
            this.b = i;
            this.d = i2;
            this.c = i3;
            this.e = i4;
            this.f = i5;
        }
    }

    public static int b(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f579a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((yp.a(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    public static d9 b(yg ygVar, String str, String str2, w6 w6Var) {
        ygVar.g(2);
        int i = b[(ygVar.w() & 192) >> 6];
        int iW = ygVar.w();
        int i2 = d[(iW & 14) >> 1];
        if ((iW & 1) != 0) {
            i2++;
        }
        if (((ygVar.w() & 30) >> 1) > 0 && (2 & ygVar.w()) != 0) {
            i2 += 2;
        }
        return new d9.b().c(str).f((ygVar.a() <= 0 || (ygVar.w() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").c(i2).n(i).a(w6Var).e(str2).a();
    }

    private static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static d9 a(yg ygVar, String str, String str2, w6 w6Var) {
        int i = b[(ygVar.w() & 192) >> 6];
        int iW = ygVar.w();
        int i2 = d[(iW & 56) >> 3];
        if ((iW & 4) != 0) {
            i2++;
        }
        return new d9.b().c(str).f("audio/ac3").c(i2).n(i).a(w6Var).e(str2).a();
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static b a(xg xgVar) {
        int iA;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int iA2;
        int i5;
        int i6;
        int i7;
        int i8;
        int iE = xgVar.e();
        xgVar.d(40);
        boolean z = xgVar.a(5) > 10;
        xgVar.c(iE);
        int i9 = -1;
        if (z) {
            xgVar.d(16);
            int iA3 = xgVar.a(2);
            if (iA3 == 0) {
                i9 = 0;
            } else if (iA3 == 1) {
                i9 = 1;
            } else if (iA3 == 2) {
                i9 = 2;
            }
            xgVar.d(3);
            iA = (xgVar.a(11) + 1) * 2;
            int iA4 = xgVar.a(2);
            if (iA4 == 3) {
                i = c[xgVar.a(2)];
                i5 = 6;
                iA2 = 3;
            } else {
                iA2 = xgVar.a(2);
                i5 = f579a[iA2];
                i = b[iA4];
            }
            i2 = i5 * 256;
            int iA5 = xgVar.a(3);
            boolean zF = xgVar.f();
            i3 = d[iA5] + (zF ? 1 : 0);
            xgVar.d(10);
            if (xgVar.f()) {
                xgVar.d(8);
            }
            if (iA5 == 0) {
                xgVar.d(5);
                if (xgVar.f()) {
                    xgVar.d(8);
                }
            }
            if (i9 == 1 && xgVar.f()) {
                xgVar.d(16);
            }
            if (xgVar.f()) {
                if (iA5 > 2) {
                    xgVar.d(2);
                }
                if ((iA5 & 1) == 0 || iA5 <= 2) {
                    i7 = 6;
                } else {
                    i7 = 6;
                    xgVar.d(6);
                }
                if ((iA5 & 4) != 0) {
                    xgVar.d(i7);
                }
                if (zF && xgVar.f()) {
                    xgVar.d(5);
                }
                if (i9 == 0) {
                    if (xgVar.f()) {
                        i8 = 6;
                        xgVar.d(6);
                    } else {
                        i8 = 6;
                    }
                    if (iA5 == 0 && xgVar.f()) {
                        xgVar.d(i8);
                    }
                    if (xgVar.f()) {
                        xgVar.d(i8);
                    }
                    int iA6 = xgVar.a(2);
                    if (iA6 == 1) {
                        xgVar.d(5);
                    } else if (iA6 == 2) {
                        xgVar.d(12);
                    } else if (iA6 == 3) {
                        int iA7 = xgVar.a(5);
                        if (xgVar.f()) {
                            xgVar.d(5);
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                xgVar.d(4);
                            }
                            if (xgVar.f()) {
                                if (xgVar.f()) {
                                    xgVar.d(4);
                                }
                                if (xgVar.f()) {
                                    xgVar.d(4);
                                }
                            }
                        }
                        if (xgVar.f()) {
                            xgVar.d(5);
                            if (xgVar.f()) {
                                xgVar.d(7);
                                if (xgVar.f()) {
                                    xgVar.d(8);
                                }
                            }
                        }
                        xgVar.d((iA7 + 2) * 8);
                        xgVar.c();
                    }
                    if (iA5 < 2) {
                        if (xgVar.f()) {
                            xgVar.d(14);
                        }
                        if (iA5 == 0 && xgVar.f()) {
                            xgVar.d(14);
                        }
                    }
                    if (xgVar.f()) {
                        if (iA2 == 0) {
                            xgVar.d(5);
                        } else {
                            for (int i10 = 0; i10 < i5; i10++) {
                                if (xgVar.f()) {
                                    xgVar.d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xgVar.f()) {
                xgVar.d(5);
                if (iA5 == 2) {
                    xgVar.d(4);
                }
                if (iA5 >= 6) {
                    xgVar.d(2);
                }
                if (xgVar.f()) {
                    xgVar.d(8);
                }
                if (iA5 == 0 && xgVar.f()) {
                    xgVar.d(8);
                }
                if (iA4 < 3) {
                    xgVar.g();
                }
            }
            if (i9 == 0 && iA2 != 3) {
                xgVar.g();
            }
            if (i9 == 2 && (iA2 == 3 || xgVar.f())) {
                i6 = 6;
                xgVar.d(6);
            } else {
                i6 = 6;
            }
            str = (xgVar.f() && xgVar.a(i6) == 1 && xgVar.a(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i9;
        } else {
            xgVar.d(32);
            int iA8 = xgVar.a(2);
            String str2 = iA8 == 3 ? null : "audio/ac3";
            iA = a(iA8, xgVar.a(6));
            xgVar.d(8);
            int iA9 = xgVar.a(3);
            if ((iA9 & 1) != 0 && iA9 != 1) {
                xgVar.d(2);
            }
            if ((iA9 & 4) != 0) {
                xgVar.d(2);
            }
            if (iA9 == 2) {
                xgVar.d(2);
            }
            int[] iArr = b;
            i = iA8 < iArr.length ? iArr[iA8] : -1;
            i2 = 1536;
            i3 = d[iA9] + (xgVar.f() ? 1 : 0);
            i4 = -1;
            str = str2;
        }
        return new b(str, i4, i3, i, iA, i2);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return a((b2 & 192) >> 6, b2 & Utf8.REPLACEMENT_BYTE);
    }

    public static int a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
