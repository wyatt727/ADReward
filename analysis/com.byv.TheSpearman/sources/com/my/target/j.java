package com.my.target;

import com.my.target.common.CustomParams;
import com.my.target.mediation.AdNetworkConfig;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class j {
    private int bannersCount;
    private String bidId;
    private volatile String format;
    private int slotId;
    private final CustomParams customParams = new CustomParams();
    private final Map<String, AdNetworkConfig> adNetworkConfigs = Collections.synchronizedMap(new HashMap());
    private long cachePeriod = SignalManager.TWENTY_FOUR_HOURS_MILLIS;
    private boolean mediationEnabled = true;
    private boolean refreshAd = true;
    private int videoQuality = 360;
    private int cachePolicy = 0;

    private j(int i, String str) {
        this.slotId = i;
        this.format = str;
    }

    public static j newConfig(int i, String str) {
        return new j(i, str);
    }

    public AdNetworkConfig getAdNetworkConfig(String str) {
        return this.adNetworkConfigs.get(str.toLowerCase());
    }

    public Collection<AdNetworkConfig> getAdNetworkConfigs() {
        return this.adNetworkConfigs.values();
    }

    public int getBannersCount() {
        return this.bannersCount;
    }

    public String getBidId() {
        return this.bidId;
    }

    public long getCachePeriod() {
        return this.cachePeriod;
    }

    public int getCachePolicy() {
        return this.cachePolicy;
    }

    public CustomParams getCustomParams() {
        return this.customParams;
    }

    public String getFormat() {
        return this.format;
    }

    public int getSlotId() {
        return this.slotId;
    }

    public int getVideoQuality() {
        return this.videoQuality;
    }

    public boolean isMediationEnabled() {
        return this.mediationEnabled;
    }

    public boolean isRefreshAd() {
        return this.refreshAd;
    }

    public void setAdNetworkConfig(String str, AdNetworkConfig adNetworkConfig) {
        this.adNetworkConfigs.put(str.toLowerCase(), adNetworkConfig);
    }

    public void setBannersCount(int i) {
        this.bannersCount = i;
    }

    public void setBidId(String str) {
        this.bidId = str;
    }

    public void setCachePeriod(long j) {
        if (j < 0) {
            this.cachePeriod = 0L;
        } else {
            this.cachePeriod = j;
        }
    }

    public void setCachePolicy(int i) {
        this.cachePolicy = i;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setMediationEnabled(boolean z) {
        this.mediationEnabled = z;
    }

    public void setRefreshAd(boolean z) {
        this.refreshAd = z;
    }

    public void setSlotId(int i) {
        this.slotId = i;
    }

    public void setVideoQuality(int i) {
        this.videoQuality = i;
    }
}
