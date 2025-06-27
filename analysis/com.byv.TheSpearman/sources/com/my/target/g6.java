package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.my.target.common.menu.MenuFactory;
import com.my.target.d;
import com.my.target.m2;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class g6 extends d {
    public int g;
    public a h;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int paddingLeft;
            int paddingTop;
            int paddingTop2;
            int paddingRight;
            int paddingBottom;
            int paddingBottom2;
            WeakReference<i> weakReference = g6.this.f;
            i iVar = weakReference != null ? weakReference.get() : null;
            if (iVar == null) {
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth2 = iVar.getMeasuredWidth();
            int measuredHeight2 = iVar.getMeasuredHeight();
            int i9 = g6.this.g;
            if (i9 != 1) {
                if (i9 == 2) {
                    int paddingLeft2 = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                    paddingBottom = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                    paddingRight = measuredWidth - view.getPaddingRight();
                    paddingBottom2 = measuredHeight - view.getPaddingBottom();
                    paddingLeft = paddingLeft2;
                } else if (i9 == 3) {
                    int paddingLeft3 = view.getPaddingLeft();
                    paddingBottom = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                    int paddingLeft4 = measuredWidth2 + view.getPaddingLeft();
                    paddingBottom2 = measuredHeight - view.getPaddingBottom();
                    paddingLeft = paddingLeft3;
                    paddingRight = paddingLeft4;
                } else {
                    if (i9 == 4 || i9 == 5) {
                        return;
                    }
                    paddingLeft = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                    paddingTop2 = view.getPaddingTop();
                    paddingRight = measuredWidth - view.getPaddingRight();
                    paddingTop = measuredHeight2 + view.getPaddingTop();
                }
                paddingTop2 = paddingBottom;
                paddingTop = paddingBottom2;
            } else {
                paddingLeft = view.getPaddingLeft();
                int paddingTop3 = view.getPaddingTop();
                int paddingLeft5 = measuredWidth2 + view.getPaddingLeft();
                paddingTop = measuredHeight2 + view.getPaddingTop();
                paddingTop2 = paddingTop3;
                paddingRight = paddingLeft5;
            }
            iVar.layout(paddingLeft, paddingTop2, paddingRight, paddingTop);
        }
    }

    public g6(c cVar, MenuFactory menuFactory, m2.a aVar) {
        super(cVar, menuFactory, aVar);
        if (cVar == null) {
            return;
        }
        this.h = new a();
    }

    public static g6 b(c cVar, MenuFactory menuFactory, m2.a aVar) {
        return new g6(cVar, menuFactory, aVar);
    }

    public void a(ViewGroup viewGroup, i iVar, d.a aVar, int i) {
        this.g = i;
        if (i == 5) {
            f fVar = this.b;
            if (fVar != null) {
                fVar.a(aVar);
            }
            ba.a("NativeAdChoicesController: No need to add AdChoicesView, adChoicesPlacement is DRAWING_MANUAL");
            return;
        }
        if (this.f3944a == null) {
            if (iVar != null) {
                a(iVar);
                return;
            }
            return;
        }
        if (iVar == null) {
            Context context = viewGroup.getContext();
            i iVar2 = new i(context);
            ca.b(iVar2, "ad_choices");
            int iA = ca.a(2, context);
            iVar2.setPadding(iA, iA, iA, iA);
            iVar = iVar2;
        }
        if (iVar.getParent() == null) {
            try {
                viewGroup.addView(iVar);
            } catch (Throwable th) {
                ba.a("NativeAdChoicesController: Unable to add AdChoices View - " + th.getMessage());
            }
        }
        if (i != 4) {
            viewGroup.addOnLayoutChangeListener(this.h);
        }
        super.a(iVar, aVar);
    }

    public void b(View view) {
        super.a();
        a aVar = this.h;
        if (aVar == null) {
            return;
        }
        view.removeOnLayoutChangeListener(aVar);
    }
}
