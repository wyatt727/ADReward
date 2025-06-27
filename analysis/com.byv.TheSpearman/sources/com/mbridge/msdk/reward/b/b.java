package com.mbridge.msdk.reward.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.reward.b.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RewardVideoControllerHandler.java */
/* loaded from: classes4.dex */
public final class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final a f3448a;

    public b(a aVar) {
        super(Looper.getMainLooper());
        this.f3448a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        Object obj = message.obj;
        com.mbridge.msdk.foundation.same.report.d.b bVarA = this.f3448a.a(message);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListE = this.f3448a.e();
        List<CampaignEx> listF = this.f3448a.f();
        com.mbridge.msdk.reward.adapter.c cVarG = this.f3448a.g();
        boolean zH = this.f3448a.h();
        String strJ = this.f3448a.j();
        String strI = this.f3448a.i();
        a.c cVarK = this.f3448a.k();
        InterVideoOutListener interVideoOutListenerL = this.f3448a.l();
        boolean zM = this.f3448a.m();
        MBridgeIds mBridgeIdsN = this.f3448a.n();
        boolean zO = this.f3448a.o();
        switch (i) {
            case 8:
                if (copyOnWriteArrayListE != null && copyOnWriteArrayListE.size() > 0) {
                    boolean z = (listF == null || listF.size() <= 0) ? false : !TextUtils.isEmpty(listF.get(0).getCMPTEntryUrl());
                    int nscpt = copyOnWriteArrayListE.get(0).getNscpt();
                    if (cVarG != null && cVarG.a(copyOnWriteArrayListE, z, nscpt)) {
                        if (cVarK != null && zH) {
                            cVarK.a(strJ, strI, bVarA);
                            break;
                        }
                    } else if (cVarK != null && zH) {
                        com.mbridge.msdk.videocommon.a.c(strI);
                        com.mbridge.msdk.videocommon.a.a();
                        com.mbridge.msdk.foundation.c.b bVarB = com.mbridge.msdk.foundation.c.a.b(880010, "load timeout");
                        if (bVarA != null) {
                            bVarA.a(bVarB);
                        }
                        cVarK.a(bVarB, bVarA);
                        break;
                    }
                }
                break;
            case 9:
                if (interVideoOutListenerL != null && zH) {
                    if (zM) {
                        this.f3448a.c();
                    }
                    interVideoOutListenerL.onVideoLoadSuccess(mBridgeIdsN);
                    break;
                }
                break;
            case 16:
            case 18:
                if (interVideoOutListenerL != null && zH) {
                    String string = obj instanceof String ? obj.toString() : "";
                    if (bVarA != null && bVarA.o() != null) {
                        string = bVarA.o().b();
                    }
                    com.mbridge.msdk.videocommon.a.c(strI);
                    com.mbridge.msdk.videocommon.a.a();
                    if (zM) {
                        this.f3448a.c();
                    }
                    interVideoOutListenerL.onVideoLoadFail(mBridgeIdsN, string);
                    break;
                }
                break;
            case 17:
                if (interVideoOutListenerL != null && zH) {
                    if (zM) {
                        this.f3448a.c();
                    }
                    interVideoOutListenerL.onLoadSuccess(mBridgeIdsN);
                    break;
                }
                break;
            case 1001001:
                this.f3448a.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, zO ? 287 : 94, strI, true, 1));
                break;
            case 1001002:
                if (cVarG != null) {
                    if (!cVarG.b()) {
                        if (cVarG.h(false)) {
                            if (!cVarG.b()) {
                                cVarG.g(false);
                                if (cVarG.h(true)) {
                                    if (!cVarG.b()) {
                                        cVarG.g(true);
                                        break;
                                    } else if (cVarK != null) {
                                        cVarG.f(true);
                                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListD = cVarG.d();
                                        if (copyOnWriteArrayListD != null && copyOnWriteArrayListD.size() == 0) {
                                            copyOnWriteArrayListD = cVarG.e();
                                        }
                                        this.f3448a.a(copyOnWriteArrayListD);
                                        com.mbridge.msdk.foundation.same.report.d.b bVarA2 = this.f3448a.a(copyOnWriteArrayListD, bVarA);
                                        if (bVarA2 != null) {
                                            bVarA2.b(copyOnWriteArrayListD);
                                        }
                                        cVarK.b(strJ, strI, bVarA2);
                                        break;
                                    }
                                }
                            } else if (cVarK != null) {
                                cVarG.f(false);
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListD2 = cVarG.d();
                                if (copyOnWriteArrayListD2 != null && copyOnWriteArrayListD2.size() == 0) {
                                    copyOnWriteArrayListD2 = cVarG.e();
                                }
                                this.f3448a.a(copyOnWriteArrayListD2);
                                com.mbridge.msdk.foundation.same.report.d.b bVarA3 = this.f3448a.a(copyOnWriteArrayListD2, bVarA);
                                if (bVarA3 != null) {
                                    bVarA3.b(copyOnWriteArrayListD2);
                                }
                                cVarK.b(strJ, strI, bVarA3);
                                break;
                            }
                        } else if (cVarG.h(true)) {
                            if (!cVarG.b()) {
                                cVarG.g(true);
                                break;
                            } else if (cVarK != null) {
                                cVarG.f(true);
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListD3 = cVarG.d();
                                if (copyOnWriteArrayListD3 != null && copyOnWriteArrayListD3.size() == 0) {
                                    copyOnWriteArrayListD3 = cVarG.e();
                                }
                                this.f3448a.a(copyOnWriteArrayListD3);
                                com.mbridge.msdk.foundation.same.report.d.b bVarA4 = this.f3448a.a(copyOnWriteArrayListD3, bVarA);
                                if (bVarA4 != null) {
                                    bVarA4.b(copyOnWriteArrayListD3);
                                }
                                cVarK.b(strJ, strI, bVarA4);
                                break;
                            }
                        }
                    } else if (cVarK != null) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListD4 = cVarG.d();
                        if (copyOnWriteArrayListD4 != null && copyOnWriteArrayListD4.size() == 0) {
                            copyOnWriteArrayListD4 = cVarG.e();
                        }
                        this.f3448a.a(copyOnWriteArrayListD4);
                        com.mbridge.msdk.foundation.same.report.d.b bVarA5 = this.f3448a.a(copyOnWriteArrayListD4, bVarA);
                        if (bVarA5 != null) {
                            bVarA5.b(copyOnWriteArrayListD4);
                        }
                        cVarK.b(strJ, strI, bVarA5);
                        break;
                    }
                }
                break;
        }
    }
}
