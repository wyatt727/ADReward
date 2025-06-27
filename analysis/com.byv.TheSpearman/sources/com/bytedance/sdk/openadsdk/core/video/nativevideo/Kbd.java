package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderSurfaceView;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.mZx.EYQ;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.core.widget.Kbd;
import com.bytedance.sdk.openadsdk.core.widget.Pm;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: NativeVideoLayout.java */
/* loaded from: classes2.dex */
public class Kbd implements com.bykv.vk.openvk.component.video.api.Pm.mZx<UB>, com.bykv.vk.openvk.component.video.api.renderview.EYQ, wBa.EYQ, EYQ.InterfaceC0118EYQ, Kbd.mZx, Pm.EYQ {
    ViewGroup EYQ;
    com.bytedance.sdk.openadsdk.core.mZx.EYQ FH;
    private NativeVideoTsView.EYQ FtN;
    ImageView HX;
    ImageView IPb;
    int KO;
    View Kbd;
    CornerIV MxO;
    UB NZ;
    com.bykv.vk.openvk.component.video.api.Pm.Td Nvm;
    private long PI;
    View Pm;
    View QQ;
    ImageView Td;
    boolean Tnp;
    int UB;
    int Uc;
    View VwS;
    int WU;
    int XN;
    boolean hYh;
    int hu;
    private final String kf;
    boolean lEs;
    com.bykv.vk.openvk.component.video.api.renderview.mZx mZx;
    TextView nWX;
    TextView pi;
    EYQ rfB;
    Context tPj;
    View tp;
    com.bytedance.sdk.openadsdk.core.mZx.EYQ tr;
    TextView tsL;
    com.bytedance.sdk.openadsdk.core.widget.Kbd wBa;
    com.com.bytedance.overseas.sdk.EYQ.Td xt;
    boolean zF;

    public void EYQ(int i) {
    }

    public void EYQ(long j) {
    }

    public void EYQ(long j, long j2) {
    }

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Pm.EYQ
    public void EYQ(View view, boolean z) {
    }

    public void EYQ(ViewGroup viewGroup) {
    }

    public void EYQ(String str) {
    }

    public void IPb() {
    }

    public void Kbd() {
    }

    public void Td(boolean z) {
    }

    public void mZx(ViewGroup viewGroup) {
    }

    public void mZx(boolean z) {
    }

    public boolean mZx(int i) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Kbd.mZx
    public boolean tp() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.mZx
    public /* bridge */ /* synthetic */ void EYQ(UB ub, WeakReference weakReference, boolean z) {
        EYQ2(ub, (WeakReference<Context>) weakReference, z);
    }

    public Kbd(Context context, ViewGroup viewGroup, boolean z, int i, UB ub, com.bykv.vk.openvk.component.video.api.Pm.Td td, boolean z2) {
        this.hYh = true;
        this.lEs = true;
        this.Tnp = true;
        this.kf = Build.MODEL;
        if (this instanceof Pm) {
            return;
        }
        this.tPj = hu.EYQ().getApplicationContext();
        Pm(z2);
        this.EYQ = viewGroup;
        this.hYh = z;
        this.XN = i;
        this.Nvm = td;
        this.NZ = ub;
        Pm(8);
        EYQ(context, this.EYQ);
        Pm();
        tsL();
    }

