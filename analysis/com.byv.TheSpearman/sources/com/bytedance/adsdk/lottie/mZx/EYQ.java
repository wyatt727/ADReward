package com.bytedance.adsdk.lottie.mZx;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.lottie.Td;
import com.bytedance.adsdk.lottie.Td.VwS;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager.java */
/* loaded from: classes2.dex */
public class EYQ {
    private Td Kbd;
    private final AssetManager Pm;
    private final VwS<String> EYQ = new VwS<>();
    private final Map<VwS<String>, Typeface> mZx = new HashMap();
    private final Map<String, Typeface> Td = new HashMap();
    private String IPb = ".ttf";

    public EYQ(Drawable.Callback callback, Td td) {
        this.Kbd = td;
        if (!(callback instanceof View)) {
            this.Pm = null;
        } else {
            this.Pm = ((View) callback).getContext().getAssets();
        }
    }

    public void EYQ(Td td) {
        this.Kbd = td;
    }

    public void EYQ(String str) {
        this.IPb = str;
    }

    public Typeface EYQ(com.bytedance.adsdk.lottie.Td.Td td) {
        this.EYQ.EYQ(td.EYQ(), td.Td());
        Typeface typeface = this.mZx.get(this.EYQ);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceEYQ = EYQ(mZx(td), td.Td());
        this.mZx.put(this.EYQ, typefaceEYQ);
        return typefaceEYQ;
    }

    private Typeface mZx(com.bytedance.adsdk.lottie.Td.Td td) {
        String strEYQ = td.EYQ();
        Typeface typeface = this.Td.get(strEYQ);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceCreateFromAsset = null;
        String strTd = td.Td();
        String strMZx = td.mZx();
        Td td2 = this.Kbd;
        if (td2 != null && (typefaceCreateFromAsset = td2.EYQ(strEYQ, strTd, strMZx)) == null) {
            typefaceCreateFromAsset = this.Kbd.EYQ(strEYQ);
        }
        Td td3 = this.Kbd;
        if (td3 != null && typefaceCreateFromAsset == null) {
            String strMZx2 = td3.mZx(strEYQ, strTd, strMZx);
            if (strMZx2 == null) {
                strMZx2 = this.Kbd.mZx(strEYQ);
            }
            if (strMZx2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.Pm, strMZx2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (td.Pm() != null) {
            return td.Pm();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.Pm, "fonts/" + strEYQ + this.IPb);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.Td.put(strEYQ, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface EYQ(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
