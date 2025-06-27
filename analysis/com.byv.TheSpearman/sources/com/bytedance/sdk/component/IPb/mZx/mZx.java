package com.bytedance.sdk.component.IPb.mZx;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.mZx.EYQ.EYQ;
import com.bytedance.sdk.component.mZx.EYQ.IPb;
import com.bytedance.sdk.component.mZx.EYQ.KO;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import com.bytedance.sdk.component.mZx.EYQ.VwS;
import com.bytedance.sdk.component.mZx.EYQ.hu;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: GetExecutor.java */
/* loaded from: classes2.dex */
public class mZx extends Td {
    public static final com.bytedance.sdk.component.mZx.EYQ.EYQ EYQ = new EYQ.C0098EYQ().EYQ().mZx();
    public static final com.bytedance.sdk.component.mZx.EYQ.EYQ mZx = new EYQ.C0098EYQ().mZx();
    private boolean HX;
    private com.bytedance.sdk.component.mZx.EYQ.EYQ QQ;
    private Map<String, String> tp;

    public mZx(MxO mxO) {
        super(mxO);
        this.QQ = EYQ;
        this.HX = false;
        this.tp = new HashMap();
    }

    public void EYQ(String str, String str2) {
        if (str == null) {
            return;
        }
        this.tp.put(str, str2);
    }

    public void EYQ(boolean z) {
        this.HX = z;
    }

    public void EYQ(final com.bytedance.sdk.component.IPb.EYQ.EYQ eyq) {
        try {
            pi.EYQ eyq2 = new pi.EYQ();
            if (this.HX) {
                eyq2.EYQ(this.IPb);
            } else {
                VwS.EYQ eyq3 = new VwS.EYQ();
                Uri uri = Uri.parse(this.IPb);
                eyq3.EYQ(uri.getScheme());
                eyq3.mZx(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    eyq3.Td(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.tp.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.tp.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        eyq3.EYQ(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                eyq2.EYQ(eyq3.mZx());
            }
            EYQ(eyq2);
            eyq2.EYQ(this.QQ);
            eyq2.EYQ((Object) mZx());
            this.Td.EYQ(eyq2.EYQ().mZx()).EYQ(new com.bytedance.sdk.component.mZx.EYQ.Td() { // from class: com.bytedance.sdk.component.IPb.mZx.mZx.1
                @Override // com.bytedance.sdk.component.mZx.EYQ.Td
                public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx mzx, IOException iOException) {
                    com.bytedance.sdk.component.IPb.EYQ.EYQ eyq4 = eyq;
                    if (eyq4 != null) {
                        eyq4.EYQ(mZx.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.mZx.EYQ.Td
                public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx mzx, KO ko) throws IOException {
                    if (eyq != null) {
                        HashMap map = new HashMap();
                        if (ko != null) {
                            IPb iPbVwS = ko.VwS();
                            if (iPbVwS != null) {
                                for (int i = 0; i < iPbVwS.EYQ(); i++) {
                                    map.put(iPbVwS.EYQ(i), iPbVwS.mZx(i));
                                }
                            }
                            hu huVarIPb = ko.IPb();
                            eyq.EYQ(mZx.this, new com.bytedance.sdk.component.IPb.mZx(ko.Pm(), ko.Td(), ko.Kbd(), map, huVarIPb == null ? "" : huVarIPb.mZx(), ko.mZx(), ko.EYQ()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (eyq != null) {
                eyq.EYQ(this, new IOException(th.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.IPb.mZx EYQ() {
        try {
            pi.EYQ eyq = new pi.EYQ();
            String strMZx = "";
            if (this.HX) {
                eyq.EYQ(this.IPb);
            } else {
                VwS.EYQ eyq2 = new VwS.EYQ();
                Uri uri = Uri.parse(this.IPb);
                eyq2.EYQ(uri.getScheme());
                eyq2.mZx(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    eyq2.Td(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.tp.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.tp.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        eyq2.EYQ(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                eyq.EYQ(eyq2.mZx());
            }
            EYQ(eyq);
            eyq.EYQ(this.QQ);
            eyq.EYQ((Object) mZx());
            KO koEYQ = this.Td.EYQ(eyq.EYQ().mZx()).EYQ();
            if (koEYQ == null) {
                return null;
            }
            HashMap map = new HashMap();
            IPb iPbVwS = koEYQ.VwS();
            if (iPbVwS != null) {
                for (int i = 0; i < iPbVwS.EYQ(); i++) {
                    map.put(iPbVwS.EYQ(i), iPbVwS.mZx(i));
                }
            }
            hu huVarIPb = koEYQ.IPb();
            if (huVarIPb != null) {
                strMZx = huVarIPb.mZx();
            }
            return new com.bytedance.sdk.component.IPb.mZx(koEYQ.Pm(), koEYQ.Td(), koEYQ.Kbd(), map, strMZx, koEYQ.mZx(), koEYQ.EYQ());
        } catch (Throwable unused) {
            return null;
        }
    }
}
