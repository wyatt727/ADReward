package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* compiled from: MBridgeMraidDownloader.java */
/* loaded from: classes4.dex */
public final class w extends q {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f3354a;
    private final com.mbridge.msdk.newreward.function.d.a.a b;
    private final l c;

    public w(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, l lVar) {
        this.f3354a = bVar;
        this.b = aVar;
        this.c = lVar;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i, x xVar) throws NoSuchAlgorithmException, IOException {
        File file;
        FileOutputStream fileOutputStream;
        CampaignEx campaignExG = this.b.g();
        if (TextUtils.isEmpty(campaignExG.getMraid())) {
            xVar.b(this.f3354a, this.b, this);
            return;
        }
        String strA = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
        String md5 = SameMD5.getMD5(campaignExG.getMraid());
        if (TextUtils.isEmpty(md5)) {
            md5 = String.valueOf(System.currentTimeMillis());
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            file = new File(strA, md5.concat(".html"));
            fileOutputStream = new FileOutputStream(file);
        } catch (Exception unused) {
        }
        try {
            fileOutputStream.write(("<script>" + com.mbridge.msdk.c.b.a.a().b() + "</script>" + campaignExG.getMraid()).getBytes());
            fileOutputStream.flush();
            campaignExG.setMraid(file.getAbsolutePath());
        } catch (Exception unused2) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            campaignExG.setMraid("");
            xVar.b(this.f3354a, this.b, this);
        }
        xVar.b(this.f3354a, this.b, this);
    }
}
