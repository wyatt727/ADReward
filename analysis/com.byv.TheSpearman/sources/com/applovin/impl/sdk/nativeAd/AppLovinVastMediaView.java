package com.applovin.impl.sdk.nativeAd;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ui.d;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.ar;
import com.applovin.impl.bq;
import com.applovin.impl.go;
import com.applovin.impl.gq;
import com.applovin.impl.hq;
import com.applovin.impl.kh;
import com.applovin.impl.lq;
import com.applovin.impl.mh;
import com.applovin.impl.mq;
import com.applovin.impl.nh;
import com.applovin.impl.nq;
import com.applovin.impl.od;
import com.applovin.impl.oj;
import com.applovin.impl.p;
import com.applovin.impl.pq;
import com.applovin.impl.qd;
import com.applovin.impl.qo;
import com.applovin.impl.r;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.t4;
import com.applovin.impl.u5;
import com.applovin.impl.uo;
import com.applovin.impl.up;
import com.applovin.impl.wd;
import com.applovin.impl.x3;
import com.applovin.impl.yh;
import com.applovin.impl.yp;
import com.applovin.impl.zj;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber, zp.b {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastMediaView";
    private final AtomicBoolean automaticPauseHandled;
    private final AtomicBoolean automaticResumeHandled;
    private final Handler countdownHandler;
    private final t4 countdownManager;
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private long lastVideoPositionFromPauseMillis;
    private final p lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled;
    private final zj mediaPlayer;
    private ImageView muteButtonImageView;
    private ImageView playPauseButtonImageView;
    private FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final bq vastAd;
    private long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified;
    private final Set<lq> videoProgressTrackers;
    private final com.applovin.exoplayer2.ui.e videoView;
    private boolean videoWasCompleted;
    private LinearLayout videoWidgetLinearLayout;
    private Activity viewActivity;

    class a extends p {
        a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity.equals(AppLovinVastMediaView.this.viewActivity)) {
                AppLovinVastMediaView.this.maybeHandlePause();
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (!activity.equals(AppLovinVastMediaView.this.viewActivity) || AppLovinVastMediaView.this.isVideoPausedByUser) {
                return;
            }
            AppLovinVastMediaView.this.maybeHandleResume();
        }
    }

    class b implements t4.b {
        b() {
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis - (AppLovinVastMediaView.this.mediaPlayer.getDuration() - AppLovinVastMediaView.this.mediaPlayer.getCurrentPosition()));
            int videoPercentViewed = AppLovinVastMediaView.this.getVideoPercentViewed();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(AppLovinVastMediaView.this.videoProgressTrackers).iterator();
            while (it.hasNext()) {
                lq lqVar = (lq) it.next();
                if (lqVar.a(seconds, videoPercentViewed)) {
                    hashSet.add(lqVar);
                    AppLovinVastMediaView.this.videoProgressTrackers.remove(lqVar);
                }
            }
            AppLovinVastMediaView.this.maybeFireTrackers(hashSet);
            if (videoPercentViewed >= 25 && videoPercentViewed < 50) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().x();
                return;
            }
            if (videoPercentViewed >= 50 && videoPercentViewed < 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().y();
            } else if (videoPercentViewed >= 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !AppLovinVastMediaView.this.videoWasCompleted;
        }
    }

    private class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri uriB;
            hq hqVarK1 = AppLovinVastMediaView.this.vastAd.k1();
            if (hqVarK1 == null || (uriB = hqVarK1.b()) == null) {
                return;
            }
            t tVar = AppLovinVastMediaView.this.logger;
            if (t.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + uriB);
            }
            AppLovinVastMediaView.this.maybeFireTrackers(bq.d.INDUSTRY_ICON_CLICK);
            up.a(uriB, view.getContext(), AppLovinVastMediaView.this.sdk);
        }

        /* synthetic */ c(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    private class d implements AppLovinTouchToClickListener.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinNativeAdImpl f963a;

        public d(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f963a = appLovinNativeAdImpl;
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            Uri uriJ0;
            AppLovinVastMediaView.this.maybeFireTrackers(bq.d.VIDEO_CLICK);
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().v();
            if (AppLovinVastMediaView.this.vastAd.F0() && (uriJ0 = AppLovinVastMediaView.this.vastAd.j0()) != null) {
                t tVar = AppLovinVastMediaView.this.logger;
                if (t.a()) {
                    AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Clicking through video");
                }
                AppLovinVastMediaView.this.sdk.i().maybeSubmitPersistentPostbacks(AppLovinVastMediaView.this.vastAd.a(motionEvent, false));
                this.f963a.handleNativeAdClick(uriJ0, null, motionEvent, (!((Boolean) AppLovinVastMediaView.this.sdk.a(oj.N)).booleanValue() || AppLovinVastMediaView.this.viewActivity == null) ? AppLovinVastMediaView.this.getContext() : AppLovinVastMediaView.this.viewActivity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements nh.c, d.e {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            AppLovinVastMediaView.this.mediaPlayer.a(0L);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(int i) {
            nh.c.CC.$default$a(this, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(go goVar, int i) {
            nh.c.CC.$default$a(this, goVar, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(mh mhVar) {
            nh.c.CC.$default$a(this, mhVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(nh.b bVar) {
            nh.c.CC.$default$a(this, bVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(nh.f fVar, nh.f fVar2, int i) {
            nh.c.CC.$default$a(this, fVar, fVar2, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(nh nhVar, nh.d dVar) {
            nh.c.CC.$default$a(this, nhVar, dVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(od odVar, int i) {
            nh.c.CC.$default$a(this, odVar, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(qd qdVar) {
            nh.c.CC.$default$a(this, qdVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(qo qoVar, uo uoVar) {
            nh.c.CC.$default$a(this, qoVar, uoVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(boolean z, int i) {
            nh.c.CC.$default$a(this, z, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b() {
            nh.c.CC.$default$b(this);
        }

        @Override // com.applovin.impl.nh.c
        public void b(int i) {
            t tVar = AppLovinVastMediaView.this.logger;
            if (t.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Player state changed to state " + i + " and will play when ready: " + AppLovinVastMediaView.this.mediaPlayer.l());
            }
            if (i != 3) {
                if (i == 4) {
                    t tVar2 = AppLovinVastMediaView.this.logger;
                    if (t.a()) {
                        AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Video completed");
                    }
                    AppLovinVastMediaView.this.videoWasCompleted = true;
                    AppLovinVastMediaView.this.finishVideo();
                    if (AppLovinVastMediaView.this.replayIconContainer != null) {
                        ar.a(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$e$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.c();
                            }
                        });
                        return;
                    } else {
                        AppLovinVastMediaView.this.showMediaImageView();
                        return;
                    }
                }
                return;
            }
            AppLovinVastMediaView.this.mediaPlayer.a(!AppLovinVastMediaView.this.isVideoMuted ? 1 : 0);
            AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
            appLovinVastMediaView.videoDurationMillis = appLovinVastMediaView.mediaPlayer.getDuration();
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis), zp.e(AppLovinVastMediaView.this.sdk));
            t tVar3 = AppLovinVastMediaView.this.logger;
            if (t.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "MediaPlayer prepared: " + AppLovinVastMediaView.this.mediaPlayer);
            }
            AppLovinVastMediaView.this.countdownManager.b();
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b(kh khVar) {
            nh.c.CC.$default$b(this, khVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b(boolean z) {
            nh.c.CC.$default$b(this, z);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b(boolean z, int i) {
            nh.c.CC.$default$b(this, z, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void c(int i) {
            nh.c.CC.$default$c(this, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void c(boolean z) {
            nh.c.CC.$default$c(this, z);
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i) {
            if (i == 0) {
                AppLovinVastMediaView.this.videoView.c();
            }
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void d(boolean z) {
            nh.c.CC.$default$d(this, z);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void e(int i) {
            nh.c.CC.$default$e(this, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void e(boolean z) {
            nh.c.CC.$default$e(this, z);
        }

        /* synthetic */ e(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }

        @Override // com.applovin.impl.nh.c
        public void a(kh khVar) {
            AppLovinVastMediaView.this.handleMediaError("Video view error (" + zp.a(khVar, AppLovinVastMediaView.this.sdk) + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f implements View.OnClickListener {
        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            AppLovinVastMediaView.this.videoWasCompleted = false;
            AppLovinVastMediaView.this.automaticResumeHandled.set(false);
            AppLovinVastMediaView.this.sdk.e().a(AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
            AppLovinVastMediaView.this.maybeHandleResume();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (AppLovinVastMediaView.this.mediaPlayer.isPlaying()) {
                    AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                } else {
                    AppLovinVastMediaView.this.isVideoPausedByUser = false;
                    AppLovinVastMediaView.this.maybeHandleResume();
                    return;
                }
            }
            if (view != AppLovinVastMediaView.this.muteButtonImageView) {
                if (view == AppLovinVastMediaView.this.replayIconContainer) {
                    ar.b(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$f$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a();
                        }
                    });
                }
            } else {
                boolean z = AppLovinVastMediaView.this.isVideoMuted;
                boolean z2 = !z;
                AppLovinVastMediaView.this.isVideoMuted = z2;
                AppLovinVastMediaView.this.mediaPlayer.a(z ? 1.0f : 0.0f);
                AppLovinVastMediaView.this.populateMuteImage(z2);
            }
        }

        /* synthetic */ f(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, Context context) {
        int iDpToPx;
        super(appLovinNativeAdImpl, kVar, context);
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new t4(handler, this.sdk);
        this.videoEndListenerNotified = new AtomicBoolean();
        this.mediaErrorHandled = new AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new AtomicBoolean();
        this.automaticPauseHandled = new AtomicBoolean();
        this.automaticResumeHandled = new AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1L;
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new a();
        bq vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean zG0 = vastAd.G0();
        this.isVideoStream = zG0;
        if (zp.a(oj.n1, kVar)) {
            checkCachedAdResourcesAsync(!zG0);
        }
        if (zG0) {
            AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        a aVar = null;
        if (vastAd.q1()) {
            this.industryIconImageView = hq.a(vastAd.k1().d(), context, kVar);
            int iDpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.W4)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, ((Integer) kVar.a(oj.Y4)).intValue()));
            this.industryIconImageView.setOnClickListener(new c(this, aVar));
            addView(this.industryIconImageView);
        }
        if (((Boolean) kVar.a(oj.d5)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) kVar.a(oj.c5)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            f fVar = new f(this, aVar);
            this.playPauseButtonImageView.setOnClickListener(fVar);
            int iDpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.a5)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3, iDpToPx3));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                iDpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.Z4)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(fVar);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx, iDpToPx));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            } else {
                iDpToPx = 0;
            }
            int iDpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.b5)).intValue());
            this.videoWidgetLinearLayout.setPadding(iDpToPx4, iDpToPx4, iDpToPx4, iDpToPx4);
            int i = iDpToPx4 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3 + iDpToPx + i, Math.max(iDpToPx3, iDpToPx) + i, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) kVar.a(oj.e5)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new f(this, aVar));
            ImageView imageView2 = new ImageView(getContext());
            int iDpToPx5 = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(oj.f5)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx5, iDpToPx5, 17));
            imageView2.setImageResource(R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        zj zjVarA = new zj.b(getContext()).a();
        this.mediaPlayer = zjVarA;
        e eVar = new e(this, aVar);
        zjVarA.a((nh.c) eVar);
        zjVarA.a(0);
        com.applovin.exoplayer2.ui.e eVar2 = new com.applovin.exoplayer2.ui.e(getContext());
        this.videoView = eVar2;
        eVar2.c();
        eVar2.setControllerVisibilityListener(eVar);
        eVar2.setPlayer(zjVarA);
        eVar2.setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.B0, getContext(), new d(appLovinNativeAdImpl)));
        addView(eVar2);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(eVar2);
        hashSet.addAll(vastAd.a(bq.d.VIDEO, mq.f699a));
    }

    private void checkCachedAdResourcesAsync(boolean z) {
        zp.a(z, this.vastAd, this.sdk, k.k(), this);
    }

    private void checkCachedAdResourcesImmediately(boolean z) {
        if (zp.a(z, this.vastAd, this.sdk, getContext()).isEmpty()) {
            return;
        }
        handleUnavailableCachedResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishVideo() {
        maybeFireTrackers(bq.d.VIDEO, "close");
        maybeHandlePause();
        this.sdk.e().b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.getAdEventTracker().w();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.i().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoPercentViewed() {
        long currentPosition = this.mediaPlayer.getCurrentPosition();
        if (this.videoWasCompleted) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.videoDurationMillis) * 100.0f) : this.savedVideoPercentViewed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaError(String str) {
        if (t.a()) {
            this.logger.b(TAG, str);
        }
        maybeFireTrackers(bq.d.ERROR, gq.MEDIA_FILE_ERROR);
        this.vastAd.getAdEventTracker().b(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            finishVideo();
            showMediaImageView();
        }
    }

    private void handleUnavailableCachedResources() {
        if (t.a()) {
            this.logger.b(TAG, "Video failed due to unavailable resources");
        }
        finishVideo();
        showMediaImageView();
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() < this.vastAd.m0() || this.videoProgressTrackers.isEmpty()) {
            return;
        }
        if (t.a()) {
            this.logger.k(TAG, "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
        }
        maybeFireTrackers(this.videoProgressTrackers);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            if (this.industryIconImageView != null && this.vastAd.q1()) {
                maybeFireTrackers(bq.d.INDUSTRY_ICON_IMPRESSION);
                this.industryIconImageView.setVisibility(0);
            }
            this.startTimeMillis = SystemClock.elapsedRealtime();
            maybeFireTrackers(bq.d.IMPRESSION);
            maybeFireTrackers(bq.d.VIDEO, "creativeView");
            this.vastAd.getAdEventTracker().g();
            this.vastAd.setHasShown(true);
            this.sdk.i().trackImpression(this.vastAd);
            this.viewActivity = r.a(ar.b(this));
            this.sdk.e().a(this.lifecycleCallbacksAdapter);
            this.mediaPlayer.a(true);
            this.countdownManager.a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, TimeUnit.SECONDS.toMillis(1L), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandlePause() {
        if (this.automaticPauseHandled.compareAndSet(false, true)) {
            maybeFireTrackers(bq.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            this.vastAd.getAdEventTracker().z();
            pauseVideo();
            populatePlayPauseImage(true);
            this.automaticResumeHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleResume() {
        if (this.automaticResumeHandled.compareAndSet(false, true)) {
            maybeFireTrackers(bq.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
            this.vastAd.getAdEventTracker().A();
            if (this.lastVideoPositionFromPauseMillis >= 0) {
                if (t.a()) {
                    this.logger.a(TAG, "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
                }
                this.mediaPlayer.a(true);
                this.countdownManager.b();
                this.lastVideoPositionFromPauseMillis = -1L;
            } else if (t.a()) {
                this.logger.a(TAG, "Invalid last video position, isVideoPlaying=" + this.mediaPlayer.isPlaying());
            }
            populatePlayPauseImage(false);
            this.automaticPauseHandled.set(false);
        }
    }

    private void pauseVideo() {
        if (t.a()) {
            this.logger.a(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.mediaPlayer.getCurrentPosition();
        this.mediaPlayer.a(false);
        this.countdownManager.c();
        if (t.a()) {
            this.logger.a(TAG, "Paused video at position " + this.lastVideoPositionFromPauseMillis + " ms");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean populateMuteImage(boolean z) {
        if (this.muteButtonImageView == null) {
            return false;
        }
        if (x3.f()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(z ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.muteButtonImageView.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return true;
            }
        }
        Uri uriL = z ? this.vastAd.L() : this.vastAd.e0();
        if (uriL == null) {
            return false;
        }
        ImageViewUtils.setImageUri(this.muteButtonImageView, uriL, this.sdk);
        return true;
    }

    private void populatePlayPauseImage(boolean z) {
        ImageView imageView = this.playPauseButtonImageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(z ? R.drawable.applovin_ic_play_icon : R.drawable.applovin_ic_pause_icon);
    }

    private void prepareMediaPlayer() {
        if (!zp.a(oj.n1, this.sdk)) {
            checkCachedAdResourcesImmediately(!this.isVideoStream);
        }
        yh yhVarA = new yh.b(new u5(getContext(), yp.a(getContext(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(od.a(this.vastAd.s0()));
        this.mediaPlayer.a(!this.isVideoMuted ? 1 : 0);
        this.mediaPlayer.a((wd) yhVarA);
        this.mediaPlayer.b();
        this.mediaPlayer.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView
    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        this.videoView.setOnTouchListener(null);
        this.viewActivity = null;
        this.mediaPlayer.V();
        this.vastAd.getAdEventTracker().f();
        this.countdownManager.a();
        this.countdownHandler.removeCallbacksAndMessages(null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return TAG;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeHandleOnAttachedToWindow();
        if (this.isVideoPausedByUser) {
            return;
        }
        maybeHandleResume();
    }

    @Override // com.applovin.impl.zp.b
    public void onCachedResourcesChecked(boolean z) {
        if (z) {
            return;
        }
        handleUnavailableCachedResources();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        maybeHandlePause();
        super.onDetachedFromWindow();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.vastAd.getAdIdNumber() && this.isVideoStream) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.videoWasCompleted || this.mediaPlayer.isPlaying()) {
                    return;
                }
                handleMediaError("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(bq.d dVar) {
        maybeFireTrackers(dVar, gq.UNSPECIFIED);
    }

    private void maybeFireTrackers(bq.d dVar, gq gqVar) {
        maybeFireTrackers(dVar, "", gqVar);
    }

    private void maybeFireTrackers(bq.d dVar, String str) {
        maybeFireTrackers(dVar, str, gq.UNSPECIFIED);
    }

    private void maybeFireTrackers(bq.d dVar, String str, gq gqVar) {
        maybeFireTrackers((Set<lq>) this.vastAd.a(dVar, str), gqVar);
    }

    private void maybeFireTrackers(Set<lq> set, gq gqVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.mediaPlayer.getCurrentPosition());
        pq pqVarP1 = this.vastAd.p1();
        Uri uriC = pqVarP1 != null ? pqVarP1.c() : null;
        if (t.a()) {
            this.logger.a(TAG, "Firing " + set.size() + " tracker(s): " + set);
        }
        nq.a(set, seconds, uriC, gqVar, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(Set<lq> set) {
        maybeFireTrackers(set, gq.UNSPECIFIED);
    }
}
