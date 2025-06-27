package com.mbridge.msdk.foundation.same.report.d;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.e.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SameMetricsReport.java */
/* loaded from: classes4.dex */
public final class e {
    public final void a(String str, m mVar, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        Map<String, String> mapC;
        HashMap map = new HashMap();
        if (bVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            bVar.a(str);
            if (bVar != null) {
                if (str.equals("2000146")) {
                    bVar.j();
                }
                Map<String, String> mapB = b(str, bVar);
                if (mapB != null) {
                    map.putAll(mapB);
                }
            }
            Map<String, String> mapA = a(str, bVar.i(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            if (Arrays.asList(a.d).contains(str) && (mapC = c(str, bVar)) != null) {
                map.putAll(mapC);
            }
            Map<String, String> mapD = d(str, bVar);
            if (mapD != null) {
                map.putAll(mapD);
            }
            if ((!map.containsKey("lrid") || TextUtils.isEmpty(map.get("lrid"))) && bVar != null) {
                map.put("lrid", bVar.f());
            }
            Map<String, String> mapA2 = a(str, bVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            if (bVar.d() != null && bVar.d().equals("1") && Arrays.asList(a.b).contains(str)) {
                return;
            }
            if (MBridgeConstans.DEBUG) {
                ad.b("MetricsRefactor", "reportkey: " + str + " 详细数据 " + map.toString());
            }
            com.mbridge.msdk.e.e eVarA = a(str, map);
            if (mVar != null && eVarA != null) {
                mVar.a(eVarA);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public final void b(String str, m mVar, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        if (bVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap map = new HashMap();
            bVar.a(str);
            Map<String, String> mapA = a(str, bVar.i(), mVar);
            if (mapA != null) {
                map.putAll(mapA);
            }
            Map<String, String> mapD = d(str, bVar);
            if (mapD != null) {
                map.putAll(mapD);
            }
            Map<String, String> mapA2 = a(str, bVar);
            if (mapA2 != null) {
                map.putAll(mapA2);
            }
            if (MBridgeConstans.DEBUG) {
                ad.b("MetricsRefactor", "reportkey: " + str + " 详细数据 " + map.toString());
            }
            com.mbridge.msdk.e.e eVarA = a(str, map);
            if (mVar != null && eVarA != null) {
                mVar.a(eVarA);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private Map<String, String> a(String str, b bVar) {
        return (bVar == null || TextUtils.isEmpty(str)) ? new HashMap() : bVar.j(str);
    }

    private com.mbridge.msdk.e.e a(String str, Map<String, String> map) throws JSONException {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.e.e eVar = new com.mbridge.msdk.e.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean boolB = com.mbridge.msdk.foundation.same.b.a().b();
            int i = 1;
            if (boolB != null) {
                jSONObject.put("r_v_r", boolB.booleanValue() ? 1 : 0);
            }
            Boolean boolC = com.mbridge.msdk.foundation.same.b.a().c();
            if (boolC != null) {
                if (!boolC.booleanValue()) {
                    i = 0;
                }
                jSONObject.put("n_i_v_r", i);
            }
            eVar.a(jSONObject);
            eVar.a(0);
            eVar.b(0);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[Catch: Exception -> 0x0667, TryCatch #2 {Exception -> 0x0667, blocks: (B:3:0x0019, B:5:0x0025, B:8:0x002c, B:10:0x0038, B:26:0x0073, B:29:0x007c, B:31:0x0082, B:34:0x008d, B:36:0x0093, B:57:0x00e3, B:60:0x00eb, B:61:0x00ef, B:63:0x00f5, B:66:0x00fe, B:68:0x0108, B:70:0x011b, B:71:0x0124, B:73:0x0137, B:75:0x0146, B:76:0x0153, B:79:0x015b, B:81:0x0161, B:83:0x0167, B:86:0x0197, B:88:0x01a1, B:90:0x01a7, B:91:0x01c5, B:92:0x01d0, B:94:0x01d8, B:96:0x01de, B:97:0x01fc, B:98:0x0207, B:100:0x020f, B:102:0x0215, B:103:0x0233, B:104:0x023e, B:106:0x0246, B:108:0x024c, B:109:0x026a, B:110:0x0275, B:113:0x0296, B:115:0x02a0, B:116:0x02a5, B:118:0x02ab, B:120:0x02c9, B:123:0x02d9, B:139:0x0363, B:141:0x036d, B:143:0x037c, B:144:0x039c, B:145:0x03a5, B:148:0x03ae, B:150:0x03b4, B:156:0x03ef, B:160:0x03fa, B:162:0x0410, B:164:0x0435, B:166:0x043b, B:168:0x0460, B:170:0x0464, B:172:0x0476, B:173:0x047b, B:175:0x0485, B:176:0x048e, B:178:0x0494, B:179:0x04a1, B:183:0x04ac, B:185:0x04c4, B:187:0x04cb, B:188:0x04d8, B:190:0x04e2, B:191:0x04eb, B:193:0x04f3, B:195:0x04fa, B:196:0x0507, B:198:0x0511, B:199:0x051a, B:200:0x0527, B:202:0x052f, B:206:0x053b, B:209:0x0549, B:211:0x056b, B:215:0x0574, B:216:0x057b, B:218:0x0583, B:222:0x058c, B:223:0x0593, B:225:0x059f, B:254:0x062c, B:230:0x05ad, B:232:0x05b9, B:234:0x05c3, B:240:0x05de, B:242:0x05ee, B:245:0x05f5, B:241:0x05e7, B:235:0x05ce, B:237:0x05d4, B:246:0x05fd, B:248:0x060d, B:250:0x061e, B:253:0x0625, B:249:0x0616, B:167:0x0459, B:163:0x042e, B:151:0x03cb, B:152:0x03cf, B:154:0x03d5, B:155:0x03ec, B:124:0x02f1, B:126:0x030a, B:127:0x030e, B:119:0x02c4, B:128:0x0312, B:130:0x031e, B:131:0x0323, B:133:0x0329, B:135:0x0343, B:137:0x0349, B:138:0x0360, B:134:0x0340, B:84:0x0187, B:72:0x012e, B:256:0x0662, B:32:0x0087, B:38:0x0099, B:41:0x00a5, B:43:0x00ad, B:46:0x00b8, B:48:0x00be, B:49:0x00c2, B:51:0x00c8, B:52:0x00d0, B:53:0x00d4, B:55:0x00da, B:44:0x00b2, B:19:0x0053, B:12:0x003e, B:14:0x0044), top: B:268:0x0019, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.String> b(java.lang.String r22, com.mbridge.msdk.foundation.same.report.d.b r23) {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.d.e.b(java.lang.String, com.mbridge.msdk.foundation.same.report.d.b):java.util.Map");
    }

    private Map<String, String> a(String str, String str2, m mVar) throws JSONException {
        d dVar = new d();
        try {
            g gVarB = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (gVarB == null) {
                h.a();
                gVarB = i.a();
            }
            if (!TextUtils.isEmpty(gVarB.am())) {
                dVar.a("as_rid", gVarB.am());
            }
            String strN = gVarB.N();
            JSONArray jSONArrayM = gVarB.M();
            if (jSONArrayM != null) {
                int i = 0;
                while (true) {
                    if (i >= jSONArrayM.length()) {
                        break;
                    }
                    if (str.equals(jSONArrayM.getString(i))) {
                        strN = "1.0";
                        break;
                    }
                    i++;
                }
            }
            if (!TextUtils.isEmpty(strN)) {
                dVar.a("log_rate", strN);
            } else {
                dVar.a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                k kVarC = h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
                if (kVarC != null && !TextUtils.isEmpty(kVarC.s())) {
                    dVar.a("us_rid", kVarC.s());
                }
                if (kVarC != null && !TextUtils.isEmpty(kVarC.a())) {
                    dVar.a("u_stid", kVarC.a());
                }
                d dVarA = c.a().a(str2);
                if (dVarA != null) {
                    if (mVar != null && mVar.f() != null) {
                        try {
                            mVar.f().put("r_stid", dVarA.b("r_stid"));
                            dVarA.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    dVar.a(dVarA);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return dVar.a();
    }

    private Map<String, String> c(String str, b bVar) {
        d dVar = new d();
        try {
            if (str.equals("2000125")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000123")));
            } else if (str.equals("2000126")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000125")));
            } else if (str.equals("2000127")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000123")));
            } else if (str.equals("2000154")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000126")));
            } else if (str.equals("2000047") || str.equals("2000048")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000123")));
            } else if (str.equals("2000155")) {
                dVar.a("duration", Long.valueOf(bVar.l("2000154")));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return dVar.a();
    }

    private List<CampaignEx> a(b bVar, String str) throws NumberFormatException {
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            try {
                String str2 = bVar.f() + str;
                Map<String, Map<String, String>> mapP = bVar.p();
                int i = -1;
                if (mapP != null && mapP.containsKey(str2)) {
                    try {
                        Object obj = mapP.get(str2).get("resource_type");
                        if (obj instanceof String) {
                            iIntValue = Integer.parseInt((String) obj);
                        } else if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        }
                        i = iIntValue;
                    } catch (NumberFormatException e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
                if (i == 1) {
                    List<CampaignEx> listH = bVar.h() != null ? bVar.h() : bVar.e();
                    if (listH != null && listH.size() > 0) {
                        arrayList.addAll(listH);
                    }
                } else if (bVar.g() != null) {
                    arrayList.add(bVar.g());
                } else {
                    List<CampaignEx> listH2 = bVar.h() != null ? bVar.h() : bVar.e();
                    if (listH2 != null && listH2.size() > 0) {
                        arrayList.addAll(listH2);
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    private Map<String, String> d(String str, b bVar) {
        HashMap map = new HashMap();
        try {
            if (Arrays.asList(a.e).contains(str)) {
                map.put("auto_load", bVar != null ? bVar.d() : "");
            }
            if (bVar != null) {
                Map<String, Map<String, String>> mapP = bVar.p();
                String str2 = bVar.f() + str;
                if (mapP.containsKey(str2) && mapP.get(str2) != null) {
                    map.putAll(mapP.get(str2));
                }
                try {
                    Map<String, Map<String, String>> mapQ = bVar.q();
                    String str3 = bVar.f() + "_" + bVar.b() + "_" + str;
                    if (mapQ.containsKey(str3) && mapQ.get(str3) != null) {
                        map.putAll(mapQ.get(str3));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return map;
    }
}
