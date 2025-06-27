package com.json.mediationsdk;

import android.text.TextUtils;
import com.json.environment.StringUtils;
import com.json.l4;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.json.mediationsdk.adunit.adapter.BaseAdapter;
import com.json.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.json.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.o8;
import com.json.r2;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {
    private static final String j = "IronSource";
    private static final String k = "com.ironsource.adapters";
    private static final String l = "aps";
    private static final c m = new c();
    private static final Object n = new Object();
    private String c;
    private String d;
    private Boolean e;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private r2 i = new r2();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, AbstractAdapter> f1915a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, AdapterBaseWrapper> b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, List<String>> f = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<IronSource.AD_UNIT, JSONObject> g = new ConcurrentHashMap<>();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1916a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f1916a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1916a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1916a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1916a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private AbstractAdapter a(String str, String str2) throws JSONException, ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str2) + "." + str2 + "Adapter");
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e) {
            String str3 = "Error while loading adapter - exception = " + e.getLocalizedMessage();
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            a(str3);
            return null;
        }
    }

    private AdapterBaseInterface a(String str, String str2, NetworkSettings networkSettings) throws JSONException {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        String str3 = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : k) + "." + str2;
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(str3).newInstance();
            IronLog.INTERNAL.info(str3 + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            a(baseAdapter);
            this.i.a(baseAdapter, networkSettings);
            this.b.put(str, new AdapterBaseWrapper(baseAdapter, networkSettings));
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str4 = "failed to load " + str3;
                IronLog.INTERNAL.error(str4);
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str4);
            }
            return null;
        }
    }

    private BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) throws JSONException {
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + networkSettings.getProviderTypeForReflection());
            return null;
        }
        String str = (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkPackage() : k) + "." + (networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(ad_unit) : networkSettings.getProviderTypeForReflection());
        try {
            return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str2 = "failed to load " + str;
                IronLog.INTERNAL.error(str2);
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            }
            return null;
        }
    }

    private String a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null || TextUtils.isEmpty(ad_unit.toString())) {
            return "";
        }
        return ad_unit.toString().substring(0, 1).toUpperCase(Locale.getDefault()) + ad_unit.toString().substring(1);
    }

    private void a(int i, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            o8.i().a(new l4(i, jSONObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(AbstractAdapter abstractAdapter) throws JSONException {
        if (!StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(l) || this.g.size() == 0) {
            return;
        }
        for (IronSource.AD_UNIT ad_unit : this.g.keySet()) {
            try {
                JSONObject jSONObject = this.g.get(ad_unit);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
                }
            } catch (Exception e) {
                String str = "error while setting aps data: " + e.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
                b(str);
                e.printStackTrace();
            }
        }
        this.g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || jSONObject.length() == 0) {
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, "APSData is empty");
            a("APSData is empty");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            if (!this.f1915a.isEmpty()) {
                for (AbstractAdapter abstractAdapter : this.f1915a.values()) {
                    if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals(l) && (abstractAdapter instanceof SetAPSInterface)) {
                        ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                }
            }
            for (AdapterBaseWrapper adapterBaseWrapper : this.b.values()) {
                if (StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals(l)) {
                    AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                    if (adapterBaseInterface != null) {
                        ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(ad_unit, jSONObject2);
                        return;
                    }
                    return;
                }
            }
            synchronized (n) {
                this.g.put(ad_unit, jSONObject2);
            }
        } catch (Exception e) {
            String str = "error while setting APSData: " + e.getLocalizedMessage();
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str);
            a(str);
            e.printStackTrace();
        }
    }

    private void a(AdapterBaseInterface adapterBaseInterface) throws JSONException {
        Boolean bool = this.e;
        if (bool == null || !(adapterBaseInterface instanceof AdapterDebugInterface)) {
            return;
        }
        try {
            ((AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (Exception e) {
            String str = "error while setting adapterDebug of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e.getLocalizedMessage();
            a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            b(str);
            e.printStackTrace();
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    private void a(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            if (!next.equalsIgnoreCase(ad_unit.toString())) {
                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                if (!next.equalsIgnoreCase(ad_unit.toString())) {
                    ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
                    if (next.equalsIgnoreCase(ad_unit.toString())) {
                    }
                }
            }
            a(ad_unit, jSONObjectOptJSONObject);
        }
    }

    private void a(JSONObject jSONObject, AbstractAdapter abstractAdapter, String str) throws JSONException {
        if ((str.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || str.equalsIgnoreCase("IronSource")) && this.h.compareAndSet(false, true)) {
            b("SDK5 earlyInit  <" + str + ">");
            try {
                abstractAdapter.earlyInit(this.c, this.d, jSONObject);
            } catch (Exception e) {
                String str2 = "error while calling early init for " + abstractAdapter.getProviderName() + ": " + e.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
            }
        }
    }

    public static c b() {
        return m;
    }

    private String b(NetworkSettings networkSettings) {
        return networkSettings.isMultipleInstances() ? networkSettings.getProviderDefaultInstance() : networkSettings.getProviderName();
    }

    private void b(AbstractAdapter abstractAdapter) throws JSONException {
        Boolean bool = this.e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th) {
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                b(str);
                th.printStackTrace();
            }
        }
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    private String c(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) {
        return ((uuid == null || ad_unit != IronSource.AD_UNIT.NATIVE_AD) ? "" : uuid.toString()) + "-" + ad_unit.toString() + "-" + networkSettings.getProviderName();
    }

    private void c(AbstractAdapter abstractAdapter) throws JSONException {
        for (String str : this.f.keySet()) {
            try {
                List<String> list = this.f.get(str);
                IronSourceUtils.sendAutomationLog(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
                if (list != null) {
                    abstractAdapter.setMetaData(str, list);
                }
            } catch (Throwable th) {
                String str2 = "error while setting metadata of " + abstractAdapter.getProviderName() + ": " + th.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                b(str2);
                th.printStackTrace();
            }
        }
    }

    public AbstractAdapter a(NetworkSettings networkSettings) {
        String strB = b(networkSettings);
        return networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) ? this.f1915a.get(strB) : a(strB, networkSettings.getProviderTypeForReflection());
    }

    public AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z) {
        String coreSDKVersion;
        String strB = b(networkSettings);
        String providerTypeForReflection = z ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (n) {
            if (this.f1915a.containsKey(strB)) {
                return this.f1915a.get(strB);
            }
            AbstractAdapter abstractAdapterA = a(strB, providerTypeForReflection);
            if (abstractAdapterA == null) {
                a(strB + " adapter was not loaded");
                return null;
            }
            try {
                coreSDKVersion = abstractAdapterA.getCoreSDKVersion();
            } catch (Throwable th) {
                String str = "error while retrieving coreSDKVersion " + abstractAdapterA.getProviderName() + ": " + th.getLocalizedMessage();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                IronLog.INTERNAL.error(str);
                coreSDKVersion = "Unknown";
            }
            b(strB + " was allocated (adapter version: " + abstractAdapterA.getVersion() + ", sdk version: " + coreSDKVersion + ")");
            c(abstractAdapterA);
            a(abstractAdapterA);
            this.i.a(abstractAdapterA, networkSettings);
            b(abstractAdapterA);
            a(jSONObject, abstractAdapterA, providerTypeForReflection);
            this.f1915a.put(strB, abstractAdapterA);
            return abstractAdapterA;
        }
    }

    public BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) throws JSONException {
        BaseAdAdapter<?, ?> baseAdAdapterA = a(networkSettings, ad_unit);
        if (baseAdAdapterA != null || networkSettings.isCustomNetwork()) {
            return baseAdAdapterA;
        }
        AbstractAdapter abstractAdapterA = a(networkSettings);
        if (abstractAdapterA != null) {
            return com.json.mediationsdk.a.a(abstractAdapterA, networkSettings, ad_unit, uuid);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    public ConcurrentHashMap<String, AbstractAdapter> a() {
        return this.f1915a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x00d6, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:7:0x0039, B:9:0x003f, B:13:0x004a, B:14:0x0075, B:15:0x007f, B:17:0x0085, B:19:0x0099, B:21:0x009d, B:24:0x00a5, B:25:0x00d4, B:10:0x0045), top: B:30:0x0003, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r8, java.util.List<java.lang.String> r9) {
        /*
            r7 = this;
            java.lang.Object r0 = com.json.mediationsdk.c.n
            monitor-enter(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r7.f     // Catch: java.lang.Throwable -> Ld6
            r1.put(r8, r9)     // Catch: java.lang.Throwable -> Ld6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r1 = r7.f1915a     // Catch: java.lang.Throwable -> Ld6
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld6
            r2 = 88001(0x157c1, float:1.23316E-40)
            if (r1 != 0) goto L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r1.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = "setMetaData key = "
            r1.append(r3)     // Catch: java.lang.Throwable -> Ld6
            r1.append(r8)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = ", values = "
            r1.append(r3)     // Catch: java.lang.Throwable -> Ld6
            r1.append(r9)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld6
            com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r1)     // Catch: java.lang.Throwable -> Ld6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.AbstractAdapter> r1 = r7.f1915a     // Catch: java.lang.Throwable -> Ld6
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> Ld6
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld6
        L39:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld6
            if (r3 == 0) goto L75
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Ld6
            com.ironsource.mediationsdk.AbstractAdapter r3 = (com.json.mediationsdk.AbstractAdapter) r3     // Catch: java.lang.Throwable -> Ld6
            r3.setMetaData(r8, r9)     // Catch: java.lang.Throwable -> L49
            goto L39
        L49:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r5.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r6 = "error while setting metadata of "
            r5.append(r6)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = r3.getProviderName()     // Catch: java.lang.Throwable -> Ld6
            r5.append(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = ": "
            r5.append(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = r4.getLocalizedMessage()     // Catch: java.lang.Throwable -> Ld6
            r5.append(r3)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Ld6
            r7.a(r2, r3)     // Catch: java.lang.Throwable -> Ld6
            r7.b(r3)     // Catch: java.lang.Throwable -> Ld6
            r4.printStackTrace()     // Catch: java.lang.Throwable -> Ld6
            goto L39
        L75:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> r1 = r7.b     // Catch: java.lang.Throwable -> Ld6
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> Ld6
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld6
        L7f:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld6
            if (r3 == 0) goto Ld4
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Ld6
            com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper r3 = (com.json.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper) r3     // Catch: java.lang.Throwable -> Ld6
            com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface r4 = r3.getAdapterBaseInterface()     // Catch: java.lang.Throwable -> Ld6
            com.ironsource.mediationsdk.model.NetworkSettings r3 = r3.getSettings()     // Catch: java.lang.Throwable -> Ld6
            boolean r3 = r3.isCustomNetwork()     // Catch: java.lang.Throwable -> Ld6
            if (r3 != 0) goto L7f
            boolean r3 = r4 instanceof com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface     // Catch: java.lang.Throwable -> Ld6
            if (r3 == 0) goto L7f
            r3 = r4
            com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface r3 = (com.json.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface) r3     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Ld6
            r3.setMetaData(r8, r9)     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> Ld6
            goto L7f
        La4:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r5.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r6 = "error while setting metadata of "
            r5.append(r6)     // Catch: java.lang.Throwable -> Ld6
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = r4.getSimpleName()     // Catch: java.lang.Throwable -> Ld6
            r5.append(r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = ": "
            r5.append(r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = r3.getLocalizedMessage()     // Catch: java.lang.Throwable -> Ld6
            r5.append(r4)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> Ld6
            r7.a(r2, r4)     // Catch: java.lang.Throwable -> Ld6
            r7.b(r4)     // Catch: java.lang.Throwable -> Ld6
            r3.printStackTrace()     // Catch: java.lang.Throwable -> Ld6
            goto L7f
        Ld4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld6
            return
        Ld6:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld6
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.c.a(java.lang.String, java.util.List):void");
    }

    public void a(String str, JSONObject jSONObject) throws JSONException {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Calling setNetworkData on an empty network";
        } else {
            if (jSONObject != null && jSONObject.length() != 0) {
                if (StringUtils.toLowerCase(str).equals(l)) {
                    a(jSONObject);
                    return;
                }
                String str3 = "Calling setNetworkData on an unsupported network: " + str;
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str3);
                a(str3);
                return;
            }
            str2 = "Calling setNetworkData with empty networkData";
        }
        a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_APS_INTERNAL_ERROR, str2);
        a(str2);
    }

    public void a(boolean z) {
        synchronized (n) {
            this.e = Boolean.valueOf(z);
            Iterator<AbstractAdapter> it = this.f1915a.values().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }
    }

    public AdapterBaseInterface b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit, UUID uuid) throws JSONException {
        ConcurrentHashMap<String, AdapterBaseWrapper> concurrentHashMap;
        AdapterBaseWrapper adapterBaseWrapper;
        String strB = networkSettings.isCustomNetwork() ? b(networkSettings) : c(networkSettings, ad_unit, uuid);
        if (this.b.containsKey(strB)) {
            return this.b.get(strB).getAdapterBaseInterface();
        }
        AdapterBaseInterface adapterBaseInterfaceA = a(strB, networkSettings.isCustomNetwork() ? networkSettings.getCustomNetworkAdapterName(null) : networkSettings.getProviderTypeForReflection(), networkSettings);
        if (adapterBaseInterfaceA != null || networkSettings.isCustomNetwork()) {
            concurrentHashMap = this.b;
            adapterBaseWrapper = new AdapterBaseWrapper(adapterBaseInterfaceA, networkSettings);
        } else {
            int i = a.f1916a[ad_unit.ordinal()];
            AbstractAdapter abstractAdapterA = a(networkSettings, i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : networkSettings.getNativeAdSettings() : networkSettings.getBannerSettings() : networkSettings.getInterstitialSettings() : networkSettings.getRewardedVideoSettings(), false);
            if (abstractAdapterA == null) {
                String str = "error creating network adapter " + networkSettings.getProviderName();
                a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                IronLog.INTERNAL.error(str);
                return null;
            }
            adapterBaseInterfaceA = new u(abstractAdapterA);
            concurrentHashMap = this.b;
            adapterBaseWrapper = new AdapterBaseWrapper(adapterBaseInterfaceA, networkSettings);
        }
        concurrentHashMap.put(strB, adapterBaseWrapper);
        return adapterBaseInterfaceA;
    }

    public void b(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public void b(boolean z) {
        synchronized (n) {
            this.i.a(z);
            this.i.a(this.f1915a, this.b);
        }
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f;
    }

    public ConcurrentHashMap<String, AdapterBaseWrapper> d() {
        return this.b;
    }

    public void e() {
        this.f1915a.clear();
        this.b.clear();
    }
}
