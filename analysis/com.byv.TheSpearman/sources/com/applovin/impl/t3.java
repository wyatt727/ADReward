package com.applovin.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class t3 extends xl {
    private final String h;
    private final com.applovin.impl.sdk.network.a i;

    public t3(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.h = str;
        this.i = aVar;
    }

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z) {
            super(aVar, kVar, z);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            this.f1179a.o().a(t3.this.h, t3.this.i.f(), i, jSONObject, str2, false);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, JSONObject jSONObject, int i) {
            this.f1179a.o().a(t3.this.h, t3.this.i.f(), i, jSONObject, null, true);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1179a.l0().a(new a(this.i, this.f1179a, d()));
    }
}
