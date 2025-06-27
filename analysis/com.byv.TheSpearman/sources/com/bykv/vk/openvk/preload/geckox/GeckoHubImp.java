package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.a.a.a;
import com.bykv.vk.openvk.preload.geckox.b;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bykv.vk.openvk.preload.geckox.utils.f;
import com.my.target.ads.Reward;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public class GeckoHubImp {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static GeckoHubImp f1384a = new GeckoHubImp();
    }

    public static GeckoHubImp inst(Context context) {
        c.a(context);
        return a.f1384a;
    }

    private GeckoHubImp() {
    }

    public static void setRandomHost(String str) {
        c.a(str);
    }

    public void preload(String str, IStatisticMonitor iStatisticMonitor, Set<String> set, INetWork iNetWork) {
        c cVarA = c.a();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b.a aVar = new b.a(c.b);
        aVar.b = Arrays.asList("cca47107bfcbdb211d88f3385aeede40");
        aVar.c = Arrays.asList("cca47107bfcbdb211d88f3385aeede40");
        aVar.k = 38L;
        aVar.m = str;
        aVar.l = "9999999.0.0";
        a.C0069a c0069a = new a.C0069a();
        c0069a.f1390a = 20;
        com.bykv.vk.openvk.preload.geckox.a.a.b bVar = com.bykv.vk.openvk.preload.geckox.a.a.b.c;
        if (bVar == null) {
            bVar = com.bykv.vk.openvk.preload.geckox.a.a.b.f1391a;
        }
        c0069a.b = bVar;
        aVar.j = new com.bykv.vk.openvk.preload.geckox.a.a.a(c0069a, (byte) 0);
        aVar.o = c.f1402a;
        aVar.i = false;
        aVar.n = c.c;
        aVar.f = b.a();
        aVar.e = b.a();
        aVar.h = iStatisticMonitor;
        aVar.f1398a = iNetWork;
        b bVar2 = new b(aVar, (byte) 0);
        cVarA.d = iNetWork;
        List<String> list = bVar2.g;
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        Context context = bVar2.f1395a;
        if (context != null) {
            f.f1439a = context;
        }
        com.bykv.vk.openvk.preload.geckox.a aVar2 = new com.bykv.vk.openvk.preload.geckox.a(bVar2);
        HashMap map = new HashMap();
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            linkedList.add(new CheckRequestBodyModel.TargetChannel(it.next()));
        }
        map.put("cca47107bfcbdb211d88f3385aeede40", linkedList);
        if (TextUtils.isEmpty(Reward.DEFAULT)) {
            throw new IllegalArgumentException("groupType == null");
        }
        if (!aVar2.a()) {
            throw new IllegalArgumentException("deployments keys not in local keys");
        }
        if (!aVar2.a(map)) {
            throw new IllegalArgumentException("target keys not in deployments keys");
        }
        aVar2.c.c.execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1

            /* renamed from: a */
            final /* synthetic */ String f1386a;
            final /* synthetic */ com.bykv.vk.openvk.preload.geckox.e.a b = null;
            final /* synthetic */ Map c = null;
            final /* synthetic */ Map d;

            AnonymousClass1(String str2, Map map2) {
                str = str2;
                map = map2;
            }

            /* JADX WARN: Removed duplicated region for block: B:182:0x0648  */
            /* JADX WARN: Removed duplicated region for block: B:187:0x0686 A[Catch: all -> 0x069f, TryCatch #16 {all -> 0x069f, blocks: (B:185:0x0676, B:187:0x0686, B:189:0x0690, B:191:0x069a), top: B:205:0x0676 }] */
            /* JADX WARN: Removed duplicated region for block: B:196:0x06a5  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 1729
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.a.AnonymousClass1.run():void");
            }
        });
    }

    public com.bykv.vk.openvk.preload.falconx.loader.a getGeckoResLoader() {
        c.a();
        return c.b();
    }

    public void releaseGeckoResLoader(ILoader iLoader) {
        c.a();
        c.a(iLoader);
    }

    public WebResourceResponseModel findResAndMsg(ILoader iLoader, String str, String str2) {
        return c.a().a(iLoader, str, str2);
    }

    public WebResourceResponse findRes(ILoader iLoader, String str, String str2) {
        return c.a().a(iLoader, str, str2).getWebResourceResponse();
    }

    public int getResCount(ILoader iLoader, String str) {
        c.a();
        return c.a(iLoader, str);
    }

    public static void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        b.a(threadPoolExecutor);
    }
}
