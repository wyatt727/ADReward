package com.google.android.gms.games.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.games.zzfg;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzae implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private boolean zzdm = false;
    private zzf zzes;
    private zzfg zzet;
    private WeakReference<View> zzeu;

    public static zzae zza(zzf zzfVar, int i) {
        return new zzae(zzfVar, i);
    }

    private zzae(zzf zzfVar, int i) {
        this.zzes = zzfVar;
        this.zzet = new zzfg(i, null);
    }

    public final void setGravity(int i) {
        this.zzet.gravity = i;
    }

    public final Bundle zzbl() {
        return this.zzet.zzce();
    }

    public final IBinder zzbm() {
        return this.zzet.zzjn;
    }

    public final zzfg zzbn() {
        return this.zzet;
    }

    public final void zzb(View view) {
        this.zzes.zzbd();
        WeakReference<View> weakReference = this.zzeu;
        if (weakReference != null) {
            View decorView = weakReference.get();
            Context context = this.zzes.getContext();
            if (decorView == null && (context instanceof Activity)) {
                decorView = ((Activity) context).getWindow().getDecorView();
            }
            if (decorView != null) {
                decorView.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                if (PlatformVersion.isAtLeastJellyBean()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.zzeu = null;
        Context context2 = this.zzes.getContext();
        if (view == null && (context2 instanceof Activity)) {
            Activity activity = (Activity) context2;
            try {
                view = activity.findViewById(R.id.content);
            } catch (IllegalStateException unused) {
            }
            if (view == null) {
                view = activity.getWindow().getDecorView();
            }
            zzz.w("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
        }
        if (view != null) {
            zzc(view);
            this.zzeu = new WeakReference<>(view);
            view.addOnAttachStateChangeListener(this);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        }
        zzz.e("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
    }

    public final void zzbo() {
        if (this.zzet.zzjn != null) {
            this.zzes.zza(this.zzet.zzjn, this.zzet.zzce());
            this.zzdm = false;
        } else {
            this.zzdm = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        zzc(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzes.zzbd();
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        WeakReference<View> weakReference = this.zzeu;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        zzc(view);
    }

    private final void zzc(View view) {
        Display display;
        int displayId = -1;
        if (PlatformVersion.isAtLeastJellyBeanMR1() && (display = view.getDisplay()) != null) {
            displayId = display.getDisplayId();
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        this.zzet.zzjo = displayId;
        this.zzet.zzjn = windowToken;
        this.zzet.left = iArr[0];
        this.zzet.top = iArr[1];
        this.zzet.right = iArr[0] + width;
        this.zzet.bottom = iArr[1] + height;
        if (this.zzdm) {
            zzbo();
        }
    }
}
