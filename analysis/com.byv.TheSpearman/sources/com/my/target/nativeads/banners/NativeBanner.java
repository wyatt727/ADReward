package com.my.target.nativeads.banners;

import android.text.TextUtils;
import com.my.target.c;
import com.my.target.common.NavigationType;
import com.my.target.common.models.ImageData;
import com.my.target.d6;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class NativeBanner {
    ImageData adChoicesIcon;
    String advertisingLabel;
    String ageRestrictions;
    String bundleId;
    String ctaText;
    String description;
    String disclaimer;
    String domain;
    boolean hasAdChoices;
    ImageData icon;
    String navigationType;
    float rating;
    String title;
    int votes;

    public static final class Builder {
        private final NativeBanner banner = new NativeBanner();

        private Builder() {
        }

        public static Builder createBuilder() {
            return new Builder();
        }

        public NativeBanner build() {
            return this.banner;
        }

        public Builder setAdChoicesIcon(ImageData imageData) {
            this.banner.adChoicesIcon = imageData;
            return this;
        }

        public Builder setAdvertisingLabel(String str) {
            this.banner.advertisingLabel = str;
            return this;
        }

        public Builder setAgeRestrictions(String str) {
            this.banner.ageRestrictions = str;
            return this;
        }

        public Builder setBundleId(String str) {
            this.banner.bundleId = str;
            return this;
        }

        public Builder setCtaText(String str) {
            this.banner.ctaText = str;
            return this;
        }

        public Builder setDescription(String str) {
            this.banner.description = str;
            return this;
        }

        public Builder setDisclaimer(String str) {
            this.banner.disclaimer = str;
            return this;
        }

        public Builder setDomain(String str) {
            this.banner.domain = str;
            return this;
        }

        public Builder setHasAdChoices(boolean z) {
            this.banner.hasAdChoices = z;
            return this;
        }

        public Builder setIcon(ImageData imageData) {
            this.banner.icon = imageData;
            return this;
        }

        public Builder setNavigationType(String str) {
            if (NavigationType.WEB.equals(str) || "store".equals(str)) {
                this.banner.navigationType = str;
            }
            return this;
        }

        public Builder setRating(float f) {
            this.banner.rating = f;
            return this;
        }

        public Builder setTitle(String str) {
            this.banner.title = str;
            return this;
        }

        public Builder setVotes(int i) {
            this.banner.votes = i;
            return this;
        }
    }

    public NativeBanner() {
        this.navigationType = NavigationType.WEB;
    }

    public NativeBanner(d6 d6Var) {
        this.navigationType = NavigationType.WEB;
        this.navigationType = d6Var.getNavigationType();
        this.rating = d6Var.getRating();
        this.votes = d6Var.getVotes();
        String title = d6Var.getTitle();
        this.title = TextUtils.isEmpty(title) ? null : title;
        String ctaText = d6Var.getCtaText();
        this.ctaText = TextUtils.isEmpty(ctaText) ? null : ctaText;
        String description = d6Var.getDescription();
        this.description = TextUtils.isEmpty(description) ? null : description;
        String disclaimer = d6Var.getDisclaimer();
        this.disclaimer = TextUtils.isEmpty(disclaimer) ? null : disclaimer;
        String ageRestrictions = d6Var.getAgeRestrictions();
        this.ageRestrictions = TextUtils.isEmpty(ageRestrictions) ? null : ageRestrictions;
        String domain = d6Var.getDomain();
        this.domain = TextUtils.isEmpty(domain) ? null : domain;
        String advertisingLabel = d6Var.getAdvertisingLabel();
        this.advertisingLabel = TextUtils.isEmpty(advertisingLabel) ? null : advertisingLabel;
        this.icon = d6Var.getIcon();
        String bundleId = d6Var.getBundleId();
        this.bundleId = TextUtils.isEmpty(bundleId) ? null : bundleId;
        c adChoices = d6Var.getAdChoices();
        if (adChoices == null) {
            this.hasAdChoices = false;
            this.adChoicesIcon = null;
        } else {
            this.hasAdChoices = true;
            this.adChoicesIcon = adChoices.c();
        }
    }

    public NativeBanner(String str, String str2, String str3, String str4, String str5, ImageData imageData, float f, String str6, String str7, int i, String str8, boolean z, ImageData imageData2, String str9) {
        this.title = str;
        this.ctaText = str2;
        this.description = str3;
        this.domain = str4;
        this.advertisingLabel = str5;
        this.icon = imageData;
        this.rating = f;
        this.ageRestrictions = str6;
        this.disclaimer = str7;
        this.votes = i;
        this.navigationType = str8;
        this.hasAdChoices = z;
        this.adChoicesIcon = imageData2;
        this.bundleId = str9;
    }

    public static NativeBanner newBanner(d6 d6Var) {
        return new NativeBanner(d6Var);
    }

    public ImageData getAdChoicesIcon() {
        return this.adChoicesIcon;
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

    public String getCtaText() {
        return this.ctaText;
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

    public ImageData getIcon() {
        return this.icon;
    }

    public String getNavigationType() {
        return this.navigationType;
    }

    public float getRating() {
        return this.rating;
    }

    public String getTitle() {
        return this.title;
    }

    public int getVotes() {
        return this.votes;
    }

    public boolean hasAdChoices() {
        return this.hasAdChoices;
    }

    public String toString() {
        return "NativeBanner{navigationType='" + this.navigationType + "', rating=" + this.rating + ", votes=" + this.votes + ", hasAdChoices=" + this.hasAdChoices + ", title='" + this.title + "', ctaText='" + this.ctaText + "', description='" + this.description + "', disclaimer='" + this.disclaimer + "', ageRestrictions='" + this.ageRestrictions + "', domain='" + this.domain + "', advertisingLabel='" + this.advertisingLabel + "', bundleId='" + this.bundleId + "', icon=" + this.icon + ", adChoicesIcon=" + this.adChoicesIcon + AbstractJsonLexerKt.END_OBJ;
    }
}
