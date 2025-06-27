package com.bytedance.sdk.openadsdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.IPb.mZx;
import com.bytedance.sdk.component.utils.pi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private String EYQ;
    private int HX;
    private int IPb;
    private String KO;
    private float Kbd;
    private String MxO;
    private int NZ;
    private float Pm;
    private String QQ;
    private int Td;
    private String UB;
    private String Uc;
    private boolean VwS;
    private int WU;
    private int XN;
    private String hYh;
    private String hu;
    private Map<String, Object> lEs;
    private int mZx;
    private boolean nWX;
    private boolean pi;
    private String rfB;
    private JSONArray tPj;
    private String tp;
    private int tsL;
    private Bundle wBa;
    private int zF;

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    private AdSlot() {
        this.pi = true;
        this.nWX = false;
        this.zF = 0;
        this.WU = 0;
        this.XN = 0;
    }

    public void setUserData(String str) {
        this.hYh = str;
    }

    public String getUserData() {
        return this.hYh;
    }

    public String getCodeId() {
        return this.EYQ;
    }

    public boolean isAutoPlay() {
        return this.pi;
    }

    public boolean isExpressAd() {
        return this.nWX;
    }

    public String getBidAdm() {
        return this.KO;
    }

    public int getImgAcceptedWidth() {
        return this.mZx;
    }

    public int getImgAcceptedHeight() {
        return this.Td;
    }

    public float getExpressViewAcceptedWidth() {
        return this.Pm;
    }

    public float getExpressViewAcceptedHeight() {
        return this.Kbd;
    }

    public boolean isSupportDeepLink() {
        return this.VwS;
    }

    public int getAdCount() {
        return this.IPb;
    }

    public void setAdCount(int i) {
        this.IPb = i;
    }

    @Deprecated
    public String getRewardName() {
        return this.QQ;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.HX;
    }

    public String getMediaExtra() {
        return this.tp;
    }

    public String getUserID() {
        return this.MxO;
    }

    public int getNativeAdType() {
        return this.tsL;
    }

    public void setNativeAdType(int i) {
        this.tsL = i;
    }

    public String getAdId() {
        return this.hu;
    }

    public String getCreativeId() {
        return this.UB;
    }

    public String getExt() {
        return this.Uc;
    }

    public int getIsRotateBanner() {
        return this.zF;
    }

    public void setIsRotateBanner(int i) {
        this.zF = i;
    }

    public int getRotateTime() {
        return this.WU;
    }

    public void setRotateTime(int i) {
        this.WU = i;
    }

    public int getRotateOrder() {
        return this.XN;
    }

    public void setRotateOrder(int i) {
        this.XN = i;
    }

    public void setDurationSlotType(int i) {
        this.NZ = i;
    }

    public int getDurationSlotType() {
        return this.NZ;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.lEs;
    }

    public JSONArray getBiddingTokens() {
        return this.tPj;
    }

    public void setBiddingTokens(JSONArray jSONArray) {
        this.tPj = jSONArray;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.wBa;
    }

    public String getLinkId() {
        return this.rfB;
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject toJsonObj() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.EYQ);
            jSONObject.put("mAdCount", this.IPb);
            jSONObject.put("mIsAutoPlay", this.pi);
            jSONObject.put("mImgAcceptedWidth", this.mZx);
            jSONObject.put("mImgAcceptedHeight", this.Td);
            jSONObject.put("mExpressViewAcceptedWidth", this.Pm);
            jSONObject.put("mExpressViewAcceptedHeight", this.Kbd);
            jSONObject.put("mSupportDeepLink", this.VwS);
            jSONObject.put("mRewardName", this.QQ);
            jSONObject.put("mRewardAmount", this.HX);
            jSONObject.put("mMediaExtra", this.tp);
            jSONObject.put("mUserID", this.MxO);
            jSONObject.put("mNativeAdType", this.tsL);
            jSONObject.put("mIsExpressAd", this.nWX);
            jSONObject.put("mAdId", this.hu);
            jSONObject.put("mCreativeId", this.UB);
            jSONObject.put("mExt", this.Uc);
            jSONObject.put("mBidAdm", this.KO);
            jSONObject.put("mUserData", this.hYh);
            jSONObject.put("mDurationSlotType", this.NZ);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public static class Builder {
        private String EYQ;
        private String KO;
        private float MxO;
        private int NZ;
        private String QQ;
        private String UB;
        private String Uc;
        private Bundle WU;
        private String XN;
        private String hu;
        private String nWX;
        private boolean pi;
        private int tp;
        private float tsL;
        private int mZx = 640;
        private int Td = 320;
        private final boolean Pm = true;
        private int Kbd = 1;
        private final String IPb = "";
        private final int VwS = 0;
        private String HX = "defaultUser";
        private boolean hYh = true;
        private Map<String, Object> zF = null;

        @Deprecated
        public Builder setRewardAmount(int i) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setAdId(String str) {
            this.KO = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.hu = str;
            return this;
        }

        public Builder setExt(String str) {
            this.UB = str;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.hYh = z;
            return this;
        }

        public Builder setCodeId(String str) {
            this.EYQ = str;
            return this;
        }

        public Builder isExpressAd(boolean z) {
            this.pi = z;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.mZx = i;
            this.Td = i2;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.MxO = f;
            this.tsL = f2;
            return this;
        }

        public Builder setDurationSlotType(int i) {
            this.NZ = i;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.Kbd = i;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.QQ = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.HX = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.tp = i;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (pi.Pm()) {
                mZx.EYQ(str);
            }
            this.nWX = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.Uc = str;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.zF = map;
            return this;
        }

        public Builder setNetworkExtrasBundle(Bundle bundle) {
            this.WU = bundle;
            return this;
        }

        public Builder setLinkId(String str) {
            this.XN = str;
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.EYQ = this.EYQ;
            adSlot.IPb = this.Kbd;
            adSlot.VwS = true;
            adSlot.mZx = this.mZx;
            adSlot.Td = this.Td;
            float f = this.MxO;
            if (f <= 0.0f) {
                adSlot.Pm = this.mZx;
                adSlot.Kbd = this.Td;
            } else {
                adSlot.Pm = f;
                adSlot.Kbd = this.tsL;
            }
            adSlot.QQ = "";
            adSlot.HX = 0;
            adSlot.tp = this.QQ;
            adSlot.MxO = this.HX;
            adSlot.tsL = this.tp;
            adSlot.pi = this.hYh;
            adSlot.nWX = this.pi;
            adSlot.KO = this.nWX;
            adSlot.hu = this.KO;
            adSlot.UB = this.hu;
            adSlot.Uc = this.UB;
            adSlot.hYh = this.Uc;
            adSlot.lEs = this.zF;
            adSlot.rfB = this.XN;
            adSlot.NZ = this.NZ;
            return adSlot;
        }
    }
}
