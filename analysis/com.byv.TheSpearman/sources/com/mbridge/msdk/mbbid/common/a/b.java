package com.mbridge.msdk.mbbid.common.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a.d;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.lang.reflect.Method;

/* compiled from: RequesManager.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f3086a;
    private String b;
    private String c;
    private BidListennning e;
    private BidResponsedEx f;
    private int g;
    private long i;
    private long j;
    private boolean k;
    private int l;
    private boolean h = false;
    private Context d = c.m().c();

    public final void a(boolean z) {
        this.k = z;
    }

    public final void a(int i) {
        this.l = i;
    }

    public final void b(int i) {
        this.g = i;
    }

    public final void a(long j) {
        this.i = j;
    }

    public final void b(long j) {
        this.j = j;
    }

    public b(String str, String str2, String str3) {
        this.f3086a = str;
        this.b = str2;
        this.c = str3;
    }

    public final void b(boolean z) {
        try {
            if (!this.h) {
                this.h = true;
                if (this.d == null) {
                    a("context is null");
                }
                com.mbridge.msdk.mbbid.common.b.a aVar = new com.mbridge.msdk.mbbid.common.b.a(this.d);
                e eVar = new e();
                String strK = c.m().k();
                eVar.a("app_id", strK);
                eVar.a("sign", SameMD5.getMD5(strK + c.m().b()));
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
                if (TextUtils.isEmpty(this.f3086a)) {
                    this.f3086a = "";
                }
                eVar.a("placement_id", this.f3086a);
                if (com.mbridge.msdk.f.b.a()) {
                    eVar.a("install_ids", "");
                }
                eVar.a("bid_floor", this.c);
                eVar.a(e.e, ai.a(this.d, this.b));
                eVar.a(e.d, d.a(this.b, ""));
                String str = "1";
                eVar.a("req_type", this.k ? "1" : "2");
                eVar.a("orientation", z.r(this.d) + "");
                int i = this.g;
                if (i == 296) {
                    if (this.i > 0 && this.j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.j + "x" + this.i);
                        try {
                            Method method = Class.forName("com.mbridge.msdk.mbbanner.common.util.BannerUtils").getMethod("getCloseIds", String.class);
                            if (method.invoke(null, this.b) instanceof String) {
                                eVar.a("close_id", method.invoke(null, this.b).toString());
                            }
                        } catch (Exception unused) {
                            a("banner module is miss");
                            return;
                        }
                    } else {
                        a("bid required param is missing or error");
                        return;
                    }
                } else if (i == 297) {
                    if (this.i > 0 && this.j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.j + "x" + this.i);
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.l);
                        sb.append("");
                        eVar.a("orientation", sb.toString());
                    } else {
                        a("ad display area is too small");
                        return;
                    }
                } else if (i != 298) {
                    if (!z) {
                        str = "0";
                    }
                    eVar.a("rw_plus", str);
                } else if (this.i > 0 && this.j > 0) {
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.j + "x" + this.i);
                } else {
                    a("bid required param is missing or error");
                    return;
                }
                final String md5 = SameMD5.getMD5(ai.d());
                eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
                a aVar2 = new a(this.f3086a, this.b) { // from class: com.mbridge.msdk.mbbid.common.a.b.1
                    @Override // com.mbridge.msdk.mbbid.common.b.b
                    public final void a(BidResponsedEx bidResponsedEx) {
                        b.this.h = false;
                        b.this.f = bidResponsedEx;
                        com.mbridge.msdk.mbbid.common.c.a.a(b.this.d, b.this.b, bidResponsedEx.getBidId(), md5, bidResponsedEx.getBidToken());
                        b.a(b.this, (BidResponsed) bidResponsedEx);
                    }

                    @Override // com.mbridge.msdk.mbbid.common.b.b
                    public final void a(int i2, String str2) {
                        b.this.h = false;
                        com.mbridge.msdk.mbbid.common.c.a.a(b.this.d, b.this.b, str2, md5);
                        b.this.a(str2);
                    }
                };
                aVar2.setUnitId(this.b);
                aVar2.setPlacementId(this.f3086a);
                aVar.get(1, com.mbridge.msdk.foundation.same.net.g.d.f().a(false, ""), eVar, aVar2);
                return;
            }
            a("current unit is biding");
        } catch (Throwable th) {
            a(th.getMessage());
        }
    }

    public final void a(BidListennning bidListennning) {
        this.e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    static /* synthetic */ void a(b bVar, BidResponsed bidResponsed) {
        BidListennning bidListennning = bVar.e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
