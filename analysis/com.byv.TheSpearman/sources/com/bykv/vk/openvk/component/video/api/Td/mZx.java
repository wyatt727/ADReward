package com.bykv.vk.openvk.component.video.api.Td;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VideoInfo.java */
/* loaded from: classes.dex */
public class mZx {
    private int EYQ;
    private String HX;
    private String IPb;
    private String Kbd;
    private double MxO;
    private double Pm;
    private String QQ;
    private long Td;
    private String VwS;
    private int mZx;
    private int pi;
    private String tp;
    private int tsL;
    private float nWX = -1.0f;
    private int KO = 0;
    private int hu = 0;
    private int UB = 0;
    private int Uc = 0;
    private int hYh = 307200;
    private int zF = 1;

    public int EYQ() {
        return this.tsL;
    }

    public void EYQ(int i) {
        this.tsL = i;
    }

    public int mZx() {
        return this.EYQ;
    }

    public void mZx(int i) {
        this.EYQ = i;
    }

    public int Td() {
        return this.mZx;
    }

    public void Td(int i) {
        this.mZx = i;
    }

    public int Pm() {
        return this.pi;
    }

    public void Pm(int i) {
        this.pi = i;
    }

    public long Kbd() {
        return this.Td;
    }

    public void EYQ(long j) {
        this.Td = j;
    }

    public double IPb() {
        return this.Pm;
    }

    public void EYQ(double d) {
        this.Pm = d;
    }

    public double VwS() {
        return this.MxO;
    }

    public float QQ() {
        return this.nWX;
    }

    public String HX() {
        return this.Kbd;
    }

    public void EYQ(String str) {
        this.Kbd = str;
    }

    public String tp() {
        return this.IPb;
    }

    public void mZx(String str) {
        this.IPb = str;
    }

    public String MxO() {
        return this.VwS;
    }

    public void Td(String str) {
        this.VwS = str;
    }

    public String tsL() {
        return this.QQ;
    }

    public void Pm(String str) {
        this.QQ = str;
    }

    public String pi() {
        return this.HX;
    }

    public void Kbd(String str) {
        this.HX = str;
    }

    public String nWX() {
        if (TextUtils.isEmpty(this.tp)) {
            this.tp = com.bykv.vk.openvk.component.video.api.IPb.mZx.EYQ(this.VwS);
        }
        return this.tp;
    }

    public void IPb(String str) {
        this.tp = str;
    }

    public int KO() {
        if (this.hYh < 0) {
            this.hYh = 307200;
        }
        long j = this.hYh;
        long j2 = this.Td;
        if (j > j2) {
            this.hYh = (int) j2;
        }
        return this.hYh;
    }

    public void Kbd(int i) {
        this.hYh = i;
    }

    public int hu() {
        return this.UB;
    }

    public void IPb(int i) {
        this.UB = i;
    }

    public int UB() {
        return this.Uc;
    }

    public void VwS(int i) {
        this.Uc = i;
    }

    public JSONObject Uc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", mZx());
            jSONObject.put("cover_url", tp());
            jSONObject.put("cover_width", Td());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, tsL());
            jSONObject.put("file_hash", nWX());
            jSONObject.put("resolution", HX());
            jSONObject.put("size", Kbd());
            jSONObject.put("video_duration", IPb());
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, MxO());
            jSONObject.put("playable_download_url", pi());
            jSONObject.put("if_playable_loading_show", hYh());
            jSONObject.put("remove_loading_page_type", zF());
            jSONObject.put("fallback_endcard_judge", EYQ());
            jSONObject.put("video_preload_size", KO());
            jSONObject.put("reward_video_cached_type", hu());
            jSONObject.put("execute_cached_type", UB());
            jSONObject.put("endcard_render", Pm());
            jSONObject.put("replay_time", XN());
            jSONObject.put("play_speed_ratio", QQ());
            if (VwS() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                jSONObject.put("start", VwS());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int hYh() {
        return this.KO;
    }

    public void QQ(int i) {
        this.KO = i;
    }

    public int zF() {
        return this.hu;
    }

    public void HX(int i) {
        this.hu = i;
    }

    public boolean WU() {
        return this.UB == 0;
    }

    public void tp(int i) {
        this.zF = Math.min(4, Math.max(1, i));
    }

    public int XN() {
        return this.zF;
    }
}
