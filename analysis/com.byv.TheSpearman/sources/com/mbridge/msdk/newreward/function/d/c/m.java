package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;

/* compiled from: CampaignResourcePauseTemplate.java */
/* loaded from: classes4.dex */
public final class m extends c {
    private final String c;

    @Override // com.mbridge.msdk.newreward.function.d.c.c
    protected final boolean a_() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 7;
    }

    public m(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, String str) {
        super(bVar, aVar);
        this.c = str;
        b(true);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return new v(a(), b(), this);
    }
}
