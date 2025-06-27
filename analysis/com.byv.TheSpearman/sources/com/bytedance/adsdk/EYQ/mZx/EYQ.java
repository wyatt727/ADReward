package com.bytedance.adsdk.EYQ.mZx;

import com.bytedance.adsdk.EYQ.mZx.Td.EYQ.HX;
import com.bytedance.adsdk.EYQ.mZx.Td.EYQ.IPb;
import com.bytedance.adsdk.EYQ.mZx.Td.EYQ.Kbd;
import com.bytedance.adsdk.EYQ.mZx.Td.EYQ.Pm;
import com.bytedance.adsdk.EYQ.mZx.Td.EYQ.QQ;
import com.bytedance.adsdk.EYQ.mZx.Td.EYQ.Td;
import com.bytedance.adsdk.EYQ.mZx.Td.EYQ.VwS;
import com.bytedance.adsdk.EYQ.mZx.Td.EYQ.mZx;
import com.bytedance.adsdk.EYQ.mZx.Td.EYQ.tp;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Expression.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static final com.bytedance.adsdk.EYQ.mZx.Td.EYQ EYQ;
    private String Kbd;
    private Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> Pm = new LinkedList();
    private com.bytedance.adsdk.EYQ.mZx.mZx.EYQ Td;
    private final com.bytedance.adsdk.EYQ.mZx.Td.EYQ mZx;

    static {
        int i = 8;
        IPb[] iPbArr = {new tp(), new Pm(), new HX(), new mZx(), new Kbd(), new com.bytedance.adsdk.EYQ.mZx.Td.EYQ.EYQ(), new VwS(), new Td(), new QQ()};
        final com.bytedance.adsdk.EYQ.mZx.Td.EYQ eyq = new com.bytedance.adsdk.EYQ.mZx.Td.EYQ() { // from class: com.bytedance.adsdk.EYQ.mZx.EYQ.1
            @Override // com.bytedance.adsdk.EYQ.mZx.Td.EYQ
            public int EYQ(String str, int i2, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque) {
                return i2;
            }
        };
        while (i >= 0) {
            final IPb iPb = iPbArr[i];
            i--;
            eyq = new com.bytedance.adsdk.EYQ.mZx.Td.EYQ() { // from class: com.bytedance.adsdk.EYQ.mZx.EYQ.2
                @Override // com.bytedance.adsdk.EYQ.mZx.Td.EYQ
                public int EYQ(String str, int i2, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque) {
                    return iPb.EYQ(str, i2, deque, eyq);
                }
            };
        }
        EYQ = eyq;
    }

    private EYQ(String str, com.bytedance.adsdk.EYQ.mZx.Td.EYQ eyq) {
        this.mZx = eyq;
        this.Kbd = str;
        try {
            EYQ();
        } catch (Exception e) {
            throw new com.bytedance.adsdk.EYQ.EYQ.mZx(str, e);
        }
    }

    public static EYQ EYQ(String str) {
        return new EYQ(str, EYQ);
    }

    private void EYQ() {
        int length = this.Kbd.length();
        int i = 0;
        while (i < length) {
            int iEYQ = this.mZx.EYQ(this.Kbd, i, this.Pm);
            if (iEYQ == i) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.Kbd.substring(0, i));
            }
            i = iEYQ;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyqPollFirst = this.Pm.pollFirst();
            if (eyqPollFirst != null) {
                arrayList.add(0, eyqPollFirst);
            } else {
                this.Td = com.bytedance.adsdk.EYQ.mZx.Kbd.mZx.EYQ(arrayList, this.Kbd, i);
                this.Pm = null;
                return;
            }
        }
    }

    public <T> T EYQ(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) EYQ(map);
    }

    public <T> T EYQ(Map<String, JSONObject> map) {
        return (T) this.Td.EYQ(map);
    }
}
