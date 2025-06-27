package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.component.EYQ;
import com.bytedance.adsdk.ugeno.core.IPb;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenEngine.java */
/* loaded from: classes2.dex */
public class tp {
    private Context EYQ;
    private HX HX;
    private hu IPb;
    private pi Kbd;
    private VwS Pm;
    private IPb QQ;
    private com.bytedance.adsdk.ugeno.component.mZx<View> Td;
    private nWX VwS;
    private JSONObject mZx;
    private JSONObject tp;
    private boolean MxO = true;
    private boolean tsL = false;

    public tp(Context context) {
        this.EYQ = context;
    }

    public com.bytedance.adsdk.ugeno.component.mZx<View> EYQ(JSONObject jSONObject) {
        hu huVar = this.IPb;
        if (huVar != null) {
            huVar.EYQ();
        }
        IPb iPb = new IPb(jSONObject, this.mZx);
        this.QQ = iPb;
        pi piVar = this.Kbd;
        if (piVar instanceof com.bytedance.adsdk.ugeno.core.EYQ.EYQ) {
            ((com.bytedance.adsdk.ugeno.core.EYQ.EYQ) piVar).EYQ(iPb.mZx());
        }
        this.Td = EYQ(this.QQ.EYQ(), (com.bytedance.adsdk.ugeno.component.mZx<View>) null);
        hu huVar2 = this.IPb;
        if (huVar2 != null) {
            huVar2.mZx();
            this.Td.EYQ(this.IPb);
        }
        return this.Td;
    }

