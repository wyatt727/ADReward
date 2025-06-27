package com.bytedance.sdk.openadsdk.core.VwS.mZx;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.VwS.mZx.Td;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastAbsoluteProgressTracker.java */
/* loaded from: classes2.dex */
public class EYQ extends Td implements Comparable<EYQ> {
    public long EYQ;

    protected EYQ(long j, String str, Td.EnumC0113Td enumC0113Td, Boolean bool) {
        super(str, enumC0113Td, bool);
        this.EYQ = j;
    }

    public static int EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Integer.parseInt(strArrSplit[0]) * 60 * 60 * 1000) + (Integer.parseInt(strArrSplit[1]) * 60 * 1000) + (Float.parseFloat(strArrSplit[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean EYQ(long j) {
        return this.EYQ <= j && !Kbd();
    }

    @Override // java.lang.Comparable
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public int compareTo(EYQ eyq) {
        if (eyq == null) {
            return 1;
        }
        long j = this.EYQ;
        long j2 = eyq.EYQ;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* compiled from: VastAbsoluteProgressTracker.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.VwS.mZx.EYQ$EYQ, reason: collision with other inner class name */
    public static class C0112EYQ {
        private final String EYQ;
        private final long mZx;
        private Td.EnumC0113Td Td = Td.EnumC0113Td.TRACKING_URL;
        private boolean Pm = false;

        public C0112EYQ(String str, long j) {
            this.EYQ = str;
            this.mZx = j;
        }

        public EYQ EYQ() {
            return new EYQ(this.mZx, this.EYQ, this.Td, Boolean.valueOf(this.Pm));
        }
    }

    public JSONObject EYQ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", Td());
        jSONObject.put("trackingMilliseconds", this.EYQ);
        return jSONObject;
    }
}
