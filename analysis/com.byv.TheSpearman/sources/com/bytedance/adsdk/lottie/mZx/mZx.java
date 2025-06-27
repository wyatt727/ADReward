package com.bytedance.adsdk.lottie.mZx;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.lottie.HX;
import com.bytedance.adsdk.lottie.IPb.IPb;
import com.bytedance.adsdk.lottie.Pm;
import java.io.IOException;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes2.dex */
public class mZx {
    private static final Object EYQ = new Object();
    private final Map<String, HX> Kbd;
    private Pm Pm;
    private final String Td;
    private final Context mZx;

    public mZx(Drawable.Callback callback, String str, Pm pm, Map<String, HX> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.Td = str + '/';
        } else {
            this.Td = str;
        }
        this.Kbd = map;
        EYQ(pm);
        if (!(callback instanceof View)) {
            this.mZx = null;
        } else {
            this.mZx = ((View) callback).getContext().getApplicationContext();
        }
    }

    public void EYQ(Pm pm) {
        this.Pm = pm;
    }

    public Bitmap EYQ(String str, Bitmap bitmap) {
        if (bitmap == null) {
            HX hx = this.Kbd.get(str);
            Bitmap bitmapIPb = hx.IPb();
            hx.EYQ(null);
            return bitmapIPb;
        }
        Bitmap bitmapIPb2 = this.Kbd.get(str).IPb();
        mZx(str, bitmap);
        return bitmapIPb2;
    }

    public Bitmap EYQ(String str) {
        HX hx = this.Kbd.get(str);
        if (hx == null) {
            return null;
        }
        Bitmap bitmapIPb = hx.IPb();
        if (bitmapIPb != null) {
            return bitmapIPb;
        }
        Pm pm = this.Pm;
        if (pm != null) {
            return pm.EYQ(hx);
        }
        Context context = this.mZx;
        if (context == null) {
            return null;
        }
        String strPm = hx.Pm();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = Opcodes.IF_ICMPNE;
        if (strPm.startsWith("data:") && strPm.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strPm.substring(strPm.indexOf(44) + 1), 0);
                return mZx(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.Td)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.Td + strPm), null, options);
                if (bitmapDecodeStream == null) {
                    return null;
                }
                return mZx(str, IPb.EYQ(bitmapDecodeStream, hx.EYQ(), hx.mZx()));
            } catch (IllegalArgumentException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean EYQ(Context context) {
        return (context == null && this.mZx == null) || this.mZx.equals(context);
    }

    private Bitmap mZx(String str, Bitmap bitmap) {
        synchronized (EYQ) {
            this.Kbd.get(str).EYQ(bitmap);
        }
        return bitmap;
    }
}
