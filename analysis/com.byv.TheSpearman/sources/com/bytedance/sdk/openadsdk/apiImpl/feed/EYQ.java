package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.Pm.MxO;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.nWX;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PAGExtraFuncationHelper.java */
/* loaded from: classes2.dex */
public class EYQ {
    protected final UB EYQ;
    private NativeExpressView HX;
    private mZx IPb;
    private WeakReference<NativeVideoTsView> Kbd;
    private com.bytedance.sdk.openadsdk.core.mZx.EYQ MxO;
    private boolean Pm;
    private PAGMediaView QQ;
    private final String Td;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.mZx VwS;
    private final Context mZx;
    private WeakReference<com.bytedance.sdk.openadsdk.core.VwS.IPb> nWX;
    private boolean pi = false;
    private PAGMediaView tp;
    private com.bytedance.sdk.openadsdk.core.mZx.mZx tsL;

    public EYQ(Context context, UB ub, String str) {
        this.mZx = context;
        this.EYQ = ub;
        this.Td = str;
    }

    public void EYQ(mZx mzx) {
        this.IPb = mzx;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.mZx mzx) {
        this.VwS = mzx;
    }

    public void EYQ(NativeVideoTsView nativeVideoTsView) {
        this.Kbd = new WeakReference<>(nativeVideoTsView);
    }

    public void EYQ(boolean z) {
        this.Pm = z;
    }

    public PAGMediaView EYQ() {
        return this.QQ;
    }

    public NativeExpressView mZx() {
        return this.HX;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq) {
        this.MxO = eyq;
    }

    public PAGImageItem Td() {
        UB ub = this.EYQ;
        if (ub == null || ub.vD() == null) {
            return null;
        }
        return new PAGImageItem(this.EYQ.vD().Td(), this.EYQ.vD().mZx(), this.EYQ.vD().EYQ(), (float) this.EYQ.vD().Pm());
    }

    public String Pm() {
        UB ub = this.EYQ;
        if (ub != null) {
            return ub.TQF();
        }
        return null;
    }

    public String Kbd() {
        UB ub = this.EYQ;
        if (ub != null) {
            return ub.OtA();
        }
        return null;
    }

    public String IPb() {
        UB ub = this.EYQ;
        if (ub != null) {
            return ub.TZn();
        }
        return null;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.mZx.mZx mzx) {
        this.tsL = mzx;
    }

