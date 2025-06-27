package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.h;
import com.json.i5;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: UploadStatistic.java */
/* loaded from: classes2.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        StatisticModel statisticModelB = b(bVar, aVar);
        if (statisticModelB == null || statisticModelB.packages == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitor = bVar.e;
        if (iStatisticMonitor != null) {
            try {
                Iterator<StatisticModel.PackageStatisticModel> it = statisticModelB.packages.iterator();
                while (it.hasNext()) {
                    iStatisticMonitor.upload("geckosdk_update_stats", a(it.next(), statisticModelB.common));
                }
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
        if (bVar.q) {
            try {
                String strA = com.bykv.vk.openvk.preload.geckox.c.b.a().f1405a.a(statisticModelB);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                a(bVar, strA);
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, final String str) {
        final String str2 = "https://" + bVar.m + "/gecko/server/packages/stats";
        bVar.b.execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
            @Override // java.lang.Runnable
            public final void run() throws NetworkErrorException {
                Response responseDoPost;
                for (int i = 0; i < 3; i++) {
                    try {
                        responseDoPost = bVar.f.doPost(str2, str);
                    } catch (Exception e) {
                        GeckoLogger.w("gecko-debug-tag", "upload statistic:", e);
                    }
                    if (responseDoPost.code != 200) {
                        throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str2);
                    }
                    if (new JSONObject(responseDoPost.body).getInt("status") == 0) {
                        return;
                    }
                }
            }
        });
    }

    private static JSONObject a(StatisticModel.PackageStatisticModel packageStatisticModel, Common common) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("region", common.region);
        jSONObject.put("err_code", packageStatisticModel.errCode);
        jSONObject.put("err_msg", packageStatisticModel.errMsg);
        jSONObject.put("sdk_version", common.sdkVersion);
        jSONObject.put("access_key", packageStatisticModel.accessKey);
        jSONObject.put("stats_type", packageStatisticModel.statsType);
        jSONObject.put("device_id", common.deviceId);
        jSONObject.put("patch_id", packageStatisticModel.patchId == null ? 0L : packageStatisticModel.patchId.longValue());
        jSONObject.put("group_name", packageStatisticModel.groupName);
        jSONObject.put(i5.x, common.os);
        jSONObject.put("app_version", common.appVersion);
        jSONObject.put("device_model", common.deviceModel);
        jSONObject.put("channel", packageStatisticModel.channel);
        jSONObject.put("id", packageStatisticModel.id == null ? 0L : packageStatisticModel.id.longValue());
        jSONObject.put("ac", common.ac);
        jSONObject.put("download_retry_times", packageStatisticModel.downloadRetryTimes == null ? 0 : packageStatisticModel.downloadRetryTimes.intValue());
        jSONObject.put(DownloadModel.DOWNLOAD_URL, packageStatisticModel.downloadUrl == null ? "" : packageStatisticModel.downloadUrl);
        jSONObject.put("download_duration", packageStatisticModel.downloadDuration);
        jSONObject.put("download_fail_records", packageStatisticModel.downloadFailRecords != null ? packageStatisticModel.downloadFailRecords : "");
        jSONObject.put("log_id", packageStatisticModel.logId);
        jSONObject.put("active_check_duration", packageStatisticModel.activeCheckDuration == null ? 0L : packageStatisticModel.activeCheckDuration.longValue());
        jSONObject.put("apply_duration", packageStatisticModel.applyDuration != null ? packageStatisticModel.applyDuration.longValue() : 0L);
        return jSONObject;
    }

    private static JSONObject b(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar2) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("device_id", bVar.l);
        jSONObject.put(i5.x, 0);
        jSONObject.put("app_version", bVar.k);
        jSONObject.put("api_version", "v3");
        jSONObject.put("aid", bVar.j.longValue());
        jSONObject.put("x_tt_logid", bVar2.e);
        jSONObject.put("http_status", bVar2.g);
        jSONObject.put("err_msg", bVar2.d);
        if (TextUtils.isEmpty(bVar2.e)) {
            jSONObject.put("deployments_info", bVar2.b);
            jSONObject.put("local_info", bVar2.f1433a);
            jSONObject.put("custom_info", bVar2.c);
        } else {
            jSONObject.put("deployments_info", "");
            jSONObject.put("local_info", "");
            jSONObject.put("custom_info", "");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        jSONObject.put("os_version", sb.toString());
        jSONObject.put("device_platform", "android");
        jSONObject.put("device_model", Build.MODEL);
        jSONObject.put("ac", bVar2.f);
        return jSONObject;
    }

    private static StatisticModel b(com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.d != null || aVar2.f != 0) {
                if (aVar2.h && aVar2.i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.b;
                    packageStatisticModel.accessKey = aVar2.f1432a;
                    packageStatisticModel.channel = aVar2.c;
                    packageStatisticModel.ac = aVar2.p;
                    packageStatisticModel.id = aVar2.r;
                    packageStatisticModel.patchId = aVar2.q;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.e);
                    packageStatisticModel.downloadUrl = aVar2.d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.g - aVar2.f);
                    if (!aVar2.j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.t;
                        packageStatisticModel2.ac = aVar2.p;
                        packageStatisticModel2.patchId = aVar2.q;
                        packageStatisticModel2.id = aVar2.r;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.e);
                        packageStatisticModel2.downloadUrl = aVar2.d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.e);
                    } else if (aVar2.k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f1432a;
                        packageStatisticModel3.groupName = aVar2.b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.q;
                        packageStatisticModel3.id = aVar2.r;
                        packageStatisticModel3.channel = aVar2.c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.n - aVar2.g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.o - aVar2.n);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f1432a;
                        packageStatisticModel4.groupName = aVar2.b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.c;
                        packageStatisticModel4.patchId = aVar2.q;
                        packageStatisticModel4.id = aVar2.r;
                        packageStatisticModel4.errMsg = aVar2.u;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f1432a;
                    packageStatisticModel5.groupName = aVar2.b;
                    packageStatisticModel5.channel = aVar2.c;
                    packageStatisticModel5.ac = aVar2.p;
                    packageStatisticModel5.patchId = aVar2.q;
                    packageStatisticModel5.id = aVar2.r;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.e);
                    packageStatisticModel5.downloadUrl = aVar2.d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.e);
                    if (!aVar2.h) {
                        packageStatisticModel5.errCode = "301";
                        if (aVar2.e != null && !aVar2.e.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.e.get(0).reason;
                        }
                    } else if (!aVar2.i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.s;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context context = bVar.f1395a;
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.b.a(context).a());
        if (arrayList.isEmpty()) {
            return null;
        }
        Common common = new Common(bVar.j.longValue(), bVar.k, bVar.l, com.bykv.vk.openvk.preload.geckox.utils.a.b(context), h.a(context), bVar.o, bVar.n);
        StatisticModel statisticModel = new StatisticModel();
        statisticModel.common = common;
        statisticModel.packages = arrayList;
        String string = UUID.randomUUID().toString();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((StatisticModel.PackageStatisticModel) it.next()).logId = string;
        }
        return statisticModel;
    }

    private static Integer a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (aVar.B && aVar.C) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f1432a;
            packageStatisticModel.groupName = aVar.b;
            packageStatisticModel.channel = aVar.c;
            packageStatisticModel.ac = aVar.p;
            packageStatisticModel.id = aVar.r;
            packageStatisticModel.downloadRetryTimes = a(aVar.w);
            packageStatisticModel.downloadUrl = aVar.v;
            packageStatisticModel.downloadFailRecords = b(aVar.w);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.y - aVar.x);
            if (aVar.D) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f1432a;
                packageStatisticModel2.groupName = aVar.b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.id = aVar.r;
                packageStatisticModel2.channel = aVar.c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.z - aVar.y);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.A - aVar.z);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f1432a;
            packageStatisticModel3.groupName = aVar.b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.id = aVar.r;
            packageStatisticModel3.channel = aVar.c;
            packageStatisticModel3.errMsg = aVar.F;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f1432a;
        packageStatisticModel4.groupName = aVar.b;
        packageStatisticModel4.channel = aVar.c;
        packageStatisticModel4.ac = aVar.p;
        packageStatisticModel4.id = aVar.r;
        packageStatisticModel4.downloadRetryTimes = a(aVar.w);
        packageStatisticModel4.downloadUrl = aVar.v;
        packageStatisticModel4.downloadFailRecords = b(aVar.w);
        if (!aVar.B) {
            packageStatisticModel4.errCode = "300";
            if (aVar.w == null || aVar.w.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.w.get(0).reason;
            return;
        }
        if (aVar.C) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.E;
    }

    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.statistic.model.b bVar2) {
        IStatisticMonitor iStatisticMonitor = bVar.e;
        if (iStatisticMonitor != null) {
            try {
                iStatisticMonitor.upload("geckosdk_query_pkgs", b(bVar, bVar2));
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
            }
        }
    }
}
