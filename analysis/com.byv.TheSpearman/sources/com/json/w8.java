package com.json;

import android.content.Context;
import com.json.mediationsdk.model.InterstitialPlacement;
import com.json.mediationsdk.model.Placement;
import java.util.Map;

/* loaded from: classes4.dex */
public interface w8 extends ta, z9, b8 {
    void a(Context context, boolean z);

    void a(Map<String, String> map);

    void a(boolean z);

    String b(Context context);

    void b();

    void d();

    void e();

    boolean e(String str);

    void f();

    InterstitialPlacement g(String str);

    void h(String str);

    Placement i(String str);
}
