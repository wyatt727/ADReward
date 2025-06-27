package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ironsource/f8;", "", "Lorg/json/JSONObject;", "a", "Ljava/util/ArrayList;", "", "Ljava/util/ArrayList;", "mInitKeyList", "Lcom/ironsource/k5;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/k5;", "mGlobalDataReader", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<String> mInitKeyList = new ArrayList<>(new e8().a());

    /* renamed from: b, reason: from kotlin metadata */
    private final k5 mGlobalDataReader = new k5();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.mGlobalDataReader.a(this.mInitKeyList);
        Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return jSONObjectA;
    }
}
