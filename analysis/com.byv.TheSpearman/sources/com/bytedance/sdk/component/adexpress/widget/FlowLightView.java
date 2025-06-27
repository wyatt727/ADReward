package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import com.bytedance.sdk.component.utils.zF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class FlowLightView extends View {
    Rect EYQ;
    private int[] HX;
    private int IPb;
    private final List<EYQ> KO;
    private int Kbd;
    private Paint MxO;
    private int Pm;
    private int QQ;
    private int Td;
    private int VwS;
    Rect mZx;
    private LinearGradient nWX;
    private PorterDuff.Mode pi;
    private Bitmap tp;
    private Xfermode tsL;

    public FlowLightView(Context context) {
        super(context);
        this.pi = PorterDuff.Mode.DST_IN;
        this.KO = new ArrayList();
        EYQ();
    }

    private void EYQ() {
        this.Td = zF.Pm(getContext(), "tt_splash_unlock_image_arrow");
        this.Pm = Color.parseColor("#00ffffff");
        this.Kbd = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.IPb = color;
        this.VwS = 10;
        this.QQ = 40;
        this.HX = new int[]{this.Pm, this.Kbd, color};
        setLayerType(1, null);
        this.MxO = new Paint(1);
        this.tp = BitmapFactory.decodeResource(getResources(), this.Td);
        this.tsL = new PorterDuffXfermode(this.pi);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.tp, this.EYQ, this.mZx, this.MxO);
        canvas.save();
        Iterator<EYQ> it = this.KO.iterator();
        while (it.hasNext()) {
            EYQ next = it.next();
            this.nWX = new LinearGradient(next.mZx, 0.0f, next.mZx + this.QQ, this.VwS, this.HX, (float[]) null, Shader.TileMode.CLAMP);
            this.MxO.setColor(-1);
            this.MxO.setShader(this.nWX);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.MxO);
            this.MxO.setShader(null);
            next.EYQ();
            if (next.mZx > getWidth()) {
                it.remove();
            }
        }
        this.MxO.setXfermode(this.tsL);
        canvas.drawBitmap(this.tp, this.EYQ, this.mZx, this.MxO);
        this.MxO.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.tp == null) {
            return;
        }
        this.EYQ = new Rect(0, 0, this.tp.getWidth(), this.tp.getHeight());
        this.mZx = new Rect(0, 0, getWidth(), getHeight());
    }

    public void EYQ(int i) {
        this.KO.add(new EYQ(i));
        postInvalidate();
    }

    public static class EYQ {
        private final int EYQ;
        private int mZx = 0;

        public EYQ(int i) {
            this.EYQ = i;
        }

        public void EYQ() {
            this.mZx += this.EYQ;
        }
    }
}
