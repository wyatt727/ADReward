package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.system.NoProGuard;

/* loaded from: classes4.dex */
public class BidResponsed implements NoProGuard {
    public static final String KEY_BID_ID = "bid";
    public static final String KEY_CUR = "cur";
    public static final String KEY_LN = "ln";
    public static final String KEY_PRICE = "price";
    public static final String KEY_TOKEN = "token";
    public static final String KEY_WN = "wn";
    private String bidId;
    private String bidToken;
    private String cur;
    protected String ln;
    private String price;
    protected String wn;

    public String getBidId() {
        return this.bidId;
    }

    protected void setBidId(String str) {
        this.bidId = str;
    }

    public String getPrice() {
        return this.price;
    }

    protected void setPrice(String str) {
        this.price = str;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    protected void setBidToken(String str) {
        this.bidToken = str;
    }

    public String getCur() {
        return this.cur;
    }

    protected void setCur(String str) {
        this.cur = str;
    }

    public String getLn() {
        return this.ln;
    }

    public String getWn() {
        return this.wn;
    }

    public void sendLossNotice(Context context, BidLossCode bidLossCode) {
        if (TextUtils.isEmpty(this.ln) || context == null || bidLossCode == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(this.ln);
        if (this.ln.contains("?")) {
            sb.append(t2.i.c);
        } else {
            sb.append("?");
        }
        sb.append("reason=");
        sb.append(bidLossCode.getCurrentCode());
        a.a(context, (CampaignEx) null, "", sb.toString(), false, false);
    }

    public void sendWinNotice(Context context) {
        if (TextUtils.isEmpty(this.wn) || context == null) {
            return;
        }
        a.a(context, (CampaignEx) null, "", this.wn, false, false);
    }
}
