package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class BillingResultBridge extends GenericBridge {
    private static final String getResponseCodeMethodName = "getResponseCode";
    private final Object _billingResult;

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.BillingResult";
    }

    public BillingResultBridge(Object obj) {
        super(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.BillingResultBridge.1
            {
                put(BillingResultBridge.getResponseCodeMethodName, new Class[0]);
            }
        });
        this._billingResult = obj;
    }

    public BillingResultResponseCode getResponseCode() {
        return BillingResultResponseCode.fromResponseCode(((Integer) callNonVoidMethod(getResponseCodeMethodName, this._billingResult, new Object[0])).intValue());
    }
}
