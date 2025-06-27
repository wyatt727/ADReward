package com.bytedance.sdk.component.adexpress.dynamic.Td;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.td;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: DynamicLayoutBrick.java */
/* loaded from: classes2.dex */
public class Kbd {
    public static final Map<String, Integer> EYQ;
    private String IPb;
    private IPb Kbd;
    private IPb Pm;
    private String Td;
    private String mZx;

    static {
        HashMap map = new HashMap();
        EYQ = map;
        map.put(td.y, 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put("title", 0);
        map.put("subtitle", 0);
        map.put(FirebaseAnalytics.Param.SOURCE, 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        map.put("text", 0);
        map.put("tag-group", 17);
        map.put("app-version", 0);
        map.put("development-name", 0);
        map.put("privacy-detail", 23);
        map.put("image", 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        map.put("icon-download", 1);
        map.put("logoad", 4);
        map.put("logounion", 5);
        map.put("logo-union", 9);
        map.put("dislike", 3);
        map.put("close", 3);
        map.put("close-fill", 3);
        map.put("webview-close", 22);
        map.put("feedback-dislike", 12);
        map.put("button", 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put("vessel", 6);
        map.put("image-group", 6);
        map.put("custom-component-vessel", 6);
        map.put("carousel", 24);
        map.put("carousel-vessel", 26);
        map.put("leisure-interact", 25);
        map.put("video-hd", 7);
        map.put("video", 7);
        map.put("video-vd", 7);
        map.put("video-sq", 7);
        map.put("muted", 10);
        map.put("star", 11);
        map.put("skip-countdowns", 19);
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        map.put("skip-with-countdowns-skip-countdown", 20);
        map.put("skip-with-time", 14);
        map.put("skip-with-time-countdown", 13);
        map.put("skip-with-time-skip-btn", 15);
        map.put("skip", 27);
        map.put("timedown", 13);
        map.put("icon", 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        map.put("score-count-type-2", 0);
    }

    public int EYQ() {
        if (TextUtils.isEmpty(this.mZx)) {
            return 0;
        }
        if (this.mZx.equals("logo")) {
            String str = this.mZx + this.Td;
            this.mZx = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.mZx.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = EYQ;
        if (map.get(this.mZx) != null) {
            return map.get(this.mZx).intValue();
        }
        return -1;
    }

    public String mZx() {
        return this.mZx;
    }

    public void EYQ(String str) {
        this.mZx = str;
    }

    public String Td() {
        return this.Td;
    }

    public void mZx(String str) {
        this.Td = str;
    }

    public void Td(String str) {
        this.IPb = str;
    }

    public String Pm() {
        return this.IPb;
    }

    public IPb Kbd() {
        return this.Pm;
    }

    public int IPb() {
        return this.Pm.BQ();
    }

    public void EYQ(IPb iPb) {
        this.Pm = iPb;
    }

    public void mZx(IPb iPb) {
        this.Kbd = iPb;
    }

    public IPb VwS() {
        return this.Kbd;
    }

    public String toString() {
        return "DynamicLayoutBrick{type='" + this.mZx + "', data='" + this.Td + "', value=" + this.Pm + ", themeValue=" + this.Kbd + ", dataExtraInfo='" + this.IPb + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