    public PAGMediaView VwS() {
        PAGMediaView pAGMediaViewHX;
        com.bytedance.sdk.openadsdk.utils.mZx.EYQ(this.EYQ);
        if (this.EYQ.zF() == 2) {
            pAGMediaViewHX = KO();
            EYQ(pAGMediaViewHX);
        } else {
            pAGMediaViewHX = HX();
        }
        if (pAGMediaViewHX != null) {
            pAGMediaViewHX.setMrcTrackerKey(com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.mZx(this.EYQ));
        } else {
            pAGMediaViewHX = new PAGMediaView(this.mZx) { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ.1
                @Override // android.view.ViewGroup, android.view.View
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.Td.EYQ(this, EYQ.this.EYQ);
                }
            };
        }
        if (pAGMediaViewHX instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) pAGMediaViewHX).setMaterialMeta(this.EYQ);
        }
        this.tp = pAGMediaViewHX;
        return pAGMediaViewHX;
    }

    public PAGMediaView QQ() {
        return this.tp;
    }

    private String nWX() {
        nWX nwx;
        List<nWX> listDal = this.EYQ.Dal();
        if (listDal.isEmpty() || (nwx = listDal.get(0)) == null) {
            return null;
        }
        return nwx.EYQ();
    }

    private void EYQ(final PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            String strNWX = nWX();
            if (TextUtils.isEmpty(strNWX)) {
                return;
            }
            com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(strNWX).EYQ(200).mZx(200).Kbd(tr.Pm(hu.EYQ())).Pm(tr.Td(hu.EYQ())).Td(2).EYQ(new com.bytedance.sdk.component.Pm.QQ() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ.3
                @Override // com.bytedance.sdk.component.Pm.QQ
                public Bitmap EYQ(Bitmap bitmap) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        return com.bytedance.sdk.component.adexpress.Pm.EYQ.EYQ(hu.EYQ(), bitmap, 25);
                    }
                    return null;
                }
            }).EYQ(new com.bytedance.sdk.openadsdk.IPb.mZx(this.EYQ, strNWX, new com.bytedance.sdk.component.Pm.hu<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ.2
                @Override // com.bytedance.sdk.component.Pm.hu
                public void EYQ(int i, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.Pm.hu
                public void EYQ(MxO<Bitmap> mxO) {
                    if (mxO == null || mxO.mZx() == null || mxO.Td() == null) {
                        return;
                    }
                    pAGMediaView.setBackground(new BitmapDrawable(mxO.mZx()));
                }
            }));
        } catch (Exception unused) {
        }
    }

    private PAGMediaView KO() {
        if (UB.Kbd(this.EYQ)) {
            com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.mZx mzx = this.VwS;
            if (mzx == null || !(mzx instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.EYQ)) {
                return null;
            }
            NativeExpressVideoView nativeExpressVideoView = (NativeExpressVideoView) mzx.Pm();
            nativeExpressVideoView.setTag(520093762, Boolean.TRUE);
            if (!this.pi) {
                this.VwS.Kbd();
            }
            this.pi = true;
            return EYQ(nativeExpressVideoView);
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.mZx mzx2 = this.VwS;
        if (mzx2 == null) {
            return null;
        }
        NativeExpressView nativeExpressViewPm = mzx2.Pm();
        nativeExpressViewPm.setTag(520093762, Boolean.TRUE);
        if (!this.pi) {
            this.VwS.Kbd();
        }
        this.pi = true;
        return EYQ(nativeExpressViewPm);
    }

    public PAGMediaView HX() {
        if (UB.Kbd(this.EYQ)) {
            mZx mzx = this.IPb;
            if (mzx != null) {
                View viewKbd = mzx.Kbd();
                if (viewKbd != null) {
                    if (viewKbd.getParent() instanceof ViewGroup) {
                        ((ViewGroup) viewKbd.getParent()).removeView(viewKbd);
                    }
                    PAGMediaView pAGMediaView = this.QQ;
                    if (pAGMediaView != null) {
                        pAGMediaView.setOnClickListener(null);
                        this.QQ.setOnTouchListener(null);
                    }
                    PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.mZx, viewKbd, this);
                    pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
                    if (this.MxO != null && KO.Jpu().Pm(String.valueOf(this.EYQ.yK()))) {
                        pAGVideoMediaView.setOnClickListener(this.MxO);
                        pAGVideoMediaView.setOnTouchListener(this.MxO);
                    } else {
                        com.bytedance.sdk.openadsdk.core.mZx.Td td = new com.bytedance.sdk.openadsdk.core.mZx.Td() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ.4
                            @Override // com.bytedance.sdk.openadsdk.core.mZx.Td
                            protected void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
                                try {
                                    ((PAGVideoMediaView) view).handleInterruptVideo();
                                } catch (Exception unused) {
                                }
                            }
                        };
                        pAGVideoMediaView.setOnClickListener(td);
                        pAGVideoMediaView.setOnTouchListener(td);
                    }
                    this.QQ = pAGVideoMediaView;
                    pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return pAGVideoMediaView;
                }
                ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
                return null;
            }
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        List<nWX> listDal = this.EYQ.Dal();
        if (listDal != null && !listDal.isEmpty()) {
            ImageView imageView = new ImageView(this.mZx);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            nWX nwx = listDal.get(0);
            if (nwx != null) {
                com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(nwx).Td(2).EYQ(com.bytedance.sdk.openadsdk.IPb.Td.EYQ(this.EYQ, nwx.EYQ(), imageView));
            }
            PAGMediaView pAGMediaViewEYQ = EYQ(imageView);
            if (this.MxO != null && KO.Jpu().Pm(String.valueOf(this.EYQ.yK()))) {
                pAGMediaViewEYQ.setOnClickListener(this.MxO);
                pAGMediaViewEYQ.setOnTouchListener(this.MxO);
            } else {
                pAGMediaViewEYQ.setOnClickListener(null);
                pAGMediaViewEYQ.setOnTouchListener(null);
            }
            pAGMediaViewEYQ.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView2 = this.QQ;
            if (pAGMediaView2 != null) {
                pAGMediaView2.setOnClickListener(null);
                this.QQ.setOnTouchListener(null);
            }
            this.QQ = pAGMediaViewEYQ;
            return pAGMediaViewEYQ;
        }
        ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
        return null;
    }

    private PAGMediaView EYQ(final View view) {
        int i;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        NativeExpressView nativeExpressView = this.HX;
        if (nativeExpressView != null) {
            nativeExpressView.setClickListener(null);
            this.HX.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.mZx.mZx mzx = this.tsL;
        if (mzx != null && (mzx instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.VwS) && (view instanceof NativeExpressView)) {
            ((NativeExpressView) view).setClickListener((com.bytedance.sdk.openadsdk.core.nativeexpress.VwS) mzx);
        }
        com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq = this.MxO;
        if (eyq != null && (eyq instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.IPb) && (view instanceof NativeExpressView)) {
            ((NativeExpressView) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.nativeexpress.IPb) eyq);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.mZx) { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ.5
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if (view instanceof NativeExpressView) {
                    return;
                }
                EYQ(z);
            }

            private void EYQ(boolean z) {
                if (this.EYQ != null) {
                    com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(this.EYQ), z ? 4 : 8);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                EYQ.this.EYQ(pAGVideoAdListener);
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.Td.EYQ(this, EYQ.this.EYQ);
            }
        };
        int i2 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i2 = layoutParams.width;
            i = layoutParams.height;
        } else {
            i = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof NativeExpressView) {
            this.HX = (NativeExpressView) view;
        }
        return pAGMediaView;
    }

    public View tp() {
        if (hu.EYQ() == null) {
            pi.EYQ("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(hu.EYQ());
        imageView.setImageResource(zF.Pm(hu.EYQ(), "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EYQ.this.tsL();
            }
        });
        return imageView;
    }

    public View MxO() {
        UB ub;
        if (hu.EYQ() == null || (ub = this.EYQ) == null) {
            pi.EYQ("TTNativeAdImpl", "getAdChoicesView mContext == null");
            return null;
        }
        if (!ub.oIw() || !this.EYQ.VwS()) {
            return null;
        }
        ImageView imageView = new ImageView(hu.EYQ());
        com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ((int) tr.EYQ(hu.EYQ(), 14.0f, true), imageView, this.EYQ);
        return imageView;
    }

    public void tsL() {
        Context context = this.mZx;
        if (context != null) {
            TTWebsiteActivity.EYQ(context, this.EYQ, this.Td);
        }
    }

    public void EYQ(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.mZx mzx;
        if (this.EYQ.zF() == 2 && UB.Kbd(this.EYQ) && (mzx = this.VwS) != null && (mzx instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.EYQ)) {
            NativeExpressVideoView nativeExpressVideoView = (NativeExpressVideoView) mzx.Pm();
            if (nativeExpressVideoView != null) {
                nativeExpressVideoView.setVideoAdListener(mZx(pAGVideoAdListener));
                return;
            }
            return;
        }
        mZx mzx2 = this.IPb;
        if (mzx2 != null) {
            mzx2.EYQ(mZx(pAGVideoAdListener));
        }
    }

    private Td mZx(final PAGVideoAdListener pAGVideoAdListener) {
        return new Td() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.EYQ.7
            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.Td
            public void EYQ(int i, int i2) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.Td
            public void EYQ(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.Td
            public void mZx(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.Td
            public void Td(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }
        };
    }

    public void pi() {
        com.bytedance.sdk.openadsdk.core.VwS.IPb iPb;
        WeakReference<com.bytedance.sdk.openadsdk.core.VwS.IPb> weakReference = this.nWX;
        if (weakReference == null || (iPb = weakReference.get()) == null) {
            return;
        }
        iPb.EYQ(13);
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.VwS.IPb iPb) {
        this.nWX = new WeakReference<>(iPb);
    }
}
