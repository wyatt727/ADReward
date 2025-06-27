package com.mbridge.msdk.video.dynview.i.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.f.b;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.o;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.g.a;
import java.util.List;
import java.util.Map;

/* compiled from: ChoiceOneDrawBitBg.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f3635a;
    private View b;
    private Bitmap c;
    private Bitmap d;

    private a() {
    }

    public static a a() {
        a aVar;
        if (f3635a == null) {
            synchronized (a.class) {
                if (f3635a == null) {
                    f3635a = new a();
                }
                aVar = f3635a;
            }
            return aVar;
        }
        return f3635a;
    }

    public final void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.g() == null || cVar.g().size() < 2) {
            return;
        }
        this.b = view;
        int iE = cVar.e();
        float fD = cVar.d();
        float fC = cVar.c();
        try {
            List<CampaignEx> listG = cVar.g();
            String md5 = listG.get(0) != null ? SameMD5.getMD5(listG.get(0).getImageUrl()) : "";
            String md52 = listG.get(1) != null ? SameMD5.getMD5(listG.get(1).getImageUrl()) : "";
            Bitmap bitmap = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            Bitmap bitmap2 = (TextUtils.isEmpty(md52) || !map.containsKey(md52)) ? null : map.get(md52);
            if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            a(iE, fD, fC, bitmap, bitmap2);
        } catch (Exception e) {
            ad.b("ChoiceOneDrawBitBg", e.getMessage());
        }
    }

    private synchronized void a(final int i, final float f, final float f2, final Bitmap bitmap, Bitmap bitmap2) {
        try {
            b.a().execute(new Runnable() { // from class: com.mbridge.msdk.video.dynview.i.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Bitmap bitmapA = o.a(bitmap, 10);
                        Bitmap bitmapA2 = o.a(bitmap, 10);
                        final a.C0302a c0302aA = com.mbridge.msdk.video.dynview.g.a.a();
                        c0302aA.a(i).a(bitmapA).b(bitmapA2);
                        if (i == 2) {
                            float f3 = f;
                            float f4 = f2;
                            if (f3 > f4) {
                                c0302aA.a(f3).b(f2);
                            } else {
                                c0302aA.a(f4).b(f);
                            }
                        } else {
                            c0302aA.a(f).b(f2);
                        }
                        if (a.this.b != null) {
                            a.this.b.post(new Runnable() { // from class: com.mbridge.msdk.video.dynview.i.a.a.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (a.this.b == null || c0302aA.a() == null) {
                                        return;
                                    }
                                    a.this.b.setBackground(c0302aA.a());
                                }
                            });
                        }
                    } catch (Exception e) {
                        ad.b("ChoiceOneDrawBitBg", e.getMessage());
                    }
                }
            });
        } catch (Exception e) {
            ad.a("ChoiceOneDrawBitBg", e.getMessage());
        }
    }

    public final void b() {
        if (this.b != null) {
            this.b = null;
        }
        Bitmap bitmap = this.c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.c.recycle();
            this.c = null;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.d.recycle();
        this.d = null;
    }
}
