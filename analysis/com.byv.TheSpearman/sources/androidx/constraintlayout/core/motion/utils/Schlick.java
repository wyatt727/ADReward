package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class Schlick extends Easing {
    private static final boolean DEBUG = false;
    double eps;
    double mS;
    double mT;

    Schlick(String str) {
        this.str = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.mS = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        this.mT = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double func(double d) {
        double d2 = this.mT;
        if (d < d2) {
            return (d2 * d) / (d + (this.mS * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.mS * (d2 - d)));
    }

    private double dfunc(double d) {
        double d2 = this.mT;
        if (d < d2) {
            double d3 = this.mS;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.mS;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d) {
        return dfunc(d);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d) {
        return func(d);
    }
}
