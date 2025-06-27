package com.my.target;

import android.content.Context;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class qa {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<m7> f4108a;
    public final ArrayList<w5> b;
    public WeakReference<View> c;
    public float d = -1.0f;

    public qa(ArrayList<m7> arrayList, ArrayList<w5> arrayList2) {
        this.b = arrayList2;
        this.f4108a = arrayList;
    }

    public static qa a(v9 v9Var) {
        return new qa(v9Var.b(), v9Var.a());
    }

    public void a() {
        WeakReference<View> weakReference = this.c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.b.clear();
        this.f4108a.clear();
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(double r16, float r18, float r19, android.content.Context r20) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.qa.a(double, float, float, android.content.Context):void");
    }

    public void a(float f, float f2) {
        View view;
        if (r1.a(f, f2) != -1 || Math.abs(f - this.d) >= 1.0f) {
            Context context = null;
            double dA = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            WeakReference<View> weakReference = this.c;
            if (weakReference != null && (view = weakReference.get()) != null) {
                dA = pa.a(view);
                context = view.getContext();
            }
            a(dA, f, f2, context);
            this.d = f;
        }
    }

    public void a(View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.c) == null) {
            this.c = new WeakReference<>(view);
        } else {
            weakReference.clear();
        }
    }
}
