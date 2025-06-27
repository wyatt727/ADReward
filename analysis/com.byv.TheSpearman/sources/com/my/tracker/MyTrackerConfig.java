package com.my.tracker;

import android.content.pm.PackageInfo;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.a1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class MyTrackerConfig {
    private final a1 trackerConfig;

    public interface InstalledPackagesProvider {
        List<PackageInfo> getInstalledPackages();
    }

    public interface OkHttpClientProvider {
        OkHttpClient getOkHttpClient();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Region {
        public static final int EU = 1;
        public static final int RU = 0;
    }

    private MyTrackerConfig(a1 a1Var) {
        this.trackerConfig = a1Var;
    }

    static MyTrackerConfig newConfig(a1 a1Var) {
        return new MyTrackerConfig(a1Var);
    }

    public AntiFraudConfig getAntiFraudConfig() {
        return this.trackerConfig.a();
    }

    public String getApkPreinstallParams() {
        return this.trackerConfig.b();
    }

    public int getBufferingPeriod() {
        return this.trackerConfig.e();
    }

    public int getForcingPeriod() {
        return this.trackerConfig.f();
    }

    public String getId() {
        return this.trackerConfig.g();
    }

    public int getLaunchTimeout() {
        return this.trackerConfig.i();
    }

    @Deprecated
    public String getVendorAppPackage() {
        return this.trackerConfig.m();
    }

    public boolean isAutotrackingPurchaseEnabled() {
        return this.trackerConfig.n();
    }

    public boolean isTrackingEnvironmentEnabled() {
        return this.trackerConfig.o();
    }

    public boolean isTrackingLaunchEnabled() {
        return this.trackerConfig.p();
    }

    public boolean isTrackingLocationEnabled() {
        return this.trackerConfig.q();
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.trackerConfig.r();
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.trackerConfig.s();
    }

    public void setAntiFraudConfig(AntiFraudConfig antiFraudConfig) {
        this.trackerConfig.a(antiFraudConfig);
    }

    public MyTrackerConfig setApkPreinstallParams(String str) {
        this.trackerConfig.a(str);
        return this;
    }

    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z) {
        this.trackerConfig.a(z);
        return this;
    }

    public MyTrackerConfig setBufferingPeriod(int i) {
        this.trackerConfig.a(i);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.trackerConfig.u();
        return this;
    }

    public MyTrackerConfig setForcingPeriod(int i) {
        this.trackerConfig.b(i);
        return this;
    }

    public MyTrackerConfig setInstalledPackagesProvider(InstalledPackagesProvider installedPackagesProvider) {
        this.trackerConfig.a(installedPackagesProvider);
        return this;
    }

    public MyTrackerConfig setLaunchTimeout(int i) {
        this.trackerConfig.c(i);
        return this;
    }

    public MyTrackerConfig setOkHttpClientProvider(OkHttpClientProvider okHttpClientProvider) {
        this.trackerConfig.a(okHttpClientProvider);
        return this;
    }

    public MyTrackerConfig setProxyHost(String str) {
        this.trackerConfig.c(str);
        return this;
    }

    public MyTrackerConfig setRegion(int i) {
        this.trackerConfig.d(i);
        return this;
    }

    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z) {
        this.trackerConfig.b(z);
        return this;
    }

    public MyTrackerConfig setTrackingLaunchEnabled(boolean z) {
        this.trackerConfig.c(z);
        return this;
    }

    public MyTrackerConfig setTrackingLocationEnabled(boolean z) {
        this.trackerConfig.d(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z) {
        this.trackerConfig.e(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z) {
        this.trackerConfig.f(z);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setVendorAppPackage(String str) {
        this.trackerConfig.d(str);
        return this;
    }
}
