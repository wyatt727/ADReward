package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.applovin.impl.v2;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class a extends View implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f218a;
    private List b;
    private int c;
    private float d;
    private v2 f;
    private float g;

    public a(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fA = h.a(this.c, this.d, height, i);
        if (fA <= 0.0f) {
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            z4 z4VarA = (z4) list.get(i2);
            if (z4VarA.q != Integer.MIN_VALUE) {
                z4VarA = a(z4VarA);
            }
            z4 z4Var = z4VarA;
            int i3 = paddingBottom;
            ((g) this.f218a.get(i2)).a(z4Var, this.f, fA, h.a(z4Var.o, z4Var.p, height, i), this.g, canvas, paddingLeft, paddingTop, width, i3);
            i2++;
            size = size;
            i = i;
            paddingBottom = i3;
            width = width;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f218a = new ArrayList();
        this.b = Collections.emptyList();
        this.c = 0;
        this.d = 0.0533f;
        this.f = v2.g;
        this.g = 0.08f;
    }

    private static z4 a(z4 z4Var) {
        z4.b bVarB = z4Var.a().b(-3.4028235E38f).b(Integer.MIN_VALUE).b((Layout.Alignment) null);
        if (z4Var.g == 0) {
            bVarB.a(1.0f - z4Var.f, 0);
        } else {
            bVarB.a((-z4Var.f) - 1.0f, 1);
        }
        int i = z4Var.h;
        if (i == 0) {
            bVarB.a(2);
        } else if (i == 2) {
            bVarB.a(0);
        }
        return bVarB.a();
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List list, v2 v2Var, float f, int i, float f2) {
        this.b = list;
        this.f = v2Var;
        this.d = f;
        this.c = i;
        this.g = f2;
        while (this.f218a.size() < list.size()) {
            this.f218a.add(new g(getContext()));
        }
        invalidate();
    }
}
