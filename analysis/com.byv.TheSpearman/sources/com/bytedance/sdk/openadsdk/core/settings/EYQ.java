package com.bytedance.sdk.openadsdk.core.settings;

import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdSlotSetter.java */
/* loaded from: classes2.dex */
public class EYQ {
    public List<VwS> Dal;
    public String EYQ;
    public boolean FH;
    public boolean FtN;
    public int HX;
    public int IPb;
    public int KO;
    public int Kbc;
    public int Kbd;
    public int MxO;
    public int NZ;
    public boolean Nvm;
    public int PI;
    public long Pf;
    public int Pm;
    public int QQ;
    public int Td;
    public int Tnp;
    public int UB;
    public int Uc;
    public int VwS;
    public int WU;
    public List<String> XN;
    public List<VwS> XPd;
    public int hYh;
    public int hu;
    public int kf;
    public int lEs;
    public String lRN;
    public int mN;
    public int mZx;
    public int nWX;
    public int pi;
    public int rfB;
    public int tPj;
    public int tp;
    public int tr;
    public int tsL;
    public String vD;
    public int wBa;
    public boolean xt;
    public boolean zF;

    private static boolean EYQ(int i) {
        return i == 1 || i == 2;
    }

    public EYQ(JSONObject jSONObject) {
        this.mZx = 1;
        this.Td = 1;
        this.Pm = 2;
        this.Kbd = 1;
        this.IPb = 100;
        this.VwS = 0;
        this.QQ = 2;
        this.HX = 1;
        this.tp = 3;
        this.MxO = 30;
        this.tsL = 1;
        this.pi = 1;
        this.nWX = 2;
        this.KO = 1500;
        this.hu = 2;
        this.UB = -1;
        this.Uc = 0;
        this.hYh = 5;
        this.zF = false;
        this.WU = 0;
        this.NZ = 2;
        this.tPj = -1;
        this.wBa = 0;
        this.rfB = 0;
        this.lEs = 5;
        this.xt = true;
        this.Nvm = false;
        this.FH = false;
        this.tr = 0;
        this.Tnp = -1;
        this.FtN = false;
        this.PI = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        this.kf = 2;
        this.mN = 1000;
        this.Kbc = 1;
        this.XPd = new ArrayList();
        this.Dal = new ArrayList();
        if (jSONObject == null) {
            return;
        }
        this.EYQ = jSONObject.optString("code_id");
        this.mZx = jSONObject.optInt("auto_play", 1);
        this.Tnp = jSONObject.optInt("endcard_close_time", -1);
        this.Td = jSONObject.optInt("voice_control", 1);
        this.Pm = jSONObject.optInt("rv_preload", 2);
        this.Kbd = jSONObject.optInt("nv_preload", 1);
        this.IPb = jSONObject.optInt("proportion_watching", 100);
        this.VwS = jSONObject.optInt("skip_time_displayed", 0);
        this.QQ = jSONObject.optInt("video_skip_result", 2);
        this.HX = jSONObject.optInt("reg_creative_control", 1);
        this.tp = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.MxO = iOptInt;
        if (iOptInt < 0) {
            this.MxO = 30;
        }
        this.tsL = jSONObject.optInt("voice_control", 2);
        this.pi = jSONObject.optInt("if_show_win", 1);
        this.nWX = jSONObject.optInt("sp_preload", 2);
        this.KO = jSONObject.optInt("stop_time", 1500);
        this.hu = jSONObject.optInt("native_playable_delay", 2);
        this.UB = jSONObject.optInt("time_out_control", -1);
        this.tPj = jSONObject.optInt("playable_close_time", -1);
        this.Uc = jSONObject.optInt("playable_reward_type", 0);
        this.WU = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.hYh = iOptInt2;
        if (iOptInt2 < 0) {
            this.hYh = 5;
        }
        EYQ(jSONObject.optJSONArray("parent_tpl_ids"));
        this.NZ = jSONObject.optInt("slot_type", 2);
        this.zF = jSONObject.optBoolean("close_on_click", false);
        this.wBa = jSONObject.optInt("allow_system_back", 0);
        this.rfB = jSONObject.optInt("splash_skip_time", 0);
        this.lEs = jSONObject.optInt("splash_image_count_down_time", 5);
        this.Nvm = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.FH = jSONObject.optBoolean("splash_close_on_click", false);
        int iOptInt3 = jSONObject.optInt("splash_load_strategy", 0);
        this.tr = iOptInt3;
        if (iOptInt3 < 0 || iOptInt3 > 1) {
            this.tr = 0;
        }
        this.xt = jSONObject.optBoolean("allow_mediaview_click", true);
        int iOptInt4 = jSONObject.optInt("total_time_out", MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        this.PI = iOptInt4;
        if (iOptInt4 <= 0 || iOptInt4 > 1800000) {
            this.PI = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        }
        int iOptInt5 = jSONObject.optInt("req_parallel_num", 2);
        this.kf = iOptInt5;
        if (iOptInt5 <= 0 || iOptInt5 > 4) {
            this.kf = 2;
        }
        this.mN = jSONObject.optInt("bidding_token_tmax", 1000);
        int iOptInt6 = jSONObject.optInt("ad_load_type", 1);
        this.Kbc = iOptInt6;
        if (iOptInt6 <= 0 || iOptInt6 > 2) {
            this.Kbc = 1;
        }
        boolean zOptBoolean = jSONObject.optBoolean("is_mediation", false);
        this.FtN = zOptBoolean;
        if (zOptBoolean) {
            KO.Jpu().OnO();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mediation_config");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("adn_name");
                String strOptString2 = jSONObjectOptJSONObject.optString("adn_slot_id");
                int iOptInt7 = jSONObjectOptJSONObject.optInt("ad_expired_time", 3600000);
                int iOptInt8 = jSONObjectOptJSONObject.optInt("req_bidding_type", 2);
                String strOptString3 = jSONObjectOptJSONObject.optString("rit_cpm");
                int iOptInt9 = jSONObjectOptJSONObject.optInt("show_sort");
                int iOptInt10 = jSONObjectOptJSONObject.optInt("layer_time_out", 2000);
                int i2 = (iOptInt10 <= 0 || iOptInt10 > 60000) ? 2000 : iOptInt10;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("server_params");
                if (iOptInt8 == 2) {
                    arrayList.add(new VwS(strOptString, strOptString2, iOptInt7, iOptInt8, strOptString3, iOptInt9, i2, jSONObjectOptJSONObject2 == null ? "" : jSONObjectOptJSONObject2.toString()));
                } else if (iOptInt8 == 0) {
                    arrayList2.add(new VwS(strOptString, strOptString2, iOptInt7, iOptInt8, strOptString3, iOptInt9, i2, jSONObjectOptJSONObject2 == null ? "" : jSONObjectOptJSONObject2.toString()));
                }
            }
            this.XPd = arrayList;
            this.Dal = arrayList2;
            Collections.sort(arrayList);
            Collections.sort(this.Dal);
        }
        if (!EYQ(this.Td)) {
            this.Td = 1;
        }
        if (!EYQ(this.tsL)) {
            this.tsL = 1;
        }
        this.Pf = jSONObject.optLong("waterfall_id");
        String strOptString4 = jSONObject.optString("waterfall_version");
        this.vD = strOptString4;
        this.lRN = strOptString4;
    }

    public EYQ(String str, int i) {
        this.mZx = 1;
        this.Td = 1;
        this.Pm = 2;
        this.Kbd = 1;
        this.IPb = 100;
        this.VwS = 0;
        this.QQ = 2;
        this.HX = 1;
        this.tp = 3;
        this.MxO = 30;
        this.tsL = 1;
        this.pi = 1;
        this.nWX = 2;
        this.KO = 1500;
        this.hu = 2;
        this.UB = -1;
        this.Uc = 0;
        this.hYh = 5;
        this.zF = false;
        this.WU = 0;
        this.NZ = 2;
        this.tPj = -1;
        this.wBa = 0;
        this.rfB = 0;
        this.lEs = 5;
        this.xt = true;
        this.Nvm = false;
        this.FH = false;
        this.tr = 0;
        this.Tnp = -1;
        this.FtN = false;
        this.PI = MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        this.kf = 2;
        this.mN = 1000;
        this.Kbc = 1;
        this.XPd = new ArrayList();
        this.Dal = new ArrayList();
        this.EYQ = str;
        this.Td = i;
    }

    public void EYQ(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.XN = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.XN.add(jSONArray.get(i).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }
}
