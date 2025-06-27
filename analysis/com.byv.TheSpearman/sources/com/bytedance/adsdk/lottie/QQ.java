package com.bytedance.adsdk.lottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.lottie.Kbd.XN;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LottieDrawable.java */
/* loaded from: classes2.dex */
public class QQ extends Drawable implements Animatable, Drawable.Callback {
    String EYQ;
    private Rect FH;
    private Rect FtN;
    private mZx HX;
    private boolean IPb;
    private com.bytedance.adsdk.lottie.mZx.EYQ KO;
    private Matrix Kbc;
    private final com.bytedance.adsdk.lottie.IPb.Td Kbd;
    private final ValueAnimator.AnimatorUpdateListener MxO;
    private boolean NZ;
    private Canvas Nvm;
    private Rect PI;
    private Matrix Pf;
    private IPb Pm;
    private boolean QQ;
    hYh Td;
    private Paint Tnp;
    private boolean UB;
    private boolean Uc;
    private boolean VwS;
    private int WU;
    private boolean XN;
    private boolean hYh;
    private Map<String, Typeface> hu;
    private RectF kf;
    private final Matrix lEs;
    private RectF mN;
    Td mZx;
    private Pm nWX;
    private String pi;
    private boolean rfB;
    private boolean tPj;
    private final ArrayList<EYQ> tp;
    private RectF tr;
    private com.bytedance.adsdk.lottie.mZx.mZx tsL;
    private boolean vD;
    private Uc wBa;
    private Bitmap xt;
    private com.bytedance.adsdk.lottie.Td.Td.mZx zF;

    /* compiled from: LottieDrawable.java */
    private interface EYQ {
        void EYQ(IPb iPb);
    }

