package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.applovin.impl.go;
import com.applovin.impl.kh;
import com.applovin.impl.mh;
import com.applovin.impl.nh;
import com.applovin.impl.od;
import com.applovin.impl.p6;
import com.applovin.impl.qd;
import com.applovin.impl.qo;
import com.applovin.impl.uo;
import com.applovin.impl.v2;
import com.applovin.impl.we;
import com.applovin.impl.yp;
import com.applovin.impl.yq;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements nh.e {

    /* renamed from: a, reason: collision with root package name */
    private List f217a;
    private v2 b;
    private int c;
    private float d;
    private float f;
    private boolean g;
    private boolean h;
    private int i;
    private a j;
    private View k;

    interface a {
        void a(List list, v2 v2Var, float f, int i, float f2);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private void e() {
        this.j.a(getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.f);
    }

    private List<z4> getCuesWithStylingPreferencesApplied() {
        if (this.g && this.h) {
            return this.f217a;
        }
        ArrayList arrayList = new ArrayList(this.f217a.size());
        for (int i = 0; i < this.f217a.size(); i++) {
            arrayList.add(a((z4) this.f217a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (yp.f1214a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private v2 getUserCaptionStyle() {
        if (yp.f1214a < 19 || isInEditMode()) {
            return v2.g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? v2.g : v2.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.k);
        View view = this.k;
        if (view instanceof j) {
            ((j) view).a();
        }
        this.k = t;
        this.j = t;
        addView(t);
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

    public void c() {
        setStyle(getUserCaptionStyle());
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public /* synthetic */ void c(int i) {
        nh.e.CC.$default$c(this, i);
    }

    @Override // com.applovin.impl.nh.e, com.applovin.impl.nh.c
    public /* synthetic */ void c(boolean z) {
        nh.e.CC.$default$c(this, z);
    }

    public void d() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
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

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.h = z;
        e();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.g = z;
        e();
    }

    public void setBottomPaddingFraction(float f) {
        this.f = f;
        e();
    }

    public void setCues(List<z4> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f217a = list;
        e();
    }

    public void setFractionalTextSize(float f) {
        a(f, false);
    }

    public void setViewType(int i) {
        if (this.i == i) {
            return;
        }
        if (i == 1) {
            setView(new com.applovin.exoplayer2.ui.a(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new j(getContext()));
        }
        this.i = i;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f217a = Collections.emptyList();
        this.b = v2.g;
        this.c = 0;
        this.d = 0.0533f;
        this.f = 0.08f;
        this.g = true;
        this.h = true;
        com.applovin.exoplayer2.ui.a aVar = new com.applovin.exoplayer2.ui.a(context);
        this.j = aVar;
        this.k = aVar;
        addView(aVar);
        this.i = 1;
    }

    public void setStyle(v2 v2Var) {
        this.b = v2Var;
        e();
    }

    private z4 a(z4 z4Var) {
        z4.b bVarA = z4Var.a();
        if (!this.g) {
            h.a(bVarA);
        } else if (!this.h) {
            h.b(bVarA);
        }
        return bVarA.a();
    }

    @Override // com.applovin.impl.nh.e
    public void a(List list) {
        setCues(list);
    }

    public void a(float f, boolean z) {
        a(z ? 1 : 0, f);
    }

    private void a(int i, float f) {
        this.c = i;
        this.d = f;
        e();
    }
}
