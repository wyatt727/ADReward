package com.my.target.nativeads.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.my.target.R;
import com.my.target.ba;
import com.my.target.ca;
import com.my.target.common.NavigationType;
import com.my.target.common.views.StarsRatingView;
import com.my.target.l0;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.x8;

/* loaded from: classes4.dex */
public class NativeBannerAdView extends ViewGroup {
    private final int adChoicesHeight;
    private final TextView advertTextView;
    private final int advertisingLabelLeftMargin;
    private final TextView ageTextView;
    private final LinearLayout centerLayout;
    private final Button ctaButton;
    private final int ctaHeight;
    private final TextView disclaimerTextView;
    private final IconAdView iconAdView;
    private final int iconDimensions;
    private final int innerMargins;
    private final StarsRatingView ratingView;
    private final int smallMargin;
    private final TextView titleTextView;
    private final LinearLayout topLayout;
    private final TextView urlTextView;
    private final TextView votesTextView;

    public NativeBannerAdView(Context context) {
        this(context, null);
    }

    public NativeBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeBannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l0 l0Var = new l0(context);
        this.ageTextView = l0Var;
        TextView textView = new TextView(context);
        this.advertTextView = textView;
        IconAdView iconAdView = new IconAdView(context);
        this.iconAdView = iconAdView;
        TextView textView2 = new TextView(context);
        this.titleTextView = textView2;
        TextView textView3 = new TextView(context);
        this.urlTextView = textView3;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.ratingView = starsRatingView;
        TextView textView4 = new TextView(context);
        this.votesTextView = textView4;
        TextView textView5 = new TextView(context);
        this.disclaimerTextView = textView5;
        Button button = new Button(context);
        this.ctaButton = button;
        LinearLayout linearLayout = new LinearLayout(context);
        this.centerLayout = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.topLayout = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context);
        ca caVarE = ca.e(context);
        setId(R.id.nativeads_ad_view);
        l0Var.setId(R.id.nativeads_age_restrictions);
        textView.setId(R.id.nativeads_advertising);
        iconAdView.setId(R.id.nativeads_icon);
        textView2.setId(R.id.nativeads_title);
        textView3.setId(R.id.nativeads_domain);
        starsRatingView.setId(R.id.nativeads_rating);
        textView4.setId(R.id.nativeads_votes);
        textView5.setId(R.id.nativeads_disclaimer);
        button.setId(R.id.nativeads_call_to_action);
        ca.b(textView4, "votes_text");
        int iB = caVarE.b(4);
        setPadding(iB, iB, iB, iB);
        this.smallMargin = caVarE.b(2);
        int iB2 = caVarE.b(4);
        this.advertisingLabelLeftMargin = iB2;
        this.iconDimensions = caVarE.b(54);
        this.adChoicesHeight = caVarE.b(20);
        int iB3 = caVarE.b(12);
        int iB4 = caVarE.b(10);
        this.ctaHeight = caVarE.b(40);
        this.innerMargins = caVarE.b(4);
        button.setPadding(iB4, 0, iB4, 0);
        button.setTransformationMethod(null);
        button.setMaxEms(8);
        button.setLines(1);
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setTextColor(NativeAdColor.STANDARD_BLUE);
        button.setTextSize(2, 16.0f);
        ca.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, 0});
        gradientDrawable.setStroke(caVarE.a(1.5f), NativeAdColor.STANDARD_BLUE);
        gradientDrawable.setCornerRadius(caVarE.b(2));
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{NativeAdColor.BACKGROUND_TOUCH, NativeAdColor.BACKGROUND_TOUCH});
        gradientDrawable2.setStroke(caVarE.a(1.5f), NativeAdColor.STANDARD_BLUE);
        gradientDrawable2.setCornerRadius(caVarE.b(2));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        button.setBackground(stateListDrawable);
        setClickable(true);
        l0Var.setTextColor(NativeAdColor.STANDARD_GREY);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(0);
        gradientDrawable3.setStroke(1, -13421773);
        int iB5 = caVarE.b(2);
        l0Var.setBackgroundDrawable(gradientDrawable3);
        l0Var.setGravity(17);
        l0Var.setPadding(iB5, 0, 0, 0);
        l0Var.setBackgroundColor(0);
        l0Var.setMaxEms(10);
        l0Var.setLines(1);
        l0Var.setTextSize(2, 10.0f);
        textView.setTextSize(2, 10.0f);
        textView.setTextColor(NativeAdColor.STANDARD_GREY);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(iB2, 0, 0, 0);
        textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView2.setTextSize(2, 16.0f);
        textView2.setTypeface(null, 1);
        textView2.setMaxLines(2);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(NativeAdColor.STANDARD_GREY);
        textView3.setTextSize(2, 14.0f);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setIncludeFontPadding(false);
        textView4.setTextColor(NativeAdColor.STANDARD_GREY);
        textView4.setTextSize(2, 12.0f);
        textView4.setLines(1);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setPadding(caVarE.b(4), 0, 0, 0);
        textView5.setTextColor(NativeAdColor.STANDARD_GREY);
        textView5.setTextSize(2, 12.0f);
        textView5.setMaxLines(2);
        textView5.setEllipsize(TextUtils.TruncateAt.END);
        starsRatingView.setStarSize(iB3);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        addView(iconAdView);
        addView(button);
        addView(linearLayout);
        addView(linearLayout2);
        linearLayout2.addView(l0Var);
        linearLayout2.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(linearLayout3);
        linearLayout.addView(textView5);
        linearLayout3.addView(textView3);
        linearLayout3.addView(starsRatingView);
        linearLayout3.addView(textView4);
        x8.f();
    }

    private void setText(String str, TextView textView) {
        int i;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        } else {
            textView.setText(str);
            i = 0;
        }
        textView.setVisibility(i);
    }

    public TextView getAdvertisingTextView() {
        return this.advertTextView;
    }

    public TextView getAgeRestrictionTextView() {
        return this.ageTextView;
    }

    public Button getCtaButtonView() {
        return this.ctaButton;
    }

    public TextView getDisclaimerTextView() {
        return this.disclaimerTextView;
    }

    public TextView getDomainTextView() {
        return this.urlTextView;
    }

    public IconAdView getIconImageView() {
        return this.iconAdView;
    }

    public StarsRatingView getStarsRatingView() {
        return this.ratingView;
    }

    public TextView getTitleTextView() {
        return this.titleTextView;
    }

    public TextView getVotesTextView() {
        return this.votesTextView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        ca.c(this.topLayout, paddingTop, paddingLeft);
        int iA = ca.a(this.iconAdView.getMeasuredHeight(), this.centerLayout.getMeasuredHeight(), this.ctaButton.getMeasuredHeight());
        int bottom = this.topLayout.getBottom() + this.innerMargins;
        int iA2 = ((ca.a(this.iconAdView.getMeasuredHeight(), this.centerLayout.getMeasuredHeight()) - this.ctaButton.getMeasuredHeight()) / 2) + this.topLayout.getMeasuredHeight();
        int i5 = this.adChoicesHeight;
        if (iA2 < i5) {
            bottom = paddingTop + i5;
        }
        ca.c(this.iconAdView, ((iA - this.iconAdView.getMeasuredHeight()) / 2) + bottom, paddingLeft);
        ca.b(this.ctaButton, ((iA - this.ctaButton.getMeasuredHeight()) / 2) + bottom, getMeasuredWidth() - getPaddingRight());
        ca.c(this.centerLayout, bottom + ((iA - this.centerLayout.getMeasuredHeight()) / 2), ca.a(this.iconAdView.getRight() + this.innerMargins, paddingLeft));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        ca.a(this.topLayout, paddingLeft - this.advertisingLabelLeftMargin, paddingTop, Integer.MIN_VALUE);
        this.iconAdView.measure(View.MeasureSpec.makeMeasureSpec(this.iconDimensions, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.iconDimensions, Integer.MIN_VALUE));
        this.ctaButton.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.ctaHeight, 1073741824));
        ca.a(this.centerLayout, ((paddingLeft - this.iconAdView.getMeasuredWidth()) - this.ctaButton.getMeasuredWidth()) - (this.innerMargins * 2), (paddingTop - this.topLayout.getMeasuredHeight()) - this.smallMargin, Integer.MIN_VALUE);
        int measuredHeight = this.topLayout.getMeasuredHeight() + this.innerMargins;
        int iA = ((ca.a(this.iconAdView.getMeasuredHeight(), this.centerLayout.getMeasuredHeight()) - this.ctaButton.getMeasuredHeight()) / 2) + this.topLayout.getMeasuredHeight();
        int i3 = this.adChoicesHeight;
        if (iA < i3) {
            measuredHeight = i3;
        }
        setMeasuredDimension(size, measuredHeight + ca.a(this.centerLayout.getMeasuredHeight(), this.iconAdView.getMeasuredHeight(), this.ctaButton.getMeasuredHeight()) + getPaddingTop() + getPaddingBottom());
    }

    public void setupView(NativeBanner nativeBanner) {
        View view;
        if (nativeBanner == null) {
            return;
        }
        ba.a("NativeBannerAdView: Setup banner");
        if (nativeBanner.getIcon() != null) {
            this.iconAdView.setVisibility(0);
        } else {
            this.iconAdView.setVisibility(8);
        }
        if (!NavigationType.WEB.equals(nativeBanner.getNavigationType())) {
            if ("store".equals(nativeBanner.getNavigationType())) {
                if (nativeBanner.getRating() <= 0.0f || nativeBanner.getRating() > 5.0f) {
                    view = this.ratingView;
                } else {
                    this.ratingView.setRating(nativeBanner.getRating());
                    this.ratingView.setVisibility(0);
                    setText(String.valueOf(nativeBanner.getVotes()), this.votesTextView);
                    this.urlTextView.setVisibility(8);
                    if (nativeBanner.getVotes() > 0) {
                        this.votesTextView.setVisibility(0);
                    } else {
                        this.votesTextView.setVisibility(8);
                    }
                    ca.b(this.votesTextView, "votes_text");
                }
            }
            setText(nativeBanner.getTitle(), this.titleTextView);
            setText(nativeBanner.getAdvertisingLabel(), this.advertTextView);
            setText(nativeBanner.getCtaText(), this.ctaButton);
            setText(nativeBanner.getAgeRestrictions(), this.ageTextView);
            setText(nativeBanner.getDisclaimer(), this.disclaimerTextView);
        }
        setText(nativeBanner.getDomain(), this.urlTextView);
        this.ratingView.setVisibility(8);
        view = this.votesTextView;
        view.setVisibility(8);
        setText(nativeBanner.getTitle(), this.titleTextView);
        setText(nativeBanner.getAdvertisingLabel(), this.advertTextView);
        setText(nativeBanner.getCtaText(), this.ctaButton);
        setText(nativeBanner.getAgeRestrictions(), this.ageTextView);
        setText(nativeBanner.getDisclaimer(), this.disclaimerTextView);
    }
}
