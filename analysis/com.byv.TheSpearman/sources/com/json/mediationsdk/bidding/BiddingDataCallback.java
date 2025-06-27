package com.json.mediationsdk.bidding;

import java.util.Map;

/* loaded from: classes4.dex */
public interface BiddingDataCallback {
    void onFailure(String str);

    void onSuccess(Map<String, Object> map);
}
