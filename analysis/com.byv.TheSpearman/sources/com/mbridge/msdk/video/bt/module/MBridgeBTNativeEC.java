package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.video.module.a.a.e;
import com.mbridge.msdk.video.module.a.a.j;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.a;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTNativeEC extends MBridgeBTNativeECDiff {
    private TextView A;
    private StarLevelView B;
    private boolean C;
    private boolean D;
    private int E;
    private Runnable F;
    private boolean G;
    private View H;
    private String I;
    private k J;
    private WebView K;
    private ViewGroup p;
    private ViewGroup q;
    private RelativeLayout r;
    private ImageView s;
    private RoundImageView t;
    private ImageView u;
    private ImageView v;
    private ImageView w;
    private ImageView x;
    private TextView y;
    private TextView z;

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    public MBridgeBTNativeEC(Context context) {
        super(context);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    public MBridgeBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setUnitId(String str) {
        this.I = str;
    }

    public void setJSCommon(k kVar) {
        this.J = kVar;
    }

    public void setCreateWebView(WebView webView) {
        this.K = webView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws JSONException {
        super.onAttachedToWindow();
        if (this.F == null) {
            this.F = new Runnable() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeBTNativeEC.this.D = true;
                    if (MBridgeBTNativeEC.this.H != null) {
                        MBridgeBTNativeEC.this.H.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.F;
        if (runnable != null) {
            postDelayed(runnable, this.E * 1000);
        }
        if (!this.h && this.K != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.I);
                jSONObject.put("data", jSONObject2);
                ad.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e) {
                ad.a(BTBaseView.TAG, e.getMessage());
            }
            g.a().a(this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.K != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.I);
                jSONObject3.put("data", jSONObject4);
                ad.a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e2) {
                ad.a(BTBaseView.TAG, e2.getMessage());
            }
            g.a().a(this.K, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.F;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void preLoadData() {
        Bitmap bitmapBlurBitmap;
        try {
            if (this.b == null || !this.h) {
                return;
            }
            if (this.b.getCbd() > -2) {
                this.E = this.b.getCbd();
            } else if (this.e != null) {
                this.E = this.e.p();
            }
            b.a(this.f3569a.getApplicationContext()).a(this.b.getImageUrl(), new e(this.t, this.b, this.I));
            b.a(this.f3569a.getApplicationContext()).a(this.b.getIconUrl(), new j(this.u, ai.a(c.m().c(), 8.0f)));
            this.y.setText(this.b.getAppName());
            this.z.setText(this.b.getAppDesc());
            this.A.setText(this.b.getNumberRating() + ")");
            this.B.removeAllViews();
            if (com.mbridge.msdk.f.b.a()) {
                setChinaCTAData(this.b);
            }
            double rating = this.b.getRating();
            if (rating <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                rating = 5.0d;
            }
            this.B.initScore(rating);
            if (Build.VERSION.SDK_INT < 17) {
                this.s.setVisibility(8);
                return;
            }
            try {
                Bitmap bitmapA = a(this.t.getDrawable());
                if (bitmapA != null && (bitmapBlurBitmap = blurBitmap(bitmapA)) != null) {
                    this.s.setImageBitmap(bitmapBlurBitmap);
                }
            } catch (Throwable unused) {
                this.s.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.b.getendcard_url()) && this.b.getendcard_url().contains("alecfc=1")) {
                this.C = true;
            }
            if (!TextUtils.isEmpty(this.b.getendcard_url()) && this.b.getendcard_url().contains("wlgo=1")) {
                this.G = true;
            }
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", c.m().g())));
            } else {
                this.v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", c.m().g())));
            }
            if (!this.G) {
                this.v.setVisibility(4);
                this.x.setVisibility(4);
            }
            ai.a(2, this.w, this.b, this.f3569a, true, null);
            if (this.D) {
                return;
            }
            this.H.setVisibility(8);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.g = configuration.orientation;
        if (this.g == 2) {
            removeView(this.p);
            a(this.q);
        } else {
            removeView(this.q);
            a(this.p);
        }
    }

    private void a(View view) {
        if (view == null) {
            init(this.f3569a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        b(view);
        a();
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    protected final void a() {
        if (this.h) {
            this.r.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    if (MBridgeBTNativeEC.this.C) {
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 1, view.getContext());
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                    }
                }
            });
            this.H.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    if (MBridgeBTNativeEC.this.K != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", MBridgeBTNativeEC.this.d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, MBridgeBTNativeEC.this.I);
                            jSONObject.put("data", jSONObject2);
                            ad.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                        } catch (JSONException e) {
                            ad.a(BTBaseView.TAG, e.getMessage());
                        }
                        g.a().a(MBridgeBTNativeEC.this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            });
            this.ctaView.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.4
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) throws JSONException {
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 0, view.getContext());
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.u.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.5
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) throws JSONException {
                    if (!com.mbridge.msdk.f.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 0, view.getContext());
                    }
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.t.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.6
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) throws JSONException {
                    if (!com.mbridge.msdk.f.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                        MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, 0, view.getContext());
                    }
                    MBridgeBTNativeEC.a(MBridgeBTNativeEC.this, view.getX(), view.getY());
                }
            });
        }
    }

    private boolean b(View view) {
        try {
            this.r = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.s = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            this.t = (RoundImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.u = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.v = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.w = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.y = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.z = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            this.A = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.B = (StarLevelView) view.findViewById(findID("mbridge_sv_starlevel"));
            this.H = view.findViewById(findID("mbridge_iv_close"));
            this.ctaView = view.findViewById(findID("mbridge_tv_cta"));
            this.x = (ImageView) view.findViewById(findID("mbridge_iv_logo"));
            return isNotNULL(this.s, this.t, this.u, this.y, this.z, this.A, this.B, this.H, this.ctaView);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript renderScriptCreate = RenderScript.create(this.f3569a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            bitmap.recycle();
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    private Bitmap a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
            return null;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        boolean zB;
        int iFindLayout = findLayout(isLandscape() ? "mbridge_reward_endcard_native_land" : "mbridge_reward_endcard_native_hor");
        if (iFindLayout > 0) {
            if (isLandscape()) {
                ViewGroup viewGroup = (ViewGroup) this.f.inflate(iFindLayout, (ViewGroup) null);
                this.q = viewGroup;
                addView(viewGroup);
                zB = b(this.q);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f.inflate(iFindLayout, (ViewGroup) null);
                this.p = viewGroup2;
                addView(viewGroup2);
                zB = b(this.p);
            }
            this.h = zB;
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:3:0x0001, B:4:0x0006, B:12:0x001a, B:14:0x001e, B:16:0x0024, B:17:0x0029, B:19:0x002e, B:21:0x0035, B:11:0x0016), top: B:25:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void a(com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC r2, int r3, android.content.Context r4) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L13 org.json.JSONException -> L15
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.j     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            org.json.JSONObject r3 = r2.a(r3)     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            r1.put(r0, r3)     // Catch: org.json.JSONException -> L10 java.lang.Throwable -> L13
            goto L1a
        L10:
            r3 = move-exception
            r0 = r1
            goto L16
        L13:
            r2 = move-exception
            goto L39
        L15:
            r3 = move-exception
        L16:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L13
            r1 = r0
        L1a:
            com.mbridge.msdk.video.signal.a.k r3 = r2.J     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L42
            boolean r3 = com.mbridge.msdk.f.b.a()     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L29
            com.mbridge.msdk.video.signal.a.k r3 = r2.J     // Catch: java.lang.Throwable -> L13
            r2.doChinaJumpClick(r4, r3)     // Catch: java.lang.Throwable -> L13
        L29:
            com.mbridge.msdk.video.signal.a.k r2 = r2.J     // Catch: java.lang.Throwable -> L13
            r3 = 1
            if (r1 == 0) goto L33
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L13
            goto L35
        L33:
            java.lang.String r4 = ""
        L35:
            r2.click(r3, r4)     // Catch: java.lang.Throwable -> L13
            goto L42
        L39:
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "BTBaseView"
            com.mbridge.msdk.foundation.tools.ad.a(r3, r2)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.a(com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC, int, android.content.Context):void");
    }

    static /* synthetic */ void a(MBridgeBTNativeEC mBridgeBTNativeEC, float f, float f2) throws JSONException {
        if (mBridgeBTNativeEC.K != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", n);
                jSONObject.put("id", mBridgeBTNativeEC.d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f));
                jSONObject2.put("y", String.valueOf(f2));
                jSONObject.put("data", jSONObject2);
                g.a().a(mBridgeBTNativeEC.K, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                d.c().a(mBridgeBTNativeEC.K, "onClicked", mBridgeBTNativeEC.d);
            }
        }
    }
}
