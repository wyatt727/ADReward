package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.shake.a;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.e.g;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.module.a.a.j;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeNativeEndCardView extends MBridgeNativeEndCardViewDiff {
    private LinearLayout A;
    private LinearLayout B;
    private Runnable C;
    private Runnable D;
    private RelativeLayout E;
    private b F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private AlphaAnimation L;
    private int M;
    private int N;
    private int O;
    private int P;
    private Bitmap Q;
    private View R;
    private FeedBackButton S;
    private String T;
    private CampaignUnit U;
    private MBShakeView V;
    private com.mbridge.msdk.shake.b W;
    private MBridgeBaitClickView aa;
    private boolean ab;
    private int ac;
    private String ad;
    private ViewGroup n;
    private ViewGroup o;
    private RelativeLayout p;
    private ImageView q;
    private ImageView r;
    private ImageView s;
    private ImageView t;
    private TextView u;
    private ImageView v;
    private ImageView w;
    private TextView x;
    private TextView y;
    private TextView z;

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    public void setCloseBtnDelay(int i) {
        this.K = i;
    }

    public void setUnitId(String str) {
        this.T = str;
    }

    public MBridgeNativeEndCardView(Context context) {
        super(context);
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = 0;
        this.ab = false;
        this.ac = 1;
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = 0;
        this.ab = false;
        this.ac = 1;
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2, int i3) {
        super(context, attributeSet, z, i, z2, i2, i3);
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = 0;
        this.ab = false;
        this.ac = 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i;
        int i2;
        int i3;
        MBridgeBaitClickView mBridgeBaitClickView;
        super.onAttachedToWindow();
        if (this.C == null) {
            this.C = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeNativeEndCardView.this.H = true;
                    if (MBridgeNativeEndCardView.this.R != null) {
                        MBridgeNativeEndCardView.this.R.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.C;
        if (runnable != null) {
            postDelayed(runnable, this.K * 1000);
            if (!this.I) {
                this.I = true;
            }
            try {
                if (this.b != null && this.b.isDynamicView()) {
                    String endScreenUrl = this.b.getendcard_url();
                    if (TextUtils.isEmpty(endScreenUrl)) {
                        endScreenUrl = this.b.getEndScreenUrl();
                    }
                    String strA = ao.a(endScreenUrl, "alac");
                    if (!TextUtils.isEmpty(strA) && strA.equals("1") && this.b.getAutoShowStoreMiniCard() != 1) {
                        postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.8
                            @Override // java.lang.Runnable
                            public final void run() throws JSONException {
                                MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                                MBridgeNativeEndCardView.this.b.setClickType(1);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 2);
                            }
                        }, 1000L);
                    }
                }
            } catch (Throwable th) {
                ad.b(MBridgeBaseView.TAG, th.getMessage());
            }
        }
        try {
            if (this.b != null && this.b.isDynamicView()) {
                String endScreenUrl2 = this.b.getendcard_url();
                if (TextUtils.isEmpty(endScreenUrl2)) {
                    endScreenUrl2 = this.b.getEndScreenUrl();
                }
                String strA2 = ao.a(endScreenUrl2, "bait_click");
                try {
                    i3 = Integer.parseInt(strA2);
                } catch (Throwable th2) {
                    ad.b(MBridgeBaseView.TAG, th2.getMessage());
                    i3 = 1;
                }
                if (!TextUtils.isEmpty(strA2) && i3 != 0 && (mBridgeBaitClickView = this.aa) != null) {
                    mBridgeBaitClickView.setVisibility(0);
                    this.aa.init(1342177280, i3);
                    if (this.b.getEcTemplateId() == 1302) {
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setColor(1342177280);
                        gradientDrawable.setStroke(0, -65536);
                        gradientDrawable.setCornerRadius(25.0f);
                        this.aa.setBackground(gradientDrawable);
                    }
                    this.aa.startAnimation();
                    this.aa.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) throws JSONException {
                            MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    });
                }
            }
        } catch (Throwable th3) {
            ad.b(MBridgeBaseView.TAG, th3.getMessage());
        }
        try {
            if (this.b != null && this.b.isDynamicView()) {
                String endScreenUrl3 = this.b.getendcard_url();
                if (TextUtils.isEmpty(endScreenUrl3)) {
                    endScreenUrl3 = this.b.getEndScreenUrl();
                }
                String strA3 = ao.a(endScreenUrl3, "shake_show");
                String strA4 = ao.a(endScreenUrl3, "shake_strength");
                String strA5 = ao.a(endScreenUrl3, "shake_time");
                if (!TextUtils.isEmpty(strA3) && strA3.equals("1") && this.V == null) {
                    MBridgeBaitClickView mBridgeBaitClickView2 = this.aa;
                    if (mBridgeBaitClickView2 != null) {
                        mBridgeBaitClickView2.setVisibility(8);
                    }
                    MBShakeView mBShakeView = new MBShakeView(getContext());
                    this.V = mBShakeView;
                    mBShakeView.initView(this.b.getAdCall(), true);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    if (!isLandscape()) {
                        layoutParams.addRule(2, filterFindViewId(this.ab, "mbridge_iv_logo"));
                        layoutParams.addRule(14);
                        this.V.setPadding(0, 0, 0, ai.a(getContext(), 20.0f));
                    } else {
                        layoutParams.addRule(13);
                    }
                    this.V.setLayoutParams(layoutParams);
                    RelativeLayout relativeLayout = this.p;
                    if (relativeLayout != null && relativeLayout.isShown()) {
                        this.p.addView(this.V);
                        if (this.ctaView != null) {
                            this.ctaView.setVisibility(4);
                        }
                        this.ctaView.setVisibility(4);
                        this.V.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) throws JSONException {
                                MBridgeNativeEndCardView.this.b.setTriggerClickSource(5);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                            }
                        });
                        int i4 = 10;
                        if (!TextUtils.isEmpty(strA4) && (i2 = Integer.parseInt(strA4)) > 0) {
                            i4 = i2;
                        }
                        int i5 = 5000;
                        if (!TextUtils.isEmpty(strA5) && (i = Integer.parseInt(strA5)) > 0) {
                            i5 = i * 1000;
                        }
                        this.W = new com.mbridge.msdk.shake.b(i4, i5) { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.6
                            @Override // com.mbridge.msdk.shake.b
                            public final void a() throws JSONException {
                                if ((com.mbridge.msdk.f.b.a() && MBridgeNativeEndCardView.this.checkChinaShakeState()) || MBridgeNativeEndCardView.this.J || !MBridgeNativeEndCardView.this.I) {
                                    return;
                                }
                                MBridgeNativeEndCardView.this.g = 0.0f;
                                MBridgeNativeEndCardView.this.h = 0.0f;
                                MBridgeNativeEndCardView.this.b.setTriggerClickSource(5);
                                MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 4);
                            }
                        };
                        a.a().a(this.W);
                    }
                }
            }
        } catch (Throwable th4) {
            ad.b(MBridgeBaseView.TAG, th4.getMessage());
        }
        try {
            if (this.b != null && this.b.getAutoShowStoreMiniCard() != 0 && !TextUtils.isEmpty(this.b.getDeepLinkURL())) {
                long showStoreMiniCardDelayTime = this.b.getShowStoreMiniCardDelayTime();
                if (showStoreMiniCardDelayTime == 0) {
                    showStoreMiniCardDelayTime = 1;
                }
                if (this.D == null) {
                    this.D = new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.9
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.this.b.setClickType(1);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 2);
                        }
                    };
                }
                postDelayed(this.D, showStoreMiniCardDelayTime * 1000);
            }
        } catch (Throwable th5) {
            ad.b(MBridgeBaseView.TAG, th5.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.C;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.D;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        if (this.W != null) {
            a.a().b(this.W);
            this.W = null;
        }
    }

    public void setLayout() {
        if (!this.i) {
            a();
            return;
        }
        c cVarA = new com.mbridge.msdk.video.dynview.j.c().a(getContext(), this.b, this.j, com.mbridge.msdk.f.b.a() ? "cn_" : "en_");
        this.ac = cVarA.n();
        com.mbridge.msdk.video.dynview.b.a().a(cVarA, new g() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.10
            @Override // com.mbridge.msdk.video.dynview.e.g
            public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                if (aVar != null) {
                    MBridgeNativeEndCardView.this.addView(aVar.a());
                    MBridgeNativeEndCardView.this.ab = aVar.c();
                    if (!MBridgeNativeEndCardView.this.ctaViewCanGet(aVar.a(), MBridgeNativeEndCardView.this.ab)) {
                        MBridgeNativeEndCardView.this.ab = false;
                        MBridgeNativeEndCardView.this.i = false;
                        MBridgeNativeEndCardView.this.a();
                    } else {
                        MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                        mBridgeNativeEndCardView.f = mBridgeNativeEndCardView.b(aVar.a());
                        MBridgeNativeEndCardView.this.b();
                    }
                    if (MBridgeNativeEndCardView.this.b != null) {
                        MBridgeNativeEndCardView.this.b.setECTemplateRenderSucc(MBridgeNativeEndCardView.this.ab);
                    }
                }
            }

            @Override // com.mbridge.msdk.video.dynview.e.g
            public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                ad.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.b());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int iE = e();
        if (iE > 0) {
            this.f = b(iE);
            b();
            if (this.b != null) {
                this.b.setECTemplateRenderSucc(false);
            }
        }
    }

    public void preLoadData(b bVar) {
        ImageView imageView;
        this.F = bVar;
        try {
            if (this.b == null || !this.f) {
                return;
            }
            com.mbridge.msdk.foundation.same.c.b.a(this.f3680a.getApplicationContext()).a(this.b.getImageUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.11
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str, String str2) {
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        if (MBridgeNativeEndCardView.this.r != null) {
                            if (MBridgeNativeEndCardView.this.i) {
                                MBridgeNativeEndCardView.this.r.setBackground(null);
                            }
                            MBridgeNativeEndCardView.this.r.setImageBitmap(bitmap);
                        }
                        MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, bitmap);
                    } catch (Throwable unused) {
                        if (MBridgeNativeEndCardView.this.q != null) {
                            MBridgeNativeEndCardView.this.q.setVisibility(4);
                        }
                    }
                }
            });
            com.mbridge.msdk.foundation.same.c.b.a(this.f3680a.getApplicationContext()).a(this.b.getIconUrl(), new j(this.s, ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 8.0f)));
            this.x.setText(this.b.getAppName());
            if (this.ctaView != null) {
                this.ctaView.setText(this.b.getAdCall());
            }
            TextView textView = this.y;
            if (textView != null) {
                textView.setText(this.b.getAppDesc());
            }
            TextView textView2 = this.z;
            if (textView2 != null) {
                textView2.setText(this.b.getNumberRating() + ")");
            }
            this.A.removeAllViews();
            double rating = this.b.getRating();
            if (rating <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                rating = 5.0d;
            }
            LinearLayout linearLayout = this.A;
            if (linearLayout instanceof StarLevelView) {
                ((StarLevelView) linearLayout).initScore(rating);
            }
            LinearLayout linearLayout2 = this.A;
            if (linearLayout2 instanceof MBridgeLevelLayoutView) {
                ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, this.b.getNumberRating());
            }
            LinearLayout linearLayout3 = this.A;
            if (linearLayout3 instanceof MBStarLevelLayoutView) {
                ((MBStarLevelLayoutView) linearLayout3).setRating((int) rating);
            }
            LinearLayout linearLayout4 = this.B;
            if (linearLayout4 != null && (linearLayout4 instanceof MBHeatLevelLayoutView)) {
                ((MBHeatLevelLayoutView) linearLayout4).setHeatCount(this.b.getNumberRating());
            }
            if (!TextUtils.isEmpty(this.b.getendcard_url()) && this.b.getendcard_url().contains("alecfc=1")) {
                this.G = true;
            }
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.t.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
                this.ad = "广告";
            } else {
                this.t.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
                this.ad = "AD";
            }
            if (this.ac == 0) {
                ImageView imageView2 = this.t;
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                }
                ImageView imageView3 = this.v;
                if (imageView3 != null) {
                    imageView3.setVisibility(4);
                }
                TextView textView3 = this.u;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    this.u.setText(this.ad);
                }
            }
            ai.a(2, this.w, this.b, this.f3680a, true, new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.12
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    MBridgeNativeEndCardView.this.J = true;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    MBridgeNativeEndCardView.this.J = false;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    MBridgeNativeEndCardView.this.J = false;
                }
            });
            if (!this.H) {
                this.R.setVisibility(8);
            }
            if (Build.VERSION.SDK_INT >= 17 || (imageView = this.q) == null) {
                return;
            }
            imageView.setVisibility(8);
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        if (!this.f) {
            this.e.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.L = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        if (this.b == null || !this.b.isDynamicView()) {
            RelativeLayout relativeLayout = this.E;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            this.d = configuration.orientation;
            if (this.d == 2) {
                removeView(this.n);
                a(this.o);
            } else {
                removeView(this.o);
                a(this.n);
            }
        }
    }

    public boolean canBackPress() {
        View view = this.R;
        return view != null && view.getVisibility() == 0;
    }

    public void notifyShowListener() {
        this.e.a(110, "");
    }

    private void a(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.F);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            b(view);
            c();
        }
        f();
    }

    private boolean b(int i) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.c.inflate(i, (ViewGroup) null);
            this.o = viewGroup;
            addView(viewGroup);
            return b(this.o);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.c.inflate(i, (ViewGroup) null);
        this.n = viewGroup2;
        addView(viewGroup2);
        return b(this.n);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected final void c() {
        if (this.f) {
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    if (MBridgeNativeEndCardView.this.G) {
                        MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                        MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 1);
                    }
                }
            });
            this.R.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeNativeEndCardView.this.i) {
                        try {
                            com.mbridge.msdk.video.dynview.moffer.a.a().b();
                        } catch (Exception e) {
                            ad.b(MBridgeBaseView.TAG, e.getMessage());
                        }
                        try {
                            if (MBridgeNativeEndCardView.this.b != null) {
                                String strA = ao.a(MBridgeNativeEndCardView.this.b.getendcard_url(), "ecid");
                                String strA2 = ao.a(MBridgeNativeEndCardView.this.b.getendcard_url(), "mof");
                                d dVar = new d();
                                dVar.a("type", "choseFromTwoClose");
                                dVar.a("endcard_id", strA);
                                dVar.a("mof", strA2);
                                com.mbridge.msdk.video.module.b.a.a("2000103", MBridgeNativeEndCardView.this.b, dVar);
                            }
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    try {
                        d dVar2 = new d();
                        dVar2.a("type", 2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", dVar2);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000134", MBridgeNativeEndCardView.this.b);
                    } catch (Throwable th) {
                        if (MBridgeConstans.DEBUG) {
                            th.printStackTrace();
                        }
                    }
                    MBridgeNativeEndCardView.this.e.a(104, "");
                }
            });
            if (this.ctaView != null) {
                this.ctaView.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.16
                    @Override // com.mbridge.msdk.widget.a
                    protected final void a(View view) throws JSONException {
                        MBridgeNativeEndCardView.this.b.setTriggerClickSource(1);
                        MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                    }
                });
            }
            this.s.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.17
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) throws JSONException {
                    if (MBridgeNativeEndCardView.this.ctaView != null) {
                        if (!com.mbridge.msdk.f.b.a() || MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                            MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    }
                }
            });
            this.r.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.2
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) throws JSONException {
                    if (MBridgeNativeEndCardView.this.ctaView != null) {
                        if (!com.mbridge.msdk.f.b.a() || MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                            MBridgeNativeEndCardView.this.b.setTriggerClickSource(2);
                            MBridgeNativeEndCardView.a(MBridgeNativeEndCardView.this, 0);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(View view) {
        try {
            this.p = (RelativeLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_native_ec_layout"));
            this.r = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_adbanner"));
            this.s = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_icon"));
            this.t = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_flag"));
            this.u = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_flag"));
            this.v = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_logo"));
            this.w = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_link"));
            this.x = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_apptitle"));
            this.A = (LinearLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_sv_starlevel"));
            this.B = (LinearLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_sv_heat_count_level"));
            this.R = view.findViewById(filterFindViewId(this.ab, "mbridge_iv_close"));
            this.ctaView = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_cta"));
            this.S = (FeedBackButton) view.findViewById(filterFindViewId(this.ab, "mbridge_native_endcard_feed_btn"));
            this.E = (RelativeLayout) view.findViewById(filterFindViewId(this.ab, "mbridge_native_ec_controller"));
            this.q = (ImageView) view.findViewById(filterFindViewId(this.ab, "mbridge_iv_adbanner_bg"));
            this.aa = (MBridgeBaitClickView) findViewById(filterFindViewId(this.ab, "mbridge_animation_click_view"));
            this.y = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_appdesc"));
            if (this.i) {
                ImageView imageView = this.r;
                if (imageView != null && (imageView instanceof RoundImageView)) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                }
                ImageView imageView2 = this.s;
                if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                    ((RoundImageView) imageView2).setBorderRadius(10);
                }
                return isNotNULL(this.r, this.s, this.x, this.A, this.R, this.ctaView);
            }
            TextView textView = (TextView) view.findViewById(filterFindViewId(this.ab, "mbridge_tv_number"));
            this.z = textView;
            return isNotNULL(this.r, this.s, this.x, this.y, textView, this.A, this.R, this.ctaView);
        } catch (Throwable th) {
            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int e() {
        /*
            r6 = this;
            int r0 = r6.l
            java.lang.String r1 = "mbridge_reward_endcard_native_half_landscape"
            java.lang.String r2 = "mbridge_reward_endcard_native_land"
            java.lang.String r3 = "mbridge_reward_endcard_native_half_portrait"
            java.lang.String r4 = "mbridge_reward_endcard_native_hor"
            if (r0 != 0) goto L1d
            boolean r0 = r6.k
            if (r0 == 0) goto L11
            goto L12
        L11:
            r3 = r4
        L12:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L38
            boolean r0 = r6.k
            if (r0 == 0) goto L36
            goto L37
        L1d:
            int r0 = r6.l
            r5 = 1
            if (r0 != r5) goto L29
            boolean r0 = r6.k
            if (r0 == 0) goto L27
            goto L2c
        L27:
            r3 = r4
            goto L2c
        L29:
            java.lang.String r0 = ""
            r3 = r0
        L2c:
            int r0 = r6.l
            r4 = 2
            if (r0 != r4) goto L38
            boolean r0 = r6.k
            if (r0 == 0) goto L36
            goto L37
        L36:
            r1 = r2
        L37:
            r3 = r1
        L38:
            int r0 = r6.findLayout(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.e():int");
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript renderScriptCreate = RenderScript.create(this.f3680a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(25.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        ad.b(MBridgeBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        this.M = i;
        this.N = i2;
        this.O = i3;
        this.P = i4;
        f();
    }

    private void f() {
        RelativeLayout relativeLayout;
        if (!this.f || (relativeLayout = this.E) == null) {
            return;
        }
        relativeLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.3
            @Override // java.lang.Runnable
            public final void run() {
                if (MBridgeNativeEndCardView.this.E != null) {
                    if (MBridgeNativeEndCardView.this.b != null && !MBridgeNativeEndCardView.this.b.isDynamicView() && MBridgeNativeEndCardView.this.b.getAdSpaceT() != 2) {
                        MBridgeNativeEndCardView.this.E.setPadding(MBridgeNativeEndCardView.this.M, MBridgeNativeEndCardView.this.O, MBridgeNativeEndCardView.this.N, MBridgeNativeEndCardView.this.P);
                        MBridgeNativeEndCardView.this.E.startAnimation(MBridgeNativeEndCardView.this.L);
                    }
                    MBridgeNativeEndCardView.this.E.setVisibility(0);
                }
                if (MBridgeNativeEndCardView.this.R != null && MBridgeNativeEndCardView.this.R.getVisibility() != 0 && MBridgeNativeEndCardView.this.H) {
                    MBridgeNativeEndCardView.this.R.setVisibility(0);
                }
                MBridgeNativeEndCardView.p(MBridgeNativeEndCardView.this);
            }
        }, 200L);
    }

    public void setMoreOfferCampaignUnit(CampaignUnit campaignUnit) {
        MBShakeView mBShakeView;
        if (this.b == null || !this.b.isDynamicView()) {
            return;
        }
        this.U = campaignUnit;
        if (campaignUnit == null || campaignUnit.getAds() == null || this.U.getAds().size() <= 5 || (mBShakeView = this.V) == null) {
            return;
        }
        mBShakeView.setPadding(0, 0, 0, ai.a(getContext(), 5.0f));
    }

    public void clearMoreOfferBitmap() {
        CampaignUnit campaignUnit;
        if (this.b == null || !this.b.isDynamicView() || (campaignUnit = this.U) == null || campaignUnit.getAds() == null || this.U.getAds().size() <= 0) {
            return;
        }
        Iterator<CampaignEx> it = this.U.getAds().iterator();
        while (it.hasNext()) {
            CampaignEx next = it.next();
            if (!TextUtils.isEmpty(next.getIconUrl())) {
                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(next.getIconUrl());
            }
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.L;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.C = null;
        } catch (Exception e) {
            ad.b(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void setOnResume() {
        this.I = true;
    }

    public void setOnPause() {
        this.I = false;
    }

    public boolean isDyXmlSuccess() {
        return this.ab;
    }

    static /* synthetic */ void a(MBridgeNativeEndCardView mBridgeNativeEndCardView, final Bitmap bitmap) {
        try {
            com.mbridge.msdk.foundation.same.f.b.f().execute(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.13
                @Override // java.lang.Runnable
                public final void run() {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView2.Q = mBridgeNativeEndCardView2.blurBitmap(bitmap);
                    if (MBridgeNativeEndCardView.this.Q == null || MBridgeNativeEndCardView.this.Q.isRecycled() || MBridgeNativeEndCardView.this.q == null) {
                        return;
                    }
                    MBridgeNativeEndCardView.this.q.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.13.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (MBridgeNativeEndCardView.this.i) {
                                MBridgeNativeEndCardView.this.q.setBackground(null);
                            }
                            ad.b("async", "执行异步加载图");
                            MBridgeNativeEndCardView.this.q.setImageBitmap(MBridgeNativeEndCardView.this.Q);
                        }
                    });
                }
            });
        } catch (Exception e) {
            ad.a(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    static /* synthetic */ void a(MBridgeNativeEndCardView mBridgeNativeEndCardView, int i) throws JSONException {
        JSONObject jSONObject;
        if (mBridgeNativeEndCardView.b != null && mBridgeNativeEndCardView.b.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = mBridgeNativeEndCardView.b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                k.a(com.mbridge.msdk.foundation.controller.c.m().c(), "end_card_click", mBridgeNativeEndCardView.b.getCampaignUnitId(), mBridgeNativeEndCardView.b.isBidCampaign(), mBridgeNativeEndCardView.b.getRequestId(), mBridgeNativeEndCardView.b.getRequestIdNotice(), mBridgeNativeEndCardView.b.getId(), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.j, mBridgeNativeEndCardView.a(i));
                if (mBridgeNativeEndCardView.b.getDynamicTempCode() == 5) {
                    jSONObject.put("camp_position", 0);
                }
            } catch (JSONException e2) {
                e = e2;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
                mBridgeNativeEndCardView.b.setClickTempSource(2);
                mBridgeNativeEndCardView.e.a(105, jSONObject);
            }
        } catch (JSONException e3) {
            e = e3;
        }
        mBridgeNativeEndCardView.b.setClickTempSource(2);
        mBridgeNativeEndCardView.e.a(105, jSONObject);
    }

    static /* synthetic */ void p(MBridgeNativeEndCardView mBridgeNativeEndCardView) {
        if (mBridgeNativeEndCardView.b != null) {
            mBridgeNativeEndCardView.b.setCampaignUnitId(mBridgeNativeEndCardView.T);
            com.mbridge.msdk.foundation.d.b.a().a(mBridgeNativeEndCardView.T + "_2", mBridgeNativeEndCardView.b);
        }
        if (com.mbridge.msdk.foundation.d.b.a().b()) {
            com.mbridge.msdk.foundation.d.b.a().a(mBridgeNativeEndCardView.T + "_2", new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.video.module.MBridgeNativeEndCardView.4
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                    MBridgeNativeEndCardView.this.J = true;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                    MBridgeNativeEndCardView.this.J = false;
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                    MBridgeNativeEndCardView.this.J = false;
                }
            });
            com.mbridge.msdk.foundation.d.b.a().c(mBridgeNativeEndCardView.T + "_1");
            if (mBridgeNativeEndCardView.S != null) {
                com.mbridge.msdk.foundation.d.b.a().a(mBridgeNativeEndCardView.T + "_2", mBridgeNativeEndCardView.S);
                return;
            }
            return;
        }
        FeedBackButton feedBackButton = mBridgeNativeEndCardView.S;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }
}
