package com.bytedance.sdk.openadsdk.core.VwS.Td;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: VastMacroHelper.java */
/* loaded from: classes2.dex */
public class Td {
    private final List<String> EYQ;
    private final Map<mZx, String> mZx;

    public Td(List<String> list) {
        this.EYQ = list;
        HashMap map = new HashMap();
        this.mZx = map;
        map.put(mZx.CACHEBUSTING, mZx());
    }

    public List<String> EYQ() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.EYQ) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (mZx mzx : mZx.values()) {
                    String str = this.mZx.get(mzx);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = strReplaceAll.replaceAll("\\[" + mzx.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    public Td EYQ(com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ eyq) {
        if (eyq != null) {
            this.mZx.put(mZx.ERRORCODE, eyq.EYQ());
        }
        return this;
    }

    public Td EYQ(long j) {
        if (j >= 0) {
            String strMZx = mZx(j);
            if (!TextUtils.isEmpty(strMZx)) {
                this.mZx.put(mZx.CONTENTPLAYHEAD, strMZx);
            }
        }
        return this;
    }

    public Td EYQ(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, C.UTF8_NAME);
            } catch (Throwable unused) {
            }
            this.mZx.put(mZx.ASSETURI, str);
        }
        return this;
    }

    private String mZx() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    private String mZx(long j) {
        return String.format(Locale.getDefault(), "%02d:%02d:%02d.%03d", Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % 1000));
    }
}
