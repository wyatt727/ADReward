package com.json;

import com.json.t2;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0004"}, d2 = {"Lorg/json/JSONObject;", "", t2.h.W, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: com.ironsource.t7, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class JSONObject {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(org.json.JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString(str);
        if (strOptString.length() == 0) {
            return null;
        }
        return strOptString;
    }
}
