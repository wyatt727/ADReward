package com.my.target;

import android.content.Context;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.nativeads.banners.NativePromoBanner;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l6 {
    public static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, int i, boolean z, Context context) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance_id", q1.b().a(context));
            jSONObject.put("network", str);
            jSONObject.put("navigationType", str2);
            if (a(str3)) {
                jSONObject.put("title", str3);
            }
            if (a(str4)) {
                jSONObject.put("ctaText", str4);
            }
            if (a(str5)) {
                jSONObject.put(t2.i.C, str5);
            }
            if (a(str6)) {
                jSONObject.put("ageRestrictions", str6);
            }
            if (a(str7)) {
                jSONObject.put("disclaimer", str7);
            }
            if (f > 0.0f) {
                jSONObject.put(CampaignEx.JSON_KEY_STAR, String.valueOf(f));
            }
            if (i > 0) {
                jSONObject.put("votes", String.valueOf(i));
            }
            if (a(str8)) {
                jSONObject.put("description", str8);
            }
            if (z) {
                jSONObject.put("hasVideo", com.json.mediationsdk.metadata.a.g);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void a(String str, Context context) {
        if (str == null) {
            return;
        }
        z1.a().a("https://ad.mail.ru/mobile/adcontext", m1.b(str), context);
    }

    public static boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static void b(final String str, final NativeBanner nativeBanner, final Context context) {
        c0.c(new Runnable() { // from class: com.my.target.l6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = str;
                NativeBanner nativeBanner2 = nativeBanner;
                Context context2 = context;
                l6.a(l6.a(str2, nativeBanner2.getNavigationType(), nativeBanner2.getTitle(), nativeBanner2.getCtaText(), nativeBanner2.getDomain(), nativeBanner2.getAgeRestrictions(), nativeBanner2.getDisclaimer(), nativeBanner2.getDescription(), nativeBanner2.getRating(), nativeBanner2.getVotes(), false, context2), context2);
            }
        });
    }

    public static void b(final String str, final NativePromoBanner nativePromoBanner, final Context context) {
        c0.c(new Runnable() { // from class: com.my.target.l6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = str;
                NativePromoBanner nativePromoBanner2 = nativePromoBanner;
                Context context2 = context;
                l6.a(l6.a(str2, nativePromoBanner2.getNavigationType(), nativePromoBanner2.getTitle(), nativePromoBanner2.getCtaText(), nativePromoBanner2.getDomain(), nativePromoBanner2.getAgeRestrictions(), nativePromoBanner2.getDisclaimer(), nativePromoBanner2.getDescription(), nativePromoBanner2.getRating(), nativePromoBanner2.getVotes(), nativePromoBanner2.hasVideo(), context2), context2);
            }
        });
    }
}
