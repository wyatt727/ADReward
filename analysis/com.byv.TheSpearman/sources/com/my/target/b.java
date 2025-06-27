package com.my.target;

import com.my.target.common.NavigationType;
import com.my.target.common.models.ImageData;

/* loaded from: classes4.dex */
public abstract class b {
    protected c adChoices;
    protected String bundleId;
    protected String ctaText;
    protected String deeplink;
    protected float duration;
    protected int height;
    protected ImageData icon;
    protected ImageData image;
    protected i7 omData;
    private String paidType;
    protected float rating;
    protected String trackingLink;
    protected String urlscheme;
    protected int votes;
    protected int width;
    private final v9 statHolder = v9.e();
    private final ma viewability = ma.d();
    protected String description = "";
    protected String title = "";
    protected String disclaimer = "";
    protected String ageRestrictions = "";
    protected String category = "";
    protected String subCategory = "";
    protected String domain = "";
    protected String navigationType = NavigationType.WEB;
    protected String advertisingLabel = "";
    protected x0 clickArea = x0.p;
    protected boolean openInBrowser = false;
    protected boolean directLink = false;
    protected boolean appInWhiteList = false;
    protected String type = "";
    protected String id = "";
    private boolean logErrors = true;

    public c getAdChoices() {
        return this.adChoices;
    }

    public String getAdvertisingLabel() {
        return this.advertisingLabel;
    }

    public String getAgeRestrictions() {
        return this.ageRestrictions;
    }

    public String getBundleId() {
        return this.bundleId;
    }

    public String getCategory() {
        return this.category;
    }

    public x0 getClickArea() {
        return this.clickArea;
    }

    public String getCtaText() {
        String str = this.ctaText;
        return str == null ? "store".equals(this.navigationType) ? "Install" : "Visit" : str;
    }

    public String getDeeplink() {
        return this.deeplink;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDisclaimer() {
        return this.disclaimer;
    }

    public String getDomain() {
        return this.domain;
    }

    public float getDuration() {
        return this.duration;
    }

    public int getHeight() {
        return this.height;
    }

    public ImageData getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public ImageData getImage() {
        return this.image;
    }

    public String getNavigationType() {
        return this.navigationType;
    }

    public i7 getOmData() {
        return this.omData;
    }

    public String getPaidType() {
        return this.paidType;
    }

    public float getRating() {
        return this.rating;
    }

    public v9 getStatHolder() {
        return this.statHolder;
    }

    public String getSubCategory() {
        return this.subCategory;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackingLink() {
        return this.trackingLink;
    }

    public String getType() {
        return this.type;
    }

    public String getUrlscheme() {
        return this.urlscheme;
    }

    public ma getViewability() {
        return this.viewability;
    }

    public int getVotes() {
        return this.votes;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAppInWhiteList() {
        return this.appInWhiteList;
    }

    public boolean isDirectLink() {
        return this.directLink;
    }

    public boolean isLogErrors() {
        return this.logErrors;
    }

    public boolean isOpenInBrowser() {
        return this.openInBrowser;
    }

    public void setAdChoices(c cVar) {
        this.adChoices = cVar;
    }

    public void setAdvertisingLabel(String str) {
        this.advertisingLabel = str;
    }

    public void setAgeRestrictions(String str) {
        this.ageRestrictions = str;
    }

    public void setAppInWhiteList(boolean z) {
        this.appInWhiteList = z;
    }

    public void setBundleId(String str) {
        this.bundleId = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setClickArea(x0 x0Var) {
        this.clickArea = x0Var;
    }

    public void setCtaText(String str) {
        this.ctaText = str;
    }

    public void setDeeplink(String str) {
        this.deeplink = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDirectLink(boolean z) {
        this.directLink = z;
    }

    public void setDisclaimer(String str) {
        this.disclaimer = str;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setDuration(float f) {
        this.duration = f;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIcon(ImageData imageData) {
        this.icon = imageData;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImage(ImageData imageData) {
        this.image = imageData;
    }

    public void setLogErrors(boolean z) {
        this.logErrors = z;
    }

    public void setNavigationType(String str) {
        this.navigationType = str;
    }

    public void setOmData(i7 i7Var) {
        this.omData = i7Var;
    }

    public void setOpenInBrowser(boolean z) {
        this.openInBrowser = z;
    }

    public void setPaidType(String str) {
        this.paidType = str;
    }

    public void setRating(float f) {
        this.rating = f;
    }

    public void setSubCategory(String str) {
        this.subCategory = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackingLink(String str) {
        this.trackingLink = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrlscheme(String str) {
        this.urlscheme = str;
    }

    public void setVotes(int i) {
        this.votes = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
