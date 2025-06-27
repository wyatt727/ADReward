package com.bytedance.sdk.openadsdk.core.ugen.Td;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.MxO;
import com.bytedance.adsdk.ugeno.core.nWX;
import com.bytedance.adsdk.ugeno.core.pi;
import com.bytedance.adsdk.ugeno.core.tp;
import com.bytedance.sdk.component.adexpress.Pm.Kbd;
import com.bytedance.sdk.component.adexpress.dynamic.Pm;
import com.bytedance.sdk.component.adexpress.mZx.QQ;
import com.bytedance.sdk.component.adexpress.mZx.VwS;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.pi;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenRender.java */
/* loaded from: classes2.dex */
public class Td implements nWX, pi, Pm, com.bytedance.sdk.component.adexpress.mZx.Pm<View> {
    protected static int MxO = 8;
    private static float lEs;
    private static float rfB;
    private static long tPj;
    private static float wBa;
    private static float xt;
    protected tp EYQ;
    protected com.bytedance.adsdk.ugeno.component.mZx HX;
    protected FrameLayout IPb;
    private QQ KO;
    protected EYQ Kbd;
    private long NZ;
    protected UB Pm;
    protected com.bytedance.adsdk.ugeno.component.mZx<View> Td;
    private final boolean UB;
    private float Uc;
    protected com.bytedance.sdk.component.adexpress.mZx.nWX VwS;
    private float WU;
    private long XN;
    private float hYh;
    private VwS hu;
    protected Context mZx;
    private JSONObject nWX;
    protected WeakReference<View> tsL;
    private float zF;
    protected boolean tp = true;
    public SparseArray<Td.EYQ> pi = new SparseArray<>();
    private final com.bytedance.sdk.component.VwS.QQ Nvm = new com.bytedance.sdk.component.VwS.QQ("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.ugen.Td.Td.1
        @Override // java.lang.Runnable
        public void run() {
            Td td = Td.this;
            td.nWX = td.Kbd.Td();
            com.bytedance.sdk.openadsdk.core.pi.Td().post(Td.this.FH);
        }
    };
    private final Runnable FH = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ugen.Td.Td.2
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (Td.this.hu != null) {
                Td td = Td.this;
                td.mZx(td.hu);
            }
        }
    };
    private boolean tr = false;
    protected AtomicBoolean QQ = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
    public int Td() {
        return 7;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void a_() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void setTimeUpdate(int i) {
    }

    public Td(Context context, UB ub, boolean z, EYQ eyq, ViewGroup viewGroup) {
        this.mZx = context;
        this.UB = z;
        this.EYQ = new tp(context);
        this.Pm = ub;
        this.Kbd = eyq;
        this.IPb = new FrameLayout(context);
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
    public void EYQ(VwS vwS) {
        this.hu = vwS;
        xt.mZx(this.Nvm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(VwS vwS) throws JSONException {
        this.Kbd.rfB().EYQ();
        JSONObject jSONObjectWBa = this.Kbd.wBa();
        if (this.nWX == null) {
            vwS.EYQ(133, "ugen template is null");
            return;
        }
        if (jSONObjectWBa == null) {
            vwS.EYQ(133, "ugen data is null");
            return;
        }
        this.EYQ.EYQ((pi) this);
        this.EYQ.EYQ((nWX) this);
        this.Td = this.EYQ.EYQ(this.nWX);
        this.Kbd.rfB().mZx();
        this.Kbd.rfB().Td();
        this.EYQ.mZx(jSONObjectWBa);
        if (this.Td != null) {
            mZx mzx = new mZx();
            this.VwS = mzx;
            mzx.EYQ(true);
            this.VwS.EYQ(Td());
            setSoundMute(this.UB);
            com.bytedance.adsdk.ugeno.component.mZx<T> mZx = this.Td.mZx("video");
            this.HX = mZx;
            if (mZx != 0 && (mZx instanceof com.bytedance.sdk.openadsdk.core.ugen.component.video.EYQ)) {
                ((mZx) this.VwS).EYQ((FrameLayout) ((com.bytedance.sdk.openadsdk.core.ugen.component.video.EYQ) mZx).hYh());
            }
            com.bytedance.adsdk.ugeno.component.mZx<T> mZx2 = this.Td.mZx("feedback");
            if (mZx2 != 0 && mZx2.HX() != null) {
                this.tsL = new WeakReference<>(mZx2.HX());
            }
            this.IPb.addView(this.Td.HX(), new FrameLayout.LayoutParams(this.Td.KO(), this.Td.hu()));
            float fNZ = this.Kbd.NZ();
            float fTPj = this.Kbd.tPj();
            float fMZx = tr.mZx(this.mZx, fNZ);
            float fMZx2 = tr.mZx(this.mZx, fTPj);
            if (fTPj <= 0.0f) {
                this.IPb.setLayoutParams(new FrameLayout.LayoutParams((int) fMZx, -2));
            } else {
                this.IPb.setLayoutParams(new FrameLayout.LayoutParams((int) fMZx, (int) fMZx2));
            }
            if (fTPj <= 0.0f || fNZ <= 0.0f) {
                this.IPb.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int iTd = tr.Td(this.mZx, this.IPb.getMeasuredWidth());
                int iTd2 = tr.Td(this.mZx, this.IPb.getMeasuredHeight());
                this.VwS.EYQ(iTd);
                this.VwS.mZx(iTd2);
            } else {
                this.VwS.EYQ(fNZ);
                this.VwS.mZx(fTPj);
            }
            if (this.QQ.get()) {
                vwS.EYQ(137, "ugen render timeout");
                return;
            } else {
                vwS.EYQ(this.IPb, this.VwS);
                return;
            }
        }
        vwS.EYQ(138, "ugen render error");
    }

    public void EYQ(boolean z) {
        this.QQ.set(z);
    }

    public void EYQ(QQ qq) {
        this.KO = qq;
    }

    @Override // com.bytedance.adsdk.ugeno.core.pi
    public void EYQ(MxO mxO, pi.mZx mzx, pi.EYQ eyq) {
        if (mxO == null) {
            return;
        }
        if (mxO.mZx() == 1 || mxO.mZx() == 4) {
            EYQ(mxO);
        }
        if (mxO.mZx() == 10) {
            EYQ(mxO.Td());
        }
        if (mzx == null || mxO.Pm() == null) {
            return;
        }
        mzx.EYQ(mxO.Pm());
    }

    private void EYQ(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.component.mZx<T> mZx;
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(strOptString2) || (mZx = this.Td.mZx(strOptString2)) == 0) {
            return;
        }
        if (TextUtils.equals(strOptString, "onShow")) {
            mZx.mZx(0);
        } else if (TextUtils.equals(strOptString, "onDismiss")) {
            mZx.mZx(8);
        }
    }

    private void EYQ(MxO mxO) {
        int i;
        String str;
        if (this.KO == null) {
            return;
        }
        String strOptString = mxO.Td().optString("type");
        strOptString.hashCode();
        i = 5;
        switch (strOptString) {
            case "privacy":
                i = 7;
                break;
            case "feedback":
                i = 3;
                break;
            case "mute":
                break;
            case "skip":
                i = 6;
                break;
            case "video":
                i = 4;
                break;
            case "creative":
                i = 2;
                break;
            default:
                i = 0;
                break;
        }
        com.bytedance.adsdk.ugeno.component.mZx mzxEYQ = mxO.EYQ();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.tsL;
        if (weakReference != null) {
            int[] iArrEYQ = tr.EYQ(weakReference.get());
            if (iArrEYQ != null) {
                iArr = iArrEYQ;
            }
            int[] iArrTd = tr.Td(this.tsL.get());
            if (iArrTd != null) {
                iArr2 = iArrTd;
            }
        }
        pi.EYQ EYQ = new pi.EYQ().Pm(this.Uc).Td(this.hYh).mZx(this.zF).EYQ(this.WU).mZx(this.XN).EYQ(this.NZ).Td(iArr[0]).Pm(iArr[1]).Kbd(iArr2[0]).IPb(iArr2[1]).EYQ(this.pi).EYQ(this.tp);
        if (mzxEYQ == null) {
            str = "";
        } else {
            str = mzxEYQ.nWX() + "_" + mzxEYQ.pi();
        }
        this.KO.EYQ(mxO.EYQ().HX(), i, EYQ.EYQ(str).EYQ());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    @Override // com.bytedance.adsdk.ugeno.core.nWX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ(com.bytedance.adsdk.ugeno.component.mZx r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ugen.Td.Td.EYQ(com.bytedance.adsdk.ugeno.component.mZx, android.view.MotionEvent):void");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void EYQ(CharSequence charSequence, int i, int i2, boolean z) {
        if (this.Td == null) {
            return;
        }
        boolean z2 = i == 1;
        EYQ(charSequence, z2, i2, z);
        mZx(charSequence, z2, i2, z);
    }

    private void EYQ(CharSequence charSequence, boolean z, int i, boolean z2) throws NumberFormatException {
        int i2;
        com.bytedance.adsdk.ugeno.component.mZx<T> mZx = this.Td.mZx("countdown");
        if (mZx == 0) {
            return;
        }
        View viewHX = mZx.HX();
        if (viewHX instanceof TextView) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.pi.EYQ("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            if (z2 || i2 <= 0 || this.tr) {
                viewHX.setVisibility(8);
                return;
            }
            viewHX.setVisibility(0);
            if (!z && this.Kbd.EYQ() && Kbd.mZx(this.Kbd.Pm())) {
                ((TextView) viewHX).setText(String.format(zF.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), "tt_reward_full_skip"), Integer.valueOf(i)));
                return;
            }
            if (!"open_ad".equals(this.Kbd.Pm()) && this.Kbd.EYQ()) {
                this.tr = true;
                viewHX.setVisibility(8);
            } else {
                ((TextView) viewHX).setText(((Object) charSequence) + CmcdHeadersFactory.STREAMING_FORMAT_SS);
            }
        }
    }

    private void mZx(CharSequence charSequence, boolean z, int i, boolean z2) {
        View viewHX;
        com.bytedance.adsdk.ugeno.component.mZx<T> mZx = this.Td.mZx("skip");
        if (mZx == 0 || (viewHX = mZx.HX()) == null) {
            return;
        }
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        viewHX.setVisibility(i2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Pm
    public void setSoundMute(boolean z) {
        com.bytedance.adsdk.ugeno.component.mZx<T> mZx;
        com.bytedance.adsdk.ugeno.component.mZx<View> mzx = this.Td;
        if (mzx == null || (mZx = mzx.mZx(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) == 0) {
            return;
        }
        if (z) {
            ((com.bytedance.adsdk.ugeno.component.image.mZx) mZx).Kbd("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.component.image.mZx) mZx).Kbd("local://tt_reward_full_unmute");
        }
        mZx.mZx();
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
    public View Kbd() {
        return this.IPb;
    }
}
