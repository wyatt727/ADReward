package com.mbridge.msdk.nativex.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.mbridge.msdk.nativex.view.MBNativeRollView;
import com.mbridge.msdk.out.Frame;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class RollingAdapter extends PagerAdapter {
    private List<Frame> list;
    private List<View> listview = new ArrayList();
    private MBNativeRollView.a mvinterface;

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public MBNativeRollView.a getMvinterface() {
        return this.mvinterface;
    }

    public void setMvinterface(MBNativeRollView.a aVar) {
        this.mvinterface = aVar;
    }

    public RollingAdapter(List<Frame> list) {
        this.list = new ArrayList();
        this.list = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.list.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        List<Frame> list;
        View viewA;
        if (this.mvinterface == null || (list = this.list) == null || list.size() <= 0 || (viewA = this.mvinterface.a(this.list.get(i), i)) == null) {
            return null;
        }
        this.listview.add(viewA);
        viewGroup.addView(viewA);
        return viewA;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(this.listview.get(i));
    }
}
