package com.my.target;

/* loaded from: classes4.dex */
public class e1 extends b {
    private String adSlotID;
    private String apiFramework;
    private int assetHeight;
    private int assetWidth;
    private int expandedHeight;
    private int expandedWidth;
    private String htmlResource;
    private String iframeResource;
    private String required;
    private String staticResource;

    private e1() {
        this.type = "companion";
    }

    public static e1 newBanner() {
        return new e1();
    }

    public String getAdSlotID() {
        return this.adSlotID;
    }

    public String getApiFramework() {
        return this.apiFramework;
    }

    public int getAssetHeight() {
        return this.assetHeight;
    }

    public int getAssetWidth() {
        return this.assetWidth;
    }

    public int getExpandedHeight() {
        return this.expandedHeight;
    }

    public int getExpandedWidth() {
        return this.expandedWidth;
    }

    public String getHtmlResource() {
        return this.htmlResource;
    }

    public String getIframeResource() {
        return this.iframeResource;
    }

    public String getRequired() {
        return this.required;
    }

    public String getStaticResource() {
        return this.staticResource;
    }

    public void setAdSlotID(String str) {
        this.adSlotID = str;
    }

    public void setApiFramework(String str) {
        this.apiFramework = str;
    }

    public void setAssetHeight(int i) {
        this.assetHeight = i;
    }

    public void setAssetWidth(int i) {
        this.assetWidth = i;
    }

    public void setExpandedHeight(int i) {
        this.expandedHeight = i;
    }

    public void setExpandedWidth(int i) {
        this.expandedWidth = i;
    }

    public void setHtmlResource(String str) {
        this.htmlResource = str;
    }

    public void setIframeResource(String str) {
        this.iframeResource = str;
    }

    public void setRequired(String str) {
        this.required = str;
    }

    public void setStaticResource(String str) {
        this.staticResource = str;
    }
}
