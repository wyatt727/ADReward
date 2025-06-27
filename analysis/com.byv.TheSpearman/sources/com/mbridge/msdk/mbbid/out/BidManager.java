package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.authoritycontroller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbbid.common.a.b;
import java.util.Map;

/* loaded from: classes4.dex */
public class BidManager {

    /* renamed from: a, reason: collision with root package name */
    private b f3095a;
    private BidListennning b;
    private boolean c;

    public BidManager(String str, String str2) {
        this(str, str2, "0");
    }

    public BidManager(String str, String str2, String str3) {
        this.c = false;
        this.f3095a = new b(str, str2, str3);
    }

    public <T extends CommonBidRequestParams> BidManager(T t) {
        this(t == null ? "" : t.getmPlacementId(), t == null ? "" : t.getmUnitId(), t != null ? t.getmFloorPrice() : "");
        if (t instanceof BannerBidRequestParams) {
            BannerBidRequestParams bannerBidRequestParams = (BannerBidRequestParams) t;
            this.f3095a.a(bannerBidRequestParams.getHeight());
            this.f3095a.b(bannerBidRequestParams.getWidth());
            this.f3095a.b(296);
            if (t instanceof SplashBidRequestParams) {
                SplashBidRequestParams splashBidRequestParams = (SplashBidRequestParams) t;
                this.f3095a.a(splashBidRequestParams.a());
                this.f3095a.a(splashBidRequestParams.getOrientation());
                this.f3095a.b(297);
                return;
            }
            return;
        }
        if (t instanceof AdvancedNativeBidRequestParams) {
            AdvancedNativeBidRequestParams advancedNativeBidRequestParams = (AdvancedNativeBidRequestParams) t;
            this.f3095a.a(advancedNativeBidRequestParams.getHeight());
            this.f3095a.b(advancedNativeBidRequestParams.getWidth());
            this.f3095a.b(298);
        }
    }

    public void setRewardPlus(boolean z) {
        this.c = z;
    }

    public void bid() {
        b bVar = this.f3095a;
        if (bVar != null) {
            bVar.b(this.c);
            return;
        }
        BidListennning bidListennning = this.b;
        if (bidListennning != null) {
            bidListennning.onFailed("you need init the class :BidManager");
        }
    }

    public static String getBuyerUid(Context context) {
        if (com.mbridge.msdk.f.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th) {
                ad.b("BidManager", th.getMessage());
            }
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, "");
    }

    public static String getBuyerUid(Context context, String str) {
        if (com.mbridge.msdk.f.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th) {
                ad.b("BidManager", th.getMessage());
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, str);
    }

    public static String getBuyerUid(Context context, Map<String, String> map) {
        if (com.mbridge.msdk.f.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th) {
                ad.b("BidManager", th.getMessage());
            }
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, map);
    }

    public void setBidListener(BidListennning bidListennning) {
        this.b = bidListennning;
        b bVar = this.f3095a;
        if (bVar != null) {
            bVar.a(bidListennning);
        }
    }
}
