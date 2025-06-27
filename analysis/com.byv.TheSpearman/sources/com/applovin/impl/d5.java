package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.l0;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class d5 {
    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.applovin.impl.d5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                d5.b(context);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Context context) {
        l0.a aVarB = l0.b(context);
        com.applovin.impl.sdk.n.a(aVarB);
        com.applovin.impl.sdk.l.a(aVarB);
        if (zp.a("com.google.android.gms.appset.AppSet")) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
            } catch (Throwable unused) {
            }
        }
    }

    class a implements OnSuccessListener {
        a() {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            Objects.requireNonNull(appSetIdInfo, "info is marked non-null but is null");
            com.applovin.impl.sdk.n.a(new n.c(appSetIdInfo.getId(), appSetIdInfo.getScope()));
            com.applovin.impl.sdk.l.a(new l.b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
        }
    }
}
