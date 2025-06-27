package com.my.target;

import android.content.Context;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.MyTargetVersion;
import com.my.target.k5;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mediation.AdNetworkLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class t {

    public static class a extends t {

        /* renamed from: a, reason: collision with root package name */
        public k5 f4126a;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(final String str, final j jVar, final o5 o5Var, final Context context, final b bVar, final Map map) {
            c0.a(new Runnable() { // from class: com.my.target.t$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(str, jVar, map, o5Var, context, bVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str, j jVar, Map map, o5 o5Var, Context context, b bVar) {
            ba.a("DefaultAdServiceBuilder: mediation params is loaded");
            a(str, jVar, (Map<String, String>) map, o5Var, context, bVar);
        }

        public int a(j jVar, Context context) {
            return x8.a();
        }

        public Map<String, String> a(j jVar, o5 o5Var, Context context) {
            String str;
            HashMap map = new HashMap();
            map.put("formats", jVar.getFormat());
            map.put("adman_ver", MyTargetVersion.VERSION);
            map.put("sdk_ver_int", MyTargetVersion.VERSION_INT);
            MyTargetPrivacy myTargetPrivacyCurrentPrivacy = MyTargetPrivacy.currentPrivacy();
            Boolean bool = myTargetPrivacyCurrentPrivacy.userConsent;
            if (bool != null) {
                map.put("user_consent", bool.booleanValue() ? "1" : "0");
            }
            Boolean bool2 = myTargetPrivacyCurrentPrivacy.ccpaUserConsent;
            if (bool2 != null) {
                map.put("ccpa_user_consent", bool2.booleanValue() ? "1" : "0");
            }
            Boolean bool3 = myTargetPrivacyCurrentPrivacy.iabUserConsent;
            if (bool3 != null) {
                map.put("iab_user_consent", bool3.booleanValue() ? "1" : "0");
            }
            if (myTargetPrivacyCurrentPrivacy.userAgeRestricted) {
                map.put("user_age_restricted", "1");
            }
            if (jVar.getCachePolicy() == 0 || jVar.getCachePolicy() == 2) {
                map.put("preloadvideo", "1");
            }
            int bannersCount = jVar.getBannersCount();
            if (bannersCount > 0) {
                map.put("count", Integer.toString(bannersCount));
            }
            String bidId = jVar.getBidId();
            if (bidId != null) {
                map.put("bid_id", bidId);
            }
            CustomParams customParams = jVar.getCustomParams();
            if (myTargetPrivacyCurrentPrivacy.isConsent()) {
                customParams.putDataTo(map);
            } else {
                customParams.putCustomDataToMap(map);
            }
            MyTargetConfig sdkConfig = MyTargetManager.getSdkConfig();
            try {
                map.putAll(q1.b().a(sdkConfig, myTargetPrivacyCurrentPrivacy, o5Var, context));
            } catch (Throwable th) {
                ba.a("AdServiceBuilder: Error collecting data - " + th);
            }
            String lang = customParams.getLang();
            if (lang != null) {
                map.put(com.json.i5.o, lang);
            }
            int iA = a(jVar, context);
            if (iA >= 0) {
                map.put("sdk_flags", String.valueOf(iA));
            }
            String[] strArr = sdkConfig.testDevices;
            String str2 = map.get("instance_id");
            if (str2 == null) {
                return map;
            }
            if (strArr == null || !b0.a(strArr, str2)) {
                str = "AdServiceBuilder: Device instanceId is " + str2 + ". Use this value in adInstance.withTestDevices() to enable test mode on this device.";
            } else {
                map.put("test_mode", "1");
                str = "DefaultAdServiceBuilder: Test mode is enabled on current device";
            }
            ba.a(str);
            return map;
        }

        @Override // com.my.target.t
        public void a(final String str, final j jVar, final o5 o5Var, final Context context, final b bVar) {
            int cachePolicy = jVar.getCachePolicy();
            x8.a(cachePolicy == 0 || cachePolicy == 1);
            x8.b(cachePolicy == 0 || cachePolicy == 2);
            ArrayList arrayList = new ArrayList();
            Iterator<AdNetworkConfig> it = jVar.getAdNetworkConfigs().iterator();
            while (it.hasNext()) {
                AdNetworkLoader loader = it.next().getLoader();
                if (loader != null) {
                    arrayList.add(loader);
                }
            }
            if (arrayList.isEmpty()) {
                ba.a("DefaultAdServiceBuilder: no AdNetworkLoaders, direct call result");
                a(str, jVar, new HashMap(), o5Var, context, bVar);
            } else {
                ba.a("DefaultAdServiceBuilder: loading mediation params");
                k5 k5Var = new k5(jVar.getFormat(), arrayList, context, new k5.a() { // from class: com.my.target.t$a$$ExternalSyntheticLambda0
                    @Override // com.my.target.k5.a
                    public final void a(Map map) {
                        this.f$0.a(str, jVar, o5Var, context, bVar, map);
                    }
                });
                this.f4126a = k5Var;
                k5Var.b();
            }
        }

        public final void a(String str, j jVar, Map<String, String> map, o5 o5Var, Context context, b bVar) {
            this.f4126a = null;
            map.putAll(a(jVar, o5Var, context));
            bVar.a(s.a(str + jVar.getSlotId() + "/", m1.a(map)), null);
        }
    }

    public interface b {
        void a(s sVar, String str);
    }

    public static t a() {
        return new a();
    }

    public final s a(String str, j jVar, String str2) {
        return s.a(str + jVar.getSlotId() + "/", str2);
    }

    public abstract void a(String str, j jVar, o5 o5Var, Context context, b bVar);
}