    public Kbd(Context context, ViewGroup viewGroup, boolean z, int i, UB ub, com.bykv.vk.openvk.component.video.api.Pm.Td td) {
        this(context, viewGroup, z, i, ub, td, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void tsL() {
        /*
            r9 = this;
            boolean r0 = r9.lEs
            if (r0 == 0) goto L7
            java.lang.String r0 = "embeded_ad"
            goto L9
        L7:
            java.lang.String r0 = "embeded_ad_landingpage"
        L9:
            com.bytedance.sdk.openadsdk.core.model.UB r1 = r9.NZ
            boolean r1 = r1.QN()
            r2 = 1
            if (r1 == 0) goto L18
            r0 = 7
            java.lang.String r1 = "rewarded_video"
        L15:
            r8 = r0
            r7 = r1
            goto L32
        L18:
            com.bytedance.sdk.openadsdk.core.model.UB r1 = r9.NZ
            boolean r1 = r1.hv()
            if (r1 == 0) goto L24
            r0 = 5
            java.lang.String r1 = "fullscreen_interstitial_ad"
            goto L15
        L24:
            com.bytedance.sdk.openadsdk.core.model.UB r1 = r9.NZ
            boolean r1 = r1.Aw()
            if (r1 == 0) goto L30
            r0 = 2
            java.lang.String r1 = "banner_ad"
            goto L15
        L30:
            r7 = r0
            r8 = r2
        L32:
            com.bytedance.sdk.openadsdk.core.model.UB r0 = r9.NZ
            int r0 = r0.Pf()
            r1 = 4
            if (r0 != r1) goto L45
            android.content.Context r0 = r9.tPj
            com.bytedance.sdk.openadsdk.core.model.UB r1 = r9.NZ
            com.com.bytedance.overseas.sdk.EYQ.Td r0 = com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(r0, r1, r7)
            r9.xt = r0
        L45:
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = new com.bytedance.sdk.openadsdk.core.mZx.EYQ
            android.content.Context r1 = r9.tPj
            com.bytedance.sdk.openadsdk.core.model.UB r3 = r9.NZ
            r0.<init>(r1, r3, r7, r8)
            r9.FH = r0
            r0.EYQ(r9)
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.FH
            r0.mZx(r2)
            boolean r0 = r9.lEs
            if (r0 == 0) goto L62
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.FH
            r0.EYQ(r2)
            goto L6d
        L62:
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.FH
            r1 = 0
            r0.EYQ(r1)
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.FH
            r0.Td(r2)
        L6d:
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.FH
            com.bykv.vk.openvk.component.video.api.Pm.Td r1 = r9.Nvm
            r0.EYQ(r1)
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.FH
            r0.Pm(r2)
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.FH
            com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd$1 r1 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd$1
            r1.<init>()
            r0.EYQ(r1)
            com.com.bytedance.overseas.sdk.EYQ.Td r0 = r9.xt
            if (r0 == 0) goto L8e
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r1 = r9.FH
            if (r1 == 0) goto L8e
            r1.EYQ(r0)
        L8e:
            boolean r0 = r9.wBa()
            if (r0 == 0) goto Lcf
            com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd$2 r0 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd$2
            android.content.Context r5 = r9.tPj
            com.bytedance.sdk.openadsdk.core.model.UB r6 = r9.NZ
            r3 = r0
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            r9.tr = r0
            com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd$3 r1 = new com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd$3
            r1.<init>()
            r0.EYQ(r1)
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.tr
            r0.mZx(r2)
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.tr
            boolean r1 = r9.lEs
            r0.EYQ(r1)
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.tr
            com.bykv.vk.openvk.component.video.api.Pm.Td r1 = r9.Nvm
            r0.EYQ(r1)
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.tr
            r0.Pm(r2)
            com.com.bytedance.overseas.sdk.EYQ.Td r0 = r9.xt
            if (r0 == 0) goto Lca
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r1 = r9.tr
            r1.EYQ(r0)
        Lca:
            com.bytedance.sdk.openadsdk.core.mZx.EYQ r0 = r9.tr
            r0.EYQ(r9)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd.tsL():void");
    }

    private boolean wBa() {
        return UB.Kbd(this.NZ) && this.NZ.PI() == null && this.NZ.XN() == 1;
    }

    public void EYQ(NativeVideoTsView.EYQ eyq) {
        this.FtN = eyq;
    }

    public void EYQ(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq = this.FH;
        if (eyq != null) {
            eyq.EYQ(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq2 = this.tr;
        if (eyq2 != null) {
            eyq2.EYQ(pAGNativeAd);
        }
    }

    public com.bykv.vk.openvk.component.video.api.renderview.mZx pi() {
        return this.mZx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20, types: [com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView] */
    void EYQ(Context context, View view) {
        SSRenderSurfaceView sSRenderSurfaceView;
        System.currentTimeMillis();
        UB ub = this.NZ;
        if ((ub == null || ((!ub.QI() && !this.NZ.Aw()) || KO.Jpu().KJ())) && view != null) {
            view.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.component.video.api.Pm.Td td = this.Nvm;
        if (td != null && td.UB()) {
            sSRenderSurfaceView = new SSRenderTextureView(this.tPj);
        } else {
            sSRenderSurfaceView = new SSRenderSurfaceView(this.tPj);
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(sSRenderSurfaceView, 0, layoutParams);
        }
        tr.EYQ((View) sSRenderSurfaceView, 8);
        this.mZx = sSRenderSurfaceView;
        this.Td = (ImageView) view.findViewById(tp.Cia);
        this.Pm = view.findViewById(tp.JyA);
        this.Kbd = view.findViewById(tp.dbE);
        this.IPb = (ImageView) view.findViewById(tp.XNX);
        this.VwS = view.findViewById(tp.rM);
        System.currentTimeMillis();
    }

    void EYQ(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.VwS) == null || view2.getParent() == null || this.QQ != null) {
            return;
        }
        this.QQ = this.VwS;
        this.HX = (ImageView) view.findViewById(tp.As);
        this.tp = view.findViewById(tp.oZ);
        this.MxO = (CornerIV) view.findViewById(tp.Pf);
        this.tsL = (TextView) view.findViewById(tp.vD);
        this.pi = (TextView) view.findViewById(tp.lRN);
        this.nWX = (TextView) view.findViewById(tp.XPd);
    }

    void nWX() {
        if (this.rfB == null || this.wBa != null) {
            return;
        }
        System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.widget.Kbd kbd = new com.bytedance.sdk.openadsdk.core.widget.Kbd();
        this.wBa = kbd;
        kbd.EYQ(this.tPj, this.EYQ);
        this.wBa.EYQ(this.rfB, this);
        System.currentTimeMillis();
    }

    public boolean EYQ(int i, com.bykv.vk.openvk.component.video.api.Td.mZx mzx, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.Kbd kbd = this.wBa;
        return kbd == null || kbd.EYQ(i, mzx, z);
    }

    public void KO() {
        com.bytedance.sdk.openadsdk.core.widget.Kbd kbd = this.wBa;
        if (kbd != null) {
            kbd.EYQ(false);
        }
    }

    public void EYQ(com.bykv.vk.openvk.component.video.api.Pm.EYQ eyq) {
        if (eyq instanceof EYQ) {
            this.rfB = (EYQ) eyq;
            nWX();
        }
    }

    boolean hu() {
        if (this.rfB != null) {
            return true;
        }
        pi.EYQ("NewLiveViewLayout", "callback is null");
        return false;
    }

    void Pm() {
        this.mZx.EYQ(this);
        this.Td.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Kbd.this.hu()) {
                    if (Kbd.this.nWX == null || Kbd.this.nWX.getVisibility() != 0) {
                        Kbd.this.rfB.EYQ(Kbd.this, view);
                    }
                }
            }
        });
    }

    public void Td(int i) {
        tr.EYQ((View) this.EYQ, 0);
        com.bykv.vk.openvk.component.video.api.renderview.mZx mzx = this.mZx;
        if (mzx != null) {
            mzx.setVisibility(i);
        }
    }

    public void Pm(boolean z) {
        this.lEs = z;
        if (z) {
            com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq = this.FH;
            if (eyq != null) {
                eyq.EYQ(true);
            }
            com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq2 = this.tr;
            if (eyq2 != null) {
                eyq2.EYQ(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq3 = this.FH;
        if (eyq3 != null) {
            eyq3.EYQ(false);
        }
        com.bytedance.sdk.openadsdk.core.mZx.EYQ eyq4 = this.tr;
        if (eyq4 != null) {
            eyq4.EYQ(false);
        }
    }

    public void EYQ(int i, int i2) {
        if (i == -1) {
            i = tr.Td(this.tPj);
        }
        if (i <= 0) {
            return;
        }
        this.KO = i;
        if (WU() || tp() || (this.XN & 8) == 8) {
            this.hu = i2;
        } else {
            this.hu = Kbd(i);
        }
        mZx(this.KO, this.hu);
    }

    public void mZx(boolean z, boolean z2) {
        ImageView imageView = this.Td;
        if (imageView != null) {
            if (z) {
                imageView.setImageResource(zF.Pm(this.tPj, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageResource(zF.Pm(this.tPj, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void mZx(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.EYQ.getLayoutParams();
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.EYQ.setLayoutParams(layoutParams);
    }

    private int Kbd(int i) throws Resources.NotFoundException {
        if (this.UB <= 0 || this.Uc <= 0) {
            return 0;
        }
        int dimensionPixelSize = this.tPj.getResources().getDimensionPixelSize(zF.VwS(this.tPj, "tt_video_container_maxheight"));
        int dimensionPixelSize2 = this.tPj.getResources().getDimensionPixelSize(zF.VwS(this.tPj, "tt_video_container_minheight"));
        int i2 = (int) (this.Uc * ((i * 1.0f) / this.UB));
        return i2 > dimensionPixelSize ? dimensionPixelSize : i2 < dimensionPixelSize2 ? dimensionPixelSize2 : i2;
    }

    public void Td(int i, int i2) {
        this.UB = i;
        this.Uc = i2;
    }

    public void Td(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.EYQ.getParent() == null) {
            viewGroup.addView(this.EYQ);
        }
        Pm(0);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.mZx
    public View Td() {
        return this.EYQ;
    }

    public void VwS() {
        UB ub;
        tr.IPb(this.Pm);
        tr.IPb(this.Kbd);
        if (this.IPb != null && (ub = this.NZ) != null && ub.mN() != null && this.NZ.mN().tp() != null) {
            tr.IPb(this.IPb);
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ(this.NZ.mN().tp(), this.NZ.mN().Td(), this.NZ.mN().mZx(), this.IPb, this.NZ);
        }
        if (this.Td.getVisibility() == 0) {
            tr.EYQ((View) this.Td, 8);
        }
    }

    public void UB() {
        tr.IPb(this.Pm);
        tr.IPb(this.Kbd);
        if (this.Td.getVisibility() == 0) {
            tr.EYQ((View) this.Td, 8);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.mZx
    public void EYQ() {
        EYQ(false, this.hYh);
        hYh();
    }

    public void Uc() {
        tr.EYQ((View) this.EYQ, 0);
        com.bykv.vk.openvk.component.video.api.renderview.mZx mzx = this.mZx;
        if (mzx != null) {
            tr.EYQ(mzx.getView(), 0);
        }
    }

    void hYh() {
        try {
            tr.EYQ(this.QQ, 8);
            tr.EYQ((View) this.HX, 8);
            tr.EYQ(this.tp, 8);
            tr.EYQ((View) this.MxO, 8);
            tr.EYQ((View) this.tsL, 8);
            tr.EYQ((View) this.pi, 8);
            tr.EYQ((View) this.nWX, 8);
        } catch (Exception unused) {
        }
    }

    public void zF() {
        ImageView imageView = this.HX;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        CornerIV cornerIV = this.MxO;
        if (cornerIV != null) {
            cornerIV.setImageBitmap(null);
        }
    }

    private void IPb(int i) {
        tr.EYQ(this.tp, i);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.mZx
    public void EYQ(boolean z) {
        this.Tnp = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0218  */
    /* renamed from: EYQ, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ2(final com.bytedance.sdk.openadsdk.core.model.UB r8, java.lang.ref.WeakReference<android.content.Context> r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd.EYQ2(com.bytedance.sdk.openadsdk.core.model.UB, java.lang.ref.WeakReference, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final int i, final String str, final UB ub) {
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(new QQ("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(AndroidBridgeConstants.ERROR_CODE, i);
                    jSONObject.put("description", i + ":" + str);
                    jSONObject.put("url", Kbd.this.NZ.vD().EYQ());
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(Kbd.this.NZ, Kbd.this.NZ != null ? FH.Td(ub.KvC()) : null, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.mZx
    public void mZx() {
        tr.Kbd(this.Pm);
        tr.Kbd(this.Kbd);
        ImageView imageView = this.IPb;
        if (imageView != null) {
            tr.Kbd(imageView);
        }
    }

    public void QQ() {
        tr.Kbd(this.Pm);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.EYQ
    public void EYQ(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.mZx.getHolder()) {
            return;
        }
        this.zF = true;
        if (hu()) {
            this.rfB.EYQ(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.EYQ
    public void EYQ(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder != this.mZx.getHolder()) {
            return;
        }
        hu();
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.EYQ
    public void mZx(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.mZx.getHolder()) {
            return;
        }
        this.zF = false;
        if (hu()) {
            this.rfB.mZx(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.EYQ
    public void EYQ(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zF = true;
        if (hu()) {
            this.rfB.EYQ(this, surfaceTexture);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.EYQ
    public boolean EYQ(SurfaceTexture surfaceTexture) {
        this.zF = false;
        if (!hu()) {
            return true;
        }
        this.rfB.mZx(this, surfaceTexture);
        return true;
    }

    public void HX() {
        Pm(8);
        if (tPj()) {
            this.mZx.setVisibility(8);
        }
        ImageView imageView = this.IPb;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        Pm(8);
        tr.EYQ(this.QQ, 8);
        tr.EYQ((View) this.HX, 8);
        tr.EYQ(this.tp, 8);
        tr.EYQ((View) this.MxO, 8);
        tr.EYQ((View) this.tsL, 8);
        tr.EYQ((View) this.pi, 8);
        com.bytedance.sdk.openadsdk.core.widget.Kbd kbd = this.wBa;
        if (kbd != null) {
            kbd.EYQ(true);
        }
    }

    public boolean WU() {
        return this.hYh;
    }

    public void EYQ(boolean z, boolean z2, boolean z3) {
        tr.EYQ((View) this.Td, (!z || this.Pm.getVisibility() == 0) ? 8 : 0);
    }

    public void EYQ(boolean z, boolean z2) {
        tr.EYQ((View) this.Td, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Kbd.mZx
    public void MxO() {
        EYQ(true, false);
    }

    public boolean XN() {
        return this.zF;
    }

    public void Pm(int i) {
        this.WU = i;
        tr.EYQ((View) this.EYQ, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Pm.EYQ
    public boolean NZ() {
        com.bytedance.sdk.openadsdk.core.widget.Kbd kbd = this.wBa;
        return kbd != null && kbd.EYQ();
    }

    boolean tPj() {
        return (this.XN & 4) != 4 || this.hYh;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.mZx
    public void EYQ(Drawable drawable) {
        ViewGroup viewGroup = this.EYQ;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mZx.EYQ.InterfaceC0118EYQ
    public long getVideoProgress() {
        if (this.PI <= 0) {
            UB ub = this.NZ;
            if (ub != null && ub.mN() != null) {
                this.PI = (long) (this.NZ.mN().IPb() * 1000.0d);
            }
            com.bykv.vk.openvk.component.video.api.Pm.Td td = this.Nvm;
            if (td != null) {
                this.PI = td.QQ();
            }
        }
        return this.PI;
    }
}
