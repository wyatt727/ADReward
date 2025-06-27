package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;

/* compiled from: InteractViewFactory.java */
/* loaded from: classes2.dex */
public class HX {
    public static VwS EYQ(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.Td.VwS vwS, com.bytedance.sdk.component.adexpress.dynamic.Td.tp tpVar, com.bytedance.sdk.component.adexpress.mZx.pi piVar) {
        String strLRN;
        String strXN;
        tp tpVar2;
        if (context == null || dynamicBaseWidget == null || vwS == null) {
            return null;
        }
        strLRN = vwS.lRN();
        strXN = piVar.XN();
        strLRN.hashCode();
        switch (strLRN) {
            case "0":
                return new Kbd(context, dynamicBaseWidget, vwS);
            case "2":
                return new Td(context, dynamicBaseWidget, vwS);
            case "5":
                if (vwS.Dal() == 1) {
                    return new UB(context, dynamicBaseWidget, vwS, vwS.GfQ());
                }
                return new KO(context, dynamicBaseWidget, vwS);
            case "6":
            case "11":
                return new pi(context, dynamicBaseWidget, vwS);
            case "7":
            case "14":
                return new MxO(context, dynamicBaseWidget, vwS);
            case "8":
                return new tsL(context, dynamicBaseWidget, vwS);
            case "9":
            case "16":
                return new nWX(context, dynamicBaseWidget, vwS, strLRN, tpVar.EYQ(), tpVar.mZx(), tpVar.Pm());
            case "10":
                return new Pm(context, dynamicBaseWidget, vwS);
            case "12":
                return new KO(context, dynamicBaseWidget, vwS);
            case "13":
                return new UB(context, dynamicBaseWidget, vwS);
            case "17":
            case "18":
                return new hYh(context, dynamicBaseWidget, vwS, strLRN, tpVar);
            case "20":
                return new mZx(context, dynamicBaseWidget, vwS);
            case "22":
                if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                    return new hu(context, dynamicBaseWidget, vwS);
                }
                return new Uc(context, dynamicBaseWidget, vwS);
            case "23":
                if (!com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                    return null;
                }
                tpVar2 = new tp(context, dynamicBaseWidget, vwS, strXN + "static/lotties/202327swiper-up-star/click.json");
                break;
            case "24":
                if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                    return new EYQ(context, dynamicBaseWidget, vwS);
                }
                return new hu(context, dynamicBaseWidget, vwS);
            case "25":
                if (!com.bytedance.sdk.component.adexpress.Pm.mZx()) {
                    return null;
                }
                tpVar2 = new tp(context, dynamicBaseWidget, vwS, strXN + "static/lotties/gesture-slide.json");
                break;
            case "29":
                return new IPb(context, dynamicBaseWidget, vwS, tpVar.EYQ(), tpVar.mZx(), tpVar.Pm());
            default:
                return null;
        }
        return tpVar2;
    }
}
