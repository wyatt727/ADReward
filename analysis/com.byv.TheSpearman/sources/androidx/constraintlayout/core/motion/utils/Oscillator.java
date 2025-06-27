package androidx.constraintlayout.core.motion.utils;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* loaded from: classes.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    double[] mArea;
    MonotonicCurveFit mCustomCurve;
    String mCustomType;
    int mType;
    float[] mPeriod = new float[0];
    double[] mPosition = new double[0];
    double PI2 = 6.283185307179586d;
    private boolean mNormalized = false;

    public String toString() {
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }

    public void setType(int i, String str) {
        this.mType = i;
        this.mCustomType = str;
        if (str != null) {
            this.mCustomCurve = MonotonicCurveFit.buildWave(str);
        }
    }

    public void addPoint(double d, float f) {
        int length = this.mPeriod.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.mPosition[iBinarySearch] = d;
        this.mPeriod[iBinarySearch] = f;
        this.mNormalized = false;
    }

    public void normalize() {
        int i = 0;
        double d = 0.0d;
        while (true) {
            if (i >= this.mPeriod.length) {
                break;
            }
            d += r7[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr = this.mPeriod;
            if (i2 >= fArr.length) {
                break;
            }
            int i3 = i2 - 1;
            float f = (fArr[i3] + fArr[i2]) / 2.0f;
            double[] dArr = this.mPosition;
            d2 += (dArr[i2] - dArr[i3]) * f;
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr2 = this.mPeriod;
            if (i4 >= fArr2.length) {
                break;
            }
            fArr2[i4] = (float) (fArr2[i4] * (d / d2));
            i4++;
        }
        this.mArea[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr3 = this.mPeriod;
            if (i5 < fArr3.length) {
                int i6 = i5 - 1;
                float f2 = (fArr3[i6] + fArr3[i5]) / 2.0f;
                double[] dArr2 = this.mPosition;
                double d3 = dArr2[i5] - dArr2[i6];
                double[] dArr3 = this.mArea;
                dArr3[i5] = dArr3[i6] + (d3 * f2);
                i5++;
            } else {
                this.mNormalized = true;
                return;
            }
        }
    }

    double getP(double d) {
        if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        int i = (-iBinarySearch) - 1;
        float[] fArr = this.mPeriod;
        int i2 = i - 1;
        double d2 = fArr[i] - fArr[i2];
        double[] dArr = this.mPosition;
        double d3 = d2 / (dArr[i] - dArr[i2]);
        return this.mArea[i2] + ((fArr[i2] - (dArr[i2] * d3)) * (d - dArr[i2])) + ((d3 * ((d * d) - (dArr[i2] * dArr[i2]))) / 2.0d);
    }

    public double getValue(double d, double d2) {
        double dAbs;
        double p = getP(d) + d2;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (p % 1.0d));
            case 2:
                dAbs = Math.abs((((p * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((p * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((p * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.PI2 * (d2 + p));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((p * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.mCustomCurve.getPos(p % 1.0d, 0);
            default:
                return Math.sin(this.PI2 * p);
        }
        return 1.0d - dAbs;
    }

    double getDP(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        int i = (-iBinarySearch) - 1;
        float[] fArr = this.mPeriod;
        int i2 = i - 1;
        double d2 = fArr[i] - fArr[i2];
        double[] dArr = this.mPosition;
        double d3 = d2 / (dArr[i] - dArr[i2]);
        return (fArr[i2] - (d3 * dArr[i2])) + (d * d3);
    }

    public double getSlope(double d, double d2, double d3) {
        double p = d2 + getP(d);
        double dp = getDP(d) + d3;
        switch (this.mType) {
            case 1:
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            case 2:
                return dp * 4.0d * Math.signum((((p * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dp * 2.0d;
            case 4:
                return (-dp) * 2.0d;
            case 5:
                double d4 = this.PI2;
                return (-d4) * dp * Math.sin(d4 * p);
            case 6:
                return dp * 4.0d * ((((p * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.mCustomCurve.getSlope(p % 1.0d, 0);
            default:
                double d5 = this.PI2;
                return dp * d5 * Math.cos(d5 * p);
        }
    }
}
