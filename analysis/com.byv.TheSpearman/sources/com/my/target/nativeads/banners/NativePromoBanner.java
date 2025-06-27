package com.my.target.nativeads.banners;

import android.text.TextUtils;
import com.my.target.common.NavigationType;
import com.my.target.common.models.ImageData;
import com.my.target.d6;
import com.my.target.f6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class NativePromoBanner extends NativeBanner {
    private String category;
    private final boolean hasVideo;
    private final ImageData image;
    private final ArrayList<NativePromoCard> nativePromoCards;
    private String subCategory;

    public static final class Builder {
        private ImageData adChoicesIcon;
        private String advertisingLabel;
        private String ageRestrictions;
        private String bundleId;
        private String ctaText;
        private String description;
        private String disclaimer;
        private String domain;
        boolean hasAdChoices;
        private boolean hasVideo;
        private ImageData icon;
        private ImageData image;
        private String navigationType = NavigationType.WEB;
        private float rating;
        private String title;
        private int votes;

        private Builder() {
        }

        public static Builder createBuilder() {
            return new Builder();
        }

        public NativePromoBanner build() {
            return new NativePromoBanner(this.title, this.ctaText, this.domain, this.advertisingLabel, this.icon, this.rating, this.ageRestrictions, this.disclaimer, this.votes, this.navigationType, this.hasVideo, this.description, this.image, this.hasAdChoices, this.adChoicesIcon, this.bundleId);
        }

        public Builder setAdChoicesIcon(ImageData imageData) {
            this.adChoicesIcon = imageData;
            return this;
        }

        public Builder setAdvertisingLabel(String str) {
            this.advertisingLabel = str;
            return this;
        }

        public Builder setAgeRestrictions(String str) {
            this.ageRestrictions = str;
            return this;
        }

        public Builder setBundleId(String str) {
            this.bundleId = str;
            return this;
        }

        public Builder setCtaText(String str) {
            this.ctaText = str;
            return this;
        }

        public Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder setDisclaimer(String str) {
            this.disclaimer = str;
            return this;
        }

        public Builder setDomain(String str) {
            this.domain = str;
            return this;
        }

        public Builder setHasAdChoices(boolean z) {
            this.hasAdChoices = z;
            return this;
        }

        public Builder setHasVideo(boolean z) {
            this.hasVideo = z;
            return this;
        }

        public Builder setIcon(ImageData imageData) {
            this.icon = imageData;
            return this;
        }

        public Builder setImage(ImageData imageData) {
            this.image = imageData;
            return this;
        }

        public Builder setNavigationType(String str) {
            if (NavigationType.WEB.equals(str) || "store".equals(str)) {
                this.navigationType = str;
            }
            return this;
        }

        public Builder setRating(float f) {
            this.rating = f;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVotes(int i) {
            this.votes = i;
            return this;
        }
    }

    private NativePromoBanner(d6 d6Var) {
        super(d6Var);
        this.nativePromoCards = new ArrayList<>();
        this.hasVideo = d6Var.getVideoBanner() != null;
        String category = d6Var.getCategory();
        this.category = TextUtils.isEmpty(category) ? null : category;
        String subCategory = d6Var.getSubCategory();
        this.subCategory = TextUtils.isEmpty(subCategory) ? null : subCategory;
        this.image = d6Var.getImage();
        processCards(d6Var);
    }

    public NativePromoBanner(String str, String str2, String str3, String str4, ImageData imageData, float f, String str5, String str6, int i, String str7, boolean z, String str8, ImageData imageData2, boolean z2, ImageData imageData3, String str9) {
        super(str, str2, str8, str3, str4, imageData, f, str5, str6, i, str7, z2, imageData3, str9);
        this.nativePromoCards = new ArrayList<>();
        this.hasVideo = z;
        this.image = imageData2;
    }

    public static NativePromoBanner newBanner(d6 d6Var) {
        return new NativePromoBanner(d6Var);
    }

    private void processCards(d6 d6Var) {
        if (this.hasVideo) {
            return;
        }
        List<f6> nativeAdCards = d6Var.getNativeAdCards();
        if (nativeAdCards.isEmpty()) {
            return;
        }
        Iterator<f6> it = nativeAdCards.iterator();
        while (it.hasNext()) {
            this.nativePromoCards.add(NativePromoCard.newCard(it.next()));
        }
    }

    public ArrayList<NativePromoCard> getCards() {
        return this.nativePromoCards;
    }

    public String getCategory() {
        return this.category;
    }

    public ImageData getImage() {
        return this.image;
    }

    public String getSubCategory() {
        return this.subCategory;
    }

    public boolean hasVideo() {
        return this.hasVideo;
    }

    @Override // com.my.target.nativeads.banners.NativeBanner
    public String toString() {
        return "NativePromoBanner{hasVideo=" + this.hasVideo + ", image=" + this.image + ", nativePromoCards=" + this.nativePromoCards + ", category='" + this.category + "', subCategory='" + this.subCategory + "', navigationType='" + this.navigationType + "', rating=" + this.rating + ", votes=" + this.votes + ", hasAdChoices=" + this.hasAdChoices + ", title='" + this.title + "', ctaText='" + this.ctaText + "', description='" + this.description + "', disclaimer='" + this.disclaimer + "', ageRestrictions='" + this.ageRestrictions + "', domain='" + this.domain + "', advertisingLabel='" + this.advertisingLabel + "', bundleId='" + this.bundleId + "', icon=" + this.icon + ", adChoicesIcon=" + this.adChoicesIcon + AbstractJsonLexerKt.END_OBJ;
    }
}
