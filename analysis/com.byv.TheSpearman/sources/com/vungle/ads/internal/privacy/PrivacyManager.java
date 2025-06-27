package com.vungle.ads.internal.privacy;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrivacyManager.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0007H\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0007H\u0002J(\u0010&\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0010H\u0002J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u0007H\u0002J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u0007J\u0006\u0010-\u001a\u00020\u0007J\u000e\u0010.\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0007J\u000e\u00101\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0007J \u00102\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/vungle/ads/internal/privacy/PrivacyManager;", "", "()V", "ccpaConsent", "Lcom/vungle/ads/internal/privacy/PrivacyConsent;", "coppaStatus", "Ljava/util/concurrent/atomic/AtomicReference;", "", "disableAdId", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "gdprConsent", "", "gdprConsentMessageVersion", "gdprConsentSource", "gdprConsentTimestamp", "", "Ljava/lang/Long;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publishAndroidId", "getCcpaStatus", "getConsentMessageVersion", "getConsentSource", "getConsentStatus", "getConsentTimestamp", "getCoppaStatus", "Lcom/vungle/ads/internal/privacy/COPPA;", "getPublishAndroidId", t2.a.e, "", "context", "Landroid/content/Context;", "saveCcpaConsent", "consent", "saveCoppaConsent", "value", "saveDisableAdId", "saveGdprConsent", FirebaseAnalytics.Param.SOURCE, "consentMessageVersion", "consentTimestamp", "savePublishAndroidId", "publish", "setPublishAndroidId", "shouldSendAdIds", "updateCcpaConsent", "updateCoppaConsent", "newValue", "updateDisableAdId", "updateGdprConsent", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class PrivacyManager {
    private static PrivacyConsent ccpaConsent;
    private static FilePreferences filePreferences;
    private static String gdprConsent;
    private static String gdprConsentMessageVersion;
    private static String gdprConsentSource;
    private static Long gdprConsentTimestamp;
    public static final PrivacyManager INSTANCE = new PrivacyManager();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static AtomicReference<Boolean> publishAndroidId = new AtomicReference<>();

    private PrivacyManager() {
    }

    public final synchronized void init(Context context) {
        PrivacyConsent privacyConsent;
        Intrinsics.checkNotNullParameter(context, "context");
        AtomicBoolean atomicBoolean = initialized;
        if (atomicBoolean.get()) {
            Logger.INSTANCE.w("PrivacyManager", "PrivacyManager already initialized");
            return;
        }
        FilePreferences filePreferences2 = (FilePreferences) ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
        filePreferences = filePreferences2;
        AtomicReference<Boolean> atomicReference = disableAdId;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            saveDisableAdId(bool.booleanValue());
        } else {
            Boolean bool2 = filePreferences2.getBoolean(Cookie.COPPA_DISABLE_AD_ID);
            if (bool2 != null) {
                atomicReference.set(Boolean.valueOf(bool2.booleanValue()));
            }
        }
        String str = gdprConsent;
        if (str != null) {
            String str2 = gdprConsentSource;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String str4 = gdprConsentMessageVersion;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = str4;
            Long l = gdprConsentTimestamp;
            saveGdprConsent(str, str3, str5, l != null ? l.longValue() : 0L);
        } else {
            String string = filePreferences2.getString(Cookie.GDPR_CONSENT_STATUS);
            if (Intrinsics.areEqual(string, PrivacyConsent.OPT_IN.getValue())) {
                string = PrivacyConsent.OPT_IN.getValue();
            } else if (Intrinsics.areEqual(string, PrivacyConsent.OPT_OUT.getValue())) {
                string = PrivacyConsent.OPT_OUT.getValue();
            }
            gdprConsent = string;
            gdprConsentSource = filePreferences2.getString(Cookie.GDPR_CONSENT_SOURCE);
            gdprConsentMessageVersion = filePreferences2.getString(Cookie.GDPR_CONSENT_MESSAGE_VERSION);
            gdprConsentTimestamp = Long.valueOf(filePreferences2.getLong(Cookie.GDPR_CONSENT_TIMESTAMP, 0L));
        }
        PrivacyConsent privacyConsent2 = ccpaConsent;
        if (privacyConsent2 != null) {
            saveCcpaConsent(privacyConsent2);
        } else {
            if (Intrinsics.areEqual(PrivacyConsent.OPT_OUT.getValue(), filePreferences2.getString(Cookie.CCPA_CONSENT_STATUS))) {
                privacyConsent = PrivacyConsent.OPT_OUT;
            } else {
                privacyConsent = PrivacyConsent.OPT_IN;
            }
            ccpaConsent = privacyConsent;
        }
        AtomicReference<Boolean> atomicReference2 = coppaStatus;
        Boolean bool3 = atomicReference2.get();
        if (bool3 != null) {
            saveCoppaConsent(bool3.booleanValue());
        } else {
            Boolean bool4 = filePreferences2.getBoolean(Cookie.COPPA_STATUS_KEY);
            if (bool4 != null) {
                atomicReference2.set(Boolean.valueOf(bool4.booleanValue()));
            }
        }
        Boolean bool5 = publishAndroidId.get();
        if (bool5 != null) {
            savePublishAndroidId(bool5.booleanValue());
        } else {
            Boolean bool6 = filePreferences2.getBoolean(Cookie.PUBLISH_ANDROID_ID);
            if (bool6 != null) {
                publishAndroidId.set(Boolean.valueOf(bool6.booleanValue()));
            }
        }
        atomicBoolean.set(true);
    }

    public final void updateGdprConsent(String consent, String source, String consentMessageVersion) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(source, "source");
        gdprConsent = consent;
        gdprConsentSource = source;
        gdprConsentMessageVersion = consentMessageVersion;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        gdprConsentTimestamp = Long.valueOf(jCurrentTimeMillis);
        String str = gdprConsentMessageVersion;
        if (str == null) {
            str = "";
        }
        saveGdprConsent(consent, source, str, jCurrentTimeMillis);
    }

    private final void saveGdprConsent(String consent, String source, String consentMessageVersion, long consentTimestamp) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferencesPut2;
        FilePreferences filePreferencesPut3;
        FilePreferences filePreferencesPut4;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.GDPR_CONSENT_STATUS, consent)) == null || (filePreferencesPut2 = filePreferencesPut.put(Cookie.GDPR_CONSENT_SOURCE, source)) == null || (filePreferencesPut3 = filePreferencesPut2.put(Cookie.GDPR_CONSENT_MESSAGE_VERSION, consentMessageVersion)) == null || (filePreferencesPut4 = filePreferencesPut3.put(Cookie.GDPR_CONSENT_TIMESTAMP, consentTimestamp)) == null) {
            return;
        }
        filePreferencesPut4.apply();
    }

    public final void updateCcpaConsent(PrivacyConsent consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        ccpaConsent = consent;
        saveCcpaConsent(consent);
    }

    public final String getCcpaStatus() {
        String value;
        PrivacyConsent privacyConsent = ccpaConsent;
        return (privacyConsent == null || (value = privacyConsent.getValue()) == null) ? PrivacyConsent.OPT_IN.getValue() : value;
    }

    private final void saveCcpaConsent(PrivacyConsent consent) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.CCPA_CONSENT_STATUS, consent.getValue())) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final void updateCoppaConsent(boolean newValue) {
        coppaStatus.set(Boolean.valueOf(newValue));
        saveCoppaConsent(newValue);
    }

    private final void saveCoppaConsent(boolean value) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.COPPA_STATUS_KEY, value)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final void updateDisableAdId(boolean newValue) {
        disableAdId.set(Boolean.valueOf(newValue));
        saveDisableAdId(newValue);
    }

    private final void saveDisableAdId(boolean value) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.COPPA_DISABLE_AD_ID, value)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final String getConsentStatus() {
        String str = gdprConsent;
        return str == null ? "unknown" : str;
    }

    public final String getConsentSource() {
        String str = gdprConsentSource;
        return str == null ? "no_interaction" : str;
    }

    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        return str == null ? "" : str;
    }

    public final long getConsentTimestamp() {
        Long l = gdprConsentTimestamp;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final COPPA getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        if (atomicReference.get() == null) {
            return COPPA.COPPA_NOTSET;
        }
        if (Intrinsics.areEqual((Object) atomicReference.get(), (Object) true)) {
            return COPPA.COPPA_ENABLED;
        }
        if (Intrinsics.areEqual((Object) atomicReference.get(), (Object) false)) {
            return COPPA.COPPA_DISABLED;
        }
        return COPPA.COPPA_NOTSET;
    }

    public final boolean shouldSendAdIds() {
        Boolean bool = disableAdId.get();
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    public final void setPublishAndroidId(boolean publish) {
        publishAndroidId.set(Boolean.valueOf(publish));
        savePublishAndroidId(publish);
    }

    private final void savePublishAndroidId(boolean publish) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.PUBLISH_ANDROID_ID, publish)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final boolean getPublishAndroidId() {
        Boolean bool = publishAndroidId.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
