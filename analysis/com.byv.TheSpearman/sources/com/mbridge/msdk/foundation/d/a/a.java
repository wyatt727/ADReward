package com.mbridge.msdk.foundation.d.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.mbridge.msdk.c.b;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* compiled from: FeedBackBtnBean.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static int f2772a = -1;
    private static String b;
    private String d;
    private CampaignEx e;
    private FeedBackButton g;
    private String h;
    private String k;
    private MBFeedBackDialog l;
    private Dialog m;
    private JSONArray n;
    private int s;
    private List<C0264a> t;
    private int w;
    private float c = 1.0f;
    private String f = "";
    private float i = -1.0f;
    private int j = -1;
    private int o = -1;
    private int p = -1;
    private int q = -1;
    private int r = -1;
    private int u = ai.a(c.m().c(), 20.0f);
    private String v = "";
    private com.mbridge.msdk.widget.dialog.a x = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.foundation.d.a.a.1
        @Override // com.mbridge.msdk.widget.dialog.a
        public final void a() {
            a.a(a.this);
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void b() {
            a.b(a.this);
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void c() {
            a.c(a.this);
        }
    };
    private int y = f2772a;
    private int z = -1;
    private int A = -1;
    private int B = -1;

    public a(String str) {
        this.t = new ArrayList();
        this.k = str;
        if (this.t == null) {
            this.t = new ArrayList();
        }
        k();
        i();
        j();
    }

    public final void a(C0264a c0264a) {
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(c0264a);
    }

    public final void a() {
        FeedBackButton feedBackButton = this.g;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.g.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.g.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.g);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.l;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.l.setListener(null);
        }
        this.l = null;
        this.t = null;
        this.g = null;
        this.x = null;
    }

    public final void b() {
        MBFeedBackDialog mBFeedBackDialog = this.l;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.l.cancel();
    }

    public final CampaignEx c() {
        return this.e;
    }

    public final void a(CampaignEx campaignEx) {
        this.e = campaignEx;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final FeedBackButton d() {
        if (this.g == null) {
            i();
        }
        return this.g;
    }

    private void i() {
        Context contextC = c.m().c();
        if (contextC != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(contextC);
                this.g = feedBackButton;
                int i = 8;
                if (this.y != 8) {
                    i = 0;
                }
                feedBackButton.setVisibility(i);
                this.g.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.d.a.a.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.e();
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void e() {
        try {
            b.a().a(this.k, 0, 1, b, this.f);
            Activity activityA = b.a().a(c.m().c());
            MBFeedBackDialog mBFeedBackDialog = this.l;
            if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != activityA) {
                j();
            }
            Context contextC = c.m().c();
            FeedBackButton feedBackButton = this.g;
            if (feedBackButton != null) {
                contextC = feedBackButton.getContext();
            }
            boolean zA = b.a().a(this.k, contextC, this.l);
            int i = zA ? 2 : 3;
            if (i == 2) {
                b.a().a(this.k, 0, 2, b, this.f);
            } else {
                b.a().a(this.k, 0, 3, b, this.f);
            }
            List<C0264a> list = this.t;
            if (list != null) {
                for (C0264a c0264a : list) {
                    if (c0264a != null) {
                        c0264a.a(i);
                    }
                }
            }
            if (zA) {
                return;
            }
            a(contextC);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void j() {
        try {
            if (b.a().a(c.m().c()) != null) {
                g gVarB = h.a().b(c.m().k());
                if (gVarB == null) {
                    h.a();
                    gVarB = i.a();
                }
                b.C0255b c0255bD = gVarB.D();
                if (c0255bD == null) {
                    ad.c("", "feedback fbk is null");
                    return;
                }
                k();
                this.l = new MBFeedBackDialog(com.mbridge.msdk.foundation.d.b.a().a(c.m().c()), this.x);
                FeedbackRadioGroup feedbackRadioGroupA = a(c0255bD);
                this.l.setCancelText(c0255bD.d());
                this.l.setConfirmText(c0255bD.a());
                this.l.setPrivacyText(c0255bD.c());
                this.v = c0255bD.e();
                this.l.setTitle(c0255bD.f());
                this.l.setContent(feedbackRadioGroupA);
                this.l.setCancelButtonClickable(!TextUtils.isEmpty(b));
                a(feedbackRadioGroupA, c0255bD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(Context context) {
        if (context != null) {
            try {
                com.mbridge.msdk.click.c.e(context, ai.a(this.e));
            } catch (Exception unused) {
                com.mbridge.msdk.click.c.c(context, ai.a(this.e));
            }
        }
    }

    private void k() {
        if (this.x == null) {
            this.x = new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.foundation.d.a.a.3
                @Override // com.mbridge.msdk.widget.dialog.a
                public final void a() {
                    a.a(a.this);
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void b() {
                    a.b(a.this);
                }

                @Override // com.mbridge.msdk.widget.dialog.a
                public final void c() {
                    a.c(a.this);
                }
            };
        }
    }

    private FeedbackRadioGroup a(b.C0255b c0255b) {
        JSONArray jSONArrayB = c0255b.b();
        Context contextC = c.m().c();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextC == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextC);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, b.C0255b c0255b) throws Resources.NotFoundException {
        JSONArray jSONArrayB = c0255b.b();
        Context contextC = c.m().c();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextC == null) {
            return;
        }
        v.a(contextC, "mbridge_cm_feedback_choice_btn_bg", "drawable");
        Resources resourcesA = v.a(contextC);
        int iA = v.a(contextC, "mbridge_cm_feedback_rb_text_color_color_list", "color");
        ColorStateList colorStateList = null;
        if (resourcesA != null) {
            try {
                colorStateList = resourcesA.getColorStateList(iA);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int iA2 = ai.a(contextC, 1.0f);
        int iA3 = ai.a(contextC, 1.0f);
        int iA4 = ai.a(contextC, 1.0f);
        for (int i = 0; i < jSONArrayB.length(); i++) {
            String strOptString = jSONArrayB.optString(i);
            RadioButton radioButton = new RadioButton(contextC);
            if (Build.VERSION.SDK_INT >= 21) {
                radioButton.setButtonTintList(colorStateList);
            }
            radioButton.setText(strOptString);
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
            }
            radioButton.setCompoundDrawablePadding(iA2);
            radioButton.setPadding(iA2, iA3, iA2, iA3);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            int i2 = iA4 / 4;
            layoutParams.setMargins(iA4, i2, iA4, i2);
            a(radioButton);
            feedbackRadioGroup.addView(radioButton, layoutParams);
        }
    }

    private void a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.mbridge.msdk.foundation.d.a.a.4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        String unused = a.b = (String) compoundButton.getText();
                    }
                    if (a.this.l != null) {
                        a.this.l.setCancelButtonClickable(!TextUtils.isEmpty(a.b));
                    }
                }
            });
        }
    }

    public final void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.g;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.c);
            feedBackButton.setEnabled(this.c != 0.0f);
            feedBackButton.setVisibility(this.y != 8 ? 0 : 8);
            this.g = feedBackButton;
            CampaignEx campaignEx = this.e;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                l();
            }
            feedBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.d.a.a.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.e();
                }
            });
        }
    }

    private void l() {
        FeedBackButton feedBackButton = this.g;
        if (feedBackButton != null) {
            int i = this.A;
            if (i > -1) {
                feedBackButton.setX(i);
            }
            int i2 = this.B;
            if (i2 > -1) {
                this.g.setY(i2);
            }
            float f = this.c;
            if (f >= 0.0f) {
                this.g.setAlpha(f);
                this.g.setEnabled(this.c != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
            int i3 = this.z;
            if (i3 > 0) {
                this.g.setWidth(i3);
                if (layoutParams != null) {
                    layoutParams.width = this.z;
                }
            }
            int i4 = this.j;
            if (i4 > 0) {
                this.g.setHeight(i4);
                if (layoutParams != null) {
                    layoutParams.height = this.j;
                }
            }
            if (layoutParams != null) {
                this.g.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.h)) {
                    this.g.setTextColor(Color.parseColor(this.h));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            float f2 = this.i;
            if (f2 > 0.0f) {
                this.g.setTextSize(f2);
            }
            JSONArray jSONArray = this.n;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context contextC = c.m().c();
                this.g.setPadding(ai.a(contextC, (float) this.n.optDouble(0)), ai.a(contextC, (float) this.n.optDouble(1)), ai.a(contextC, (float) this.n.optDouble(2)), ai.a(contextC, (float) this.n.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i5 = this.u;
            if (i5 > 0) {
                gradientDrawable.setCornerRadius(i5);
            }
            if (!TextUtils.isEmpty(this.d)) {
                gradientDrawable.setColor(Color.parseColor(this.d));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.g.setBackground(gradientDrawable);
        }
    }

    public final int f() {
        return this.s;
    }

    public final void a(int i) {
        this.s = i;
    }

    public final int g() {
        return this.w;
    }

    public final void b(int i) {
        this.w = i;
    }

    public final void c(int i) {
        this.y = i;
        FeedBackButton feedBackButton = this.g;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i);
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5, float f, String str, String str2, float f2, JSONArray jSONArray) {
        if (i > -1) {
            this.A = i;
        }
        if (i2 > -1) {
            this.B = i2;
        }
        if (i3 > -1) {
            this.z = i3;
        }
        if (i4 > -1) {
            this.j = i4;
        }
        if (f2 > -1.0f) {
            this.i = f2;
        }
        if (jSONArray != null) {
            this.n = jSONArray;
        }
        this.h = str;
        this.d = str2;
        this.c = f;
        this.u = i5;
        l();
    }

    /* compiled from: FeedBackBtnBean.java */
    /* renamed from: com.mbridge.msdk.foundation.d.a.a$a, reason: collision with other inner class name */
    public static class C0264a implements com.mbridge.msdk.widget.dialog.a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.d.a f2779a;
        private String b;

        public C0264a(String str, com.mbridge.msdk.foundation.d.a aVar) {
            this.f2779a = aVar;
            this.b = str;
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void a() {
            com.mbridge.msdk.foundation.d.b.c = false;
            com.mbridge.msdk.foundation.d.a aVar = this.f2779a;
            if (aVar != null) {
                aVar.a(a.b);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void b() {
            com.mbridge.msdk.foundation.d.b.c = false;
            com.mbridge.msdk.foundation.d.a aVar = this.f2779a;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.a
        public final void c() {
            com.mbridge.msdk.foundation.d.a aVar = this.f2779a;
            if (aVar != null) {
                aVar.b();
            }
        }

        public final void a(int i) {
            com.mbridge.msdk.foundation.d.b.c = true;
            com.mbridge.msdk.foundation.d.a aVar = this.f2779a;
            if (aVar == null || i != 2) {
                return;
            }
            aVar.a();
        }
    }

    static /* synthetic */ void a(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.k, 1, 4, b, aVar.f);
        List<C0264a> list = aVar.t;
        if (list != null) {
            for (C0264a c0264a : list) {
                if (c0264a != null) {
                    c0264a.a();
                }
            }
        }
        if (!TextUtils.isEmpty(aVar.v)) {
            try {
                Activity activityA = com.mbridge.msdk.foundation.d.b.a().a(c.m().c());
                if (activityA != null) {
                    View viewInflate = LayoutInflater.from(activityA).inflate(v.a(activityA, "mbridge_cm_feedback_notice_layout", "layout"), (ViewGroup) null);
                    Dialog dialog = new Dialog(activityA, 3);
                    aVar.m = dialog;
                    dialog.requestWindowFeature(1);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    Window window = aVar.m.getWindow();
                    layoutParams.copyFrom(window.getAttributes());
                    layoutParams.width = -2;
                    layoutParams.height = -2;
                    aVar.m.setContentView(viewInflate);
                    aVar.m.show();
                    window.setAttributes(layoutParams);
                    viewInflate.postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.d.a.a.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (a.this.m == null || !a.this.m.isShowing()) {
                                    return;
                                }
                                a.this.m.dismiss();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }, 2000L);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        b = "";
    }

    static /* synthetic */ void b(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.k, 0, 4, b, aVar.f);
        List<C0264a> list = aVar.t;
        if (list != null) {
            for (C0264a c0264a : list) {
                if (c0264a != null) {
                    c0264a.b();
                }
            }
        }
        b = "";
    }

    static /* synthetic */ void c(a aVar) {
        com.mbridge.msdk.foundation.d.b.a().a(aVar.k, 0, 4, b, aVar.f);
        Context contextE = c.m().e();
        if (contextE == null) {
            contextE = c.m().c();
        }
        List<C0264a> list = aVar.t;
        if (list != null) {
            for (C0264a c0264a : list) {
                if (c0264a != null) {
                    c0264a.b();
                }
            }
        }
        aVar.a(contextE);
        b = "";
    }
}
