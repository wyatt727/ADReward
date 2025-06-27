package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class hq {

    /* renamed from: a, reason: collision with root package name */
    public final Set f509a = new HashSet();
    public final Set b = new HashSet();
    private Uri c;
    private Uri d;
    private int e;
    private int f;

    public String toString() {
        return "VastIndustryIcon{imageUri='" + d() + "', clickUri='" + b() + "', width=" + f() + ", height=" + c() + "}";
    }

    public static hq a(fs fsVar, com.applovin.impl.sdk.k kVar) throws NumberFormatException {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            fs fsVarC = fsVar.c("StaticResource");
            if (fsVarC != null && URLUtil.isValidUrl(fsVarC.d())) {
                hq hqVar = new hq();
                hqVar.c = Uri.parse(fsVarC.d());
                fs fsVarB = fsVar.b("IconClickThrough");
                if (fsVarB != null && URLUtil.isValidUrl(fsVarB.d())) {
                    hqVar.d = Uri.parse(fsVarB.d());
                }
                String str = (String) fsVar.a().get("width");
                int i = 0;
                int i2 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
                String str2 = (String) fsVar.a().get("height");
                if (str2 != null && Integer.parseInt(str2) > 0) {
                    i = Integer.parseInt(str2);
                }
                int iIntValue = ((Integer) kVar.a(oj.W4)).intValue();
                if (i2 > 0 && i > 0) {
                    double d = i2 / i;
                    int iMin = Math.min(Math.max(i2, i), iIntValue);
                    if (i2 >= i) {
                        hqVar.e = iMin;
                        hqVar.f = (int) (iMin / d);
                    } else {
                        hqVar.f = iMin;
                        hqVar.e = (int) (iMin * d);
                    }
                } else {
                    hqVar.f = iIntValue;
                    hqVar.e = iIntValue;
                }
                return hqVar;
            }
            kVar.L();
            if (!com.applovin.impl.sdk.t.a()) {
                return null;
            }
            kVar.L().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri d() {
        return this.c;
    }

    public Uri b() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public Set e() {
        return this.b;
    }

    public Set a() {
        return this.f509a;
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.k kVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, kVar);
        return imageView;
    }
}
