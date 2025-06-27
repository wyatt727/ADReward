package com.my.target.nativeads.banners;

import com.my.target.common.models.ImageData;
import com.my.target.u6;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class NativeAppwallBanner {
    private final boolean appInstalled;
    private final ImageData bubbleIcon;
    private final String bubbleId;
    private final String bundleId;
    private final int coins;
    private final ImageData coinsIcon;
    private final int coinsIconBgColor;
    private final int coinsIconTextColor;
    private final ImageData crossNotifIcon;
    private final String description;
    private final ImageData gotoAppIcon;
    private boolean hasNotification;
    private final ImageData icon;
    private final String id;
    private final boolean isBanner;
    private final boolean isItemHighlight;
    private final boolean isMain;
    private final boolean isRequireCategoryHighlight;
    private final boolean isRequireWifi;
    private final boolean isSubItem;
    private final ImageData itemHighlightIcon;
    private final ImageData labelIcon;
    private final String labelType;
    private final int mrgsId;
    private final String paidType;
    private final float rating;
    private final String status;
    private final ImageData statusIcon;
    private final String title;
    private final int votes;

    private NativeAppwallBanner(u6 u6Var) {
        this.id = u6Var.getId();
        this.description = u6Var.getDescription();
        this.title = u6Var.getTitle();
        this.bubbleId = u6Var.getBubbleId();
        this.labelType = u6Var.getLabelType();
        this.status = u6Var.getStatus();
        this.paidType = u6Var.getPaidType();
        this.mrgsId = u6Var.getMrgsId();
        this.coins = u6Var.getCoins();
        this.coinsIconBgColor = u6Var.getCoinsIconBgColor();
        this.coinsIconTextColor = u6Var.getCoinsIconTextColor();
        this.votes = u6Var.getVotes();
        this.rating = u6Var.getRating();
        this.hasNotification = u6Var.isHasNotification();
        this.isMain = u6Var.isMain();
        this.isRequireCategoryHighlight = u6Var.isRequireCategoryHighlight();
        this.isItemHighlight = u6Var.isItemHighlight();
        this.isBanner = u6Var.isBanner();
        this.isRequireWifi = u6Var.isRequireWifi();
        this.isSubItem = u6Var.isSubItem();
        this.appInstalled = u6Var.isAppInstalled();
        this.icon = u6Var.getIcon();
        this.coinsIcon = u6Var.getCoinsIcon();
        this.labelIcon = u6Var.getLabelIcon();
        this.gotoAppIcon = u6Var.getGotoAppIcon();
        this.statusIcon = u6Var.getStatusIcon();
        this.bubbleIcon = u6Var.getBubbleIcon();
        this.itemHighlightIcon = u6Var.getItemHighlightIcon();
        this.crossNotifIcon = u6Var.getCrossNotifIcon();
        this.bundleId = u6Var.getBundleId();
    }

    public static NativeAppwallBanner newBanner(u6 u6Var) {
        return new NativeAppwallBanner(u6Var);
    }

    public ImageData getBubbleIcon() {
        return this.bubbleIcon;
    }

    public String getBubbleId() {
        return this.bubbleId;
    }

    public String getBundleId() {
        return this.bundleId;
    }

    public int getCoins() {
        return this.coins;
    }

    public ImageData getCoinsIcon() {
        return this.coinsIcon;
    }

    public int getCoinsIconBgColor() {
        return this.coinsIconBgColor;
    }

    public int getCoinsIconTextColor() {
        return this.coinsIconTextColor;
    }

    public ImageData getCrossNotifIcon() {
        return this.crossNotifIcon;
    }

    public String getDescription() {
        return this.description;
    }

    public ImageData getGotoAppIcon() {
        return this.gotoAppIcon;
    }

    public ImageData getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public ImageData getItemHighlightIcon() {
        return this.itemHighlightIcon;
    }

    public ImageData getLabelIcon() {
        return this.labelIcon;
    }

    public String getLabelType() {
        return this.labelType;
    }

    public int getMrgsId() {
        return this.mrgsId;
    }

    public String getPaidType() {
        return this.paidType;
    }

    public float getRating() {
        return this.rating;
    }

    public String getStatus() {
        return this.status;
    }

    public ImageData getStatusIcon() {
        return this.statusIcon;
    }

    public String getTitle() {
        return this.title;
    }

    public int getVotes() {
        return this.votes;
    }

    public boolean isAppInstalled() {
        return this.appInstalled;
    }

    public boolean isBanner() {
        return this.isBanner;
    }

    public boolean isHasNotification() {
        return this.hasNotification;
    }

    public boolean isItemHighlight() {
        return this.isItemHighlight;
    }

    public boolean isMain() {
        return this.isMain;
    }

    public boolean isRequireCategoryHighlight() {
        return this.isRequireCategoryHighlight;
    }

    public boolean isRequireWifi() {
        return this.isRequireWifi;
    }

    public boolean isSubItem() {
        return this.isSubItem;
    }

    public void setHasNotification(boolean z) {
        this.hasNotification = z;
    }

    public String toString() {
        return "NativeAppwallBanner{id='" + this.id + "', description='" + this.description + "', title='" + this.title + "', bubbleId='" + this.bubbleId + "', labelType='" + this.labelType + "', status='" + this.status + "', paidType='" + this.paidType + "', bundleId='" + this.bundleId + "', mrgsId=" + this.mrgsId + ", coins=" + this.coins + ", coinsIconBgColor=" + this.coinsIconBgColor + ", coinsIconTextColor=" + this.coinsIconTextColor + ", votes=" + this.votes + ", rating=" + this.rating + ", isMain=" + this.isMain + ", isRequireCategoryHighlight=" + this.isRequireCategoryHighlight + ", isItemHighlight=" + this.isItemHighlight + ", isBanner=" + this.isBanner + ", isRequireWifi=" + this.isRequireWifi + ", isSubItem=" + this.isSubItem + ", appInstalled=" + this.appInstalled + ", icon=" + this.icon + ", coinsIcon=" + this.coinsIcon + ", labelIcon=" + this.labelIcon + ", gotoAppIcon=" + this.gotoAppIcon + ", statusIcon=" + this.statusIcon + ", bubbleIcon=" + this.bubbleIcon + ", itemHighlightIcon=" + this.itemHighlightIcon + ", crossNotifIcon=" + this.crossNotifIcon + ", hasNotification=" + this.hasNotification + AbstractJsonLexerKt.END_OBJ;
    }
}
