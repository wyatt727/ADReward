package com.my.target.nativeads.views;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.my.target.ca;
import com.my.target.nativeads.NativeAppwallAd;
import com.my.target.nativeads.banners.NativeAppwallBanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class AppwallAdView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, AbsListView.OnScrollListener {
    private static final int BACKGROUND_COLOR = -1118482;
    private AppwallAdViewListener appwallAdViewListener;
    private final ListView listView;
    private final ca uiUtils;
    private final HashMap<NativeAppwallBanner, Boolean> viewMap;

    public interface AppwallAdViewListener {
        void onBannerClick(NativeAppwallBanner nativeAppwallBanner);

        void onBannersShow(List<NativeAppwallBanner> list);
    }

    public static class AppwallAdapter extends ArrayAdapter<NativeAppwallBanner> {
        public AppwallAdapter(Context context, List<NativeAppwallBanner> list) {
            super(context, 0, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) getItem(i);
            if (view == null) {
                view = new AppwallCardPlaceholder(new AppwallAdTeaserView(getContext()), getContext());
            }
            if (nativeAppwallBanner != null) {
                ((AppwallCardPlaceholder) view).getView().setNativeAppwallBanner(nativeAppwallBanner);
            }
            return view;
        }
    }

    public static class AppwallCardPlaceholder extends FrameLayout {
        private final LinearLayout rootLayout;
        private final AppwallAdTeaserView view;

        public AppwallCardPlaceholder(AppwallAdTeaserView appwallAdTeaserView, Context context) {
            super(context);
            ca caVarE = ca.e(context);
            this.view = appwallAdTeaserView;
            int iB = caVarE.b(9);
            int iB2 = caVarE.b(4);
            int iB3 = caVarE.b(2);
            LinearLayout linearLayout = new LinearLayout(context);
            this.rootLayout = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(-1118482);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(iB, iB2, iB, iB2);
            appwallAdTeaserView.setLayoutParams(layoutParams);
            linearLayout.addView(appwallAdTeaserView);
            appwallAdTeaserView.setElevation(iB3);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1, -1});
            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1118482, -1118482});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
            stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
            appwallAdTeaserView.setBackground(stateListDrawable);
            addView(linearLayout, -2, -2);
        }

        public AppwallAdTeaserView getView() {
            return this.view;
        }
    }

    public AppwallAdView(Context context) {
        super(context);
        this.viewMap = new HashMap<>();
        setVerticalFadingEdgeEnabled(false);
        setBackgroundColor(-1);
        this.uiUtils = ca.e(context);
        this.listView = new ListView(context);
        initLayout();
    }

    private void countVisibleBanners() {
        AppwallAdViewListener appwallAdViewListener;
        if (this.listView.getAdapter() == null) {
            return;
        }
        int lastVisiblePosition = this.listView.getLastVisiblePosition();
        ArrayList arrayList = new ArrayList();
        for (int firstVisiblePosition = this.listView.getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
            NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) this.listView.getAdapter().getItem(firstVisiblePosition);
            if (this.viewMap.get(nativeAppwallBanner) == null) {
                arrayList.add(nativeAppwallBanner);
                this.viewMap.put(nativeAppwallBanner, Boolean.TRUE);
            }
        }
        if (arrayList.size() <= 0 || (appwallAdViewListener = this.appwallAdViewListener) == null) {
            return;
        }
        appwallAdViewListener.onBannersShow(arrayList);
    }

    private void initLayout() {
        int iB = this.uiUtils.b(4);
        int iB2 = this.uiUtils.b(4);
        this.listView.setDividerHeight(0);
        this.listView.setVerticalFadingEdgeEnabled(false);
        this.listView.setOnItemClickListener(this);
        this.listView.setOnScrollListener(this);
        this.listView.setPadding(0, iB, 0, iB2);
        this.listView.setClipToPadding(false);
        addView(this.listView, -1, -1);
        this.listView.setBackgroundColor(-1118482);
    }

    public void notifyDataSetChanged() {
        ((AppwallAdapter) this.listView.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        countVisibleBanners();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        countVisibleBanners();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) this.listView.getAdapter().getItem(i);
        AppwallAdViewListener appwallAdViewListener = this.appwallAdViewListener;
        if (appwallAdViewListener != null) {
            appwallAdViewListener.onBannerClick(nativeAppwallBanner);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        countVisibleBanners();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void setAppwallAdViewListener(AppwallAdViewListener appwallAdViewListener) {
        this.appwallAdViewListener = appwallAdViewListener;
    }

    public void setupView(NativeAppwallAd nativeAppwallAd) {
        this.listView.setAdapter((ListAdapter) new AppwallAdapter(getContext(), nativeAppwallAd.getBanners()));
    }
}
