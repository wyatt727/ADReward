package androidx.constraintlayout.core.motion.utils;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class StepCurve extends Easing {
    private static final boolean DEBUG = false;
    MonotonicCurveFit mCurveFit;

    StepCurve(String str) {
        this.str = str;
        double[] dArr = new double[this.str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.mCurveFit = genSpline(Arrays.copyOf(dArr, i + 1));
    }

    private static MonotonicCurveFit genSpline(String str) {
        String[] strArrSplit = str.split("\\s+");
        int length = strArrSplit.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.parseDouble(strArrSplit[i]);
        }
        return genSpline(dArr);
    }

    private static MonotonicCurveFit genSpline(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = i * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
        System.out.println(" 0 " + monotonicCurveFit.getPos(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0));
        System.out.println(" 1 " + monotonicCurveFit.getPos(1.0d, 0));
        return monotonicCurveFit;
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d) {
        return this.mCurveFit.getSlope(d, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d) {
        return this.mCurveFit.getPos(d, 0);
    }
}
