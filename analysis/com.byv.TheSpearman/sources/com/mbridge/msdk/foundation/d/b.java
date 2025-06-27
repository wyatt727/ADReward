package com.mbridge.msdk.foundation.d;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.a.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* compiled from: FeedbackManager.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f2780a = -2;
    public static int b = -2;
    public static volatile boolean c = false;
    private final RelativeLayout.LayoutParams d;
    private final ConcurrentHashMap<String, com.mbridge.msdk.foundation.d.a.a> e;
    private g f;

    private b() {
        this.d = new RelativeLayout.LayoutParams(b, f2780a);
        this.e = new ConcurrentHashMap<>();
    }

    public static b a() {
        return a.f2781a;
    }

    public final void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.mbridge.msdk.foundation.d.a aVar) {
        if (b()) {
            com.mbridge.msdk.foundation.d.a.a aVarA = a(str);
            if (aVar != null) {
                aVarA.a(new a.C0264a(str, aVar));
            }
            FeedBackButton feedBackButtonD = aVarA.d();
            if (feedBackButtonD != null) {
                if (layoutParams == null) {
                    int iA = ai.a(c.m().c(), 10.0f);
                    this.d.setMargins(iA, iA, iA, iA);
                    layoutParams = this.d;
                }
                ViewGroup viewGroup2 = (ViewGroup) feedBackButtonD.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(feedBackButtonD);
                }
                Activity activityA = a(context);
                if (activityA != null && viewGroup == null) {
                    viewGroup = (ViewGroup) activityA.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(feedBackButtonD);
                    viewGroup.addView(feedBackButtonD, layoutParams);
                }
            }
        }
    }

    public final boolean b() {
        g gVarB = h.a().b(c.m().k());
        this.f = gVarB;
        if (gVarB != null) {
            return false;
        }
        h.a();
        this.f = i.a();
        return false;
    }

    public final com.mbridge.msdk.foundation.d.a.a a(String str) {
        com.mbridge.msdk.foundation.d.a.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = c.m().k();
        }
        if (!this.e.containsKey(str)) {
            aVar = new com.mbridge.msdk.foundation.d.a.a(str);
            this.e.put(str, aVar);
        } else {
            aVar = this.e.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.foundation.d.a.a aVar2 = new com.mbridge.msdk.foundation.d.a.a(str);
        this.e.put(str, aVar2);
        return aVar2;
    }

    public final Activity a(Context context) {
        Activity activity;
        Context contextE = c.m().e();
        Activity activity2 = null;
        try {
            Activity activity3 = contextE instanceof Activity ? (Activity) contextE : null;
            try {
                if ((context instanceof Activity) && (Build.VERSION.SDK_INT < 17 || !((Activity) context).isDestroyed())) {
                    activity3 = (Activity) context;
                }
                WeakReference<Activity> weakReferenceA = c.m().a();
                if (weakReferenceA != null && (activity = weakReferenceA.get()) != null && !activity.isFinishing() && (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed())) {
                    activity3 = activity;
                }
                if (activity3 == null || activity3.isFinishing()) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    if (activity3.isDestroyed()) {
                        return null;
                    }
                }
                return activity3;
            } catch (Exception e) {
                e = e;
                activity2 = activity3;
                e.printStackTrace();
                return activity2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void a(String str, int i, ViewGroup viewGroup) {
        com.mbridge.msdk.foundation.d.a.a aVarA = a(str);
        if (aVarA.d() != null) {
            aVarA.c(i);
            if (i == 0) {
                a(str, c.m().c(), viewGroup, (ViewGroup.LayoutParams) null, (com.mbridge.msdk.foundation.d.a) null);
            }
        }
    }

    public final void a(String str, int i, int i2, int i3, float f, float f2, float f3, String str2, String str3, float f4, JSONArray jSONArray) {
        com.mbridge.msdk.foundation.d.a.a aVarA = a(str);
        Context contextC = c.m().c();
        aVarA.a(ai.a(contextC, f), ai.a(contextC, f2), ai.a(contextC, i), ai.a(contextC, i2), ai.a(contextC, i3), f3, str2, str3, f4, jSONArray);
    }

    public final void a(String str, int i, com.mbridge.msdk.foundation.d.a aVar) {
        com.mbridge.msdk.foundation.d.a.a aVarA = a(str);
        aVarA.a(new a.C0264a(str, aVar));
        if (i == 1) {
            aVarA.b();
        } else {
            aVarA.e();
        }
    }

    public final FeedBackButton b(String str) {
        return a(str).d();
    }

    public final void c(String str) {
        try {
            com.mbridge.msdk.foundation.d.a.a aVarD = d(str);
            if (aVarD != null) {
                aVarD.a();
            }
            this.e.remove(str);
            c = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private com.mbridge.msdk.foundation.d.a.a d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = c.m().k();
        }
        if (this.e.containsKey(str)) {
            return this.e.get(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[PHI: r2
      0x006e: PHI (r2v8 com.mbridge.msdk.foundation.d.a.a) = 
      (r2v7 com.mbridge.msdk.foundation.d.a.a)
      (r2v11 com.mbridge.msdk.foundation.d.a.a)
      (r2v14 com.mbridge.msdk.foundation.d.a.a)
     binds: [B:5:0x0035, B:7:0x004e, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r15, int r16, int r17, java.lang.String r18, java.lang.String r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            java.lang.String r3 = "_"
            r2.append(r3)
            r4 = 1
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.mbridge.msdk.foundation.d.a.a r2 = r14.d(r2)
            r4 = 0
            if (r2 != 0) goto L71
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r3)
            r5 = 2
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.mbridge.msdk.foundation.d.a.a r2 = r14.d(r2)
            if (r2 != 0) goto L6e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r3)
            r5 = 3
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.mbridge.msdk.foundation.d.a.a r2 = r14.d(r2)
            if (r2 != 0) goto L6e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r3)
            r3 = 4
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.mbridge.msdk.foundation.d.a.a r2 = r14.d(r2)
            if (r2 != 0) goto L6e
            com.mbridge.msdk.foundation.d.a.a r2 = r14.a(r15)
            goto L71
        L6e:
            r2.b(r4)
        L71:
            if (r2 == 0) goto La4
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r2.c()
            java.lang.String r1 = ""
            if (r5 == 0) goto L81
            java.lang.String r3 = r5.getCampaignUnitId()
            r6 = r3
            goto L82
        L81:
            r6 = r1
        L82:
            int r7 = r2.g()
            int r8 = r2.f()
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            if (r2 != 0) goto L93
            r9 = r18
            goto L94
        L93:
            r9 = r1
        L94:
            if (r5 == 0) goto L9a
            int r4 = r5.getAdType()
        L9a:
            r11 = r4
            r10 = r16
            r12 = r17
            r13 = r19
            com.mbridge.msdk.foundation.same.report.k.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.d.b.a(java.lang.String, int, int, java.lang.String, java.lang.String):void");
    }

    public final void a(String str, CampaignEx campaignEx) {
        a(str).a(campaignEx);
    }

    public final void a(String str, String str2) {
        a(str).a(str2);
    }

    public final void a(String str, FeedBackButton feedBackButton) {
        a(str).a(feedBackButton);
    }

    public final void a(String str, com.mbridge.msdk.foundation.d.a aVar) {
        com.mbridge.msdk.foundation.d.a.a aVarA = a(str);
        if (aVar != null) {
            aVarA.a(new a.C0264a(str, aVar));
        }
    }

    public final void a(String str, int i) {
        a(str).a(i);
    }

    public final void b(String str, int i) {
        a(str).b(i);
    }

    public final boolean a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog == null) {
            ad.c("", "mbAlertDialog  is null");
            return false;
        }
        return a(context, mBFeedBackDialog);
    }

    private boolean a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity activityA = a(context);
        if (activityA == null || mBFeedBackDialog == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 17 && activityA.isDestroyed()) {
            return false;
        }
        try {
            if (mBFeedBackDialog.isShowing() || activityA.isFinishing()) {
                return false;
            }
            mBFeedBackDialog.show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* compiled from: FeedbackManager.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f2781a = new b();
    }
}
