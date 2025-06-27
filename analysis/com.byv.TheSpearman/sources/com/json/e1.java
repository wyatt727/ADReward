package com.json;

import com.json.i5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/e1;", "", "Lorg/json/JSONObject;", "tokenData", "a", "Lcom/ironsource/i5$a;", "Lcom/ironsource/i5$a;", "adUnit", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/util/ArrayList;", "mAuctionKeyList", "Lcom/ironsource/k5;", "c", "Lcom/ironsource/k5;", "mGlobalDataReader", "<init>", "(Lcom/ironsource/i5$a;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i5.a adUnit;

    /* renamed from: b, reason: from kotlin metadata */
    private final ArrayList<String> mAuctionKeyList = new ArrayList<>(new c1().a());

    /* renamed from: c, reason: from kotlin metadata */
    private final k5 mGlobalDataReader = new k5();

    public e1(i5.a aVar) {
        this.adUnit = aVar;
    }

    private final JSONObject a(JSONObject tokenData) throws JSONException {
        JSONObject jSONObjectB = l5.b(tokenData.optJSONObject(i5.r));
        if (jSONObjectB != null) {
            tokenData.put(i5.r, jSONObjectB);
        }
        return tokenData;
    }

    public final JSONObject a() throws JSONException {
        i5.a aVar = this.adUnit;
        JSONObject jSONObjectA = aVar != null ? this.mGlobalDataReader.a(this.mAuctionKeyList, aVar) : null;
        if (jSONObjectA == null) {
            jSONObjectA = this.mGlobalDataReader.a(this.mAuctionKeyList);
            Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(jSONObjectA);
    }
}
