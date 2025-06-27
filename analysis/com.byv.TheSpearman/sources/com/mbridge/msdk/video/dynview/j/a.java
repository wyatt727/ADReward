package com.mbridge.msdk.video.dynview.j;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.o;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.video.dynview.e.d;
import com.mbridge.msdk.video.dynview.e.e;
import com.mbridge.msdk.video.dynview.g.a;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DataEnergizeWrapper.java */
/* loaded from: classes4.dex */
public final class a {
    private static boolean j = false;
    private com.mbridge.msdk.video.dynview.i.c.b b;
    private Map<String, Bitmap> c;
    private volatile boolean d;
    private String e = "#FFFFFFFF";
    private String f = "#60000000";
    private String g = "#FF5F5F5F";
    private String h = "#90ECECEC";
    private volatile long i = 0;
    private com.mbridge.msdk.video.dynview.i.c.a k = null;
    private boolean l = false;
    private int m = 0;

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.d.a f3640a = new com.mbridge.msdk.video.dynview.d.a() { // from class: com.mbridge.msdk.video.dynview.j.a.1
        @Override // com.mbridge.msdk.video.dynview.d.a
        public final void a() {
            if (!a.this.l || a.this.b == null) {
                return;
            }
            a.this.b.a(a.this.m * 1000, a.this.k);
            a.this.l = false;
        }

        @Override // com.mbridge.msdk.video.dynview.d.a
        public final void b() {
            if (a.this.b != null) {
                a.this.b.b();
                a.this.l = true;
            }
        }

        @Override // com.mbridge.msdk.video.dynview.d.a
        public final void c() {
            if (a.this.b != null) {
                a.this.b.b();
                a.this.l = true;
            }
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:50:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.mbridge.msdk.video.dynview.c r33, android.view.View r34, final java.util.Map r35, com.mbridge.msdk.video.dynview.e.e r36) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.j.a.a(com.mbridge.msdk.video.dynview.c, android.view.View, java.util.Map, com.mbridge.msdk.video.dynview.e.e):void");
    }

