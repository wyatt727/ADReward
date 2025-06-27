package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.h;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: AbandonChannelClenUtils.java */
/* loaded from: classes2.dex */
public final class a {
    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, final com.bykv.vk.openvk.preload.geckox.e.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        Iterator<Map.Entry<String, ComponentModel.b>> it;
        Iterator<ComponentModel.a> it2;
        List<Long> listB;
        File file2;
        Iterator<Long> it3;
        List<Long> listB2;
        Iterator<Map.Entry<String, ComponentModel.b>> it4;
        Iterator<ComponentModel.a> it5;
        String str;
        List<Long> list;
        File file3;
        int i;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator<Map.Entry<String, ComponentModel.b>> it6 = map.entrySet().iterator();
            while (it6.hasNext()) {
                Map.Entry<String, ComponentModel.b> next = it6.next();
                String key = next.getKey();
                File file4 = new File(file, key);
                if (file4.isDirectory() && (value = next.getValue()) != null && value.f1426a != null && !value.f1426a.isEmpty()) {
                    List<ComponentModel.a> list2 = value.f1426a;
                    HashSet hashSet = new HashSet();
                    Iterator<ComponentModel.a> it7 = list2.iterator();
                    while (it7.hasNext()) {
                        ComponentModel.a next2 = it7.next();
                        String str2 = next2.f1425a;
                        if (!hashSet.contains(str2)) {
                            hashSet.add(str2);
                            int i2 = next2.b;
                            List<Long> list3 = next2.c;
                            File file5 = new File(file4, str2);
                            String str3 = "--pending-delete";
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 == 3) {
                                        File file6 = new File(file4, str2);
                                        File file7 = new File(file4, str2 + "--pending-delete");
                                        file6.renameTo(file7);
                                        arrayList2.add(new C0068a(key, str2, i2, 0L, file7));
                                    }
                                } else if (list3 != null && (listB2 = j.b(file5)) != null && !listB2.isEmpty()) {
                                    for (Long l : listB2) {
                                        if (list3.get(0).longValue() > l.longValue()) {
                                            File file8 = new File(file5, l + str3);
                                            new File(file5, String.valueOf(l)).renameTo(file8);
                                            it4 = it6;
                                            str = str3;
                                            it5 = it7;
                                            list = list3;
                                            file3 = file5;
                                            i = i2;
                                            arrayList2.add(new C0068a(key, str2, i2, l.longValue(), file8));
                                        } else {
                                            it4 = it6;
                                            it5 = it7;
                                            str = str3;
                                            list = list3;
                                            file3 = file5;
                                            i = i2;
                                        }
                                        str3 = str;
                                        list3 = list;
                                        i2 = i;
                                        it7 = it5;
                                        file5 = file3;
                                        it6 = it4;
                                    }
                                }
                                it = it6;
                                it2 = it7;
                            } else {
                                it = it6;
                                it2 = it7;
                                File file9 = file5;
                                if (list3 != null && (listB = j.b(file9)) != null && !listB.isEmpty()) {
                                    Iterator<Long> it8 = listB.iterator();
                                    while (it8.hasNext()) {
                                        Long next3 = it8.next();
                                        if (list3.contains(next3)) {
                                            File file10 = file9;
                                            File file11 = new File(file10, next3 + "--pending-delete");
                                            new File(file10, String.valueOf(next3)).renameTo(file11);
                                            it3 = it8;
                                            file2 = file10;
                                            arrayList2.add(new C0068a(key, str2, i2, next3.longValue(), file11));
                                        } else {
                                            file2 = file9;
                                            it3 = it8;
                                        }
                                        it8 = it3;
                                        file9 = file2;
                                    }
                                }
                            }
                            it6 = it;
                            it7 = it2;
                        }
                    }
                }
            }
            arrayList = arrayList2;
        } catch (Exception e) {
            e.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        e.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0068a> list4 = arrayList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (C0068a c0068a : list4) {
                            File file12 = c0068a.e;
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            boolean zA = com.bykv.vk.openvk.preload.geckox.utils.c.a(file12);
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            if (zA) {
                                b.a(context2).a(c0068a.f1388a, c0068a.b, c0068a.c, 200, c0068a.d, 0, null, jUptimeMillis2 - jUptimeMillis);
                            } else {
                                b.a(context2).a(c0068a.f1388a, c0068a.b, c0068a.c, 201, c0068a.d, 601, "delete failed", jUptimeMillis2 - jUptimeMillis);
                            }
                        }
                    }
                } catch (Exception e2) {
                    GeckoLogger.w("clean-channel", "", e2);
                }
            }
        });
    }

    /* compiled from: AbandonChannelClenUtils.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    static class C0068a {

        /* renamed from: a, reason: collision with root package name */
        String f1388a;
        String b;
        int c;
        long d;
        File e;

        C0068a(String str, String str2, int i, long j, File file) {
            this.f1388a = str;
            this.b = str2;
            this.c = i;
            this.d = j;
            this.e = file;
        }
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.q) {
            Common common = new Common(bVar.j.longValue(), bVar.k, bVar.l, com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.f1395a), h.a(bVar.f1395a), bVar.o, bVar.n);
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.f1395a).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = "https://" + bVar.m + "/gecko/server/packages/stats";
            try {
                Response responseDoPost = bVar.f.doPost(str, com.bykv.vk.openvk.preload.geckox.c.b.a().f1405a.a(statisticModel));
                if (responseDoPost.code != 200) {
                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                }
                if (new JSONObject(responseDoPost.body).getInt("status") != 0) {
                    throw new RuntimeException("upload failed");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