    /* compiled from: LottieDrawable.java */
    private enum mZx {
        NONE,
        PLAY,
        RESUME
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public QQ() {
        com.bytedance.adsdk.lottie.IPb.Td td = new com.bytedance.adsdk.lottie.IPb.Td();
        this.Kbd = td;
        this.IPb = true;
        this.VwS = false;
        this.QQ = false;
        this.HX = mZx.NONE;
        this.tp = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lottie.QQ.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (QQ.this.zF != null) {
                    QQ.this.zF.EYQ(QQ.this.Kbd.IPb());
                }
            }
        };
        this.MxO = animatorUpdateListener;
        this.Uc = false;
        this.hYh = true;
        this.WU = 255;
        this.wBa = Uc.AUTOMATIC;
        this.rfB = false;
        this.lEs = new Matrix();
        this.vD = false;
        td.addUpdateListener(animatorUpdateListener);
    }

    public boolean EYQ() {
        return this.UB;
    }

    public void EYQ(boolean z) {
        if (this.UB != z && Build.VERSION.SDK_INT >= 19) {
            this.UB = z;
            if (this.Pm != null) {
                lEs();
            }
        }
    }

    public void mZx(boolean z) {
        if (z != this.hYh) {
            this.hYh = z;
            com.bytedance.adsdk.lottie.Td.Td.mZx mzx = this.zF;
            if (mzx != null) {
                mzx.mZx(z);
            }
            invalidateSelf();
        }
    }

    public boolean mZx() {
        return this.hYh;
    }

    public void EYQ(String str) {
        this.pi = str;
    }

    public String Td() {
        return this.pi;
    }

    public void Td(boolean z) {
        this.Uc = z;
    }

    public boolean Pm() {
        return this.Uc;
    }

    public boolean EYQ(IPb iPb) {
        if (this.Pm == iPb) {
            return false;
        }
        this.vD = true;
        QQ();
        this.Pm = iPb;
        lEs();
        this.Kbd.EYQ(iPb);
        Pm(this.Kbd.getAnimatedFraction());
        Iterator it = new ArrayList(this.tp).iterator();
        while (it.hasNext()) {
            EYQ eyq = (EYQ) it.next();
            if (eyq != null) {
                eyq.EYQ(iPb);
            }
            it.remove();
        }
        this.tp.clear();
        iPb.mZx(this.XN);
        rfB();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void EYQ(Uc uc) {
        this.wBa = uc;
        rfB();
    }

    public Uc Kbd() {
        return this.rfB ? Uc.SOFTWARE : Uc.HARDWARE;
    }

    private void rfB() {
        IPb iPb = this.Pm;
        if (iPb == null) {
            return;
        }
        this.rfB = this.wBa.EYQ(Build.VERSION.SDK_INT, iPb.EYQ(), iPb.mZx());
    }

    public void Pm(boolean z) {
        this.XN = z;
        IPb iPb = this.Pm;
        if (iPb != null) {
            iPb.mZx(z);
        }
    }

    public void Kbd(boolean z) {
        if (this.NZ == z) {
            return;
        }
        this.NZ = z;
        com.bytedance.adsdk.lottie.Td.Td.mZx mzx = this.zF;
        if (mzx != null) {
            mzx.EYQ(z);
        }
    }

    public UB IPb() {
        IPb iPb = this.Pm;
        if (iPb != null) {
            return iPb.Td();
        }
        return null;
    }

    public void IPb(boolean z) {
        this.tPj = z;
    }

    public boolean VwS() {
        return this.tPj;
    }

    private void lEs() {
        IPb iPb = this.Pm;
        if (iPb == null) {
            return;
        }
        com.bytedance.adsdk.lottie.Td.Td.mZx mzx = new com.bytedance.adsdk.lottie.Td.Td.mZx(this, XN.EYQ(iPb), iPb.HX(), iPb);
        this.zF = mzx;
        if (this.NZ) {
            mzx.EYQ(true);
        }
        this.zF.mZx(this.hYh);
    }

    public void QQ() {
        if (this.Kbd.isRunning()) {
            this.Kbd.cancel();
            if (!isVisible()) {
                this.HX = mZx.NONE;
            }
        }
        this.Pm = null;
        this.zF = null;
        this.tsL = null;
        this.Kbd.QQ();
        invalidateSelf();
    }

    public void VwS(boolean z) {
        this.QQ = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.vD) {
            return;
        }
        this.vD = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.WU = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.WU;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Kbd.EYQ("Drawable#draw");
        if (this.QQ) {
            try {
                if (this.rfB) {
                    EYQ(canvas, this.zF);
                } else {
                    EYQ(canvas);
                }
            } catch (Throwable unused) {
            }
        } else if (this.rfB) {
            EYQ(canvas, this.zF);
        } else {
            EYQ(canvas);
        }
        this.vD = false;
        Kbd.mZx("Drawable#draw");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        HX();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        tp();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return Uc();
    }

    public void HX() {
        if (this.zF == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.6
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb) {
                    QQ.this.HX();
                }
            });
            return;
        }
        rfB();
        if (xt() || UB() == 0) {
            if (isVisible()) {
                this.Kbd.MxO();
                this.HX = mZx.NONE;
            } else {
                this.HX = mZx.PLAY;
            }
        }
        if (xt()) {
            return;
        }
        Td((int) (nWX() < 0.0f ? tsL() : pi()));
        this.Kbd.tsL();
        if (isVisible()) {
            return;
        }
        this.HX = mZx.NONE;
    }

    public void tp() {
        this.tp.clear();
        this.Kbd.tsL();
        if (isVisible()) {
            return;
        }
        this.HX = mZx.NONE;
    }

    public void MxO() {
        if (this.zF == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.7
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb) {
                    QQ.this.MxO();
                }
            });
            return;
        }
        rfB();
        if (xt() || UB() == 0) {
            if (isVisible()) {
                this.Kbd.nWX();
                this.HX = mZx.NONE;
            } else {
                this.HX = mZx.RESUME;
            }
        }
        if (xt()) {
            return;
        }
        Td((int) (nWX() < 0.0f ? tsL() : pi()));
        this.Kbd.tsL();
        if (isVisible()) {
            return;
        }
        this.HX = mZx.NONE;
    }

    public void EYQ(final int i) {
        if (this.Pm == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.8
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb) {
                    QQ.this.EYQ(i);
                }
            });
        } else {
            this.Kbd.EYQ(i);
        }
    }

    public float tsL() {
        return this.Kbd.KO();
    }

    public void EYQ(final float f) {
        IPb iPb = this.Pm;
        if (iPb == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.9
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb2) {
                    QQ.this.EYQ(f);
                }
            });
        } else {
            EYQ((int) com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(iPb.IPb(), this.Pm.VwS(), f));
        }
    }

    public void mZx(final int i) {
        if (this.Pm == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.10
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb) {
                    QQ.this.mZx(i);
                }
            });
        } else {
            this.Kbd.mZx(i + 0.99f);
        }
    }

    public float pi() {
        return this.Kbd.hu();
    }

    public void mZx(final float f) {
        IPb iPb = this.Pm;
        if (iPb == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.11
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb2) {
                    QQ.this.mZx(f);
                }
            });
        } else {
            this.Kbd.mZx(com.bytedance.adsdk.lottie.IPb.Kbd.EYQ(iPb.IPb(), this.Pm.VwS(), f));
        }
    }

    public void mZx(final String str) {
        IPb iPb = this.Pm;
        if (iPb == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.12
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb2) {
                    QQ.this.mZx(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.Td.IPb iPbTd = iPb.Td(str);
        if (iPbTd == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        EYQ((int) iPbTd.EYQ);
    }

    public void Td(final String str) {
        IPb iPb = this.Pm;
        if (iPb == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.13
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb2) {
                    QQ.this.Td(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.Td.IPb iPbTd = iPb.Td(str);
        if (iPbTd == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        mZx((int) (iPbTd.EYQ + iPbTd.mZx));
    }

    public void Pm(final String str) {
        IPb iPb = this.Pm;
        if (iPb == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.2
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb2) {
                    QQ.this.Pm(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.Td.IPb iPbTd = iPb.Td(str);
        if (iPbTd == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) iPbTd.EYQ;
        EYQ(i, ((int) iPbTd.mZx) + i);
    }

    public void EYQ(final int i, final int i2) {
        if (this.Pm == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.3
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb) {
                    QQ.this.EYQ(i, i2);
                }
            });
        } else {
            this.Kbd.EYQ(i, i2 + 0.99f);
        }
    }

    public void Td(float f) {
        this.Kbd.Td(f);
    }

    public float nWX() {
        return this.Kbd.tp();
    }

    public void Td(final int i) {
        if (this.Pm == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.4
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb) {
                    QQ.this.Td(i);
                }
            });
        } else {
            this.Kbd.EYQ(i);
        }
    }

    public int KO() {
        return (int) this.Kbd.VwS();
    }

    public void Pm(final float f) {
        if (this.Pm == null) {
            this.tp.add(new EYQ() { // from class: com.bytedance.adsdk.lottie.QQ.5
                @Override // com.bytedance.adsdk.lottie.QQ.EYQ
                public void EYQ(IPb iPb) {
                    QQ.this.Pm(f);
                }
            });
            return;
        }
        Kbd.EYQ("Drawable#setProgress");
        this.Kbd.EYQ(this.Pm.EYQ(f));
        Kbd.mZx("Drawable#setProgress");
    }

    public void Pm(int i) {
        this.Kbd.setRepeatMode(i);
    }

    public int hu() {
        return this.Kbd.getRepeatMode();
    }

    public void Kbd(int i) {
        this.Kbd.setRepeatCount(i);
    }

    public int UB() {
        return this.Kbd.getRepeatCount();
    }

    public boolean Uc() {
        com.bytedance.adsdk.lottie.IPb.Td td = this.Kbd;
        if (td == null) {
            return false;
        }
        return td.isRunning();
    }

    boolean hYh() {
        if (isVisible()) {
            return this.Kbd.isRunning();
        }
        return this.HX == mZx.PLAY || this.HX == mZx.RESUME;
    }

    private boolean xt() {
        return this.IPb || this.VwS;
    }

    public void EYQ(Boolean bool) {
        this.IPb = bool.booleanValue();
    }

    public void QQ(boolean z) {
        this.VwS = z;
    }

    public void HX(boolean z) {
        this.Kbd.Td(z);
    }

    public void EYQ(Pm pm) {
        this.nWX = pm;
        com.bytedance.adsdk.lottie.mZx.mZx mzx = this.tsL;
        if (mzx != null) {
            mzx.EYQ(pm);
        }
    }

    public void EYQ(Td td) {
        this.mZx = td;
        com.bytedance.adsdk.lottie.mZx.EYQ eyq = this.KO;
        if (eyq != null) {
            eyq.EYQ(td);
        }
    }

    public void EYQ(Map<String, Typeface> map) {
        if (map == this.hu) {
            return;
        }
        this.hu = map;
        invalidateSelf();
    }

    public void EYQ(hYh hyh) {
        this.Td = hyh;
    }

    public hYh zF() {
        return this.Td;
    }

    public boolean WU() {
        return this.hu == null && this.Td == null && this.Pm.tp().size() > 0;
    }

    public IPb XN() {
        return this.Pm;
    }

    public void NZ() {
        this.tp.clear();
        this.Kbd.cancel();
        if (isVisible()) {
            return;
        }
        this.HX = mZx.NONE;
    }

    public void tPj() {
        this.tp.clear();
        this.Kbd.pi();
        if (isVisible()) {
            return;
        }
        this.HX = mZx.NONE;
    }

    public float wBa() {
        return this.Kbd.IPb();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IPb iPb = this.Pm;
        if (iPb == null) {
            return -1;
        }
        return iPb.Pm().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IPb iPb = this.Pm;
        if (iPb == null) {
            return -1;
        }
        return iPb.Pm().height();
    }

    public Bitmap EYQ(String str, Bitmap bitmap) {
        com.bytedance.adsdk.lottie.mZx.mZx mzxNvm = Nvm();
        if (mzxNvm == null) {
            return null;
        }
        Bitmap bitmapEYQ = mzxNvm.EYQ(str, bitmap);
        invalidateSelf();
        return bitmapEYQ;
    }

    public Bitmap Kbd(String str) {
        com.bytedance.adsdk.lottie.mZx.mZx mzxNvm = Nvm();
        if (mzxNvm != null) {
            return mzxNvm.EYQ(str);
        }
        return null;
    }

    public HX IPb(String str) {
        IPb iPb = this.Pm;
        if (iPb == null) {
            return null;
        }
        return iPb.tsL().get(str);
    }

    private com.bytedance.adsdk.lottie.mZx.mZx Nvm() {
        com.bytedance.adsdk.lottie.mZx.mZx mzx = this.tsL;
        if (mzx != null && !mzx.EYQ(tr())) {
            this.tsL = null;
        }
        if (this.tsL == null) {
            this.tsL = new com.bytedance.adsdk.lottie.mZx.mZx(getCallback(), this.pi, this.nWX, this.Pm.tsL());
        }
        return this.tsL;
    }

    public Typeface EYQ(com.bytedance.adsdk.lottie.Td.Td td) {
        Map<String, Typeface> map = this.hu;
        if (map != null) {
            String strEYQ = td.EYQ();
            if (map.containsKey(strEYQ)) {
                return map.get(strEYQ);
            }
            String strMZx = td.mZx();
            if (map.containsKey(strMZx)) {
                return map.get(strMZx);
            }
            String str = td.EYQ() + "-" + td.Td();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.lottie.mZx.EYQ eyqFH = FH();
        if (eyqFH != null) {
            return eyqFH.EYQ(td);
        }
        return null;
    }

    private com.bytedance.adsdk.lottie.mZx.EYQ FH() {
        if (getCallback() == null) {
            return null;
        }
        if (this.KO == null) {
            com.bytedance.adsdk.lottie.mZx.EYQ eyq = new com.bytedance.adsdk.lottie.mZx.EYQ(getCallback(), this.mZx);
            this.KO = eyq;
            String str = this.EYQ;
            if (str != null) {
                eyq.EYQ(str);
            }
        }
        return this.KO;
    }

    public void VwS(String str) {
        this.EYQ = str;
        com.bytedance.adsdk.lottie.mZx.EYQ eyqFH = FH();
        if (eyqFH != null) {
            eyqFH.EYQ(str);
        }
    }

    private Context tr() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            if (this.HX == mZx.PLAY) {
                HX();
            } else if (this.HX == mZx.RESUME) {
                MxO();
            }
        } else if (this.Kbd.isRunning()) {
            tPj();
            this.HX = mZx.RESUME;
        } else if (!z3) {
            this.HX = mZx.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    private void EYQ(Canvas canvas) {
        com.bytedance.adsdk.lottie.Td.Td.mZx mzx = this.zF;
        IPb iPb = this.Pm;
        if (mzx == null || iPb == null) {
            return;
        }
        this.lEs.reset();
        if (!getBounds().isEmpty()) {
            this.lEs.preScale(r2.width() / iPb.Pm().width(), r2.height() / iPb.Pm().height());
            this.lEs.preTranslate(r2.left, r2.top);
        }
        mzx.EYQ(canvas, this.lEs, this.WU);
    }

    private void EYQ(Canvas canvas, com.bytedance.adsdk.lottie.Td.Td.mZx mzx) {
        if (this.Pm == null || mzx == null) {
            return;
        }
        Tnp();
        canvas.getMatrix(this.Kbc);
        canvas.getClipBounds(this.FH);
        EYQ(this.FH, this.tr);
        this.Kbc.mapRect(this.tr);
        EYQ(this.tr, this.FH);
        if (this.hYh) {
            this.mN.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            mzx.EYQ(this.mN, (Matrix) null, false);
        }
        this.Kbc.mapRect(this.mN);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        EYQ(this.mN, fWidth, fHeight);
        if (!FtN()) {
            this.mN.intersect(this.FH.left, this.FH.top, this.FH.right, this.FH.bottom);
        }
        int iCeil = (int) Math.ceil(this.mN.width());
        int iCeil2 = (int) Math.ceil(this.mN.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        mZx(iCeil, iCeil2);
        if (this.vD) {
            this.lEs.set(this.Kbc);
            this.lEs.preScale(fWidth, fHeight);
            this.lEs.postTranslate(-this.mN.left, -this.mN.top);
            this.xt.eraseColor(0);
            mzx.EYQ(this.Nvm, this.lEs, this.WU);
            this.Kbc.invert(this.Pf);
            this.Pf.mapRect(this.kf, this.mN);
            EYQ(this.kf, this.PI);
        }
        this.FtN.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.xt, this.FtN, this.PI, this.Tnp);
    }

    private void Tnp() {
        if (this.Nvm != null) {
            return;
        }
        this.Nvm = new Canvas();
        this.mN = new RectF();
        this.Kbc = new Matrix();
        this.Pf = new Matrix();
        this.FH = new Rect();
        this.tr = new RectF();
        this.Tnp = new com.bytedance.adsdk.lottie.EYQ.EYQ();
        this.FtN = new Rect();
        this.PI = new Rect();
        this.kf = new RectF();
    }

    private void mZx(int i, int i2) {
        Bitmap bitmap = this.xt;
        if (bitmap == null || bitmap.getWidth() < i || this.xt.getHeight() < i2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.xt = bitmapCreateBitmap;
            this.Nvm.setBitmap(bitmapCreateBitmap);
            this.vD = true;
            return;
        }
        if (this.xt.getWidth() > i || this.xt.getHeight() > i2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.xt, 0, 0, i, i2);
            this.xt = bitmapCreateBitmap2;
            this.Nvm.setBitmap(bitmapCreateBitmap2);
            this.vD = true;
        }
    }

    private void EYQ(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void EYQ(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void EYQ(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private boolean FtN() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return Build.VERSION.SDK_INT >= 18 && (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }
}
