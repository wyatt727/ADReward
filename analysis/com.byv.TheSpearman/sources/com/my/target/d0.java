package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.my.target.common.models.AudioData;
import com.my.target.common.models.ShareButtonData;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d0 extends b1 {
    public d0(s sVar, j jVar, Context context) {
        super(sVar, jVar, context);
    }

    public static d0 a(s sVar, j jVar, Context context) {
        return new d0(sVar, jVar, context);
    }

    public final void a(JSONObject jSONObject, b5<? extends com.my.target.core.models.a<String>> b5Var) {
        a(jSONObject, (f0) b5Var);
        Boolean boolH = this.f3926a.h();
        b5Var.setAllowSeek(boolH != null ? boolH.booleanValue() : jSONObject.optBoolean("allowSeek", b5Var.isAllowSeek()));
        Boolean boolI = this.f3926a.i();
        b5Var.setAllowSkip(boolI != null ? boolI.booleanValue() : jSONObject.optBoolean("allowSkip", b5Var.isAllowSkip()));
        Boolean boolJ = this.f3926a.j();
        b5Var.setAllowTrackChange(boolJ != null ? boolJ.booleanValue() : jSONObject.optBoolean("allowTrackChange", b5Var.isAllowTrackChange()));
    }

    public boolean b(JSONObject jSONObject, b5<AudioData> b5Var) {
        if (d(jSONObject, b5Var)) {
            return true;
        }
        float fOptDouble = (float) jSONObject.optDouble("duration", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        if (fOptDouble <= 0.0f) {
            a("Required field", "unable to set duration " + fOptDouble, b5Var.getId());
            return false;
        }
        b5Var.setAutoPlay(jSONObject.optBoolean("autoplay", b5Var.isAutoPlay()));
        b5Var.setHasCtaButton(jSONObject.optBoolean("hasCtaButton", b5Var.isHasCtaButton()));
        b5Var.setAdText(jSONObject.optString("adText", b5Var.getAdText()));
        a(jSONObject, (b5<? extends com.my.target.core.models.a<String>>) b5Var);
        c(jSONObject, (f0) b5Var);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("shareButtons");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    ShareButtonData shareButtonDataNewData = ShareButtonData.newData();
                    shareButtonDataNewData.setName(jSONObjectOptJSONObject.optString("name"));
                    shareButtonDataNewData.setUrl(jSONObjectOptJSONObject.optString("url"));
                    shareButtonDataNewData.setImageUrl(jSONObjectOptJSONObject.optString("imageUrl"));
                    b5Var.addShareButtonData(shareButtonDataNewData);
                }
            }
        }
        return c(jSONObject, b5Var);
    }

    public final boolean c(JSONObject jSONObject, b5<AudioData> b5Var) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mediafiles");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            ba.a("AudioBannerParser: Mediafiles array is empty");
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("src");
                if (!TextUtils.isEmpty(strOptString)) {
                    AudioData audioDataNewAudioData = AudioData.newAudioData(strOptString);
                    audioDataNewAudioData.setBitrate(jSONObjectOptJSONObject.optInt("bitrate"));
                    b5Var.setMediaData(audioDataNewAudioData);
                    return true;
                }
                a("Bad value", "bad mediafile object, src = " + strOptString, b5Var.getId());
            }
        }
        return false;
    }
}
