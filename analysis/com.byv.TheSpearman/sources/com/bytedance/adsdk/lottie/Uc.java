package com.bytedance.adsdk.lottie;

/* compiled from: RenderMode.java */
/* loaded from: classes2.dex */
public enum Uc {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* compiled from: RenderMode.java */
    /* renamed from: com.bytedance.adsdk.lottie.Uc$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] EYQ;

        static {
            int[] iArr = new int[Uc.values().length];
            EYQ = iArr;
            try {
                iArr[Uc.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EYQ[Uc.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EYQ[Uc.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean EYQ(int i, boolean z, int i2) {
        int i3 = AnonymousClass1.EYQ[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
