package com.mbridge.msdk.video.dynview.ordercamp.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.video.dynview.h.b;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* compiled from: OrderCampAdapter.java */
/* loaded from: classes4.dex */
public final class a extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3669a = false;
    private C0305a b;
    private List<CampaignEx> c;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public a(List<CampaignEx> list) {
        this.c = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<CampaignEx> list = this.c;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List<CampaignEx> list = this.c;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) throws Throwable {
        View viewA;
        try {
            if (view == null) {
                viewA = a(i);
            } else {
                this.b = (C0305a) view.getTag();
                viewA = view;
            }
        } catch (Exception e) {
            e = e;
            viewA = view;
        }
        try {
            this.b.f3671a = (RelativeLayout) viewA.findViewById(d("mbridge_lv_item_rl"));
            this.b.e = (TextView) viewA.findViewById(d("mbridge_lv_title_tv"));
            this.b.g = (TextView) viewA.findViewById(d("mbridge_lv_tv_install"));
            this.b.o = (MBHeatLevelLayoutView) viewA.findViewById(d("mbridge_lv_sv_heat_level"));
            this.b.f = (TextView) viewA.findViewById(d("mbridge_lv_desc_tv"));
            this.b.j = (ImageView) viewA.findViewById(d("mbridge_iv_flag"));
            this.b.h = (TextView) viewA.findViewById(d("mbridge_order_viewed_tv"));
            double d = 5.0d;
            if (this.f3669a) {
                List<CampaignEx> list = this.c;
                if (list != null && this.b != null && list.size() != 0) {
                    if (this.b.l != null && (this.b.l instanceof MBCusRoundImageView)) {
                        this.b.l.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                        a(this.b.l, this.c.get(i).getImageUrl(), false);
                    }
                    if (this.b.k != null) {
                        a(this.b.k, this.c.get(i).getImageUrl(), false);
                    }
                    if (this.b.m != null && (this.b.m instanceof MBCusRoundImageView)) {
                        this.b.m.setBorder(50, 20, -1);
                        a(this.b.m, this.c.get(i).getIconUrl(), true);
                    }
                    double rating = this.c.get(i).getRating();
                    if (rating > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        d = rating;
                    }
                    if (this.b.n != null) {
                        this.b.n.setRating((int) d);
                        this.b.n.setOrientation(0);
                    }
                    if (this.b.o != null) {
                        this.b.o.setHeatCount(this.c.get(i).getNumberRating());
                    }
                }
            } else {
                List<CampaignEx> list2 = this.c;
                if (list2 != null && this.b != null && list2.size() != 0) {
                    if (this.b.c != null) {
                        a(this.b.c, this.c.get(i).getImageUrl(), false);
                    }
                    if (this.b.k != null) {
                        a(this.b.k, this.c.get(i).getImageUrl(), false);
                    }
                    if (this.b.d != null) {
                        this.b.d.setBorderRadius(25);
                        a(this.b.d, this.c.get(i).getIconUrl(), true);
                    }
                    double rating2 = this.c.get(i).getRating();
                    if (rating2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        d = rating2;
                    }
                    if (this.b.i != null) {
                        this.b.i.setRatingAndUser(d, this.c.get(i).getNumberRating());
                        this.b.i.setOrientation(0);
                    }
                    if (this.b.b != null) {
                        this.b.b.setWidthRatio(1.0f);
                        this.b.b.setHeightRatio(1.0f);
                        this.b.b.setAutoscroll(false);
                    }
                    if (this.b.c != null) {
                        this.b.c.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                    }
                }
            }
            C0305a c0305a = this.b;
            if (c0305a != null) {
                if (c0305a.e != null) {
                    this.b.e.setText(this.c.get(i).getAppName());
                }
                if (this.b.f != null) {
                    this.b.f.setText(this.c.get(i).getAppDesc());
                }
                if (this.b.g != null) {
                    String adCall = this.c.get(i).getAdCall();
                    if (this.b.g instanceof MBridgeTextView) {
                        ((MBridgeTextView) this.b.g).setObjectAnimator(new b().c(this.b.g));
                    }
                    this.b.g.setText(adCall);
                }
                if (this.b.j != null) {
                    try {
                        String language = Locale.getDefault().getLanguage();
                        Context contextC = c.m().c();
                        if (contextC != null) {
                            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                                this.b.j.setImageDrawable(contextC.getResources().getDrawable(contextC.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", c.m().g())));
                            } else {
                                this.b.j.setImageDrawable(contextC.getResources().getDrawable(contextC.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", c.m().g())));
                            }
                        }
                    } catch (Exception e2) {
                        ad.b("OrderCampAdapter", e2.getMessage());
                    }
                    ai.a(2, this.b.j, this.c.get(i), c.m().c(), false, null);
                }
                if (this.b.h != null) {
                    try {
                        this.b.h.setText(c.m().c().getResources().getString(c.m().c().getResources().getIdentifier("mbridge_reward_viewed_text_str", TypedValues.Custom.S_STRING, c.m().g())));
                        this.b.h.setVisibility(0);
                    } catch (Exception e3) {
                        ad.b("OrderCampAdapter", e3.getMessage());
                    }
                }
            }
        } catch (Exception e4) {
            e = e4;
            ad.b("OrderCampAdapter", e.getMessage());
            return viewA;
        }
        return viewA;
    }

    private View a(int i) throws Throwable {
        View viewCreateDynamicView;
        String cMPTEntryUrl;
        String str;
        try {
            List<CampaignEx> list = this.c;
            cMPTEntryUrl = "";
            if (list == null || list.get(i) == null) {
                str = "501";
            } else {
                str = this.c.get(i).getMof_tplid() + "";
                cMPTEntryUrl = this.c.get(i).getCMPTEntryUrl();
            }
        } catch (Exception e) {
            ad.b("OrderCampAdapter", e.getMessage());
            viewCreateDynamicView = null;
        }
        if (TextUtils.isEmpty(cMPTEntryUrl)) {
            return a();
        }
        int iR = z.r(c.m().c());
        String strA = n.a(0, str, cMPTEntryUrl);
        if (TextUtils.isEmpty(strA)) {
            return a();
        }
        File file = new File(strA + File.separator + "template_config.json");
        if (file.isFile() && file.exists()) {
            List<String> listA = ab.a(strA, "template_" + str + "_" + iR + "_item");
            if (listA == null) {
                return a();
            }
            int iR2 = z.r(c.m().c());
            h.a().b(c.m().k());
            viewCreateDynamicView = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(this.c.get(i)).fileDirs(listA).dyAdType(DyAdType.REWARD).orientation(iR2).adChoiceLink(ai.a(this.c.get(i))).build());
            if (viewCreateDynamicView != null) {
                this.f3669a = true;
                C0305a c0305a = new C0305a();
                this.b = c0305a;
                c0305a.l = (MBCusRoundImageView) viewCreateDynamicView.findViewById(c("mbridge_lv_iv"));
                this.b.k = (ImageView) viewCreateDynamicView.findViewById(c("mbridge_lv_iv_burl"));
                this.b.m = (MBCusRoundImageView) viewCreateDynamicView.findViewById(c("mbridge_lv_icon_iv"));
                this.b.n = (MBStarLevelLayoutView) viewCreateDynamicView.findViewById(c("mbridge_lv_sv_starlevel"));
                this.b.p = (MBFrameLayout) viewCreateDynamicView.findViewById(c("mbridge_lv_ration"));
                viewCreateDynamicView.setTag(this.b);
            }
            return this.f3669a ? viewCreateDynamicView : a();
        }
        return a();
    }

    private View a() {
        View viewInflate = LayoutInflater.from(c.m().c()).inflate(a("mbridge_order_layout_item"), (ViewGroup) null);
        C0305a c0305a = new C0305a();
        this.b = c0305a;
        c0305a.c = (MBridgeImageView) viewInflate.findViewById(b("mbridge_lv_iv"));
        this.b.k = (ImageView) viewInflate.findViewById(b("mbridge_lv_iv_burl"));
        this.b.d = (RoundImageView) viewInflate.findViewById(b("mbridge_lv_icon_iv"));
        this.b.i = (MBridgeLevelLayoutView) viewInflate.findViewById(b("mbridge_lv_sv_starlevel"));
        this.b.b = (MBRotationView) viewInflate.findViewById(b("mbridge_lv_ration"));
        viewInflate.setTag(this.b);
        return viewInflate;
    }

    private void a(final ImageView imageView, String str, final boolean z) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.mbridge.msdk.foundation.same.c.b.a(imageView.getContext()).a(str, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.video.dynview.ordercamp.a.a.1
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str2) {
                    try {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        imageView.setImageBitmap(bitmap);
                    } catch (Throwable th) {
                        ad.b("OrderCampAdapter", th.getMessage());
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str2, String str3) {
                    if (z) {
                        imageView.setVisibility(8);
                    }
                }
            });
        } else if (z) {
            imageView.setVisibility(8);
        }
    }

    /* compiled from: OrderCampAdapter.java */
    /* renamed from: com.mbridge.msdk.video.dynview.ordercamp.a.a$a, reason: collision with other inner class name */
    static class C0305a {

        /* renamed from: a, reason: collision with root package name */
        RelativeLayout f3671a;
        MBRotationView b;
        MBridgeImageView c;
        RoundImageView d;
        TextView e;
        TextView f;
        TextView g;
        TextView h;
        MBridgeLevelLayoutView i;
        ImageView j;
        ImageView k;
        MBCusRoundImageView l;
        MBCusRoundImageView m;
        MBStarLevelLayoutView n;
        MBHeatLevelLayoutView o;
        MBFrameLayout p;

        C0305a() {
        }
    }

    private int a(String str) {
        return v.a(c.m().c().getApplicationContext(), str, "layout");
    }

    private int b(String str) {
        return v.a(c.m().c().getApplicationContext(), str, "id");
    }

    private int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private int d(String str) {
        if (this.f3669a) {
            return c(str);
        }
        return b(str);
    }
}
