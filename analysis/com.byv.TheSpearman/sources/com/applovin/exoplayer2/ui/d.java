package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.exoplayer2.ui.i;
import com.applovin.impl.a1;
import com.applovin.impl.d8;
import com.applovin.impl.go;
import com.applovin.impl.kh;
import com.applovin.impl.mh;
import com.applovin.impl.nh;
import com.applovin.impl.od;
import com.applovin.impl.p6;
import com.applovin.impl.pi;
import com.applovin.impl.qd;
import com.applovin.impl.qo;
import com.applovin.impl.r4;
import com.applovin.impl.s5;
import com.applovin.impl.uo;
import com.applovin.impl.we;
import com.applovin.impl.yp;
import com.applovin.impl.yq;
import com.applovin.sdk.R;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class d extends FrameLayout {
    private final String A;
    private final Drawable B;
    private final Drawable C;
    private final float D;
    private final float E;
    private final String F;
    private final String G;
    private nh H;
    private r4 I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private long[] W;

    /* renamed from: a, reason: collision with root package name */
    private final c f220a;
    private boolean[] a0;
    private final CopyOnWriteArrayList b;
    private long[] b0;
    private final View c;
    private boolean[] c0;
    private final View d;
    private long d0;
    private long e0;
    private final View f;
    private long f0;
    private final View g;
    private final View h;
    private final View i;
    private final ImageView j;
    private final ImageView k;
    private final View l;
    private final TextView m;
    private final TextView n;
    private final i o;
    private final StringBuilder p;
    private final Formatter q;
    private final go.b r;
    private final go.d s;
    private final Runnable t;
    private final Runnable u;
    private final Drawable v;
    private final Drawable w;
    private final Drawable x;
    private final String y;
    private final String z;

    private static final class b {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* renamed from: com.applovin.exoplayer2.ui.d$d, reason: collision with other inner class name */
    public interface InterfaceC0018d {
    }

    public interface e {
        void d(int i);
    }

    static {
        d8.a("goog.exo.ui");
    }

    public d(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = R.layout.applovin_exo_player_control_view;
        this.N = 5000;
        this.P = 0;
        this.O = 200;
        this.V = -9223372036854775807L;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinPlayerControlView, i, 0);
            try {
                this.N = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_show_timeout, this.N);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerControlView_al_controller_layout_id, resourceId);
                this.P = a(typedArrayObtainStyledAttributes, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_rewind_button, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_fastforward_button, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_previous_button, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_next_button, this.T);
                this.U = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_shuffle_button, this.U);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_time_bar_min_update_interval, this.O));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.b = new CopyOnWriteArrayList();
        this.r = new go.b();
        this.s = new go.d();
        StringBuilder sb = new StringBuilder();
        this.p = sb;
        this.q = new Formatter(sb, Locale.getDefault());
        this.W = new long[0];
        this.a0 = new boolean[0];
        this.b0 = new long[0];
        this.c0 = new boolean[0];
        c cVar = new c();
        this.f220a = cVar;
        this.I = new s5();
        this.t = new Runnable() { // from class: com.applovin.exoplayer2.ui.d$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.k();
            }
        };
        this.u = new Runnable() { // from class: com.applovin.exoplayer2.ui.d$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        i iVar = (i) findViewById(R.id.al_exo_progress);
        View viewFindViewById = findViewById(R.id.al_exo_progress_placeholder);
        if (iVar != null) {
            this.o = iVar;
        } else if (viewFindViewById != null) {
            com.applovin.exoplayer2.ui.b bVar = new com.applovin.exoplayer2.ui.b(context, null, 0, attributeSet2);
            bVar.setId(R.id.al_exo_progress);
            bVar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(bVar, iIndexOfChild);
            this.o = bVar;
        } else {
            this.o = null;
        }
        this.m = (TextView) findViewById(R.id.al_exo_duration);
        this.n = (TextView) findViewById(R.id.al_exo_position);
        i iVar2 = this.o;
        if (iVar2 != null) {
            iVar2.a(cVar);
        }
        View viewFindViewById2 = findViewById(R.id.al_exo_play);
        this.f = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = findViewById(R.id.al_exo_pause);
        this.g = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        View viewFindViewById4 = findViewById(R.id.al_exo_prev);
        this.c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(cVar);
        }
        View viewFindViewById5 = findViewById(R.id.al_exo_next);
        this.d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar);
        }
        View viewFindViewById6 = findViewById(R.id.al_exo_rew);
        this.i = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar);
        }
        View viewFindViewById7 = findViewById(R.id.al_exo_ffwd);
        this.h = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.al_exo_repeat_toggle);
        this.j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_shuffle);
        this.k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        View viewFindViewById8 = findViewById(R.id.al_exo_vr);
        this.l = viewFindViewById8;
        setShowVrButton(false);
        a(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.D = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.E = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.v = resources.getDrawable(R.drawable.al_exo_controls_repeat_off);
        this.w = resources.getDrawable(R.drawable.al_exo_controls_repeat_one);
        this.x = resources.getDrawable(R.drawable.al_exo_controls_repeat_all);
        this.B = resources.getDrawable(R.drawable.al_exo_controls_shuffle_on);
        this.C = resources.getDrawable(R.drawable.al_exo_controls_shuffle_off);
        this.y = resources.getString(R.string.al_exo_controls_repeat_off_description);
        this.z = resources.getString(R.string.al_exo_controls_repeat_one_description);
        this.A = resources.getString(R.string.al_exo_controls_repeat_all_description);
        this.F = resources.getString(R.string.al_exo_controls_shuffle_on_description);
        this.G = resources.getString(R.string.al_exo_controls_shuffle_off_description);
    }

    private static boolean a(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.u);
        } else if (motionEvent.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public boolean getShowShuffleButton() {
        return this.U;
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public boolean getShowVrButton() {
        View view = this.l;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j = this.V;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.u, jUptimeMillis);
            }
        } else if (c()) {
            b();
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.t);
        removeCallbacks(this.u);
    }

    public void setPlayer(nh nhVar) {
        boolean z = true;
        a1.b(Looper.myLooper() == Looper.getMainLooper());
        if (nhVar != null && nhVar.p() != Looper.getMainLooper()) {
            z = false;
        }
        a1.a(z);
        nh nhVar2 = this.H;
        if (nhVar2 == nhVar) {
            return;
        }
        if (nhVar2 != null) {
            nhVar2.a(this.f220a);
        }
        this.H = nhVar;
        if (nhVar != null) {
            nhVar.b(this.f220a);
        }
        h();
    }

    public void setProgressUpdateListener(InterfaceC0018d interfaceC0018d) {
    }

    public void setRepeatToggleModes(int i) {
        this.P = i;
        nh nhVar = this.H;
        if (nhVar != null) {
            int iM = nhVar.m();
            if (i == 0 && iM != 0) {
                this.I.a(this.H, 0);
            } else if (i == 1 && iM == 2) {
                this.I.a(this.H, 1);
            } else if (i == 2 && iM == 1) {
                this.I.a(this.H, 2);
            }
        }
        l();
    }

    public void setShowFastForwardButton(boolean z) {
        this.R = z;
        i();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.K = z;
        n();
    }

    public void setShowNextButton(boolean z) {
        this.T = z;
        i();
    }

    public void setShowPreviousButton(boolean z) {
        this.S = z;
        i();
    }

    public void setShowRewindButton(boolean z) {
        this.Q = z;
        i();
    }

    public void setShowShuffleButton(boolean z) {
        this.U = z;
        m();
    }

    public void setShowTimeoutMs(int i) {
        this.N = i;
        if (c()) {
            b();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.l;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.O = yp.a(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            a(getShowVrButton(), onClickListener != null, this.l);
        }
    }

    private void d() {
        View view;
        View view2;
        boolean zF = f();
        if (!zF && (view2 = this.f) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!zF || (view = this.g) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private boolean f() {
        nh nhVar = this.H;
        return (nhVar == null || nhVar.o() == 4 || this.H.o() == 1 || !this.H.l()) ? false : true;
    }

    private void h() {
        j();
        i();
        l();
        m();
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        boolean z;
        boolean zB;
        boolean z2;
        boolean z3;
        if (c() && this.J) {
            nh nhVar = this.H;
            boolean z4 = false;
            if (nhVar != null) {
                boolean zB2 = nhVar.b(4);
                boolean zB3 = nhVar.b(6);
                z3 = nhVar.b(10) && this.I.b();
                if (nhVar.b(11) && this.I.a()) {
                    z4 = true;
                }
                zB = nhVar.b(8);
                z = z4;
                z4 = zB3;
                z2 = zB2;
            } else {
                z = false;
                zB = false;
                z2 = false;
                z3 = false;
            }
            a(this.S, z4, this.c);
            a(this.Q, z3, this.i);
            a(this.R, z, this.h);
            a(this.T, zB, this.d);
            i iVar = this.o;
            if (iVar != null) {
                iVar.setEnabled(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        boolean z;
        boolean z2;
        if (c() && this.J) {
            boolean zF = f();
            View view = this.f;
            boolean z3 = true;
            if (view != null) {
                z = zF && view.isFocused();
                z2 = yp.f1214a < 21 ? z : zF && b.a(this.f);
                this.f.setVisibility(zF ? 8 : 0);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.g;
            if (view2 != null) {
                z |= !zF && view2.isFocused();
                if (yp.f1214a < 21) {
                    z3 = z;
                } else if (zF || !b.a(this.g)) {
                    z3 = false;
                }
                z2 |= z3;
                this.g.setVisibility(zF ? 0 : 8);
            }
            if (z) {
                e();
            }
            if (z2) {
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long jS;
        if (c() && this.J) {
            nh nhVar = this.H;
            long jG = 0;
            if (nhVar != null) {
                jG = this.d0 + nhVar.g();
                jS = this.d0 + nhVar.s();
            } else {
                jS = 0;
            }
            boolean z = jG != this.e0;
            this.e0 = jG;
            this.f0 = jS;
            TextView textView = this.n;
            if (textView != null && !this.M && z) {
                textView.setText(yp.a(this.p, this.q, jG));
            }
            i iVar = this.o;
            if (iVar != null) {
                iVar.setPosition(jG);
                this.o.setBufferedPosition(jS);
            }
            removeCallbacks(this.t);
            int iO = nhVar == null ? 1 : nhVar.o();
            if (nhVar == null || !nhVar.isPlaying()) {
                if (iO == 4 || iO == 1) {
                    return;
                }
                postDelayed(this.t, 1000L);
                return;
            }
            i iVar2 = this.o;
            long jMin = Math.min(iVar2 != null ? iVar2.getPreferredUpdateDelay() : 1000L, 1000 - (jG % 1000));
            float f = nhVar.a().f697a;
            postDelayed(this.t, yp.b(f > 0.0f ? (long) (jMin / f) : 1000L, this.O, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ImageView imageView;
        if (c() && this.J && (imageView = this.j) != null) {
            if (this.P == 0) {
                a(false, false, (View) imageView);
                return;
            }
            nh nhVar = this.H;
            if (nhVar == null) {
                a(true, false, (View) imageView);
                this.j.setImageDrawable(this.v);
                this.j.setContentDescription(this.y);
                return;
            }
            a(true, true, (View) imageView);
            int iM = nhVar.m();
            if (iM == 0) {
                this.j.setImageDrawable(this.v);
                this.j.setContentDescription(this.y);
            } else if (iM == 1) {
                this.j.setImageDrawable(this.w);
                this.j.setContentDescription(this.z);
            } else if (iM == 2) {
                this.j.setImageDrawable(this.x);
                this.j.setContentDescription(this.A);
            }
            this.j.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        ImageView imageView;
        if (c() && this.J && (imageView = this.k) != null) {
            nh nhVar = this.H;
            if (!this.U) {
                a(false, false, (View) imageView);
                return;
            }
            if (nhVar == null) {
                a(true, false, (View) imageView);
                this.k.setImageDrawable(this.C);
                this.k.setContentDescription(this.G);
            } else {
                a(true, true, (View) imageView);
                this.k.setImageDrawable(nhVar.r() ? this.B : this.C);
                this.k.setContentDescription(nhVar.r() ? this.F : this.G);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.d.n():void");
    }

    public void g() {
        if (!c()) {
            setVisibility(0);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(getVisibility());
            }
            h();
            e();
            d();
        }
        b();
    }

    private void e() {
        View view;
        View view2;
        boolean zF = f();
        if (!zF && (view2 = this.f) != null) {
            view2.requestFocus();
        } else {
            if (!zF || (view = this.g) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    public nh getPlayer() {
        return this.H;
    }

    @Deprecated
    public void setControlDispatcher(r4 r4Var) {
        if (this.I != r4Var) {
            this.I = r4Var;
            i();
        }
    }

    private final class c implements nh.e, i.a, View.OnClickListener {
        private c() {
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void a() {
            nh.e.CC.$default$a(this);
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
        public /* synthetic */ void a(nh.f fVar, nh.f fVar2, int i) {
            nh.e.CC.$default$a(this, fVar, fVar2, i);
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

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void a(qo qoVar, uo uoVar) {
            nh.e.CC.$default$a(this, qoVar, uoVar);
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void a(we weVar) {
            nh.e.CC.$default$a(this, weVar);
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void a(yq yqVar) {
            nh.e.CC.$default$a(this, yqVar);
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void a(List list) {
            nh.e.CC.$default$a(this, list);
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void a(boolean z) {
            nh.e.CC.$default$a(this, z);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void a(boolean z, int i) {
            nh.e.CC.$default$a(this, z, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b() {
            nh.c.CC.$default$b(this);
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public /* synthetic */ void b(int i) {
            nh.e.CC.$default$b(this, i);
        }

        @Override // com.applovin.impl.nh.e
        public /* synthetic */ void b(int i, boolean z) {
            nh.e.CC.$default$b(this, i, z);
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void b(i iVar, long j) {
            if (d.this.n != null) {
                d.this.n.setText(yp.a(d.this.p, d.this.q, j));
            }
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
            nh nhVar = d.this.H;
            if (nhVar == null) {
                return;
            }
            if (d.this.d == view) {
                d.this.I.a(nhVar);
                return;
            }
            if (d.this.c == view) {
                d.this.I.e(nhVar);
                return;
            }
            if (d.this.h == view) {
                if (nhVar.o() != 4) {
                    d.this.I.d(nhVar);
                    return;
                }
                return;
            }
            if (d.this.i == view) {
                d.this.I.c(nhVar);
                return;
            }
            if (d.this.f == view) {
                d.this.b(nhVar);
                return;
            }
            if (d.this.g == view) {
                d.this.a(nhVar);
            } else if (d.this.j == view) {
                d.this.I.a(nhVar, pi.a(nhVar.m(), d.this.P));
            } else if (d.this.k == view) {
                d.this.I.a(nhVar, !nhVar.r());
            }
        }

        @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
        public void a(nh nhVar, nh.d dVar) {
            if (dVar.a(4, 5)) {
                d.this.j();
            }
            if (dVar.a(4, 5, 7)) {
                d.this.k();
            }
            if (dVar.a(8)) {
                d.this.l();
            }
            if (dVar.a(9)) {
                d.this.m();
            }
            if (dVar.a(8, 9, 11, 0, 13)) {
                d.this.i();
            }
            if (dVar.a(11, 0)) {
                d.this.n();
            }
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void a(i iVar, long j) {
            d.this.M = true;
            if (d.this.n != null) {
                d.this.n.setText(yp.a(d.this.p, d.this.q, j));
            }
        }

        @Override // com.applovin.exoplayer2.ui.i.a
        public void a(i iVar, long j, boolean z) {
            d.this.M = false;
            if (z || d.this.H == null) {
                return;
            }
            d dVar = d.this;
            dVar.a(dVar.H, j);
        }
    }

    private void c(nh nhVar) {
        int iO = nhVar.o();
        if (iO != 1 && iO != 4 && nhVar.l()) {
            a(nhVar);
        } else {
            b(nhVar);
        }
    }

    public boolean c() {
        return getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(nh nhVar) {
        int iO = nhVar.o();
        if (iO == 1) {
            this.I.b(nhVar);
        } else if (iO == 4) {
            a(nhVar, nhVar.t(), -9223372036854775807L);
        }
        this.I.b(nhVar, true);
    }

    public void b(e eVar) {
        this.b.remove(eVar);
    }

    private void b() {
        removeCallbacks(this.u);
        if (this.N > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = this.N;
            this.V = jUptimeMillis + j;
            if (this.J) {
                postDelayed(this.u, j);
                return;
            }
            return;
        }
        this.V = -9223372036854775807L;
    }

    private static boolean a(go goVar, go.d dVar) {
        if (goVar.b() > 100) {
            return false;
        }
        int iB = goVar.b();
        for (int i = 0; i < iB; i++) {
            if (goVar.a(i, dVar).o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(nh nhVar) {
        this.I.b(nhVar, false);
    }

    private boolean a(nh nhVar, int i, long j) {
        return this.I.a(nhVar, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(nh nhVar, long j) {
        int iT;
        go goVarN = nhVar.n();
        if (this.L && !goVarN.c()) {
            int iB = goVarN.b();
            iT = 0;
            while (true) {
                long jD = goVarN.a(iT, this.s).d();
                if (j < jD) {
                    break;
                }
                if (iT == iB - 1) {
                    j = jD;
                    break;
                } else {
                    j -= jD;
                    iT++;
                }
            }
        } else {
            iT = nhVar.t();
        }
        a(nhVar, iT, j);
        k();
    }

    public void a(e eVar) {
        a1.a(eVar);
        this.b.add(eVar);
    }

    public void a() {
        if (c()) {
            setVisibility(8);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(getVisibility());
            }
            removeCallbacks(this.t);
            removeCallbacks(this.u);
            this.V = -9223372036854775807L;
        }
    }

    private void a(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.D : this.E);
        view.setVisibility(z ? 0 : 8);
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        nh nhVar = this.H;
        if (nhVar == null || !a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (nhVar.o() == 4) {
                return true;
            }
            this.I.d(nhVar);
            return true;
        }
        if (keyCode == 89) {
            this.I.c(nhVar);
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            c(nhVar);
            return true;
        }
        if (keyCode == 87) {
            this.I.a(nhVar);
            return true;
        }
        if (keyCode == 88) {
            this.I.e(nhVar);
            return true;
        }
        if (keyCode == 126) {
            b(nhVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        a(nhVar);
        return true;
    }

    private static int a(TypedArray typedArray, int i) {
        return typedArray.getInt(R.styleable.AppLovinPlayerControlView_al_repeat_toggle_modes, i);
    }
}
