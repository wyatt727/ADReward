package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.VwS.EYQ.mZx;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdInfoFactory.java */
/* loaded from: classes2.dex */
public class mZx {
    private static boolean EYQ(int i) {
        return i == 2 || i == 3 || i == 8;
    }

    public static Pair<com.bytedance.sdk.openadsdk.core.model.EYQ, ArrayList<Integer>> EYQ(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hYh hyh, com.bytedance.sdk.openadsdk.core.model.mZx mzx) {
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.EYQ eyq = new com.bytedance.sdk.openadsdk.core.model.EYQ();
            eyq.EYQ(jSONObject.optString("request_id"));
            eyq.EYQ(jSONObject.optInt("ret"));
            eyq.mZx(jSONObject.optString("message"));
            String strOptString = jSONObject.optString("gdid_encrypted");
            if (jSONObject.has("choose_ui_data")) {
                eyq.EYQ(jSONObject.optJSONObject("choose_ui_data"));
                eyq.EYQ(true);
            }
            String strOptString2 = jSONObject.optString("auction_price");
            if (eyq.mZx() != 0) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                while (i < jSONArrayOptJSONArray.length()) {
                    com.bytedance.sdk.openadsdk.core.model.UB ubEYQ = EYQ(jSONArrayOptJSONArray.optJSONObject(i), adSlot, hyh);
                    int iEYQ = EYQ(ubEYQ);
                    if (iEYQ != 200) {
                        arrayList.add(Integer.valueOf(iEYQ));
                    } else {
                        ubEYQ.HX(strOptString2);
                        if (!TextUtils.isEmpty(strOptString)) {
                            ubEYQ.rfB(strOptString);
                        }
                        eyq.EYQ(ubEYQ);
                    }
                    i++;
                }
                i = length;
            }
            EYQ(i, eyq, (ArrayList<Integer>) arrayList, mzx);
            return new Pair<>(eyq, arrayList);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("AdInfoFactory", th.getMessage());
            return null;
        }
    }

    private static void EYQ(int i, final com.bytedance.sdk.openadsdk.core.model.EYQ eyq, final ArrayList<Integer> arrayList, final com.bytedance.sdk.openadsdk.core.model.mZx mzx) {
        if (eyq == null || i < 2) {
            return;
        }
        final int size = i - (eyq.Td() != null ? eyq.Td().size() : 0);
        final boolean z = eyq.VwS() && eyq.QQ() == null;
        if (size > 0 || z) {
            com.bytedance.sdk.openadsdk.tp.Td.EYQ();
            com.bytedance.sdk.openadsdk.tp.Td.EYQ("choose_ad_parsing_error", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.core.mZx.1
                @Override // com.bytedance.sdk.openadsdk.tp.mZx
                public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", eyq.EYQ());
                    jSONObject.put("material_error", size);
                    jSONObject.put("choose_ui_error", z ? 1 : 0);
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) arrayList).toString());
                    }
                    com.bytedance.sdk.openadsdk.core.model.mZx mzx2 = mzx;
                    if (mzx2 != null) {
                        jSONObject.put("server_res_str", mzx2.EYQ());
                    }
                    return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("choose_ad_parsing_error").mZx(jSONObject.toString());
                }
            });
        }
    }

    public static com.bytedance.sdk.openadsdk.core.model.UB EYQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return EYQ(jSONObject, (AdSlot) null, (com.bytedance.sdk.openadsdk.core.model.hYh) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0597 A[PHI: r14
      0x0597: PHI (r14v78 int) = (r14v77 int), (r14v114 int) binds: [B:139:0x0583, B:144:0x0594] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.bytedance.sdk.openadsdk.core.model.UB EYQ(org.json.JSONObject r13, com.bytedance.sdk.openadsdk.AdSlot r14, com.bytedance.sdk.openadsdk.core.model.hYh r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mZx.EYQ(org.json.JSONObject, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.hYh):com.bytedance.sdk.openadsdk.core.model.UB");
    }

    private static com.bytedance.sdk.openadsdk.core.ugen.Kbd.EYQ mZx(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.ugen.Kbd.EYQ eyq = new com.bytedance.sdk.openadsdk.core.ugen.Kbd.EYQ();
        eyq.EYQ(jSONObject.optString("id"));
        eyq.mZx(jSONObject.optString("md5"));
        eyq.Td(jSONObject.optString("url"));
        return eyq;
    }

    private static void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put(AndroidBridgeConstants.ERROR_CODE, -1);
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void EYQ(final com.bytedance.sdk.openadsdk.core.model.UB ub, final String str, final com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq, final long j, final mZx.EYQ eyq2) {
        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(new com.bytedance.sdk.component.VwS.QQ("vast_parser") { // from class: com.bytedance.sdk.openadsdk.core.mZx.2
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq3 = eyq;
                    String str2 = "load_vast_fail";
                    if (eyq3 != null) {
                        if (TextUtils.isEmpty(eyq3.HX()) || TextUtils.isEmpty(eyq.IPb()) || eyq.QQ() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            jSONObject.put("reason_code", -3);
                            jSONObject.put(AndroidBridgeConstants.ERROR_CODE, -3);
                        } else {
                            jSONObject.put("duration", System.currentTimeMillis() - j);
                            mZx.EYQ eyq4 = eyq2;
                            if (eyq4 != null) {
                                jSONObject.put("wrapper_count", eyq4.mZx);
                                jSONObject.put("impression_links_null", eyq2.Td);
                            }
                            str2 = "load_vast_success";
                        }
                    } else {
                        jSONObject.put("reason_code", -2);
                        mZx.EYQ eyq5 = eyq2;
                        if (eyq5 != null) {
                            jSONObject.put(AndroidBridgeConstants.ERROR_CODE, eyq5.EYQ);
                        }
                    }
                    com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq6 = eyq;
                    if (eyq6 == null || eyq6.mZx() == null || !TextUtils.isEmpty(eyq.mZx().IPb())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(AndroidBridgeConstants.ERROR_CODE, 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.mZx.Td.mZx(ub, str, "load_vast_icon_fail", jSONObject2);
                    eyq.EYQ((com.bytedance.sdk.openadsdk.core.VwS.mZx) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.VwS.EYQ, mZx.EYQ> EYQ(String str, int i, int i2) {
        int iPm;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iTd = 0;
        if (i2 == 1 || i2 == 5) {
            iPm = 0;
        } else {
            iTd = tr.Td(hu.EYQ());
            iPm = tr.Pm(hu.EYQ());
            if (i == 2) {
                iTd = iPm;
                iPm = iTd;
            }
        }
        com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.Kbd kbd = new com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.Kbd(hu.EYQ(), iTd, iPm);
        return new Pair<>(kbd.EYQ(str, new ArrayList()), kbd.IPb);
    }

    private static void EYQ(com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq, com.bytedance.sdk.openadsdk.core.model.UB ub) {
        eyq.EYQ(ub);
        if (!EYQ(ub.Pf())) {
            ub.Uc(2);
        }
        ub.Pm(1);
        ub.EYQ(eyq);
        if (!TextUtils.isEmpty(eyq.Pm())) {
            ub.KO(eyq.Pm());
        }
        if (!TextUtils.isEmpty(eyq.Kbd())) {
            ub.hu(eyq.Kbd());
        }
        ub.pi(eyq.IPb());
        ub.EYQ((com.bytedance.sdk.openadsdk.core.model.Td) null);
        com.bykv.vk.openvk.component.video.api.Td.mZx mzxMN = ub.mN();
        if (mzxMN == null) {
            mzxMN = new com.bykv.vk.openvk.component.video.api.Td.mZx();
        }
        mzxMN.Td(eyq.VwS());
        mzxMN.EYQ(eyq.QQ());
        mzxMN.IPb((String) null);
        mzxMN.mZx((String) null);
        mzxMN.Pm((String) null);
        ub.EYQ(mzxMN);
        if (eyq.mZx() != null && !TextUtils.isEmpty(eyq.mZx().Kbd())) {
            com.bytedance.sdk.openadsdk.core.model.nWX nwx = new com.bytedance.sdk.openadsdk.core.model.nWX();
            nwx.EYQ(eyq.mZx().Kbd());
            nwx.EYQ(eyq.mZx().mZx());
            nwx.mZx(eyq.mZx().Td());
            ub.EYQ(nwx);
            return;
        }
        if (ub.vD() == null) {
            com.bytedance.sdk.openadsdk.core.model.nWX nwx2 = new com.bytedance.sdk.openadsdk.core.model.nWX();
            nwx2.EYQ("https://sf16-fe-tos-sg.i18n-pglstatp.com/obj/ad-pattern-sg/static/images/2023620white.jpeg");
            nwx2.EYQ(98);
            nwx2.mZx(98);
            ub.EYQ(nwx2);
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.Pm Td(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("splash_clickarea", 2);
        int iOptInt2 = jSONObject.optInt("splash_layout_id", 1);
        long jOptLong = jSONObject.optLong("load_wait_time", 0L);
        long j = jOptLong >= 0 ? jOptLong : 0L;
        com.bytedance.sdk.openadsdk.core.model.Pm pm = new com.bytedance.sdk.openadsdk.core.model.Pm();
        pm.EYQ(iOptInt);
        pm.mZx(iOptInt2);
        pm.EYQ(j);
        return pm;
    }

    private static AdSlot Pm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("mCodeId", "");
        int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float fOptDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        float fOptDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        int iOptInt3 = jSONObject.optInt("mAdCount", 6);
        boolean zOptBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String strOptString2 = jSONObject.optString("mRewardName", "");
        int iOptInt4 = jSONObject.optInt("mRewardAmount", 0);
        String strOptString3 = jSONObject.optString("mMediaExtra", "");
        String strOptString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int iOptInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean zOptBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean zOptBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        String strOptString5 = jSONObject.optString("mBidAdm", "");
        return new AdSlot.Builder().setCodeId(strOptString).setImageAcceptedSize(iOptInt, iOptInt2).setExpressViewAcceptedSize(fOptDouble, fOptDouble2).setAdCount(iOptInt3).setSupportDeepLink(zOptBoolean).setRewardName(strOptString2).setRewardAmount(iOptInt4).setMediaExtra(strOptString3).setUserID(strOptString4).setNativeAdType(iOptInt5).setIsAutoPlay(zOptBoolean2).isExpressAd(zOptBoolean3).withBid(strOptString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    private static FilterWord Kbd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    FilterWord filterWordKbd = Kbd(jSONArrayOptJSONArray.optJSONObject(i));
                    if (filterWordKbd != null && filterWordKbd.isValid()) {
                        filterWord.addOption(filterWordKbd);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.Td IPb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.Td td = new com.bytedance.sdk.openadsdk.core.model.Td();
        td.mZx(jSONObject.optString("app_name"));
        td.Td(jSONObject.optString("package_name"));
        td.EYQ(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        td.EYQ(jSONObject.optDouble(FirebaseAnalytics.Param.SCORE, -1.0d));
        td.EYQ(jSONObject.optInt("comment_num", -1));
        td.mZx(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        td.Pm(jSONObject.optString("app_category"));
        return td;
    }

    private static com.bytedance.sdk.openadsdk.core.model.hu VwS(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.hu huVar = new com.bytedance.sdk.openadsdk.core.model.hu();
        if (jSONObject == null) {
            huVar.EYQ(10L);
            huVar.mZx(20L);
            huVar.EYQ("");
            return huVar;
        }
        huVar.EYQ(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        huVar.mZx(jSONObject.optLong("straight_lp_showtime", 20L));
        huVar.EYQ(jSONObject.optString("loading_text", ""));
        return huVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.MxO QQ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.MxO mxO = new com.bytedance.sdk.openadsdk.core.model.MxO();
        mxO.EYQ(jSONObject.optInt("if_send_click", 0));
        return mxO;
    }

    private static com.bytedance.sdk.openadsdk.core.model.tp HX(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.tp tpVar = new com.bytedance.sdk.openadsdk.core.model.tp();
        tpVar.EYQ(jSONObject.optString("deeplink_url"));
        tpVar.mZx(jSONObject.optString("fallback_url"));
        tpVar.EYQ(jSONObject.optInt("fallback_type"));
        return tpVar;
    }

    private static com.bykv.vk.openvk.component.video.api.Td.mZx EYQ(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.UB ub, boolean z) {
        int iOptInt;
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.component.video.api.Td.mZx mzx = new com.bykv.vk.openvk.component.video.api.Td.mZx();
        mzx.mZx(jSONObject.optInt("cover_height"));
        mzx.Td(jSONObject.optInt("cover_width"));
        mzx.EYQ(jSONObject.optString("resolution"));
        mzx.EYQ(jSONObject.optLong("size"));
        double dOptDouble = jSONObject.optDouble("video_duration", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        mzx.EYQ(dOptDouble);
        int i = 1;
        int iOptInt2 = jSONObject.optInt("replay_time", 1);
        if (dOptDouble <= 15.0d && ub.zF() != 1 && com.bytedance.sdk.openadsdk.core.model.UB.Kbd(ub)) {
            i = iOptInt2;
        }
        mzx.tp(i);
        mzx.mZx(jSONObject.optString("cover_url"));
        mzx.Td(jSONObject.optString(CampaignEx.JSON_KEY_VIDEO_URL));
        mzx.Pm(jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD));
        mzx.Kbd(jSONObject.optString("playable_download_url"));
        mzx.IPb(jSONObject.optString("file_hash"));
        mzx.QQ(jSONObject.optInt("if_playable_loading_show", 0));
        mzx.HX(jSONObject.optInt("remove_loading_page_type", 0));
        mzx.EYQ(jSONObject.optInt("fallback_endcard_judge", 0));
        mzx.Kbd(jSONObject.optInt("video_preload_size", 307200));
        mzx.IPb(jSONObject.optInt("reward_video_cached_type", 0));
        mzx.VwS(jSONObject.optInt("execute_cached_type", 0));
        if (z) {
            iOptInt = jSONObject.optInt("endcard_render", 0);
        } else {
            iOptInt = jSONObject.optInt("endcard_render", -1);
        }
        mzx.Pm(iOptInt);
        return mzx;
    }

    private static Map<String, Object> tp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                map.put(next, jSONObject.opt(next));
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int EYQ(com.bytedance.sdk.openadsdk.core.model.UB r7) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            if (r7 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r7.VOV()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Ldb
            java.lang.String r1 = r7.VOV()
            int r1 = r1.length()
            r2 = 1
            if (r1 > r2) goto L1c
            goto Ldb
        L1c:
            int r1 = r7.CE()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != 0) goto L2f
            com.bytedance.sdk.openadsdk.core.model.tp r1 = r7.dVQ()
            int r1 = EYQ(r1)
            if (r1 == r2) goto L30
            return r1
        L2f:
            r1 = r2
        L30:
            boolean r3 = r7.oB()
            if (r3 == 0) goto L71
            int r3 = r7.Yd()
            if (r3 >= 0) goto L4f
            com.bytedance.sdk.openadsdk.AdSlot r3 = r7.Nvm()
            if (r3 == 0) goto L4b
            com.bytedance.sdk.openadsdk.AdSlot r3 = r7.Nvm()
            int r3 = r3.getDurationSlotType()
            goto L4f
        L4b:
            int r3 = r7.KvC()
        L4f:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.utils.FH.Td(r3)
            boolean r4 = r7.HG()
            if (r4 == 0) goto L5b
            java.lang.String r3 = "fullscreen_interstitial_ad"
        L5b:
            java.lang.String r4 = r7.VC()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = 0
            if (r4 == 0) goto L6c
            java.lang.String r1 = "load_html_fail"
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(r7, r3, r1, r5)
            return r0
        L6c:
            java.lang.String r0 = "load_html_success"
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(r7, r3, r0, r5)
        L71:
            int r0 = r7.Pf()
            r3 = 4
            r4 = 3
            r5 = 2
            if (r0 == r5) goto L8e
            if (r0 == r4) goto L8e
            if (r0 == r3) goto L83
            r6 = 8
            if (r0 == r6) goto L8e
            goto La1
        L83:
            com.bytedance.sdk.openadsdk.core.model.Td r0 = r7.xh()
            int r1 = EYQ(r0)
            if (r1 == r2) goto La1
            return r1
        L8e:
            boolean r0 = mZx(r7)
            if (r0 == 0) goto La1
            java.lang.String r0 = r7.XPd()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La1
            r7 = 406(0x196, float:5.69E-43)
            return r7
        La1:
            boolean r0 = r7.oIw()
            if (r0 != 0) goto Lda
            int r0 = r7.by()
            if (r0 == r5) goto Ld0
            if (r0 == r4) goto Ld0
            if (r0 == r3) goto Ld0
            r3 = 5
            if (r0 == r3) goto Lc1
            r3 = 15
            if (r0 == r3) goto Lc1
            r3 = 16
            if (r0 == r3) goto Ld0
            r3 = 50
            if (r0 == r3) goto Lc1
            goto Lda
        Lc1:
            com.bykv.vk.openvk.component.video.api.Td.mZx r0 = r7.mN()
            boolean r7 = r7.oIw()
            int r1 = EYQ(r0, r7)
            if (r1 == r2) goto Lda
            return r1
        Ld0:
            java.util.List r7 = r7.Dal()
            int r1 = EYQ(r7)
            if (r1 == r2) goto Lda
        Lda:
            return r1
        Ldb:
            r7 = 402(0x192, float:5.63E-43)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mZx.EYQ(com.bytedance.sdk.openadsdk.core.model.UB):int");
    }

    private static boolean mZx(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        return (ub.oIw() || ub.oB()) ? false : true;
    }

    private static int EYQ(com.bytedance.sdk.openadsdk.core.model.tp tpVar) {
        if (tpVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(tpVar.EYQ())) {
            return 403;
        }
        if (TextUtils.isEmpty(tpVar.mZx())) {
            return 404;
        }
        return (tpVar.Td() == 1 || tpVar.Td() == 2) ? 200 : 405;
    }

    private static int EYQ(com.bykv.vk.openvk.component.video.api.Td.mZx mzx, boolean z) {
        if (mzx == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(mzx.MxO())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z || !TextUtils.isEmpty(mzx.tp())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int EYQ(com.bytedance.sdk.openadsdk.core.model.Td td) {
        if (td == null) {
            return TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        }
        if (TextUtils.isEmpty(td.EYQ())) {
            return TTAdConstant.DOWNLOAD_URL_CODE;
        }
        return 200;
    }

    private static int EYQ(List<com.bytedance.sdk.openadsdk.core.model.nWX> list) {
        if (list == null) {
            return TTAdConstant.IMAGE_LIST_CODE;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (com.bytedance.sdk.openadsdk.core.model.nWX nwx : list) {
            if (nwx == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(nwx.EYQ())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }
}
