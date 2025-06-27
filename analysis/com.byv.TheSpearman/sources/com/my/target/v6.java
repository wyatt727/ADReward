package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class v6 {

    /* renamed from: a, reason: collision with root package name */
    public final a7 f4161a;
    public final a1 b;

    public v6(a7 a7Var, s sVar, j jVar, Context context) {
        this.f4161a = a7Var;
        this.b = a1.a(sVar, jVar, context);
    }

    public static v6 a(a7 a7Var, s sVar, j jVar, Context context) {
        return new v6(a7Var, sVar, jVar, context);
    }

    public void a(JSONObject jSONObject, u6 u6Var) {
        this.b.a(jSONObject, u6Var);
        u6Var.setHasNotification(jSONObject.optBoolean("hasNotification", u6Var.isHasNotification()));
        u6Var.setBanner(jSONObject.optBoolean("Banner", u6Var.isBanner()));
        u6Var.setRequireCategoryHighlight(jSONObject.optBoolean("RequireCategoryHighlight", u6Var.isRequireCategoryHighlight()));
        u6Var.setItemHighlight(jSONObject.optBoolean("ItemHighlight", u6Var.isItemHighlight()));
        u6Var.setMain(jSONObject.optBoolean("Main", u6Var.isMain()));
        u6Var.setRequireWifi(jSONObject.optBoolean("RequireWifi", u6Var.isRequireWifi()));
        u6Var.setSubItem(jSONObject.optBoolean("subitem", u6Var.isSubItem()));
        u6Var.setBubbleId(jSONObject.optString("bubble_id", u6Var.getBubbleId()));
        u6Var.setLabelType(jSONObject.optString("labelType", u6Var.getLabelType()));
        u6Var.setStatus(jSONObject.optString("status", u6Var.getStatus()));
        u6Var.setMrgsId(jSONObject.optInt("mrgs_id"));
        u6Var.setCoins(jSONObject.optInt("coins"));
        u6Var.setCoinsIconBgColor(x4.a(jSONObject, "coins_icon_bgcolor", u6Var.getCoinsIconBgColor()));
        u6Var.setCoinsIconTextColor(x4.a(jSONObject, "coins_icon_textcolor", u6Var.getCoinsIconTextColor()));
        String strOptString = jSONObject.optString("icon_hd");
        if (!TextUtils.isEmpty(strOptString)) {
            u6Var.setIcon(ImageData.newImageData(strOptString));
        }
        String strOptString2 = jSONObject.optString("coins_icon_hd");
        if (!TextUtils.isEmpty(strOptString2)) {
            u6Var.setCoinsIcon(ImageData.newImageData(strOptString2));
        }
        String strOptString3 = jSONObject.optString("cross_notif_icon_hd");
        if (!TextUtils.isEmpty(strOptString3)) {
            u6Var.setCrossNotifIcon(ImageData.newImageData(strOptString3));
        }
        String strD = this.f4161a.d();
        if (!TextUtils.isEmpty(strD)) {
            u6Var.setBubbleIcon(ImageData.newImageData(strD));
        }
        String strE = this.f4161a.e();
        if (!TextUtils.isEmpty(strE)) {
            u6Var.setGotoAppIcon(ImageData.newImageData(strE));
        }
        String strH = this.f4161a.h();
        if (!TextUtils.isEmpty(strH)) {
            u6Var.setLabelIcon(ImageData.newImageData(strH));
        }
        String status = u6Var.getStatus();
        if (status != null) {
            String strA = this.f4161a.a(status);
            if (!TextUtils.isEmpty(strA)) {
                u6Var.setStatusIcon(ImageData.newImageData(strA));
            }
        }
        String strG = this.f4161a.g();
        if (!u6Var.isItemHighlight() || TextUtils.isEmpty(strG)) {
            return;
        }
        u6Var.setItemHighlightIcon(ImageData.newImageData(strG));
    }
}
