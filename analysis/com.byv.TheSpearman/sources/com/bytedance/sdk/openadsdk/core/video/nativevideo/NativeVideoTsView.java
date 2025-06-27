package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.VwS.IPb;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.core.rfB;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.Td;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.KO;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.HX;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class NativeVideoTsView extends PAGFrameLayout implements Td.EYQ, wBa.EYQ, Td.EYQ {
    private static final Integer WU = 0;
    private static final Integer XN = 1;
    private final ViewTreeObserver.OnScrollChangedListener Dal;
    protected final UB EYQ;
    private final Handler FH;
    private boolean FtN;
    protected ImageView HX;
    public VwS IPb;
    public mZx KO;
    private ViewTreeObserver.OnGlobalLayoutListener Kbc;
    public boolean Kbd;
    protected boolean MxO;
    private String NZ;
    private final boolean Nvm;
    private final String PI;
    private final AtomicBoolean Pf;
    protected boolean Pm;
    protected ImageView QQ;
    protected FrameLayout Td;
    private long Tnp;
    private ViewGroup UB;
    private boolean Uc;
    protected RelativeLayout VwS;
    private final AtomicBoolean XPd;
    private boolean hYh;
    private final Context hu;
    private View kf;
    private boolean lEs;
    private boolean lRN;
    private Td.InterfaceC0065Td mN;
    protected com.bykv.vk.openvk.component.video.api.Pm.Td mZx;
    boolean nWX;
    protected int pi;
    private boolean rfB;
    private boolean tPj;
    protected ImageView tp;
    private boolean tr;
    protected String tsL;
    private final Runnable vD;
    private boolean wBa;
    private long xt;
    private String zF;

    public interface EYQ {
        void EYQ(View view, int i);
    }

    public interface mZx {
        void EYQ(boolean z, long j, long j2, long j3, boolean z2);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
    public void EYQ() {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
    public void mZx(long j, int i) {
    }

    public void setAdCreativeClickListener(EYQ eyq) {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td != null) {
            ((Td) td).EYQ(eyq);
        }
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.video.nativevideo.mZx mzx) {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td != null) {
            ((Td) td).EYQ(mzx);
        }
    }

    public void setControllerStatusCallBack(mZx mzx) {
        this.KO = mzx;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
    public void EYQ(long j, int i) {
        Td.InterfaceC0065Td interfaceC0065Td = this.mN;
        if (interfaceC0065Td != null) {
            interfaceC0065Td.g_();
        }
    }

    private void Pm() {
        EYQ(0L, 0);
        this.mN = null;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
    public void EYQ(long j, long j2) {
        Td.InterfaceC0065Td interfaceC0065Td = this.mN;
        if (interfaceC0065Td != null) {
            interfaceC0065Td.EYQ(j, j2);
        }
    }

    public NativeVideoTsView(Context context, UB ub, boolean z, VwS vwS) {
        this(context, ub, z, "embeded_ad", false, false, vwS);
    }

    public NativeVideoTsView(Context context, UB ub, String str, boolean z, boolean z2, VwS vwS) {
        this(context, ub, false, str, z, z2, vwS);
    }

    public NativeVideoTsView(Context context, UB ub, VwS vwS) {
        this(context, ub, false, vwS);
    }

    public NativeVideoTsView(Context context, UB ub, boolean z, String str, boolean z2, boolean z3, VwS vwS) {
        super(context);
        this.Uc = true;
        this.Pm = true;
        this.hYh = false;
        this.Kbd = false;
        this.tPj = true;
        this.wBa = false;
        this.rfB = true;
        this.MxO = true;
        this.tsL = "embeded_ad";
        this.pi = 50;
        this.lEs = true;
        this.Nvm = false;
        this.FH = new wBa(pi.mZx().getLooper(), this);
        this.FtN = false;
        this.PI = Build.MODEL;
        this.nWX = false;
        this.Pf = new AtomicBoolean(false);
        this.vD = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeVideoTsView nativeVideoTsView = NativeVideoTsView.this;
                nativeVideoTsView.EYQ(nativeVideoTsView.tr, NativeVideoTsView.WU.intValue());
            }
        };
        this.lRN = true;
        this.XPd = new AtomicBoolean(false);
        this.Dal = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                NativeVideoTsView.this.UB();
            }
        };
        try {
            if (ub.WgU()) {
                if (Build.VERSION.SDK_INT >= 23) {
                    this.NZ = CacheDirFactory.getICacheDir(0).mZx();
                } else {
                    this.NZ = HX.EYQ();
                }
            }
        } catch (Throwable unused) {
        }
        if (vwS != null) {
            this.IPb = vwS;
        }
        this.tsL = str;
        this.hu = context;
        this.EYQ = ub;
        this.hYh = z;
        setContentDescription("NativeVideoTsView");
        this.wBa = z2;
        this.rfB = z3;
        mZx();
        Kbd();
    }

    protected void mZx() {
        UB ub = this.EYQ;
        if (ub == null) {
            return;
        }
        int iYK = ub.yK();
        int iMZx = hu.Pm().mZx(iYK);
        int iTd = com.bytedance.sdk.component.utils.hu.Td(hu.EYQ());
        if (iMZx == 1) {
            this.Uc = FH.Pm(iTd);
        } else if (iMZx == 2) {
            this.Uc = FH.Kbd(iTd) || FH.Pm(iTd) || FH.IPb(iTd);
        } else if (iMZx == 3) {
            this.Uc = false;
        } else if (iMZx == 4) {
            this.nWX = true;
        } else if (iMZx == 5) {
            this.Uc = FH.Pm(iTd) || FH.IPb(iTd);
        }
        if (!this.hYh) {
            if (!this.Kbd || !com.bytedance.sdk.openadsdk.core.nativeexpress.UB.mZx(this.tsL)) {
                this.Pm = hu.Pm().Td(String.valueOf(iYK));
            }
        } else {
            this.Pm = false;
        }
        if ("open_ad".equals(this.tsL)) {
            this.Uc = true;
            this.Pm = true;
        }
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td != null) {
            td.Pm(this.Uc);
        }
        this.Kbd = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mZx mzx;
        com.bykv.vk.openvk.component.video.api.Pm.Td td;
        if (!this.hYh && (mzx = this.KO) != null && (td = this.mZx) != null) {
            mzx.EYQ(td.KO(), this.mZx.QQ(), this.mZx.HX(), this.mZx.Kbd(), this.Uc);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private View EYQ(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.UB = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.Td = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.kf = view;
        return frameLayout;
    }

    private RelativeLayout mZx(Context context) {
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        pAGRelativeLayout.setVisibility(8);
        PAGImageView pAGImageView = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        pAGImageView.setLayoutParams(layoutParams);
        pAGImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.QQ = pAGImageView;
        PAGImageView pAGImageView2 = new PAGImageView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        pAGImageView2.setLayoutParams(layoutParams2);
        pAGImageView2.setVisibility(8);
        pAGImageView2.setBackground(zF.Td(context, "tt_new_play_video"));
        this.tp = pAGImageView2;
        pAGRelativeLayout.addView(pAGImageView);
        pAGRelativeLayout.addView(pAGImageView2);
        return pAGRelativeLayout;
    }

    private void Kbd() {
        addView(EYQ(this.hu));
        Uc();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                NativeVideoTsView.this.UB();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                NativeVideoTsView.this.UB();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void UB() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.FH;
        if (handler == null || jElapsedRealtime - this.Tnp <= 500) {
            return;
        }
        this.Tnp = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td != null) {
            ((Td) td).EYQ(pAGNativeAd);
        }
    }

    public void VwS() {
        View view;
        if (this.hu == null || (view = this.kf) == null || view.getParent() == null || this.EYQ == null || this.VwS != null) {
            return;
        }
        ViewParent parent = this.kf.getParent();
        RelativeLayout relativeLayoutMZx = mZx(this.hu);
        if (parent != null && (parent instanceof ViewGroup)) {
            EYQ(relativeLayoutMZx, (ViewGroup) parent, this.kf);
        }
        this.VwS = relativeLayoutMZx;
        if (this.MxO) {
            tr.EYQ((View) this.tp, 0);
        }
        if (this.EYQ.mN() != null && this.EYQ.mN().tp() != null) {
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.EYQ.mN().tp(), this.EYQ.mN().Td(), this.EYQ.mN().mZx(), this.QQ, this.EYQ);
        }
        ImageView imageView = this.tp;
        if (imageView != null) {
            imageView.setClickable(true);
            this.tp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    NativeVideoTsView.this.Td();
                }
            });
        }
    }

    private void EYQ(View view, ViewGroup viewGroup, View view2) {
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    private void Uc() {
        this.mZx = new Td(this.hu, this.Td, this.EYQ, this.tsL, !tr(), this.wBa, this.rfB, this.IPb);
        hYh();
        if (this.Kbc == null) {
            this.Kbc = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (NativeVideoTsView.this.UB == null || NativeVideoTsView.this.UB.getViewTreeObserver() == null || NativeVideoTsView.this.mZx == null) {
                        return;
                    }
                    ((Td) NativeVideoTsView.this.mZx).EYQ(NativeVideoTsView.this.UB.getWidth(), NativeVideoTsView.this.UB.getHeight());
                    NativeVideoTsView.this.UB.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    NativeVideoTsView.this.Kbc = null;
                }
            };
            this.UB.getViewTreeObserver().addOnGlobalLayoutListener(this.Kbc);
        }
    }

    public void setVideoAdLoadListener(Td.Pm pm) {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td != null) {
            td.EYQ(pm);
        }
    }

    public boolean EYQ(long j, boolean z, boolean z2) throws JSONException {
        boolean zEYQ = false;
        this.UB.setVisibility(0);
        this.xt = j;
        if (!tr()) {
            return true;
        }
        this.mZx.EYQ(false);
        UB ub = this.EYQ;
        if (ub != null && ub.mN() != null) {
            com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = UB.EYQ(CacheDirFactory.getICacheDir(this.EYQ.Cia()).Td(), this.EYQ);
            mzxEYQ.mZx(this.EYQ.VOV());
            mzxEYQ.EYQ(this.UB.getWidth());
            mzxEYQ.mZx(this.UB.getHeight());
            mzxEYQ.Td(this.EYQ.GfQ());
            mzxEYQ.EYQ(j);
            mzxEYQ.EYQ(HX());
            EYQ(mzxEYQ);
            if (z2) {
                this.mZx.mZx(mzxEYQ);
                return true;
            }
            zEYQ = this.mZx.EYQ(mzxEYQ);
        }
        if (((j > 0 && !z && !z2) || (j > 0 && z)) && this.mZx != null) {
            KO.EYQ eyq = new KO.EYQ();
            eyq.EYQ(this.mZx.Kbd());
            eyq.Td(this.mZx.QQ());
            eyq.mZx(this.mZx.IPb());
            com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.mZx(this.mZx.pi(), eyq);
        }
        return zEYQ;
    }

    private void hYh() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td == null) {
            return;
        }
        td.Pm(this.Uc);
        ((Td) this.mZx).EYQ((Td.EYQ) this);
        this.mZx.EYQ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        zF();
        getViewTreeObserver().addOnScrollChangedListener(this.Dal);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        zF();
    }

    private void zF() {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td == null) {
            Uc();
        } else if ((td instanceof Td) && !tr()) {
            ((Td) this.mZx).Uc();
        }
        if (this.mZx == null || !this.Pf.get()) {
            return;
        }
        this.Pf.set(false);
        mZx();
        if (QQ()) {
            tr.EYQ((View) this.VwS, 8);
            ImageView imageView = this.HX;
            if (imageView != null) {
                tr.EYQ((View) imageView, 8);
            }
            UB ub = this.EYQ;
            if (ub != null && ub.mN() != null) {
                com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = UB.EYQ(CacheDirFactory.getICacheDir(this.EYQ.Cia()).Td(), this.EYQ);
                mzxEYQ.mZx(this.EYQ.VOV());
                mzxEYQ.EYQ(this.UB.getWidth());
                mzxEYQ.mZx(this.UB.getHeight());
                mzxEYQ.Td(this.EYQ.GfQ());
                mzxEYQ.EYQ(0L);
                mzxEYQ.EYQ(HX());
                EYQ(mzxEYQ);
                this.mZx.EYQ(mzxEYQ);
                this.mZx.Td(false);
                return;
            }
            com.bytedance.sdk.component.utils.pi.EYQ("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
            return;
        }
        if (this.mZx.KO()) {
            this.mZx.KO();
            mZx(true);
        } else {
            VwS();
            tr.EYQ((View) this.VwS, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WU();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.Dal);
        }
        ViewGroup viewGroup = this.UB;
        if (viewGroup == null || this.Kbc == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.Kbc);
            this.Kbc = null;
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        WU();
    }

    private void WU() {
        this.KO = null;
        if ((this.mZx instanceof Td) && !tr()) {
            ((Td) this.mZx).Tnp();
        }
        tp();
        EYQ(false);
        XN();
    }

    private void XN() {
        if (!this.Pf.get()) {
            this.Pf.set(true);
            com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
            if (td != null) {
                td.EYQ(true, 3);
            }
        }
        this.XPd.set(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            XN();
        }
    }

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) {
        if (message.what == 1) {
            NZ();
        }
    }

    private void NZ() {
        this.tr = MxO();
        xt.EYQ(this.vD);
    }

    private boolean tPj() {
        UB ub = this.EYQ;
        if (ub == null) {
            return false;
        }
        return ub.wY();
    }

    private boolean wBa() {
        if (tr() || !tPj()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void rfB() {
        if (tr() || !tPj()) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_isfromvideodetailpage", Boolean.FALSE);
        com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_is_from_detail_page", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(boolean z, int i) {
        if (this.EYQ == null || this.mZx == null) {
            return;
        }
        boolean zWBa = wBa();
        rfB();
        if (zWBa && this.mZx.KO()) {
            this.mZx.KO();
            mZx(true);
            Pm();
            return;
        }
        if (z && this.tPj && !this.mZx.KO() && !this.mZx.MxO()) {
            if (this.mZx.tsL() != null && this.mZx.tsL().VwS()) {
                if (this.Uc || i == 1) {
                    com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
                    if (td != null) {
                        setIsQuiet(td.nWX());
                    }
                    if ("ALP-AL00".equals(this.PI)) {
                        this.mZx.mZx();
                    } else {
                        if (!QQ.mZx().KO()) {
                            zWBa = true;
                        }
                        ((Td) this.mZx).QQ(zWBa);
                    }
                    EYQ(false);
                    Td.InterfaceC0065Td interfaceC0065Td = this.mN;
                    if (interfaceC0065Td != null) {
                        interfaceC0065Td.f_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.Uc && this.mZx.tsL() == null) {
                if (!this.Pf.get()) {
                    this.Pf.set(true);
                }
                this.XPd.set(false);
                zF();
                return;
            }
            return;
        }
        if (this.mZx.tsL() == null || !this.mZx.tsL().IPb()) {
            return;
        }
        this.mZx.EYQ();
        EYQ(true);
        Td.InterfaceC0065Td interfaceC0065Td2 = this.mN;
        if (interfaceC0065Td2 != null) {
            interfaceC0065Td2.e_();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        com.bykv.vk.openvk.component.video.api.Pm.Td td;
        com.bykv.vk.openvk.component.video.api.Pm.Td td2;
        com.bykv.vk.openvk.component.video.api.Pm.Td td3;
        com.bykv.vk.openvk.component.video.api.Pm.Td td4;
        if (!"open_ad".equals(this.tsL)) {
            this.tPj = z;
            super.onWindowFocusChanged(z);
            xt();
            if (wBa() && (td4 = this.mZx) != null && td4.KO()) {
                rfB();
                tr.EYQ((View) this.VwS, 8);
                mZx(true);
                Pm();
                return;
            }
            mZx();
            if (tr() || !QQ() || (td2 = this.mZx) == null || td2.MxO()) {
                if (QQ()) {
                    return;
                }
                if (!z && (td = this.mZx) != null && td.tsL() != null && this.mZx.tsL().IPb()) {
                    lEs();
                    EYQ(false, WU.intValue());
                    return;
                } else {
                    if (z) {
                        this.FH.obtainMessage(1).sendToTarget();
                        return;
                    }
                    return;
                }
            }
            if (this.FH != null) {
                if (z && (td3 = this.mZx) != null && !td3.KO()) {
                    this.FH.obtainMessage(1).sendToTarget();
                    return;
                } else {
                    lEs();
                    EYQ(false, WU.intValue());
                    return;
                }
            }
            return;
        }
        lEs();
    }

    private void lEs() {
        this.FH.removeMessages(1);
        pi.Td().removeCallbacks(this.vD);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        com.bykv.vk.openvk.component.video.api.Pm.Td td;
        UB ub;
        com.bykv.vk.openvk.component.video.api.Pm.Td td2;
        com.bykv.vk.openvk.component.video.api.Pm.Td td3;
        super.onWindowVisibilityChanged(i);
        xt();
        if (this.lRN) {
            this.lRN = i == 0;
        }
        if (wBa() && (td3 = this.mZx) != null && td3.KO()) {
            rfB();
            tr.EYQ((View) this.VwS, 8);
            mZx(true);
            Pm();
            return;
        }
        mZx();
        if (tr() || !QQ() || (td = this.mZx) == null || td.MxO() || (ub = this.EYQ) == null) {
            return;
        }
        if (this.lEs && ub.mN() != null) {
            this.EYQ.mN();
            com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = UB.EYQ(CacheDirFactory.getICacheDir(this.EYQ.Cia()).Td(), this.EYQ);
            mzxEYQ.mZx(this.EYQ.VOV());
            mzxEYQ.EYQ(this.UB.getWidth());
            mzxEYQ.mZx(this.UB.getHeight());
            mzxEYQ.Td(this.EYQ.GfQ());
            mzxEYQ.EYQ(this.xt);
            mzxEYQ.EYQ(HX());
            EYQ(mzxEYQ);
            this.mZx.EYQ(mzxEYQ);
            this.lEs = false;
            tr.EYQ((View) this.VwS, 8);
        } else {
            com.bytedance.sdk.component.utils.pi.EYQ("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
        }
        if (i != 0 || this.FH == null || (td2 = this.mZx) == null || td2.KO()) {
            return;
        }
        this.FH.obtainMessage(1).sendToTarget();
    }

    private void xt() {
        boolean zEYQ = false;
        if (this.mZx == null || tr() || (tPj() && !com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_is_update_flag", false))) {
            return;
        }
        long jQQ = this.mZx.QQ() + this.mZx.IPb();
        long jQQ2 = this.mZx.QQ();
        long jEYQ = 0;
        if (tPj()) {
            zEYQ = com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_native_video_complete", false);
            jEYQ = com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            jQQ = com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_total_play_duration", this.mZx.QQ() + this.mZx.IPb());
            jQQ2 = com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_duration", this.mZx.QQ());
            com.bytedance.sdk.openadsdk.multipro.Pm.EYQ.EYQ("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.mZx.Td(zEYQ);
            this.mZx.EYQ(jEYQ);
            this.mZx.mZx(jQQ);
            this.mZx.Td(jQQ2);
        }
        com.bytedance.sdk.component.utils.pi.EYQ("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + zEYQ + ",position=" + jEYQ + ",totalPlayDuration=" + jQQ + ",duration=" + jQQ2);
    }

    public com.bykv.vk.openvk.component.video.api.Pm.Td getNativeVideoController() {
        return this.mZx;
    }

    public boolean QQ() {
        return this.Uc;
    }

    public void setIsAutoPlay(boolean z) {
        if (this.FtN) {
            return;
        }
        int iMZx = hu.Pm().mZx(this.EYQ.yK());
        if (z && iMZx != 4 && (!com.bytedance.sdk.component.utils.hu.Kbd(this.hu) ? !(!com.bytedance.sdk.component.utils.hu.IPb(this.hu) ? com.bytedance.sdk.component.utils.hu.Pm(this.hu) : Nvm() || FH()) : !Nvm())) {
            z = false;
        }
        this.Uc = z;
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td != null) {
            td.Pm(z);
        }
        if (!this.Uc) {
            VwS();
            RelativeLayout relativeLayout = this.VwS;
            if (relativeLayout != null) {
                tr.EYQ((View) relativeLayout, 0);
                UB ub = this.EYQ;
                if (ub != null && ub.mN() != null) {
                    com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.EYQ.mN().tp(), this.EYQ.mN().Td(), this.EYQ.mN().mZx(), this.QQ, this.EYQ);
                }
            }
        } else {
            tr.EYQ((View) this.VwS, 8);
        }
        this.FtN = true;
    }

    private boolean Nvm() {
        return 2 == hu.Pm().mZx(this.EYQ.yK());
    }

    private boolean FH() {
        return 5 == hu.Pm().mZx(this.EYQ.yK());
    }

    public boolean HX() {
        return this.Pm;
    }

    public void setIsQuiet(boolean z) {
        this.Pm = z;
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td != null) {
            td.mZx(z);
        }
    }

    private boolean tr() {
        return this.hYh;
    }

    public void setVideoAdInteractionListener(Td.InterfaceC0065Td interfaceC0065Td) {
        this.mN = interfaceC0065Td;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.EYQ
    public void IPb() {
        Td.InterfaceC0065Td interfaceC0065Td = this.mN;
        if (interfaceC0065Td != null) {
            interfaceC0065Td.b_();
        }
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.MxO = z;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.EYQ
    public void EYQ(int i) {
        mZx();
    }

    protected void Td() {
        if (tsL()) {
            return;
        }
        nWX();
    }

    protected void EYQ(boolean z) {
        if (this.HX == null) {
            this.HX = new ImageView(getContext());
            if (QQ.mZx().hu() != null) {
                this.HX.setImageBitmap(QQ.mZx().hu());
            } else {
                this.HX.setImageResource(zF.Pm(hu.EYQ(), "tt_new_play_video"));
            }
            this.HX.setScaleType(ImageView.ScaleType.FIT_XY);
            int iMZx = tr.mZx(getContext(), this.pi);
            int iMZx2 = tr.mZx(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMZx, iMZx);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iMZx2;
            layoutParams.bottomMargin = iMZx2;
            this.UB.addView(this.HX, layoutParams);
            this.HX.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    NativeVideoTsView.this.nWX();
                }
            });
        }
        if (z) {
            this.HX.setVisibility(0);
        } else {
            this.HX.setVisibility(8);
        }
    }

    public void mZx(boolean z) {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td != null) {
            td.Td(z);
            com.bykv.vk.openvk.component.video.api.Pm.mZx mzxPi = this.mZx.pi();
            if (mzxPi != null) {
                mzxPi.mZx();
                View viewTd = mzxPi.Td();
                if (viewTd != null) {
                    if (viewTd.getParent() != null) {
                        ((ViewGroup) viewTd.getParent()).removeView(viewTd);
                    }
                    viewTd.setVisibility(0);
                    addView(viewTd);
                    mzxPi.EYQ(this.EYQ, new WeakReference<>(this.hu), false);
                }
            }
        }
    }

    public void tp() {
        com.bykv.vk.openvk.component.video.api.Pm.mZx mzxPi;
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td == null || (mzxPi = td.pi()) == null) {
            return;
        }
        mzxPi.EYQ();
        View viewTd = mzxPi.Td();
        if (viewTd != null) {
            viewTd.setVisibility(8);
            if (viewTd.getParent() != null) {
                ((ViewGroup) viewTd.getParent()).removeView(viewTd);
            }
        }
    }

    private void Tnp() {
        tr.Kbd(this.HX);
        tr.Kbd(this.VwS);
    }

    public void setVideoCacheUrl(String str) {
        this.zF = str;
    }

    boolean MxO() {
        return rfB.EYQ(this, 50, com.bytedance.sdk.openadsdk.core.nativeexpress.UB.mZx(this.tsL) ? 1 : 5);
    }

    public boolean tsL() {
        boolean z = false;
        if (com.bytedance.sdk.component.utils.hu.Td(hu.EYQ()) == 0) {
            return false;
        }
        if (this.mZx.tsL() != null && this.mZx.tsL().IPb()) {
            EYQ(false, WU.intValue());
            Handler handler = this.FH;
            z = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z;
    }

    public void pi() {
        if (getNativeVideoController() == null || !(getNativeVideoController() instanceof Td)) {
            return;
        }
        Td td = (Td) getNativeVideoController();
        td.EYQ(td.pi(), this);
    }

    public void nWX() {
        if (com.bytedance.sdk.component.utils.hu.Td(hu.EYQ()) != 0 && MxO()) {
            if (this.mZx.tsL() != null && this.mZx.tsL().VwS()) {
                EYQ(true, XN.intValue());
                mZx();
                Handler handler = this.FH;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(1, 500L);
                    return;
                }
                return;
            }
            if (QQ() || this.XPd.get()) {
                return;
            }
            this.XPd.set(true);
            Tnp();
            UB ub = this.EYQ;
            if (ub != null && ub.mN() != null) {
                Tnp();
                this.EYQ.mN();
                com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = UB.EYQ(CacheDirFactory.getICacheDir(this.EYQ.Cia()).Td(), this.EYQ);
                mzxEYQ.mZx(this.EYQ.VOV());
                mzxEYQ.EYQ(this.UB.getWidth());
                mzxEYQ.mZx(this.UB.getHeight());
                mzxEYQ.Td(this.EYQ.GfQ());
                mzxEYQ.EYQ(this.xt);
                mzxEYQ.EYQ(HX());
                mzxEYQ.EYQ(CacheDirFactory.getICacheDir(this.EYQ.Cia()).Td());
                EYQ(mzxEYQ);
                this.mZx.EYQ(mzxEYQ);
            }
            Handler handler2 = this.FH;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            EYQ(false);
        }
    }

    public double getCurrentPlayTime() {
        return this.mZx != null ? (r0.Kbd() * 1.0d) / 1000.0d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public void KO() {
        UB ub = this.EYQ;
        if (ub == null || ub.zzY() == null) {
            return;
        }
        this.EYQ.zzY().KO();
        this.EYQ.zzY().EYQ().Kbd(this.xt);
    }

    public IPb EYQ(List<Pair<View, FriendlyObstructionPurpose>> list) {
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.mZx;
        if (td instanceof Td) {
            return ((Td) td).EYQ(this, list);
        }
        return null;
    }

    private void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        try {
            if (this.EYQ.WgU()) {
                td.EYQ(this.NZ);
            }
        } catch (Throwable unused) {
        }
    }
}
