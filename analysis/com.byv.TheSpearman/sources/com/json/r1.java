package com.json;

import com.json.mediationsdk.model.BasePlacement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/ironsource/r1;", "Lcom/ironsource/mediationsdk/model/BasePlacement;", "", "toString", "", t2.k, "placementName", "", "isDefault", "Lcom/ironsource/ob;", "placementAvailabilitySettings", "<init>", "(ILjava/lang/String;ZLcom/ironsource/ob;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class r1 extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(int i, String placementName, boolean z, ob obVar) {
        super(i, placementName, z, obVar);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.json.mediationsdk.model.BasePlacement
    public String toString() {
        return super.toString() + ", placementId: " + getCom.ironsource.t2.k java.lang.String();
    }
}
