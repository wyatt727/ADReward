package com.mbridge.msdk.mbnative.f;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.controller.d;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: NativeProvider.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private NativeController f3138a;
    private Handler b = new Handler(Looper.getMainLooper());
    private com.mbridge.msdk.mbnative.d.a c;
    private NativeListener.NativeTrackingListener d;

    public final void a(com.mbridge.msdk.mbnative.d.a aVar) {
        this.c = aVar;
    }

    public final void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.d = nativeTrackingListener;
    }

    public a() {
    }

    public a(com.mbridge.msdk.mbnative.d.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.c = aVar;
        this.d = nativeTrackingListener;
    }

    public final void a(Context context, Resources resources, Map<String, Object> map) {
        this.f3138a = new NativeController(this.c, this.d, map, context);
    }

    public final void a() throws JSONException {
        a(0, "");
    }

    public final void a(String str) throws JSONException {
        a(0, str);
    }

    public final void b() throws JSONException {
        a(1, "");
    }

    public final void d() {
        try {
            this.f3138a.a();
        } catch (Exception unused) {
            ad.b("NativeProvider", "release failed");
        }
    }

    public final void a(View view, List<View> list, Campaign campaign) {
        NativeController nativeController = this.f3138a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view, list);
    }

    public final void a(View view, Campaign campaign) {
        ad.c("NativeProvider", "native provider registerView");
        NativeController nativeController = this.f3138a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view);
    }

    public final void b(View view, Campaign campaign) {
        ad.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f3138a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view);
    }

    public final void b(View view, List<View> list, Campaign campaign) {
        ad.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f3138a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view, list);
    }

    public static void preload(Map<String, Object> map, int i) {
        ad.c("NativeProvider", "native provider preload");
        new d().a(map, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.c.onAdLoadError("current request is loading");
        this.c.b();
    }

    private void a(int i, String str) throws JSONException {
        if (this.f3138a != null) {
            com.mbridge.msdk.mbnative.d.a aVar = this.c;
            if (aVar != null && aVar.a()) {
                if (ai.g()) {
                    g();
                    return;
                } else {
                    this.b.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.f.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.g();
                        }
                    });
                    return;
                }
            }
            com.mbridge.msdk.mbnative.d.a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.b();
            }
            this.f3138a.a(i, str);
        }
    }

    public final String e() {
        NativeController nativeController = this.f3138a;
        return nativeController != null ? nativeController.b() : "";
    }

    public final String f() {
        NativeController nativeController = this.f3138a;
        return nativeController != null ? nativeController.c() : "";
    }

    public final void c() {
        try {
            ab.b();
        } catch (Exception unused) {
            ad.b("NativeProvider", "clear cache failed");
        }
    }
}
