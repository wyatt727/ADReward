package com.bytedance.sdk.openadsdk.core.video.EYQ;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.VwS.IPb;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.video.Td.Pm;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd;
import com.bytedance.sdk.openadsdk.core.widget.Kbd;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.KO;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.bytedance.sdk.openadsdk.utils.NZ;
import com.bytedance.sdk.openadsdk.utils.WU;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: BaseController.java */
/* loaded from: classes2.dex */
public abstract class EYQ implements Td, wBa.EYQ, com.bytedance.sdk.openadsdk.core.video.nativevideo.EYQ {
    private long FH;
    protected Kbd IPb;
    protected boolean KO;
    protected Pm Kbd;
    protected boolean NZ;
    protected SurfaceTexture Pm;
    protected SurfaceHolder Td;
    protected final UB VwS;
    protected mZx XN;
    protected IPb lEs;
    protected Td.EYQ rfB;
    protected final ViewGroup tPj;
    protected final Context tp;
    protected WeakReference<Td.mZx> wBa;
    protected long xt;
    protected boolean zF;
    protected String EYQ = "TTAD.VideoController";
    protected final wBa mZx = new wBa(Looper.getMainLooper(), this);
    protected long QQ = 0;
    protected long HX = 0;
    protected final List<Runnable> MxO = new ArrayList();
    protected boolean tsL = false;
    protected boolean pi = false;
    protected boolean nWX = true;
    protected boolean hu = false;
    protected boolean UB = false;
    protected boolean Uc = false;
    protected AtomicBoolean hYh = new AtomicBoolean(false);
    protected boolean WU = true;
    protected Runnable Nvm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.EYQ.EYQ.1
        @Override // java.lang.Runnable
        public void run() {
            Boolean.valueOf(EYQ.this.tsL);
            EYQ.this.WU();
        }
    };
    private long tr = 0;
    private boolean Tnp = true;
    private int FtN = 1;

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(Td.Pm pm) {
    }

    public void EYQ(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, View view, boolean z) {
    }

    public EYQ(Context context, UB ub, ViewGroup viewGroup) {
        this.VwS = ub;
        this.tp = context;
        this.tPj = viewGroup;
        this.EYQ += hashCode();
    }

    protected void hYh() {
        if (this.Kbd == null) {
            return;
        }
        if (Uc()) {
            SurfaceTexture surfaceTexture = this.Pm;
            if (surfaceTexture == null || surfaceTexture == this.Kbd.hYh()) {
                return;
            }
            this.Kbd.EYQ(this.Pm);
            return;
        }
        SurfaceHolder surfaceHolder = this.Td;
        if (surfaceHolder == null || surfaceHolder == this.Kbd.Uc()) {
            return;
        }
        this.Kbd.EYQ(this.Td);
    }

    private boolean Uc() {
        Kbd kbd = this.IPb;
        if (kbd != null) {
            return kbd.pi() instanceof SSRenderTextureView;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean UB() {
        if (Build.VERSION.SDK_INT < 14) {
            return false;
        }
        UB ub = this.VwS;
        if (ub != null && ub.Cia() == 1 && Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (WU.Kbd() && Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        if (("Pixel 6".equals(Build.MODEL) && Build.VERSION.SDK_INT >= 34) || NZ.EYQ(this.VwS) || QQ.XN() || "Pixel 4".equals(Build.MODEL)) {
            return true;
        }
        return QQ.mZx().KO();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public long Kbd() {
        return this.QQ;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(long j) {
        this.QQ = j;
        this.HX = Math.max(this.HX, j);
    }

    protected void EYQ(Runnable runnable) {
        if (this.IPb.XN() && this.tsL) {
            runnable.run();
        } else {
            mZx(runnable);
        }
    }

    protected void mZx(Runnable runnable) {
        this.MxO.add(runnable);
    }

    protected void zF() {
        if (this.MxO.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.MxO).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.MxO.clear();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public void EYQ(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, SurfaceHolder surfaceHolder) {
        this.tsL = true;
        this.Td = surfaceHolder;
        Pm pm = this.Kbd;
        if (pm == null) {
            return;
        }
        pm.EYQ(surfaceHolder);
        zF();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public void mZx(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, SurfaceHolder surfaceHolder) {
        this.tsL = false;
        this.Td = null;
        Pm pm = this.Kbd;
        if (pm != null) {
            pm.EYQ(false);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public void EYQ(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, SurfaceTexture surfaceTexture) {
        this.tsL = true;
        this.Pm = surfaceTexture;
        Pm pm = this.Kbd;
        if (pm != null) {
            pm.EYQ(surfaceTexture);
            this.Kbd.EYQ(this.tsL);
        }
        zF();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public void mZx(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, SurfaceTexture surfaceTexture) {
        this.tsL = false;
        Pm pm = this.Kbd;
        if (pm != null) {
            pm.EYQ(false);
        }
        this.Pm = null;
        zF();
    }

    protected void WU() {
        this.mZx.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.EYQ.EYQ.2
            @Override // java.lang.Runnable
            public void run() {
                if (EYQ.this.Kbd != null) {
                    Boolean.valueOf(EYQ.this.tsL);
                    EYQ.this.Kbd.tp();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public com.bykv.vk.openvk.component.video.api.EYQ tsL() {
        return this.Kbd;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    /* renamed from: XN, reason: merged with bridge method [inline-methods] */
    public final Kbd pi() {
        return this.IPb;
    }

    public boolean NZ() {
        return this.nWX;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(boolean z) {
        this.nWX = z;
        Kbd kbd = this.IPb;
        if (kbd != null) {
            kbd.Pm(z);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void mZx(long j) {
        this.tr = j;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean MxO() {
        return this.hu;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Td(long j) {
        this.xt = j;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final long IPb() {
        Pm pm = this.Kbd;
        if (pm == null) {
            return 0L;
        }
        return pm.nWX();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final int VwS() {
        Pm pm = this.Kbd;
        if (pm == null) {
            return 0;
        }
        return pm.KO();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean nWX() {
        return this.KO;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final void mZx(final boolean z) {
        this.KO = z;
        Pm pm = this.Kbd;
        if (pm != null) {
            pm.mZx(z);
        }
        if (this.lEs != null) {
            if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
                this.lEs.EYQ(z);
            } else {
                this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.EYQ.EYQ.3
                    @Override // java.lang.Runnable
                    public void run() {
                        EYQ.this.lEs.EYQ(z);
                    }
                });
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final long QQ() {
        Pm pm = this.Kbd;
        if (pm == null) {
            return 0L;
        }
        return pm.hu();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean KO() {
        return this.pi;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final void Td(boolean z) {
        this.pi = z;
    }

    protected void IPb(boolean z) {
        this.Uc = z;
    }

    public boolean tPj() {
        return this.Tnp;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final void Pm(boolean z) {
        this.Tnp = z;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void mZx(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        mZx mzx = (mZx) td;
        this.XN = mzx;
        this.KO = mzx.QQ();
        td.Pm(String.valueOf(this.VwS.yK()));
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final boolean hu() {
        return this.NZ;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final int tp() {
        return com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(this.HX, this.xt);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Kbd(boolean z) {
        this.WU = z;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public final void mZx(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, View view) {
        mZx(mzx, view, false, false);
    }

    public final void mZx(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, View view, boolean z, boolean z2) {
        IPb(!this.Uc);
        Context context = this.tp;
        if (context != null && (context instanceof Activity)) {
            if (this.Uc) {
                EYQ(z ? 8 : 0);
                Kbd kbd = this.IPb;
                if (kbd != null) {
                    kbd.EYQ(this.tPj);
                    this.IPb.Td(false);
                }
            } else {
                EYQ(1);
                Kbd kbd2 = this.IPb;
                if (kbd2 != null) {
                    kbd2.mZx(this.tPj);
                    this.IPb.Td(false);
                }
            }
            WeakReference<Td.mZx> weakReference = this.wBa;
            Td.mZx mzx2 = weakReference != null ? weakReference.get() : null;
            if (mzx2 != null) {
                mzx2.EYQ(this.Uc);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final void EYQ(Td.mZx mzx) {
        this.wBa = new WeakReference<>(mzx);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public final void Kbd(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, View view) {
        EYQ(mzx, view, false);
    }

    public final boolean wBa() {
        Pm pm = this.Kbd;
        return pm == null || pm.mZx();
    }

    public final boolean rfB() {
        Pm pm = this.Kbd;
        return pm != null && pm.IPb();
    }

    public final void EYQ(int i) {
        Context context = this.tp;
        if (context == null) {
            return;
        }
        boolean z = i == 0 || i == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
            if (!z) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public final void Td(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, View view) {
        Kbd kbd = this.IPb;
        if (kbd != null) {
            kbd.HX();
        }
        EYQ(true, 3);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public final void EYQ(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, View view, boolean z, boolean z2) throws JSONException {
        if (this.nWX) {
            EYQ();
        }
        if (z && !this.nWX && !wBa()) {
            this.IPb.mZx(!rfB(), false);
            this.IPb.EYQ(z2, true, false);
        }
        Pm pm = this.Kbd;
        if (pm != null && pm.IPb()) {
            this.IPb.IPb();
            this.IPb.Kbd();
        } else {
            this.IPb.IPb();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public final void Pm(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, View view) {
        if (this.Uc) {
            IPb(false);
            Kbd kbd = this.IPb;
            if (kbd != null) {
                kbd.mZx(this.tPj);
            }
            EYQ(1);
            return;
        }
        EYQ(true, 3);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public final void EYQ(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, int i, boolean z) {
        if (this.tp == null) {
            return;
        }
        long jTsL = (long) (((i * this.xt) * 1.0f) / zF.tsL(r5, "tt_video_progress_max"));
        if (this.xt > 0) {
            this.FH = (int) jTsL;
        } else {
            this.FH = 0L;
        }
        Kbd kbd = this.IPb;
        if (kbd != null) {
            kbd.EYQ(this.FH);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public final void EYQ(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, int i) {
        if (this.Kbd == null) {
            return;
        }
        EYQ(this.FH, Td(i));
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public final void mZx(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, int i) {
        Kbd kbd = this.IPb;
        if (kbd != null) {
            kbd.IPb();
        }
    }

    private void EYQ(long j, boolean z) {
        if (this.Kbd == null) {
            return;
        }
        if (z) {
            Tnp();
        }
        this.Kbd.EYQ(j);
    }

    private boolean Td(int i) {
        return this.IPb.mZx(i);
    }

    private void Tnp() {
        Kbd kbd = this.IPb;
        if (kbd != null) {
            kbd.Pm(0);
            this.IPb.EYQ(false, false);
            this.IPb.Td(false);
            this.IPb.Kbd();
            this.IPb.VwS();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void EYQ(VwS vwS) throws JSONException {
        if (this.hYh.compareAndSet(false, true)) {
            KO.EYQ eyq = new KO.EYQ();
            eyq.EYQ(tPj());
            eyq.Td(QQ());
            com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(hu.EYQ(), this.IPb, eyq, vwS);
        }
    }

    protected final void lEs() throws JSONException {
        KO.EYQ eyq = new KO.EYQ();
        eyq.EYQ(Kbd());
        eyq.Td(QQ() / FH());
        eyq.mZx(IPb());
        com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.mZx(pi(), eyq);
    }

    protected final void xt() throws JSONException {
        KO.EYQ eyq = new KO.EYQ();
        eyq.EYQ(Kbd());
        eyq.Td(QQ() / FH());
        eyq.mZx(IPb());
        com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(this.IPb, eyq);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void mZx(VwS vwS) throws JSONException {
        KO.EYQ eyq = new KO.EYQ();
        eyq.EYQ(Kbd());
        eyq.Td(QQ() / FH());
        eyq.mZx(IPb());
        eyq.Pm(VwS());
        com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.mZx(this.IPb, eyq, vwS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void EYQ(com.bykv.vk.openvk.component.video.api.Td.EYQ eyq) throws JSONException {
        KO.EYQ eyq2 = new KO.EYQ();
        eyq2.mZx(IPb());
        eyq2.Td(QQ() / FH());
        eyq2.EYQ(Kbd());
        eyq2.EYQ(eyq);
        com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.Td(pi(), eyq2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Nvm() throws JSONException {
        com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(this.VwS, this.IPb, this.XN);
    }

    public int FH() {
        return this.FtN;
    }

    public void mZx(int i) {
        this.FtN = i;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final void EYQ(Td.EYQ eyq) {
        this.rfB = eyq;
    }

    /* compiled from: BaseController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.video.EYQ.EYQ$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] EYQ;

        static {
            int[] iArr = new int[Kbd.EYQ.values().length];
            EYQ = iArr;
            try {
                iArr[Kbd.EYQ.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EYQ[Kbd.EYQ.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EYQ[Kbd.EYQ.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.EYQ
    public final void EYQ(Kbd.EYQ eyq, String str) throws JSONException {
        int i = AnonymousClass4.EYQ[eyq.ordinal()];
        if (i == 1) {
            EYQ();
            return;
        }
        if (i == 2) {
            Td();
        } else {
            if (i != 3) {
                return;
            }
            mZx();
            this.hu = false;
            this.UB = true;
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final long HX() {
        return Kbd() + IPb();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public final void EYQ() throws JSONException {
        Pm pm = this.Kbd;
        if (pm != null) {
            pm.MxO();
        }
        if (this.zF || !this.hYh.get()) {
            return;
        }
        xt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void tr() {
        com.bytedance.sdk.openadsdk.mZx.EYQ.Pm.EYQ(com.bytedance.sdk.openadsdk.nWX.EYQ.EYQ(this.VwS.na(), true, this.VwS), 5, this.VwS.VOV());
    }

    public final void Pm(long j) {
        this.QQ = j;
        this.HX = Math.max(this.HX, j);
        com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd kbd = this.IPb;
        if (kbd != null) {
            kbd.EYQ();
        }
        Pm pm = this.Kbd;
        if (pm != null) {
            pm.EYQ(true, this.QQ, this.KO);
        }
    }
}
