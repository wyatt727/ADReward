package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.mZx.Td;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: UGTextWidget.java */
/* loaded from: classes2.dex */
public class mZx extends com.bytedance.adsdk.ugeno.component.mZx<TextView> {
    private float Dd;
    private String EYQ;
    private int GfQ;
    private float KR;
    private TextUtils.TruncateAt Nuq;
    private int OtA;
    private int TQF;
    private int TZn;
    private float VEW;
    private int VOV;
    private float by;
    private float dVQ;
    private int na;
    private int wa;
    private float xh;

    public mZx(Context context) {
        super(context);
        this.TQF = Integer.MAX_VALUE;
        this.TZn = 2;
        this.xh = -1.0f;
        this.dVQ = -1.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public TextView Td() {
        UGTextView uGTextView = new UGTextView(this.mZx);
        uGTextView.EYQ(this);
        return uGTextView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, this.EYQ)) {
            this.EYQ = "";
        }
        Kbd(this.EYQ);
        ((TextView) this.Kbd).setTextSize(1, this.KR);
        ((TextView) this.Kbd).setTextColor(this.wa);
        ((TextView) this.Kbd).setLines(this.OtA);
        ((TextView) this.Kbd).setMaxLines(this.TQF);
        ((TextView) this.Kbd).setGravity(this.TZn);
        ((TextView) this.Kbd).setIncludeFontPadding(false);
        Td(this.VOV);
        EYQ(this.Nuq);
        ((TextView) this.Kbd).setTypeface(Typeface.DEFAULT, this.na);
        if (Build.VERSION.SDK_INT >= 28 && this.xh >= 0.0f) {
            ((TextView) this.Kbd).setLineSpacing(0.0f, this.xh);
        }
        ((TextView) this.Kbd).setShadowLayer(this.Dd, this.by, this.VEW, this.GfQ);
    }

    public void Kbd(String str) {
        this.EYQ = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            this.EYQ = "";
        }
        ((TextView) this.Kbd).setText(this.EYQ);
    }

    public void Td(int i) {
        this.VOV = i;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        ((TextView) this.Kbd).setPaintFlags(i);
    }

    public void EYQ(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((TextView) this.Kbd).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.EYQ(str, str2);
        str.hashCode();
        switch (str) {
            case "shadowRadius":
                this.Dd = Td.EYQ(str2, 0.0f);
                break;
            case "shadowColor":
                this.GfQ = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
            case "textAlign":
                this.TZn = QQ(str2);
                break;
            case "textColor":
                this.wa = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
            case "textStyle":
                this.na = VwS(str2);
                break;
            case "textSize":
                this.KR = Td.EYQ(str2, 0.0f);
                break;
            case "textDecoration":
                this.VOV = HX(str2);
                break;
            case "shadowDx":
                this.by = Td.EYQ(str2, 0.0f);
                break;
            case "shadowDy":
                this.VEW = Td.EYQ(str2, 0.0f);
                break;
            case "fontWeight":
                this.dVQ = Td.EYQ(str2, -1.0f);
                break;
            case "lineHeight":
                this.xh = Td.EYQ(str2, 1.0f);
                break;
            case "text":
                this.EYQ = str2;
                break;
            case "lines":
                this.OtA = Td.EYQ(str2, 0);
                break;
            case "maxLines":
                this.TQF = Integer.parseInt(str2);
                break;
            case "ellipsize":
                this.Nuq = IPb(str2);
                break;
        }
    }

    private TextUtils.TruncateAt IPb(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                this.Nuq = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.Nuq = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.Nuq = TextUtils.TruncateAt.START;
                break;
            default:
                this.Nuq = null;
                break;
        }
        return this.Nuq;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int VwS(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = -1178781136(0xffffffffb9bd3a30, float:-3.6092242E-4)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L2b
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r0 == r1) goto L21
            r1 = 3029637(0x2e3a85, float:4.245426E-39)
            if (r0 == r1) goto L17
            goto L35
        L17:
            java.lang.String r0 = "bold"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r2
            goto L36
        L21:
            java.lang.String r0 = "normal"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r3
            goto L36
        L2b:
            java.lang.String r0 = "italic"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L35
            r6 = r4
            goto L36
        L35:
            r6 = -1
        L36:
            if (r6 == 0) goto L3d
            if (r6 == r4) goto L3b
            goto L3e
        L3b:
            r2 = r3
            goto L3e
        L3d:
            r2 = r4
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.text.mZx.VwS(java.lang.String):int");
    }

    private int QQ(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return 17;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return 2;
        }
    }

    private int HX(String str) {
        str.hashCode();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }
}
