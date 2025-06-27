package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.r;
import com.applovin.impl.v4;
import com.applovin.impl.zb;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class u4 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private v4 f1053a;
    private FrameLayout b;
    private ListView c;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.b = (FrameLayout) findViewById(android.R.id.content);
        this.c = (ListView) findViewById(R.id.listView);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        v4 v4Var = this.f1053a;
        if (v4Var == null) {
            finish();
            return;
        }
        this.c.setAdapter((ListAdapter) v4Var);
        v4 v4Var2 = this.f1053a;
        if (v4Var2 != null && !v4Var2.e().v().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        v4 v4Var3 = this.f1053a;
        if (v4Var3 == null || !v4Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        v4 v4Var = this.f1053a;
        if (v4Var != null) {
            v4Var.a((zb.a) null);
            this.f1053a.g();
        }
    }

    class a implements zb.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f1054a;

        a(q qVar) {
            this.f1054a = qVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() != v4.a.RECENT_ADS.ordinal()) {
                return;
            }
            r.a(u4.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f1054a, new C0047a(hbVar));
        }

        /* renamed from: com.applovin.impl.u4$a$a, reason: collision with other inner class name */
        class C0047a implements r.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ hb f1055a;

            C0047a(hb hbVar) {
                this.f1055a = hbVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((u6) u4.this.f1053a.d().get(this.f1055a.a()), u4.this.f1053a.e());
            }
        }
    }

    public void a(v4 v4Var, q qVar) {
        this.f1053a = v4Var;
        v4Var.a(new a(qVar));
    }

    private void a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.b.bringChildToFront(textView);
    }
}
