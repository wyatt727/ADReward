package com.bytedance.adsdk.ugeno.component.flexbox;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.component.EYQ;
import com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout;

/* compiled from: UGFlexWidget.java */
/* loaded from: classes2.dex */
public class Kbd extends com.bytedance.adsdk.ugeno.component.EYQ<FlexboxLayout> {
    private int KR;
    private int OtA;
    private int TQF;
    private int na;
    private int wa;

    public Kbd(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: Uc, reason: merged with bridge method [inline-methods] */
    public FlexboxLayout Td() {
        FlexboxLayout flexboxLayout = new FlexboxLayout(this.mZx);
        flexboxLayout.EYQ(this);
        return flexboxLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.component.EYQ, com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
        ((FlexboxLayout) this.Kbd).setFlexDirection(this.wa);
        ((FlexboxLayout) this.Kbd).setFlexWrap(this.KR);
        ((FlexboxLayout) this.Kbd).setJustifyContent(this.na);
        ((FlexboxLayout) this.Kbd).setAlignItems(this.TQF);
        ((FlexboxLayout) this.Kbd).setAlignContent(this.OtA);
    }

    @Override // com.bytedance.adsdk.ugeno.component.EYQ
    public EYQ.C0075EYQ QQ() {
        return new EYQ();
    }

    /* compiled from: UGFlexWidget.java */
    public static class EYQ extends EYQ.C0075EYQ {
        public int HX = 1;
        public float tp = 0.0f;
        public float MxO = 0.0f;
        public int tsL = -1;
        public float pi = -1.0f;
        public int nWX = -1;
        public int KO = -1;
        public int hu = ViewCompat.MEASURED_SIZE_MASK;
        public int UB = ViewCompat.MEASURED_SIZE_MASK;

        @Override // com.bytedance.adsdk.ugeno.component.EYQ.C0075EYQ
        public void EYQ(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.EYQ(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasisPercent":
                    this.pi = Pm(str2);
                    break;
                case "order":
                    this.HX = EYQ(str2);
                    break;
                case "flexShrink":
                    this.MxO = Td(str2);
                    break;
                case "flexGrow":
                    this.tp = mZx(str2);
                    break;
                case "alignSelf":
                    this.tsL = Kbd(str2);
                    break;
            }
        }

        private int EYQ(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }

        private float mZx(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float Td(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float Pm(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int Kbd(java.lang.String r8) {
            /*
                r7 = this;
                r8.hashCode()
                int r0 = r8.hashCode()
                r1 = 4
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                r6 = -1
                switch(r0) {
                    case -1881872635: goto L3e;
                    case -1720785339: goto L33;
                    case -1364013995: goto L28;
                    case 1384876188: goto L1d;
                    case 1744442261: goto L12;
                    default: goto L10;
                }
            L10:
                r8 = r6
                goto L48
            L12:
                java.lang.String r0 = "flex_end"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L1b
                goto L10
            L1b:
                r8 = r1
                goto L48
            L1d:
                java.lang.String r0 = "flex_start"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L26
                goto L10
            L26:
                r8 = r2
                goto L48
            L28:
                java.lang.String r0 = "center"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L31
                goto L10
            L31:
                r8 = r3
                goto L48
            L33:
                java.lang.String r0 = "baseline"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L3c
                goto L10
            L3c:
                r8 = r4
                goto L48
            L3e:
                java.lang.String r0 = "stretch"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L47
                goto L10
            L47:
                r8 = r5
            L48:
                switch(r8) {
                    case 0: goto L54;
                    case 1: goto L53;
                    case 2: goto L51;
                    case 3: goto L4f;
                    case 4: goto L4d;
                    default: goto L4b;
                }
            L4b:
                r1 = r6
                goto L54
            L4d:
                r1 = r4
                goto L54
            L4f:
                r1 = r5
                goto L54
            L51:
                r1 = r3
                goto L54
            L53:
                r1 = r2
            L54:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.Kbd.EYQ.Kbd(java.lang.String):int");
        }

        @Override // com.bytedance.adsdk.ugeno.component.EYQ.C0075EYQ
        /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
        public FlexboxLayout.EYQ EYQ() {
            FlexboxLayout.EYQ eyq = new FlexboxLayout.EYQ((int) this.EYQ, (int) this.mZx);
            eyq.leftMargin = (int) this.Pm;
            eyq.rightMargin = (int) this.Kbd;
            eyq.topMargin = (int) this.IPb;
            eyq.bottomMargin = (int) this.VwS;
            eyq.Td(this.HX);
            eyq.Pm(this.tsL);
            eyq.EYQ(this.tp);
            eyq.mZx(this.MxO);
            eyq.Td(this.pi);
            return eyq;
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.EYQ + ", mHeight=" + this.mZx + ", mMargin=" + this.Td + ", mMarginLeft=" + this.Pm + ", mMarginRight=" + this.Kbd + ", mMarginTop=" + this.IPb + ", mMarginBottom=" + this.VwS + ", mParams=" + this.QQ + ", mOrder=" + this.HX + ", mFlexGrow=" + this.tp + ", mFlexShrink=" + this.MxO + ", mAlignSelf=" + this.tsL + ", mFlexBasisPercent=" + this.pi + ", mMinWidth=" + this.nWX + ", mMinHeight=" + this.KO + ", mMaxWidth=" + this.hu + ", mMaxHeight=" + this.UB + "} " + super.toString();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.EYQ(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.TQF = QQ(str2);
                break;
            case "flexDirection":
                this.wa = Kbd(str2);
                break;
            case "alignContent":
                this.OtA = HX(str2);
                break;
            case "flexWrap":
                this.KR = IPb(str2);
                break;
            case "justifyContent":
                this.na = VwS(str2);
                break;
        }
    }

    private int Kbd(String str) {
        str.hashCode();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    private int IPb(String str) {
        str.hashCode();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int VwS(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int QQ(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1881872635: goto L35;
                case -1720785339: goto L2b;
                case -1364013995: goto L21;
                case 1384876188: goto L17;
                case 1744442261: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            java.lang.String r0 = "flex_end"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r5
            goto L40
        L17:
            java.lang.String r0 = "flex_start"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r2
            goto L40
        L21:
            java.lang.String r0 = "center"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r4
            goto L40
        L2b:
            java.lang.String r0 = "baseline"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r3
            goto L40
        L35:
            java.lang.String r0 = "stretch"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L3f
            r7 = r1
            goto L40
        L3f:
            r7 = -1
        L40:
            if (r7 == 0) goto L4c
            if (r7 == r5) goto L4b
            if (r7 == r4) goto L4a
            if (r7 == r3) goto L49
            return r1
        L49:
            return r3
        L4a:
            return r4
        L4b:
            return r5
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.Kbd.QQ(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int HX(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = 5
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1881872635: goto L40;
                case -1364013995: goto L36;
                case -932331738: goto L2c;
                case 1384876188: goto L22;
                case 1682480591: goto L18;
                case 1744442261: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L4a
        Le:
            java.lang.String r0 = "flex_end"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r6
            goto L4b
        L18:
            java.lang.String r0 = "space_between"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r3
            goto L4b
        L22:
            java.lang.String r0 = "flex_start"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r2
            goto L4b
        L2c:
            java.lang.String r0 = "space_around"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r4
            goto L4b
        L36:
            java.lang.String r0 = "center"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r5
            goto L4b
        L40:
            java.lang.String r0 = "stretch"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L4a
            r8 = r1
            goto L4b
        L4a:
            r8 = -1
        L4b:
            if (r8 == 0) goto L5a
            if (r8 == r6) goto L59
            if (r8 == r5) goto L58
            if (r8 == r4) goto L57
            if (r8 == r3) goto L56
            return r1
        L56:
            return r4
        L57:
            return r3
        L58:
            return r5
        L59:
            return r6
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.flexbox.Kbd.HX(java.lang.String):int");
    }
}
