package com.bytedance.adsdk.EYQ.mZx.mZx.EYQ;

import com.json.mediationsdk.metadata.a;
import com.json.t2;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: KeywordNode.java */
/* loaded from: classes2.dex */
public class VwS implements com.bytedance.adsdk.EYQ.mZx.mZx.EYQ {
    private final Object EYQ;

    public VwS(String str) {
        if (str.equalsIgnoreCase(a.g)) {
            this.EYQ = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.EYQ = Boolean.FALSE;
        } else {
            if (str.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                this.EYQ = null;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public Object EYQ(Map<String, JSONObject> map) {
        return this.EYQ;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public com.bytedance.adsdk.EYQ.mZx.Pm.Kbd EYQ() {
        return com.bytedance.adsdk.EYQ.mZx.Pm.IPb.CONSTANT;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.EYQ + t2.i.e;
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.mZx.EYQ
    public String mZx() {
        Object obj = this.EYQ;
        return obj != null ? obj.toString() : "NULL";
    }
}
