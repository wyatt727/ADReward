package com.json.mediationsdk.model;

import com.json.ob;
import com.json.t2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ironsource/mediationsdk/model/InterstitialPlacement;", "Lcom/ironsource/mediationsdk/model/BasePlacement;", "", t2.k, "", "placementName", "", "isDefault", "Lcom/ironsource/ob;", "placementAvailabilitySettings", "<init>", "(ILjava/lang/String;ZLcom/ironsource/ob;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class InterstitialPlacement extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialPlacement(int i, String placementName, boolean z, ob obVar) {
        super(i, placementName, z, obVar);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }
}
