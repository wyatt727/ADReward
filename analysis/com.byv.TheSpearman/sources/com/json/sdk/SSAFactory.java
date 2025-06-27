package com.json.sdk;

import android.app.Activity;
import android.content.Context;
import com.json.jc;
import com.json.s8;

@Deprecated
/* loaded from: classes4.dex */
public class SSAFactory {
    public static jc getPublisherInstance(Activity activity) throws Exception {
        return s8.b((Context) activity);
    }

    public static jc getPublisherTestInstance(Activity activity, int i) throws Exception {
        return s8.a(activity, i);
    }
}
