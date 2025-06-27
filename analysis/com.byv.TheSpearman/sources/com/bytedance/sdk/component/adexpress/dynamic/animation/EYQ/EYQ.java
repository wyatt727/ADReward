package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.animation.ObjectAnimator;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AlphaAnimation.java */
/* loaded from: classes2.dex */
public class EYQ extends Pm {
    public EYQ(View view, com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ eyq) {
        super(view, eyq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ.Pm
    List<ObjectAnimator> EYQ() {
        float fUc = this.mZx.Uc() / 100.0f;
        float fHYh = this.mZx.hYh() / 100.0f;
        if ("reverse".equals(this.mZx.hu()) && this.mZx.nWX() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            fHYh = fUc;
            fUc = fHYh;
        }
        this.Td.setAlpha(fUc);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.Td, "alpha", fUc, fHYh).setDuration((int) (this.mZx.tp() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(EYQ(duration));
        return arrayList;
    }
}
