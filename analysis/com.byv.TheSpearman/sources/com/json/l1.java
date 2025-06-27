package com.json;

import android.app.Activity;
import android.content.Context;
import com.json.f7;
import com.json.sdk.controller.v;

/* loaded from: classes4.dex */
public class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static l1 f1865a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1866a;

        static {
            int[] iArr = new int[f7.a.values().length];
            f1866a = iArr;
            try {
                iArr[f7.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1866a[f7.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1866a[f7.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static l1 a() {
        l1 l1Var = f1865a;
        return l1Var == null ? new l1() : l1Var;
    }

    public boolean a(Activity activity) throws NumberFormatException {
        if (a.f1866a[e9.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            v vVar = (v) s8.b((Context) activity).a().j();
            if (vVar == null) {
                return true;
            }
            vVar.k("back");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
