package com.my.target;

import android.content.Context;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class p6 extends p<q6> {
    public static p6 a() {
        return new p6();
    }

    @Override // com.my.target.p
    public q6 a(q6 q6Var, j jVar, n nVar, Context context) {
        List<d6> listC = q6Var.c();
        if (listC.isEmpty()) {
            e5 e5VarB = q6Var.b();
            if (e5VarB != null && e5VarB.b()) {
                return q6Var;
            }
            nVar.a(m.r);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int cachePolicy = jVar.getCachePolicy();
        boolean z = cachePolicy == 0 || cachePolicy == 1;
        for (d6 d6Var : listC) {
            b5<VideoData> videoBanner = d6Var.getVideoBanner();
            if (videoBanner != null) {
                VideoData videoData = (VideoData) videoBanner.getMediaData();
                boolean z2 = cachePolicy == 0 || cachePolicy == 2;
                if (videoData != null && z2 && videoData.isCacheable()) {
                    videoData.setData(d2.a().a(videoData.getUrl(), null, context).c());
                }
            }
            ImageData image = d6Var.getImage();
            if (image != null) {
                image.useCache(true);
                if (z) {
                    arrayList.add(image);
                }
            }
            ImageData icon = d6Var.getIcon();
            if (icon != null) {
                icon.useCache(true);
                if (z) {
                    arrayList.add(icon);
                }
            }
            Iterator<f6> it = d6Var.getNativeAdCards().iterator();
            while (it.hasNext()) {
                ImageData image2 = it.next().getImage();
                if (image2 != null) {
                    image2.useCache(true);
                    if (z) {
                        arrayList.add(image2);
                    }
                }
            }
            c adChoices = d6Var.getAdChoices();
            if (adChoices != null) {
                ImageData imageDataC = adChoices.c();
                imageDataC.useCache(true);
                if (z) {
                    arrayList.add(imageDataC);
                }
            }
            ImageData ctcIcon = d6Var.getCtcIcon();
            if (ctcIcon != null) {
                arrayList.add(ctcIcon);
            }
        }
        if (arrayList.size() > 0) {
            m2.a(arrayList).a(jVar.getSlotId(), (String) null).c(context);
        }
        return q6Var;
    }
}
