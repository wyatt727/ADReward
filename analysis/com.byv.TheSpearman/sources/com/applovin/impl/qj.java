package com.applovin.impl;

import java.util.HashSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class qj {

    /* renamed from: a, reason: collision with root package name */
    private final String f838a;
    private final Class b;
    public static final qj c = new qj("com.applovin.sdk.impl.isFirstRun", String.class);
    public static final qj d = new qj("com.applovin.sdk.launched_before", Boolean.class);
    public static final qj e = new qj("com.applovin.sdk.latest_installed_version", String.class);
    public static final qj f = new qj("com.applovin.sdk.install_date", Long.class);
    public static final qj g = new qj("com.applovin.sdk.user_id", String.class);
    public static final qj h = new qj("com.applovin.sdk.compass_id", String.class);
    public static final qj i = new qj("com.applovin.sdk.compass_random_token", String.class);
    public static final qj j = new qj("com.applovin.sdk.applovin_random_token", String.class);
    public static final qj k = new qj("com.applovin.sdk.device_test_group", String.class);
    public static final qj l = new qj("com.applovin.sdk.compliance.has_user_consent", Boolean.class);
    public static final qj m = new qj("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);
    public static final qj n = new qj("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);
    public static final qj o = new qj("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);
    public static final qj p = new qj("IABTCF_CmpSdkID", Object.class);
    public static final qj q = new qj("IABTCF_CmpSdkVersion", Object.class);
    public static final qj r = new qj("IABTCF_gdprApplies", Object.class);
    public static final qj s = new qj("IABTCF_TCString", String.class);
    public static final qj t = new qj("IABTCF_AddtlConsent", String.class);
    public static final qj u = new qj("IABTCF_VendorConsents", String.class);
    public static final qj v = new qj("IABTCF_VendorLegitimateInterests", String.class);
    public static final qj w = new qj("IABTCF_PurposeConsents", String.class);
    public static final qj x = new qj("IABTCF_PurposeLegitimateInterests", String.class);
    public static final qj y = new qj("IABTCF_SpecialFeaturesOptIns", String.class);
    public static final qj z = new qj("com.applovin.sdk.stats", String.class);
    public static final qj A = new qj("com.applovin.sdk.task.stats", HashSet.class);
    public static final qj B = new qj("com.applovin.sdk.network_response_code_mapping", String.class);
    public static final qj C = new qj("com.applovin.sdk.event_tracking.super_properties", String.class);
    public static final qj D = new qj("com.applovin.sdk.last_video_position", Integer.class);
    public static final qj E = new qj("com.applovin.sdk.should_resume_video", Boolean.class);
    public static final qj F = new qj("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final qj G = new qj("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final qj H = new qj("com.applovin.sdk.persisted_data", String.class);
    public static final qj I = new qj("com.applovin.sdk.mediation_provider", String.class);
    public static final qj J = new qj("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final qj K = new qj("com.applovin.sdk.user_agent", String.class);
    public static final qj L = new qj("com.applovin.sdk.last_os_version_user_agent_collected_for", String.class);
    public static final qj M = new qj("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);
    public static final qj N = new qj("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);
    public static final qj O = new qj("com.taboola.api.user_id", String.class);
    public static final qj P = new qj("com.taboola.api.user_id_creation_date", Long.class);

    public String toString() {
        return "Key{name='" + this.f838a + "', type=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }

    public qj(String str, Class cls) {
        this.f838a = str;
        this.b = cls;
    }

    public String a() {
        return this.f838a;
    }

    public Class b() {
        return this.b;
    }
}
