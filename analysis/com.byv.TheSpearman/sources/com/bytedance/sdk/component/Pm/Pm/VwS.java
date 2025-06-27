package com.bytedance.sdk.component.Pm.Pm;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: DuplicateRequestCheckVisitor.java */
/* loaded from: classes2.dex */
public class VwS extends EYQ {
    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public String EYQ() {
        return "check_duplicate";
    }

    @Override // com.bytedance.sdk.component.Pm.Pm.HX
    public void EYQ(com.bytedance.sdk.component.Pm.Td.Td td) {
        List<com.bytedance.sdk.component.Pm.Td.Td> linkedList;
        String strNZ = td.NZ();
        Map<String, List<com.bytedance.sdk.component.Pm.Td.Td>> mapVwS = td.hYh().VwS();
        synchronized (mapVwS) {
            linkedList = mapVwS.get(strNZ);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
        }
        synchronized (linkedList) {
            linkedList.add(td);
            mapVwS.put(strNZ, linkedList);
            if (linkedList.size() <= 1) {
                td.EYQ(new Pm());
            }
        }
    }
}
