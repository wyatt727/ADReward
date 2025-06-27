package com.applovin.impl;

import android.text.TextUtils;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class aa {
    private static final Set b = new HashSet(32);
    private static final Set c = new HashSet(16);
    public static final aa d = a(ServiceProvider.NAMED_AD_REQ);
    public static final aa e = a("ad_imp");
    public static final aa f = a("max_ad_imp");
    public static final aa g = a("ad_session_start");
    public static final aa h = a("ad_imp_session");
    public static final aa i = a("max_ad_imp_session");
    public static final aa j = a("cached_files_expired");
    public static final aa k = a("cache_drop_count");
    public static final aa l = a("sdk_reset_state_count", true);
    public static final aa m = a("ad_response_process_failures", true);
    public static final aa n = a("response_process_failures", true);
    public static final aa o = a("incent_failed_to_display_count", true);
    public static final aa p = a("app_paused_and_resumed");
    public static final aa q = a("ad_rendered_with_mismatched_sdk_key", true);
    public static final aa r = a("ad_shown_outside_app_count");
    public static final aa s = a("med_ad_req");
    public static final aa t = a("med_ad_response_process_failures", true);
    public static final aa u = a("med_waterfall_ad_no_fill", true);
    public static final aa v = a("med_waterfall_ad_adapter_load_failed", true);
    public static final aa w = a("med_waterfall_ad_invalid_response", true);

    /* renamed from: a, reason: collision with root package name */
    private final String f237a;

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    public String b() {
        return this.f237a;
    }

    private aa(String str) {
        this.f237a = str;
    }

    private static aa a(String str) {
        return a(str, false);
    }

    private static aa a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            Set set = b;
            if (!set.contains(str)) {
                set.add(str);
                aa aaVar = new aa(str);
                if (z) {
                    c.add(aaVar);
                }
                return aaVar;
            }
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
        throw new IllegalArgumentException("No key name specified");
    }

    public static Set a() {
        return c;
    }
}
