package com.json;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class k implements he {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f1834a;

    public k(Activity activity) {
        this.f1834a = new WeakReference<>(activity);
    }

    @Override // com.json.he
    public void a() {
        Activity activity = this.f1834a.get();
        if (activity == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Window window = activity.getWindow();
        if (i < 30) {
            window.setFlags(1024, 1024);
            return;
        }
        WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets.Type.statusBars());
        }
    }
}
