package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.d;
import com.my.target.i6;
import com.my.target.m2;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.pa;
import com.my.target.s6;
import com.my.target.z7;
import java.util.List;

/* loaded from: classes4.dex */
public final class t6 implements d.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4135a;
    public final e7 b;
    public final d6 c;
    public final pa d;
    public final c e;
    public final pa.a f;
    public final g6 g;
    public boolean i;
    public boolean j;
    public boolean l;
    public s6 m;
    public Parcelable n;
    public f7 o;
    public b p;
    public int h = 0;
    public boolean k = true;

    public class a extends pa.a {
        public a() {
        }

        @Override // com.my.target.pa.a
        public void a() {
            t6.this.e();
        }

        @Override // com.my.target.pa.a
        public void a(boolean z) {
            t6.this.d(z);
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final h6 f4137a;
        public final c b;
        public i6 c;

        public b(h6 h6Var, c cVar) {
            this.f4137a = h6Var;
            this.b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i6 i6VarA = i6.a(this.f4137a);
            this.c = i6VarA;
            i6VarA.a(this.b);
            this.c.a(view.getContext());
        }
    }

    public interface c extends s6.b, z7.a, View.OnClickListener, i6.a, m2.a {
        void a(Context context);

        void a(View view);

        void c();

        void f();
    }

    public t6(d6 d6Var, c cVar, e7 e7Var, MenuFactory menuFactory) {
        this.e = cVar;
        this.c = d6Var;
        this.f4135a = d6Var.getNativeAdCards().size() > 0;
        this.b = e7Var;
        this.g = g6.b(d6Var.getAdChoices(), menuFactory, cVar);
        b5<VideoData> videoBanner = d6Var.getVideoBanner();
        this.i = (videoBanner == null || videoBanner.getMediaData() == null) ? false : true;
        this.d = pa.a(d6Var.getViewability(), d6Var.getStatHolder(), videoBanner == null);
        this.f = new a();
    }

    public static t6 a(d6 d6Var, c cVar, e7 e7Var, MenuFactory menuFactory) {
        return new t6(d6Var, cVar, e7Var, menuFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.m.b(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z) {
        if (z) {
            this.e.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(boolean z) {
        if (z) {
            this.e.c();
        }
    }

    public final com.my.target.a a(MediaAdView mediaAdView) {
        int childCount = mediaAdView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mediaAdView.getChildAt(i);
            if (childAt instanceof com.my.target.a) {
                return (com.my.target.a) childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        MediaAdView mediaAdViewE;
        this.i = false;
        this.h = 0;
        s6 s6Var = this.m;
        if (s6Var != null) {
            s6Var.y();
        }
        f7 f7Var = this.o;
        if (f7Var == null || (mediaAdViewE = f7Var.e()) == null) {
            return;
        }
        mediaAdViewE.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        w7 w7VarB = b(mediaAdViewE);
        if (w7VarB != 0) {
            this.n = w7VarB.getState();
            w7VarB.dispose();
            ((View) w7VarB).setVisibility(8);
        }
        a(mediaAdViewE, this.c.getImage());
        mediaAdViewE.getImageView().setVisibility(0);
        mediaAdViewE.getProgressBarView().setVisibility(8);
        mediaAdViewE.getPlayButtonView().setVisibility(8);
        if (this.k) {
            mediaAdViewE.setOnClickListener(this.e);
        }
    }

    @Override // com.my.target.d.a
    public void a(Context context) {
        this.e.a(context);
    }

    public void a(View view, List<View> list, int i, MediaAdView mediaAdView) {
        if (!(view instanceof ViewGroup)) {
            ba.b("NativeAdViewController: Unable to register view for displaying NativeAd " + view + ", should be instance of ViewGroup");
            return;
        }
        if (this.l) {
            ba.b("NativeAdViewController: Registering ad was disabled by user");
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) view;
        f7 f7VarA = f7.a(viewGroup, list, mediaAdView, this.e);
        this.o = f7VarA;
        z7 z7VarF = f7VarA.f();
        this.k = this.o.h();
        h6 content = this.c.getContent();
        if (content != null) {
            this.p = new b(content, this.e);
        }
        IconAdView iconAdViewD = this.o.d();
        if (iconAdViewD == null) {
            ba.b("NativeAdViewController: IconAdView component not found in ad view " + viewGroup.getClass().getName() + ". It will be required in future versions of sdk.");
        } else {
            x8.c();
        }
        MediaAdView mediaAdViewE = this.o.e();
        if (mediaAdViewE == null) {
            ba.b("NativeAdViewController: MediaAdView component not found in ad view " + viewGroup.getClass().getName() + ". It will be required in future versions of sdk.");
        } else {
            x8.d();
        }
        this.d.a(this.f);
        this.g.a(viewGroup, this.o.b(), this, i);
        if (this.f4135a && z7VarF != null) {
            a(z7VarF);
        } else if (mediaAdViewE != null) {
            d(mediaAdViewE);
        }
        if (iconAdViewD != null) {
            a(iconAdViewD);
        }
        x8.b(viewGroup.getContext());
        this.d.b(viewGroup);
    }

    public final void a(IconAdView iconAdView) {
        ImageView imageView = iconAdView.getImageView();
        if (imageView instanceof i9) {
            i9 i9Var = (i9) imageView;
            ImageData icon = this.c.getIcon();
            if (icon == null) {
                imageView.setImageBitmap(null);
                i9Var.setPlaceholderDimensions(0, 0);
                return;
            }
            int width = icon.getWidth();
            int height = icon.getHeight();
            if (width <= 0 || height <= 0) {
                width = 100;
                height = 100;
            }
            i9Var.setPlaceholderDimensions(width, height);
            Bitmap bitmap = icon.getBitmap();
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                m2.a(icon, imageView, new m2.a() { // from class: com.my.target.t6$$ExternalSyntheticLambda2
                    @Override // com.my.target.m2.a
                    public final void a(boolean z) {
                        this.f$0.c(z);
                    }
                });
            }
        }
    }

    public final void a(MediaAdView mediaAdView, ImageData imageData) {
        if (imageData == null) {
            mediaAdView.setPlaceHolderDimension(0, 0);
            return;
        }
        int width = imageData.getWidth();
        int height = imageData.getHeight();
        if (!this.j && width > 0 && height > 0) {
            mediaAdView.setPlaceHolderDimension(width, height);
        } else {
            mediaAdView.setPlaceHolderDimension(16, 9);
            this.j = true;
        }
    }

    public final void a(MediaAdView mediaAdView, s6 s6Var) {
        s6Var.a((View.OnClickListener) this.e);
        f7 f7Var = this.o;
        if (f7Var == null) {
            return;
        }
        s6Var.a(mediaAdView, f7Var.c());
    }

    public final void a(MediaAdView mediaAdView, boolean z, s6.b bVar) {
        VideoData videoData;
        this.h = 1;
        b5<VideoData> videoBanner = this.c.getVideoBanner();
        if (videoBanner != null) {
            mediaAdView.setPlaceHolderDimension(videoBanner.getWidth(), videoBanner.getHeight());
            videoData = (VideoData) videoBanner.getMediaData();
        } else {
            videoData = null;
        }
        if (videoData == null) {
            return;
        }
        if (this.m == null) {
            this.m = new s6(this.c, videoBanner, videoData, this.b);
        }
        View.OnClickListener onClickListener = this.p;
        if (onClickListener == null) {
            onClickListener = new View.OnClickListener() { // from class: com.my.target.t6$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.a(view);
                }
            };
        }
        mediaAdView.setOnClickListener(onClickListener);
        this.m.a(bVar);
        this.m.c(z);
        this.m.a(z);
        a(mediaAdView, this.m);
    }

    public final void a(z7 z7Var) {
        this.h = 2;
        z7Var.setPromoCardSliderListener(this.e);
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            z7Var.restoreState(parcelable);
        }
    }

    public void a(boolean z) {
        s6 s6Var = this.m;
        if (s6Var == null) {
            return;
        }
        if (z) {
            s6Var.v();
        } else {
            s6Var.u();
        }
    }

    public final w7 b(MediaAdView mediaAdView) {
        if (!this.f4135a) {
            return null;
        }
        for (int i = 0; i < mediaAdView.getChildCount(); i++) {
            KeyEvent.Callback childAt = mediaAdView.getChildAt(i);
            if (childAt instanceof z7) {
                return (w7) childAt;
            }
        }
        return null;
    }

    public void b(Context context) {
        w9.a(this.c.getStatHolder().b("closedByUser"), context);
        this.d.d();
        this.d.a((pa.a) null);
        a(false);
        this.l = true;
        f7 f7Var = this.o;
        ViewGroup viewGroupG = f7Var != null ? f7Var.g() : null;
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
        ImageData icon = this.c.getIcon();
        if (icon != null) {
            m2.a(icon, imageView);
        }
    }

    public final void b(MediaAdView mediaAdView, ImageData imageData) {
        i9 i9Var = (i9) mediaAdView.getImageView();
        if (imageData == null) {
            i9Var.setImageBitmap(null);
            return;
        }
        Bitmap bitmap = imageData.getBitmap();
        if (bitmap != null) {
            i9Var.setImageBitmap(bitmap);
        } else {
            i9Var.setImageBitmap(null);
            m2.a(imageData, i9Var, new m2.a() { // from class: com.my.target.t6$$ExternalSyntheticLambda1
                @Override // com.my.target.m2.a
                public final void a(boolean z) {
                    this.f$0.b(z);
                }
            });
        }
    }

    public int[] b() {
        z7 z7VarB;
        f7 f7Var = this.o;
        if (f7Var == null) {
            return null;
        }
        int i = this.h;
        if (i == 2) {
            z7VarB = f7Var.f();
        } else if (i == 3) {
            MediaAdView mediaAdViewE = f7Var.e();
            if (mediaAdViewE == null) {
                return null;
            }
            z7VarB = b(mediaAdViewE);
        } else {
            z7VarB = null;
        }
        if (z7VarB == null) {
            return null;
        }
        return z7VarB.getVisibleCardNumbers();
    }

    public final com.my.target.a c(MediaAdView mediaAdView) {
        com.my.target.a aVarA = a(mediaAdView);
        if (aVarA == null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            com.my.target.a aVar = new com.my.target.a(mediaAdView.getContext());
            mediaAdView.addView(aVar, layoutParams);
            aVarA = aVar;
        }
        aVarA.a(this.c.getCtcText(), this.c.getCtcIcon());
        aVarA.setOnClickListener(this.p);
        return aVarA;
    }

    public void c(Context context) {
        this.g.a(context);
    }

    public final void c(MediaAdView mediaAdView, ImageData imageData) {
        a(mediaAdView, imageData);
        if (this.h == 2) {
            return;
        }
        this.h = 3;
        Context context = mediaAdView.getContext();
        w7 w7VarB = b(mediaAdView);
        if (w7VarB == null) {
            w7VarB = new v7(context);
            mediaAdView.addView(w7VarB.getView(), new ViewGroup.LayoutParams(-1, -1));
        }
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            w7VarB.restoreState(parcelable);
        }
        w7VarB.getView().setClickable(this.k);
        w7VarB.setupCards(this.c.getNativeAdCards());
        w7VarB.setPromoCardSliderListener(this.e);
        w7VarB.setVisibility(0);
        mediaAdView.setBackgroundColor(0);
    }

    public final void d(MediaAdView mediaAdView) {
        ImageData image = this.c.getImage();
        if (this.f4135a) {
            c(mediaAdView, image);
            return;
        }
        b(mediaAdView, image);
        com.my.target.a aVarC = this.p != null ? c(mediaAdView) : null;
        if (this.i) {
            a(mediaAdView, aVarC != null, this.e);
        } else {
            d(mediaAdView, image);
        }
    }

    public final void d(MediaAdView mediaAdView, ImageData imageData) {
        a(mediaAdView, imageData);
        this.h = 0;
        mediaAdView.getImageView().setVisibility(0);
        mediaAdView.getPlayButtonView().setVisibility(8);
        mediaAdView.getProgressBarView().setVisibility(8);
        if (this.k) {
            View.OnClickListener onClickListener = this.p;
            if (onClickListener == null) {
                onClickListener = this.e;
            }
            mediaAdView.setOnClickListener(onClickListener);
        }
    }

    public void d(boolean z) {
        f7 f7Var = this.o;
        if (f7Var == null || f7Var.g() == null) {
            g();
        } else if (this.h == 1) {
            a(z);
        }
    }

    public void e() {
        f7 f7Var = this.o;
        ViewGroup viewGroupG = f7Var != null ? f7Var.g() : null;
        if (viewGroupG != null) {
            this.e.a(viewGroupG);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(MediaAdView mediaAdView) {
        ImageData image = this.c.getImage();
        i9 i9Var = (i9) mediaAdView.getImageView();
        if (image != null) {
            m2.a(image, i9Var);
        }
        i9Var.setImageData(null);
        mediaAdView.getProgressBarView().setVisibility(8);
        mediaAdView.getPlayButtonView().setVisibility(8);
        mediaAdView.setPlaceHolderDimension(0, 0);
        mediaAdView.setOnClickListener(null);
        mediaAdView.setBackgroundColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        w7 w7VarB = b(mediaAdView);
        if (w7VarB != 0) {
            this.n = w7VarB.getState();
            w7VarB.dispose();
            ((View) w7VarB).setVisibility(8);
        }
        com.my.target.a aVarA = a(mediaAdView);
        if (aVarA != null) {
            mediaAdView.removeView(aVarA);
        }
    }

    public final void f() {
        s6 s6Var = this.m;
        if (s6Var == null) {
            return;
        }
        s6Var.y();
    }

    public void g() {
        this.d.d();
        this.d.a((pa.a) null);
        f();
        f7 f7Var = this.o;
        if (f7Var == null) {
            return;
        }
        IconAdView iconAdViewD = f7Var.d();
        if (iconAdViewD != null) {
            b(iconAdViewD);
        }
        MediaAdView mediaAdViewE = this.o.e();
        if (mediaAdViewE != null) {
            e(mediaAdViewE);
        }
        z7 z7VarF = this.o.f();
        if (z7VarF != null) {
            z7VarF.setPromoCardSliderListener(null);
            this.n = z7VarF.getState();
            z7VarF.dispose();
        }
        ViewGroup viewGroupG = this.o.g();
        if (viewGroupG != null) {
            this.g.b(viewGroupG);
            viewGroupG.setVisibility(0);
        }
        this.o.a();
        this.o = null;
        this.p = null;
    }
}
