package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RewardVideoRefactorManager.java */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private AtomicBoolean f3895a;
    private AtomicBoolean b;

    private h() {
    }

    public static h a() {
        return a.f3896a;
    }

    public final boolean a(int i) {
        if (MBridgeConstans.DEBUG) {
            ad.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f3895a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f3895a = new AtomicBoolean(af.a().a("r_v_r_f_l", false));
        } catch (Exception e) {
            this.f3895a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e.getMessage());
            }
        }
        return this.f3895a.get();
    }

    public final boolean b(int i) {
        if (MBridgeConstans.DEBUG) {
            ad.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.b = new AtomicBoolean(af.a().a("r_v_r_f_c_r", false));
        } catch (Exception e) {
            this.b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e.getMessage());
            }
        }
        return this.b.get();
    }

    public final int a(String str, int i) {
        try {
            return af.a().a(str, i);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", "getRewardVideoCampaignRequestTimeout error: " + e.getMessage());
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RewardVideoRefactorManager.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final h f3896a = new h();
    }
}
