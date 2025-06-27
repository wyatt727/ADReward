package com.json;

import android.text.TextUtils;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class x0 extends k4 {
    public x0(a0 a0Var) {
        super(a0Var);
    }

    public void a() {
        a(y.AUCTION_REQUEST);
    }

    public void a(int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        a(y.AUCTION_FAILED_NO_CANDIDATES, map);
    }

    public void a(long j, int i, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        a(y.AUCTION_FAILED, map);
    }

    public void a(long j, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        a(y.AUCTION_SUCCESS, map);
    }

    public void a(String str) {
        HashMap map = new HashMap();
        map.put("auctionId", str);
        a(y.AD_UNIT_CAPPED, map);
    }

    public void b(String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        a(y.AUCTION_REQUEST_WATERFALL, map);
    }

    public void c(String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str);
        a(y.AUCTION_RESULT_WATERFALL, map);
    }
}
