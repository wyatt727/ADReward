package com.mbridge.msdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.d.b;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public abstract class MBBaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private Display f2488a;
    private OrientationEventListener b;
    private int c = -1;

    public abstract void setTopControllerPadding(int i, int i2, int i3, int i4, int i5);

    public void getNotchParams() {
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.mbridge.msdk.activity.MBBaseActivity.1
            /* JADX WARN: Removed duplicated region for block: B:41:0x00dd A[Catch: Exception -> 0x00e3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e3, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x001a, B:9:0x0020, B:11:0x0026, B:13:0x006a, B:15:0x007b, B:17:0x0086, B:27:0x0099, B:39:0x00d0, B:41:0x00dd, B:14:0x0075), top: B:46:0x0002 }] */
            /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 236
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.activity.MBBaseActivity.AnonymousClass1.run():void");
            }
        }, 500L);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            a();
            b();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
        } catch (Exception e) {
            ad.b("MBBaseActivity", e.getMessage());
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (b.c) {
            return;
        }
        getNotchParams();
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.b = null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a();
    }

    private void a() {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                getWindow().addFlags(67108864);
                getWindow().getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            } else {
                getWindow().getDecorView().setSystemUiVisibility(2);
            }
        } catch (Throwable th) {
            ad.b("MBBaseActivity", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        if (this.f2488a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f2488a = getDisplay();
            } else {
                this.f2488a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f2488a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }

    static /* synthetic */ void e(MBBaseActivity mBBaseActivity) {
        OrientationEventListener orientationEventListener = new OrientationEventListener(mBBaseActivity, 1) { // from class: com.mbridge.msdk.activity.MBBaseActivity.2
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                int rotation = MBBaseActivity.this.f2488a != null ? MBBaseActivity.this.f2488a.getRotation() : 0;
                if (rotation != 1 || MBBaseActivity.this.c == 1) {
                    if (rotation != 3 || MBBaseActivity.this.c == 2) {
                        if (rotation != 0 || MBBaseActivity.this.c == 3) {
                            if (rotation != 2 || MBBaseActivity.this.c == 4) {
                                return;
                            }
                            MBBaseActivity.this.c = 4;
                            MBBaseActivity.this.getNotchParams();
                            ad.b("MBBaseActivity", "Orientation Bottom");
                            return;
                        }
                        MBBaseActivity.this.c = 3;
                        MBBaseActivity.this.getNotchParams();
                        ad.b("MBBaseActivity", "Orientation Top");
                        return;
                    }
                    MBBaseActivity.this.c = 2;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Right");
                    return;
                }
                MBBaseActivity.this.c = 1;
                MBBaseActivity.this.getNotchParams();
                ad.b("MBBaseActivity", "Orientation Left");
            }
        };
        mBBaseActivity.b = orientationEventListener;
        if (orientationEventListener.canDetectOrientation()) {
            mBBaseActivity.b.enable();
        } else {
            mBBaseActivity.b.disable();
            mBBaseActivity.b = null;
        }
    }
}
