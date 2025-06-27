package com.my.tracker.recsys;

import android.os.Handler;
import com.my.tracker.obfuscated.g;
import com.my.tracker.recsys.OfferRequest;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class OfferRequestBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final String f4284a;
    private OfferRequest.OnCompleteListener e;
    private final List<String> b = new ArrayList();
    private String c = null;
    private Boolean d = null;
    private Handler f = g.f4225a;

    private OfferRequestBuilder(String str) {
        this.f4284a = str;
    }

    public static OfferRequestBuilder newBuilder(String str) {
        return new OfferRequestBuilder(str);
    }

    public OfferRequest build() {
        return new OfferRequest(this.f4284a, this.b, this.c, this.d, this.e, this.f);
    }

    public OfferRequestBuilder withData(String str) {
        this.c = str;
        return this;
    }

    public OfferRequestBuilder withHandler(Handler handler) {
        this.f = handler;
        return this;
    }

    public OfferRequestBuilder withPlacementIds(String... strArr) {
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (strArr == null) {
            return this;
        }
        for (String str : strArr) {
            if (str != null && !this.b.contains(str)) {
                this.b.add(str);
            }
        }
        return this;
    }

    public OfferRequestBuilder withRequestListener(OfferRequest.OnCompleteListener onCompleteListener) {
        this.e = onCompleteListener;
        return this;
    }

    public OfferRequestBuilder withReset(boolean z) {
        this.d = Boolean.valueOf(z);
        return this;
    }
}
