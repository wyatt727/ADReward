package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinTargetingData;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinTargetingDataImpl implements AppLovinTargetingData {

    /* renamed from: a, reason: collision with root package name */
    private AppLovinTargetingData.Gender f904a;
    private AppLovinTargetingData.AdContentRating b;
    private Integer c;
    private String d;
    private String e;
    private List f;
    private List g;
    private final Map h;
    private final Map i;

    public static class BuilderImpl implements AppLovinTargetingData.Builder {

        /* renamed from: a, reason: collision with root package name */
        private AppLovinTargetingData.Gender f905a;
        private AppLovinTargetingData.AdContentRating b;
        private Integer c;
        private String d;
        private String e;
        private List f;
        private List g;
        private final Map h = new HashMap();

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData build() {
            return new AppLovinTargetingDataImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public String getEmail() {
            return this.d;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Gender getGender() {
            return this.f905a;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public List<String> getInterests() {
            return this.g;
        }

        public Map<String, String> getJsonData() {
            return this.h;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public List<String> getKeywords() {
            return this.f;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.AdContentRating getMaximumAdContentRating() {
            return this.b;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public String getPhoneNumber() {
            return this.e;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public Integer getYearOfBirth() {
            return this.c;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setEmail(String str) {
            a("email", str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase(Locale.getDefault()).trim()) : str);
            this.d = str;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.applovin.sdk.AppLovinTargetingData.Builder setGender(com.applovin.sdk.AppLovinTargetingData.Gender r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L17
                com.applovin.sdk.AppLovinTargetingData$Gender r0 = com.applovin.sdk.AppLovinTargetingData.Gender.FEMALE
                if (r3 != r0) goto L9
                java.lang.String r0 = "F"
                goto L18
            L9:
                com.applovin.sdk.AppLovinTargetingData$Gender r0 = com.applovin.sdk.AppLovinTargetingData.Gender.MALE
                if (r3 != r0) goto L10
                java.lang.String r0 = "M"
                goto L18
            L10:
                com.applovin.sdk.AppLovinTargetingData$Gender r0 = com.applovin.sdk.AppLovinTargetingData.Gender.OTHER
                if (r3 != r0) goto L17
                java.lang.String r0 = "O"
                goto L18
            L17:
                r0 = 0
            L18:
                java.lang.String r1 = "gender"
                r2.a(r1, r0)
                r2.f905a = r3
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinTargetingDataImpl.BuilderImpl.setGender(com.applovin.sdk.AppLovinTargetingData$Gender):com.applovin.sdk.AppLovinTargetingData$Builder");
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setInterests(List<String> list) {
            a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
            this.g = list;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setKeywords(List<String> list) {
            a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
            this.f = list;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setMaximumAdContentRating(AppLovinTargetingData.AdContentRating adContentRating) {
            a("maximum_ad_content_rating", (adContentRating == null || adContentRating == AppLovinTargetingData.AdContentRating.NONE) ? null : Integer.toString(adContentRating.ordinal()));
            this.b = adContentRating;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setPhoneNumber(String str) {
            a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", "")) : str);
            this.e = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinTargetingData.Builder
        public AppLovinTargetingData.Builder setYearOfBirth(Integer num) {
            a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
            this.c = num;
            return this;
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (StringUtils.isValidString(str2)) {
                this.h.put(str, str2);
            } else {
                this.h.remove(str);
            }
        }
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (StringUtils.isValidString(str2)) {
            this.h.put(str, str2);
        } else {
            this.h.remove(str);
        }
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void clearAll() {
        this.h.clear();
        this.c = null;
        this.f904a = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    @Deprecated
    public Map<String, String> getAllData() {
        HashMap map;
        synchronized (this.h) {
            map = new HashMap(this.h);
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getEmail() {
        return this.d;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinTargetingData.Gender getGender() {
        return this.f904a;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getInterests() {
        return this.g;
    }

    public Map<String, String> getJsonData() {
        return this.i;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getKeywords() {
        return this.f;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinTargetingData.AdContentRating getMaximumAdContentRating() {
        return this.b;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getPhoneNumber() {
        return this.e;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public Integer getYearOfBirth() {
        return this.c;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setEmail(String str) {
        a("email", str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase().trim()) : str);
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    @Override // com.applovin.sdk.AppLovinTargetingData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setGender(com.applovin.sdk.AppLovinTargetingData.Gender r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L17
            com.applovin.sdk.AppLovinTargetingData$Gender r0 = com.applovin.sdk.AppLovinTargetingData.Gender.FEMALE
            if (r3 != r0) goto L9
            java.lang.String r0 = "F"
            goto L18
        L9:
            com.applovin.sdk.AppLovinTargetingData$Gender r0 = com.applovin.sdk.AppLovinTargetingData.Gender.MALE
            if (r3 != r0) goto L10
            java.lang.String r0 = "M"
            goto L18
        L10:
            com.applovin.sdk.AppLovinTargetingData$Gender r0 = com.applovin.sdk.AppLovinTargetingData.Gender.OTHER
            if (r3 != r0) goto L17
            java.lang.String r0 = "O"
            goto L18
        L17:
            r0 = 0
        L18:
            java.lang.String r1 = "gender"
            r2.a(r1, r0)
            r2.f904a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinTargetingDataImpl.setGender(com.applovin.sdk.AppLovinTargetingData$Gender):void");
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setInterests(List<String> list) {
        a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.g = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setKeywords(List<String> list) {
        a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setMaximumAdContentRating(AppLovinTargetingData.AdContentRating adContentRating) {
        a("maximum_ad_content_rating", (adContentRating == null || adContentRating == AppLovinTargetingData.AdContentRating.NONE) ? null : Integer.toString(adContentRating.ordinal()));
        this.b = adContentRating;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setPhoneNumber(String str) {
        a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", "")) : str);
        this.e = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setYearOfBirth(Integer num) {
        a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
        this.c = num;
    }

    public String toString() {
        return "AppLovinTargetingDataImpl{gender=" + this.f904a + ", maximumAdContentRating=" + this.b + ", yearOfBirth=" + this.c + ", email='" + this.d + "', phoneNumber='" + this.e + "', keywords=" + this.f + ", interests=" + this.g + ", parameters=" + this.i + "}";
    }

    private AppLovinTargetingDataImpl(BuilderImpl builderImpl) {
        this.h = Collections.synchronizedMap(new HashMap());
        this.f904a = builderImpl.f905a;
        this.b = builderImpl.b;
        this.c = builderImpl.c;
        this.d = builderImpl.d;
        this.e = builderImpl.e;
        this.f = builderImpl.f;
        this.g = builderImpl.g;
        this.i = builderImpl.h;
    }

    @Deprecated
    protected AppLovinTargetingDataImpl() {
        this.h = Collections.synchronizedMap(new HashMap());
        this.i = new HashMap();
    }
}
