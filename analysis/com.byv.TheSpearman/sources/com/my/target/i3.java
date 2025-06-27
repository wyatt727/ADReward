package com.my.target;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.my.target.instreamads.InstreamAd;
import com.my.target.instreamads.InstreamAdVideoMotionPlayer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class i3 implements InstreamAdVideoMotionPlayer.VideoMotionPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f3997a;
    public InstreamAdVideoMotionPlayer b;
    public a c;
    public ja d;
    public Set<String> e;

    public interface a {
        void a(ja jaVar);

        void b(ja jaVar);
    }

    public i3(y0 y0Var) {
        this.f3997a = y0Var;
    }

    public static i3 a(y0 y0Var) {
        return new i3(y0Var);
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    public void a(InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer) {
        this.b = instreamAdVideoMotionPlayer;
        instreamAdVideoMotionPlayer.setVideoMotionPlayerListener(this);
    }

    public void a(ja jaVar, InstreamAd.InstreamAdVideoMotionBanner instreamAdVideoMotionBanner) {
        this.d = jaVar;
        this.e = new HashSet();
        InstreamAdVideoMotionPlayer instreamAdVideoMotionPlayer = this.b;
        if (instreamAdVideoMotionPlayer != null) {
            instreamAdVideoMotionPlayer.playVideoMotionBanner(instreamAdVideoMotionBanner);
            return;
        }
        ba.a("InstreamVideoMotionController: can't start videoMotionBanner. VideoMotionPlayer is null");
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a(jaVar);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onBannerComplete(Context context) {
        a aVar;
        ja jaVar = this.d;
        if (jaVar == null || (aVar = this.c) == null) {
            return;
        }
        w9.a(jaVar.getStatHolder().b("playbackCompleted"), context);
        aVar.a(jaVar);
        this.d = null;
        this.e = null;
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onBannerShow(Context context) {
        a aVar;
        ja jaVar = this.d;
        if (jaVar == null || (aVar = this.c) == null) {
            return;
        }
        v9 statHolder = jaVar.getStatHolder();
        w9.a(statHolder.b("playbackStarted"), context);
        String strD = ca.d(context);
        if (strD != null) {
            w9.a(statHolder.a(strD), context);
        }
        aVar.b(jaVar);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onCloseByUser(Context context) {
        a aVar;
        ja jaVar = this.d;
        if (jaVar == null || (aVar = this.c) == null) {
            return;
        }
        w9.a(jaVar.getStatHolder().b("closedByUser"), context);
        aVar.a(jaVar);
        this.d = null;
        this.e = null;
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onError(String str, Context context) {
        ja jaVar = this.d;
        if (jaVar == null) {
            return;
        }
        w9.a(jaVar.getStatHolder().b("playbackError"), context);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onHeaderClick(Context context) {
        n3 internalVideoMotionData;
        ja jaVar = this.d;
        if (jaVar == null || (internalVideoMotionData = jaVar.getInternalVideoMotionData()) == null) {
            return;
        }
        l3 l3Var = internalVideoMotionData.f4068a;
        w9.a(l3Var.f.b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), context);
        this.f3997a.a(jaVar, l3Var.h, l3Var.i, l3Var.g, context);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onItemClick(String str, Context context) {
        n3 internalVideoMotionData;
        ja jaVar = this.d;
        if (jaVar == null || (internalVideoMotionData = jaVar.getInternalVideoMotionData()) == null) {
            return;
        }
        o3 o3Var = null;
        Iterator<o3> it = internalVideoMotionData.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            o3 next = it.next();
            if (next.f4085a.equals(str)) {
                o3Var = next;
                break;
            }
        }
        if (o3Var == null) {
            return;
        }
        w9.a(o3Var.f.b(CampaignEx.JSON_NATIVE_VIDEO_CLICK), context);
        this.f3997a.a(jaVar, o3Var.j, o3Var.k, o3Var.i, context);
    }

    @Override // com.my.target.instreamads.InstreamAdVideoMotionPlayer.VideoMotionPlayerListener
    public void onItemShow(String str, Context context) {
        ja jaVar;
        n3 internalVideoMotionData;
        Set<String> set = this.e;
        if (set == null || set.contains(str) || (jaVar = this.d) == null || (internalVideoMotionData = jaVar.getInternalVideoMotionData()) == null) {
            return;
        }
        o3 o3Var = null;
        Iterator<o3> it = internalVideoMotionData.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            o3 next = it.next();
            if (next.f4085a.equals(str)) {
                o3Var = next;
                break;
            }
        }
        if (o3Var == null) {
            return;
        }
        this.e.add(str);
        w9.a(o3Var.f.b(com.json.i1.u), context);
    }
}
