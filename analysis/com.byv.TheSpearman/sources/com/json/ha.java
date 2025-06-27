package com.json;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0006H&R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0007\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/ironsource/ha;", "", "Landroid/app/Activity;", "activity", "Lorg/json/JSONObject;", "loadParams", "", "a", "destroy", "Lcom/ironsource/v7;", "viewHolder", "Lcom/ironsource/ge;", "viewVisibilityParams", "clickParams", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/ha$a;", "()Lcom/ironsource/ha$a;", "(Lcom/ironsource/ha$a;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface ha {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/ironsource/ha$a;", "", "Lcom/ironsource/s7;", "adData", "", "a", "", "reason", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a();

        void a(ISNNativeAdData adData);

        void a(String reason);

        void b();
    }

    a a();

    void a(Activity activity, JSONObject loadParams);

    void a(ViewVisibilityParams viewVisibilityParams);

    void a(a aVar);

    void a(ISNNativeAdViewHolder viewHolder);

    void a(JSONObject clickParams);

    void b();

    void destroy();
}
