package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import com.bytedance.sdk.component.adexpress.mZx.tp;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ;
import com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.lEs;
import com.bytedance.sdk.openadsdk.core.mZx.EYQ;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.rfB;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.bytedance.sdk.openadsdk.utils.FH;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NativeExpressView extends PAGFrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.Pm, com.bytedance.sdk.component.adexpress.mZx.KO, com.bytedance.sdk.component.adexpress.mZx.QQ, EYQ.InterfaceC0118EYQ, tsL {
    public static int WU = 500;
    private ThemeStatusBroadcastReceiver Dal;
    private long Dd;
    private boolean EYQ;
    private float FH;
    private String FtN;
    private float GfQ;
    protected String HX;
    private IPb IPb;
    protected com.bytedance.sdk.component.adexpress.mZx.Td KO;
    private List<com.bytedance.sdk.component.adexpress.mZx.tp> KR;
    private mZx Kbc;
    private PAGExpressAdWrapperListener Kbd;
    protected com.bytedance.sdk.openadsdk.core.model.UB MxO;
    int NZ;
    private int Nuq;
    private String Nvm;
    private VastBannerBackupView OnO;
    private com.bytedance.sdk.openadsdk.core.ugen.component.Pm OtA;
    private EYQ.InterfaceC0117EYQ PI;
    private final ViewTreeObserver.OnScrollChangedListener Pf;
    private TTDislikeDialogAbstract Pm;
    protected final Context QQ;
    private com.bytedance.sdk.component.adexpress.mZx.IPb TQF;
    private com.bytedance.sdk.component.adexpress.mZx.HX TZn;
    private com.bytedance.sdk.openadsdk.dislike.mZx Td;
    private com.bytedance.sdk.openadsdk.mZx.Td.Kbd Tnp;
    boolean UB;
    protected int Uc;
    private float VEW;
    private com.bytedance.sdk.component.adexpress.mZx.pi VOV;
    private VwS VwS;
    public boolean XN;
    private final Runnable XPd;
    private float by;
    private float dVQ;
    protected String hYh;
    protected boolean hu;
    private KO kf;
    protected com.bytedance.sdk.component.adexpress.mZx.mZx lEs;
    private final Runnable lRN;
    private final AtomicBoolean mN;
    private int mZx;
    protected boolean nWX;
    private com.bytedance.sdk.component.adexpress.mZx.hu na;
    protected boolean pi;
    long rfB;
    boolean tPj;
    protected AdSlot tp;
    private float tr;
    public FrameLayout tsL;
    private final Runnable vD;
    public com.bytedance.sdk.openadsdk.mZx.VwS wBa;
    private UB wJ;
    private tp.EYQ wa;
    private final SparseArray<Td.EYQ> xh;
    public com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> xt;
    protected HashSet<String> zF;

    public void EYQ() {
    }

    public void EYQ(int i) {
    }

    public void EYQ(int i, String str) {
    }

    protected void EYQ(pi.EYQ eyq) {
    }

    protected void EYQ(JSONObject jSONObject) {
    }

    public void EYQ(boolean z) {
    }

    protected boolean EYQ(com.bytedance.sdk.component.adexpress.mZx.nWX nwx) {
        return true;
    }

    public void Kbd() {
    }

    public int Pm() {
        return 0;
    }

    public long Td() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void a_() {
    }

    public void mZx() {
    }

    public void mZx(int i) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void setTimeUpdate(int i) {
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.mZx mzx) {
        if (this.wJ == null || getJsObject() == null) {
            return;
        }
        getJsObject().EYQ(mzx);
    }

    public com.bytedance.sdk.openadsdk.mZx.VwS getAdShowTime() {
        return this.wBa;
    }

    public void setClosedListenerKey(String str) {
        this.FtN = str;
        mZx mzx = this.Kbc;
        if (mzx != null) {
            mzx.EYQ(str);
        }
    }

    public String getClosedListenerKey() {
        return this.FtN;
    }

    public void setBannerClickClosedListener(EYQ.InterfaceC0117EYQ interfaceC0117EYQ) {
        this.PI = interfaceC0117EYQ;
    }

    public NativeExpressView(Context context, com.bytedance.sdk.openadsdk.core.model.UB ub, AdSlot adSlot, String str) {
        super(context);
        this.EYQ = true;
        this.mZx = 0;
        this.HX = "embeded_ad";
        this.Nvm = null;
        this.nWX = false;
        this.hu = false;
        this.UB = true;
        this.Uc = -1;
        this.XN = false;
        this.NZ = -1;
        this.wBa = new com.bytedance.sdk.openadsdk.mZx.VwS();
        this.rfB = 0L;
        this.mN = new AtomicBoolean(false);
        this.Pf = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                if (NativeExpressView.this.UB) {
                    NativeExpressView.this.WU();
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.removeCallbacks(nativeExpressView.vD);
                    NativeExpressView nativeExpressView2 = NativeExpressView.this;
                    nativeExpressView2.postDelayed(nativeExpressView2.vD, 500L);
                }
            }
        };
        this.vD = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                if (rfB.EYQ(NativeExpressView.this, 0, 5)) {
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.Pm(nativeExpressView.getVisibility());
                } else {
                    NativeExpressView.this.Pm(8);
                }
            }
        };
        this.lRN = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.3
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.Pm(0);
            }
        };
        this.XPd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.Pm(8);
            }
        };
        this.Nuq = 8;
        this.xh = new SparseArray<>();
        this.dVQ = -1.0f;
        this.GfQ = -1.0f;
        this.by = -1.0f;
        this.VEW = -1.0f;
        this.Dd = 0L;
        this.HX = str;
        this.QQ = context;
        this.MxO = ub;
        this.tp = adSlot;
        this.XN = false;
        IPb();
    }

    public NativeExpressView(Context context, com.bytedance.sdk.openadsdk.core.model.UB ub, AdSlot adSlot, String str, boolean z) {
        super(context);
        this.EYQ = true;
        this.mZx = 0;
        this.HX = "embeded_ad";
        this.Nvm = null;
        this.nWX = false;
        this.hu = false;
        this.UB = true;
        this.Uc = -1;
        this.XN = false;
        this.NZ = -1;
        this.wBa = new com.bytedance.sdk.openadsdk.mZx.VwS();
        this.rfB = 0L;
        this.mN = new AtomicBoolean(false);
        this.Pf = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                if (NativeExpressView.this.UB) {
                    NativeExpressView.this.WU();
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.removeCallbacks(nativeExpressView.vD);
                    NativeExpressView nativeExpressView2 = NativeExpressView.this;
                    nativeExpressView2.postDelayed(nativeExpressView2.vD, 500L);
                }
            }
        };
        this.vD = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                if (rfB.EYQ(NativeExpressView.this, 0, 5)) {
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.Pm(nativeExpressView.getVisibility());
                } else {
                    NativeExpressView.this.Pm(8);
                }
            }
        };
        this.lRN = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.3
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.Pm(0);
            }
        };
        this.XPd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.Pm(8);
            }
        };
        this.Nuq = 8;
        this.xh = new SparseArray<>();
        this.dVQ = -1.0f;
        this.GfQ = -1.0f;
        this.by = -1.0f;
        this.VEW = -1.0f;
        this.Dd = 0L;
        this.HX = str;
        this.QQ = context;
        this.MxO = ub;
        this.tp = adSlot;
        this.XN = z;
        IPb();
    }

    protected void IPb() {
        this.zF = new HashSet<>();
        this.Dal = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.tp;
        if (adSlot != null) {
            this.FH = adSlot.getExpressViewAcceptedWidth();
            this.tr = this.tp.getExpressViewAcceptedHeight();
            VwS();
            this.Nvm = this.tp.getCodeId();
            if (TextUtils.equals(this.HX, "fullscreen_interstitial_ad")) {
                this.NZ = com.bytedance.sdk.openadsdk.core.hu.Pm().UB(this.Nvm);
            } else if (TextUtils.equals(this.HX, "rewarded_video")) {
                this.NZ = com.bytedance.sdk.openadsdk.core.hu.Pm().tp(this.Nvm);
            } else if (TextUtils.equals(this.HX, "open_ad")) {
                int iZF = com.bytedance.sdk.openadsdk.core.hu.Pm().zF(this.Nvm);
                this.NZ = iZF;
                if (iZF < 0) {
                    this.NZ = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.MxO.oB()) {
            this.Kbc = new mZx(this.QQ, this, this.MxO, this.HX);
            return;
        }
        hu();
        this.KR = new ArrayList();
        UB();
        com.bytedance.sdk.component.adexpress.mZx.hu huVar = this.na;
        if (huVar != null) {
            this.wJ = (UB) huVar.mZx();
        }
        wBa jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.IPb(this.HX);
        }
    }

    private void VwS() {
        UB.EYQ eyqPI = this.MxO.PI();
        if (!TextUtils.equals(this.HX, "embeded_ad") || eyqPI == null) {
            return;
        }
        String strMxO = eyqPI.MxO();
        if (TextUtils.isEmpty(strMxO)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strMxO);
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            if (iOptInt == 0 || iOptInt2 == 0) {
                return;
            }
            this.tr = iOptInt2;
            this.FH = iOptInt;
        } catch (Exception unused) {
        }
    }

    public SSWebView getWebView() {
        UB ub = this.wJ;
        if (ub == null) {
            return null;
        }
        return ub.EYQ();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048 A[PHI: r4
      0x0048: PHI (r4v2 long) = (r4v1 long), (r4v11 long), (r4v11 long), (r4v11 long) binds: [B:9:0x0047, B:29:0x0048, B:5:0x0037, B:7:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void hu() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.hu():void");
    }

    protected int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.hu.Pm().xt();
    }

    private void UB() {
        if (this.MxO.KvC() == 1 && this.MxO.oIw()) {
            com.bytedance.sdk.component.adexpress.mZx.IPb iPb = new com.bytedance.sdk.component.adexpress.mZx.IPb(this.QQ, this.VOV, new nWX(this, this.Dal, this.VOV));
            this.TQF = iPb;
            this.KR.add(iPb);
            this.wa = new com.bytedance.sdk.component.adexpress.mZx.tsL(this.KR, this.TZn);
            return;
        }
        if (wBa()) {
            Uc();
            return;
        }
        try {
            hYh();
            UB ub = new UB(this.QQ, this.VOV, this.Dal, this.Tnp, this.MxO);
            this.wJ = ub;
            com.bytedance.sdk.component.adexpress.mZx.hu huVar = new com.bytedance.sdk.component.adexpress.mZx.hu(this.QQ, this.VOV, ub, this);
            this.na = huVar;
            this.KR.add(huVar);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        com.bytedance.sdk.component.adexpress.mZx.IPb iPb2 = new com.bytedance.sdk.component.adexpress.mZx.IPb(this.QQ, this.VOV, new nWX(this, this.Dal, this.VOV));
        this.TQF = iPb2;
        this.KR.add(iPb2);
        this.wa = new com.bytedance.sdk.component.adexpress.mZx.tsL(this.KR, this.TZn);
    }

    private void Uc() {
        this.mZx = this.MxO.NZ();
        try {
            hYh();
            zF();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        boolean z = this.MxO.tPj() == 1;
        this.EYQ = z;
        if (z) {
            com.bytedance.sdk.component.adexpress.mZx.IPb iPb = new com.bytedance.sdk.component.adexpress.mZx.IPb(this.QQ, this.VOV, new nWX(this, this.Dal, this.VOV));
            this.TQF = iPb;
            this.KR.add(iPb);
        }
        Objects.toString(this.KR);
        this.wa = new com.bytedance.sdk.component.adexpress.mZx.tsL(this.KR, this.TZn);
    }

    private void hYh() {
        if (com.bytedance.sdk.openadsdk.core.pi.Kbd()) {
            return;
        }
        tp.EYQ();
    }

    private void zF() {
        com.bytedance.sdk.openadsdk.core.Td.EYQ.EYQ eyq = new com.bytedance.sdk.openadsdk.core.Td.EYQ.EYQ();
        int i = this.mZx;
        if (i == 3) {
            com.bytedance.sdk.component.adexpress.dynamic.Pm.VwS vwS = new com.bytedance.sdk.component.adexpress.dynamic.Pm.VwS();
            Context applicationContext = this.QQ.getApplicationContext();
            com.bytedance.sdk.component.adexpress.mZx.pi piVar = this.VOV;
            ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.Dal;
            boolean z = this.XN;
            com.bytedance.sdk.component.adexpress.mZx.mZx mzx = new com.bytedance.sdk.component.adexpress.mZx.mZx(applicationContext, piVar, themeStatusBroadcastReceiver, z, vwS, this, eyq, new Pm(this.QQ, themeStatusBroadcastReceiver, z, vwS, piVar, eyq));
            this.lEs = mzx;
            this.KR.add(mzx);
            return;
        }
        if (i == 7) {
            com.bytedance.sdk.openadsdk.core.ugen.component.Pm pm = new com.bytedance.sdk.openadsdk.core.ugen.component.Pm(this.QQ, new com.bytedance.sdk.openadsdk.core.ugen.Td.Td(this.QQ, this.MxO, this.XN, (com.bytedance.sdk.openadsdk.core.ugen.Td.EYQ) this.VOV, this), this, this.VOV);
            this.OtA = pm;
            this.KR.add(pm);
            return;
        }
        UB ub = new UB(this.QQ, this.VOV, this.Dal, this.Tnp, this.MxO);
        this.wJ = ub;
        com.bytedance.sdk.component.adexpress.mZx.hu huVar = new com.bytedance.sdk.component.adexpress.mZx.hu(this.QQ, this.VOV, ub, this);
        this.na = huVar;
        this.KR.add(huVar);
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        BackupView backupView;
        com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm = this.xt;
        if (pm != null && (pm instanceof nWX) && (backupView = (BackupView) pm.Kbd()) != null) {
            backupView.setDislikeOuter(tTDislikeDialogAbstract);
        }
        mZx mzx = this.Kbc;
        if (mzx != null) {
            mzx.EYQ(tTDislikeDialogAbstract);
        }
        this.Pm = tTDislikeDialogAbstract;
    }

    public void setDislike(com.bytedance.sdk.openadsdk.dislike.mZx mzx) {
        BackupView backupView;
        com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm = this.xt;
        if (pm != null && (pm instanceof nWX) && (backupView = (BackupView) pm.Kbd()) != null) {
            backupView.setDislikeInner(mzx);
        }
        mZx mzx2 = this.Kbc;
        if (mzx2 != null) {
            mzx2.EYQ(mzx);
        }
        this.Td = mzx;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.Kbd = pAGExpressAdWrapperListener;
        mZx mzx = this.Kbc;
        if (mzx != null) {
            mzx.EYQ(pAGExpressAdWrapperListener);
        }
    }

    public void setClickCreativeListener(IPb iPb) {
        this.IPb = iPb;
        if (iPb != null) {
            iPb.EYQ((EYQ.InterfaceC0118EYQ) this);
        }
    }

    public IPb getClickCreativeListener() {
        return this.IPb;
    }

    public VwS getClickListener() {
        return this.VwS;
    }

    public void setClickListener(VwS vwS) {
        this.VwS = vwS;
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.mZx.Td td) {
        this.KO = td;
        com.bytedance.sdk.component.adexpress.mZx.IPb iPb = this.TQF;
        if (iPb != null) {
            iPb.EYQ(td);
        }
    }

    public void QQ() {
        com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm = this.xt;
        if (pm instanceof UB) {
            if (pm == null) {
                return;
            } else {
                ((UB) pm).QQ();
            }
        }
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.MxO;
        if (ub == null || ub.zzY() == null || this.MxO.zzY().EYQ() == null) {
            return;
        }
        this.MxO.zzY().EYQ().EYQ(0L);
    }

    public void Pm(int i) {
        com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm = this.xt;
        if (pm == null || !(pm instanceof UB)) {
            return;
        }
        ((UB) pm).mZx(i);
        this.Nuq = i;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        EYQ(i, true);
    }

    public void EYQ(int i, boolean z) {
        this.UB = z;
        removeCallbacks(this.XPd);
        removeCallbacks(this.lRN);
        if (i == 0) {
            postDelayed(this.lRN, 50L);
        } else {
            postDelayed(this.XPd, 50L);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z ? getVisibility() : 8);
        }
        WU();
        if (z) {
            com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(this.MxO, 4);
        } else {
            com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(this.MxO, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void WU() {
        if (this.mN.get()) {
            this.wBa.EYQ(System.currentTimeMillis(), rfB.EYQ(this));
        }
    }

    public void HX() {
        if (this.MxO == null) {
            return;
        }
        this.rfB = SystemClock.elapsedRealtime();
        if (this.MxO.oB()) {
            mZx mzx = this.Kbc;
            if (mzx == null) {
                a_(106);
                return;
            } else {
                mzx.EYQ((com.bytedance.sdk.component.adexpress.mZx.KO) this);
                this.Kbc.EYQ();
                return;
            }
        }
        this.Tnp.EYQ();
        tp.EYQ eyq = this.wa;
        if (eyq != null) {
            eyq.EYQ(this);
        }
        try {
            this.wa.EYQ();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.nativeexpress.IPb r0 = r12.IPb
            r1 = 0
            if (r0 == 0) goto L1e
            int r2 = r13.getDeviceId()
            r0.mZx(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.IPb r0 = r12.IPb
            int r2 = r13.getSource()
            r0.EYQ(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.IPb r0 = r12.IPb
            int r2 = r13.getToolType(r1)
            r0.Td(r2)
        L1e:
            com.bytedance.sdk.openadsdk.core.nativeexpress.VwS r0 = r12.VwS
            if (r0 == 0) goto L3b
            int r2 = r13.getDeviceId()
            r0.mZx(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.VwS r0 = r12.VwS
            int r2 = r13.getSource()
            r0.EYQ(r2)
            com.bytedance.sdk.openadsdk.core.nativeexpress.VwS r0 = r12.VwS
            int r2 = r13.getToolType(r1)
            r0.Td(r2)
        L3b:
            int r0 = r13.getActionMasked()
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L9c
            if (r0 == r4) goto L9a
            if (r0 == r3) goto L4f
            if (r0 == r2) goto L4d
            r1 = -1
        L4b:
            r5 = r1
            goto Laf
        L4d:
            r1 = 4
            goto L4b
        L4f:
            float r0 = r12.by
            float r1 = r13.getX()
            float r2 = r12.dVQ
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            float r0 = r0 + r1
            r12.by = r0
            float r0 = r12.VEW
            float r1 = r13.getY()
            float r2 = r12.GfQ
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            float r0 = r0 + r1
            r12.VEW = r0
            float r0 = r13.getX()
            r12.dVQ = r0
            float r0 = r13.getY()
            r12.GfQ = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = r12.Dd
            long r0 = r0 - r5
            r5 = 200(0xc8, double:9.9E-322)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L98
            float r0 = r12.by
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L96
            float r0 = r12.VEW
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L98
        L96:
            r5 = r4
            goto Laf
        L98:
            r5 = r3
            goto Laf
        L9a:
            r5 = r2
            goto Laf
        L9c:
            float r0 = r13.getRawX()
            r12.dVQ = r0
            float r0 = r13.getRawY()
            r12.GfQ = r0
            long r2 = java.lang.System.currentTimeMillis()
            r12.Dd = r2
            goto L4b
        Laf:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.mZx.Td$EYQ> r0 = r12.xh
            if (r0 == 0) goto Lce
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.mZx.Td$EYQ r2 = new com.bytedance.sdk.openadsdk.core.mZx.Td$EYQ
            float r3 = r13.getSize()
            double r6 = (double) r3
            float r3 = r13.getPressure()
            double r8 = (double) r3
            long r10 = java.lang.System.currentTimeMillis()
            r4 = r2
            r4.<init>(r5, r6, r8, r10)
            r0.put(r1, r2)
        Lce:
            boolean r13 = super.dispatchTouchEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void EYQ(View view, int i, com.bytedance.sdk.component.adexpress.Td td) {
        View view2;
        com.bytedance.sdk.openadsdk.utils.UB.EYQ("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i));
        if (i == -1 || td == null) {
            return;
        }
        HashMap map = new HashMap();
        if (zF.MxO(this.MxO)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.pi piVar = (com.bytedance.sdk.openadsdk.core.model.pi) td;
        IPb iPb = this.IPb;
        if (iPb != null) {
            iPb.Pm(getDynamicShowType());
            this.IPb.EYQ(map);
        }
        VwS vwS = this.VwS;
        if (vwS != null) {
            vwS.Pm(getDynamicShowType());
            this.VwS.EYQ(map);
        }
        float f = piVar.EYQ;
        float f2 = piVar.mZx;
        float f3 = piVar.Td;
        float f4 = piVar.Pm;
        boolean z = piVar.KO;
        SparseArray<Td.EYQ> sparseArray = piVar.nWX;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.xh;
        }
        SparseArray<Td.EYQ> sparseArray2 = sparseArray;
        String str = piVar.MxO;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectEYQ = view != this ? EYQ(view) : null;
            view2 = view;
        }
        if (piVar != null) {
            piVar.tsL = i;
            if (jSONObjectEYQ != null && piVar.pi == null) {
                piVar.pi = jSONObjectEYQ;
            }
        }
        switch (i) {
            case 1:
                FrameLayout frameLayout = this.tsL;
                if (frameLayout != null) {
                    frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.UB ub = this.MxO;
                if (ub == null || ub.hu() != 1 || z) {
                    VwS vwS2 = this.VwS;
                    if (vwS2 != null) {
                        vwS2.EYQ(piVar);
                        this.VwS.EYQ(str);
                        this.VwS.EYQ(view2, f, f2, f3, f4, sparseArray2, z);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.Kbd;
                    if (pAGExpressAdWrapperListener != null) {
                        pAGExpressAdWrapperListener.onAdClicked();
                        break;
                    }
                }
                break;
            case 2:
                if (piVar.hu > 0) {
                    lEs.EYQ(true);
                }
                IPb iPb2 = this.IPb;
                if (iPb2 != null) {
                    iPb2.EYQ(piVar);
                    this.IPb.EYQ(str);
                    this.IPb.EYQ(view2, f, f2, f3, f4, sparseArray2, z);
                }
                PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.Kbd;
                if (pAGExpressAdWrapperListener2 != null) {
                    pAGExpressAdWrapperListener2.onAdClicked();
                }
                lEs.EYQ(false);
                com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(this.MxO, 9);
                break;
            case 3:
                TTDislikeDialogAbstract tTDislikeDialogAbstract = this.Pm;
                if (tTDislikeDialogAbstract != null) {
                    tTDislikeDialogAbstract.show();
                    break;
                } else {
                    com.bytedance.sdk.openadsdk.dislike.mZx mzx = this.Td;
                    if (mzx != null) {
                        mzx.EYQ();
                        break;
                    } else {
                        TTDelegateActivity.EYQ(this.MxO, this.FtN);
                        break;
                    }
                }
            case 4:
                FrameLayout frameLayout2 = this.tsL;
                if (frameLayout2 != null) {
                    frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.UB ub2 = this.MxO;
                if (ub2 == null || ub2.hu() != 1 || z) {
                    FH.mZx(this.MxO);
                    if ("embeded_ad".equals(this.HX) && XN() && !this.pi && FH.mZx(this.MxO)) {
                        IPb iPb3 = this.IPb;
                        if (iPb3 != null) {
                            iPb3.EYQ(piVar);
                            this.IPb.EYQ(str);
                            this.IPb.EYQ(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    } else {
                        VwS vwS3 = this.VwS;
                        if (vwS3 != null) {
                            vwS3.EYQ(piVar);
                            this.VwS.EYQ(str);
                            this.VwS.EYQ(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.Kbd;
                    if (pAGExpressAdWrapperListener3 != null) {
                        pAGExpressAdWrapperListener3.onAdClicked();
                        break;
                    }
                }
                break;
            case 5:
                EYQ(!this.XN);
                break;
            case 6:
                EYQ();
                break;
            case 7:
                TTWebsiteActivity.EYQ(this.QQ, this.MxO, this.HX);
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mZx.EYQ.InterfaceC0118EYQ
    public long getVideoProgress() {
        VastBannerBackupView vastBannerBackupView = this.OnO;
        if (vastBannerBackupView != null) {
            return vastBannerBackupView.getVideoProgress();
        }
        return 0L;
    }

    public static JSONObject EYQ(View view) throws JSONException {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean XN() {
        return com.bytedance.sdk.openadsdk.core.model.UB.Kbd(this.MxO);
    }

    private int getAdSlotType() {
        String str = this.HX;
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        WU();
        NZ();
        com.bytedance.sdk.component.utils.pi.EYQ("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.Pf);
        com.bytedance.sdk.openadsdk.core.QQ.mZx().EYQ(this.FtN, this.PI);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WU();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.pi.EYQ("webviewpool", "onFinishTemporaryDetach+++");
    }

    private void NZ() {
        List<com.bytedance.sdk.component.adexpress.mZx.tp> list = this.KR;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.mZx.tp> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void tPj() {
        List<com.bytedance.sdk.component.adexpress.mZx.tp> list = this.KR;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.mZx.tp> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void tp() {
        UB ub = this.wJ;
        if (ub == null || ub.Kbd() == null) {
            return;
        }
        this.wJ.IPb();
    }

    public void MxO() {
        try {
            mZx mzx = this.Kbc;
            if (mzx != null) {
                mzx.mZx();
            }
            nWX();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.mZx.tp> list = this.KR;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.mZx.tp> it = list.iterator();
                while (it.hasNext()) {
                    it.next().EYQ();
                }
            }
            com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(this.MxO);
            this.Td = null;
            this.Pm = null;
            this.tp = null;
            this.MxO = null;
            this.Kbd = null;
            this.IPb = null;
            this.KO = null;
            this.VwS = null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("NativeExpressView", "detach error", th);
        }
    }

    public void tsL() {
        try {
            FrameLayout frameLayout = this.tsL;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.tsL);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.Pf);
        com.bytedance.sdk.openadsdk.core.QQ.mZx().Pm(this.FtN);
        tPj();
        com.bytedance.sdk.component.utils.pi.EYQ("webviewpool", "onDetachedFromWindow===");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.pi.EYQ("webviewpool", "onStartTemporaryDetach===");
    }

    public void EYQ(com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm, com.bytedance.sdk.component.adexpress.mZx.nWX nwx) {
        com.bytedance.sdk.openadsdk.core.model.UB ub;
        this.mN.set(true);
        this.xt = pm;
        if (this.Nuq != getWindowVisibility()) {
            Pm(getWindowVisibility());
        }
        Integer.valueOf(pm.Td());
        if (pm.Td() == 3 && (ub = this.MxO) != null && ub.nWX() == 1) {
            this.MxO.mZx(0);
        }
        if (pm.Td() == 2 || pm.Td() == 0 || pm.Td() == 3 || pm.Td() == 7) {
            View viewKbd = pm.Kbd();
            if (viewKbd.getParent() != null) {
                ((ViewGroup) viewKbd.getParent()).removeView(viewKbd);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                arrayList.add(getChildAt(i));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) instanceof SSWebView) {
                    removeView((View) arrayList.get(i2));
                }
            }
            addView(pm.Kbd());
        }
        com.bytedance.sdk.openadsdk.core.model.UB ub2 = this.MxO;
        if (ub2 != null) {
            com.bytedance.sdk.openadsdk.tp.Td.EYQ(ub2.EYQ(), this.rfB, this.HX, pm.Td());
        }
        com.bytedance.sdk.component.adexpress.mZx.HX hx = this.TZn;
        if (hx != null) {
            ((MxO) hx).MxO();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.Kbd;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) nwx.Pm(), (float) nwx.Kbd());
        }
        if (EYQ(nwx)) {
            com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(this, this.MxO, getDynamicShowType());
        }
        KO ko = this.kf;
        if (ko != null) {
            ko.EYQ(this.MxO, this.HX);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.KO
    public void a_(int i) {
        com.bytedance.sdk.component.adexpress.mZx.HX hx = this.TZn;
        if (hx != null) {
            if (!this.EYQ) {
                hx.QQ();
            }
            this.TZn.HX();
            ((MxO) this.TZn).MxO();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.Kbd;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.VwS.EYQ(i), i);
        }
        KO ko = this.kf;
        if (ko != null) {
            ko.EYQ(this.MxO, this.HX);
        }
    }

    public boolean pi() {
        com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm = this.xt;
        return pm != null && pm.Td() == 1;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm = this.xt;
        if (pm != null) {
            return pm.Td();
        }
        return 0;
    }

    public JSONObject EYQ(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.UB ub) throws JSONException {
        if (!(this.xt instanceof UB)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (ub != null && ub.PI() != null && ub.PI().pi()) {
                jSONObject.put("engine_version", ub.PI().tsL());
            } else {
                jSONObject.put("engine_version", "v1");
            }
            jSONObject.put("engine_type", renderEngineCacheType);
        } catch (Exception e) {
            e.getMessage();
        }
        return jSONObject;
    }

    public int getRenderEngineCacheType() {
        QQ qqKO;
        com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm = this.xt;
        if (!(pm instanceof UB) || (qqKO = ((UB) pm).KO()) == null) {
            return 0;
        }
        return qqKO.EYQ();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.FH).intValue();
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.tr).intValue();
    }

    public wBa getJsObject() {
        UB ub = this.wJ;
        if (ub != null) {
            return ub.hu();
        }
        return null;
    }

    private boolean wBa() {
        return TextUtils.equals(this.HX, "fullscreen_interstitial_ad") || TextUtils.equals(this.HX, "rewarded_video") || TextUtils.equals("open_ad", this.HX) || UB.mZx(this.HX) || TextUtils.equals(this.HX, "embeded_ad");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void EYQ(CharSequence charSequence, int i, int i2, boolean z) {
        mZx(Integer.parseInt(String.valueOf(charSequence)), i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void setSoundMute(boolean z) {
        this.XN = z;
        com.bytedance.sdk.component.adexpress.mZx.mZx mzx = this.lEs;
        if (mzx != null && mzx.mZx() != null) {
            this.lEs.mZx().setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm = this.xt;
        if ((pm instanceof com.bytedance.sdk.openadsdk.core.ugen.Td.Td) && pm.Td() == 7) {
            ((com.bytedance.sdk.openadsdk.core.ugen.Td.Td) this.xt).setSoundMute(z);
        }
    }

    protected void mZx(int i, int i2) {
        int iMin;
        if (TextUtils.equals(this.HX, "banner_ad")) {
            return;
        }
        int i3 = this.NZ;
        int i4 = ((i2 < i3 || i3 < 0 || !(this.tPj || TextUtils.equals(this.HX, "open_ad"))) && Pm() != 5) ? 0 : 1;
        if (i2 <= this.NZ) {
            com.bytedance.sdk.openadsdk.core.model.UB ub = this.MxO;
            if (ub != null && ub.mN() != null) {
                iMin = (int) (Math.min(this.NZ, this.MxO.mN().IPb() * this.MxO.mN().XN()) - i2);
            } else {
                iMin = this.NZ - i2;
            }
        } else {
            iMin = 0;
        }
        com.bytedance.sdk.component.adexpress.mZx.mZx mzx = this.lEs;
        if (mzx != null && mzx.mZx() != null) {
            this.lEs.mZx().EYQ(String.valueOf(i), i4, iMin, false);
        }
        com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm = this.xt;
        if (pm instanceof com.bytedance.sdk.openadsdk.core.ugen.Td.Td) {
            ((com.bytedance.sdk.openadsdk.core.ugen.Td.Td) pm).EYQ((CharSequence) String.valueOf(i), i4, iMin, false);
        }
    }

    public void nWX() {
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.MxO;
        if (ub == null || ub.zzY() == null || this.MxO.zzY().EYQ() == null) {
            return;
        }
        this.MxO.zzY().EYQ().Kbd(getVideoProgress());
    }

    public void setVastVideoHelper(VastBannerBackupView vastBannerBackupView) {
        this.OnO = vastBannerBackupView;
    }

    public boolean KO() {
        return this.mN.get();
    }

    public void mZx(int i, String str) throws JSONException {
        wBa wbaHu;
        com.bytedance.sdk.component.adexpress.mZx.Pm<? extends View> pm = this.xt;
        if (pm == null || !(pm instanceof UB) || (wbaHu = ((UB) pm).hu()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i);
            jSONObject.put("flag", str);
            wbaHu.EYQ("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }
}
