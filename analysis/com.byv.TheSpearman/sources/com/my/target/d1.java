package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d1 extends b1 {
    public d1(s sVar, j jVar, Context context) {
        super(sVar, jVar, context);
    }

    public static d1 a(s sVar, j jVar, Context context) {
        return new d1(sVar, jVar, context);
    }

    public boolean a(JSONObject jSONObject, b5<VideoData> b5Var) {
        VideoData videoDataChooseBest;
        VideoData videoDataB;
        if (d(jSONObject, b5Var)) {
            return true;
        }
        float duration = b5Var.getDuration();
        if (duration <= 0.0f) {
            a("Bad value", "wrong videoBanner duration " + duration, b5Var.getId());
            return false;
        }
        b5Var.setCloseActionText(jSONObject.optString("closeActionText", "Close"));
        b5Var.setReplayActionText(jSONObject.optString("replayActionText", b5Var.getReplayActionText()));
        b5Var.setCloseDelayActionText(jSONObject.optString("closeDelayActionText", b5Var.getCloseDelayActionText()));
        Boolean boolK = this.f3926a.k();
        b5Var.setAutoMute(boolK != null ? boolK.booleanValue() : jSONObject.optBoolean("automute", b5Var.isAutoMute()));
        b5Var.setShowPlayerControls(jSONObject.optBoolean("showPlayerControls", b5Var.isShowPlayerControls()));
        Boolean boolL = this.f3926a.l();
        b5Var.setAutoPlay(boolL != null ? boolL.booleanValue() : jSONObject.optBoolean("autoplay", b5Var.isAutoPlay()));
        b5Var.setHasCtaButton(jSONObject.optBoolean("hasCtaButton", b5Var.isHasCtaButton()));
        a(jSONObject, (f0) b5Var);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("shoppable");
        if (jSONObjectOptJSONObject != null) {
            b5Var.setShoppableBanner(e(jSONObjectOptJSONObject, b5Var));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("shoppableAdsData");
        if (jSONObjectOptJSONObject2 != null) {
            b5Var.setShoppableAdsData(a9.a(this.f3926a, this.b, this.c).a(jSONObjectOptJSONObject2, b5Var.getId()));
        }
        c(jSONObject, b5Var);
        String strOptString = jSONObject.optString("previewLink");
        if (!TextUtils.isEmpty(strOptString)) {
            b5Var.setPreview(ImageData.newImageData(strOptString, jSONObject.optInt("previewWidth"), jSONObject.optInt("previewHeight")));
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mediafiles");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            ba.a("CommonVideoParser: Mediafiles array is empty");
            a("Required field", "unable to find mediaFiles in MediaBanner", b5Var.getId());
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject3 != null && (videoDataB = b(jSONObjectOptJSONObject3, b5Var.getId())) != null) {
                arrayList.add(videoDataB);
            }
        }
        if (arrayList.size() <= 0 || (videoDataChooseBest = VideoData.chooseBest(arrayList, this.b.getVideoQuality())) == null) {
            return false;
        }
        b5Var.setMediaData(videoDataChooseBest);
        return true;
    }

    public final VideoData b(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString("src");
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        if (!TextUtils.isEmpty(strOptString) && iOptInt > 0 && iOptInt2 > 0) {
            VideoData videoDataNewVideoData = VideoData.newVideoData(strOptString, iOptInt, iOptInt2);
            videoDataNewVideoData.setBitrate(jSONObject.optInt("bitrate"));
            if (!videoDataNewVideoData.getUrl().endsWith(VideoData.M3U8) || d5.b()) {
                return videoDataNewVideoData;
            }
            ba.a("CommonVideoParser: HLS Video does not supported, add com.google.android.exoplayer:exoplayer-hls dependency to play HLS video ");
            return null;
        }
        a("Bad value", "bad mediafile object, src = " + strOptString + ", width = " + iOptInt + ", height = " + iOptInt2, str);
        return null;
    }
}
