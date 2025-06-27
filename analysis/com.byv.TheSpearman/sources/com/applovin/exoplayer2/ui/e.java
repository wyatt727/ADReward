package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.applovin.exoplayer2.ui.AspectRatioFrameLayout;
import com.applovin.exoplayer2.ui.d;
import com.applovin.impl.a1;
import com.applovin.impl.ab;
import com.applovin.impl.df;
import com.applovin.impl.go;
import com.applovin.impl.kh;
import com.applovin.impl.mh;
import com.applovin.impl.nh;
import com.applovin.impl.od;
import com.applovin.impl.p6;
import com.applovin.impl.qd;
import com.applovin.impl.qo;
import com.applovin.impl.r4;
import com.applovin.impl.r7;
import com.applovin.impl.t;
import com.applovin.impl.to;
import com.applovin.impl.uo;
import com.applovin.impl.we;
import com.applovin.impl.yp;
import com.applovin.impl.yq;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class e extends FrameLayout {
    private boolean A;

    /* renamed from: a, reason: collision with root package name */
    private final a f222a;
    private final AspectRatioFrameLayout b;
    private final View c;
    private final View d;
    private final boolean f;
    private final ImageView g;
    private final SubtitleView h;
    private final View i;
    private final TextView j;
    private final d k;
    private final FrameLayout l;
    private final FrameLayout m;
    private nh n;
    private boolean o;
    private d.e p;
    private boolean q;
    private Drawable r;
    private int s;
    private boolean t;
    private CharSequence u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public e(Context context) {
        this(context, null);
    }

    private boolean a(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    private boolean m() {
        if (!this.q) {
            return false;
        }
        a1.b(this.g);
        return true;
    }

    private boolean n() {
        if (!this.o) {
            return false;
        }
        a1.b(this.k);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        nh nhVar = this.n;
        if (nhVar != null && nhVar.d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zA = a(keyEvent.getKeyCode());
        if ((zA && n() && !this.k.c()) || a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            a(true);
            return true;
        }
        if (!zA || !n()) {
            return false;
        }
        a(true);
        return false;
    }

    public List<t> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            arrayList.add(new t(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        d dVar = this.k;
        if (dVar != null) {
            arrayList.add(new t(dVar, 0));
        }
        return ab.a((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) a1.a(this.l, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.w;
    }

    public boolean getControllerHideOnTouch() {
        return this.y;
    }

    public int getControllerShowTimeoutMs() {
        return this.v;
    }

    public Drawable getDefaultArtwork() {
        return this.r;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.m;
    }

    public int getResizeMode() {
        a1.b(this.b);
        return this.b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.h;
    }

    public boolean getUseArtwork() {
        return this.q;
    }

    public boolean getUseController() {
        return this.o;
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n() || this.n == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A = true;
            return true;
        }
        if (action != 1 || !this.A) {
            return false;
        }
        this.A = false;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!n() || this.n == null) {
            return false;
        }
        a(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return g();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        a1.b(this.b);
        this.b.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.w = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.x = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        a1.b(this.k);
        this.y = z;
        j();
    }

    public void setControllerShowTimeoutMs(int i) {
        a1.b(this.k);
        this.v = i;
        if (this.k.c()) {
            f();
        }
    }

    public void setControllerVisibilityListener(d.e eVar) {
        a1.b(this.k);
        d.e eVar2 = this.p;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            this.k.b(eVar2);
        }
        this.p = eVar;
        if (eVar != null) {
            this.k.a(eVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        a1.b(this.j != null);
        this.u = charSequence;
        l();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.r != drawable) {
            this.r = drawable;
            c(false);
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.t != z) {
            this.t = z;
            c(false);
        }
    }

    public void setPlayer(nh nhVar) {
        a1.b(Looper.myLooper() == Looper.getMainLooper());
        a1.a(nhVar == null || nhVar.p() == Looper.getMainLooper());
        nh nhVar2 = this.n;
        if (nhVar2 == nhVar) {
            return;
        }
        if (nhVar2 != null) {
            nhVar2.a(this.f222a);
            if (nhVar2.b(26)) {
                View view = this.d;
                if (view instanceof TextureView) {
                    nhVar2.b((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    nhVar2.b((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.n = nhVar;
        if (n()) {
            this.k.setPlayer(nhVar);
        }
        i();
        l();
        c(true);
        if (nhVar == null) {
            c();
            return;
        }
        if (nhVar.b(26)) {
            View view2 = this.d;
            if (view2 instanceof TextureView) {
                nhVar.a((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                nhVar.a((SurfaceView) view2);
            }
            h();
        }
        if (this.h != null && nhVar.b(27)) {
            this.h.setCues(nhVar.x());
        }
        nhVar.b(this.f222a);
        a(false);
    }

    public void setRepeatToggleModes(int i) {
        a1.b(this.k);
        this.k.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        a1.b(this.b);
        this.b.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.s != i) {
            this.s = i;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        a1.b(this.k);
        this.k.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        a1.b(this.k);
        this.k.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        a1.b(this.k);
        this.k.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        a1.b(this.k);
        this.k.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        a1.b(this.k);
        this.k.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        a1.b(this.k);
        this.k.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        a1.b((z && this.g == null) ? false : true);
        if (this.q != z) {
            this.q = z;
            c(false);
        }
    }

    public void setUseController(boolean z) {
        a1.b((z && this.k == null) ? false : true);
        if (this.o == z) {
            return;
        }
        this.o = z;
        if (n()) {
            this.k.setPlayer(this.n);
        } else {
            d dVar = this.k;
            if (dVar != null) {
                dVar.a();
                this.k.setPlayer(null);
            }
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b(boolean z) {
        if (n()) {
            this.k.setShowTimeoutMs(z ? 0 : this.v);
            this.k.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        nh nhVar = this.n;
        return nhVar != null && nhVar.d() && this.n.l();
    }

    private boolean e() {
        nh nhVar = this.n;
        if (nhVar == null) {
            return true;
        }
        int iO = nhVar.o();
        return this.w && (iO == 1 || iO == 4 || !this.n.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        nh nhVar = this.n;
        yq yqVarZ = nhVar != null ? nhVar.z() : yq.f;
        int i = yqVarZ.f1215a;
        int i2 = yqVarZ.b;
        int i3 = yqVarZ.c;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * yqVarZ.d) / i2;
        View view = this.d;
        if (view instanceof TextureView) {
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.z != 0) {
                view.removeOnLayoutChangeListener(this.f222a);
            }
            this.z = i3;
            if (i3 != 0) {
                this.d.addOnLayoutChangeListener(this.f222a);
            }
            b((TextureView) this.d, this.z);
        }
        a(this.b, this.f ? 0.0f : f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int i;
        if (this.i != null) {
            nh nhVar = this.n;
            boolean z = true;
            if (nhVar == null || nhVar.o() != 2 || ((i = this.s) != 2 && (i != 1 || !this.n.l()))) {
                z = false;
            }
            this.i.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        d dVar = this.k;
        if (dVar == null || !this.o) {
            setContentDescription(null);
        } else if (dVar.getVisibility() == 0) {
            setContentDescription(this.y ? getResources().getString(R.string.al_exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.al_exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (d() && this.x) {
            c();
        } else {
            a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        TextView textView = this.j;
        if (textView != null) {
            CharSequence charSequence = this.u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.j.setVisibility(0);
            } else {
                nh nhVar = this.n;
                if (nhVar != null) {
                    nhVar.c();
                }
                this.j.setVisibility(8);
            }
        }
    }

    public void c() {
        d dVar = this.k;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void f() {
        b(e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int integer;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8;
        int i7;
        boolean z9;
        super(context, attributeSet, i);
        a aVar = new a();
        this.f222a = aVar;
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.f = false;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            ImageView imageView = new ImageView(context);
            if (yp.f1214a >= 23) {
                b(getResources(), imageView);
            } else {
                a(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i8 = R.layout.applovin_exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinPlayerView, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R.styleable.AppLovinPlayerView_al_shutter_background_color);
                int color = typedArrayObtainStyledAttributes.getColor(R.styleable.AppLovinPlayerView_al_shutter_background_color, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_player_layout_id, i8);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_artwork, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_default_artwork, 0);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_controller, true);
                int i9 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_surface_type, 1);
                int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_resize_mode, 0);
                int i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_show_timeout, 5000);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_on_touch, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_auto_show, true);
                integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.AppLovinPlayerView_al_show_buffering, 0);
                this.t = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_keep_content_on_player_reset, this.t);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z3 = z12;
                z = z13;
                i3 = i10;
                z6 = z11;
                i6 = resourceId2;
                z5 = z10;
                i5 = color;
                z4 = zHasValue;
                i4 = i9;
                i8 = resourceId;
                i2 = i11;
                z2 = z14;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z = true;
            i3 = 0;
            z2 = true;
            integer = 0;
            z3 = true;
            i4 = 1;
            z4 = false;
            i5 = 0;
            z5 = true;
            i6 = 0;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.al_exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a(aspectRatioFrameLayout, i3);
        }
        View viewFindViewById = findViewById(R.id.al_exo_shutter);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z4) {
            viewFindViewById.setBackgroundColor(i5);
        }
        if (aspectRatioFrameLayout != null && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i4 == 2) {
                z7 = true;
                this.d = new TextureView(context);
            } else if (i4 != 3) {
                if (i4 != 4) {
                    this.d = new SurfaceView(context);
                } else {
                    try {
                        this.d = (View) Class.forName("com.applovin.impl.sq").getConstructor(Context.class).newInstance(context);
                    } catch (Exception e) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                }
                z7 = true;
            } else {
                try {
                    z7 = true;
                    this.d = (View) Class.forName("com.applovin.impl.ok").getConstructor(Context.class).newInstance(context);
                    z9 = true;
                    this.d.setLayoutParams(layoutParams);
                    this.d.setOnClickListener(aVar);
                    this.d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.d, 0);
                    z8 = z9;
                } catch (Exception e2) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            }
            z9 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(aVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
            z8 = z9;
        } else {
            z7 = true;
            this.d = null;
            z8 = false;
        }
        this.f = z8;
        this.l = (FrameLayout) findViewById(R.id.al_exo_ad_overlay);
        this.m = (FrameLayout) findViewById(R.id.al_exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_artwork);
        this.g = imageView2;
        this.q = (!z5 || imageView2 == null) ? false : z7;
        if (i6 != 0) {
            this.r = ContextCompat.getDrawable(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.al_exo_subtitles);
        this.h = subtitleView;
        if (subtitleView != null) {
            subtitleView.c();
            subtitleView.d();
        }
        View viewFindViewById2 = findViewById(R.id.al_exo_buffering);
        this.i = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.s = integer;
        TextView textView = (TextView) findViewById(R.id.al_exo_error_message);
        this.j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        d dVar = (d) findViewById(R.id.al_exo_controller);
        View viewFindViewById3 = findViewById(R.id.al_exo_controller_placeholder);
        if (dVar != null) {
            this.k = dVar;
            i7 = 0;
        } else if (viewFindViewById3 != null) {
            i7 = 0;
            d dVar2 = new d(context, null, 0, attributeSet);
            this.k = dVar2;
            dVar2.setId(R.id.al_exo_controller);
            dVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(dVar2, iIndexOfChild);
        } else {
            i7 = 0;
            this.k = null;
        }
        d dVar3 = this.k;
        this.v = dVar3 != null ? i2 : i7;
        this.y = z3;
        this.w = z;
        this.x = z2;
        this.o = (!z6 || dVar3 == null) ? i7 : z7;
        c();
        j();
        d dVar4 = this.k;
        if (dVar4 != null) {
            dVar4.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        nh nhVar = this.n;
        if (nhVar != null && !nhVar.k().a()) {
            if (z && !this.t) {
                a();
            }
            uo uoVarA = nhVar.A();
            for (int i = 0; i < uoVarA.f1073a; i++) {
                to toVarA = uoVarA.a(i);
                if (toVarA != null) {
                    for (int i2 = 0; i2 < toVarA.b(); i2++) {
                        if (df.e(toVarA.a(i2).m) == 2) {
                            b();
                            return;
                        }
                    }
                }
            }
            a();
            if (m() && (a(nhVar.C()) || a(this.r))) {
                return;
            }
            b();
            return;
        }
        if (this.t) {
            return;
        }
        b();
        a();
    }

    private void b() {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.g.setVisibility(4);
        }
    }

    private static void b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        if (!n() || this.n == null) {
            return false;
        }
        if (!this.k.c()) {
            a(true);
        } else if (this.y) {
            this.k.a();
        }
        return true;
    }

    public nh getPlayer() {
        return this.n;
    }

    public void setErrorMessageProvider(r7 r7Var) {
        if (r7Var != null) {
            l();
        }
    }

    @Deprecated
    public void setControlDispatcher(r4 r4Var) {
        a1.b(this.k);
        this.k.setControlDispatcher(r4Var);
    }

    private boolean a(qd qdVar) {
        byte[] bArr = qdVar.l;
        if (bArr == null) {
            return false;
        }
        return a(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public boolean a(KeyEvent keyEvent) {
        return n() && this.k.a(keyEvent);
    }

    protected void a(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    private void a(boolean z) {
        if (!(d() && this.x) && n()) {
            boolean z2 = this.k.c() && this.k.getShowTimeoutMs() <= 0;
            boolean zE = e();
            if (z || z2 || zE) {
                b(zE);
            }
        }
    }

    private boolean a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                a(this.b, intrinsicWidth / intrinsicHeight);
                this.g.setImageDrawable(drawable);
                this.g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void a() {
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color));
    }

    private static void a(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    private final class a implements nh.e, View.OnLayoutChangeListener, View.OnClickListener, d.e {

        /* renamed from: a, reason: collision with root package name */
        private final go.b f223a = new go.b();
        private Object b;

        public a() {
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void a(float f) {
            nh.e.CC.$default$a(this, f);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void a(int i) {
            nh.e.CC.$default$a((nh.e) this, i);
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void a(int i, int i2) {
            nh.e.CC.$default$a(this, i, i2);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void a(go goVar, int i) {
            nh.e.CC.$default$a(this, goVar, i);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void a(kh khVar) {
            nh.e.CC.$default$a(this, khVar);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void a(mh mhVar) {
            nh.e.CC.$default$a(this, mhVar);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void a(nh.b bVar) {
            nh.e.CC.$default$a(this, bVar);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void a(nh nhVar, nh.d dVar) {
            nh.e.CC.$default$a(this, nhVar, dVar);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void a(od odVar, int i) {
            nh.e.CC.$default$a(this, odVar, i);
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void a(p6 p6Var) {
            nh.e.CC.$default$a(this, p6Var);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void a(qd qdVar) {
            nh.e.CC.$default$a(this, qdVar);
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void a(we weVar) {
            nh.e.CC.$default$a(this, weVar);
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void a(boolean z) {
            nh.e.CC.$default$a(this, z);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b() {
            nh.c.CC.$default$b(this);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void b(int i) {
            e.this.i();
            e.this.l();
            e.this.k();
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void b(int i, boolean z) {
            nh.e.CC.$default$b(this, i, z);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void b(kh khVar) {
            nh.e.CC.$default$b(this, khVar);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void b(boolean z) {
            nh.e.CC.$default$b(this, z);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b(boolean z, int i) {
            nh.c.CC.$default$b(this, z, i);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void c(int i) {
            nh.e.CC.$default$c(this, i);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void c(boolean z) {
            nh.e.CC.$default$c(this, z);
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i) {
            e.this.j();
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void d(boolean z) {
            nh.e.CC.$default$d(this, z);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void e(int i) {
            nh.c.CC.$default$e(this, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void e(boolean z) {
            nh.c.CC.$default$e(this, z);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.g();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            e.b((TextureView) view, e.this.z);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void a(nh.f fVar, nh.f fVar2, int i) {
            if (e.this.d() && e.this.x) {
                e.this.c();
            }
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void a(qo qoVar, uo uoVar) {
            nh nhVar = (nh) a1.a(e.this.n);
            go goVarN = nhVar.n();
            if (goVarN.c()) {
                this.b = null;
            } else if (!nhVar.k().a()) {
                this.b = goVarN.a(nhVar.v(), this.f223a, true).b;
            } else {
                Object obj = this.b;
                if (obj != null) {
                    int iA = goVarN.a(obj);
                    if (iA != -1) {
                        if (nhVar.t() == goVarN.a(iA, this.f223a).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            }
            e.this.c(false);
        }

        @Override // com.applovin.impl.nh.e
        public void a(yq yqVar) {
            e.this.h();
        }

        @Override // com.applovin.impl.nh.e
        public void a(List list) {
            if (e.this.h != null) {
                e.this.h.setCues(list);
            }
        }

        @Override // com.applovin.impl.nh.e
        public void a() {
            if (e.this.c != null) {
                e.this.c.setVisibility(4);
            }
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void a(boolean z, int i) {
            e.this.i();
            e.this.k();
        }
    }
}
