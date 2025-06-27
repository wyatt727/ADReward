package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: com.unity3d.player.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1524i implements InterfaceC1535t {
    private static C1524i d;

    /* renamed from: a, reason: collision with root package name */
    private AssetPackManager f4399a;
    private HashSet b;
    private Object c;

    private C1524i(Context context) {
        if (d != null) {
            throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        }
        this.f4399a = AssetPackManagerFactory.getInstance(context);
        this.b = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(Throwable th) {
        while (!(th instanceof AssetPackException)) {
            th = th.getCause();
            if (th == null) {
                return -100;
            }
        }
        return ((AssetPackException) th).getErrorCode();
    }

    public static InterfaceC1535t a(Context context) {
        if (d == null) {
            d = new C1524i(context);
        }
        return d;
    }

    public Object a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        C1518c c1518c = new C1518c(this, iAssetPackManagerDownloadStatusCallback, Looper.myLooper());
        this.f4399a.registerListener(c1518c);
        return c1518c;
    }

    public String a(String str) {
        AssetPackLocation packLocation = this.f4399a.getPackLocation(str);
        return packLocation == null ? "" : packLocation.assetsPath();
    }

    public void a(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.f4399a.showCellularDataConfirmation(activity).addOnSuccessListener(new C1520e(iAssetPackManagerMobileDataConfirmationCallback));
    }

    public void a(Object obj) {
        if (obj instanceof C1518c) {
            this.f4399a.unregisterListener((C1518c) obj);
        }
    }

    public void a(String[] strArr) {
        this.f4399a.cancel(Arrays.asList(strArr));
    }

    public void a(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        for (String str : strArr) {
            this.f4399a.getPackStates(Collections.singletonList(str)).addOnCompleteListener(new C1521f(iAssetPackManagerDownloadStatusCallback, str));
        }
    }

    public void a(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        this.f4399a.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C1523h(iAssetPackManagerStatusQueryCallback, strArr));
    }

    public void b(String str) {
        this.f4399a.removePack(str);
    }
}
