package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class LottieAnimationView extends ImageView {
    private static final String EYQ = "LottieAnimationView";
    private static final tp<Throwable> mZx = new tp<Throwable>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.1
        @Override // com.bytedance.adsdk.lottie.tp
        public void EYQ(Throwable th) {
            com.bytedance.adsdk.lottie.IPb.IPb.EYQ(th);
        }
    };
    private int HX;
    private int IPb;
    private final Set<Object> KO;
    private tp<Throwable> Kbd;
    private boolean MxO;
    private final tp<Throwable> Pm;
    private String QQ;
    private final tp<IPb> Td;
    private IPb UB;
    private final QQ VwS;
    private tsL<IPb> hu;
    private final Set<mZx> nWX;
    private boolean pi;
    private com.bytedance.adsdk.ugeno.mZx tp;
    private boolean tsL;

    private enum mZx {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.Td = new tp<IPb>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.2
            @Override // com.bytedance.adsdk.lottie.tp
            public void EYQ(IPb iPb) {
                LottieAnimationView.this.setComposition(iPb);
            }
        };
        this.Pm = new tp<Throwable>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.3
            @Override // com.bytedance.adsdk.lottie.tp
            public void EYQ(Throwable th) {
                if (LottieAnimationView.this.IPb != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(lottieAnimationView.IPb);
                }
                (LottieAnimationView.this.Kbd == null ? LottieAnimationView.mZx : LottieAnimationView.this.Kbd).EYQ(th);
            }
        };
        this.IPb = 0;
        this.VwS = new QQ();
        this.MxO = false;
        this.tsL = false;
        this.pi = true;
        this.nWX = new HashSet();
        this.KO = new HashSet();
        IPb();
    }

    public void EYQ(com.bytedance.adsdk.ugeno.mZx mzx) {
        this.tp = mzx;
    }

    private void IPb() {
        setSaveEnabled(false);
        this.pi = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        EYQ(0.0f, false);
        EYQ(false);
        setIgnoreDisabledSystemAnimations(false);
        this.VwS.EYQ(Boolean.valueOf(com.bytedance.adsdk.lottie.IPb.IPb.EYQ(getContext()) != 0.0f));
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        VwS();
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        VwS();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        VwS();
        super.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        QQ qq;
        if (!this.MxO && drawable == (qq = this.VwS) && qq.Uc()) {
            Pm();
        } else if (!this.MxO && (drawable instanceof QQ)) {
            QQ qq2 = (QQ) drawable;
            if (qq2.Uc()) {
                qq2.tPj();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof QQ) && ((QQ) drawable).Kbd() == Uc.SOFTWARE) {
            this.VwS.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        QQ qq = this.VwS;
        if (drawable2 == qq) {
            super.invalidateDrawable(qq);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        EYQ eyq = new EYQ(super.onSaveInstanceState());
        eyq.EYQ = this.QQ;
        eyq.mZx = this.HX;
        eyq.Td = this.VwS.wBa();
        eyq.Pm = this.VwS.hYh();
        eyq.Kbd = this.VwS.Td();
        eyq.IPb = this.VwS.hu();
        eyq.VwS = this.VwS.UB();
        return eyq;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof EYQ)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        EYQ eyq = (EYQ) parcelable;
        super.onRestoreInstanceState(eyq.getSuperState());
        this.QQ = eyq.EYQ;
        if (!this.nWX.contains(mZx.SET_ANIMATION) && !TextUtils.isEmpty(this.QQ)) {
            setAnimation(this.QQ);
        }
        this.HX = eyq.mZx;
        if (!this.nWX.contains(mZx.SET_ANIMATION) && (i = this.HX) != 0) {
            setAnimation(i);
        }
        if (!this.nWX.contains(mZx.SET_PROGRESS)) {
            EYQ(eyq.Td, false);
        }
        if (!this.nWX.contains(mZx.PLAY_OPTION) && eyq.Pm) {
            EYQ();
        }
        if (!this.nWX.contains(mZx.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(eyq.Kbd);
        }
        if (!this.nWX.contains(mZx.SET_REPEAT_MODE)) {
            setRepeatMode(eyq.IPb);
        }
        if (this.nWX.contains(mZx.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(eyq.VwS);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.tsL) {
            this.VwS.HX();
        }
        com.bytedance.adsdk.ugeno.mZx mzx = this.tp;
        if (mzx != null) {
            mzx.IPb();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mZx mzx = this.tp;
        if (mzx != null) {
            mzx.IPb();
        }
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.VwS.QQ(z);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.VwS.HX(z);
    }

    public void EYQ(boolean z) {
        this.VwS.EYQ(z);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.VwS.mZx(z);
    }

    public boolean getClipToCompositionBounds() {
        return this.VwS.mZx();
    }

    public void setCacheComposition(boolean z) {
        this.pi = z;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.VwS.Kbd(z);
    }

    public void setAnimation(int i) {
        this.HX = i;
        this.QQ = null;
        setCompositionTask(EYQ(i));
    }

    private tsL<IPb> EYQ(final int i) {
        if (isInEditMode()) {
            return new tsL<>(new Callable<MxO<IPb>>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.4
                @Override // java.util.concurrent.Callable
                /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
                public MxO<IPb> call() throws Exception {
                    return LottieAnimationView.this.pi ? VwS.mZx(LottieAnimationView.this.getContext(), i) : VwS.mZx(LottieAnimationView.this.getContext(), i, (String) null);
                }
            }, true);
        }
        return this.pi ? VwS.EYQ(getContext(), i) : VwS.EYQ(getContext(), i, (String) null);
    }

    public void setAnimation(String str) {
        this.QQ = str;
        this.HX = 0;
        setCompositionTask(EYQ(str));
    }

    private tsL<IPb> EYQ(final String str) {
        if (isInEditMode()) {
            return new tsL<>(new Callable<MxO<IPb>>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.5
                @Override // java.util.concurrent.Callable
                /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
                public MxO<IPb> call() throws Exception {
                    return LottieAnimationView.this.pi ? VwS.Td(LottieAnimationView.this.getContext(), str) : VwS.Td(LottieAnimationView.this.getContext(), str, null);
                }
            }, true);
        }
        return this.pi ? VwS.mZx(getContext(), str) : VwS.mZx(getContext(), str, (String) null);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        EYQ(str, (String) null);
    }

    public void EYQ(String str, String str2) {
        EYQ(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void EYQ(InputStream inputStream, String str) {
        setCompositionTask(VwS.EYQ(inputStream, str));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.pi ? VwS.EYQ(getContext(), str) : VwS.EYQ(getContext(), str, (String) null));
    }

    public void setFailureListener(tp<Throwable> tpVar) {
        this.Kbd = tpVar;
    }

    public void setFallbackResource(int i) {
        this.IPb = i;
    }

    private void setCompositionTask(tsL<IPb> tsl) {
        this.nWX.add(mZx.SET_ANIMATION);
        QQ();
        VwS();
        this.hu = tsl.EYQ(this.Td).Td(this.Pm);
    }

    private void VwS() {
        tsL<IPb> tsl = this.hu;
        if (tsl != null) {
            tsl.mZx(this.Td);
            this.hu.Pm(this.Pm);
        }
    }

    public void setComposition(IPb iPb) {
        if (Kbd.EYQ) {
            Log.v(EYQ, "Set Composition \n".concat(String.valueOf(iPb)));
        }
        this.VwS.setCallback(this);
        this.UB = iPb;
        this.MxO = true;
        boolean zEYQ = this.VwS.EYQ(iPb);
        this.MxO = false;
        if (getDrawable() != this.VwS || zEYQ) {
            if (!zEYQ) {
                HX();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.KO.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public IPb getComposition() {
        return this.UB;
    }

    public void EYQ() {
        this.nWX.add(mZx.PLAY_OPTION);
        this.VwS.HX();
    }

    public void setMinFrame(int i) {
        this.VwS.EYQ(i);
    }

    public float getMinFrame() {
        return this.VwS.tsL();
    }

    public void setMinProgress(float f) {
        this.VwS.EYQ(f);
    }

    public void setMaxFrame(int i) {
        this.VwS.mZx(i);
    }

    public float getMaxFrame() {
        return this.VwS.pi();
    }

    public void setMaxProgress(float f) {
        this.VwS.mZx(f);
    }

    public void setMinFrame(String str) {
        this.VwS.mZx(str);
    }

    public void setMaxFrame(String str) {
        this.VwS.Td(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.VwS.Pm(str);
    }

    public void setSpeed(float f) {
        this.VwS.Td(f);
    }

    public float getSpeed() {
        return this.VwS.nWX();
    }

    @Deprecated
    public void mZx(boolean z) {
        this.VwS.Kbd(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.nWX.add(mZx.SET_REPEAT_MODE);
        this.VwS.Pm(i);
    }

    public int getRepeatMode() {
        return this.VwS.hu();
    }

    public void setRepeatCount(int i) {
        this.nWX.add(mZx.SET_REPEAT_COUNT);
        this.VwS.Kbd(i);
    }

    public int getRepeatCount() {
        return this.VwS.UB();
    }

    public boolean mZx() {
        return this.VwS.Uc();
    }

    public void setImageAssetsFolder(String str) {
        this.VwS.EYQ(str);
    }

    public String getImageAssetsFolder() {
        return this.VwS.Td();
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.VwS.Td(z);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.VwS.Pm();
    }

    public Bitmap EYQ(String str, Bitmap bitmap) {
        return this.VwS.EYQ(str, bitmap);
    }

    public void setImageAssetDelegate(Pm pm) {
        this.VwS.EYQ(pm);
    }

    public void setDefaultFontFileExtension(String str) {
        this.VwS.VwS(str);
    }

    public void setFontAssetDelegate(Td td) {
        this.VwS.EYQ(td);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.VwS.EYQ(map);
    }

    public void setTextDelegate(hYh hyh) {
        this.VwS.EYQ(hyh);
    }

    public void Td() {
        this.nWX.add(mZx.PLAY_OPTION);
        this.VwS.NZ();
    }

    public void Pm() {
        this.tsL = false;
        this.VwS.tPj();
    }

    public void setFrame(int i) {
        this.VwS.Td(i);
    }

    public int getFrame() {
        return this.VwS.KO();
    }

    public void setProgress(float f) {
        EYQ(f, true);
    }

    private void EYQ(float f, boolean z) {
        if (z) {
            this.nWX.add(mZx.SET_PROGRESS);
        }
        this.VwS.Pm(f);
    }

    public float getProgress() {
        return this.VwS.wBa();
    }

    public long getDuration() {
        IPb iPb = this.UB;
        if (iPb != null) {
            return (long) iPb.Kbd();
        }
        return 0L;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.VwS.Pm(z);
    }

    public UB getPerformanceTracker() {
        return this.VwS.IPb();
    }

    private void QQ() {
        this.UB = null;
        this.VwS.QQ();
    }

    public void setSafeMode(boolean z) {
        this.VwS.VwS(z);
    }

    public void setRenderMode(Uc uc) {
        this.VwS.EYQ(uc);
    }

    public Uc getRenderMode() {
        return this.VwS.Kbd();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.VwS.IPb(z);
    }

    private void HX() {
        boolean zMZx = mZx();
        setImageDrawable(null);
        setImageDrawable(this.VwS);
        if (zMZx) {
            this.VwS.MxO();
        }
    }

    private static class EYQ extends View.BaseSavedState {
        public static final Parcelable.Creator<EYQ> CREATOR = new Parcelable.Creator<EYQ>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.EYQ.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public EYQ createFromParcel(Parcel parcel) {
                return new EYQ(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public EYQ[] newArray(int i) {
                return new EYQ[i];
            }
        };
        String EYQ;
        int IPb;
        String Kbd;
        boolean Pm;
        float Td;
        int VwS;
        int mZx;

        EYQ(Parcelable parcelable) {
            super(parcelable);
        }

        private EYQ(Parcel parcel) {
            super(parcel);
            this.EYQ = parcel.readString();
            this.Td = parcel.readFloat();
            this.Pm = parcel.readInt() == 1;
            this.Kbd = parcel.readString();
            this.IPb = parcel.readInt();
            this.VwS = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.EYQ);
            parcel.writeFloat(this.Td);
            parcel.writeInt(this.Pm ? 1 : 0);
            parcel.writeString(this.Kbd);
            parcel.writeInt(this.IPb);
            parcel.writeInt(this.VwS);
        }
    }
}
