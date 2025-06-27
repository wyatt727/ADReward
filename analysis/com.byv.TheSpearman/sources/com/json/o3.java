package com.json;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.mediationsdk.ISBannerSize;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.json.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.json.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\n\f\rJ7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000e"}, d2 = {"Lcom/ironsource/o3;", "", "Landroid/content/Context;", "context", "", "appKey", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnits", "", "a", "(Landroid/content/Context;Ljava/lang/String;[Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface o3 {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH&J&\u0010\u0007\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&J0\u0010\u0007\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH&¨\u0006\u000e"}, d2 = {"Lcom/ironsource/o3$a;", "", "Landroid/app/Activity;", "activity", "Lcom/ironsource/mediationsdk/ISBannerSize;", "size", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyBannerLayout;", "a", "", "instanceId", "", "c", AdFormat.BANNER, "adm", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize size);

        void a(Activity activity, ISDemandOnlyBannerLayout banner, String instanceId);

        void a(Activity activity, ISDemandOnlyBannerLayout banner, String instanceId, String adm);

        void c(String instanceId);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J&\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u000e"}, d2 = {"Lcom/ironsource/o3$b;", "", "", "instanceId", "", "f", "Landroid/app/Activity;", "activity", "", "a", "adm", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyInterstitialListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a(Activity activity, String instanceId);

        void a(ISDemandOnlyInterstitialListener listener);

        void b(Activity activity, String instanceId, String adm);

        void b(String instanceId);

        boolean f(String instanceId);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J&\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u000e"}, d2 = {"Lcom/ironsource/o3$c;", "", "", "instanceId", "", CampaignEx.JSON_KEY_AD_K, "Landroid/app/Activity;", "activity", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "adm", "a", "Lcom/ironsource/mediationsdk/demandOnly/ISDemandOnlyRewardedVideoListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface c {
        void a(Activity activity, String instanceId, String adm);

        void a(ISDemandOnlyRewardedVideoListener listener);

        void a(String instanceId);

        void b(Activity activity, String instanceId);

        boolean k(String instanceId);
    }

    String a(Context context);

    void a(Context context, String appKey, IronSource.AD_UNIT... adUnits);
}
