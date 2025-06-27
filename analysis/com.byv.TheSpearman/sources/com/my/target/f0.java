package com.my.target;

import com.my.target.common.models.ImageData;
import com.my.target.common.models.ShareButtonData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class f0 extends b {
    private String adText;
    private ImageData preview;
    private final ArrayList<e1> companionBanners = new ArrayList<>();
    private final ArrayList<ShareButtonData> shareButtonDatas = new ArrayList<>();
    private b9 shoppableBanner = null;
    private z8 shoppableAdsData = null;
    private String closeActionText = "Close";
    private String replayActionText = "Replay";
    private String closeDelayActionText = "Ad can be skipped after %ds";
    private boolean autoMute = false;
    private boolean autoPlay = true;
    private boolean hasCtaButton = true;
    private boolean allowReplay = true;
    private boolean showPlayerControls = true;
    private boolean allowClose = true;
    private boolean allowSeek = false;
    private boolean allowSkip = false;
    private boolean allowTrackChange = false;
    private boolean allowPause = true;
    private float allowCloseDelay = 0.0f;
    private float point = -1.0f;
    private float pointP = -1.0f;
    private int mediaSectionType = 0;

    public void addCompanion(e1 e1Var) {
        this.companionBanners.add(e1Var);
    }

    public void addShareButtonData(ShareButtonData shareButtonData) {
        this.shareButtonDatas.add(shareButtonData);
    }

    public String getAdText() {
        return this.adText;
    }

    public float getAllowCloseDelay() {
        return this.allowCloseDelay;
    }

    public String getCloseActionText() {
        return this.closeActionText;
    }

    public String getCloseDelayActionText() {
        return this.closeDelayActionText;
    }

    public ArrayList<e1> getCompanionBanners() {
        return new ArrayList<>(this.companionBanners);
    }

    public int getMediaSectionType() {
        return this.mediaSectionType;
    }

    public float getPoint() {
        return this.point;
    }

    public float getPointP() {
        return this.pointP;
    }

    public ImageData getPreview() {
        return this.preview;
    }

    public String getReplayActionText() {
        return this.replayActionText;
    }

    public ArrayList<ShareButtonData> getShareButtonDatas() {
        return new ArrayList<>(this.shareButtonDatas);
    }

    public z8 getShoppableAdsData() {
        return this.shoppableAdsData;
    }

    public b9 getShoppableBanner() {
        return this.shoppableBanner;
    }

    public boolean isAllowClose() {
        return this.allowClose;
    }

    public boolean isAllowPause() {
        return this.allowPause;
    }

    public boolean isAllowReplay() {
        return this.allowReplay;
    }

    public boolean isAllowSeek() {
        return this.allowSeek;
    }

    public boolean isAllowSkip() {
        return this.allowSkip;
    }

    public boolean isAllowTrackChange() {
        return this.allowTrackChange;
    }

    public boolean isAutoMute() {
        return this.autoMute;
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    public boolean isHasCtaButton() {
        return this.hasCtaButton;
    }

    public boolean isShowPlayerControls() {
        return this.showPlayerControls;
    }

    public void setAdText(String str) {
        this.adText = str;
    }

    public void setAllowClose(boolean z) {
        this.allowClose = z;
    }

    public void setAllowCloseDelay(float f) {
        this.allowCloseDelay = f;
    }

    public void setAllowPause(boolean z) {
        this.allowPause = z;
    }

    public void setAllowReplay(boolean z) {
        this.allowReplay = z;
    }

    public void setAllowSeek(boolean z) {
        this.allowSeek = z;
    }

    public void setAllowSkip(boolean z) {
        this.allowSkip = z;
    }

    public void setAllowTrackChange(boolean z) {
        this.allowTrackChange = z;
    }

    public void setAutoMute(boolean z) {
        this.autoMute = z;
    }

    public void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public void setCloseActionText(String str) {
        this.closeActionText = str;
    }

    public void setCloseDelayActionText(String str) {
        this.closeDelayActionText = str;
    }

    public void setHasCtaButton(boolean z) {
        this.hasCtaButton = z;
    }

    public void setMediaSectionType(int i) {
        this.mediaSectionType = i;
    }

    public void setPoint(float f) {
        this.point = f;
    }

    public void setPointP(float f) {
        this.pointP = f;
    }

    public void setPreview(ImageData imageData) {
        this.preview = imageData;
    }

    public void setReplayActionText(String str) {
        this.replayActionText = str;
    }

    public void setShoppableAdsData(z8 z8Var) {
        this.shoppableAdsData = z8Var;
    }

    public void setShoppableBanner(b9 b9Var) {
        this.shoppableBanner = b9Var;
    }

    public void setShowPlayerControls(boolean z) {
        this.showPlayerControls = z;
    }
}
