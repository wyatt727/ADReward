package com.mbridge.msdk.newreward.function.c.a;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.function.c.b.a.g;
import com.mbridge.msdk.newreward.function.c.b.a.i;
import com.mbridge.msdk.newreward.function.c.b.a.l;
import com.mbridge.msdk.newreward.function.c.b.c;
import com.mbridge.msdk.newreward.function.c.d;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: HandlerLoadCommand.java */
/* loaded from: classes4.dex */
public final class a extends com.mbridge.msdk.newreward.function.c.a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Object> f3306a = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.mbridge.msdk.newreward.function.c.a
    public final d a(com.mbridge.msdk.newreward.function.c.b bVar) {
        List<CampaignEx> listA;
        com.mbridge.msdk.newreward.function.f.a aVarX;
        d dVar = new d();
        switch (AnonymousClass1.f3307a[bVar.a().ordinal()]) {
            case 1:
                dVar.a(((e) bVar.b()).x().c());
                return dVar;
            case 2:
                Map map = (Map) bVar.b();
                try {
                    ((e) map.get("adapter_model")).x().b((com.mbridge.msdk.newreward.function.d.a.b) map.get(FirebaseAnalytics.Param.CAMPAIGN));
                    dVar.a(true);
                } catch (MBridgeError e) {
                    dVar.a(false);
                    dVar.a(e);
                }
                return dVar;
            case 3:
                Map map2 = (Map) bVar.b();
                ((e) map2.get("adapter_model")).x().c((com.mbridge.msdk.newreward.function.d.a.b) map2.get(FirebaseAnalytics.Param.CAMPAIGN));
                return dVar;
            case 4:
                a(bVar, dVar, TypedValues.CycleType.S_WAVE_OFFSET);
                return dVar;
            case 5:
                a(bVar, dVar, "daily");
                return dVar;
            case 6:
                a(bVar, dVar, "bridge_ids");
                return dVar;
            case 7:
                new i().a(bVar);
                return dVar;
            case 8:
                g gVar = (g) c.a().b(com.mbridge.msdk.newreward.function.c.e.CHECK_IS_REQUEST_CONTROL);
                if (gVar != null && bVar != null) {
                    try {
                        dVar.a(gVar.a(bVar.b()));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                return dVar;
            case 9:
                if (((l) c.a().b(com.mbridge.msdk.newreward.function.c.e.UPDATE_CAM_TOKEN_RULE)) != null && bVar != null) {
                    try {
                        Object objB = bVar.b();
                        Map map3 = null;
                        Map map4 = objB instanceof Map ? (Map) objB : null;
                        if (map4 != null) {
                            e eVar = (e) map4.get("adapter_model");
                            com.mbridge.msdk.newreward.function.f.a aVarX2 = ((e) map4.get("queue_first_adapter_model")).x();
                            if (aVarX2 != null && (listA = aVarX2.a()) != null && listA.size() != 0) {
                                String encryptPrice = listA.get(0).getEncryptPrice();
                                if (!TextUtils.isEmpty(encryptPrice) && (aVarX = eVar.x()) != null && aVarX.a() != null && aVarX.a().size() != 0) {
                                    List<CampaignEx> listA2 = eVar.x().a();
                                    HashMap map5 = new HashMap();
                                    map5.put("encrypt_p=", "encrypt_p=" + encryptPrice);
                                    map5.put("irlfa=", "irlfa=1");
                                    for (CampaignEx campaignEx : listA2) {
                                        for (Map.Entry entry : map5.entrySet()) {
                                            String str = (String) entry.getKey();
                                            String str2 = (String) entry.getValue();
                                            if (campaignEx != null) {
                                                campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str, str2));
                                                campaignEx.setOnlyImpressionURL(campaignEx.getOnlyImpressionURL().replaceAll(str, str2));
                                            }
                                        }
                                    }
                                    map3 = map4;
                                }
                            }
                        }
                        dVar.a(map3);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                return dVar;
            case 10:
                ((com.mbridge.msdk.newreward.function.c.b.a.c) c.a().b(com.mbridge.msdk.newreward.function.c.e.START_LOAD_CHECK)).a(bVar.b());
                return dVar;
            case 11:
                dVar.a(((com.mbridge.msdk.newreward.function.c.b.a.a) c.a().b(com.mbridge.msdk.newreward.function.c.e.CANDIDATE_LOAD_ACTION)).a(bVar.b()));
                return dVar;
            default:
                return dVar;
        }
    }

    private void a(com.mbridge.msdk.newreward.function.c.b bVar, d dVar, String str) {
        if (bVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.b.a.b bVar2 = new com.mbridge.msdk.newreward.function.c.b.a.b();
        Map map = (Map) bVar.b();
        if (map == null) {
            map = new HashMap();
        }
        map.put("obj_map", this.f3306a);
        map.put("result", dVar);
        map.put("type", str);
        bVar2.a(map);
    }

    @Override // com.mbridge.msdk.newreward.function.c.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        e eVar = bVar.b() instanceof e ? (e) bVar.b() : null;
        switch (bVar.a()) {
            case REQ_SETTING:
                if (eVar == null) {
                    new com.mbridge.msdk.newreward.function.f.e().a(com.mbridge.msdk.newreward.function.g.b.a().a(bVar, bVar.a()), bVar2);
                    break;
                } else {
                    eVar.r().a(com.mbridge.msdk.newreward.function.g.b.a().a(bVar, bVar.a()), bVar2);
                    break;
                }
            case REQ_CAMPAIGN:
                e eVar2 = (e) ((Map) bVar.b()).get("adapter_model");
                eVar2.x().a(eVar2, com.mbridge.msdk.newreward.function.g.b.a().a(bVar.b(), bVar.a()), bVar2);
                break;
            case REQ_DOWN_CAMPAIGN:
                Map<? extends String, ? extends Object> map = (Map) bVar.b();
                e eVar3 = (e) map.get("adapter_model");
                com.mbridge.msdk.newreward.function.d.a.b bVar3 = (com.mbridge.msdk.newreward.function.d.a.b) map.get(FirebaseAnalytics.Param.CAMPAIGN);
                bVar3.F().putAll(map);
                eVar3.y().a(bVar3, bVar2);
                break;
            case RESTORE_DB:
                c.a().a(com.mbridge.msdk.newreward.function.c.e.RESTORE_DB).a(bVar, bVar2);
                break;
            case SMART_LOAD:
                bVar.b();
                c.a().a(com.mbridge.msdk.newreward.function.c.e.SMART_LOAD).a(bVar, bVar2);
                break;
            case NORMAL_LOAD:
                com.mbridge.msdk.newreward.function.c.b.a.d dVar = (com.mbridge.msdk.newreward.function.c.b.a.d) c.a().a(com.mbridge.msdk.newreward.function.c.e.NORMAL_LOAD);
                dVar.a(this);
                dVar.a(bVar, bVar2);
                break;
            case PRE_HANDLE_LOAD:
                c.a().a(com.mbridge.msdk.newreward.function.c.e.PRE_HANDLE_LOAD).a(bVar, bVar2);
                break;
            case UNIT_INIT:
                c.a().a(com.mbridge.msdk.newreward.function.c.e.UNIT_INIT).a(bVar, bVar2);
                break;
        }
    }
}
