package com.my.target;

import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class z3 extends p3 {
    private ImageData adIcon;
    private String adIconClickLink;
    private p3 endCard;
    private int style;
    private b5<VideoData> videoBanner;
    private boolean closeOnClick = true;
    private boolean videoRequired = false;
    private final List<r3> interstitialAdCards = new ArrayList();
    private final j8 promoStyleSettings = j8.l();

    private z3() {
    }

    public static z3 newBanner() {
        return new z3();
    }

    public void addInterstitialAdCard(r3 r3Var) {
        this.interstitialAdCards.add(r3Var);
    }

    public ImageData getAdIcon() {
        return this.adIcon;
    }

    public String getAdIconClickLink() {
        return this.adIconClickLink;
    }

    public p3 getEndCard() {
        return this.endCard;
    }

    public List<r3> getInterstitialAdCards() {
        return this.interstitialAdCards;
    }

    public j8 getPromoStyleSettings() {
        return this.promoStyleSettings;
    }

    public int getStyle() {
        return this.style;
    }

    public b5<VideoData> getVideoBanner() {
        return this.videoBanner;
    }

    public boolean isCloseOnClick() {
        if (this.videoBanner != null) {
            return false;
        }
        return this.closeOnClick;
    }

    public boolean isVideoRequired() {
        return this.videoRequired;
    }

    public void setAdIcon(ImageData imageData) {
        this.adIcon = imageData;
    }

    public void setAdIconClickLink(String str) {
        this.adIconClickLink = str;
    }

    public void setCloseOnClick(boolean z) {
        this.closeOnClick = z;
    }

    public void setEndCard(p3 p3Var) {
        this.endCard = p3Var;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public void setVideoBanner(b5<VideoData> b5Var) {
        this.videoBanner = b5Var;
    }

    public void setVideoRequired(boolean z) {
        this.videoRequired = z;
    }
}
