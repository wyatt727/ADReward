package com.bytedance.sdk.openadsdk.core.mZx;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.lEs;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.HX;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.pi;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: ClickListener.java */
/* loaded from: classes2.dex */
public class mZx extends Td {
    private String EYQ;
    private boolean FtN;
    protected WeakReference<View> HX;
    protected final String IPb;
    protected com.com.bytedance.overseas.sdk.EYQ.Td KO;
    protected final UB Kbd;
    protected EYQ MxO;
    public pi Pm;
    protected WeakReference<View> QQ;
    protected Context Td;
    protected PangleAd UB;
    protected com.bytedance.sdk.openadsdk.core.nativeexpress.EYQ Uc;
    protected final int VwS;
    protected int hYh;
    protected Map<String, Object> hu;
    private WeakReference<Activity> mZx;
    protected boolean nWX;
    protected com.bykv.vk.openvk.component.video.api.Pm.Td pi;
    protected HX tp;
    protected PAGNativeAd tsL;

    /* compiled from: ClickListener.java */
    public interface EYQ {
        void EYQ(View view, int i);
    }

    public boolean EYQ(HX hx, Map<String, Object> map) {
        return false;
    }

    public void EYQ(com.com.bytedance.overseas.sdk.EYQ.Td td) {
        this.KO = td;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.nativeexpress.EYQ eyq) {
        this.Uc = eyq;
    }

    public void EYQ(PAGNativeAd pAGNativeAd) {
        this.tsL = pAGNativeAd;
    }

    public void EYQ(PangleAd pangleAd) {
        this.UB = pangleAd;
    }

    public void Pm(boolean z) {
        this.nWX = z;
    }

    public void EYQ(com.bykv.vk.openvk.component.video.api.Pm.Td td) {
        this.pi = td;
    }

    public mZx(Context context, UB ub, String str, int i) {
        this.nWX = false;
        this.hYh = 0;
        this.FtN = false;
        this.Td = context;
        this.Kbd = ub;
        this.IPb = str;
        this.VwS = i;
    }

    public mZx(Context context, UB ub, String str, int i, boolean z) {
        this(context, ub, str, i);
        this.FtN = z;
    }

    public void EYQ(EYQ eyq) {
        this.MxO = eyq;
    }

    public void EYQ(Activity activity) {
        if (activity == null) {
            return;
        }
        this.mZx = new WeakReference<>(activity);
    }

    public void EYQ(View view) {
        if (view == null) {
            return;
        }
        this.QQ = new WeakReference<>(view);
    }

    public void mZx(View view) {
        if (view == null) {
            return;
        }
        this.HX = new WeakReference<>(view);
    }

    public View Pm() {
        WeakReference<Activity> weakReference = this.mZx;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.mZx.get().findViewById(R.id.content);
    }

    public View Kbd() {
        WeakReference<Activity> weakReference = this.mZx;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        View viewFindViewById = this.mZx.get().findViewById(520093713);
        return viewFindViewById == null ? this.mZx.get().findViewById(520093713) : viewFindViewById;
    }

