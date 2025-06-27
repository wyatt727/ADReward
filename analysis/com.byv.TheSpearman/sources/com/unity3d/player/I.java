package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
class I extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private C1516a f4339a;
    private UnityPlayer b;
    private w c;

    public I(Context context, UnityPlayer unityPlayer) {
        int i;
        super(context);
        this.c = new w(context);
        this.b = unityPlayer;
        C1516a c1516a = new C1516a(context, unityPlayer);
        this.f4339a = c1516a;
        c1516a.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        if (a()) {
            this.f4339a.getHolder().setFormat(-3);
            this.f4339a.setZOrderOnTop(true);
            i = 0;
        } else {
            this.f4339a.getHolder().setFormat(-1);
            i = ViewCompat.MEASURED_STATE_MASK;
        }
        setBackgroundColor(i);
        this.f4339a.getHolder().addCallback(new H(this));
        this.f4339a.setFocusable(true);
        this.f4339a.setFocusableInTouchMode(true);
        this.f4339a.setContentDescription(a(context));
        addView(this.f4339a, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    private String a(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", TypedValues.Custom.S_STRING, context.getPackageName()));
    }

    private boolean a() {
        Activity activity = UnityPlayer.currentActivity;
        if (activity == null) {
            return false;
        }
        TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowIsTranslucent});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    void a(float f) {
        this.f4339a.a(f);
    }

    public void b() {
        w wVar = this.c;
        UnityPlayer unityPlayer = this.b;
        v vVar = wVar.b;
        if (vVar != null && vVar.getParent() != null) {
            unityPlayer.removeView(wVar.b);
        }
        this.c.b = null;
    }

    public boolean c() {
        C1516a c1516a = this.f4339a;
        return c1516a != null && c1516a.a();
    }
}
