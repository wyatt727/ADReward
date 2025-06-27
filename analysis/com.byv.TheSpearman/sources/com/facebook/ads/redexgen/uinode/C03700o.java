package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener;
import com.facebook.ads.redexgen.uinode.C03700o;
import com.json.m4;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.0o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03700o {
    public static byte[] A06;
    public static String[] A07 = {"jY95Z4e8SjES", "FWAQk0vwFzOT3H3ejUps9E7fwyQUHgqv", "R9UUrzGy7cjs1hDg6byYlCYbXfp8nW0w", "dKAdSxu4tDkfYe86wdSSQ2n2Du5", "FgFVZj7d091u9rUO", "kSt0PMlvWs2DEAK3GKEU98UDJan6EgWc", "nGXCIrfUxBd8PJB10o2gs7oQf", m4.p};
    public Application A01;
    public UserReturnTracker$UserReturnListener A03;
    public final J2 A05;
    public long A00 = 0;
    public String A04 = null;
    public EnumC03630g A02 = null;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{44, 47, 45, 37, 17, 58, 39, 35, 43, 8, 1, 5, 18, 1, 59, 16, 13, 9, 1, 10, 16, 17, 6, 10, 8, 0};
    }

    static {
        A03();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener] */
    public C03700o(J2 j2, final Activity activity, int i) {
        this.A05 = j2;
        this.A01 = activity.getApplication();
        this.A03 = new Application.ActivityLifecycleCallbacks(activity, this) { // from class: com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener
            public C03700o A00;
            public final WeakReference<Activity> A01;

            {
                this.A01 = new WeakReference<>(activity);
                this.A00 = this;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity2) {
                if (this.A00 == null) {
                    return;
                }
                Activity trackedActivity = this.A01.get();
                if (trackedActivity == null || (trackedActivity != null && activity2.equals(trackedActivity))) {
                    this.A00.A05();
                    this.A00 = null;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity2) {
            }
        };
    }

    public static C03700o A00(J2 j2, Activity activity) {
        return A01(j2, activity, Build.VERSION.SDK_INT);
    }

    public static C03700o A01(J2 j2, Activity activity, int i) {
        if (activity != null && i >= 14) {
            return new C03700o(j2, activity, i);
        }
        return null;
    }

    private void A04(String str, long j, long j2, EnumC03630g enumC03630g) {
        HashMap map = new HashMap();
        map.put(A02(9, 10, 8), Long.toString(j));
        map.put(A02(0, 9, 34), Long.toString(j2));
        if (enumC03630g != null) {
            map.put(A02(19, 7, 9), enumC03630g.name());
        }
        this.A05.AA9(str, map);
    }

    public final void A05() {
        UserReturnTracker$UserReturnListener userReturnTracker$UserReturnListener;
        A04(this.A04, this.A00, System.currentTimeMillis(), this.A02);
        Application application = this.A01;
        if (application != null && (userReturnTracker$UserReturnListener = this.A03) != null) {
            application.unregisterActivityLifecycleCallbacks(userReturnTracker$UserReturnListener);
            this.A03 = null;
            this.A01 = null;
        }
    }

    public final void A06(EnumC03630g enumC03630g) {
        this.A02 = enumC03630g;
    }

    public final void A07(String str) {
        this.A04 = str;
        if (this.A03 != null && this.A01 != null) {
            this.A00 = System.currentTimeMillis();
            this.A01.registerActivityLifecycleCallbacks(this.A03);
            return;
        }
        EnumC03630g enumC03630g = EnumC03630g.A04;
        if (A07[2].charAt(6) == '9') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "8mgXQ8lZ1oxTn8xtWXCDJO1aYxf7Xnbe";
        strArr[1] = "RSHxB9AoZRnm9g8NXStW2wWwzMRvBUbh";
        A04(str, -1L, -1L, enumC03630g);
    }
}