    public void EYQ(Map<String, Object> map) {
        Map<String, Object> map2 = this.hu;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.hu);
        }
        this.hu = map;
    }

    public void EYQ(int i) {
        this.xt = i;
    }

    public void mZx(int i) {
        this.lEs = i;
    }

    public void Td(int i) {
        this.rfB = i;
    }

    public void Pm(int i) {
        this.hYh = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.mZx.Td
    public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
        int i;
        JSONObject jSONObject;
        UB ub;
        if (this.Td == null) {
            this.Td = hu.EYQ();
        }
        if ((this.FtN || !EYQ(view, 1, f, f2, f3, f4, sparseArray, z)) && this.Td != null) {
            pi piVar = this.Pm;
            if (piVar != null) {
                i = piVar.tsL;
                jSONObject = this.Pm.pi;
            } else {
                i = -1;
                jSONObject = null;
            }
            long j = this.tPj;
            long j2 = this.wBa;
            WeakReference<View> weakReference = this.QQ;
            View view2 = weakReference == null ? null : weakReference.get();
            WeakReference<View> weakReference2 = this.HX;
            HX hxEYQ = EYQ(f, f2, f3, f4, sparseArray, j, j2, view2, weakReference2 == null ? null : weakReference2.get(), IPb(), tr.Kbd(this.Td), tr.VwS(this.Td), tr.IPb(this.Td), i, jSONObject);
            this.tp = hxEYQ;
            if (EYQ(hxEYQ, this.hu)) {
                return;
            }
            if (this.pi != null) {
                if (this.hu == null) {
                    this.hu = new HashMap();
                }
                this.hu.put("duration", Long.valueOf(this.pi.Kbd()));
            }
            if (this.FtN) {
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.Kbd, this.tp, this.IPb, true, this.hu, z ? 1 : 2);
                return;
            }
            EYQ eyq = this.MxO;
            if (eyq != null) {
                eyq.EYQ(view, -1);
            }
            if (EYQ(view, z)) {
                boolean zMZx = zF.mZx(this.Kbd);
                String strEYQ = zMZx ? this.IPb : FH.EYQ(this.VwS);
                if (view != null) {
                    try {
                        Boolean bool = (Boolean) view.getTag(520093762);
                        if (bool.booleanValue()) {
                            lEs.EYQ(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                Activity activityEYQ = view != null ? com.bytedance.sdk.component.utils.mZx.EYQ(view) : null;
                boolean zEYQ = lEs.EYQ(activityEYQ == null ? this.Td : activityEYQ, this.Kbd, this.VwS, this.tsL, this.UB, strEYQ, this.KO, zMZx, 0);
                lEs.EYQ(false);
                if (zEYQ || (ub = this.Kbd) == null || ub.dVQ() == null || this.Kbd.dVQ().Td() != 2) {
                    UB ub2 = this.Kbd;
                    if (ub2 != null && !zEYQ && TextUtils.isEmpty(ub2.XPd()) && com.bytedance.sdk.openadsdk.mZx.mZx.EYQ(this.IPb)) {
                        com.com.bytedance.overseas.sdk.EYQ.Pm.EYQ(this.Td, this.Kbd, this.IPb).Pm();
                    }
                    com.bytedance.sdk.openadsdk.mZx.Td.EYQ(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.Kbd, this.tp, this.IPb, zEYQ, this.hu, z ? 1 : 2);
                }
            }
        }
    }

    public boolean EYQ(View view, boolean z) {
        return EYQ(view, this.Kbd, z);
    }

    public static boolean EYQ(View view, UB ub, boolean z) {
        if (view != null && ub != null) {
            try {
                String strValueOf = String.valueOf(view.getTag(com.bytedance.sdk.component.adexpress.dynamic.EYQ.zF));
                if (view.getTag(com.bytedance.sdk.component.adexpress.dynamic.EYQ.zF) != null && !TextUtils.isEmpty(strValueOf)) {
                    if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(strValueOf)) {
                        return z;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (Td(view)) {
                return ub.UB() != 1 || z;
            }
            if (ub.hu() == 1 && !z) {
                return false;
            }
        }
        return true;
    }

    protected HX EYQ(float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject) {
        return new HX.EYQ().IPb(f).Kbd(f2).Pm(f3).Td(f4).mZx(j).EYQ(j2).mZx(tr.EYQ(view)).EYQ(tr.EYQ(view2)).Td(tr.Td(view)).Pm(tr.Td(view2)).Pm(this.rfB).Kbd(this.lEs).IPb(this.xt).EYQ(sparseArray).mZx(QQ.mZx().EYQ() ? 1 : 2).EYQ(str).EYQ(f5).Td(i).mZx(f6).EYQ(i2).EYQ(jSONObject).EYQ();
    }

    protected boolean EYQ(View view, int i, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
        if (this.Uc == null) {
            return false;
        }
        int[] iArrEYQ = new int[2];
        int[] iArrTd = new int[2];
        WeakReference<View> weakReference = this.HX;
        if (weakReference != null) {
            iArrEYQ = tr.EYQ(weakReference.get());
            iArrTd = tr.Td(this.HX.get());
        }
        this.Uc.EYQ(view, i, new pi.EYQ().Pm(f).Td(f2).mZx(f3).EYQ(f4).mZx(this.tPj).EYQ(this.wBa).Td(iArrEYQ[0]).Pm(iArrEYQ[1]).Kbd(iArrTd[0]).IPb(iArrTd[1]).EYQ(sparseArray).EYQ(z).EYQ());
        return true;
    }

    public static boolean Td(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || com.bytedance.sdk.component.utils.zF.Kbd(view.getContext(), "btn_native_creative") == view.getId() || tp.zzY == view.getId() || tp.wY == view.getId();
    }

    public String IPb() {
        return this.EYQ;
    }

    public void EYQ(String str) {
        this.EYQ = str;
    }
}
