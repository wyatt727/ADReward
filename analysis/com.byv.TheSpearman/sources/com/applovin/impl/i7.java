package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.applovin.impl.z4;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
final class i7 {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f519a;
    private final Paint b;
    private final Canvas c;
    private final b d;
    private final a e;
    private final h f;
    private Bitmap g;

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public i7(int i2, int i3) {
        Paint paint = new Paint();
        this.f519a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.e = new a(0, a(), b(), c());
        this.f = new h(i2, i3);
    }

    public void d() {
        this.f.a();
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int i2;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            if (i3 < 8) {
                iArr[i3] = a(63, (i3 & 1) != 0 ? 255 : 0, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) == 0 ? 0 : 255);
            } else {
                int i4 = i3 & 136;
                int i5 = Opcodes.TABLESWITCH;
                if (i4 == 0) {
                    int i6 = ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0);
                    int i7 = ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0);
                    i2 = (i3 & 4) == 0 ? 0 : 85;
                    if ((i3 & 64) == 0) {
                        i5 = 0;
                    }
                    iArr[i3] = a(255, i6, i7, i2 + i5);
                } else if (i4 == 8) {
                    int i8 = ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0);
                    int i9 = ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0);
                    i2 = (i3 & 4) == 0 ? 0 : 85;
                    if ((i3 & 64) == 0) {
                        i5 = 0;
                    }
                    iArr[i3] = a(127, i8, i9, i2 + i5);
                } else if (i4 == 128) {
                    iArr[i3] = a(255, ((i3 & 1) != 0 ? 43 : 0) + 127 + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + 127 + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + 127 + ((i3 & 64) == 0 ? 0 : 85));
                } else if (i4 == 136) {
                    iArr[i3] = a(255, ((i3 & 1) != 0 ? 43 : 0) + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + ((i3 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static byte[] a(int i2, int i3, xg xgVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) xgVar.a(i3);
        }
        return bArr;
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f527a;
        public final int b;
        public final SparseArray c = new SparseArray();
        public final SparseArray d = new SparseArray();
        public final SparseArray e = new SparseArray();
        public final SparseArray f = new SparseArray();
        public final SparseArray g = new SparseArray();
        public b h;
        public d i;

        public h(int i, int i2) {
            this.f527a = i;
            this.b = i2;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f521a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f521a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f523a;
        public final int b;
        public final int c;
        public final SparseArray d;

        public d(int i, int i2, int i3, SparseArray sparseArray) {
            this.f523a = i;
            this.b = i2;
            this.c = i3;
            this.d = sparseArray;
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f524a;
        public final int b;

        public e(int i, int i2) {
            this.f524a = i;
            this.b = i2;
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f525a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray k;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray sparseArray) {
            this.f525a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.k.put(sparseArray.keyAt(i), (g) sparseArray.valueAt(i));
            }
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f526a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f526a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f520a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f520a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f522a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f522a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    private static int b(xg xgVar, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        int iA;
        int i5 = i2;
        boolean z2 = false;
        while (true) {
            int iA2 = xgVar.a(4);
            int i6 = 2;
            if (iA2 != 0) {
                z = z2;
                i4 = 1;
            } else if (!xgVar.f()) {
                int iA3 = xgVar.a(3);
                if (iA3 != 0) {
                    i6 = iA3 + 2;
                    z = z2;
                    i4 = i6;
                    iA2 = 0;
                } else {
                    z = true;
                    iA2 = 0;
                    i4 = 0;
                }
            } else {
                if (!xgVar.f()) {
                    iA = xgVar.a(2) + 4;
                    iA2 = xgVar.a(4);
                } else {
                    int iA4 = xgVar.a(2);
                    if (iA4 != 0) {
                        if (iA4 != 1) {
                            if (iA4 == 2) {
                                iA = xgVar.a(4) + 9;
                                iA2 = xgVar.a(4);
                            } else if (iA4 != 3) {
                                z = z2;
                                iA2 = 0;
                                i4 = 0;
                            } else {
                                iA = xgVar.a(8) + 25;
                                iA2 = xgVar.a(4);
                            }
                        }
                        z = z2;
                        i4 = i6;
                        iA2 = 0;
                    } else {
                        z = z2;
                        i4 = 1;
                        iA2 = 0;
                    }
                }
                z = z2;
                i4 = iA;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    iA2 = bArr[iA2];
                }
                paint.setColor(iArr[iA2]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z) {
                return i5;
            }
            z2 = z;
        }
    }

    private static int[] a() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int c(xg xgVar, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int iA;
        int i4 = i2;
        boolean z2 = false;
        while (true) {
            int iA2 = xgVar.a(8);
            if (iA2 != 0) {
                z = z2;
                iA = 1;
            } else if (!xgVar.f()) {
                int iA3 = xgVar.a(7);
                if (iA3 != 0) {
                    z = z2;
                    iA = iA3;
                    iA2 = 0;
                } else {
                    z = true;
                    iA2 = 0;
                    iA = 0;
                }
            } else {
                z = z2;
                iA = xgVar.a(7);
                iA2 = xgVar.a(8);
            }
            if (iA != 0 && paint != null) {
                if (bArr != null) {
                    iA2 = bArr[iA2];
                }
                paint.setColor(iArr[iA2]);
                canvas.drawRect(i4, i3, i4 + iA, i3 + 1, paint);
            }
            i4 += iA;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    private static f c(xg xgVar, int i2) {
        int i3;
        int iA;
        int iA2;
        int iA3 = xgVar.a(8);
        xgVar.d(4);
        boolean zF = xgVar.f();
        xgVar.d(3);
        int i4 = 16;
        int iA4 = xgVar.a(16);
        int iA5 = xgVar.a(16);
        int iA6 = xgVar.a(3);
        int iA7 = xgVar.a(3);
        int i5 = 2;
        xgVar.d(2);
        int iA8 = xgVar.a(8);
        int iA9 = xgVar.a(8);
        int iA10 = xgVar.a(4);
        int iA11 = xgVar.a(2);
        xgVar.d(2);
        int i6 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int iA12 = xgVar.a(i4);
            int iA13 = xgVar.a(i5);
            int iA14 = xgVar.a(i5);
            int iA15 = xgVar.a(12);
            int i7 = iA11;
            xgVar.d(4);
            int iA16 = xgVar.a(12);
            int i8 = i6 - 6;
            if (iA13 != 1) {
                i3 = 2;
                if (iA13 != 2) {
                    i6 = i8;
                    iA = 0;
                    iA2 = 0;
                }
                sparseArray.put(iA12, new g(iA13, iA14, iA15, iA16, iA, iA2));
                i5 = i3;
                iA11 = i7;
                i4 = 16;
            } else {
                i3 = 2;
            }
            i6 -= 8;
            iA = xgVar.a(8);
            iA2 = xgVar.a(8);
            sparseArray.put(iA12, new g(iA13, iA14, iA15, iA16, iA, iA2));
            i5 = i3;
            iA11 = i7;
            i4 = 16;
        }
        return new f(iA3, zF, iA4, iA5, iA6, iA7, iA8, iA9, iA10, iA11, sparseArray);
    }

    private static c b(xg xgVar) {
        byte[] bArr;
        int iA = xgVar.a(16);
        xgVar.d(4);
        int iA2 = xgVar.a(2);
        boolean zF = xgVar.f();
        xgVar.d(1);
        byte[] bArr2 = yp.f;
        if (iA2 == 1) {
            xgVar.d(xgVar.a(8) * 16);
        } else {
            if (iA2 == 0) {
                int iA3 = xgVar.a(16);
                int iA4 = xgVar.a(16);
                if (iA3 > 0) {
                    bArr2 = new byte[iA3];
                    xgVar.b(bArr2, 0, iA3);
                }
                if (iA4 > 0) {
                    bArr = new byte[iA4];
                    xgVar.b(bArr, 0, iA4);
                }
            }
            return new c(iA, zF, bArr2, bArr);
        }
        bArr = bArr2;
        return new c(iA, zF, bArr2, bArr);
    }

    private static int a(xg xgVar, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        int iA;
        int iA2;
        int i5 = i2;
        boolean z2 = false;
        while (true) {
            int iA3 = xgVar.a(2);
            if (iA3 != 0) {
                z = z2;
                i4 = 1;
            } else {
                if (xgVar.f()) {
                    iA = xgVar.a(3) + 3;
                    iA2 = xgVar.a(2);
                } else {
                    if (xgVar.f()) {
                        z = z2;
                        i4 = 1;
                    } else {
                        int iA4 = xgVar.a(2);
                        if (iA4 == 0) {
                            z = true;
                        } else if (iA4 == 1) {
                            z = z2;
                            i4 = 2;
                        } else if (iA4 == 2) {
                            iA = xgVar.a(4) + 12;
                            iA2 = xgVar.a(2);
                        } else if (iA4 != 3) {
                            z = z2;
                        } else {
                            iA = xgVar.a(8) + 29;
                            iA2 = xgVar.a(2);
                        }
                        iA3 = 0;
                        i4 = 0;
                    }
                    iA3 = 0;
                }
                z = z2;
                i4 = iA;
                iA3 = iA2;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    iA3 = bArr[iA3];
                }
                paint.setColor(iArr[iA3]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z) {
                return i5;
            }
            z2 = z;
        }
    }

    private static d b(xg xgVar, int i2) {
        int iA = xgVar.a(8);
        int iA2 = xgVar.a(4);
        int iA3 = xgVar.a(2);
        xgVar.d(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int iA4 = xgVar.a(8);
            xgVar.d(8);
            i3 -= 6;
            sparseArray.put(iA4, new e(xgVar.a(16), xgVar.a(16)));
        }
        return new d(iA, iA2, iA3, sparseArray);
    }

    private static void a(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i2 == 3) {
            iArr = aVar.d;
        } else if (i2 == 2) {
            iArr = aVar.c;
        } else {
            iArr = aVar.b;
        }
        int[] iArr2 = iArr;
        a(cVar.c, iArr2, i2, i3, i4, paint, canvas);
        a(cVar.d, iArr2, i2, i3, i4 + 1, paint, canvas);
    }

    private static a a(xg xgVar, int i2) {
        int iA;
        int i3;
        int iA2;
        int iA3;
        int iA4;
        int i4 = 8;
        int iA5 = xgVar.a(8);
        xgVar.d(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int[] iArrA = a();
        int[] iArrB = b();
        int[] iArrC = c();
        while (i6 > 0) {
            int iA6 = xgVar.a(i4);
            int iA7 = xgVar.a(i4);
            int[] iArr = (iA7 & 128) != 0 ? iArrA : (iA7 & 64) != 0 ? iArrB : iArrC;
            if ((iA7 & 1) != 0) {
                iA3 = xgVar.a(i4);
                iA4 = xgVar.a(i4);
                iA = xgVar.a(i4);
                iA2 = xgVar.a(i4);
                i3 = i6 - 6;
            } else {
                int iA8 = xgVar.a(6) << i5;
                int iA9 = xgVar.a(4) << 4;
                iA = xgVar.a(4) << 4;
                i3 = i6 - 4;
                iA2 = xgVar.a(i5) << 6;
                iA3 = iA8;
                iA4 = iA9;
            }
            if (iA3 == 0) {
                iA2 = 255;
                iA4 = 0;
                iA = 0;
            }
            double d2 = iA3;
            double d3 = iA4 - 128;
            double d4 = iA - 128;
            iArr[iA6] = a((byte) (255 - (iA2 & 255)), yp.a((int) (d2 + (1.402d * d3)), 0, 255), yp.a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), yp.a((int) (d2 + (d4 * 1.772d)), 0, 255));
            i6 = i3;
            iA5 = iA5;
            i4 = 8;
            i5 = 2;
        }
        return new a(iA5, iArrA, iArrB, iArrC);
    }

    private static b a(xg xgVar) {
        int i2;
        int i3;
        int i4;
        int iA;
        xgVar.d(4);
        boolean zF = xgVar.f();
        xgVar.d(3);
        int iA2 = xgVar.a(16);
        int iA3 = xgVar.a(16);
        if (zF) {
            int iA4 = xgVar.a(16);
            int iA5 = xgVar.a(16);
            int iA6 = xgVar.a(16);
            iA = xgVar.a(16);
            i4 = iA5;
            i3 = iA6;
            i2 = iA4;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = iA2;
            iA = iA3;
        }
        return new b(iA2, iA3, i2, i4, i3, iA);
    }

    private static void a(xg xgVar, h hVar) {
        f fVar;
        int iA = xgVar.a(8);
        int iA2 = xgVar.a(16);
        int iA3 = xgVar.a(16);
        int iD = xgVar.d() + iA3;
        if (iA3 * 8 > xgVar.b()) {
            kc.d("DvbParser", "Data field length exceeds limit");
            xgVar.d(xgVar.b());
            return;
        }
        switch (iA) {
            case 16:
                if (iA2 == hVar.f527a) {
                    d dVar = hVar.i;
                    d dVarB = b(xgVar, iA3);
                    if (dVarB.c != 0) {
                        hVar.i = dVarB;
                        hVar.c.clear();
                        hVar.d.clear();
                        hVar.e.clear();
                        break;
                    } else if (dVar != null && dVar.b != dVarB.b) {
                        hVar.i = dVarB;
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.i;
                if (iA2 == hVar.f527a && dVar2 != null) {
                    f fVarC = c(xgVar, iA3);
                    if (dVar2.c == 0 && (fVar = (f) hVar.c.get(fVarC.f525a)) != null) {
                        fVarC.a(fVar);
                    }
                    hVar.c.put(fVarC.f525a, fVarC);
                    break;
                }
                break;
            case 18:
                if (iA2 == hVar.f527a) {
                    a aVarA = a(xgVar, iA3);
                    hVar.d.put(aVarA.f520a, aVarA);
                    break;
                } else if (iA2 == hVar.b) {
                    a aVarA2 = a(xgVar, iA3);
                    hVar.f.put(aVarA2.f520a, aVarA2);
                    break;
                }
                break;
            case 19:
                if (iA2 == hVar.f527a) {
                    c cVarB = b(xgVar);
                    hVar.e.put(cVarB.f522a, cVarB);
                    break;
                } else if (iA2 == hVar.b) {
                    c cVarB2 = b(xgVar);
                    hVar.g.put(cVarB2.f522a, cVarB2);
                    break;
                }
                break;
            case 20:
                if (iA2 == hVar.f527a) {
                    hVar.h = a(xgVar);
                    break;
                }
                break;
        }
        xgVar.e(iD - xgVar.d());
    }

    public List a(byte[] bArr, int i2) {
        int i3;
        int i4;
        SparseArray sparseArray;
        xg xgVar = new xg(bArr, i2);
        while (xgVar.b() >= 48 && xgVar.a(8) == 15) {
            a(xgVar, this.f);
        }
        h hVar = this.f;
        d dVar = hVar.i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (bitmap == null || bVar.f521a + 1 != bitmap.getWidth() || bVar.b + 1 != this.g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f521a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.g = bitmapCreateBitmap;
            this.c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.d;
        for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
            this.c.save();
            e eVar = (e) sparseArray2.valueAt(i5);
            f fVar = (f) this.f.c.get(sparseArray2.keyAt(i5));
            int i6 = eVar.f524a + bVar.c;
            int i7 = eVar.b + bVar.e;
            this.c.clipRect(i6, i7, Math.min(fVar.c + i6, bVar.d), Math.min(fVar.d + i7, bVar.f));
            a aVar = (a) this.f.d.get(fVar.g);
            if (aVar == null && (aVar = (a) this.f.f.get(fVar.g)) == null) {
                aVar = this.e;
            }
            SparseArray sparseArray3 = fVar.k;
            int i8 = 0;
            while (i8 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i8);
                g gVar = (g) sparseArray3.valueAt(i8);
                c cVar = (c) this.f.e.get(iKeyAt);
                c cVar2 = cVar == null ? (c) this.f.g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    i4 = i8;
                    sparseArray = sparseArray3;
                    a(cVar2, aVar, fVar.f, gVar.c + i6, i7 + gVar.d, cVar2.b ? null : this.f519a, this.c);
                } else {
                    i4 = i8;
                    sparseArray = sparseArray3;
                }
                i8 = i4 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.b) {
                int i9 = fVar.f;
                if (i9 == 3) {
                    i3 = aVar.d[fVar.h];
                } else if (i9 == 2) {
                    i3 = aVar.c[fVar.i];
                } else {
                    i3 = aVar.b[fVar.j];
                }
                this.b.setColor(i3);
                this.c.drawRect(i6, i7, fVar.c + i6, fVar.d + i7, this.b);
            }
            arrayList.add(new z4.b().a(Bitmap.createBitmap(this.g, i6, i7, fVar.c, fVar.d)).b(i6 / bVar.f521a).b(0).a(i7 / bVar.b, 0).a(0).d(fVar.c / bVar.f521a).a(fVar.d / bVar.b).a());
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        xg xgVar = new xg(bArr);
        int iA = i3;
        int i5 = i4;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (xgVar.b() != 0) {
            int iA2 = xgVar.a(8);
            if (iA2 != 240) {
                switch (iA2) {
                    case 16:
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                            } else if (bArrA3 == null) {
                                bArr3 = h;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrA3;
                            }
                            iA = a(xgVar, iArr, bArr2, iA, i5, paint, canvas);
                            xgVar.c();
                        } else if (bArrA == null) {
                            bArr3 = i;
                            bArr2 = bArr3;
                            iA = a(xgVar, iArr, bArr2, iA, i5, paint, canvas);
                            xgVar.c();
                            break;
                        } else {
                            bArr2 = bArrA;
                            iA = a(xgVar, iArr, bArr2, iA, i5, paint, canvas);
                            xgVar.c();
                        }
                    case 17:
                        if (i2 == 3) {
                            bArr4 = bArrA2 == null ? j : bArrA2;
                        } else {
                            bArr4 = null;
                        }
                        iA = b(xgVar, iArr, bArr4, iA, i5, paint, canvas);
                        xgVar.c();
                        break;
                    case 18:
                        iA = c(xgVar, iArr, null, iA, i5, paint, canvas);
                        break;
                    default:
                        switch (iA2) {
                            case 32:
                                bArrA3 = a(4, 4, xgVar);
                                break;
                            case 33:
                                bArrA = a(4, 8, xgVar);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, xgVar);
                                break;
                        }
                }
            } else {
                i5 += 2;
                iA = i3;
            }
        }
    }
}
