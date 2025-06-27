package com.my.target.nativeads.views;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.ba;
import com.my.target.ca;
import com.my.target.common.models.ImageData;
import com.my.target.i9;
import com.my.target.m2;
import com.my.target.nativeads.banners.NativePromoCard;
import com.my.target.nativeads.views.PromoCardSnapHelper;
import com.my.target.pa;
import com.my.target.r0;
import com.my.target.z7;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class PromoCardRecyclerView extends RecyclerView implements z7, PromoCardSnapHelper.CardRecyclerScrollState {
    private static final int DEFAULT_CARD_SPACING = 16;
    private static final float MIN_CARD_VISIBILITY = 50.0f;
    private final CardAdapterListener cardClickListener;
    private int displayedCardNum;
    private final r0 layoutManager;
    private boolean moving;
    private z7.a onPromoCardSliderListener;
    private PromoCardAdapter promoCardAdapter;
    boolean reachedEnd;
    boolean reachedStart;
    private final PromoCardSnapHelper snapHelper;

    public interface CardAdapterListener extends View.OnClickListener {
        void onCardRender(int i);
    }

    public static abstract class PromoCardAdapter extends RecyclerView.Adapter<PromoCardViewHolder> {
        private CardAdapterListener cardAdapterListener;
        private final List<NativePromoCard> nativePromoCards = new ArrayList();

        private void setBannerToView(NativePromoCard nativePromoCard, PromoCardView promoCardView) {
            String discount;
            if (nativePromoCard.getImage() != null) {
                promoCardView.getMediaAdView().setPlaceHolderDimension(nativePromoCard.getImage().getWidth(), nativePromoCard.getImage().getHeight());
                if (nativePromoCard.getImage().getData() != null) {
                    promoCardView.getMediaAdView().getImageView().setImageBitmap(nativePromoCard.getImage().getData());
                } else {
                    m2.b(nativePromoCard.getImage(), promoCardView.getMediaAdView().getImageView());
                }
            }
            promoCardView.getTitleTextView().setText(nativePromoCard.getTitle());
            promoCardView.getDescriptionTextView().setText(nativePromoCard.getDescription());
            String ctaText = nativePromoCard.getCtaText();
            promoCardView.getCtaButtonView().setText(ctaText);
            promoCardView.getCtaButtonView().setContentDescription(ctaText);
            if (!(promoCardView instanceof PromoDiscountCardView) || (discount = nativePromoCard.getDiscount()) == null) {
                return;
            }
            ((PromoDiscountCardView) promoCardView).getDiscountView().setText(discount);
        }

        public void dispose() {
            this.cardAdapterListener = null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.nativePromoCards.size();
        }

        public List<NativePromoCard> getNativePromoCards() {
            return this.nativePromoCards;
        }

        public abstract PromoCardView getPromoCardView();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(PromoCardViewHolder promoCardViewHolder, int i) {
            NativePromoCard nativePromoCard;
            if (i < this.nativePromoCards.size() && (nativePromoCard = this.nativePromoCards.get(i)) != null) {
                setBannerToView(nativePromoCard, promoCardViewHolder.getPromoCardView());
                CardAdapterListener cardAdapterListener = this.cardAdapterListener;
                if (cardAdapterListener != null) {
                    cardAdapterListener.onCardRender(i);
                }
            }
            promoCardViewHolder.getPromoCardView().getView().setContentDescription("card_" + i);
            promoCardViewHolder.getPromoCardView().getView().setOnClickListener(this.cardAdapterListener);
            promoCardViewHolder.getPromoCardView().getCtaButtonView().setOnClickListener(this.cardAdapterListener);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public PromoCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new PromoCardViewHolder(getPromoCardView());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(PromoCardViewHolder promoCardViewHolder) {
            NativePromoCard nativePromoCard;
            ImageData image;
            int layoutPosition = promoCardViewHolder.getLayoutPosition();
            i9 i9Var = (i9) promoCardViewHolder.getPromoCardView().getMediaAdView().getImageView();
            i9Var.setImageData(null);
            if (layoutPosition > 0 && layoutPosition < this.nativePromoCards.size() && (nativePromoCard = this.nativePromoCards.get(layoutPosition)) != null && (image = nativePromoCard.getImage()) != null) {
                m2.a(image, i9Var);
            }
            promoCardViewHolder.getPromoCardView().getView().setOnClickListener(null);
            promoCardViewHolder.getPromoCardView().getCtaButtonView().setOnClickListener(null);
            super.onViewRecycled((PromoCardAdapter) promoCardViewHolder);
        }

        public void setCards(List<NativePromoCard> list) {
            this.nativePromoCards.clear();
            this.nativePromoCards.addAll(list);
            notifyDataSetChanged();
        }

        public void setClickListener(CardAdapterListener cardAdapterListener) {
            this.cardAdapterListener = cardAdapterListener;
        }
    }

    public static final class PromoCardItemDecoration extends RecyclerView.ItemDecoration {
        private final int halfRecyclerCardSpacing;

        public PromoCardItemDecoration(int i) {
            this.halfRecyclerCardSpacing = i / 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (state.getItemCount() == 1) {
                return;
            }
            if (childAdapterPosition == 0) {
                rect.right = this.halfRecyclerCardSpacing;
            } else {
                if (childAdapterPosition == state.getItemCount() - 1) {
                    rect.left = this.halfRecyclerCardSpacing;
                    return;
                }
                int i = this.halfRecyclerCardSpacing;
                rect.right = i;
                rect.left = i;
            }
        }
    }

    public static class PromoCardViewHolder extends RecyclerView.ViewHolder {
        private final PromoCardView promoCardView;

        public PromoCardViewHolder(PromoCardView promoCardView) {
            super(promoCardView.getView());
            promoCardView.getView().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            this.promoCardView = promoCardView;
        }

        public PromoCardView getPromoCardView() {
            return this.promoCardView;
        }
    }

    public PromoCardRecyclerView(Context context) {
        this(context, null);
    }

    public PromoCardRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PromoCardRecyclerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1.0f, -1);
    }

    public PromoCardRecyclerView(Context context, AttributeSet attributeSet, int i, float f, int i2) throws IllegalStateException {
        super(context, attributeSet, i);
        this.cardClickListener = new CardAdapterListener() { // from class: com.my.target.nativeads.views.PromoCardRecyclerView.1
            @Override // com.my.target.nativeads.views.PromoCardRecyclerView.CardAdapterListener
            public void onCardRender(int i3) {
                PromoCardRecyclerView.this.renderCard(i3);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PromoCardRecyclerView.this.clickOnCard(view);
            }
        };
        this.displayedCardNum = -1;
        this.layoutManager = new r0(f, getContext());
        setHasFixedSize(true);
        int iA = ca.a(i2 == -1 ? 16 : i2, context);
        PromoCardSnapHelper promoCardSnapHelper = new PromoCardSnapHelper(iA, this);
        this.snapHelper = promoCardSnapHelper;
        promoCardSnapHelper.attachToRecyclerView(this);
        addItemDecoration(new PromoCardItemDecoration(iA));
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.my.target.nativeads.views.PromoCardRecyclerView.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                super.onScrollStateChanged(recyclerView, i3);
                PromoCardRecyclerView.this.reachedEnd = !r2.canScrollHorizontally(1);
                PromoCardRecyclerView promoCardRecyclerView = PromoCardRecyclerView.this;
                promoCardRecyclerView.reachedStart = true ^ promoCardRecyclerView.canScrollHorizontally(-1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCardChanged() {
        int iFindFirstCompletelyVisibleItemPosition = this.layoutManager.findFirstCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition >= 0 && this.displayedCardNum != iFindFirstCompletelyVisibleItemPosition) {
            this.displayedCardNum = iFindFirstCompletelyVisibleItemPosition;
            if (this.onPromoCardSliderListener == null || this.layoutManager.findViewByPosition(iFindFirstCompletelyVisibleItemPosition) == null) {
                return;
            }
            this.onPromoCardSliderListener.a(new int[]{this.displayedCardNum}, getContext());
        }
    }

    public void clickOnCard(View view) {
        View viewFindContainingItemView;
        if (this.moving || (viewFindContainingItemView = this.layoutManager.findContainingItemView(view)) == null) {
            return;
        }
        if (!this.layoutManager.a(viewFindContainingItemView)) {
            smoothScrollBy(this.snapHelper.calculateDistanceToFinalSnap(this.layoutManager, viewFindContainingItemView)[0], 0);
            return;
        }
        int position = this.layoutManager.getPosition(viewFindContainingItemView);
        z7.a aVar = this.onPromoCardSliderListener;
        if (aVar == null || position < 0) {
            return;
        }
        aVar.a(viewFindContainingItemView, position);
    }

    @Override // com.my.target.z7
    public void dispose() {
        PromoCardAdapter promoCardAdapter = this.promoCardAdapter;
        if (promoCardAdapter != null) {
            promoCardAdapter.dispose();
        }
    }

    @Override // com.my.target.z7
    public Parcelable getState() {
        return this.layoutManager.onSaveInstanceState();
    }

    @Override // com.my.target.z7
    public int[] getVisibleCardNumbers() {
        int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0) {
            return new int[0];
        }
        if (pa.a(this.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) < MIN_CARD_VISIBILITY) {
            iFindFirstVisibleItemPosition++;
        }
        if (pa.a(this.layoutManager.findViewByPosition(iFindLastVisibleItemPosition)) < MIN_CARD_VISIBILITY) {
            iFindLastVisibleItemPosition--;
        }
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return new int[0];
        }
        if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
            return new int[]{iFindFirstVisibleItemPosition};
        }
        int i = (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = iFindFirstVisibleItemPosition;
            iFindFirstVisibleItemPosition++;
        }
        return iArr;
    }

    @Override // com.my.target.nativeads.views.PromoCardSnapHelper.CardRecyclerScrollState
    public boolean isReachedEnd() {
        return this.reachedEnd;
    }

    @Override // com.my.target.nativeads.views.PromoCardSnapHelper.CardRecyclerScrollState
    public boolean isReachedStart() {
        return this.reachedStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.moving = z;
        if (z) {
            return;
        }
        checkCardChanged();
    }

    public void renderCard(int i) {
        z7.a aVar = this.onPromoCardSliderListener;
        if (aVar != null) {
            aVar.a(i, getContext());
        }
    }

    @Override // com.my.target.z7
    public void restoreState(Parcelable parcelable) {
        this.layoutManager.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof PromoCardAdapter) {
            setPromoCardAdapter((PromoCardAdapter) adapter);
        } else {
            ba.a("PromoCardRecyclerView: You must use setPromoCardAdapter(PromoCardAdapter) method with custom CardRecyclerView");
        }
    }

    public void setPromoCardAdapter(PromoCardAdapter promoCardAdapter) {
        if (promoCardAdapter == null) {
            return;
        }
        this.promoCardAdapter = promoCardAdapter;
        promoCardAdapter.setClickListener(this.cardClickListener);
        this.layoutManager.a(new r0.a() { // from class: com.my.target.nativeads.views.PromoCardRecyclerView$$ExternalSyntheticLambda0
            @Override // com.my.target.r0.a
            public final void a() {
                this.f$0.checkCardChanged();
            }
        });
        setLayoutManager(this.layoutManager);
        super.swapAdapter(this.promoCardAdapter, true);
    }

    @Override // com.my.target.z7
    public void setPromoCardSliderListener(z7.a aVar) {
        this.onPromoCardSliderListener = aVar;
    }
}
