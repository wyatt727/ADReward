package com.mbridge.msdk.nativex.view;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.C;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.PlayerState;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.json.m4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.aq;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.nativex.view.MediaViewPlayerView;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.OnMBMediaViewListenerPlus;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.video.signal.communication.IRewardCommunication;
import com.mbridge.msdk.videocommon.download.j;
import com.mbridge.msdk.videocommon.view.MyImageView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class BaseMBMediaView extends LinearLayout implements VideoPlayerStatusListener, IRewardCommunication {
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_1_LANDING_PAGE = 1;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_2_NORMAL_FULLSCREEN = 2;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_3_NORMAL_FULLSCREEN_ENDCARD = 3;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_4_NORMAL_FULLSCREEN_LP = 4;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_6_SMALLVIDEO = 6;
    public static final String TAG = "BaseMBMediaView";
    public static final int WHAT_VIEW_FULL_SCREEN = 2;
    public static final int WHAT_VIEW_SMALL_SCREEN = 1;
    private static int p = 2;
    private static int q = 1;
    private RelativeLayout A;
    private WindVaneWebViewForNV B;
    private WindVaneWebViewForNV C;
    private MyImageView D;
    private ProgressBar E;
    private View F;
    private BaseView G;
    private RelativeLayout H;
    private RelativeLayout I;
    private TextView J;
    private ProgressBar K;
    private RelativeLayout L;
    private int M;
    private Handler N;
    private CampaignEx O;
    private int P;
    private int Q;
    private double R;
    private double S;
    private int T;
    private int U;
    private e V;
    private SensorManager W;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f3195a;
    private Sensor aa;
    private com.mbridge.msdk.videocommon.download.a ab;
    private a ac;
    private OnMBMediaViewListener ad;
    private OnMBMediaViewListenerPlus ae;
    private int af;
    private boolean ag;
    private boolean ah;
    private RelativeLayout ai;
    private ImageView aj;
    private int ak;
    private boolean al;
    private Context am;
    private boolean an;
    private Runnable ao;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private volatile boolean j;
    private volatile boolean k;
    private boolean l;
    private boolean m;
    private ArrayList<String> n;
    private ArrayList<String> o;
    private boolean r;
    private boolean s;
    private AdSession t;
    private AdEvents u;
    private MediaEvents v;
    private int w;
    private MediaViewPlayerView x;
    private RelativeLayout y;
    private RelativeLayout z;

    private enum a {
        BIG_IMAGE,
        VIDEO,
        GIF
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i, int i2) {
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
    }

    public BaseMBMediaView(Context context) {
        super(context);
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = false;
        this.h = true;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = true;
        this.m = true;
        this.n = new ArrayList<>();
        this.o = new ArrayList<>();
        this.r = false;
        this.s = false;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = 0;
        this.f3195a = false;
        this.ab = null;
        this.ac = null;
        this.ag = false;
        this.ah = false;
        this.al = false;
        this.an = false;
        this.ao = new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.9
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (!BaseMBMediaView.this.i) {
                        BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                        if (!baseMBMediaView.a((View) baseMBMediaView)) {
                            BaseMBMediaView.R(BaseMBMediaView.this);
                        } else {
                            BaseMBMediaView.S(BaseMBMediaView.this);
                        }
                    }
                    BaseMBMediaView.this.N.postDelayed(this, 300L);
                } catch (Exception e2) {
                    ad.b(BaseMBMediaView.TAG, e2.getMessage());
                }
            }
        };
        a(context);
    }

    public BaseMBMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = false;
        this.h = true;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = true;
        this.m = true;
        this.n = new ArrayList<>();
        this.o = new ArrayList<>();
        this.r = false;
        this.s = false;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = 0;
        this.f3195a = false;
        this.ab = null;
        this.ac = null;
        this.ag = false;
        this.ah = false;
        this.al = false;
        this.an = false;
        this.ao = new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.9
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (!BaseMBMediaView.this.i) {
                        BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                        if (!baseMBMediaView.a((View) baseMBMediaView)) {
                            BaseMBMediaView.R(BaseMBMediaView.this);
                        } else {
                            BaseMBMediaView.S(BaseMBMediaView.this);
                        }
                    }
                    BaseMBMediaView.this.N.postDelayed(this, 300L);
                } catch (Exception e2) {
                    ad.b(BaseMBMediaView.TAG, e2.getMessage());
                }
            }
        };
        a(context);
    }

    private void a(Context context) {
        try {
            d();
            c();
            this.am = context;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private void b() {
        com.mbridge.msdk.videocommon.download.a aVar = this.ab;
        if (aVar != null) {
            aVar.b((com.mbridge.msdk.videocommon.listener.a) null);
        }
    }

    private void c() {
        int iA = v.a(getContext(), "mbridge_nativex_mbmediaview", "layout");
        if (iA == -1) {
            ad.b(TAG, "can not find mediaview resource");
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(iA, (ViewGroup) null);
        this.z = (RelativeLayout) viewInflate.findViewById(v.a(getContext(), "mbridge_rl_mediaview_root", "id"));
        this.y = (RelativeLayout) viewInflate.findViewById(v.a(getContext(), "mbridge_ll_playerview_container", "id"));
        this.D = (MyImageView) viewInflate.findViewById(v.a(getContext(), "mbridge_my_big_img", "id"));
        this.E = (ProgressBar) viewInflate.findViewById(v.a(getContext(), "mbridge_native_pb", "id"));
        this.A = (RelativeLayout) viewInflate.findViewById(v.a(getContext(), "mbridge_nativex_webview_layout", "id"));
        this.B = (WindVaneWebViewForNV) viewInflate.findViewById(v.a(getContext(), "mbridge_nativex_webview_layout_webview", "id"));
        this.z.setClickable(true);
        addView(viewInflate, -1, -1);
    }

    private void d() {
        this.N = new Handler() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object obj;
                if (message != null) {
                    try {
                        int i = message.what;
                        if (i == 1) {
                            BaseMBMediaView.this.r();
                        } else if (i == 3 && (obj = message.obj) != null && (obj instanceof View)) {
                            if (BaseMBMediaView.this.a((View) obj)) {
                                BaseMBMediaView.b(BaseMBMediaView.this);
                            }
                        }
                    } catch (Exception e2) {
                        ad.b(BaseMBMediaView.TAG, e2.getMessage());
                    }
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.d) {
                try {
                    SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
                    this.W = sensorManager;
                    this.aa = sensorManager.getDefaultSensor(1);
                    e eVar = new e();
                    this.V = eVar;
                    this.W.registerListener(eVar, this.aa, 2);
                } catch (Throwable th) {
                    ad.b(TAG, th.getMessage());
                }
            }
            if (Build.VERSION.SDK_INT >= 11) {
                this.h = isHardwareAccelerated();
            }
            this.ak = getOrientation();
            e();
            this.N.postDelayed(this.ao, 300L);
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        try {
            if (this.t != null) {
                MediaViewPlayerView mediaViewPlayerView = this.x;
                if (mediaViewPlayerView != null) {
                    mediaViewPlayerView.unregisterView();
                }
                this.t.finish();
                this.t = null;
            }
            if (this.v != null) {
                this.v = null;
            }
            if (this.u != null) {
                this.u = null;
            }
            this.N.removeCallbacks(this.ao);
            Handler handler = this.N;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            try {
                SensorManager sensorManager = this.W;
                if (sensorManager != null && (eVar = this.V) != null) {
                    sensorManager.unregisterListener(eVar);
                }
            } catch (Throwable th) {
                ad.b(TAG, th.getMessage());
            }
            b();
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        MediaViewPlayerView mediaViewPlayerView;
        super.onWindowFocusChanged(z);
        try {
            this.f = z;
            if (this.ac == a.VIDEO && (mediaViewPlayerView = this.x) != null) {
                mediaViewPlayerView.setIsFrontDesk(z);
            }
            try {
                if (this.i) {
                    MediaViewPlayerView mediaViewPlayerView2 = this.x;
                    if (mediaViewPlayerView2 != null) {
                        if (this.f) {
                            if (mediaViewPlayerView2.isPlaying()) {
                                ad.c(TAG, "fullscreen windowfocuse true isPlaying do nothing return");
                            } else {
                                MediaViewPlayerView mediaViewPlayerView3 = this.x;
                                if (mediaViewPlayerView3 != null && !mediaViewPlayerView3.isComplete() && !this.x.getIsActiviePause()) {
                                    this.x.onClickPlayButton();
                                }
                            }
                        } else {
                            mediaViewPlayerView2.pause();
                        }
                    } else {
                        ad.b(TAG, "fullscreen playerview is null return");
                    }
                }
            } catch (Throwable th) {
                ad.b(TAG, th.getMessage());
            }
            requestLayout();
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        try {
            this.P = getHeight();
            int width = getWidth();
            this.Q = width;
            if (width == 0) {
                this.Q = getMeasuredWidth();
            }
            if (this.P == 0) {
                this.P = getMeasuredHeight();
            }
            if (this.Q == 0 && this.P == 0) {
                this.Q = (int) B();
            }
            if (this.ac == a.VIDEO && !this.i) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (this.P == 0 || ((layoutParams != null && layoutParams.height == -2) || (layoutParams != null && layoutParams.height == -1))) {
                    this.P = (int) ((this.Q * this.S) / this.R);
                }
                i();
                return;
            }
            if (this.ac == a.BIG_IMAGE && !this.i) {
                g();
            } else {
                if (this.ac != a.GIF || this.i) {
                    return;
                }
                h();
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    public void setNativeAd(Campaign campaign) {
        String str;
        if (campaign == null) {
            return;
        }
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null || campaignEx != campaign) {
                this.f = true;
                this.h = true;
                this.i = false;
                this.j = false;
                this.k = false;
                this.s = false;
                z();
                CampaignEx campaignEx2 = (CampaignEx) campaign;
                this.O = campaignEx2;
                if (campaignEx2.getMediaViewHolder() == null) {
                    CampaignEx.b bVar = new CampaignEx.b();
                    bVar.f2804a = this.O.getAdvImpList();
                    this.O.setMediaViewHolder(bVar);
                }
                if (this.O.getAdType() == 94 || this.O.getAdType() == 287) {
                    str = this.O.getRequestId() + this.O.getId() + this.O.getVideoUrlEncode();
                } else {
                    str = this.O.getId() + this.O.getVideoUrlEncode() + this.O.getBidToken();
                }
                this.ab = com.mbridge.msdk.videocommon.download.b.getInstance().a(p(), str);
                if (this.r) {
                    if (this.t != null) {
                        MediaViewPlayerView mediaViewPlayerView = this.x;
                        if (mediaViewPlayerView != null) {
                            mediaViewPlayerView.unregisterView();
                        }
                        this.t.finish();
                        this.t = null;
                    }
                    if (this.v != null) {
                        this.v = null;
                    }
                    if (this.u != null) {
                        this.u = null;
                    }
                }
                CampaignEx campaignEx3 = this.O;
                if (campaignEx3 != null && campaignEx3.isActiveOm()) {
                    this.t = com.mbridge.msdk.a.b.a(getContext(), TextUtils.isEmpty(this.O.getVideoUrlEncode()), this.O.getOmid(), this.O.getRequestId(), this.O.getId(), p(), "", this.O.getRequestIdNotice());
                }
                if (this.r) {
                    e();
                }
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    public void setOnMediaViewListener(OnMBMediaViewListener onMBMediaViewListener) {
        this.ad = onMBMediaViewListener;
    }

    public void setOnMediaViewListener(OnMBMediaViewListenerPlus onMBMediaViewListenerPlus) {
        this.ae = onMBMediaViewListenerPlus;
    }

    public void setIsAllowFullScreen(boolean z) {
        this.e = z;
    }

    public void setAllowVideoRefresh(boolean z) {
        this.b = z;
    }

    public void setAllowLoopPlay(boolean z) {
        this.c = z;
    }

    public void setAllowScreenChange(boolean z) {
        this.d = z;
    }

    public void destory() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.x;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.release();
            }
            b();
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private void e() {
        AdSession adSession;
        try {
            this.ac = a(true);
            changeNoticeURL();
            if (this.ac == a.BIG_IMAGE) {
                CampaignEx campaignEx = this.O;
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) && (adSession = this.t) != null) {
                    try {
                        adSession.registerAdView(this.D);
                        this.u = AdEvents.createAdEvents(this.t);
                        this.t.start();
                        AdEvents adEvents = this.u;
                        if (adEvents != null) {
                            adEvents.impressionOccurred();
                        }
                    } catch (Exception e2) {
                        ad.a("omsdk", e2.getMessage());
                    }
                }
                k();
                n();
            } else if (this.ac == a.VIDEO) {
                f();
            } else if (this.ac == a.GIF) {
                o();
                m();
            }
            this.r = true;
        } catch (Throwable th) {
            ad.a(TAG, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        A();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        int i;
        int i2;
        int i3;
        try {
            if (this.ac != a.BIG_IMAGE || (i = this.Q) == 0 || (i2 = this.U) == 0 || (i3 = this.T) == 0) {
                return;
            }
            int i4 = (i * i2) / i3;
            MyImageView myImageView = this.D;
            if (myImageView == null || i4 == 0) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) myImageView.getLayoutParams();
            layoutParams.width = this.Q;
            layoutParams.height = i4;
            this.D.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        RelativeLayout relativeLayout;
        int i;
        int i2;
        try {
            if (this.ac == a.GIF) {
                int i3 = this.Q;
                if (i3 != 0 && (i = this.U) != 0 && (i2 = this.T) != 0) {
                    int i4 = (i3 * i) / i2;
                    RelativeLayout relativeLayout2 = this.A;
                    if (relativeLayout2 != null && i4 != 0) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
                        layoutParams.width = this.Q;
                        layoutParams.height = i4;
                        layoutParams.addRule(13);
                        this.A.setLayoutParams(layoutParams);
                    }
                } else if (i3 != 0 && (relativeLayout = this.A) != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                    layoutParams2.width = this.Q;
                    layoutParams2.height = (this.Q * 627) / 1200;
                    layoutParams2.addRule(13);
                    this.A.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        try {
            if (this.ac != a.VIDEO || this.y == null) {
                return;
            }
            int iB = (int) B();
            int iG = ai.g(getContext());
            if (!this.i) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                layoutParams.width = this.Q;
                layoutParams.height = this.P;
                layoutParams.addRule(13);
                this.y.setLayoutParams(layoutParams);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.H.getLayoutParams();
                layoutParams2.width = iB;
                layoutParams2.height = iG;
                layoutParams2.addRule(13);
                this.H.setLayoutParams(layoutParams2);
            }
            r();
            if (!this.i) {
                a(this.x, this.Q, this.P);
            } else {
                a(this.x, iB, iG);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private void j() {
        try {
            this.x.showSoundIndicator(this.m);
            this.x.showProgressView(this.l);
            OnMBMediaViewListener onMBMediaViewListener = this.ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onExitFullscreen();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onExitFullscreen();
            }
            MediaEvents mediaEvents = this.v;
            if (mediaEvents != null) {
                mediaEvents.playerStateChange(PlayerState.NORMAL);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    protected final void a(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.n.contains(str)) {
                return;
            }
            this.n.add(str);
            OnMBMediaViewListener onMBMediaViewListener = this.ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onVideoStart();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoStart();
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    protected final void b(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.o.contains(str)) {
                return;
            }
            this.o.add(str);
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoComplete();
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private void k() {
        try {
            ai.a((ImageView) this.D);
            this.D.setVisibility(0);
            this.y.setVisibility(8);
            this.A.setVisibility(8);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private void l() {
        try {
            this.y.setVisibility(0);
            this.D.setVisibility(8);
            this.A.setVisibility(8);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            this.y.setVisibility(8);
            this.D.setVisibility(8);
            this.A.setVisibility(0);
            this.B.setVisibility(0);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private void n() {
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null) {
                return;
            }
            String imageUrl = campaignEx.getImageUrl();
            if (an.a(imageUrl) || getContext() == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(imageUrl, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.12
                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onFailedLoad(String str, String str2) {
                }

                @Override // com.mbridge.msdk.foundation.same.c.c
                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    if (BaseMBMediaView.this.D == null || BaseMBMediaView.this.ac != a.BIG_IMAGE) {
                        return;
                    }
                    if (bitmap != null) {
                        BaseMBMediaView.this.T = bitmap.getWidth();
                        BaseMBMediaView.this.U = bitmap.getHeight();
                        BaseMBMediaView.this.D.setImageUrl(str);
                        BaseMBMediaView.this.D.setImageBitmap(bitmap);
                    }
                    BaseMBMediaView.this.D.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.12.1
                        @Override // com.mbridge.msdk.widget.a
                        protected final void a(View view) {
                            if (BaseMBMediaView.this.am != null) {
                                BaseMBMediaView.this.b(BaseMBMediaView.this.am);
                            } else {
                                BaseMBMediaView.this.b(view.getContext());
                            }
                        }
                    });
                }
            });
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private void o() {
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null) {
                return;
            }
            String gifUrl = campaignEx.getGifUrl();
            if (an.a(gifUrl) || getContext() == null) {
                return;
            }
            this.B.loadDataWithBaseURL(null, "<!DOCTYPE html><html lang=\"en\"><head>  <meta charset=\"UTF-8\">  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">  <title>Document</title>  <style>  *{    margin: 0;    padding: 0;  }  html, body{    width: 100%;    height: 100%;  }  body{    background-image: url('gifUrl');    background-position: center;    background-size: contain;    background-repeat: no-repeat;  }  </style></head><body></body></html>".replace("gifUrl", gifUrl), "text/html", m4.M, null);
            this.B.setInterceptTouch(true);
            this.A.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.13
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    if (BaseMBMediaView.this.am == null) {
                        BaseMBMediaView.this.b(view.getContext());
                    } else {
                        BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                        baseMBMediaView.b(baseMBMediaView.am);
                    }
                    ad.c(BaseMBMediaView.TAG, "CLICK WEBVIEW LAYOUT ");
                }
            });
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String p() {
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null || !an.b(campaignEx.getCampaignUnitId())) {
                return null;
            }
            return this.O.getCampaignUnitId();
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            return null;
        }
    }

    private a a(boolean z) {
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null) {
                return null;
            }
            if (an.a(campaignEx.getVideoUrlEncode())) {
                a aVar = an.b(this.O.getImageUrl()) ? a.BIG_IMAGE : null;
                if (!an.b(this.O.getGifUrl())) {
                    return aVar;
                }
                if (an.a(this.O.getImageUrl())) {
                    aVar = a.GIF;
                }
                this.B.setWebViewClient(new g(this));
                o();
                return aVar;
            }
            if (Build.VERSION.SDK_INT >= 14 && this.h && this.ab != null) {
                if (an.b(this.O.getVideoUrlEncode()) && an.a(this.O.getImageUrl())) {
                    return a.VIDEO;
                }
                if (!an.b(this.O.getVideoUrlEncode()) || !an.b(this.O.getImageUrl())) {
                    return null;
                }
                if (j.a(this.ab, t())) {
                    return a.VIDEO;
                }
                a aVar2 = a.BIG_IMAGE;
                if (!z || !this.b) {
                    return aVar2;
                }
                this.ab.b(new f(this));
                return aVar2;
            }
            return a.BIG_IMAGE;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return a.BIG_IMAGE;
        }
    }

    private void q() {
        try {
            if (this.O == null) {
                ad.c(TAG, "campaign is null addPlayerView return");
            }
            MediaViewPlayerView mediaViewPlayerView = this.x;
            if (mediaViewPlayerView != null && mediaViewPlayerView.getParent() != null) {
                ((ViewGroup) this.x.getParent()).removeView(this.x);
            }
            l();
            MediaViewPlayerView mediaViewPlayerView2 = new MediaViewPlayerView(getContext());
            this.x = mediaViewPlayerView2;
            mediaViewPlayerView2.showProgressView(this.l);
            this.x.showSoundIndicator(this.m);
            if (this.g) {
                this.x.openSound();
            } else {
                this.x.closeSound();
            }
            this.x.setAllowLoopPlay(this.c);
            this.x.initPlayerViewData(s(), this.O, v(), this, this.ab, p());
            this.x.setOnMediaViewPlayerViewListener(new c(this));
            this.y.addView(this.x, -1, -1);
            try {
                MediaViewPlayerView mediaViewPlayerView3 = this.x;
                if (mediaViewPlayerView3 != null) {
                    mediaViewPlayerView3.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.11
                        @Override // com.mbridge.msdk.widget.a
                        protected final void a(View view) {
                            try {
                                if (!BaseMBMediaView.this.i) {
                                    BaseMBMediaView.d(BaseMBMediaView.this);
                                }
                                BaseMBMediaView.this.x.showSoundIndicator(true);
                                BaseMBMediaView.this.x.showProgressView(true);
                                if (!BaseMBMediaView.this.e || BaseMBMediaView.this.i || (BaseMBMediaView.this.F != null && BaseMBMediaView.this.F.getParent() != null)) {
                                    if (!BaseMBMediaView.this.i) {
                                        if (BaseMBMediaView.this.am == null) {
                                            BaseMBMediaView.this.b(view.getContext());
                                        } else {
                                            BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                                            baseMBMediaView.b(baseMBMediaView.am);
                                        }
                                        if (BaseMBMediaView.this.v != null) {
                                            try {
                                                BaseMBMediaView.this.v.adUserInteraction(InteractionType.CLICK);
                                                ad.a("omsdk", "mnv adUserInteraction click");
                                                return;
                                            } catch (Exception e2) {
                                                ad.b("omsdk", e2.getMessage());
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    ad.c(BaseMBMediaView.TAG, "fullScreenShowUI");
                                    BaseMBMediaView.h(BaseMBMediaView.this);
                                    return;
                                }
                                if (!BaseMBMediaView.this.x.halfLoadingViewisVisible() && BaseMBMediaView.this.x.isPlaying()) {
                                    BaseMBMediaView.this.a();
                                    return;
                                }
                                ad.c(BaseMBMediaView.TAG, "is loading or no playing return;");
                            } catch (Throwable th) {
                                ad.a(BaseMBMediaView.TAG, th.getMessage(), th);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                ad.b(TAG, th.getMessage());
            }
            AdSession adSession = this.t;
            if (adSession != null) {
                MediaViewPlayerView mediaViewPlayerView4 = this.x;
                if (mediaViewPlayerView4 != null) {
                    mediaViewPlayerView4.registerView(adSession);
                }
                this.u = AdEvents.createAdEvents(this.t);
                this.v = MediaEvents.createMediaEvents(this.t);
                this.t.start();
                this.u.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                MediaViewPlayerView mediaViewPlayerView5 = this.x;
                if (mediaViewPlayerView5 != null) {
                    mediaViewPlayerView5.setVideoEvents(this.v);
                }
                try {
                    AdEvents adEvents = this.u;
                    if (adEvents != null) {
                        adEvents.impressionOccurred();
                    }
                } catch (Exception e2) {
                    ad.a("omsdk", e2.getMessage());
                }
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            if (getVisibility() != 0) {
                return;
            }
            if (a((View) this)) {
                k kVarU = u();
                int i = 0;
                int iL = kVarU != null ? kVarU.l() : 0;
                CampaignEx campaignEx = this.O;
                if (campaignEx == null || campaignEx.getImpReportType() != 1) {
                    i = iL;
                }
                Message messageObtainMessage = this.N.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.obj = this;
                this.N.sendMessageDelayed(messageObtainMessage, (i == 0 ? 0L : i * 1000) + 300);
            }
            if (this.ac == a.VIDEO) {
                MediaViewPlayerView mediaViewPlayerView = this.x;
                if (mediaViewPlayerView == null) {
                    q();
                    return;
                }
                if (this.O != mediaViewPlayerView.getCampaign()) {
                    this.x.release();
                    q();
                    if (getParent() != null) {
                        ((View) getParent()).invalidate();
                    }
                    requestLayout();
                }
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private String s() {
        try {
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
        if (this.O == null) {
            return null;
        }
        com.mbridge.msdk.videocommon.download.a aVar = this.ab;
        if (aVar != null && aVar.k() == 5) {
            String strH = this.ab.h();
            if (new File(strH).exists() && (this.ab.i() || this.ab.j() == ai.a(new File(strH)))) {
                return strH;
            }
        }
        String videoUrlEncode = this.O.getVideoUrlEncode();
        if (an.b(videoUrlEncode)) {
            return videoUrlEncode;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        try {
            return !aq.a(view, this.O == null ? 0 : r1.getImpReportType());
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return false;
        }
    }

    private int t() {
        if (u() != null) {
            return u().p();
        }
        return 100;
    }

    private k u() {
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx != null && !an.a(campaignEx.getCampaignUnitId())) {
                String campaignUnitId = this.O.getCampaignUnitId();
                String strK = com.mbridge.msdk.foundation.controller.c.m().k();
                if (!an.a(campaignUnitId) && !an.a(strK)) {
                    k kVarD = h.a().d(strK, campaignUnitId);
                    return kVarD != null ? kVarD : k.d(campaignUnitId);
                }
                return k.d(campaignUnitId);
            }
            return null;
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            return null;
        }
    }

    private boolean v() {
        k kVarU;
        try {
            kVarU = u();
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
        if (kVarU == null) {
            return false;
        }
        int iV = kVarU.v();
        if (iV == 1) {
            return ai.m(getContext());
        }
        if (iV == 2) {
            return false;
        }
        return iV == 3 ? ai.k(getContext()) : ai.m(getContext());
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i) throws JSONException {
        MediaEvents mediaEvents = this.v;
        if (mediaEvents != null) {
            try {
                mediaEvents.start(i, this.g ? 1.0f : 0.0f);
            } catch (IllegalArgumentException e2) {
                ad.a("omsdk", e2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        MediaEvents mediaEvents = this.v;
        if (mediaEvents != null) {
            mediaEvents.complete();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(final String str) {
        try {
            ad.c("error", str);
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.15
                @Override // java.lang.Runnable
                public final void run() {
                    BaseMBMediaView.q(BaseMBMediaView.this);
                    BaseMBMediaView.a(BaseMBMediaView.this, str);
                    NativeController.insertExcludeId(BaseMBMediaView.this.O.getCampaignUnitId(), BaseMBMediaView.this.O);
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
        ad.c("omsdk", "base media start");
        MediaEvents mediaEvents = this.v;
        if (mediaEvents != null) {
            mediaEvents.bufferStart();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
        ad.c("omsdk", "base media end");
        MediaEvents mediaEvents = this.v;
        if (mediaEvents != null) {
            mediaEvents.bufferFinish();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        ad.c("errorstr", str);
    }

    protected final void a() {
        BitmapDrawable bitmapDrawableA;
        CampaignEx campaignEx;
        try {
            if (getRootView() != null && (getRootView() instanceof ViewGroup)) {
                BaseView.a aVarHandleViewStyleResult = handleViewStyleResult(getContext());
                if (aVarHandleViewStyleResult == null) {
                    return;
                }
                BaseView fullScreenViewByStyle = getFullScreenViewByStyle(getContext(), aVarHandleViewStyleResult);
                this.G = fullScreenViewByStyle;
                if (fullScreenViewByStyle != null && y()) {
                    com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext()).a(this.G.style, this.O, this.G);
                    this.i = true;
                    this.s = false;
                    MediaViewPlayerView mediaViewPlayerView = this.x;
                    if (mediaViewPlayerView != null) {
                        mediaViewPlayerView.setEnterFullScreen();
                        this.x.setIsActivePause(false);
                    }
                    try {
                        OnMBMediaViewListener onMBMediaViewListener = this.ad;
                        if (onMBMediaViewListener != null) {
                            onMBMediaViewListener.onEnterFullscreen();
                        }
                        OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.ae;
                        if (onMBMediaViewListenerPlus != null) {
                            onMBMediaViewListenerPlus.onEnterFullscreen();
                        }
                        MediaEvents mediaEvents = this.v;
                        if (mediaEvents != null) {
                            mediaEvents.playerStateChange(PlayerState.FULLSCREEN);
                        }
                    } catch (Exception e2) {
                        ad.b(TAG, e2.getMessage());
                    }
                    FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.content);
                    RelativeLayout relativeLayout = new RelativeLayout(getContext());
                    this.F = relativeLayout;
                    relativeLayout.setClickable(true);
                    ViewGroup viewGroup = (ViewGroup) this.x.getParent();
                    int childCount = viewGroup.getChildCount();
                    int i = 0;
                    while (i < childCount && viewGroup.getChildAt(i) != this.x) {
                        i++;
                    }
                    this.M = i;
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setId(100);
                    viewGroup.addView(frameLayout2, i, new ViewGroup.LayoutParams(getWidth(), getHeight()));
                    viewGroup.removeView(this.x);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    relativeLayout.setId(101);
                    new RelativeLayout.LayoutParams(-1, -1);
                    this.L.addView(this.x, new RelativeLayout.LayoutParams(-1, -1));
                    if (this.L != null && (campaignEx = this.O) != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                        try {
                            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().c());
                            mBAdChoice.setCampaign(this.O);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f), ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), 12.0f));
                            layoutParams2.addRule(11);
                            layoutParams2.addRule(12);
                            this.L.addView(mBAdChoice, layoutParams2);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    if (this.f3195a && frameLayout != null && (bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.m().a(p(), this.O.getAdType())) != null) {
                        ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                        ai.a(imageView, bitmapDrawableA, getResources().getDisplayMetrics());
                        this.G.addView(imageView, new RelativeLayout.LayoutParams(-1, -1));
                    }
                    frameLayout.addView(relativeLayout, layoutParams);
                    int i2 = ViewCompat.MEASURED_STATE_MASK;
                    if (AnonymousClass10.f3197a[this.G.style.ordinal()] == 2) {
                        i2 = -1;
                    }
                    int i3 = this.w;
                    if (i3 != 0) {
                        relativeLayout.setBackgroundColor(i3);
                    } else {
                        relativeLayout.setBackgroundColor(i2);
                    }
                    this.G.setId(103);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                    int[] iArr = new int[2];
                    frameLayout.getLocationInWindow(iArr);
                    int i4 = iArr[1];
                    this.af = i4;
                    if (i4 == 0) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            WindowInsets rootWindowInsets = getRootWindowInsets();
                            if (rootWindowInsets != null) {
                                layoutParams3.setMargins(0, rootWindowInsets.getStableInsetTop(), 0, 0);
                            }
                        } else {
                            layoutParams3.setMargins(0, ai.j(getContext()), 0, 0);
                        }
                    }
                    relativeLayout.addView(this.G, layoutParams3);
                    try {
                        z();
                        a(this.H, B(), C());
                        com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext()).a(this.G, this.j);
                        if (this.j) {
                            E();
                        } else {
                            D();
                        }
                        this.N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.5
                            @Override // java.lang.Runnable
                            public final void run() {
                                BaseMBMediaView.this.s = true;
                                if (BaseMBMediaView.this.i) {
                                    TextView unused = BaseMBMediaView.this.J;
                                }
                            }
                        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                    } catch (Throwable th) {
                        ad.b(TAG, th.getMessage());
                    }
                    try {
                        this.F.setFocusableInTouchMode(true);
                        this.F.requestFocus();
                        this.F.setOnKeyListener(new View.OnKeyListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.18
                            @Override // android.view.View.OnKeyListener
                            public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
                                try {
                                    if (keyEvent.getKeyCode() != 4) {
                                        return false;
                                    }
                                    BaseMBMediaView.this.x();
                                    return true;
                                } catch (Throwable th2) {
                                    ad.b(BaseMBMediaView.TAG, th2.getMessage());
                                    return false;
                                }
                            }
                        });
                        this.F.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                BaseMBMediaView.h(BaseMBMediaView.this);
                            }
                        });
                        this.I.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                BaseMBMediaView.this.x();
                            }
                        });
                        this.J.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.4
                            @Override // com.mbridge.msdk.widget.a
                            protected final void a(View view) {
                                try {
                                    BaseMBMediaView.this.b(view.getContext());
                                    if (BaseMBMediaView.this.v != null) {
                                        try {
                                            BaseMBMediaView.this.v.adUserInteraction(InteractionType.CLICK);
                                            ad.a("omsdk", "bmnv adUserInteraction click");
                                        } catch (Exception e4) {
                                            ad.b("omsdk", e4.getMessage());
                                        }
                                    }
                                } catch (Exception e5) {
                                    ad.b(BaseMBMediaView.TAG, e5.getMessage());
                                }
                            }
                        });
                    } catch (Exception e4) {
                        ad.b(TAG, e4.getMessage());
                    }
                    MediaViewPlayerView mediaViewPlayerView2 = this.x;
                    if (mediaViewPlayerView2 != null) {
                        mediaViewPlayerView2.openSound();
                        MediaViewPlayerView mediaViewPlayerView3 = this.x;
                        mediaViewPlayerView3.setMediaViewPlayListener(new MediaViewPlayerView.a(mediaViewPlayerView3) { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.16
                            @Override // com.mbridge.msdk.nativex.view.MediaViewPlayerView.a
                            public final void a() throws JSONException {
                                int nvT2 = BaseMBMediaView.this.O.getNvT2();
                                if (BaseMBMediaView.this.i && (nvT2 == 3 || nvT2 == 4)) {
                                    WindVaneWebViewForNV windVaneWebViewForNVG = BaseMBMediaView.this.G();
                                    if (windVaneWebViewForNVG != null) {
                                        View viewW = BaseMBMediaView.this.w();
                                        if (viewW != null) {
                                            if (nvT2 == 3 && BaseMBMediaView.this.ag) {
                                                com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(viewW, BaseMBMediaView.this.G);
                                                Context context = BaseMBMediaView.this.getContext();
                                                CampaignEx campaignEx2 = BaseMBMediaView.this.O;
                                                String campaignUnitId = BaseMBMediaView.this.O.getCampaignUnitId();
                                                if (campaignEx2 != null) {
                                                    try {
                                                        if (campaignEx2.getNativeVideoTracking() != null && campaignEx2.getNativeVideoTracking().r() != null) {
                                                            for (String str : campaignEx2.getNativeVideoTracking().r()) {
                                                                if (!TextUtils.isEmpty(str)) {
                                                                    com.mbridge.msdk.click.a.a(context, campaignEx2, campaignUnitId, str, false, true);
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                }
                                            } else if (nvT2 == 4) {
                                                com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(viewW, BaseMBMediaView.this.G);
                                                String clickURL = BaseMBMediaView.this.O.getClickURL();
                                                if (!TextUtils.isEmpty(clickURL)) {
                                                    com.mbridge.msdk.click.a.a(BaseMBMediaView.this.getContext(), BaseMBMediaView.this.O, BaseMBMediaView.this.p(), BaseMBMediaView.this.getAddNVT2ToNoticeURL(), true, false, com.mbridge.msdk.click.a.a.i);
                                                    BaseMBMediaView.this.C.loadUrl(clickURL);
                                                }
                                            } else {
                                                super.a();
                                                return;
                                            }
                                            windVaneWebViewForNVG.webViewShow(BaseMBMediaView.this.O, BaseMBMediaView.this.p());
                                            windVaneWebViewForNVG.orientation(BaseMBMediaView.this.j);
                                            return;
                                        }
                                        super.a();
                                        return;
                                    }
                                    super.a();
                                    return;
                                }
                                super.a();
                            }
                        });
                    }
                    b(false);
                    CampaignEx campaignEx2 = this.O;
                    if (campaignEx2 == null || campaignEx2.getMediaViewHolder() == null || this.O.getMediaViewHolder().e || TextUtils.isEmpty(this.O.getCampaignUnitId()) || this.O.getNativeVideoTracking() == null || this.O.getNativeVideoTracking().c() == null) {
                        return;
                    }
                    this.O.getMediaViewHolder().e = true;
                    F();
                    return;
                }
                return;
            }
            ad.c(TAG, "rootView is null");
        } catch (Exception e5) {
            ad.b(TAG, e5.getMessage());
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.BaseMBMediaView$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3197a;

        static {
            int[] iArr = new int[BaseView.a.values().length];
            f3197a = iArr;
            try {
                iArr[BaseView.a.FULL_MIDDLE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3197a[BaseView.a.FULL_TOP_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View w() {
        try {
            this.ai = new RelativeLayout(getContext());
            this.ai.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            ImageView imageView = new ImageView(getContext());
            this.aj = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = ai.a(getContext(), 8.0f);
            layoutParams.rightMargin = ai.a(getContext(), 8.0f);
            this.aj.setLayoutParams(layoutParams);
            this.aj.setBackgroundResource(v.a(getContext(), "mbridge_nativex_close", "drawable"));
            this.aj.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.17
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseMBMediaView.this.exitFullScreen();
                }
            });
            this.C.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.ai.addView(this.C);
            this.ai.addView(this.aj);
            return this.ai;
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            return null;
        }
    }

    public void exitFullScreen() {
        try {
            x();
            if (this.c) {
                this.x.onClickPlayButton();
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void showEndCardWebViewCloseBtn() {
        ImageView imageView = this.aj;
        if (imageView == null || imageView.getVisibility() == 0) {
            return;
        }
        this.aj.setVisibility(0);
    }

    public void hideEndCardWebViewCloseBtn() {
        ImageView imageView = this.aj;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        this.aj.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        try {
            FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.content);
            FrameLayout frameLayout2 = (FrameLayout) getRootView().findViewById(100);
            RelativeLayout relativeLayout = (RelativeLayout) getRootView().findViewById(101);
            RelativeLayout relativeLayout2 = (RelativeLayout) getRootView().findViewById(103);
            if (relativeLayout2 == null && relativeLayout != null) {
                relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(103);
            }
            RelativeLayout relativeLayout3 = (RelativeLayout) getRootView().findViewById(v.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            if (relativeLayout3 == null && relativeLayout2 != null) {
                relativeLayout3 = (RelativeLayout) relativeLayout2.findViewById(v.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            }
            RelativeLayout relativeLayout4 = (RelativeLayout) getRootView().findViewById(v.a(getContext(), "mbridge_full_player_parent", "id"));
            if (relativeLayout4 == null && relativeLayout3 != null) {
                relativeLayout4 = (RelativeLayout) relativeLayout3.findViewById(v.a(getContext(), "mbridge_full_player_parent", "id"));
            }
            ProgressBar progressBar = (ProgressBar) getRootView().findViewById(v.a(getContext(), "mbridge_full_pb_loading", "id"));
            RelativeLayout relativeLayout5 = (RelativeLayout) getRootView().findViewById(v.a(getContext(), "mbridge_full_rl_install", "id"));
            LinearLayout linearLayout = (LinearLayout) getRootView().findViewById(v.a(getContext(), "mbridge_full_ll_pro_dur", "id"));
            ViewGroup viewGroup = frameLayout2 != null ? (ViewGroup) frameLayout2.getParent() : null;
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(linearLayout);
            } else if (linearLayout != null && linearLayout.getParent() != null) {
                ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
            }
            RelativeLayout relativeLayout6 = this.ai;
            if (relativeLayout6 != null) {
                if (relativeLayout2 != null) {
                    relativeLayout2.removeView(relativeLayout6);
                } else if (relativeLayout6.getParent() != null) {
                    ((ViewGroup) this.ai.getParent()).removeView(this.ai);
                }
                this.C.setBackListener(null);
                this.C.setObject(null);
                this.C = null;
                this.ai = null;
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(relativeLayout5);
            } else if (relativeLayout5 != null && relativeLayout5.getParent() != null) {
                ((ViewGroup) relativeLayout5.getParent()).removeView(relativeLayout5);
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(progressBar);
            } else if (progressBar != null && progressBar.getParent() != null) {
                ((ViewGroup) progressBar.getParent()).removeView(progressBar);
            }
            if (relativeLayout4 != null) {
                relativeLayout4.removeView(this.x);
            }
            if (relativeLayout3 != null) {
                relativeLayout3.removeView(relativeLayout4);
            } else if (relativeLayout4 != null && relativeLayout4.getParent() != null) {
                ((ViewGroup) relativeLayout4.getParent()).removeView(relativeLayout4);
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(relativeLayout3);
            } else if (relativeLayout3 != null && relativeLayout3.getParent() != null) {
                ((ViewGroup) relativeLayout3.getParent()).removeView(relativeLayout3);
            } else {
                BaseView baseView = this.G;
                if (baseView != null) {
                    baseView.removeView(this.H);
                }
            }
            if (relativeLayout != null) {
                relativeLayout.removeView(relativeLayout2);
            } else if (relativeLayout2 != null && relativeLayout2.getParent() != null) {
                ((ViewGroup) relativeLayout2.getParent()).removeView(relativeLayout2);
            } else {
                View view = this.F;
                if (view != null) {
                    ((ViewGroup) view).removeView(this.G);
                    ((ViewGroup) this.F.getParent()).removeView(this.F);
                }
            }
            if (frameLayout != null) {
                if (relativeLayout != null) {
                    frameLayout.removeView(relativeLayout);
                } else {
                    frameLayout.removeView(this.F);
                    if (this.F.getParent() != null) {
                        ((ViewGroup) this.F.getParent()).removeView(this.F);
                        this.F.setVisibility(8);
                    }
                }
            }
            setVisibility(0);
            requestLayout();
            if (viewGroup != null) {
                if (this.x.getParent() != null && this.x.getParent() != viewGroup) {
                    ((ViewGroup) this.x.getParent()).removeView(this.x);
                }
                viewGroup.addView(this.x, this.M);
                viewGroup.removeView(frameLayout2);
                viewGroup.invalidate();
            }
            j();
            this.i = false;
            MediaViewPlayerView mediaViewPlayerView = this.x;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.setExitFullScreen();
                if (this.g) {
                    this.x.openSound();
                } else {
                    this.x.closeSound();
                }
                this.x.gonePauseView();
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private boolean y() {
        try {
            this.H = this.G.getMBridgeFullPlayContainer();
            this.L = this.G.getMBridgeFullPlayerParent();
            this.I = this.G.getMBridgeFullClose();
            this.J = this.G.getMBridgeFullTvInstall();
            this.K = this.G.getMBridgeFullPb();
            return true;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return false;
        }
    }

    private void z() {
        try {
            this.j = ai.h(getContext()) >= ai.g(getContext());
            this.k = this.j;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private void A() {
        String[] strArrSplit;
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null || an.a(campaignEx.getVideoResolution()) || (strArrSplit = this.O.getVideoResolution().split("x")) == null || strArrSplit.length != 2) {
                return;
            }
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            double dM = ai.m(str);
            double dM2 = ai.m(str2);
            if (dM <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dM2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            this.R = dM;
            this.S = dM2;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float B() {
        try {
            float fH = ai.h(getContext());
            return this.j ? fH + ai.c(getContext()) : fH;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return 0.0f;
        }
    }

    private float C() {
        try {
            float fG = ai.g(getContext());
            return !this.j ? fG + ai.c(getContext()) : fG;
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
            return 0.0f;
        }
    }

    private boolean c(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private void a(View view, float f2, float f3) {
        if (view == null) {
            return;
        }
        try {
            double d2 = this.R;
            double d3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                double d4 = this.S;
                if (d4 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    double d5 = d2 / d4;
                    if (f2 > 0.0f && f3 > 0.0f) {
                        d3 = f2 / f3;
                    }
                    double dA = ai.a(Double.valueOf(d5));
                    double dA2 = ai.a(Double.valueOf(d3));
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    boolean z = c(getContext()) && this.j;
                    int i = -1;
                    if (dA > dA2) {
                        double d6 = (f2 * this.S) / this.R;
                        layoutParams2.width = -1;
                        if (!z) {
                            i = (int) d6;
                        }
                        layoutParams2.height = i;
                        layoutParams2.addRule(13);
                        layoutParams.width = this.Q;
                        layoutParams.height = (int) d6;
                        layoutParams.addRule(13);
                    } else if (dA < dA2) {
                        double d7 = f3 * d5;
                        layoutParams2.width = z ? -1 : (int) d7;
                        layoutParams2.height = -1;
                        layoutParams2.addRule(13);
                        layoutParams.width = (int) d7;
                        layoutParams.height = this.P;
                        layoutParams.addRule(13);
                    } else {
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        layoutParams.width = this.Q;
                        layoutParams.height = this.P;
                        layoutParams.addRule(13);
                    }
                    if (!this.i) {
                        this.y.setLayoutParams(layoutParams);
                    }
                    view.setLayoutParams(layoutParams2);
                    return;
                }
            }
            b(view);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    private void b(View view) {
        if (view == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = -1;
            if (this.j) {
                layoutParams.height = -1;
            } else {
                layoutParams.height = (((int) B()) * 9) / 16;
                layoutParams.addRule(13);
            }
            view.setLayoutParams(layoutParams);
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        try {
            if (this.I == null && this.aj == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = ai.a(getContext(), 8.0f);
            layoutParams.rightMargin = ai.a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.I;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.aj;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(false);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        try {
            if (this.I == null && this.aj == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 30.0f), ai.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            if (this.af == 0 && ai.a(getContext())) {
                layoutParams.rightMargin = ai.c(getContext()) + ai.a(getContext(), 8.0f);
            } else {
                layoutParams.rightMargin = ai.a(getContext(), 8.0f);
            }
            layoutParams.topMargin = ai.a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.I;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.aj;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(true);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    public void updateViewManger(boolean z) {
        com.mbridge.msdk.nativex.view.mbfullview.a aVarA = com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext());
        boolean z2 = true;
        int i = 0;
        if (aVarA != null) {
            try {
                this.G.getmAnimationPlayer().clearAnimation();
                aVarA.a(z, !this.x.isComplete(), this.G);
                aVarA.a(z, this.G, this.af);
            } catch (NullPointerException e2) {
                e2.printStackTrace();
                return;
            }
        }
        BaseView baseView = this.G;
        if (!(baseView instanceof MBridgeTopFullView) || aVarA == null) {
            return;
        }
        if (z) {
            z2 = false;
        }
        if (baseView instanceof MBridgeTopFullView) {
            MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
            if (!z2) {
                i = 8;
            }
            mBridgeTopFullView.getMBridgeFullViewDisplayIcon().setVisibility(i);
            mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setVisibility(i);
            mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setVisibility(i);
            mBridgeTopFullView.getStarLevelLayoutView().setVisibility(i);
        }
    }

    private void F() {
        int i;
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx == null || campaignEx.getNativeVideoTracking() == null) {
                return;
            }
            String[] strArrC = this.O.getNativeVideoTracking().c();
            if (this.j) {
                i = p;
            } else {
                i = q;
            }
            for (String str : strArrC) {
                if (!TextUtils.isEmpty(str)) {
                    Context context = getContext();
                    CampaignEx campaignEx2 = this.O;
                    com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), str + "&orienation=" + i, false, false);
                }
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public void changeNoticeURL() {
        String str;
        CampaignEx campaignEx = this.O;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (noticeUrl.contains("is_video")) {
                if (this.ac == a.VIDEO) {
                    if (noticeUrl.contains("is_video=2")) {
                        noticeUrl = noticeUrl.replace("is_video=2", "is_video=1");
                    }
                } else if (this.ac == a.BIG_IMAGE && noticeUrl.contains("is_video=1")) {
                    noticeUrl = noticeUrl.replace("is_video=1", "is_video=2");
                }
            } else {
                if (this.ac == a.VIDEO) {
                    str = "1";
                } else {
                    str = this.ac == a.BIG_IMAGE ? "2" : "";
                }
                StringBuilder sb = new StringBuilder(noticeUrl);
                if (noticeUrl.contains("?")) {
                    sb.append("&is_video=");
                    sb.append(str);
                } else {
                    sb.append("?is_video=");
                    sb.append(str);
                }
                noticeUrl = sb.toString();
            }
            this.O.setNoticeUrl(noticeUrl);
        }
    }

    public String getAddNVT2ToNoticeURL() {
        CampaignEx campaignEx = this.O;
        if (campaignEx == null) {
            return null;
        }
        String noticeUrl = campaignEx.getNoticeUrl();
        if (TextUtils.isEmpty(noticeUrl) || noticeUrl.contains(CampaignEx.JSON_KEY_NV_T2)) {
            return noticeUrl;
        }
        return noticeUrl + "&nv_t2=" + this.O.getNvT2();
    }

    public boolean canShowVideo() {
        return a(false) == a.VIDEO;
    }

    private class e implements SensorEventListener {
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        private e() {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            int iRound;
            if (BaseMBMediaView.this.al) {
                return;
            }
            try {
                float[] fArr = sensorEvent.values;
                float f = -fArr[0];
                float f2 = -fArr[1];
                float f3 = -fArr[2];
                if (((f * f) + (f2 * f2)) * 4.0f >= f3 * f3) {
                    iRound = 90 - Math.round(((float) Math.atan2(-f2, f)) * 57.29578f);
                    while (iRound >= 360) {
                        iRound -= 360;
                    }
                    while (iRound < 0) {
                        iRound += 360;
                    }
                } else {
                    iRound = -1;
                }
                float fB = BaseMBMediaView.this.B();
                int iG = ai.g(BaseMBMediaView.this.getContext());
                if ((iRound <= 45 || iRound >= 135) && (iRound <= 225 || iRound >= 315)) {
                    if (((iRound <= 135 || iRound >= 225) && ((iRound <= 315 || iRound >= 360) && ((iRound < 0 || iRound > 45) && iRound != -1))) || fB > iG || !BaseMBMediaView.this.k) {
                        return;
                    }
                    BaseMBMediaView.this.j = false;
                    BaseMBMediaView.this.k = false;
                    BaseMBMediaView.this.N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.e.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.G, BaseMBMediaView.this.j);
                                BaseMBMediaView.this.D();
                                BaseMBMediaView.this.i();
                                BaseMBMediaView.this.g();
                                BaseMBMediaView.this.h();
                                if (BaseMBMediaView.this.C != null) {
                                    BaseMBMediaView.this.C.orientation(BaseMBMediaView.this.j);
                                }
                            } catch (Exception e) {
                                ad.b(BaseMBMediaView.TAG, e.getMessage());
                            }
                        }
                    }, 200L);
                    return;
                }
                if (fB < iG || BaseMBMediaView.this.k) {
                    return;
                }
                BaseMBMediaView.this.j = true;
                BaseMBMediaView.this.k = true;
                BaseMBMediaView.this.N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.e.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.G, BaseMBMediaView.this.j);
                            BaseMBMediaView.this.E();
                            BaseMBMediaView.this.i();
                            BaseMBMediaView.this.g();
                            BaseMBMediaView.this.h();
                            if (BaseMBMediaView.this.C != null) {
                                BaseMBMediaView.this.C.orientation(BaseMBMediaView.this.j);
                            }
                        } catch (Exception e) {
                            ad.b(BaseMBMediaView.TAG, e.getMessage());
                        }
                    }
                }, 200L);
            } catch (Throwable th) {
                ad.a(BaseMBMediaView.TAG, th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindVaneWebViewForNV G() {
        try {
            WindVaneWebViewForNV windVaneWebViewForNV = this.C;
            if (windVaneWebViewForNV != null && this.ah) {
                return windVaneWebViewForNV;
            }
            if (this.ah) {
                return null;
            }
            b(true);
            return null;
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            return null;
        }
    }

    private void b(boolean z) {
        try {
            int nvT2 = this.O.getNvT2();
            if (this.C == null) {
                WindVaneWebViewForNV windVaneWebViewForNV = new WindVaneWebViewForNV(getContext());
                this.C = windVaneWebViewForNV;
                windVaneWebViewForNV.setObject(this);
                this.C.setBackListener(new com.mbridge.msdk.nativex.listener.b() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.6
                    @Override // com.mbridge.msdk.nativex.listener.b
                    public final void a() {
                        BaseMBMediaView.this.exitFullScreen();
                    }
                });
                this.C.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.7
                    @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                    public final void a(WebView webView, String str) {
                        super.a(webView, str);
                        BaseMBMediaView.this.ag = true;
                    }

                    @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                    public final void a(WebView webView, int i, String str, String str2) {
                        super.a(webView, i, str, str2);
                        BaseMBMediaView.this.ag = false;
                    }
                });
            }
            if (nvT2 != 3) {
                if (nvT2 == 4) {
                    this.ah = true;
                    if (this.O != null) {
                        com.mbridge.msdk.foundation.same.g.a aVar = new com.mbridge.msdk.foundation.same.g.a(this.O);
                        aVar.a(this.O.getAppName());
                        this.C.setDownloadListener(aVar);
                        this.C.setFilter(new d());
                        return;
                    }
                    return;
                }
                return;
            }
            String str = this.O.getendcard_url();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.O.getMediaViewHolder();
            if (str.contains(".zip") && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
                if (an.b(h5ResAddress)) {
                    this.ah = true;
                    this.C.loadUrl(h5ResAddress);
                    return;
                }
                return;
            }
            String htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(str);
            if (an.b(htmlContentFromUrl)) {
                ad.a(TAG, "load html...");
                this.ah = true;
                this.C.loadDataWithBaseURL(str, htmlContentFromUrl, "text/html", com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME, null);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    private static final class g extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f3222a;

        public g(BaseMBMediaView baseMBMediaView) {
            this.f3222a = new WeakReference<>(baseMBMediaView);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                BaseMBMediaView baseMBMediaView = this.f3222a.get();
                if (baseMBMediaView == null || baseMBMediaView.ac == null || baseMBMediaView.ac != a.BIG_IMAGE) {
                    return;
                }
                baseMBMediaView.m();
                baseMBMediaView.ac = a.GIF;
                baseMBMediaView.changeNoticeURL();
            } catch (Exception e) {
                ad.b(BaseMBMediaView.TAG, e.getMessage());
            }
        }
    }

    private static final class f implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f3221a;

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
        }

        public f(BaseMBMediaView baseMBMediaView) {
            this.f3221a = new WeakReference<>(baseMBMediaView);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            BaseMBMediaView baseMBMediaView = this.f3221a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.N.post(new b(baseMBMediaView));
            }
        }
    }

    private static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f3216a;

        public b(BaseMBMediaView baseMBMediaView) {
            this.f3216a = new WeakReference<>(baseMBMediaView);
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseMBMediaView baseMBMediaView = this.f3216a.get();
            if (baseMBMediaView != null) {
                try {
                    if (baseMBMediaView.ac == null || baseMBMediaView.ac != a.BIG_IMAGE) {
                        return;
                    }
                    baseMBMediaView.f();
                    baseMBMediaView.ac = a.VIDEO;
                    baseMBMediaView.changeNoticeURL();
                } catch (Throwable th) {
                    ad.a(BaseMBMediaView.TAG, th.getMessage(), th);
                }
            }
        }
    }

    private static final class c implements com.mbridge.msdk.nativex.listener.a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f3217a;

        public c(BaseMBMediaView baseMBMediaView) {
            this.f3217a = new WeakReference<>(baseMBMediaView);
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void a() {
            BaseMBMediaView baseMBMediaView = this.f3217a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.M(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void b() {
            BaseMBMediaView baseMBMediaView = this.f3217a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.N(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void c() {
            BaseMBMediaView baseMBMediaView = this.f3217a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.O(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void d() {
            BaseMBMediaView baseMBMediaView = this.f3217a.get();
            if (baseMBMediaView != null) {
                BaseMBMediaView.P(baseMBMediaView);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void a(String str) {
            BaseMBMediaView baseMBMediaView = this.f3217a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.a(str);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public final void b(String str) {
            BaseMBMediaView baseMBMediaView = this.f3217a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.b(str);
            }
        }
    }

    public BaseView.a handleViewStyleResult(Context context) {
        int nvT2 = this.O.getNvT2();
        if (nvT2 == 1) {
            b(context);
        } else {
            if (nvT2 == 2 || nvT2 == 3 || nvT2 == 4) {
                return BaseView.a.FULL_MIDDLE_VIEW;
            }
            if (nvT2 == 6) {
                return BaseView.a.FULL_TOP_VIEW;
            }
        }
        return null;
    }

    private static final class d implements com.mbridge.msdk.mbsignalcommon.base.a {
        private d() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.base.a
        public final boolean a(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (ah.a.b(str)) {
                        ah.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, (NativeListener.NativeTrackingListener) null);
                        return true;
                    }
                    if (URLUtil.isNetworkUrl(str)) {
                        return false;
                    }
                    ah.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, (BaseTrackingListener) null);
                    return true;
                }
            } catch (Exception e) {
                ad.b(BaseMBMediaView.TAG, e.getMessage());
            }
            return false;
        }
    }

    public void setProgressVisibility(boolean z) {
        this.l = z;
        MediaViewPlayerView mediaViewPlayerView = this.x;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showProgressView(z);
        }
    }

    public void setSoundIndicatorVisibility(boolean z) {
        this.m = z;
        MediaViewPlayerView mediaViewPlayerView = this.x;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showSoundIndicator(z);
        }
    }

    public void setVideoSoundOnOff(boolean z) {
        this.g = z;
        MediaViewPlayerView mediaViewPlayerView = this.x;
        if (mediaViewPlayerView != null) {
            if (z) {
                mediaViewPlayerView.openSound();
            } else {
                mediaViewPlayerView.closeSound();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.nativex.view.mbfullview.BaseView getFullScreenViewByStyle(android.content.Context r3, com.mbridge.msdk.nativex.view.mbfullview.BaseView.a r4) {
        /*
            r2 = this;
            int[] r0 = com.mbridge.msdk.nativex.view.BaseMBMediaView.AnonymousClass10.f3197a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L16
            r1 = 2
            if (r0 == r1) goto L10
            r3 = 0
            goto L1c
        L10:
            com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView r0 = new com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView
            r0.<init>(r3)
            goto L1b
        L16:
            com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView r0 = new com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView
            r0.<init>(r3)
        L1b:
            r3 = r0
        L1c:
            if (r3 == 0) goto L21
            r3.setStytle(r4)
        L21:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.BaseMBMediaView.getFullScreenViewByStyle(android.content.Context, com.mbridge.msdk.nativex.view.mbfullview.BaseView$a):com.mbridge.msdk.nativex.view.mbfullview.BaseView");
    }

    public void setFullScreenViewBackgroundColor(int i) {
        this.w = i;
    }

    public void setFollowActivityOrientation(boolean z) {
        this.al = z;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.al || this.ak == configuration.orientation) {
            return;
        }
        int i = configuration.orientation;
        this.ak = i;
        this.j = i == 0;
        this.k = this.ak == 0;
        this.N.postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.8
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.G, BaseMBMediaView.this.j);
                    if (BaseMBMediaView.this.ak == 0) {
                        BaseMBMediaView.this.E();
                    } else {
                        BaseMBMediaView.this.D();
                    }
                    BaseMBMediaView.this.i();
                    BaseMBMediaView.this.g();
                    BaseMBMediaView.this.h();
                    if (BaseMBMediaView.this.C != null) {
                        BaseMBMediaView.this.C.orientation(BaseMBMediaView.this.j);
                    }
                } catch (Exception e2) {
                    ad.b(BaseMBMediaView.TAG, e2.getMessage());
                }
            }
        }, 200L);
    }

    public boolean ismCurIsFullScreen() {
        return this.i;
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) throws JSONException {
        ad.a(TAG, "cai:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String strOptString = new JSONObject(str).optString("packageName");
            if (TextUtils.isEmpty(strOptString)) {
                com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "packageName is empty");
            }
            int i = ai.c(com.mbridge.msdk.foundation.controller.c.m().c(), strOptString) ? 1 : 2;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", com.mbridge.msdk.mbsignalcommon.communication.d.b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", i);
                jSONObject.put("data", jSONObject2);
                com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception e2) {
                com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, e2.getMessage());
                ad.a(TAG, e2.getMessage());
            }
        } catch (JSONException e3) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + e3.getLocalizedMessage());
            ad.a(TAG, "cai", e3);
        } catch (Throwable th) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + th.getLocalizedMessage());
            ad.a(TAG, "cai", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.O);
            String strA = a(arrayList, p(), "MAL_16.7.41,3.0.1");
            String strEncodeToString = !TextUtils.isEmpty(strA) ? Base64.encodeToString(strA.getBytes(), 2) : "";
            ad.b(TAG, "getEndScreenInfo-mCampaign.name:" + this.O.getAppName());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, strEncodeToString);
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            Context context = this.am;
            if (context != null) {
                b(context);
            } else {
                if (!(obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) || (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b) == null) {
                    return;
                }
                b(windVaneWebView.getContext());
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) throws JSONException {
        WindVaneWebView windVaneWebView;
        ad.b(TAG, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextC == null) {
            try {
                if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b) != null) {
                    contextC = windVaneWebView.getContext();
                }
            } catch (Exception e2) {
                ad.b(TAG, e2.getMessage());
            }
        }
        if (contextC == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.mbridge.msdk.click.c.c(contextC, strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.e(contextC, strOptString);
            }
        } catch (JSONException e3) {
            ad.b(TAG, e3.getMessage());
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str).optInt("state", 1);
                } catch (Exception e2) {
                    ad.b(TAG, e2.getMessage());
                }
            }
            ad.b(TAG, "SHOW CLOSE BTN ");
            showEndCardWebViewCloseBtn();
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, a(0));
        } catch (Exception e3) {
            ad.b(TAG, e3.getMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().b(obj, a(1));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            exitFullScreen();
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, a(0));
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().b(obj, a(1));
        }
    }

    private String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            ad.b(TAG, "code to string is error");
            return "";
        }
    }

    private String a(List<CampaignEx> list, String str, String str2) throws JSONException {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            JSONArray camplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignList", camplistToJson);
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sdk_info", str2);
            return jSONObject.toString();
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
            return null;
        }
    }

    public float getMediaContentAspectRatio() {
        String imageSize;
        float f2 = 0.0f;
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx != null) {
                if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    imageSize = this.O.getVideoResolution();
                } else {
                    imageSize = this.O.getImageSize();
                }
                if (!TextUtils.isEmpty(imageSize)) {
                    if (imageSize.split("x").length == 2) {
                        f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
                    }
                }
                ad.b(TAG, "resource ratio is : " + f2);
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        try {
            try {
                OnMBMediaViewListener onMBMediaViewListener = this.ad;
                if (onMBMediaViewListener != null) {
                    onMBMediaViewListener.onVideoAdClicked(this.O);
                }
                OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.ae;
                if (onMBMediaViewListenerPlus != null) {
                    onMBMediaViewListenerPlus.onVideoAdClicked(this.O);
                }
            } catch (Exception e2) {
                ad.b(TAG, e2.getMessage());
            }
            if (this.O != null && !an.a(p())) {
                if (!this.O.isReportClick()) {
                    this.O.setReportClick(true);
                    CampaignEx campaignEx = this.O;
                    if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && this.O.getNativeVideoTracking().l() != null) {
                        Context context2 = getContext();
                        CampaignEx campaignEx2 = this.O;
                        com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx2.getCampaignUnitId(), this.O.getNativeVideoTracking().l(), false, false);
                    }
                }
                com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getContext(), p());
                aVar.a(new NativeListener.NativeTrackingListener() { // from class: com.mbridge.msdk.nativex.view.BaseMBMediaView.14
                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final void onDismissLoading(Campaign campaign) {
                    }

                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final void onDownloadFinish(Campaign campaign) {
                    }

                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final void onDownloadProgress(int i) {
                    }

                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final void onDownloadStart(Campaign campaign) {
                    }

                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final boolean onInterceptDefaultLoadingDialog() {
                        return true;
                    }

                    @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
                    public final void onShowLoading(Campaign campaign) {
                    }

                    @Override // com.mbridge.msdk.out.BaseTrackingListener
                    public final void onStartRedirection(Campaign campaign, String str) {
                        try {
                            BaseMBMediaView.m(BaseMBMediaView.this);
                            BaseMBMediaView.n(BaseMBMediaView.this);
                            BaseMBMediaView.a(BaseMBMediaView.this, campaign, str);
                        } catch (Exception e3) {
                            ad.b(BaseMBMediaView.TAG, e3.getMessage());
                        }
                    }

                    @Override // com.mbridge.msdk.out.BaseTrackingListener
                    public final void onRedirectionFailed(Campaign campaign, String str) {
                        try {
                            BaseMBMediaView.o(BaseMBMediaView.this);
                            BaseMBMediaView.p(BaseMBMediaView.this);
                            BaseMBMediaView.b(BaseMBMediaView.this, campaign, str);
                        } catch (Exception e3) {
                            ad.b(BaseMBMediaView.TAG, e3.getMessage());
                        }
                    }

                    @Override // com.mbridge.msdk.out.BaseTrackingListener
                    public final void onFinishRedirection(Campaign campaign, String str) {
                        try {
                            BaseMBMediaView.o(BaseMBMediaView.this);
                            BaseMBMediaView.p(BaseMBMediaView.this);
                            BaseMBMediaView.c(BaseMBMediaView.this, campaign, str);
                        } catch (Exception e3) {
                            ad.b(BaseMBMediaView.TAG, e3.getMessage());
                        }
                    }
                });
                aVar.a(this.O);
            }
        } catch (Exception e3) {
            ad.b(TAG, e3.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i, int i2) {
        int i3;
        String str;
        CampaignEx.b mediaViewHolder;
        CampaignEx.b mediaViewHolder2;
        try {
            CampaignEx campaignEx = this.O;
            if (campaignEx != null && (mediaViewHolder2 = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder2.b && mediaViewHolder2.f2804a != null && mediaViewHolder2.f2804a.size() > 0) {
                Map<Integer, String> map = mediaViewHolder2.f2804a;
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    Integer key = next.getKey();
                    String value = next.getValue();
                    if (i >= key.intValue() && !TextUtils.isEmpty(value)) {
                        Context context = getContext();
                        CampaignEx campaignEx2 = this.O;
                        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), value, false, false);
                        it.remove();
                    }
                }
                if (map.size() <= 0) {
                    mediaViewHolder2.b = true;
                }
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
        try {
            CampaignEx campaignEx3 = this.O;
            if (campaignEx3 != null && (mediaViewHolder = campaignEx3.getMediaViewHolder()) != null && !mediaViewHolder.h && i2 != 0) {
                List<Map<Integer, String>> listI = this.O.getNativeVideoTracking().i();
                int i4 = ((i + 1) * 100) / i2;
                if (listI != null) {
                    int i5 = 0;
                    while (i5 < listI.size()) {
                        Map<Integer, String> map2 = listI.get(i5);
                        if (map2 != null && map2.size() > 0) {
                            Iterator<Map.Entry<Integer, String>> it2 = map2.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry<Integer, String> next2 = it2.next();
                                int iIntValue = next2.getKey().intValue();
                                String value2 = next2.getValue();
                                if (iIntValue <= i4 && !TextUtils.isEmpty(value2)) {
                                    Context context2 = getContext();
                                    CampaignEx campaignEx4 = this.O;
                                    com.mbridge.msdk.click.a.a(context2, campaignEx4, campaignEx4.getCampaignUnitId(), new String[]{value2}, false, true);
                                    it2.remove();
                                    listI.remove(i5);
                                    i5--;
                                }
                            }
                        }
                        i5++;
                    }
                    if (listI.size() <= 0) {
                        mediaViewHolder.h = true;
                    }
                }
            }
        } catch (Throwable unused) {
            ad.b(TAG, "reportPlayPercentageData error");
        }
        MediaEvents mediaEvents = this.v;
        if (mediaEvents != null) {
            int i6 = (i * 100) / i2;
            int i7 = ((i + 1) * 100) / i2;
            if (i6 <= 25 && 25 < i7) {
                mediaEvents.firstQuartile();
            } else if (i6 <= 50 && 50 < i7) {
                mediaEvents.midpoint();
            } else if (i6 <= 75 && 75 < i7) {
                mediaEvents.thirdQuartile();
            }
        }
        if (t() == 100 || this.an) {
            return;
        }
        int iG = u() != null ? u().g() : 0;
        int iT = t();
        if (iT == 0) {
            return;
        }
        if (iG > iT) {
            iG = iT / 2;
        }
        if (iG < 0 || i < (i3 = (iG * i2) / 100)) {
            return;
        }
        if (this.O.getAdType() == 94 || this.O.getAdType() == 287) {
            str = this.O.getRequestId() + this.O.getId() + this.O.getVideoUrlEncode();
        } else {
            str = this.O.getId() + this.O.getVideoUrlEncode() + this.O.getBidToken();
        }
        com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(p(), str);
        if (aVarA != null) {
            aVarA.p();
            this.an = true;
            ad.b(TAG, "CDRate is : " + i3 + " and start download !");
        }
    }

    static /* synthetic */ void b(BaseMBMediaView baseMBMediaView) {
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null) {
            return;
        }
        com.mbridge.msdk.foundation.controller.c.m().a(baseMBMediaView.getContext());
        com.mbridge.msdk.mbnative.e.b.a(baseMBMediaView.O, baseMBMediaView.getContext(), baseMBMediaView.p(), null);
        CampaignEx.b mediaViewHolder = baseMBMediaView.O.getMediaViewHolder();
        if (!mediaViewHolder.l && baseMBMediaView.ac == a.VIDEO && an.b(baseMBMediaView.O.getImpressionURL())) {
            mediaViewHolder.l = true;
            String impressionURL = baseMBMediaView.O.getImpressionURL();
            if (!impressionURL.contains("is_video=1")) {
                StringBuilder sb = new StringBuilder(impressionURL);
                if (impressionURL.contains("?")) {
                    sb.append("&is_video=1");
                } else {
                    sb.append("?is_video=1");
                }
                impressionURL = sb.toString();
            }
            Context context = baseMBMediaView.getContext();
            CampaignEx campaignEx2 = baseMBMediaView.O;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), impressionURL, false, true, com.mbridge.msdk.click.a.a.g);
        }
    }

    static /* synthetic */ void d(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.k || baseMBMediaView.O.getNativeVideoTracking() == null || baseMBMediaView.O.getNativeVideoTracking().t() == null) {
            return;
        }
        mediaViewHolder.k = true;
        Context context = baseMBMediaView.getContext();
        CampaignEx campaignEx2 = baseMBMediaView.O;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().t(), false, false);
    }

    static /* synthetic */ void h(BaseMBMediaView baseMBMediaView) {
        try {
            MediaViewPlayerView mediaViewPlayerView = baseMBMediaView.x;
            if (mediaViewPlayerView == null) {
                return;
            }
            mediaViewPlayerView.onClickPlayerView();
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    static /* synthetic */ void m(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.E;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    static /* synthetic */ void n(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.K;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    static /* synthetic */ void a(BaseMBMediaView baseMBMediaView, Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = baseMBMediaView.ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onStartRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = baseMBMediaView.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onStartRedirection(campaign, str);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    static /* synthetic */ void o(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.E;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    static /* synthetic */ void p(BaseMBMediaView baseMBMediaView) {
        try {
            ProgressBar progressBar = baseMBMediaView.K;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    static /* synthetic */ void b(BaseMBMediaView baseMBMediaView, Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = baseMBMediaView.ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onRedirectionFailed(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = baseMBMediaView.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onRedirectionFailed(campaign, str);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    static /* synthetic */ void c(BaseMBMediaView baseMBMediaView, Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = baseMBMediaView.ad;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onFinishRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = baseMBMediaView.ae;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onFinishRedirection(campaign, str);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    static /* synthetic */ void q(BaseMBMediaView baseMBMediaView) {
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null || baseMBMediaView.O.getMediaViewHolder().d || TextUtils.isEmpty(baseMBMediaView.O.getCampaignUnitId()) || baseMBMediaView.O.getNativeVideoTracking() == null || baseMBMediaView.O.getNativeVideoTracking().o() == null) {
            return;
        }
        baseMBMediaView.O.getMediaViewHolder().d = true;
        Context context = baseMBMediaView.getContext();
        CampaignEx campaignEx2 = baseMBMediaView.O;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().o(), false, false);
    }

    static /* synthetic */ void a(BaseMBMediaView baseMBMediaView, String str) {
        try {
            q qVarA = q.a(com.mbridge.msdk.foundation.db.h.a(baseMBMediaView.getContext()));
            n nVar = null;
            if (!TextUtils.isEmpty(baseMBMediaView.O.getNoticeUrl())) {
                int iL = z.l(baseMBMediaView.getContext());
                nVar = new n("2000021", iL, baseMBMediaView.O.getNoticeUrl(), str, z.a(baseMBMediaView.getContext(), iL));
            } else if (!TextUtils.isEmpty(baseMBMediaView.O.getClickURL())) {
                int iL2 = z.l(baseMBMediaView.getContext());
                nVar = new n("2000021", iL2, baseMBMediaView.O.getClickURL(), str, z.a(baseMBMediaView.getContext(), iL2));
            }
            if (nVar != null) {
                nVar.e(baseMBMediaView.O.getId());
                nVar.m(baseMBMediaView.O.getVideoUrlEncode());
                nVar.h(str);
                nVar.f(baseMBMediaView.O.getRequestId());
                nVar.g(baseMBMediaView.O.getRequestIdNotice());
                nVar.c(baseMBMediaView.p());
                qVarA.a(nVar);
            }
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    static /* synthetic */ void M(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f || baseMBMediaView.O.getNativeVideoTracking() == null || baseMBMediaView.O.getNativeVideoTracking().j() == null) {
            return;
        }
        mediaViewHolder.f = true;
        Context context = baseMBMediaView.getContext();
        CampaignEx campaignEx2 = baseMBMediaView.O;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().j(), false, false);
    }

    static /* synthetic */ void N(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.j || baseMBMediaView.O.getNativeVideoTracking() == null || baseMBMediaView.O.getNativeVideoTracking().k() == null) {
            return;
        }
        mediaViewHolder.j = true;
        Context context = baseMBMediaView.getContext();
        CampaignEx campaignEx2 = baseMBMediaView.O;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().k(), false, false);
    }

    static /* synthetic */ void O(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.g || baseMBMediaView.O.getNativeVideoTracking() == null || baseMBMediaView.O.getNativeVideoTracking().m() == null) {
            return;
        }
        mediaViewHolder.g = true;
        Context context = baseMBMediaView.getContext();
        CampaignEx campaignEx2 = baseMBMediaView.O;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().m(), false, false);
    }

    static /* synthetic */ void P(BaseMBMediaView baseMBMediaView) {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = baseMBMediaView.O;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.i || baseMBMediaView.O.getNativeVideoTracking() == null || baseMBMediaView.O.getNativeVideoTracking().n() == null) {
            return;
        }
        mediaViewHolder.i = true;
        Context context = baseMBMediaView.getContext();
        CampaignEx campaignEx2 = baseMBMediaView.O;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), baseMBMediaView.O.getNativeVideoTracking().n(), false, false);
    }

    static /* synthetic */ void R(BaseMBMediaView baseMBMediaView) {
        try {
            MediaViewPlayerView mediaViewPlayerView = baseMBMediaView.x;
            if (mediaViewPlayerView != null && mediaViewPlayerView.hasPrepare() && baseMBMediaView.x.isPlaying()) {
                try {
                    MediaViewPlayerView mediaViewPlayerView2 = baseMBMediaView.x;
                    if (mediaViewPlayerView2 != null) {
                        mediaViewPlayerView2.pause();
                    }
                } catch (Throwable th) {
                    ad.b(TAG, th.getMessage());
                }
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage());
        }
    }

    static /* synthetic */ void S(BaseMBMediaView baseMBMediaView) {
        try {
            MediaViewPlayerView mediaViewPlayerView = baseMBMediaView.x;
            if (mediaViewPlayerView == null || !mediaViewPlayerView.hasPrepare() || baseMBMediaView.x.isPlaying() || baseMBMediaView.x.isComplete() || !baseMBMediaView.x.hasPrepare()) {
                return;
            }
            baseMBMediaView.x.startOrPlayVideo();
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }
}
