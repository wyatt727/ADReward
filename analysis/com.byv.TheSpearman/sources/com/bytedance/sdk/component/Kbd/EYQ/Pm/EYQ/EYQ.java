package com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdLogEvent.java */
/* loaded from: classes2.dex */
public class EYQ implements com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ {
    protected JSONObject EYQ;
    private String HX;
    private long IPb;
    private long Kbd;
    private String MxO;
    private byte Pm;
    private String QQ;
    private byte Td;
    private long VwS;
    private mZx mZx;
    private byte tp;
    private int tsL;

    public EYQ(String str, JSONObject jSONObject) {
        this.HX = str;
        this.EYQ = jSONObject;
    }

    public EYQ(String str, mZx mzx) {
        this.HX = str;
        this.mZx = mzx;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public mZx EYQ() {
        return this.mZx;
    }

    private EYQ() {
    }

    public String MxO() {
        return this.MxO;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public synchronized JSONObject VwS() {
        mZx mzx;
        if (this.EYQ == null && (mzx = this.mZx) != null) {
            this.EYQ = mzx.EYQ(MxO());
        }
        return this.EYQ;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public void EYQ(JSONObject jSONObject) {
        this.EYQ = jSONObject;
    }

    public static com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ Td(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            EYQ eyq = new EYQ();
            eyq.EYQ((byte) iOptInt);
            eyq.mZx((byte) iOptInt2);
            eyq.EYQ(jSONObject.optJSONObject(NotificationCompat.CATEGORY_EVENT));
            eyq.EYQ(jSONObject.optString("localId"));
            eyq.mZx(jSONObject.optString("genTime"));
            eyq.EYQ(jSONObject.optInt("channel"));
            return eyq;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void Td(byte b) {
        this.tp = b;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public byte mZx() {
        return this.tp;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public String Td() {
        return this.HX;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public byte Pm() {
        return this.Td;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public void EYQ(byte b) {
        this.Td = b;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public void EYQ(String str) {
        this.HX = str;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public void mZx(String str) {
        this.QQ = str;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public void EYQ(long j) {
        this.Kbd = j;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public long QQ() {
        return this.Kbd;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public void mZx(long j) {
        this.IPb = j;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public long HX() {
        return this.IPb;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public void Td(long j) {
        this.VwS = j;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public int tp() {
        return this.tsL;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public void EYQ(int i) {
        this.tsL = i;
    }

    public String tsL() {
        return this.QQ;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public void mZx(byte b) {
        this.Pm = b;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public byte Kbd() {
        return this.Pm;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ
    public String IPb() {
        if (TextUtils.isEmpty(this.HX)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.HX);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, VwS());
            jSONObject.put("genTime", tsL());
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, (int) this.Pm);
            jSONObject.put("type", (int) this.Td);
            jSONObject.put("channel", this.tsL);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}
