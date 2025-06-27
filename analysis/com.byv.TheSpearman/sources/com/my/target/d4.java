package com.my.target;

import android.content.Context;
import android.graphics.Point;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class d4 extends p<e4> {
    public static d4 a() {
        return new d4();
    }

    public final ImageData a(List<ImageData> list, int i, int i2) {
        float width;
        float f;
        ImageData imageData = null;
        if (list.size() == 0) {
            return null;
        }
        if (i2 == 0 || i == 0) {
            ba.a("InterstitialAdResultProcessor: Display size is zero");
            return null;
        }
        float f2 = i;
        float f3 = i2;
        float f4 = f2 / f3;
        float f5 = 0.0f;
        for (ImageData imageData2 : list) {
            if (imageData2.getWidth() > 0 && imageData2.getHeight() > 0) {
                float width2 = imageData2.getWidth() / imageData2.getHeight();
                if (f4 < width2) {
                    width = imageData2.getWidth();
                    if (width > f2) {
                        width = f2;
                    }
                    f = width / width2;
                } else {
                    float height = imageData2.getHeight();
                    if (height > f3) {
                        height = f3;
                    }
                    float f6 = height;
                    width = width2 * height;
                    f = f6;
                }
                float f7 = f * width;
                if (f7 <= f5) {
                    break;
                }
                imageData = imageData2;
                f5 = f7;
            }
        }
        return imageData;
    }

    @Override // com.my.target.p
    public e4 a(e4 e4Var, j jVar, n nVar, Context context) {
        m mVar;
        p3 p3VarC = e4Var.c();
        if (p3VarC == null) {
            e5 e5VarB = e4Var.b();
            if (e5VarB != null && e5VarB.b()) {
                return e4Var;
            }
            mVar = m.r;
        } else {
            if (a(context, jVar, p3VarC)) {
                return e4Var;
            }
            mVar = m.s;
        }
        nVar.a(mVar);
        return null;
    }

    public final void a(u3 u3Var, j jVar, Context context) {
        ArrayList arrayList = new ArrayList();
        c adChoices = u3Var.getAdChoices();
        if (adChoices != null) {
            arrayList.add(adChoices.c());
        }
        ImageData closeIcon = u3Var.getCloseIcon();
        if (closeIcon != null) {
            arrayList.add(closeIcon);
        }
        m2.a(arrayList).a(jVar.getSlotId(), u3Var.getId()).c(context);
    }

    public final boolean a(Context context, j jVar, p3 p3Var) {
        if (p3Var instanceof z3) {
            return a((z3) p3Var, jVar, context);
        }
        if (p3Var instanceof w3) {
            return a((w3) p3Var, jVar, context);
        }
        if (!(p3Var instanceof u3)) {
            return false;
        }
        a((u3) p3Var, jVar, context);
        return true;
    }

    public final boolean a(w3 w3Var, j jVar, Context context) {
        ImageData closeIcon;
        ArrayList arrayList = new ArrayList();
        Point pointB = ca.b(context);
        ImageData imageDataA = a(w3Var.getPortraitImages(), Math.min(pointB.x, pointB.y), Math.max(pointB.x, pointB.y));
        if (imageDataA != null) {
            arrayList.add(imageDataA);
            w3Var.setOptimalPortraitImage(imageDataA);
        }
        ImageData imageDataA2 = a(w3Var.getLandscapeImages(), Math.max(pointB.x, pointB.y), Math.min(pointB.x, pointB.y));
        if (imageDataA2 != null) {
            arrayList.add(imageDataA2);
            w3Var.setOptimalLandscapeImage(imageDataA2);
        }
        if ((imageDataA != null || imageDataA2 != null) && (closeIcon = w3Var.getCloseIcon()) != null) {
            arrayList.add(closeIcon);
        }
        c adChoices = w3Var.getAdChoices();
        if (adChoices != null) {
            arrayList.add(adChoices.c());
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        m2.a(arrayList).a(jVar.getSlotId(), w3Var.getId()).c(context);
        if (imageDataA == null || imageDataA.getBitmap() == null) {
            return (imageDataA2 == null || imageDataA2.getBitmap() == null) ? false : true;
        }
        return true;
    }

    public final boolean a(z3 z3Var, j jVar, Context context) {
        ArrayList arrayList = new ArrayList();
        b5<VideoData> videoBanner = z3Var.getVideoBanner();
        if (videoBanner != null) {
            if (videoBanner.getPreview() != null) {
                arrayList.add(videoBanner.getPreview());
            }
            VideoData videoData = (VideoData) videoBanner.getMediaData();
            if (videoData != null && videoData.isCacheable()) {
                String strC = d2.a().a(videoData.getUrl(), null, context).c();
                if (strC != null) {
                    videoData.setData(strC);
                } else if (z3Var.isVideoRequired()) {
                    return false;
                }
            }
        }
        if (z3Var.getImage() != null) {
            arrayList.add(z3Var.getImage());
        }
        if (z3Var.getIcon() != null) {
            arrayList.add(z3Var.getIcon());
        }
        if (z3Var.getCloseIcon() != null) {
            arrayList.add(z3Var.getCloseIcon());
        }
        if (z3Var.getAdIcon() != null) {
            arrayList.add(z3Var.getAdIcon());
        }
        if (z3Var.getAdChoices() != null) {
            arrayList.add(z3Var.getAdChoices().c());
        }
        ImageData imageDataI = z3Var.getPromoStyleSettings().i();
        if (imageDataI != null) {
            arrayList.add(imageDataI);
        }
        List<r3> interstitialAdCards = z3Var.getInterstitialAdCards();
        if (!interstitialAdCards.isEmpty()) {
            Iterator<r3> it = interstitialAdCards.iterator();
            while (it.hasNext()) {
                ImageData image = it.next().getImage();
                if (image != null) {
                    arrayList.add(image);
                }
            }
        }
        p3 endCard = z3Var.getEndCard();
        if (endCard != null && !a(context, jVar, endCard)) {
            z3Var.setEndCard(null);
        }
        if (arrayList.size() <= 0) {
            return true;
        }
        m2.a(arrayList).a(jVar.getSlotId(), z3Var.getId()).c(context);
        return true;
    }
}