    public final void b(com.mbridge.msdk.video.dynview.c cVar, View view, Map map, e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            j = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        boolean z = j;
        LinearLayout linearLayout = z ? (LinearLayout) view.findViewById(a(z, "mbridge_reward_heat_mllv")) : null;
        ImageView imageView = (ImageView) view.findViewById(a(j, "mbridge_reward_icon_riv"));
        TextView textView = (TextView) view.findViewById(a(j, "mbridge_reward_title_tv"));
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(a(j, "mbridge_reward_stars_mllv"));
        TextView textView2 = (TextView) view.findViewById(a(j, "mbridge_reward_click_tv"));
        ImageView imageView2 = (ImageView) view.findViewById(a(j, "mbridge_videoview_bg"));
        TextView textView3 = (TextView) view.findViewById(a(j, "mbridge_reward_desc_tv"));
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(j, "mbridge_reward_bottom_layout"));
        List<View> arrayList = new ArrayList<>();
        List<CampaignEx> listG = cVar.g();
        if (listG != null && listG.size() > 0) {
            CampaignEx campaignEx = listG.get(0);
            if (campaignEx != null) {
                if (imageView != null) {
                    if (j) {
                        if (imageView instanceof MBCusRoundImageView) {
                            ((MBCusRoundImageView) imageView).setCustomBorder(30, 30, 30, 30, 10, -1);
                        }
                    } else {
                        ((RoundImageView) imageView).setBorderRadius(10);
                    }
                    a(campaignEx.getIconUrl(), imageView);
                }
                if (textView != null) {
                    textView.setText(campaignEx.getAppName());
                }
                if (textView3 != null) {
                    textView3.setText(campaignEx.getAppDesc());
                }
                if (linearLayout2 != null) {
                    double rating = campaignEx.getRating();
                    if (rating <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        rating = 5.0d;
                    }
                    if (j) {
                        if (linearLayout2 instanceof MBStarLevelLayoutView) {
                            MBStarLevelLayoutView mBStarLevelLayoutView = (MBStarLevelLayoutView) linearLayout2;
                            mBStarLevelLayoutView.setRating((int) rating);
                            mBStarLevelLayoutView.setOrientation(0);
                        }
                        if (linearLayout instanceof MBHeatLevelLayoutView) {
                            ((MBHeatLevelLayoutView) linearLayout).setHeatCount(campaignEx.getNumberRating());
                        }
                    } else {
                        ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, campaignEx.getNumberRating());
                    }
                }
                if (textView2 != null) {
                    textView2.setText(campaignEx.getAdCall());
                }
                int i = cVar.i();
                if (i == 102 || i == 202 || i == 302) {
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                } else if (i == 802) {
                    if (imageView != null) {
                        arrayList.add(imageView);
                    }
                    if (textView2 != null) {
                        arrayList.add(textView2);
                    }
                    a(imageView2, campaignEx.getImageUrl(), i);
                } else if (i != 902) {
                    if (i != 904) {
                        if (i == 5002010) {
                            if (cVar.k() && relativeLayout != null && relativeLayout.getVisibility() == 0) {
                                arrayList.add(relativeLayout);
                            } else {
                                if (imageView != null) {
                                    arrayList.add(imageView);
                                }
                                if (textView2 != null) {
                                    arrayList.add(textView2);
                                }
                            }
                        }
                    } else if (cVar.k()) {
                        arrayList.add(view);
                    }
                } else if (TextUtils.isEmpty(cVar.o()) || !cVar.o().equals("dsp") || !TextUtils.isEmpty(campaignEx.getClickURL())) {
                    arrayList.add(view);
                }
                eVar.a(view, arrayList);
                return;
            }
            eVar.a(com.mbridge.msdk.video.dynview.c.a.CAMPAIGNEX_IS_NULL);
            return;
        }
        eVar.a(com.mbridge.msdk.video.dynview.c.a.CAMPAIGNEX_IS_NULL);
    }

    public final void a(com.mbridge.msdk.video.dynview.c cVar, View view, e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_iv_adbanner_bg", "id"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.h));
            }
            ImageView imageView2 = (ImageView) view.findViewById(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), "mbridge_iv_adbanner", "id"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.h));
            }
            eVar.a(view, new ArrayList());
        } catch (Exception e) {
            ad.a("DataEnergizeWrapper", e.getMessage());
            eVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
        }
    }

    public final void c(com.mbridge.msdk.video.dynview.c cVar, View view, final Map map, e eVar) {
        try {
            if (this.c == null) {
                this.c = new HashMap();
            }
            final List<CampaignEx> listG = cVar.g();
            if (view.getContext() == null) {
                eVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                j = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            for (CampaignEx campaignEx : listG) {
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(j);
                }
            }
            ListView listView = (ListView) view.findViewById(a(j, "mbridge_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(a(j, "mbridge_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(a(j, "mbridge_order_view_iv_close"));
            com.mbridge.msdk.video.dynview.ordercamp.a.a aVar = new com.mbridge.msdk.video.dynview.ordercamp.a.a(listG);
            if (cVar.e() == 1) {
                if (listView != null) {
                    if (listView != null && cVar != null) {
                        try {
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.height = -1;
                                float fC = (cVar.c() - ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 720.0f)) / 2.0f;
                                int iA = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 10.0f);
                                int i = (int) fC;
                                layoutParams.setMargins(iA, i, iA, i);
                                listView.setLayoutParams(layoutParams);
                            }
                        } catch (Exception e) {
                            ad.b("DataEnergizeWrapper", e.getMessage());
                        }
                    }
                    listView.setAdapter((ListAdapter) aVar);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.mbridge.msdk.video.dynview.j.a.6
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView<?> adapterView, View view2, int i2, long j2) {
                            a.a(a.this, map, listG, i2);
                        }
                    });
                }
            } else if (gridView != null) {
                int iD = (int) cVar.d();
                int size = iD / listG.size();
                int i2 = size / 9;
                int i3 = i2 / 2;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams2.width = iD - (i2 * 2);
                gridView.setLayoutParams(layoutParams2);
                gridView.setColumnWidth((size - i2) - (i3 / 2));
                gridView.setHorizontalSpacing(i3);
                gridView.setStretchMode(0);
                gridView.setNumColumns(listG.size());
                gridView.setAdapter((ListAdapter) aVar);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.mbridge.msdk.video.dynview.j.a.7
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView<?> adapterView, View view2, int i4, long j2) {
                        a.a(a.this, map, listG, i4);
                    }
                });
            }
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.dynview.j.a.8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        a.a(a.this, map);
                    }
                });
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    private void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        a(imageView, str, -1);
    }

    private void a(ImageView imageView, String str, int i) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.c.b.a(imageView.getContext()).a(str, new AnonymousClass9(i, imageView));
    }

    /* compiled from: DataEnergizeWrapper.java */
    /* renamed from: com.mbridge.msdk.video.dynview.j.a$9, reason: invalid class name */
    final class AnonymousClass9 implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3651a;
        final /* synthetic */ ImageView b;

        AnonymousClass9(int i, ImageView imageView) {
            this.f3651a = i;
            this.b = imageView;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(final Bitmap bitmap, String str) {
            if (bitmap != null && !bitmap.isRecycled()) {
                int i = this.f3651a;
                if (i == 501 || i == 802) {
                    com.mbridge.msdk.foundation.same.f.b.a().execute(new Runnable() { // from class: com.mbridge.msdk.video.dynview.j.a.9.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                final Bitmap bitmapA = o.a(bitmap, 10);
                                AnonymousClass9.this.b.post(new Runnable() { // from class: com.mbridge.msdk.video.dynview.j.a.9.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AnonymousClass9.this.b.setImageBitmap(bitmapA);
                                    }
                                });
                            } catch (Exception e) {
                                ad.b("DataEnergizeWrapper", e.getMessage());
                            }
                        }
                    });
                    return;
                } else {
                    this.b.setImageBitmap(bitmap);
                    return;
                }
            }
            int iA = v.a(this.b.getContext(), "mbridge_icon_play_bg", "drawable");
            this.b.setBackgroundColor(Color.parseColor(a.this.g));
            this.b.setImageResource(iA);
            this.b.setScaleType(ImageView.ScaleType.CENTER);
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            try {
                int iA = v.a(this.b.getContext(), "mbridge_icon_play_bg", "drawable");
                this.b.setBackgroundColor(Color.parseColor(a.this.g));
                this.b.setImageResource(iA);
                this.b.setScaleType(ImageView.ScaleType.CENTER);
            } catch (Exception e) {
                ad.a("DataEnergizeWrapper", e.getMessage());
            }
        }
    }

    private void a(final String str, final ImageView imageView, final com.mbridge.msdk.video.dynview.c cVar, final View view) {
        com.mbridge.msdk.foundation.same.c.b.a(imageView.getContext()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.dynview.j.a.10
            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onFailedLoad(String str2, String str3) {
            }

            @Override // com.mbridge.msdk.foundation.same.c.c
            public final void onSuccessLoad(Bitmap bitmap, String str2) {
                ImageView imageView2;
                if (bitmap == null || bitmap.isRecycled() || (imageView2 = imageView) == null) {
                    return;
                }
                imageView2.setImageBitmap(bitmap);
                if (a.this.c != null) {
                    a.this.c.put(SameMD5.getMD5(str), bitmap);
                    a.a(a.this, cVar, view);
                }
            }
        });
        try {
            Bitmap bitmapA = a();
            if (bitmapA == null || bitmapA.isRecycled()) {
                return;
            }
            a(cVar, view);
        } catch (Exception e) {
            ad.b("DataEnergizeWrapper", e.getMessage());
        }
    }

    private int a(boolean z, String str) {
        try {
            if (z) {
                if (TextUtils.isEmpty(str)) {
                    return -1;
                }
                return str.hashCode();
            }
            return v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "id");
        } catch (Exception e) {
            ad.b("DataEnergizeWrapper", e.getMessage());
            return -1;
        }
    }

    private Bitmap a() {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(Color.parseColor(this.h));
            return bitmapCreateBitmap;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return bitmapCreateBitmap;
            }
            e.printStackTrace();
            return bitmapCreateBitmap;
        }
    }

    private void a(com.mbridge.msdk.video.dynview.c cVar, View view) {
        a.C0302a c0302aA = com.mbridge.msdk.video.dynview.g.a.a();
        c0302aA.a(cVar.e()).a(true);
        if (cVar.e() != 2 || cVar.d() > cVar.c()) {
            c0302aA.a(cVar.d()).b(cVar.c());
        } else {
            c0302aA.a(cVar.c()).b(cVar.d());
        }
        if (view.getBackground() == null) {
            view.setBackground(c0302aA.a());
        }
    }

    private void b() {
        com.mbridge.msdk.video.dynview.i.a.a.a().b();
        com.mbridge.msdk.video.dynview.i.c.b bVar = this.b;
        if (bVar != null) {
            bVar.b();
            this.b = null;
        }
        com.mbridge.msdk.video.dynview.b.a.a().f3617a = null;
        if (this.f3640a != null) {
            this.f3640a = null;
        }
        Map<String, Bitmap> map = this.c;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.c.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.c.clear();
        }
    }

    static /* synthetic */ void a(a aVar, Map map, List list, int i) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof d)) {
            d dVar = (d) map.get("choice_one_callback");
            if (dVar != null) {
                dVar.a((CampaignEx) list.get(i));
                try {
                    CampaignEx campaignEx = (CampaignEx) list.get(i);
                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar2.a(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "0");
                    dVar2.a("time", Long.valueOf(aVar.i));
                    dVar2.a("choose_cid", campaignEx.getId());
                    dVar2.a(t2.h.L, Integer.valueOf(i));
                    dVar2.a("type", "choseFromTwoSelect");
                    com.mbridge.msdk.video.module.b.a.a("2000103", campaignEx, dVar2);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
            aVar.b();
            return;
        }
        if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.e.c)) {
            com.mbridge.msdk.video.dynview.e.c cVar = (com.mbridge.msdk.video.dynview.e.c) map.get("order_view_callback");
            if (cVar != null) {
                cVar.a((CampaignEx) list.get(i), i);
            }
            aVar.b();
        }
    }

    static /* synthetic */ void a(a aVar, Map map) {
        if (map != null) {
            try {
                if (map.containsKey("order_view_callback") && (map.get("order_view_callback") instanceof com.mbridge.msdk.video.dynview.e.c)) {
                    ((com.mbridge.msdk.video.dynview.e.c) map.get("order_view_callback")).a();
                    aVar.b();
                }
            } catch (Exception e) {
                ad.b("DataEnergizeWrapper", e.getMessage());
            }
        }
    }

    static /* synthetic */ void a(a aVar, com.mbridge.msdk.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = aVar.c;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.mbridge.msdk.video.dynview.h.b();
        Map<String, Bitmap> map2 = aVar.c;
        if (view != null) {
            com.mbridge.msdk.video.dynview.i.a.a.a().a(map2, cVar, view);
        }
    }

    static /* synthetic */ void b(a aVar, Map map) {
        if (map != null) {
            try {
                if (map.containsKey("choice_one_callback") && (map.get("choice_one_callback") instanceof d)) {
                    ((d) map.get("choice_one_callback")).a();
                    aVar.b();
                }
            } catch (Exception e) {
                ad.b("DataEnergizeWrapper", e.getMessage());
            }
        }
    }
}
