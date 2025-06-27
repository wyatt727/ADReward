package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapClient;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.iap.entity.ProductInfo;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    final IapClient f4211a;
    final Context b;
    final c c;
    Set<d> d;

    /* renamed from: com.my.tracker.obfuscated.b$b, reason: collision with other inner class name */
    public static final class C0312b {

        /* renamed from: a, reason: collision with root package name */
        final IapClient f4212a;
        final Context b;

        C0312b(IapClient iapClient, Context context) {
            this.f4212a = iapClient;
            this.b = context;
        }

        public b a(c cVar) {
            return new b(this.f4212a, cVar, this.b);
        }
    }

    public interface c {
        void b(List<com.my.tracker.obfuscated.d> list);

        void c(List<com.my.tracker.obfuscated.d> list);
    }

    final class d implements OnSuccessListener<OwnedPurchasesResult> {

        /* renamed from: a, reason: collision with root package name */
        final int f4213a;
        final int b;
        final List<String> c = Collections.synchronizedList(new ArrayList());
        final List<String> d = Collections.synchronizedList(new ArrayList());
        String e;

        public d(int i, int i2) {
            this.f4213a = i;
            this.b = i2;
            z0.a("OwnedPurchaseLoader: loader created");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(OwnedPurchasesResult ownedPurchasesResult) {
            this.c.addAll(ownedPurchasesResult.getInAppPurchaseDataList());
            this.d.addAll(ownedPurchasesResult.getInAppSignature());
            String continuationToken = ownedPurchasesResult.getContinuationToken();
            if (!TextUtils.isEmpty(continuationToken)) {
                z0.a("OwnedPurchaseLoader: loading more obtainOwnedPurchasesRecord by continuationToken");
                b(continuationToken);
                return;
            }
            if (this.c.isEmpty()) {
                z0.a("OwnedPurchaseLoader: failure load obtain owned purchases. Purchases is null. source is " + this.b + " priceType is " + this.f4213a);
                b.this.b(this);
                return;
            }
            if (!this.d.isEmpty()) {
                this.e = ownedPurchasesResult.getSignatureAlgorithm();
                b.this.a(this);
                return;
            }
            z0.a("OwnedPurchaseLoader: failure load obtain owned purchases. Signatures is null. source is " + this.b + " priceType is " + this.f4213a);
            b.this.b(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Exception exc) {
            z0.a("AppGalleryHelper: onLoadingPurchasesFailure ", exc);
            b.this.b(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            Task taskObtainOwnedPurchaseRecord;
            z0.a("OwnedPurchaseLoader: start loadPurchases");
            OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
            ownedPurchasesReq.setPriceType(this.f4213a);
            ownedPurchasesReq.setContinuationToken(str);
            int i = this.b;
            if (i == 2) {
                taskObtainOwnedPurchaseRecord = b.this.f4211a.obtainOwnedPurchases(ownedPurchasesReq);
            } else {
                if (i != 3) {
                    z0.a("OwnedPurchaseLoader: invalid source to load purchases");
                    b.this.b(this);
                    return;
                }
                taskObtainOwnedPurchaseRecord = b.this.f4211a.obtainOwnedPurchaseRecord(ownedPurchasesReq);
            }
            taskObtainOwnedPurchaseRecord.addOnFailureListener(new OnFailureListener() { // from class: com.my.tracker.obfuscated.b$d$$ExternalSyntheticLambda0
                public final void onFailure(Exception exc) {
                    this.f$0.a(exc);
                }
            });
            taskObtainOwnedPurchaseRecord.addOnSuccessListener(this);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final OwnedPurchasesResult ownedPurchasesResult) {
            g.a(new Runnable() { // from class: com.my.tracker.obfuscated.b$d$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(ownedPurchasesResult);
                }
            });
        }

        void b(final String str) {
            g.c(new Runnable() { // from class: com.my.tracker.obfuscated.b$d$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(str);
                }
            });
        }
    }

    private b(IapClient iapClient, c cVar, Context context) {
        this.f4211a = iapClient;
        this.c = cVar;
        this.b = context;
        z0.a("AppGalleryHelper AppGalleryHelper created");
    }

    public static C0312b a(Context context) {
        try {
            return new C0312b(Iap.getIapClient(context), context);
        } catch (Throwable th) {
            z0.b("AppGalleryHelper: creating AppGalleryHelperBuilder failed", th);
            return null;
        }
    }

    static ArrayList<com.my.tracker.obfuscated.d> a(List<String> list, List<String> list2, String str, int i) {
        ArrayList<com.my.tracker.obfuscated.d> arrayList = new ArrayList<>();
        long jA = y0.a();
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.my.tracker.obfuscated.d dVarA = com.my.tracker.obfuscated.d.a(list.get(i2), list2.get(i2), str, i, jA);
            if (dVarA == null) {
                z0.a("AppGalleryHelper: failed to create AppGalleryRawPurchase");
            } else {
                arrayList.add(dVarA);
            }
        }
        return arrayList;
    }

    public static JSONObject a(Object obj) {
        z0.a("AppGalleryHelper: start parseProductInfoToJson");
        try {
            ProductInfo productInfo = (ProductInfo) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, productInfo.getProductId());
            jSONObject.put("productName", productInfo.getProductName());
            jSONObject.put("productDesc", productInfo.getProductDesc());
            jSONObject.put("currency", productInfo.getCurrency());
            jSONObject.put("price", productInfo.getPrice());
            jSONObject.put("microsPrice", productInfo.getMicrosPrice());
            jSONObject.put("priceType", productInfo.getPriceType());
            jSONObject.put("originalMicroPrice", productInfo.getOriginalMicroPrice());
            jSONObject.put("originalLocalPrice", productInfo.getOriginalLocalPrice());
            jSONObject.put("subPeriod", productInfo.getSubPeriod());
            jSONObject.put("subSpecialPrice", productInfo.getSubSpecialPrice());
            jSONObject.put("subSpecialPriceMicros", productInfo.getSubSpecialPriceMicros());
            jSONObject.put("subSpecialPeriod", productInfo.getSubSpecialPeriod());
            jSONObject.put("subSpecialPeriodCycles", productInfo.getSubSpecialPeriodCycles());
            jSONObject.put("subFreeTrialPeriod", productInfo.getSubFreeTrialPeriod());
            jSONObject.put("subGroupId", productInfo.getSubGroupId());
            jSONObject.put("subGroupTitle", productInfo.getSubGroupTitle());
            jSONObject.put("subProductLevel", productInfo.getSubProductLevel());
            jSONObject.put("status", productInfo.getStatus());
            return jSONObject;
        } catch (NoClassDefFoundError e) {
            z0.b("AppGalleryHelper: ", e);
            return null;
        } catch (Throwable th) {
            z0.b("AppGalleryHelper: ", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoReq productInfoReq, final List list) {
        Task taskObtainProductInfo = this.f4211a.obtainProductInfo(productInfoReq);
        taskObtainProductInfo.addOnFailureListener(new OnFailureListener() { // from class: com.my.tracker.obfuscated.b$$ExternalSyntheticLambda0
            public final void onFailure(Exception exc) {
                this.f$0.a(list, exc);
            }
        });
        taskObtainProductInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.my.tracker.obfuscated.b$$ExternalSyntheticLambda1
            public final void onSuccess(Object obj) {
                this.f$0.a(list, (ProductInfoResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoResult productInfoResult, List list) {
        List productInfoList = productInfoResult.getProductInfoList();
        if (productInfoList == null) {
            z0.a("AppGalleryHelper: productInfoList is null, finish products loading");
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = productInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(a((ProductInfo) it.next()));
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.my.tracker.obfuscated.d dVar = (com.my.tracker.obfuscated.d) it2.next();
                dVar.a(a(arrayList, dVar.c()));
            }
        }
        this.c.c(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Exception exc, List list) {
        z0.a("AppGalleryHelper: error while loading products ", exc);
        this.c.c(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final List list, final ProductInfoResult productInfoResult) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.b$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(productInfoResult, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final List list, final Exception exc) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.b$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(exc, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Intent intent) {
        PurchaseResultInfo purchaseResultInfoFromIntent = this.f4211a.parsePurchaseResultInfoFromIntent(intent);
        int returnCode = purchaseResultInfoFromIntent.getReturnCode();
        if (returnCode == 0) {
            this.c.b(Collections.singletonList(com.my.tracker.obfuscated.d.a(purchaseResultInfoFromIntent.getInAppPurchaseData(), purchaseResultInfoFromIntent.getInAppDataSignature(), purchaseResultInfoFromIntent.getSignatureAlgorithm(), 1, y0.a())));
        } else {
            z0.b("AppGalleryHelper error: can not getting PurchaseResultInfo. resultCode " + returnCode);
        }
    }

    JSONObject a(List<JSONObject> list, String str) {
        String str2;
        if (str == null) {
            str2 = "AppGalleryHelper: can't get product by id, id is null";
        } else {
            if (list != null) {
                for (JSONObject jSONObject : list) {
                    try {
                    } catch (Throwable th) {
                        z0.a("AppGalleryHelper: error while reading product_id", th);
                    }
                    if (jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID).equals(str)) {
                        return jSONObject;
                    }
                }
                return null;
            }
            str2 = "AppGalleryHelper: can't get product by id, productInfoListJson is null";
        }
        z0.a(str2);
        return null;
    }

    public void a() {
        HashSet hashSet = new HashSet();
        hashSet.add(new d(0, 2));
        hashSet.add(new d(1, 2));
        hashSet.add(new d(2, 2));
        hashSet.add(new d(0, 3));
        hashSet.add(new d(2, 3));
        this.d = Collections.synchronizedSet(hashSet);
        z0.a("AppGalleryHelper: purchase loaders created");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((d) it.next()).b((String) null);
        }
    }

    public void a(final Intent intent) {
        z0.a("AppGalleryHelper: starting getAppGalleryPurchaseByIntent");
        g.c(new Runnable() { // from class: com.my.tracker.obfuscated.b$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(intent);
            }
        });
    }

    void a(d dVar) {
        this.c.b(a(dVar.c, dVar.d, dVar.e, dVar.b));
        b(dVar);
    }

    public void a(List<com.my.tracker.obfuscated.d> list) {
        z0.a("AppGalleryHelper: start loading all products");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (com.my.tracker.obfuscated.d dVar : list) {
            try {
                int i = dVar.e().getInt("kind");
                if (i == 0) {
                    arrayList.add(dVar);
                } else if (i == 1) {
                    arrayList2.add(dVar);
                } else if (i == 2) {
                    arrayList3.add(dVar);
                }
            } catch (Throwable th) {
                z0.b("AppGalleryHelper: can not getting price type ", th);
            }
        }
        if (arrayList.size() > 0) {
            a(arrayList, 0);
        }
        if (arrayList2.size() > 0) {
            a(arrayList2, 1);
        }
        if (arrayList3.size() > 0) {
            a(arrayList3, 2);
        }
    }

    void a(List<com.my.tracker.obfuscated.d> list, int i) {
        z0.a("AppGalleryHelper: start loading products by price");
        HashSet hashSet = new HashSet();
        final ArrayList arrayList = new ArrayList();
        Iterator<com.my.tracker.obfuscated.d> it = list.iterator();
        while (it.hasNext() && hashSet.size() < 200) {
            com.my.tracker.obfuscated.d next = it.next();
            hashSet.add(next.c());
            arrayList.add(next);
            it.remove();
        }
        z0.a("AppGalleryHelper: product id's have been detected");
        while (it.hasNext()) {
            com.my.tracker.obfuscated.d next2 = it.next();
            if (hashSet.contains(next2.c())) {
                arrayList.add(next2);
                it.remove();
            }
        }
        z0.a("AppGalleryHelper: products deduplication done");
        if (list.size() > 0) {
            z0.a("AppGalleryHelper: there are still unloaded products, we are loading more");
            a(list, i);
        }
        final ProductInfoReq productInfoReq = new ProductInfoReq();
        productInfoReq.setPriceType(i);
        productInfoReq.setProductIds(new ArrayList(hashSet));
        g.c(new Runnable() { // from class: com.my.tracker.obfuscated.b$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(productInfoReq, arrayList);
            }
        });
    }

    void b(d dVar) {
        Set<d> set = this.d;
        if (set == null) {
            z0.a("AppGalleryHelper: can't remove OwnedPurchaseLoader, purchaseLoaders list is null");
            return;
        }
        set.remove(dVar);
        if (set.isEmpty()) {
            this.d = null;
        }
    }
}
