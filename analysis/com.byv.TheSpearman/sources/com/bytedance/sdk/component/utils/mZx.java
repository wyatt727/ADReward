package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;

/* compiled from: ActivityUtil.java */
/* loaded from: classes2.dex */
public class mZx {

    /* compiled from: ActivityUtil.java */
    public interface EYQ {
        void EYQ();

        void EYQ(Throwable th);
    }

    public static boolean EYQ(Context context, Intent intent, EYQ eyq) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (eyq == null) {
                    return true;
                }
                eyq.EYQ();
                return true;
            } catch (Throwable th) {
                if (eyq != null) {
                    eyq.EYQ(th);
                }
            }
        }
        return false;
    }

    public static Activity EYQ(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }
}
