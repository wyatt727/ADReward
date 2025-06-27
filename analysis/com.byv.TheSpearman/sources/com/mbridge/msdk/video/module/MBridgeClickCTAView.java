package com.mbridge.msdk.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.video.dynview.e.g;
import com.mbridge.msdk.video.dynview.j.c;
import com.mbridge.msdk.video.module.a.a.e;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.widget.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeClickCTAView extends MBridgeClickCTAViewDiff {
    private ViewGroup n;
    private ImageView o;
    private TextView p;
    private TextView q;
    private String r;
    private float s;
    private float t;
    private int u;
    private ObjectAnimator v;

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.v = objectAnimator;
    }

    public void setUnitId(String str) {
        this.r = str;
    }

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected final void c() {
        super.c();
        if (this.f) {
            if (this.b != null && this.b.isDynamicView()) {
                setOnClickListener(new a() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.2
                    @Override // com.mbridge.msdk.widget.a
                    protected final void a(View view) throws JSONException {
                        MBridgeClickCTAView.b(MBridgeClickCTAView.this);
                    }
                });
            }
            this.ctaTv.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.3
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) throws JSONException {
                    MBridgeClickCTAView.b(MBridgeClickCTAView.this);
                }
            });
            ImageView imageView = this.o;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff
    public void preLoadData(b bVar) {
        if (this.b != null) {
            if (this.b.isDynamicView()) {
                com.mbridge.msdk.video.dynview.b.a().a(new c().b(this, this.b), new g() { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.1
                    @Override // com.mbridge.msdk.video.dynview.e.g
                    public final void a(com.mbridge.msdk.video.dynview.a aVar) {
                        if (aVar != null) {
                            this.addView(aVar.a());
                            MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                            mBridgeClickCTAView.f = mBridgeClickCTAView.b();
                            MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                            mBridgeClickCTAView2.q = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
                            MBridgeClickCTAView.this.c();
                        }
                    }

                    @Override // com.mbridge.msdk.video.dynview.e.g
                    public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                        ad.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.b());
                    }
                });
            } else {
                int iFindLayout = findLayout("mbridge_reward_clickable_cta");
                if (iFindLayout >= 0) {
                    this.c.inflate(iFindLayout, this);
                    this.f = b();
                    c();
                    setWrapContent();
                }
            }
            if (this.f) {
                if (com.mbridge.msdk.f.b.a()) {
                    setChinaCTAData();
                }
                this.ctaTv.setText(this.b.getAdCall());
                if (!TextUtils.isEmpty(this.b.getIconUrl())) {
                    com.mbridge.msdk.foundation.same.c.b.a(this.f3680a.getApplicationContext()).a(this.b.getIconUrl(), new e(this.o, this.b, this.r) { // from class: com.mbridge.msdk.video.module.MBridgeClickCTAView.5
                        @Override // com.mbridge.msdk.video.module.a.a.e, com.mbridge.msdk.foundation.same.c.c
                        public final void onFailedLoad(String str, String str2) {
                            super.onFailedLoad(str, str2);
                            MBridgeClickCTAView.this.a();
                        }
                    });
                } else {
                    a();
                }
                if (this.p != null && !TextUtils.isEmpty(this.b.getAppName())) {
                    this.p.setText(this.b.getAppName());
                }
                if (this.q == null || TextUtils.isEmpty(this.b.getAppDesc())) {
                    return;
                }
                this.q.setText(this.b.getAppDesc());
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.u = configuration.orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        this.n = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.o = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.p = (TextView) findViewById(findID("mbridge_tv_title"));
        this.ctaTv = (TextView) findViewById(findID("mbridge_tv_install"));
        return isNotNULL(this.n, this.o, this.p, this.ctaTv);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.s = motionEvent.getRawX();
        this.t = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.v;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.v;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static /* synthetic */ void b(MBridgeClickCTAView mBridgeClickCTAView) throws JSONException {
        JSONObject jSONObject;
        JSONException e;
        if (mBridgeClickCTAView.b != null && mBridgeClickCTAView.b.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = mBridgeClickCTAView.b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.f() + "";
                }
                k.a(com.mbridge.msdk.foundation.controller.c.m().c(), "cta_click", mBridgeClickCTAView.b.getCampaignUnitId(), mBridgeClickCTAView.b.isBidCampaign(), mBridgeClickCTAView.b.getRequestId(), mBridgeClickCTAView.b.getRequestIdNotice(), mBridgeClickCTAView.b.getId(), str);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.j, mBridgeClickCTAView.a(0));
            } catch (JSONException e3) {
                e = e3;
                e.printStackTrace();
                mBridgeClickCTAView.b.setTriggerClickSource(1);
                mBridgeClickCTAView.b.setClickTempSource(1);
                mBridgeClickCTAView.e.a(105, jSONObject);
            }
        } catch (JSONException e4) {
            jSONObject = null;
            e = e4;
        }
        mBridgeClickCTAView.b.setTriggerClickSource(1);
        mBridgeClickCTAView.b.setClickTempSource(1);
        mBridgeClickCTAView.e.a(105, jSONObject);
    }
}
