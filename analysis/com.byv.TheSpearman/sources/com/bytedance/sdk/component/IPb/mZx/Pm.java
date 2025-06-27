package com.bytedance.sdk.component.IPb.mZx;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.mZx.EYQ.HX;
import com.bytedance.sdk.component.mZx.EYQ.IPb;
import com.bytedance.sdk.component.mZx.EYQ.KO;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import com.bytedance.sdk.component.mZx.EYQ.hu;
import com.bytedance.sdk.component.mZx.EYQ.nWX;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import com.json.m4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: PostExecutor.java */
/* loaded from: classes2.dex */
public class Pm extends Td {
    nWX EYQ;

    public Pm(MxO mxO) {
        super(mxO);
        this.EYQ = null;
    }

    public void Td(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.EYQ = nWX.EYQ(HX.EYQ("application/json; charset=utf-8"), str);
    }

    public void EYQ(JSONObject jSONObject) {
        this.EYQ = nWX.EYQ(HX.EYQ("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : JsonUtils.EMPTY_JSON);
    }

    public void EYQ(String str, byte[] bArr) {
        this.EYQ = nWX.EYQ(HX.EYQ(str), bArr);
    }

    public void EYQ(final com.bytedance.sdk.component.IPb.EYQ.EYQ eyq) {
        try {
            pi.EYQ eyq2 = new pi.EYQ();
            if (TextUtils.isEmpty(this.IPb)) {
                eyq.EYQ(this, new IOException("Url is Empty"));
                return;
            }
            eyq2.EYQ(this.IPb);
            if (this.EYQ == null) {
                if (eyq != null) {
                    eyq.EYQ(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                EYQ(eyq2);
                eyq2.EYQ((Object) mZx());
                this.Td.EYQ(eyq2.EYQ(this.EYQ).mZx()).EYQ(new com.bytedance.sdk.component.mZx.EYQ.Td() { // from class: com.bytedance.sdk.component.IPb.mZx.Pm.1
                    @Override // com.bytedance.sdk.component.mZx.EYQ.Td
                    public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx mzx, IOException iOException) {
                        com.bytedance.sdk.component.IPb.EYQ.EYQ eyq3 = eyq;
                        if (eyq3 != null) {
                            eyq3.EYQ(Pm.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
                    @Override // com.bytedance.sdk.component.mZx.EYQ.Td
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx r13, com.bytedance.sdk.component.mZx.EYQ.KO r14) throws java.io.IOException {
                        /*
                            Method dump skipped, instructions count: 260
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.IPb.mZx.Pm.AnonymousClass1.EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx, com.bytedance.sdk.component.mZx.EYQ.KO):void");
                    }
                });
            }
        } catch (Throwable th) {
            eyq.EYQ(this, new IOException(th.getMessage()));
        }
    }

    public com.bytedance.sdk.component.IPb.mZx EYQ() {
        com.bytedance.sdk.component.IPb.mZx mzx;
        try {
            pi.EYQ eyq = new pi.EYQ();
            if (TextUtils.isEmpty(this.IPb)) {
                return new com.bytedance.sdk.component.IPb.mZx(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            eyq.EYQ(this.IPb);
            if (this.EYQ == null) {
                return new com.bytedance.sdk.component.IPb.mZx(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            EYQ(eyq);
            eyq.EYQ((Object) mZx());
            KO koEYQ = this.Td.EYQ(eyq.EYQ(this.EYQ).mZx()).EYQ();
            if (koEYQ == null) {
                return null;
            }
            HashMap map = new HashMap();
            IPb iPbVwS = koEYQ.VwS();
            if (iPbVwS != null) {
                for (int i = 0; i < iPbVwS.EYQ(); i++) {
                    String strEYQ = iPbVwS.EYQ(i);
                    String strMZx = iPbVwS.mZx(i);
                    map.put(strEYQ, strMZx);
                    if (strEYQ != null && strEYQ.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strMZx == null ? "" : strMZx.toLowerCase());
                    }
                }
            }
            if (com.bytedance.sdk.component.IPb.Pm.EYQ.EYQ(map)) {
                byte[] bArrPm = koEYQ.IPb().Pm();
                mzx = new com.bytedance.sdk.component.IPb.mZx(koEYQ.Pm(), koEYQ.Td(), koEYQ.Kbd(), map, null, koEYQ.mZx(), koEYQ.EYQ());
                mzx.EYQ(bArrPm);
            } else if (this.VwS) {
                byte[] bArrPm2 = koEYQ.IPb().Pm();
                mzx = new com.bytedance.sdk.component.IPb.mZx(koEYQ.Pm(), koEYQ.Td(), koEYQ.Kbd(), map, new String(bArrPm2, EYQ(EYQ(koEYQ.IPb()))), koEYQ.mZx(), koEYQ.EYQ());
                mzx.EYQ(bArrPm2);
            } else {
                mzx = new com.bytedance.sdk.component.IPb.mZx(koEYQ.Pm(), koEYQ.Td(), koEYQ.Kbd(), map, koEYQ.IPb().mZx(), koEYQ.mZx(), koEYQ.EYQ());
            }
            EYQ(mzx, koEYQ);
            return mzx;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.IPb.mZx(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public nWX Td() {
        return this.EYQ;
    }

    public void EYQ(String str, boolean z) {
        if (z) {
            EYQ("application/json; charset=utf-8", Pm(str));
            mZx("Content-Encoding", "gzip");
        } else {
            Td(str);
        }
    }

    private byte[] Pm(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e2) {
                com.bytedance.sdk.component.utils.pi.EYQ("PostExecutor", e2.toString());
            }
            try {
                gZIPOutputStream.write(str.getBytes(m4.M));
                try {
                    gZIPOutputStream.close();
                } catch (IOException e3) {
                    com.bytedance.sdk.component.utils.pi.EYQ("PostExecutor", e3.toString());
                }
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                e = e4;
                gZIPOutputStream2 = gZIPOutputStream;
                com.bytedance.sdk.component.utils.pi.EYQ("PostExecutor", e.toString());
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e5) {
                        com.bytedance.sdk.component.utils.pi.EYQ("PostExecutor", e5.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e6) {
                        com.bytedance.sdk.component.utils.pi.EYQ("PostExecutor", e6.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        com.bytedance.sdk.component.utils.pi.EYQ("PostExecutor", e7.toString());
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset EYQ(HX hx) {
        try {
            return hx != null ? hx.EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ) : com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.mZx.EYQ.mZx.HX.EYQ;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HX EYQ(hu huVar) {
        try {
            return huVar.Kbd();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(com.bytedance.sdk.component.IPb.mZx mzx, KO ko) {
        if (mzx == null || ko == null) {
            return;
        }
        mzx.EYQ(ko.HX());
    }
}
