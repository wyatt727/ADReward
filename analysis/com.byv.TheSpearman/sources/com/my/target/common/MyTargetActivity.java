package com.my.target.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class MyTargetActivity extends Activity {
    public static ActivityEngine activityEngine;
    private ActivityEngine engine;
    private FrameLayout rootLayout;

    public interface ActivityEngine {
        void onActivityAttach(MyTargetActivity myTargetActivity);

        boolean onActivityBackPressed();

        void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout);

        void onActivityDestroy();

        boolean onActivityOptionsItemSelected(MenuItem menuItem);

        void onActivityPause();

        void onActivityResume();

        void onActivityStart();

        void onActivityStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 != null) {
            activityEngine2.onActivityAttach(this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 == null || activityEngine2.onActivityBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        ActivityEngine activityEngine2 = activityEngine;
        this.engine = activityEngine2;
        activityEngine = null;
        if (activityEngine2 == null || intent == null) {
            finish();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        this.rootLayout = frameLayout;
        this.engine.onActivityCreate(this, intent, frameLayout);
        setContentView(this.rootLayout);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 != null) {
            activityEngine2.onActivityDestroy();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 == null || !activityEngine2.onActivityOptionsItemSelected(menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 != null) {
            activityEngine2.onActivityPause();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 != null) {
            activityEngine2.onActivityResume();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 != null) {
            activityEngine2.onActivityStart();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        ActivityEngine activityEngine2 = this.engine;
        if (activityEngine2 != null) {
            activityEngine2.onActivityStop();
        }
    }
}
