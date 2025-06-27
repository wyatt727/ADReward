package com.json.sdk.controller;

import com.json.r5;
import com.json.sdk.utils.SDKUtils;
import com.json.t2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class FeaturesManager {
    private static volatile FeaturesManager c = null;
    private static final String d = "debugMode";

    /* renamed from: a, reason: collision with root package name */
    private Map<String, ?> f2137a;
    private final ArrayList<String> b = new a();

    class a extends ArrayList<String> {
        a() {
            add(t2.d.f);
            add(t2.d.e);
            add(t2.d.g);
            add(t2.d.h);
            add(t2.d.i);
            add(t2.d.j);
            add(t2.d.k);
            add(t2.d.l);
            add(t2.d.m);
        }
    }

    private FeaturesManager() {
        if (c != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f2137a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (c == null) {
            synchronized (FeaturesManager.class) {
                if (c == null) {
                    c = new FeaturesManager();
                }
            }
        }
        return c;
    }

    ArrayList<String> a() {
        return new ArrayList<>(this.b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(t2.a.c) ? networkConfiguration.optJSONObject(t2.a.c) : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f2137a.containsKey("debugMode")) {
                num = (Integer) this.f2137a.get("debugMode");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public r5 getFeatureFlagHealthCheck() {
        return new r5(SDKUtils.getNetworkConfiguration().optJSONObject(t2.a.q));
    }

    public int getInitRecoverTrials() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject(t2.a.e);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optInt(t2.a.d, 0);
        }
        return 0;
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f2137a = map;
    }
}
