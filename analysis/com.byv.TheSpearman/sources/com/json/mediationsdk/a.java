package com.json.mediationsdk;

import android.app.Activity;
import android.text.TextUtils;
import com.json.i9;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.model.NetworkSettings;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a<Listener extends AdapterAdListener> extends BaseAdAdapter<u, Listener> implements AdapterAdFullScreenInterface<Listener>, AdapterBannerInterface<Listener>, AdapterNativeAdInterface<Listener> {

    /* renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f1907a;
    protected WeakReference<Listener> b;

    public a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        super(ad_unit, networkSettings, uuid);
        this.b = new WeakReference<>(null);
        this.f1907a = abstractAdapter;
    }

    public static a<?> a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return new b0(abstractAdapter, networkSettings);
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return new o(abstractAdapter, networkSettings);
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return new j(abstractAdapter, networkSettings);
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return new t(abstractAdapter, networkSettings, uuid);
        }
        IronLog.INTERNAL.error("ad unit not supported - " + ad_unit);
        return null;
    }

    private void a(AdData adData, Listener listener) {
        this.b = new WeakReference<>(listener);
        a(i9.a(adData.getConfiguration()), i9.a(adData.getAdUnitData()), adData);
    }

    private void b(String str) {
        IronLog.INTERNAL.error(a("Method '" + str + "' is not supported for " + getClass().getName()));
    }

    protected String a() {
        return a((String) null);
    }

    protected String a(String str) {
        String string = b().toString();
        if (TextUtils.isEmpty(str)) {
            return string;
        }
        return string + " - " + str;
    }

    protected void a(JSONObject jSONObject) {
        b("destroyAd");
    }

    protected abstract void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData);

    protected abstract IronSource.AD_UNIT b();

    protected boolean b(JSONObject jSONObject) {
        b("isAdAvailable");
        return false;
    }

    protected void c(JSONObject jSONObject) {
        b("showAd");
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void destroyAd(AdData adData) {
        a(i9.a(adData.getConfiguration()));
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        return b(i9.a(adData.getConfiguration()));
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, Listener listener) {
        a(adData, listener);
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.json.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void loadAd(AdData adData, Activity activity, Listener listener) {
        a(adData, listener);
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public void releaseMemory() {
        IronLog.INTERNAL.verbose(a());
        AbstractAdapter abstractAdapter = this.f1907a;
        if (abstractAdapter != null) {
            abstractAdapter.releaseMemory(b(), new JSONObject());
            this.f1907a = null;
        }
    }

    @Override // com.json.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Listener listener) {
        this.b = new WeakReference<>(listener);
        c(i9.a(adData.getConfiguration()));
    }
}
