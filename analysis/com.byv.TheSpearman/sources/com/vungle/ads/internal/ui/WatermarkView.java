package com.vungle.ads.internal.ui;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.Base64;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatermarkView.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/ui/WatermarkView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", MBridgeConstans.EXTRA_KEY_WM, "", "(Landroid/content/Context;Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public class WatermarkView extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatermarkView(Context context, String watermark) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        byte[] overlayBytes = Base64.decode(watermark, 0);
        Intrinsics.checkNotNullExpressionValue(overlayBytes, "overlayBytes");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(overlayBytes, 0, overlayBytes.length));
        bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(bitmapDrawable);
        } else {
            setBackgroundDrawable(bitmapDrawable);
        }
        setClickable(false);
        setFocusable(false);
    }
}
