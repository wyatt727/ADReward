package com.applovin.sdk;

import com.applovin.impl.sdk.AppLovinTargetingDataImpl;
import java.util.List;

/* loaded from: classes.dex */
public interface AppLovinTargetingData {

    /* renamed from: com.applovin.sdk.AppLovinTargetingData$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Builder builder() {
            return new AppLovinTargetingDataImpl.BuilderImpl();
        }
    }

    public enum AdContentRating {
        NONE,
        ALL_AUDIENCES,
        EVERYONE_OVER_TWELVE,
        MATURE_AUDIENCES
    }

    public interface Builder {
        AppLovinTargetingData build();

        String getEmail();

        Gender getGender();

        List<String> getInterests();

        List<String> getKeywords();

        AdContentRating getMaximumAdContentRating();

        String getPhoneNumber();

        Integer getYearOfBirth();

        Builder setEmail(String str);

        Builder setGender(Gender gender);

        Builder setInterests(List<String> list);

        Builder setKeywords(List<String> list);

        Builder setMaximumAdContentRating(AdContentRating adContentRating);

        Builder setPhoneNumber(String str);

        Builder setYearOfBirth(Integer num);
    }

    public enum Gender {
        UNKNOWN,
        FEMALE,
        MALE,
        OTHER
    }

    @Deprecated
    void clearAll();

    String getEmail();

    Gender getGender();

    List<String> getInterests();

    List<String> getKeywords();

    AdContentRating getMaximumAdContentRating();

    String getPhoneNumber();

    Integer getYearOfBirth();

    @Deprecated
    void setEmail(String str);

    @Deprecated
    void setGender(Gender gender);

    @Deprecated
    void setInterests(List<String> list);

    @Deprecated
    void setKeywords(List<String> list);

    @Deprecated
    void setMaximumAdContentRating(AdContentRating adContentRating);

    @Deprecated
    void setPhoneNumber(String str);

    @Deprecated
    void setYearOfBirth(Integer num);
}
