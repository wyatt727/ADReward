package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;

/* compiled from: CampaignResourceH5TemplateBig.java */
/* loaded from: classes4.dex */
public final class i extends c {
    @Override // com.mbridge.msdk.newreward.function.d.c.c
    protected final boolean a_() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 3;
    }

    public i(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        b(true);
        a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        if (b() == null) {
            return "";
        }
        String strZ = a().z();
        return TextUtils.isEmpty(strZ) ? "" : strZ;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return new z(a(), b(), this);
    }
}
