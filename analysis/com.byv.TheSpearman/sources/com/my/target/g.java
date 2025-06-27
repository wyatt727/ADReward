package com.my.target;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.common.menu.Menu;
import com.my.target.common.menu.MenuAction;
import com.my.target.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class g extends FrameLayout implements k.a {

    /* renamed from: a, reason: collision with root package name */
    public final ListView f3974a;
    public final View b;
    public final int c;
    public final int d;
    public final List<MenuAction> e;
    public final WeakReference<Menu.Listener> f;
    public View g;
    public WeakReference<k> h;
    public MenuAction i;

    public static class a extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final List<MenuAction> f3975a;
        public final WeakReference<Menu.Listener> b;

        public a(List<MenuAction> list, WeakReference<Menu.Listener> weakReference) {
            this.f3975a = list;
            this.b = weakReference;
        }

        public static Drawable a(ca caVar, boolean z) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1, -1});
            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-3158065, -3158065});
            if (z) {
                float fB = caVar.b(8);
                float[] fArr = {fB, fB, fB, fB, 0.0f, 0.0f, 0.0f, 0.0f};
                gradientDrawable.setCornerRadii(fArr);
                gradientDrawable2.setCornerRadii(fArr);
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
            stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
            return new RippleDrawable(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, StateSet.WILD_CARD}, new int[]{ca.a(-3158065), ca.a(-1)}), stateListDrawable, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i, View view) {
            if (i < 0 || i >= this.f3975a.size()) {
                return;
            }
            MenuAction menuAction = this.f3975a.get(i);
            Menu.Listener listener = this.b.get();
            if (listener == null) {
                return;
            }
            listener.onActionClick(menuAction);
        }

        public View a(String str, boolean z, Context context, View.OnClickListener onClickListener) {
            Button button = new Button(context);
            button.setOnClickListener(onClickListener);
            ca caVarE = ca.e(context);
            int iB = caVarE.b(24);
            button.setPadding(iB, button.getPaddingTop(), iB, button.getPaddingBottom());
            button.setAllCaps(false);
            button.setStateListAnimator(null);
            button.setLines(1);
            button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            button.setEllipsize(TextUtils.TruncateAt.END);
            button.setTypeface(null, 0);
            button.setGravity(8388627);
            button.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            button.setBackground(a(caVarE, z));
            button.setText(str);
            return button;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f3975a.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f3975a.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(final int i, View view, ViewGroup viewGroup) {
            return a(this.f3975a.get(i).title, i == 0, viewGroup.getContext(), new View.OnClickListener() { // from class: com.my.target.g$a$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f$0.a(i, view2);
                }
            });
        }
    }

    public g(Context context, List<MenuAction> list, WeakReference<Menu.Listener> weakReference) {
        super(context);
        this.i = null;
        this.e = new ArrayList(list);
        this.f = weakReference;
        ca caVarE = ca.e(context);
        this.c = caVarE.b(500);
        this.d = caVarE.a(0.5f);
        ListView listView = new ListView(context);
        this.f3974a = listView;
        listView.setDivider(null);
        addView(listView);
        View view = new View(context);
        this.b = view;
        view.setBackgroundColor(-5131855);
        addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MenuAction menuAction, View view) {
        Menu.Listener listener = this.f.get();
        if (listener == null) {
            ba.a("AdChoicesOptionsView: listener is null, can't call on action click.");
        } else {
            listener.onActionClick(menuAction);
        }
    }

    public final View a(View.OnClickListener onClickListener, Context context) {
        ImageButton imageButton = new ImageButton(context);
        imageButton.setImageBitmap(g0.a(context));
        ca.a(imageButton, -1, -3158065);
        imageButton.setOnClickListener(onClickListener);
        return imageButton;
    }

    public void a() {
        k kVar;
        WeakReference<k> weakReference = this.h;
        if (weakReference == null || (kVar = weakReference.get()) == null) {
            return;
        }
        kVar.dismiss();
    }

    @Override // com.my.target.k.a
    public void a(k kVar, FrameLayout frameLayout) {
        frameLayout.addView(this, -1, -1);
        c();
    }

    public void b() {
        if (this.e.size() == 0 || (this.e.size() == 1 && this.e.get(0).style == 1)) {
            ba.a("AdChoicesOptionsView: there are no actions. Can't open dialog");
            return;
        }
        Iterator<MenuAction> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            final MenuAction next = it.next();
            if (next.style != 0) {
                this.i = next;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.my.target.g$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.a(next, view);
                    }
                };
                View viewA = a(onClickListener, getContext());
                this.g = viewA;
                addView(viewA);
                setOnClickListener(onClickListener);
                break;
            }
        }
        MenuAction menuAction = this.i;
        if (menuAction != null) {
            this.e.remove(menuAction);
        }
        this.f3974a.setAdapter((ListAdapter) new a(this.e, this.f));
        try {
            k kVarA = k.a(this, getContext());
            this.h = new WeakReference<>(kVarA);
            kVarA.show();
        } catch (Throwable th) {
            th.printStackTrace();
            ba.b("AdChoicesOptionsController: Unable to start adchoices dialog");
            q();
        }
    }

    @Override // com.my.target.k.a
    public void b(boolean z) {
    }

    public void c() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 512.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setFillAfter(true);
        this.f3974a.startAnimation(translateAnimation);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max((i3 - this.f3974a.getMeasuredWidth()) / 2, getPaddingLeft());
        View view = this.g;
        if (view != null) {
            view.layout(iMax, (i4 - getPaddingBottom()) - this.g.getMeasuredHeight(), this.g.getMeasuredWidth() + iMax, i4 - getPaddingBottom());
        }
        this.b.layout(iMax, this.g.getTop() - this.b.getMeasuredHeight(), this.b.getMeasuredWidth() + iMax, this.g.getTop());
        this.f3974a.layout(iMax, this.b.getTop() - this.f3974a.getMeasuredHeight(), this.f3974a.getMeasuredWidth() + iMax, this.b.getTop());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMin = (Math.min(size, this.c) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        View view = this.g;
        if (view != null) {
            view.measure(iMakeMeasureSpec, paddingTop);
        }
        this.b.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
        this.f3974a.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((paddingTop - this.d) - this.g.getMeasuredHeight(), Integer.MIN_VALUE));
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.k.a
    public void q() {
        MenuAction menuAction;
        WeakReference<k> weakReference = this.h;
        if (weakReference != null) {
            weakReference.clear();
            this.h = null;
            Menu.Listener listener = this.f.get();
            if (listener == null || (menuAction = this.i) == null) {
                return;
            }
            listener.onActionClick(menuAction);
        }
    }
}
