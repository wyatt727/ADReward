package com.json;

import android.content.Context;
import android.content.Intent;
import com.json.mediationsdk.testSuite.TestSuiteActivity;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002Jo\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0011JG\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0003\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/ironsource/ad;", "", "Lorg/json/JSONObject;", "a", "", "appKey", "sdkVersion", "bundleId", "appName", "appVersion", "", "consent", "initResponse", "isRewardedVideoManual", "generalProperties", "adaptersVersions", "metaData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/json/JSONObject;ZLorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/lang/String;", "Landroid/content/Context;", "context", "testSuiteControllerUrl", "", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ad {
    private final String a(String appKey, String sdkVersion, String bundleId, String appName, String appVersion, Boolean consent, JSONObject initResponse, boolean isRewardedVideoManual, JSONObject generalProperties, JSONObject adaptersVersions, JSONObject metaData) {
        String string = new JSONObject(MapsKt.mapOf(TuplesKt.to(td.p0, t2.e), TuplesKt.to("appKey", appKey), TuplesKt.to("sdkVersion", sdkVersion), TuplesKt.to("bundleId", bundleId), TuplesKt.to("appName", appName), TuplesKt.to("appVersion", appVersion), TuplesKt.to("initResponse", initResponse), TuplesKt.to("isRvManual", Boolean.valueOf(isRewardedVideoManual)), TuplesKt.to("generalProperties", generalProperties), TuplesKt.to("adaptersVersion", adaptersVersions), TuplesKt.to("metaData", metaData), TuplesKt.to("gdprConsent", consent))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(mapOf(\n      …ent\n        )).toString()");
        return string;
    }

    private final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : gd.f1795a.d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    public final void a(Context context, String appKey, JSONObject initResponse, String sdkVersion, String testSuiteControllerUrl, Boolean consent, boolean isRewardedVideoManual) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(testSuiteControllerUrl, "testSuiteControllerUrl");
        gd gdVar = gd.f1795a;
        String strA = a(appKey, sdkVersion, gdVar.c(context), gdVar.a(context), gdVar.b(context), consent, initResponse, isRewardedVideoManual, gdVar.b(), gdVar.c(), a());
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra(bd.f1711a, strA);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }
}
