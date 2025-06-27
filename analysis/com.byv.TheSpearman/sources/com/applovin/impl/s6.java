package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class s6 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private u6 f878a;
    private com.applovin.impl.sdk.k b;
    private TextView c;
    private Button d;

    public void a(u6 u6Var, com.applovin.impl.sdk.k kVar) {
        this.f878a = u6Var;
        this.b = kVar;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f878a.c() + " - " + this.f878a.d());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.s6$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.a(view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share == menuItem.getItemId()) {
            this.b.v().a(this.f878a, (Context) this, false);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    private void b() {
        lc lcVar = new lc();
        lcVar.a(this.b.v().a(this.f878a));
        String strB = this.b.v().b(this.f878a.a());
        if (strB != null) {
            lcVar.a("\nBid Response Preview:\n");
            lcVar.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.c = textView;
        textView.setText(lcVar.toString());
        this.c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    private boolean a() {
        return (this.f878a == null || this.b == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.v().a(this.f878a, (Context) this, true);
    }
}
