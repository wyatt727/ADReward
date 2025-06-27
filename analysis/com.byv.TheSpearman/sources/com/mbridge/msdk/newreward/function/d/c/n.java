package com.mbridge.msdk.newreward.function.d.c;

import java.io.File;
import java.util.ArrayList;

/* compiled from: CampaignResourceVideo.java */
/* loaded from: classes4.dex */
public final class n extends a<File> {
    private final y b;
    private File c;

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 1;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final boolean i() {
        return true;
    }

    public n(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.b = new y(a(), b(), this, 100);
    }

    public final File f() {
        return this.c;
    }

    public final void a(File file) {
        this.c = file;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        return (b() == null || b().g() == null) ? "" : b().g().getVideoUrlEncode();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final boolean g() {
        if (b() == null || b().g() == null) {
            return true;
        }
        ArrayList<Integer> rsIgnoreCheckRule = b().g().getRsIgnoreCheckRule();
        if (rsIgnoreCheckRule == null) {
            return false;
        }
        return rsIgnoreCheckRule.contains(0);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return this.b;
    }
}
