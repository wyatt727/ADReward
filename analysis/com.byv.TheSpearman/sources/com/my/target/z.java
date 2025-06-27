package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class z extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile Map<String, String> f4197a;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, s7 s7Var, String str, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != i) {
            s7Var.a(scope);
            synchronized (this) {
                this.f4197a.put("asis", String.valueOf(scope));
            }
            ba.a("AppSetIdDataProvider: new scope value has been received: " + scope);
        }
        String id = appSetIdInfo.getId();
        if (id.equals(str)) {
            return;
        }
        s7Var.c(id);
        synchronized (this) {
            this.f4197a.put("asid", id);
        }
        ba.a("AppSetIdDataProvider: new id value has been received: " + id);
    }

    public synchronized Map<String, String> a(MyTargetConfig myTargetConfig, Context context) {
        if (c0.a()) {
            ba.a("AppSetIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.f4197a != null) {
            return new HashMap(this.f4197a);
        }
        this.f4197a = new HashMap();
        final s7 s7VarA = s7.a(context);
        final String strA = s7VarA.a();
        final int iB = s7VarA.b();
        if (!TextUtils.isEmpty(strA)) {
            this.f4197a.put("asid", strA);
        }
        if (iB != -1) {
            this.f4197a.put("asis", String.valueOf(iB));
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(c0.f3933a, new OnSuccessListener() { // from class: com.my.target.z$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f$0.a(iB, s7VarA, strA, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable unused) {
            ba.a("AppSetIdDataProvider: error occurred while trying to access app set id info");
        }
        return new HashMap(this.f4197a);
    }
}
