package com.my.target;

import android.content.Context;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class z6 extends p<a7> {
    public static z6 a() {
        return new z6();
    }

    @Override // com.my.target.p
    public a7 a(a7 a7Var, j jVar, n nVar, Context context) {
        if (jVar.getCachePeriod() > 0 && !a7Var.m() && a7Var.j() != null) {
            l1 l1VarA = l1.a(context);
            int slotId = jVar.getSlotId();
            if (l1VarA != null) {
                l1VarA.a(slotId, a7Var.j().toString(), false);
            } else {
                ba.a("NativeAppwallAdResultProcessor: Unable to open disk cache and save data for slotId " + slotId);
            }
        }
        int cachePolicy = jVar.getCachePolicy();
        if (cachePolicy == 0 || cachePolicy == 1) {
            ArrayList arrayList = new ArrayList();
            for (u6 u6Var : a7Var.c()) {
                ImageData statusIcon = u6Var.getStatusIcon();
                ImageData coinsIcon = u6Var.getCoinsIcon();
                ImageData gotoAppIcon = u6Var.getGotoAppIcon();
                ImageData icon = u6Var.getIcon();
                ImageData labelIcon = u6Var.getLabelIcon();
                ImageData bubbleIcon = u6Var.getBubbleIcon();
                ImageData itemHighlightIcon = u6Var.getItemHighlightIcon();
                ImageData crossNotifIcon = u6Var.getCrossNotifIcon();
                if (statusIcon != null) {
                    arrayList.add(statusIcon);
                }
                if (coinsIcon != null) {
                    arrayList.add(coinsIcon);
                }
                if (gotoAppIcon != null) {
                    arrayList.add(gotoAppIcon);
                }
                if (icon != null) {
                    arrayList.add(icon);
                }
                if (labelIcon != null) {
                    arrayList.add(labelIcon);
                }
                if (bubbleIcon != null) {
                    arrayList.add(bubbleIcon);
                }
                if (itemHighlightIcon != null) {
                    arrayList.add(itemHighlightIcon);
                }
                if (crossNotifIcon != null) {
                    arrayList.add(crossNotifIcon);
                }
            }
            if (arrayList.size() > 0) {
                m2.a(arrayList).a(jVar.getSlotId(), (String) null).c(context);
            }
        }
        return a7Var;
    }
}
