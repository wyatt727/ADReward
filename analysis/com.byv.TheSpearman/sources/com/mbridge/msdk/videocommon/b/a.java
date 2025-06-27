package com.mbridge.msdk.videocommon.b;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.t2;
import org.json.JSONObject;

/* compiled from: AdParams.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f3873a;
    private String b;

    private a(String str, String str2) {
        this.f3873a = str;
        this.b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_ID), jSONObject.optString(t2.k));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
