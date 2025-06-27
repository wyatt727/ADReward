package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qm extends xl {
    private final String h;
    private final List i;
    private final ke j;
    private final Map k;
    private final Map l;
    private final Map m;
    private final MaxError n;

    public qm(String str, List list, Map map, Map map2, MaxError maxError, ke keVar, com.applovin.impl.sdk.k kVar, boolean z) {
        super("TaskFireMediationPostbacks", kVar);
        this.h = str + "_urls";
        this.i = list;
        this.k = zp.a(map, kVar);
        this.l = map2 == null ? new HashMap() : map2;
        this.n = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.j = keVar;
        HashMap map3 = new HashMap(7);
        map3.put("AppLovin-Event-Type", str);
        if (z && keVar != null) {
            map3.put("AppLovin-Ad-Network-Name", keVar.c());
        }
        if (keVar instanceof be) {
            be beVar = (be) keVar;
            map3.put("AppLovin-Ad-Unit-Id", beVar.getAdUnitId());
            map3.put("AppLovin-Ad-Format", beVar.getFormat().getLabel());
            if (z) {
                map3.put("AppLovin-Third-Party-Ad-Placement-Id", beVar.S());
            }
        }
        if (maxError != null) {
            map3.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map3.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.m = map3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map mapE;
        List listF = f();
        if (CollectionUtils.isEmpty(listF)) {
            return;
        }
        Map mapE2 = e();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse(a(b((String) it.next(), this.k), this.n));
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            HashMap map = new HashMap(this.l);
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                if (mapE2.containsKey(queryParameter)) {
                    ke keVar = this.j;
                    if (keVar != null) {
                        map.put(str, keVar.a((String) mapE2.get(queryParameter)));
                    }
                } else {
                    builderClearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            if (((Boolean) this.f1179a.a(qe.I7)).booleanValue()) {
                if (this.f1179a.y() != null) {
                    mapE = this.f1179a.y().a();
                } else {
                    mapE = this.f1179a.x().e();
                }
                map.putAll(mapE);
            }
            a(builderClearQuery.build().toString(), map);
        }
    }

    private void a(String str, Map map) {
        b().Z().e(com.applovin.impl.sdk.network.d.b().d(str).c("POST").a(this.m).a(false).c(map).c(((Boolean) this.f1179a.a(qe.O7)).booleanValue()).a());
    }

    private List f() {
        List list = this.i;
        if (list != null) {
            return list;
        }
        ke keVar = this.j;
        if (keVar != null) {
            return keVar.b(this.h);
        }
        return null;
    }

    private Map e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f1179a.a(qe.O6)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private String b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    private String a(String str, MaxError maxError) {
        int mediatedNetworkErrorCode;
        String mediatedNetworkErrorMessage;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            mediatedNetworkErrorCode = maxAdapterError.getMediatedNetworkErrorCode();
            mediatedNetworkErrorMessage = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            mediatedNetworkErrorCode = 0;
            mediatedNetworkErrorMessage = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(mediatedNetworkErrorCode)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(mediatedNetworkErrorMessage));
    }
}
