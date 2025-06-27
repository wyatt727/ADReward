package com.json;

import com.json.mediationsdk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ironsource/i4;", "Lcom/ironsource/ba;", "", "Lcom/ironsource/mediationsdk/d$a;", "input", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class i4 implements ba<String, d.a> {
    @Override // com.json.ba
    public d.a a(String input) throws JSONException {
        Intrinsics.checkNotNullParameter(input, "input");
        d.a aVarB = d.c().b(new JSONObject(input));
        Intrinsics.checkNotNullExpressionValue(aVarB, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarB;
    }
}
