package com.applovin.impl;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.Sniffer;

/* loaded from: classes.dex */
abstract class ik {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f539a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f539a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(j8 j8Var) {
        return a(j8Var, true, false);
    }

    private static boolean a(j8 j8Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        long jA = j8Var.a();
        long j = -1;
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (jA != -1 && jA <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = jA;
        }
        int i = (int) j2;
        yg ygVar = new yg(64);
        boolean z8 = false;
        int i2 = 0;
        boolean z9 = false;
        while (i2 < i) {
            ygVar.d(8);
            if (!j8Var.b(ygVar.c(), z8 ? 1 : 0, 8, true)) {
                break;
            }
            long jY = ygVar.y();
            int iJ = ygVar.j();
            int i3 = 16;
            if (jY == 1) {
                j8Var.c(ygVar.c(), 8, 8);
                ygVar.e(16);
                jY = ygVar.s();
            } else {
                if (jY == 0) {
                    long jA2 = j8Var.a();
                    if (jA2 != j) {
                        jY = (jA2 - j8Var.d()) + 8;
                    }
                }
                i3 = 8;
            }
            long j3 = i3;
            if (jY < j3) {
                return z8;
            }
            i2 += i3;
            if (iJ == 1836019574) {
                i += (int) jY;
                if (jA != -1 && i > jA) {
                    i = (int) jA;
                }
            } else {
                if (iJ == 1836019558 || iJ == 1836475768) {
                    z3 = z8 ? 1 : 0;
                    z4 = true;
                    z5 = true;
                    break;
                }
                long j4 = jA;
                if ((i2 + jY) - j3 >= i) {
                    z3 = false;
                    z4 = true;
                    break;
                }
                int i4 = (int) (jY - j3);
                i2 += i4;
                if (iJ != 1718909296) {
                    z6 = false;
                    z9 = z9;
                    if (i4 != 0) {
                        j8Var.c(i4);
                        z9 = z9;
                    }
                } else {
                    if (i4 < 8) {
                        return false;
                    }
                    ygVar.d(i4);
                    j8Var.c(ygVar.c(), 0, i4);
                    int i5 = i4 / 4;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            z7 = z9;
                            break;
                        }
                        if (i6 == 1) {
                            ygVar.g(4);
                        } else if (a(ygVar.j(), z2)) {
                            z7 = true;
                            break;
                        }
                        i6++;
                    }
                    z6 = false;
                    z9 = z7;
                    if (!z7) {
                        return false;
                    }
                }
                z8 = z6;
                jA = j4;
            }
            j = -1;
            z9 = z9;
        }
        z3 = z8 ? 1 : 0;
        z4 = true;
        z5 = z3;
        return (z9 && z == z5) ? z4 : z3;
    }

    public static boolean a(j8 j8Var, boolean z) {
        return a(j8Var, false, z);
    }
}
