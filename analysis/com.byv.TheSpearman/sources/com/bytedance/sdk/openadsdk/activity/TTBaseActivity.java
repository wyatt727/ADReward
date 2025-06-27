package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import com.bytedance.sdk.component.utils.pi;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public class TTBaseActivity extends Activity {
    protected boolean VwS = false;

    @Override // android.app.Activity
    protected void onResume() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT <= 28 && Build.VERSION.SDK_INT >= 24) {
            try {
                super.onResume();
                return;
            } catch (IllegalArgumentException e) {
                pi.EYQ("TTBaseActivity", "super.onResume() run fail", e);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, Boolean.TRUE);
                    return;
                } catch (Exception e2) {
                    pi.EYQ("TTBaseActivity", "onResume set mCalled fail", e2);
                    return;
                }
            }
        }
        super.onResume();
    }

    public void EYQ(boolean z) {
        this.VwS = z;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }
}
