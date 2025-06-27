package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.e.a;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class DownloaderReporter {
    private static final String KEY = "key=";
    private static final String TAG = "DownloaderReporter";
    private final Map<String, String> _params;
    private final String _reportKey;

    private DownloaderReporter(Builder builder) {
        this._reportKey = builder._reportKey;
        this._params = builder._params;
    }

    public final void report() {
        String str = KEY + this._reportKey + asUrlParams(this._params);
        if (e.a().b()) {
            e.a().a(str);
            return;
        }
        try {
            new a(c.m().c()).post(0, d.f().c, k.a(str, c.m().c(), ""), null);
        } catch (Exception e) {
            ad.b(TAG, "report exception: " + e.getMessage());
        }
    }

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    String strEncodeValue = encodeValue(map.get(str));
                    sb.append(t2.i.c);
                    sb.append(str);
                    sb.append(t2.i.b);
                    sb.append(strEncodeValue);
                }
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private String encodeValue(String str) {
        try {
            return URLEncoder.encode(str, m4.M);
        } catch (Exception unused) {
            return str;
        }
    }

    public static class Builder {
        private final Map<String, String> _params;
        private final String _reportKey;

        public Builder(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("reportKey can not be empty");
            }
            this._reportKey = str;
            this._params = new HashMap();
        }

        public Builder add(String str, String str2) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    this._params.put(str, str2);
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public DownloaderReporter build() {
            return new DownloaderReporter(this);
        }
    }
}
