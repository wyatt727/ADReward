package androidx.core.content.res;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes.dex */
final class ViewingConditions {
    static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((CamUtils.yFromLStar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    float getAw() {
        return this.mAw;
    }

    float getN() {
        return this.mN;
    }

    float getNbb() {
        return this.mNbb;
    }

    float getNcb() {
        return this.mNcb;
    }

    float getC() {
        return this.mC;
    }

    float getNc() {
        return this.mNc;
    }

    float[] getRgbD() {
        return this.mRgbD;
    }

    float getFl() {
        return this.mFl;
    }

    float getFlRoot() {
        return this.mFlRoot;
    }

    float getZ() {
        return this.mZ;
    }

    private ViewingConditions(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.mN = f;
        this.mAw = f2;
        this.mNbb = f3;
        this.mNcb = f4;
        this.mC = f5;
        this.mNc = f6;
        this.mRgbD = fArr;
        this.mFl = f7;
        this.mFlRoot = f8;
        this.mZ = f9;
    }

    static ViewingConditions make(float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f4 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f5 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f6 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f7 = (f3 / 10.0f) + 0.8f;
        float fLerp = ((double) f7) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f7 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f7 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f7;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            fExp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f4) * fExp) + 1.0f) - fExp, (((100.0f / f5) * fExp) + 1.0f) - fExp, (((100.0f / f6) * fExp) + 1.0f) - fExp};
        float f8 = 1.0f / ((5.0f * f) + 1.0f);
        float f9 = f8 * f8 * f8 * f8;
        float f10 = 1.0f - f9;
        float fCbrt = (f9 * f) + (0.1f * f10 * f10 * ((float) Math.cbrt(f * 5.0d)));
        float fYFromLStar = CamUtils.yFromLStar(f2) / fArr[1];
        double d2 = fYFromLStar;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * fCbrt) * f4) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * fCbrt) * f5) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * fCbrt) * f6) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new ViewingConditions(fYFromLStar, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * fPow, fPow, fPow, fLerp, f7, fArr3, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }
}
