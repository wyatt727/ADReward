package com.json.mediationsdk;

import android.text.TextUtils;
import com.json.ca;
import com.json.dc;
import com.json.environment.ContextProvider;
import com.json.environment.StringUtils;
import com.json.h8;
import com.json.i6;
import com.json.i8;
import com.json.j6;
import com.json.l4;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.sdk.OfferwallListener;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.mediationsdk.utils.c;
import com.json.sa;
import com.json.va;
import com.json.x7;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class v implements h8, i8 {

    /* renamed from: a, reason: collision with root package name */
    private final String f2008a;
    private sa b;
    private i8 c;
    private IronSourceLoggerManager d;
    private AtomicBoolean e;
    private AtomicBoolean f;
    private c g;
    private NetworkSettings h;
    private String i;
    private final x7 j;
    private final x7.a k;

    v() {
        this(ca.h(), ca.g());
    }

    v(j6 j6Var, i6 i6Var) {
        this.f2008a = getClass().getName();
        this.j = j6Var.d();
        this.k = i6Var.b();
        this.e = new AtomicBoolean(true);
        this.f = new AtomicBoolean(false);
        this.d = IronSourceLoggerManager.getLogger();
    }

    private AbstractAdapter a(String str) {
        try {
            p pVarP = p.p();
            AbstractAdapter abstractAdapterR = pVarP.r(str);
            if (abstractAdapterR == null) {
                Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                abstractAdapterR = (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
                if (abstractAdapterR == null) {
                    return null;
                }
            }
            pVarP.a(abstractAdapterR);
            return abstractAdapterR;
        } catch (Throwable th) {
            IronSourceLoggerManager ironSourceLoggerManager = this.d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str + " initialization failed - please verify that required dependencies are in you build path.", 2);
            this.d.logException(ironSourceTag, this.f2008a + ":startOfferwallAdapter", th);
            return null;
        }
    }

    private String a(c cVar) {
        return (cVar == null || cVar.b() == null || cVar.b().getOfferwallConfigurations() == null || cVar.b().getOfferwallConfigurations().b() == null) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : cVar.b().getOfferwallConfigurations().b();
    }

    private void a(AbstractAdapter abstractAdapter) {
        try {
            Boolean boolJ = p.p().j();
            if (boolJ != null) {
                this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_API, "Offerwall | setConsent(consent:" + boolJ + ")", 1);
                abstractAdapter.setConsent(boolJ.booleanValue());
            }
        } catch (Exception e) {
            this.d.log(IronSourceLogger.IronSourceTag.INTERNAL, ":setCustomParams():" + e.toString(), 3);
        }
    }

    private synchronized void a(IronSourceError ironSourceError) {
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        AtomicBoolean atomicBoolean2 = this.e;
        if (atomicBoolean2 != null) {
            atomicBoolean2.set(true);
        }
        i8 i8Var = this.c;
        if (i8Var != null) {
            i8Var.a(false, ironSourceError);
        }
    }

    @Override // com.json.ta
    public void a(OfferwallListener offerwallListener) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.json.ta
    public synchronized void a(String str, String str2) {
        this.d.log(IronSourceLogger.IronSourceTag.NATIVE, this.f2008a + ":initOfferwall(appKey: " + str + ", userId: " + str2 + ")", 1);
        c cVarK = p.p().k();
        this.g = cVarK;
        if (cVarK == null) {
            a(ErrorBuilder.buildInitFailedError("Please check configurations for Offerwall adapters", IronSourceConstants.OFFERWALL_AD_UNIT));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(ErrorBuilder.buildInitFailedError("Activity must be provided when initializing SDK", IronSourceConstants.OFFERWALL_AD_UNIT));
            return;
        }
        String strA = a(this.g);
        NetworkSettings networkSettingsB = this.g.i().b(strA);
        this.h = networkSettingsB;
        if (networkSettingsB == null) {
            a(ErrorBuilder.buildInitFailedError("Please check configurations for Offerwall adapters", IronSourceConstants.OFFERWALL_AD_UNIT));
            return;
        }
        AbstractAdapter abstractAdapterA = a(strA);
        if (abstractAdapterA == 0) {
            a(ErrorBuilder.buildInitFailedError("Please check configurations for Offerwall adapters", IronSourceConstants.OFFERWALL_AD_UNIT));
            return;
        }
        a(abstractAdapterA);
        sa saVar = (sa) abstractAdapterA;
        this.b = saVar;
        saVar.setInternalOfferwallListener(this);
        this.b.initOfferwall(str, str2, this.h.getRewardedVideoSettings());
    }

    @Override // com.json.i8
    public void a(boolean z, IronSourceError ironSourceError) {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAvailable(isAvailable: " + z + ")", 1);
        if (!z) {
            a(ironSourceError);
            return;
        }
        this.f.set(true);
        i8 i8Var = this.c;
        if (i8Var != null) {
            i8Var.onOfferwallAvailable(true);
        }
    }

    @Override // com.json.ta
    public void c() {
    }

    @Override // com.json.ta
    public void getOfferwallCredits() {
        sa saVar = this.b;
        if (saVar != null) {
            saVar.getOfferwallCredits();
        }
    }

    @Override // com.json.ta
    public synchronized boolean isOfferwallAvailable() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f;
        return atomicBoolean != null ? atomicBoolean.get() : false;
    }

    @Override // com.json.ta
    public void j(String str) {
        sa saVar;
        String str2 = "OWManager:showOfferwall(" + str + ")";
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.c.onOfferwallShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.OFFERWALL_AD_UNIT, "Activity must be provided when initializing SDK"));
                return;
            }
            if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
                this.c.onOfferwallShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            this.i = str;
            va vaVarA = this.g.b().getOfferwallConfigurations().a(str);
            if (vaVarA == null) {
                IronSourceLoggerManager ironSourceLoggerManager = this.d;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                vaVarA = this.g.b().getOfferwallConfigurations().a();
                if (vaVarA == null) {
                    this.d.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.d.log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 1);
            AtomicBoolean atomicBoolean = this.f;
            if (atomicBoolean == null || !atomicBoolean.get() || (saVar = this.b) == null) {
                return;
            }
            saVar.showOfferwall(String.valueOf(vaVarA.getCom.ironsource.t2.k java.lang.String()), this.h.getRewardedVideoSettings());
        } catch (Exception e) {
            this.d.logException(IronSourceLogger.IronSourceTag.INTERNAL, str2, e);
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        i8 i8Var = this.c;
        if (i8Var != null) {
            i8Var.onGetOfferwallCreditsFailed(ironSourceError);
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        i8 i8Var = this.c;
        if (i8Var != null) {
            return i8Var.onOfferwallAdCredited(i, i2, z);
        }
        return false;
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallAvailable(boolean z) {
        a(z, (IronSourceError) null);
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallClosed() {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        i8 i8Var = this.c;
        if (i8Var != null) {
            i8Var.onOfferwallClosed();
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallOpened() throws JSONException {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        int iA = this.j.a(IronSource.AD_UNIT.OFFERWALL);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (!TextUtils.isEmpty(this.i)) {
                mediationAdditionalData.put("placement", this.i);
            }
            mediationAdditionalData.put("sessionDepth", iA);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dc.i().a(new l4(305, mediationAdditionalData));
        this.k.b(IronSource.AD_UNIT.OFFERWALL);
        i8 i8Var = this.c;
        if (i8Var != null) {
            i8Var.onOfferwallOpened();
        }
    }

    @Override // com.json.mediationsdk.sdk.OfferwallListener
    public void onOfferwallShowFailed(IronSourceError ironSourceError) {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        i8 i8Var = this.c;
        if (i8Var != null) {
            i8Var.onOfferwallShowFailed(ironSourceError);
        }
    }

    @Override // com.json.h8
    public void setInternalOfferwallListener(i8 i8Var) {
        this.c = i8Var;
    }
}
