package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.system.NoProGuard;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class RewardUnitCacheManager implements NoProGuard {
    private static final String TAG = "RewardUnitCacheManager";
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.d.c> rewardUnitSettings;

    private RewardUnitCacheManager() {
        this.rewardUnitSettings = new ConcurrentHashMap<>();
    }

    public static RewardUnitCacheManager getInstance() {
        return a.f3388a;
    }

    public final void add(String str, String str2, com.mbridge.msdk.videocommon.d.c cVar) {
        try {
            String str3 = str + "_" + str2;
            if (cVar != null && this.rewardUnitSettings.containsKey(str3)) {
                this.rewardUnitSettings.remove(str3);
            }
            this.rewardUnitSettings.put(str3, cVar);
        } catch (Exception e) {
            ad.b(TAG, e.getMessage());
        }
    }

    public final com.mbridge.msdk.videocommon.d.c get(String str, String str2) {
        try {
            try {
                return this.rewardUnitSettings.remove(str + "_" + str2);
            } catch (Exception e) {
                ad.b(TAG, e.getMessage());
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final RewardUnitCacheManager f3388a = new RewardUnitCacheManager();
    }
}
