package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zb extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    protected Context f1235a;
    private List b = new ArrayList();
    private Map c = new HashMap();
    private a d;

    public interface a {
        void a(hb hbVar, yb ybVar);
    }

    protected yb a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    protected abstract int b();

    protected abstract List c(int i);

    protected abstract int d(int i);

    protected abstract yb e(int i);

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return yb.n();
    }

    protected zb(Context context) {
        this.f1235a = context.getApplicationContext();
    }

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.zb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.notifyDataSetChanged();
            }
        });
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return getItem(i).o();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).m();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public yb getItem(int i) {
        return (yb) this.b.get(i);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i;
        this.b = new ArrayList();
        int iB = b();
        this.c = new HashMap(iB);
        yb ybVarA = a();
        if (ybVarA != null) {
            this.b.add(ybVarA);
            i = 1;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < iB; i2++) {
            int iD = d(i2);
            if (iD != 0) {
                this.b.add(e(i2));
                this.b.addAll(c(i2));
                this.c.put(Integer.valueOf(i2), Integer.valueOf(i));
                i += iD + 1;
            }
        }
        this.b.add(new bj(""));
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        xb xbVar;
        yb item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            xbVar = new xb();
            xbVar.f1165a = (TextView) view.findViewById(R.id.text1);
            xbVar.b = (TextView) view.findViewById(R.id.text2);
            xbVar.c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            xbVar.d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(xbVar);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            xbVar = (xb) view.getTag();
        }
        xbVar.a(i);
        xbVar.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        xb xbVar = (xb) view.getTag();
        yb ybVarB = xbVar.b();
        hb hbVarA = a(xbVar.a());
        a aVar = this.d;
        if (aVar == null || hbVarA == null) {
            return;
        }
        aVar.a(hbVarA, ybVarB);
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(r3.a(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor, this.f1235a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }

    private hb a(int i) {
        for (int i2 = 0; i2 < b(); i2++) {
            Integer num = (Integer) this.c.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + d(i2)) {
                    return new hb(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    public void a(a aVar) {
        this.d = aVar;
    }
}
