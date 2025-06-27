package com.bytedance.adsdk.ugeno.component.input;

import android.content.Context;
import android.text.TextUtils;
import android.widget.EditText;
import com.bytedance.adsdk.ugeno.component.mZx;

/* compiled from: UGInputWidget.java */
/* loaded from: classes2.dex */
public class EYQ extends mZx<EditText> {
    private int EYQ;
    private float KR;
    private String Nuq;
    private int OtA;
    private int TQF;
    private String TZn;
    private int VOV;
    private String na;
    private int wa;
    private String xh;

    public EYQ(Context context) {
        super(context);
        this.EYQ = 1;
        this.TQF = Integer.MAX_VALUE;
        this.VOV = 2;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public EditText Td() {
        UGEditText uGEditText = new UGEditText(this.mZx);
        uGEditText.EYQ(this);
        return uGEditText;
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
        ((EditText) this.Kbd).setInputType(this.EYQ);
        ((EditText) this.Kbd).setText(this.Nuq);
        ((EditText) this.Kbd).setTextSize(1, this.KR);
        ((EditText) this.Kbd).setTextColor(this.wa);
        ((EditText) this.Kbd).setLines(this.OtA);
        ((EditText) this.Kbd).setMaxLines(this.TQF);
        ((EditText) this.Kbd).setGravity(this.VOV);
        ((EditText) this.Kbd).setHint(this.xh);
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.EYQ(str, str2);
        str.hashCode();
        switch (str) {
            case "textAlign":
                this.VOV = IPb(str2);
                break;
            case "textColor":
                this.wa = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
            case "textStyle":
                this.na = str2;
                break;
            case "textSize":
                this.KR = Float.parseFloat(str2);
                break;
            case "hint":
                this.xh = str2;
                break;
            case "text":
                this.Nuq = str2;
                break;
            case "lines":
                this.OtA = Integer.parseInt(str2);
                break;
            case "maxLines":
                this.TQF = Integer.parseInt(str2);
                break;
            case "ellipsize":
                this.TZn = str2;
                break;
            case "inputType":
                this.EYQ = Kbd(str2);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int Kbd(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1034364087: goto L33;
                case 3556653: goto L29;
                case 96619420: goto L1f;
                case 106642798: goto L15;
                case 1216985755: goto Lb;
                default: goto La;
            }
        La:
            goto L3d
        Lb:
            java.lang.String r0 = "password"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3d
            r5 = 0
            goto L3e
        L15:
            java.lang.String r0 = "phone"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3d
            r5 = r3
            goto L3e
        L1f:
            java.lang.String r0 = "email"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3d
            r5 = r1
            goto L3e
        L29:
            java.lang.String r0 = "text"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3d
            r5 = 4
            goto L3e
        L33:
            java.lang.String r0 = "number"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3d
            r5 = r2
            goto L3e
        L3d:
            r5 = -1
        L3e:
            if (r5 == 0) goto L4c
            if (r5 == r3) goto L4b
            if (r5 == r2) goto L4a
            if (r5 == r1) goto L47
            return r3
        L47:
            r5 = 32
            return r5
        L4a:
            return r2
        L4b:
            return r1
        L4c:
            r5 = 128(0x80, float:1.794E-43)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.component.input.EYQ.Kbd(java.lang.String):int");
    }

    private int IPb(String str) {
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
}
