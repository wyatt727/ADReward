package com.mbridge.msdk.newreward.function.c.b.a;

import android.content.Intent;
import android.text.TextUtils;
import com.json.i1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.d.c.n;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: ShowReceiver.java */
/* loaded from: classes4.dex */
public final class i implements com.mbridge.msdk.newreward.function.c.b.b {

    /* renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.e f3319a;

    @Override // com.mbridge.msdk.newreward.function.c.b.b
    public final void a(Object obj) {
        com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) ((com.mbridge.msdk.newreward.function.c.b) obj).b();
        this.f3319a = eVar;
        if (eVar != null) {
            try {
                com.mbridge.msdk.newreward.function.d.a.b bVarB = eVar.x().b();
                Intent intent = null;
                try {
                    intent = new Intent(com.mbridge.msdk.foundation.controller.c.m().c(), Class.forName("com.mbridge.msdk.reward.player.MBRewardVideoActivity"));
                } catch (Exception unused) {
                }
                intent.putExtra(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f3319a.A());
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f3319a.w());
                intent.putExtra(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.f3319a.H());
                boolean z = this.f3319a.p() == 287;
                intent.putExtra("isIV", z);
                intent.putExtra("isBid", TextUtils.isEmpty(this.f3319a.C()));
                if (z) {
                    intent.putExtra("ivRewardMode", this.f3319a.k());
                    intent.putExtra("ivRewardValueType", this.f3319a.j());
                    intent.putExtra("ivRewardValue", this.f3319a.k());
                }
                intent.putExtra("isBigOffer", TextUtils.isEmpty(bVarB.z()) ? false : true);
                intent.putExtra("is_refactor", true);
                List<com.mbridge.msdk.newreward.function.d.a.a> listS = bVarB.s();
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.a> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                for (com.mbridge.msdk.newreward.function.d.a.a aVar : listS) {
                    CampaignEx campaignExG = aVar.g();
                    campaignExG.setReady_rate(100);
                    copyOnWriteArrayList.add(campaignExG);
                    com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignExG, this.f3319a.A(), 1);
                    aVar2.d(this.f3319a.p());
                    aVar2.d(campaignExG.getVideoUrlEncode());
                    n nVarD = aVar.d();
                    if (nVarD != null) {
                        aVar2.c(nVarD.f().getPath());
                    }
                    copyOnWriteArrayList2.add(aVar2);
                }
                com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f3319a.A(), copyOnWriteArrayList);
                com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f3319a.A(), copyOnWriteArrayList2);
                intent.addFlags(268435456);
                MBridgeGlobalCommon.showRewardListener = new a(bVarB, this.f3319a);
                com.mbridge.msdk.foundation.controller.c.m().c().startActivity(intent);
            } catch (Exception e) {
                ad.a("ShowReceiver", i1.u, e);
            }
        }
    }

    /* compiled from: ShowReceiver.java */
    private static class a implements com.mbridge.msdk.video.bt.module.b.h {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f3320a;
        private final com.mbridge.msdk.newreward.a.e b;

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(int i, String str, String str2) {
        }

        public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.e eVar) {
            this.f3320a = bVar;
            this.b = eVar;
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
            try {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f3320a.a(), this.f3320a.b(), this.f3320a.c(), this.f3320a.e(), 6);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000130", bVar);
                this.b.D().onAdShow(new MBridgeIds(this.b.w(), this.b.A()));
            } catch (Exception e) {
                ad.a("DefaultShowRewardListener", "onAdShow", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z, com.mbridge.msdk.videocommon.b.c cVar) {
            try {
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", bVar);
                this.b.D().onAdClose(new MBridgeIds(this.b.w(), this.b.A()), new RewardInfo(z, cVar.a(), String.valueOf(cVar.b())));
            } catch (Exception e) {
                ad.a("DefaultShowRewardListener", "onAdClose", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
            try {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f3320a.a(), this.f3320a.b(), this.f3320a.c(), this.f3320a.e(), 7);
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("reason", str);
                bVar.a("2000131", dVar);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000131", bVar);
                this.b.D().onShowFail(new MBridgeIds(this.b.w(), this.b.A()), str);
            } catch (Exception e) {
                ad.a("DefaultShowRewardListener", "onShowFail", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z, String str, String str2) {
            try {
                this.b.D().onVideoAdClicked(new MBridgeIds(this.b.w(), this.b.A()));
            } catch (Exception e) {
                ad.a("DefaultShowRewardListener", "onVideoAdClicked", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(String str, String str2) {
            try {
                this.b.D().onVideoComplete(new MBridgeIds(this.b.w(), this.b.A()));
            } catch (Exception e) {
                ad.a("DefaultShowRewardListener", "onVideoComplete", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z, int i) {
            try {
                this.b.D().onAdCloseWithIVReward(new MBridgeIds(this.b.w(), this.b.A()), z, i);
            } catch (Exception e) {
                ad.a("DefaultShowRewardListener", "onAdCloseWithIVReward", e);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void b(String str, String str2) {
            try {
                com.mbridge.msdk.foundation.d.b.a().a(str2 + "_2", 2);
                this.b.D().onEndcardShow(new MBridgeIds(this.b.w(), this.b.A()));
            } catch (Exception e) {
                ad.a("DefaultShowRewardListener", "onEndcardShow", e);
            }
        }
    }
}
