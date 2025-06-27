package com.my.target;

import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class d6 extends b {
    private h6 content;
    private ImageData ctcIcon;
    private b5<VideoData> videoBanner;
    private final List<f6> nativeAdCards = new ArrayList();
    private String ctcText = "Try to play";

    private d6() {
    }

    public static d6 newBanner() {
        return new d6();
    }

    public void addNativeAdCard(f6 f6Var) {
        this.nativeAdCards.add(f6Var);
    }

    public h6 getContent() {
        return this.content;
    }

    public ImageData getCtcIcon() {
        return this.ctcIcon;
    }

    public String getCtcText() {
        return this.ctcText;
    }

    public List<f6> getNativeAdCards() {
        return new ArrayList(this.nativeAdCards);
    }

    public b5<VideoData> getVideoBanner() {
        return this.videoBanner;
    }

    public void setContent(h6 h6Var) {
        this.content = h6Var;
    }

    public void setCtcIcon(ImageData imageData) {
        this.ctcIcon = imageData;
    }

    public void setCtcText(String str) {
        this.ctcText = str;
    }

    public void setVideoBanner(b5<VideoData> b5Var) {
        this.videoBanner = b5Var;
    }
}
