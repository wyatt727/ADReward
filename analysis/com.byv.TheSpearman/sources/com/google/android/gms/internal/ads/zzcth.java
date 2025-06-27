package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcth extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcth(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcth zza(Context context, View view, zzffn zzffnVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcth zzcthVar = new zzcth(context);
        if (!zzffnVar.zzv.isEmpty() && (resources = zzcthVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzffo zzffoVar = (zzffo) zzffnVar.zzv.get(0);
            zzcthVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzffoVar.zza * displayMetrics.density), (int) (zzffoVar.zzb * displayMetrics.density)));
        }
        zzcthVar.zzb = view;
        zzcthVar.addView(view);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzcce.zzb(zzcthVar, zzcthVar);
        com.google.android.gms.ads.internal.zzu.zzx();
        zzcce.zza(zzcthVar, zzcthVar);
        JSONObject jSONObject = zzffnVar.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(zzcthVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcthVar.zzc(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcthVar.zzc(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcthVar.addView(relativeLayout);
        return zzcthVar;
    }

    private final int zzb(double d) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzb = zzb(jSONObject.optDouble("padding", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        textView.setPadding(0, iZzb, 0, iZzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