    public com.bytedance.adsdk.ugeno.component.mZx<View> EYQ(IPb.EYQ eyq, com.bytedance.adsdk.ugeno.component.mZx<View> mzx) {
        List<IPb.EYQ> listTd;
        EYQ.C0075EYQ c0075eyqQQ = null;
        if (!IPb.EYQ(eyq)) {
            return null;
        }
        String strTd = eyq.Td();
        mZx mzxEYQ = Pm.EYQ(strTd);
        if (mzxEYQ == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(strTd)));
            return null;
        }
        com.bytedance.adsdk.ugeno.component.mZx mzxEYQ2 = mzxEYQ.EYQ(this.EYQ);
        if (mzxEYQ2 == null) {
            return null;
        }
        mzxEYQ2.Td(com.bytedance.adsdk.ugeno.EYQ.Td.EYQ(eyq.EYQ(), this.mZx));
        mzxEYQ2.Pm(strTd);
        mzxEYQ2.mZx(eyq.Pm());
        mzxEYQ2.EYQ(eyq);
        mzxEYQ2.EYQ(this.HX);
        if (mzx instanceof com.bytedance.adsdk.ugeno.component.EYQ) {
            com.bytedance.adsdk.ugeno.component.EYQ eyq2 = (com.bytedance.adsdk.ugeno.component.EYQ) mzx;
            mzxEYQ2.EYQ(eyq2);
            c0075eyqQQ = eyq2.QQ();
        }
        Iterator<String> itKeys = eyq.Pm().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strEYQ = com.bytedance.adsdk.ugeno.EYQ.Td.EYQ(eyq.Pm().optString(next), this.mZx);
            mzxEYQ2.EYQ(next, strEYQ);
            if (c0075eyqQQ != null) {
                c0075eyqQQ.EYQ(this.EYQ, next, strEYQ);
            }
        }
        if (mzxEYQ2 instanceof com.bytedance.adsdk.ugeno.component.EYQ) {
            List<IPb.EYQ> listKbd = eyq.Kbd();
            if (listKbd == null || listKbd.size() <= 0) {
                if (TextUtils.equals(mzxEYQ2.nWX(), "RecyclerLayout") && (listTd = this.QQ.Td()) != null && listTd.size() > 0) {
                    Iterator<IPb.EYQ> it = listTd.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.component.mZx<View> mzxEYQ3 = EYQ(it.next(), (com.bytedance.adsdk.ugeno.component.mZx<View>) mzxEYQ2);
                        if (mzxEYQ3 != null && mzxEYQ3.UB()) {
                            ((com.bytedance.adsdk.ugeno.component.EYQ) mzxEYQ2).EYQ(mzxEYQ3);
                        }
                    }
                }
                return mzxEYQ2;
            }
            if (TextUtils.equals(mzxEYQ2.nWX(), "Swiper") && listKbd.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<IPb.EYQ> it2 = listKbd.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.component.mZx<View> mzxEYQ4 = EYQ(it2.next(), (com.bytedance.adsdk.ugeno.component.mZx<View>) mzxEYQ2);
                if (mzxEYQ4 != null && mzxEYQ4.UB()) {
                    ((com.bytedance.adsdk.ugeno.component.EYQ) mzxEYQ2).EYQ(mzxEYQ4);
                }
            }
        }
        if (c0075eyqQQ != null) {
            mzxEYQ2.EYQ(c0075eyqQQ.EYQ());
        }
        this.Td = mzxEYQ2;
        return mzxEYQ2;
    }

    public void mZx(JSONObject jSONObject) throws JSONException {
        hu huVar = this.IPb;
        if (huVar != null) {
            huVar.Td();
        }
        this.mZx = jSONObject;
        EYQ(this.Td, jSONObject);
        EYQ(this.Td);
        if (this.IPb != null) {
            KO ko = new KO();
            ko.EYQ(0);
            ko.EYQ(this.Td);
            this.IPb.EYQ(ko);
        }
    }

    public void EYQ(com.bytedance.adsdk.ugeno.component.mZx mzx, JSONObject jSONObject) throws JSONException {
        if (mzx == null) {
            return;
        }
        if (mzx instanceof com.bytedance.adsdk.ugeno.component.EYQ) {
            mzx.EYQ(jSONObject);
            List<com.bytedance.adsdk.ugeno.component.mZx<View>> listEYQ = ((com.bytedance.adsdk.ugeno.component.EYQ) mzx).EYQ();
            if (listEYQ == null || listEYQ.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.component.mZx<View>> it = listEYQ.iterator();
            while (it.hasNext()) {
                EYQ(it.next(), jSONObject);
            }
            return;
        }
        mzx.EYQ(jSONObject);
    }

    private void EYQ(com.bytedance.adsdk.ugeno.component.mZx<View> mzx) {
        List<com.bytedance.adsdk.ugeno.component.mZx<View>> listEYQ;
        if (mzx == null) {
            return;
        }
        JSONObject jSONObjectMxO = mzx.MxO();
        Iterator<String> itKeys = jSONObjectMxO.keys();
        com.bytedance.adsdk.ugeno.component.EYQ eyqTsL = mzx.tsL();
        EYQ.C0075EYQ c0075eyqQQ = eyqTsL != null ? eyqTsL.QQ() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strEYQ = com.bytedance.adsdk.ugeno.EYQ.Td.EYQ(jSONObjectMxO.optString(next), this.mZx);
            mzx.EYQ(next, strEYQ);
            mzx.EYQ(this.Pm);
            mzx.EYQ(this.Kbd);
            mzx.EYQ(this.VwS);
            if (c0075eyqQQ != null) {
                c0075eyqQQ.EYQ(this.EYQ, next, strEYQ);
            }
        }
        if ((mzx instanceof com.bytedance.adsdk.ugeno.component.EYQ) && (listEYQ = ((com.bytedance.adsdk.ugeno.component.EYQ) mzx).EYQ()) != null && listEYQ.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.component.mZx<View>> it = listEYQ.iterator();
            while (it.hasNext()) {
                EYQ(it.next());
            }
        }
        if (c0075eyqQQ != null) {
            mzx.EYQ(c0075eyqQQ.EYQ());
        }
        mzx.mZx();
    }

    public void EYQ(pi piVar) {
        com.bytedance.adsdk.ugeno.core.EYQ.EYQ eyq = new com.bytedance.adsdk.ugeno.core.EYQ.EYQ(piVar);
        eyq.EYQ(this.tp);
        eyq.EYQ(this.MxO);
        eyq.mZx(this.tsL);
        IPb iPb = this.QQ;
        if (iPb != null) {
            eyq.EYQ(iPb.mZx());
        }
        this.Kbd = eyq;
    }

    public void EYQ(nWX nwx) {
        this.VwS = nwx;
    }
}
