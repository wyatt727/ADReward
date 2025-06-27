package com.json.mediationsdk.demandOnly;

import com.json.cc;
import com.json.h4;
import com.json.mediationsdk.AbstractAdapter;
import com.json.mediationsdk.c;
import com.json.mediationsdk.demandOnly.h;
import com.json.mediationsdk.demandOnly.i;
import com.json.mediationsdk.demandOnly.j;
import com.json.mediationsdk.demandOnly.o;
import com.json.mediationsdk.e;
import com.json.mediationsdk.f;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.mediationsdk.model.NetworkSettings;
import com.json.mediationsdk.utils.ErrorBuilder;
import com.json.mediationsdk.utils.IronSourceAES;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.p3;
import com.json.s6;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class k implements i.c {

    /* renamed from: a, reason: collision with root package name */
    private final p3 f1943a;
    private final ConcurrentHashMap<String, l> b;
    private final s6<ISDemandOnlyRewardedVideoListener> c;

    public k(List<NetworkSettings> list, cc ccVar, c cVar, s6<ISDemandOnlyRewardedVideoListener> s6Var, String str, String str2, p3 p3Var) throws JSONException {
        String sessionId = IronSourceUtils.getSessionId();
        boolean zD = ccVar.d();
        f fVar = new f(ccVar.k(), zD, sessionId);
        this.b = new ConcurrentHashMap<>();
        this.f1943a = p3Var;
        this.c = s6Var;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getRewardedVideoSettings(), true);
                if (abstractAdapterA != null) {
                    l lVar = new l(str, str2, networkSettings, this.c.a(networkSettings.getSubProviderId()), ccVar.i(), abstractAdapterA, new e(fVar));
                    lVar.a(zD);
                    this.b.put(networkSettings.getSubProviderId(), lVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    public ConcurrentHashMap<String, l> a() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void a(h.d dVar) {
        String instanceId = dVar.getInstanceId();
        try {
            l lVar = this.b.get(instanceId);
            if (lVar == null) {
                this.f1943a.a(j.b.NOT_FOUND_IN_LOAD, instanceId);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.c.a(instanceId).onRewardedVideoAdLoadFailed(instanceId, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (dVar.getBidding()) {
                lVar.b(new o.a(IronSourceAES.decode(h4.b().c(), dVar.getAdMarkup())));
            } else {
                lVar.d();
            }
        } catch (Exception e) {
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo exception " + e.getMessage());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.c.a(instanceId).onRewardedVideoAdLoadFailed(instanceId, ironSourceErrorBuildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public boolean a(String str) {
        l lVar = this.b.get(str);
        if (lVar != null) {
            return lVar.a();
        }
        this.f1943a.a(1500, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void b(String str) {
        try {
            l lVar = this.b.get(str);
            if (lVar != null) {
                lVar.e();
                return;
            }
            this.f1943a.a(1507, str);
            IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
            this.c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
        } catch (Exception e) {
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "showRewardedVideo exception " + e.getMessage());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.c.a(str).onRewardedVideoAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }
}
