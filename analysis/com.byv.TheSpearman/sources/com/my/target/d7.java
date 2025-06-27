package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.d;
import com.my.target.m2;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.pa;
import java.util.List;

/* loaded from: classes4.dex */
public class d7 implements d.a {

    /* renamed from: a, reason: collision with root package name */
    public final d6 f3947a;
    public final pa b;
    public final b c;
    public final pa.a d = new a();
    public final g6 e;
    public f7 f;
    public boolean g;

    public class a extends pa.a {
        public a() {
        }

        @Override // com.my.target.pa.a
        public void a() {
            d7.this.a();
        }
    }

    public interface b extends View.OnClickListener, m2.a {
        void a(View view);

        void b(Context context);

        void c();
    }

    public d7(d6 d6Var, b bVar, MenuFactory menuFactory) {
        this.c = bVar;
        this.f3947a = d6Var;
        this.e = g6.b(d6Var.getAdChoices(), menuFactory, bVar);
        this.b = pa.a(d6Var.getViewability(), d6Var.getStatHolder(), true);
    }

    public static d7 a(d6 d6Var, b bVar, MenuFactory menuFactory) {
        return new d7(d6Var, bVar, menuFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        if (z) {
            this.c.c();
        }
    }

    public void a() {
        f7 f7Var = this.f;
        ViewGroup viewGroupG = f7Var != null ? f7Var.g() : null;
        if (viewGroupG != null) {
            this.c.a(viewGroupG);
        }
    }

    @Override // com.my.target.d.a
    public void a(Context context) {
        this.c.b(context);
    }

    public void a(View view, List<View> list, int i) {
        if (this.g) {
            ba.b("Registering ad was disabled by user");
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            ba.b("unable to register view for displaying NativeBannerAd " + view + ", should be instance of ViewGroup");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        f7 f7VarA = f7.a(viewGroup, list, this.c);
        this.f = f7VarA;
        IconAdView iconAdViewD = f7VarA.d();
        if (iconAdViewD == null) {
            ba.b("IconAdView component not found in ad view  " + viewGroup + ". It's required");
            return;
        }
        x8.c();
        a(iconAdViewD);
        this.b.a(this.d);
        this.e.a(viewGroup, this.f.b(), this, i);
        x8.b(viewGroup.getContext());
        this.b.b(viewGroup);
    }

    public final void a(IconAdView iconAdView) {
        ImageView imageView = iconAdView.getImageView();
        if (imageView instanceof i9) {
            ImageData icon = this.f3947a.getIcon();
            if (icon == null) {
                imageView.setImageBitmap(null);
                ((i9) imageView).setPlaceholderDimensions(0, 0);
                return;
            }
            Bitmap bitmap = icon.getBitmap();
            int width = icon.getWidth();
            int height = icon.getHeight();
            if (width <= 0 || height <= 0) {
                width = 100;
                height = 100;
            }
            ((i9) imageView).setPlaceholderDimensions(width, height);
            if (bitmap == null) {
                m2.a(icon, imageView, new m2.a() { // from class: com.my.target.d7$$ExternalSyntheticLambda0
                    @Override // com.my.target.m2.a
                    public final void a(boolean z) {
                        this.f$0.a(z);
                    }
                });
            } else {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public void b() {
        this.b.d();
        this.b.a((pa.a) null);
        f7 f7Var = this.f;
        if (f7Var == null) {
            return;
        }
        IconAdView iconAdViewD = f7Var.d();
        if (iconAdViewD != null) {
            b(iconAdViewD);
        }
        ViewGroup viewGroupG = this.f.g();
        if (viewGroupG != null) {
            this.e.b(viewGroupG);
            viewGroupG.setVisibility(0);
        }
        this.f.a();
        this.f = null;
    }

    public void b(Context context) {
        w9.a(this.f3947a.getStatHolder().b("closedByUser"), context);
        f7 f7Var = this.f;
        ViewGroup viewGroupG = f7Var != null ? f7Var.g() : null;
        this.b.d();
        this.b.a((pa.a) null);
        this.g = true;
        if (viewGroupG != null) {
            viewGroupG.setVisibility(4);
        }
    }

    public final void b(IconAdView iconAdView) {
        iconAdView.setOnClickListener(null);
        ImageView imageView = iconAdView.getImageView();
        imageView.setImageBitmap(null);
        if (imageView instanceof i9) {
            ((i9) imageView).setPlaceholderDimensions(0, 0);
        }
        ImageData icon = this.f3947a.getIcon();
        if (icon != null) {
            m2.a(icon, imageView);
        }
    }

    public void c(Context context) {
        this.e.a(context);
    }
}
