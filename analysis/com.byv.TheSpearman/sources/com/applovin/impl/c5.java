package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f311a;

    public c5(JSONObject jSONObject) {
        this.f311a = jSONObject;
    }

    protected String b() {
        return JsonUtils.getString(this.f311a, "digital_asset_link_url", null);
    }

    protected Integer g() {
        return JsonUtils.getInteger(this.f311a, "session_url_relation", null);
    }

    protected String f() {
        return JsonUtils.getString(this.f311a, "referrer", null);
    }

    protected Integer l() {
        return JsonUtils.getInteger(this.f311a, "toolbar_color", null);
    }

    protected Integer j() {
        return a(JsonUtils.getString(this.f311a, "start_enter_animation", null));
    }

    protected Integer k() {
        return a(JsonUtils.getString(this.f311a, "start_exit_animation", null));
    }

    protected Integer c() {
        return a(JsonUtils.getString(this.f311a, "end_enter_animation", null));
    }

    protected Integer d() {
        return a(JsonUtils.getString(this.f311a, "end_exit_animation", null));
    }

    protected Integer h() {
        return JsonUtils.getInteger(this.f311a, "share_state", null);
    }

    protected Boolean e() {
        return JsonUtils.getBoolean(this.f311a, "instant_apps_enabled", null);
    }

    protected Boolean m() {
        return JsonUtils.getBoolean(this.f311a, "url_bar_hiding_enabled", null);
    }

    protected Boolean i() {
        return JsonUtils.getBoolean(this.f311a, "should_show_title", null);
    }

    private Integer a(String str) {
        if (str == null) {
            return null;
        }
        try {
            int identifier = com.applovin.impl.sdk.k.k().getResources().getIdentifier(str, "anim", "android");
            if (identifier != 0) {
                return Integer.valueOf(identifier);
            }
            return null;
        } catch (Exception e) {
            com.applovin.impl.sdk.t.b("CustomTabsSettings", "Failed to get animation resource ID for: " + str, e);
            return null;
        }
    }

    protected Integer a() {
        return JsonUtils.getInteger(this.f311a, "dark_mode_toolbar_color", null);
    }
}
