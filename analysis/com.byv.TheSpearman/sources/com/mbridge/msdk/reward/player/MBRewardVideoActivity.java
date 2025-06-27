package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.video.dynview.e.d;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.b.c;
import com.mbridge.msdk.videocommon.download.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_EXTRADATA = "extraData";
    public static String INTENT_ISBID = "isBid";
    public static String INTENT_ISBIG_OFFER = "isBigOffer";
    public static String INTENT_ISIV = "isIV";
    public static String INTENT_IVREWARD_MODETYPE = "ivRewardMode";
    public static String INTENT_IVREWARD_VALUE = "ivRewardValue";
    public static String INTENT_IVREWARD_VALUETYPE = "ivRewardValueType";
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String INTENT_MUTE = "mute";
    public static String INTENT_REWARD = "reward";
    public static String INTENT_UNITID = "unitId";
    public static String INTENT_USERID = "userId";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";
    private boolean A;
    private String I;
    private com.mbridge.msdk.foundation.same.report.d.b J;
    private boolean L;

    /* renamed from: a, reason: collision with root package name */
    private String f3457a;
    private String b;
    private String c;
    private c d;
    private int h;
    private int i;
    private int j;
    private h m;
    private com.mbridge.msdk.videocommon.d.c n;
    private com.mbridge.msdk.videocommon.download.a q;
    private CampaignEx r;
    private List<com.mbridge.msdk.videocommon.download.a> s;
    private List<CampaignEx> t;
    private MBTempContainer u;
    private MBridgeBTContainer v;
    private WindVaneWebView w;
    private com.mbridge.msdk.video.bt.module.a.a x;
    private String y;
    private String z;
    private int e = 2;
    private boolean f = false;
    private boolean g = false;
    private boolean k = false;
    private boolean l = false;
    private boolean o = false;
    private boolean p = false;
    private int B = 1;
    private int C = 0;
    private int D = 0;
    private int E = 0;
    private int F = 0;
    private int G = 0;
    private int H = 0;
    private boolean K = false;
    private AdSession M = null;
    private MediaEvents N = null;
    private AdEvents O = null;
    private com.mbridge.msdk.video.dynview.e.a P = new com.mbridge.msdk.video.dynview.e.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.1
        @Override // com.mbridge.msdk.video.dynview.e.a
        public final void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.e = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey(t2.h.L)) {
                int iIntValue = ((Integer) map.get(t2.h.L)).intValue();
                if (MBRewardVideoActivity.this.t == null || MBRewardVideoActivity.this.t.size() <= 0 || iIntValue < 1) {
                    return;
                }
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.r = (CampaignEx) mBRewardVideoActivity.t.get(iIntValue);
                MBRewardVideoActivity.b(MBRewardVideoActivity.this);
                int i = iIntValue - 1;
                if (MBRewardVideoActivity.this.t.get(i) != null) {
                    MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.t.get(i)).getVideoLength());
                }
                MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                MBRewardVideoActivity.this.r.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.r.getVideoCompleteTime(), MBRewardVideoActivity.this.B));
                MBRewardVideoActivity.this.r.setShowIndex(MBRewardVideoActivity.this.B);
                MBRewardVideoActivity.this.r.setShowType(1);
                MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                mBRewardVideoActivity4.b(mBRewardVideoActivity4.r);
            }
        }
    };
    private d Q = new d() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.2
        @Override // com.mbridge.msdk.video.dynview.e.d
        public final void a(CampaignEx campaignEx) {
            if (campaignEx != null) {
                if (MBRewardVideoActivity.this.v != null) {
                    new com.mbridge.msdk.video.dynview.h.b().b(MBRewardVideoActivity.this.v, 500L);
                }
                MBRewardVideoActivity.this.r = campaignEx;
                MBRewardVideoActivity.this.r.setShowType(2);
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.b(mBRewardVideoActivity.r);
                return;
            }
            MBRewardVideoActivity.this.a("campaign is null");
        }

        @Override // com.mbridge.msdk.video.dynview.e.d
        public final void a() throws JSONException {
            if (MBRewardVideoActivity.this.v != null) {
                new com.mbridge.msdk.video.dynview.h.b().b(MBRewardVideoActivity.this.v, 500L);
            }
            MBRewardVideoActivity.this.k = true;
            MBRewardVideoActivity.this.b();
            if (MBRewardVideoActivity.this.u != null) {
                MBRewardVideoActivity.this.u.setNotchPadding(MBRewardVideoActivity.this.H, MBRewardVideoActivity.this.D, MBRewardVideoActivity.this.F, MBRewardVideoActivity.this.E, MBRewardVideoActivity.this.G);
            }
        }
    };

    private void c(CampaignEx campaignEx) {
    }

    static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity) {
        int i = mBRewardVideoActivity.B;
        mBRewardVideoActivity.B = i + 1;
        return i;
    }

    static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i) {
        int i2 = mBRewardVideoActivity.C - i;
        mBRewardVideoActivity.C = i2;
        return i2;
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        List<com.mbridge.msdk.videocommon.download.a> list;
        String cMPTEntryUrl = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        try {
            Intent intent = getIntent();
            this.f3457a = intent.getStringExtra(INTENT_UNITID);
            this.b = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.d = c.b(intent.getStringExtra(INTENT_REWARD));
            this.c = intent.getStringExtra(INTENT_USERID);
            this.e = intent.getIntExtra(INTENT_MUTE, 2);
            this.f = intent.getBooleanExtra(INTENT_ISIV, false);
            int i = 287;
            com.mbridge.msdk.foundation.controller.c.m().b(this.f ? 287 : 94);
            this.g = intent.getBooleanExtra(INTENT_ISBID, false);
            this.z = intent.getStringExtra(INTENT_EXTRADATA);
            boolean booleanExtra = intent.getBooleanExtra("is_refactor", false);
            this.K = booleanExtra;
            if (booleanExtra) {
                this.m = MBridgeGlobalCommon.showRewardListener;
            } else {
                this.m = com.mbridge.msdk.reward.b.a.f.get(this.f3457a);
            }
            if (this.f) {
                this.h = intent.getIntExtra(INTENT_IVREWARD_MODETYPE, 0);
                this.i = intent.getIntExtra(INTENT_IVREWARD_VALUETYPE, 0);
                this.j = intent.getIntExtra(INTENT_IVREWARD_VALUE, 0);
            }
            this.k = intent.getBooleanExtra(INTENT_ISBIG_OFFER, false);
            this.s = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f3457a);
            this.t = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f3457a);
            int iFindLayout = findLayout("mbridge_more_offer_activity");
            if (iFindLayout < 0) {
                a("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(iFindLayout);
            if (TextUtils.isEmpty(this.f3457a)) {
                a("data empty error");
                return;
            }
            this.jsFactory = new com.mbridge.msdk.video.signal.factory.b(this);
            registerJsFactory(this.jsFactory);
            if (this.m == null) {
                a("showRewardListener is null");
                return;
            }
            com.mbridge.msdk.videocommon.d.c cVar = RewardUnitCacheManager.getInstance().get(this.b, this.f3457a);
            this.n = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.d.c cVarA = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f3457a);
                this.n = cVarA;
                if (cVarA == null) {
                    this.n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f3457a, this.f);
                }
            }
            com.mbridge.msdk.videocommon.d.c cVar2 = this.n;
            if (cVar2 != null) {
                this.d.a(cVar2.m());
                this.d.a(this.n.n());
            }
            c cVar3 = this.d;
            if (cVar3 != null && cVar3.b() <= 0) {
                this.d.a(1);
            }
            int iA = v.a(this, "mbridge_reward_activity_open", "anim");
            int iA2 = v.a(this, "mbridge_reward_activity_stay", "anim");
            if (iA > 1 && iA2 > 1) {
                overridePendingTransition(iA, iA2);
            }
            if (bundle != null) {
                try {
                    this.p = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            ad.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.k);
            if (!this.k) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.s;
                if (list2 != null && list2.size() > 0) {
                    this.q = this.s.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.q;
                if (aVar != null) {
                    this.r = aVar.l();
                    this.q.e(true);
                    this.q.f(false);
                    CampaignEx campaignEx = this.r;
                    if (campaignEx != null) {
                        this.I = campaignEx.getCurrentLocalRid();
                        this.r.setShowIndex(1);
                        this.r.setShowType(1);
                        com.mbridge.msdk.reward.b.a.b = this.r.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.r.getMaitve(), this.r.getMaitve_src());
                    }
                }
                if (this.q == null || this.r == null || this.d == null) {
                    a("data empty error");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.r);
                b(arrayList);
                a(this.r);
                b();
                if (com.mbridge.msdk.f.b.a()) {
                    return;
                }
                a();
                return;
            }
            b(this.t);
            this.y = "";
            List<CampaignEx> list3 = this.t;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx2 = this.t.get(0);
                a(campaignEx2);
                cMPTEntryUrl = campaignEx2.getCMPTEntryUrl();
                this.y = campaignEx2.getRequestId();
                this.I = campaignEx2.getCurrentLocalRid();
                com.mbridge.msdk.reward.b.a.b = campaignEx2.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx2.getMaitve(), campaignEx2.getMaitve_src());
            }
            a.C0310a c0310aA = com.mbridge.msdk.videocommon.a.a(this.f3457a + "_" + this.y + "_" + cMPTEntryUrl);
            WindVaneWebView windVaneWebViewA = c0310aA != null ? c0310aA.a() : null;
            this.w = windVaneWebViewA;
            if (windVaneWebViewA == null) {
                if (this.q == null && (list = this.s) != null && list.size() > 0) {
                    this.q = this.s.get(0);
                }
                if (this.q == null) {
                    com.mbridge.msdk.videocommon.download.b bVar = com.mbridge.msdk.videocommon.download.b.getInstance();
                    if (!this.f) {
                        i = 94;
                    }
                    String str = this.f3457a;
                    boolean z = this.g;
                    j jVarC = bVar.c(str);
                    this.q = jVarC != null ? jVarC.b(i, z) : null;
                }
                com.mbridge.msdk.videocommon.download.a aVar2 = this.q;
                if (aVar2 != null) {
                    this.r = aVar2.l();
                    this.q.e(true);
                    this.q.f(false);
                }
                if (this.q != null && this.r != null && this.d != null) {
                    this.k = false;
                    List<CampaignEx> listA = com.mbridge.msdk.videocommon.a.a.a().a(this.t);
                    if (listA == null) {
                        a("no available campaign");
                        return;
                    }
                    int size = listA.size();
                    if (size == 0) {
                        a("no available campaign");
                        return;
                    }
                    if (listA.get(0) == null || !(this.K || listA.get(0).isDynamicView())) {
                        b();
                    } else if (size == 1) {
                        CampaignEx campaignEx3 = listA.get(0);
                        this.r = campaignEx3;
                        if (campaignEx3 != null) {
                            this.I = campaignEx3.getCurrentLocalRid();
                            this.r.setCampaignIsFiltered(true);
                        }
                        b(this.r);
                    } else {
                        a(listA);
                    }
                }
                a("data empty error");
                return;
            }
            a(this.t.get(0));
            WindVaneWebView windVaneWebView = this.w;
            if (windVaneWebView != null) {
                try {
                    k kVar = (k) windVaneWebView.getObject();
                    kVar.a(this.O);
                    kVar.a(this.M);
                    kVar.a(this.N);
                    this.w.setObject(kVar);
                } catch (Exception e2) {
                    ad.b("MBRewardVideoActivity", e2.getMessage());
                }
            }
            c();
            if (com.mbridge.msdk.f.b.a()) {
                return;
            }
            a();
        } catch (Throwable th) {
            b(this.t);
            a("onCreate error" + th);
        }
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isActiveOm() && this.M == null) {
                    AdSession adSessionA = com.mbridge.msdk.a.b.a(getApplicationContext(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f3457a, campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                    this.M = adSessionA;
                    if (adSessionA != null) {
                        this.O = AdEvents.createAdEvents(adSessionA);
                        this.N = MediaEvents.createMediaEvents(this.M);
                    }
                }
            } catch (Throwable th) {
                ad.b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    private void a() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.m().a(this.f3457a, this.f ? 287 : 94);
            if (bitmapDrawableA != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                ai.a(imageView, bitmapDrawableA, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(List<CampaignEx> list) {
        int dynamicTempCode;
        if (list == null) {
            a("no available campaign");
            return;
        }
        if (list.size() == 0) {
            a("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            dynamicTempCode = list.get(0).getDynamicTempCode();
            this.I = list.get(0).getCurrentLocalRid();
        } else {
            dynamicTempCode = 0;
        }
        if (dynamicTempCode == 5) {
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null) {
                    this.C += campaignEx.getVideoLength();
                }
            }
            CampaignEx campaignEx2 = list.get(0);
            if (campaignEx2 != null) {
                int iA = a(campaignEx2.getVideoCompleteTime(), this.B);
                this.r = campaignEx2;
                campaignEx2.setCampaignIsFiltered(true);
                this.B = 1;
                this.r.setVideoCompleteTime(iA);
                this.r.setShowIndex(this.B);
                this.r.setShowType(1);
                b(this.r);
                return;
            }
            a("campaign is less");
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        CampaignEx campaignExL;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.s;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.s) {
                    if (aVar != null && (campaignExL = aVar.l()) != null && TextUtils.equals(campaignExL.getId(), campaignEx.getId()) && TextUtils.equals(campaignExL.getRequestId(), campaignEx.getRequestId())) {
                        this.q = aVar;
                    }
                }
            }
            this.k = true;
            b();
            MBTempContainer mBTempContainer = this.u;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.H, this.D, this.F, this.E, this.G);
            }
        } catch (Exception e) {
            ad.b("MBRewardVideoActivity", e.getMessage());
            a("more offer to one offer exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        ad.b("MBRewardVideoActivity", str);
        b(this.t);
        h hVar = this.m;
        if (hVar != null) {
            hVar.a(this.J, str);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int iFindID = findID("mbridge_temp_container");
        if (iFindID < 0) {
            a("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(iFindID);
        this.u = mBTempContainer;
        if (mBTempContainer == null) {
            a("env error");
        }
        List<CampaignEx> list3 = this.t;
        if (list3 != null && list3.size() > 0 && this.t.get(0).isDynamicView()) {
            new com.mbridge.msdk.video.dynview.h.b().c(this.u, 500L);
        } else {
            this.u.setVisibility(0);
        }
        changeHalfScreenPadding(-1);
        this.u.setActivity(this);
        this.u.setBidCampaign(this.g);
        this.u.setBigOffer(this.k);
        this.u.setUnitId(this.f3457a);
        this.u.setCampaign(this.r);
        if (this.r.getDynamicTempCode() == 5 && (list2 = this.t) != null && list2.size() > 1) {
            View viewFindViewById = findViewById(findID("mbridge_reward_root_container"));
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.u.removeAllViews();
            this.u.setCampOrderViewData(this.t, this.C);
            this.u.setCamPlayOrderCallback(this.P, this.B);
        }
        this.u.setCampaignDownLoadTask(this.q);
        this.u.setIV(this.f);
        CampaignEx campaignEx2 = this.r;
        if (campaignEx2 != null && campaignEx2.getAdSpaceT() == 2) {
            this.u.setIVRewardEnable(0, 0, 0);
        } else {
            this.u.setIVRewardEnable(this.h, this.i, this.j);
        }
        this.u.setMute(this.e);
        CampaignEx campaignEx3 = this.r;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.t) != null && list.size() > 0 && this.t.get(0) != null && (rewardPlus = this.t.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            c cVar = new c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.d = cVar;
        }
        this.u.setReward(this.d);
        this.u.setRewardUnitSetting(this.n);
        this.u.setPlacementId(this.b);
        this.u.setUserId(this.c);
        this.u.setShowRewardListener(this.m);
        this.u.setDeveloperExtraData(this.z);
        this.u.init(this);
        this.u.setAdSession(this.M);
        this.u.setAdEvents(this.O);
        this.u.setVideoEvents(this.N);
        this.u.onCreate();
        if (!com.mbridge.msdk.f.b.a() || (campaignEx = this.r) == null) {
            return;
        }
        c(campaignEx);
    }

    private void c() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int iFindID = findID("mbridge_bt_container");
        if (iFindID < 0) {
            a("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(iFindID);
        this.v = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            a("env error");
        }
        this.v.setVisibility(0);
        com.mbridge.msdk.video.bt.module.a.a aVarD = d();
        this.x = aVarD;
        this.v.setBTContainerCallback(aVarD);
        this.v.setShowRewardVideoListener(this.m);
        this.v.setChoiceOneCallback(this.Q);
        this.v.setCampaigns(this.t);
        this.v.setCampaignDownLoadTasks(this.s);
        this.v.setRewardUnitSetting(this.n);
        this.v.setUnitId(this.f3457a);
        this.v.setPlacementId(this.b);
        this.v.setUserId(this.c);
        this.v.setActivity(this);
        CampaignEx campaignEx = this.r;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.t.get(0) != null && (rewardPlus = this.t.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            c cVar = new c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.d = cVar;
        }
        this.v.setReward(this.d);
        this.v.setIVRewardEnable(this.h, this.i, this.j);
        this.v.setIV(this.f);
        this.v.setMute(this.e);
        this.v.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.v.setDeveloperExtraData(this.z);
        this.v.init(this);
        this.v.setAdSession(this.M);
        this.v.setVideoEvents(this.N);
        this.v.setAdEvents(this.O);
        this.v.onCreate(this.K);
        if (!com.mbridge.msdk.f.b.a() || (list = this.t) == null || list.size() <= 0 || this.t.get(0) == null) {
            return;
        }
        c(this.t.get(0));
    }

    private com.mbridge.msdk.video.bt.module.a.a d() {
        if (this.x == null) {
            this.x = new com.mbridge.msdk.video.bt.module.a.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.3
                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a() {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(MBRewardVideoActivity.this.J);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z, c cVar) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(MBRewardVideoActivity.this.J, z, cVar);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z, int i) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(z, i);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(String str) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(MBRewardVideoActivity.this.J, str);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(boolean z, String str, String str2) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(z, str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(String str, String str2) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void b(String str, String str2) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.b(str, str2);
                    }
                }

                @Override // com.mbridge.msdk.video.bt.module.a.a
                public final void a(int i, String str, String str2) {
                    if (MBRewardVideoActivity.this.m != null) {
                        MBRewardVideoActivity.this.m.a(i, str, str2);
                    }
                }
            };
        }
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, int i2) {
        List<CampaignEx> list = this.t;
        if (list == null || list.size() == 0) {
            return i;
        }
        int videoLength = 0;
        int videoCompleteTime = 0;
        for (int i3 = 0; i3 < this.t.size(); i3++) {
            if (this.t.get(0) != null) {
                if (i3 == 0) {
                    videoCompleteTime = this.t.get(0).getVideoCompleteTime();
                }
                videoLength += this.t.get(i3).getVideoLength();
            }
        }
        if (i2 == 1) {
            if (i == 0) {
                if (videoLength >= 45) {
                    return 45;
                }
            } else if (videoLength > i) {
                if (i > 45) {
                    return 45;
                }
                return i;
            }
            return videoLength;
        }
        int videoLength2 = 0;
        for (int i4 = 0; i4 < i2 - 1; i4++) {
            if (this.t.get(i4) != null) {
                videoLength2 += this.t.get(i4).getVideoLength();
            }
        }
        if (videoCompleteTime > videoLength2) {
            return videoCompleteTime - videoLength2;
        }
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.d.b.c) {
            return;
        }
        com.mbridge.msdk.foundation.controller.c.m().a(this);
        try {
            com.mbridge.msdk.foundation.same.f.b.b().execute(new b(this.f3457a, this.s));
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.u != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.u.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000151", this.r);
        try {
            h hVar = this.m;
            if (hVar instanceof com.mbridge.msdk.video.bt.module.b.b) {
                com.mbridge.msdk.video.bt.module.b.b bVar = (com.mbridge.msdk.video.bt.module.b.b) hVar;
                if (!bVar.b && !bVar.c) {
                    this.m.a(this.J, "show fail : unexpected destroy");
                }
            }
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
        com.mbridge.msdk.video.module.b.b.a(this.f3457a);
        try {
            List<CampaignEx> list = this.t;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.t.iterator();
                while (it.hasNext()) {
                    d(it.next());
                }
            }
            CampaignEx campaignEx = this.r;
            if (campaignEx != null) {
                d(campaignEx);
            }
        } catch (Throwable th2) {
            ad.b("MBRewardVideoActivity", th2.getMessage());
        }
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.v = null;
        }
        this.P = null;
        this.Q = null;
        com.mbridge.msdk.foundation.d.b.a().c(this.f3457a + "_1");
        com.mbridge.msdk.foundation.d.b.a().c(this.f3457a + "_2");
        com.mbridge.msdk.foundation.same.f.b.b().execute(new a(this.s, this.f3457a, this.y));
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (com.mbridge.msdk.foundation.d.b.c) {
            return;
        }
        new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.reward.player.MBRewardVideoActivity.4
            @Override // com.mbridge.msdk.foundation.d.a
            public final void a() {
                MBRewardVideoActivity.this.onPause();
            }

            @Override // com.mbridge.msdk.foundation.d.a
            public final void b() {
                MBRewardVideoActivity.this.onResume();
            }

            @Override // com.mbridge.msdk.foundation.d.a
            public final void a(String str) {
                MBRewardVideoActivity.this.onResume();
            }
        };
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.r.setCampaignUnitId(this.f3457a);
            com.mbridge.msdk.foundation.d.b.a().a(this.f3457a + "_1", this.r);
        }
        MBridgeBTContainer mBridgeBTContainer = this.v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.t;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.t.get(0);
                campaignEx.setCampaignUnitId(this.f3457a);
                com.mbridge.msdk.foundation.d.b.a().a(this.f3457a + "_1", campaignEx);
            }
        }
        if (this.A) {
            return;
        }
        com.mbridge.msdk.foundation.d.b.a().a(this.f3457a + "_1", 1);
        com.mbridge.msdk.foundation.d.b.a().c(this.f3457a + "_2");
        this.A = true;
    }

    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f3462a;
        private final String b;
        private final String c;

        public a(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.f3462a = list;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f3462a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f3462a) {
                    if (aVar != null && aVar.l() != null) {
                        CampaignEx campaignExL = aVar.l();
                        try {
                            AppletModelManager.getInstance().remove(campaignExL);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                ad.a("MBRewardVideoActivity", "AppletModelManager remove error", e);
                            }
                        }
                        String str = campaignExL.getRequestId() + campaignExL.getId() + campaignExL.getVideoUrlEncode();
                        j jVarC = com.mbridge.msdk.videocommon.download.b.getInstance().c(this.b);
                        if (jVarC != null) {
                            try {
                                jVarC.b(str);
                            } catch (Exception e2) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("DownLoadManager", e2.getMessage());
                                }
                            }
                        }
                        if (campaignExL != null && campaignExL.getRewardTemplateMode() != null) {
                            if (!TextUtils.isEmpty(campaignExL.getRewardTemplateMode().e())) {
                                com.mbridge.msdk.videocommon.a.b(this.b + "_" + campaignExL.getId() + "_" + this.c + "_" + campaignExL.getRewardTemplateMode().e());
                                com.mbridge.msdk.videocommon.a.b(campaignExL.getAdType(), campaignExL);
                            }
                            if (!TextUtils.isEmpty(campaignExL.getCMPTEntryUrl())) {
                                com.mbridge.msdk.videocommon.a.b(this.b + "_" + this.c + "_" + campaignExL.getCMPTEntryUrl());
                            }
                            com.mbridge.msdk.videocommon.a.a.a().a(campaignExL);
                        }
                    }
                }
            } catch (Exception e3) {
                ad.a("MBRewardVideoActivity", e3.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.M != null) {
            ad.b("omsdk", "mbrewardvideoac finish");
            this.M.removeAllFriendlyObstructions();
            this.M.finish();
            this.M = null;
        }
        com.mbridge.msdk.foundation.controller.c.m().b(0);
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.u = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.v = null;
        }
        com.mbridge.msdk.foundation.d.b.a().c(this.f3457a);
        super.finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.p);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i, int i2, int i3, int i4, int i5) throws JSONException {
        this.D = i2;
        this.F = i3;
        this.E = i4;
        this.G = i5;
        this.H = i;
        MBTempContainer mBTempContainer = this.u;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
        MBridgeBTContainer mBridgeBTContainer = this.v;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
        com.mbridge.msdk.video.dynview.a.a.e = i;
        com.mbridge.msdk.video.dynview.a.a.f3615a = i2;
        com.mbridge.msdk.video.dynview.a.a.b = i3;
        com.mbridge.msdk.video.dynview.a.a.c = i4;
        com.mbridge.msdk.video.dynview.a.a.d = i5;
    }

    public int findID(String str) {
        return v.a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(getApplicationContext(), str, "layout");
    }

    public void changeHalfScreenPadding(int i) {
        try {
            CampaignEx campaignEx = this.r;
            if (campaignEx == null || campaignEx.getAdSpaceT() != 2) {
                return;
            }
            getWindow().getDecorView().setBackground(new ColorDrawable(0));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.u.getLayoutParams();
            int iA = ai.a(this, 58.0f);
            int iA2 = ai.a(this, 104.0f);
            if (this.r.getRewardTemplateMode().b() == 0) {
                if (i == 2) {
                    layoutParams.setMargins(iA2, iA, iA2, iA);
                } else {
                    layoutParams.setMargins(iA, iA2, iA, iA2);
                }
            } else if (this.r.getRewardTemplateMode().b() == 2) {
                layoutParams.setMargins(iA2, iA, iA2, iA);
            } else {
                layoutParams.setMargins(iA, iA2, iA, iA2);
            }
            this.u.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            ad.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    private void d(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getImageUrl());
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getIconUrl());
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(v.a(this, "mbridge_transparent_theme", "style"));
    }

    private static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f3463a;
        private final String b;

        public b(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.f3463a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f3463a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f3463a) {
                    if (aVar != null && aVar.l() != null) {
                        com.mbridge.msdk.videocommon.a.a.a().a(aVar.l(), this.b);
                    }
                }
            } catch (Throwable th) {
                ad.b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    private void b(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.L) {
            return;
        }
        if (list == null) {
            try {
                if (this.k) {
                    list = this.t;
                } else {
                    list = new ArrayList<>();
                    List<com.mbridge.msdk.videocommon.download.a> list2 = this.s;
                    if (list2 != null && list2.get(0) != null && this.s.get(0).l() != null) {
                        list.add(this.s.get(0).l());
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        String currentLocalRid = "";
        if (list != null && !list.isEmpty() && (campaignEx = list.get(0)) != null) {
            currentLocalRid = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(currentLocalRid)) {
            this.J = com.mbridge.msdk.foundation.same.report.d.c.a().b(currentLocalRid);
        }
        if (this.J == null) {
            this.J = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f3457a);
            dVar.a("hb", Integer.valueOf(this.g ? 1 : 0));
            dVar.a("adtp", Integer.valueOf(this.f ? 287 : 94));
            dVar.a("lrid", this.I);
            dVar.a("his_reason", "show campaign is null");
            this.J.a("2000129", dVar);
        }
        if (list != null) {
            this.J.b(list);
        }
        this.L = true;
        com.mbridge.msdk.reward.c.a.a.a().a("2000129", this.J);
    }
}
