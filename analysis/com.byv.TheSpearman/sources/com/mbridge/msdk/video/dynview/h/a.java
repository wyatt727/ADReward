package com.mbridge.msdk.video.dynview.h;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.video.dynview.e.e;
import com.mbridge.msdk.video.dynview.e.g;
import com.mbridge.msdk.video.dynview.j.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MBridgeUI.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f3627a = false;

    public a() {
    }

    public a(Context context, List<CampaignEx> list, g gVar, Map<String, Object> map) {
        a(new c().a(context, list), gVar, map);
    }

    public a(com.mbridge.msdk.video.dynview.c cVar, g gVar, Map<String, Object> map) {
        a(cVar, gVar, map);
    }

    private void a(com.mbridge.msdk.video.dynview.c cVar, final g gVar, Map<String, Object> map) {
        View viewInflate;
        if (gVar == null) {
            return;
        }
        if (cVar == null) {
            gVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (cVar.a() == null) {
            gVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_CONTEXT);
            return;
        }
        if (TextUtils.isEmpty(cVar.b())) {
            gVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_LAYOUTNAME);
            return;
        }
        try {
            if (cVar.l() != null) {
                viewInflate = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx((cVar.g() == null || cVar.g().size() <= 0) ? null : cVar.g().get(0)).fileDirs(cVar.l()).dyAdType(DyAdType.REWARD).orientation(cVar.e()).templateType(cVar.h()).build());
                if (viewInflate != null) {
                    f3627a = true;
                } else {
                    f3627a = false;
                    viewInflate = LayoutInflater.from(cVar.a()).inflate(v.a(cVar.a(), cVar.b(), "layout"), (ViewGroup) null);
                }
            } else {
                f3627a = false;
                viewInflate = LayoutInflater.from(cVar.a()).inflate(v.a(cVar.a(), cVar.b(), "layout"), (ViewGroup) null);
            }
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("is_dy_success", Boolean.valueOf(f3627a));
            com.mbridge.msdk.video.dynview.b.b.a().a(viewInflate, cVar, map);
            com.mbridge.msdk.video.dynview.b.a.a().a(viewInflate, cVar, map, new e() { // from class: com.mbridge.msdk.video.dynview.h.a.1
                @Override // com.mbridge.msdk.video.dynview.e.e
                public final void a(View view, List<View> list) {
                    com.mbridge.msdk.video.dynview.a aVar = new com.mbridge.msdk.video.dynview.a();
                    aVar.a(view);
                    aVar.a(list);
                    aVar.a(a.f3627a);
                    gVar.a(aVar);
                }

                @Override // com.mbridge.msdk.video.dynview.e.e
                public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                    gVar.a(aVar);
                }
            });
        } catch (Exception e) {
            ad.b("MBridgeUI", e.getMessage());
            if (gVar != null) {
                gVar.a(com.mbridge.msdk.video.dynview.c.a.VIEW_CREATE_ERROR);
            }
        }
    }
}
