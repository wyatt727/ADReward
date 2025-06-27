package com.unity3d.player;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.json.t2;
import com.unity3d.player.C;
import com.unity3d.player.U;
import com.unity3d.player.UnityPermissions;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class UnityPlayer extends FrameLayout implements IUnityPlayerLifecycleEvents {
    private static final int ANR_TIMEOUT_SECONDS = 4;
    private static final String ARCORE_ENABLE_METADATA_NAME = "unity.arcore-enable";
    private static final String AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME = "unity.auto-report-fully-drawn";
    private static final String LAUNCH_FULLSCREEN = "unity.launch-fullscreen";
    private static final int RUN_STATE_CHANGED_MSG_CODE = 2269;
    private static final String SPLASH_ENABLE_METADATA_NAME = "unity.splash-enable";
    private static final String SPLASH_MODE_METADATA_NAME = "unity.splash-mode";
    public static Activity currentActivity;
    private Activity mActivity;
    private Context mContext;
    private I mGlView;
    Handler mHandler;
    private int mInitialScreenOrientation;
    private boolean mIsFullscreen;
    private boolean mMainDisplayOverride;
    private int mNaturalOrientation;
    private OrientationEventListener mOrientationListener;
    private boolean mProcessKillRequested;
    private boolean mQuitting;
    com.unity3d.player.B mSoftInputDialog;
    private J mState;
    private U mVideoPlayerProxy;
    private GoogleARCoreApi m_ARCoreApi;
    private boolean m_AddPhoneCallListener;
    private AudioVolumeHandler m_AudioVolumeHandler;
    private Camera2Wrapper m_Camera2Wrapper;
    private ClipboardManager m_ClipboardManager;
    private final ConcurrentLinkedQueue m_Events;
    private B m_FakeListener;
    private HFPStatus m_HFPStatus;
    private int m_IsNoWindowMode;
    F m_MainThread;
    private NetworkConnectivity m_NetworkConnectivity;
    private OrientationLockListener m_OrientationLockListener;
    private D m_PhoneCallListener;
    private com.unity3d.player.C m_SplashScreen;
    private TelephonyManager m_TelephonyManager;
    private IUnityPlayerLifecycleEvents m_UnityPlayerLifecycleEvents;
    Window m_Window;
    private Uri m_launchUri;
    private Configuration prevConfig;

    class A implements Runnable {
        A() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.nativeLowMemory();
        }
    }

    class B implements SensorEventListener {
        B(UnityPlayer unityPlayer) {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class C {

        /* renamed from: a, reason: collision with root package name */
        public static final C f4359a = new C("GAINED", 0);
        public static final C b = new C("LOST", 1);
        public static final C c = new C("DEFERRED", 2);

        private C(String str, int i) {
        }
    }

    private class D extends PhoneStateListener {
        private D() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            UnityPlayer.this.nativeMuteMasterAudio(i == 1);
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class E {

        /* renamed from: a, reason: collision with root package name */
        public static final E f4361a = new E("PAUSE", 0);
        public static final E b = new E("RESUME", 1);
        public static final E c = new E("QUIT", 2);
        public static final E d = new E("SURFACE_LOST", 3);
        public static final E e = new E("SURFACE_ACQUIRED", 4);
        public static final E f = new E("FOCUS_LOST", 5);
        public static final E g = new E("FOCUS_GAINED", 6);
        public static final E h = new E("NEXT_FRAME", 7);
        public static final E i = new E("URL_ACTIVATED", 8);
        public static final E j = new E("ORIENTATION_ANGLE_CHANGE", 9);

        private E(String str, int i2) {
        }
    }

    private class F extends Thread {

        /* renamed from: a, reason: collision with root package name */
        Handler f4362a;
        boolean b;
        boolean c;
        C d;
        int e;
        int f;
        int g;
        int h;

        class a implements Handler.Callback {
            a() {
            }

            private void a() {
                F f = F.this;
                if (f.d == C.c && f.c) {
                    UnityPlayer.this.nativeFocusChanged(true);
                    F.this.d = C.f4359a;
                }
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != UnityPlayer.RUN_STATE_CHANGED_MSG_CODE) {
                    return false;
                }
                E e = (E) message.obj;
                E e2 = E.h;
                if (e == e2) {
                    F f = F.this;
                    f.e--;
                    UnityPlayer.this.executeGLThreadJobs();
                    F f2 = F.this;
                    if (!f2.b) {
                        return true;
                    }
                    if (UnityPlayer.this.getHaveAndroidWindowSupport() && !F.this.c) {
                        return true;
                    }
                    F f3 = F.this;
                    int i = f3.h;
                    if (i >= 0) {
                        if (i == 0) {
                            if (UnityPlayer.this.getSplashEnabled()) {
                                UnityPlayer.this.DisableStaticSplashScreen();
                            }
                            UnityPlayer unityPlayer = UnityPlayer.this;
                            if (unityPlayer.mActivity != null && unityPlayer.getAutoReportFullyDrawnEnabled()) {
                                UnityPlayer.this.mActivity.reportFullyDrawn();
                            }
                        }
                        F.this.h--;
                    }
                    if (!UnityPlayer.this.isFinishing() && !UnityPlayer.this.nativeRender()) {
                        UnityPlayer.this.finish();
                    }
                } else if (e == E.c) {
                    Looper.myLooper().quit();
                } else if (e == E.b) {
                    F.this.b = true;
                } else if (e == E.f4361a) {
                    F.this.b = false;
                } else if (e == E.d) {
                    F.this.c = false;
                } else {
                    if (e == E.e) {
                        F.this.c = true;
                    } else if (e == E.f) {
                        F f4 = F.this;
                        if (f4.d == C.f4359a) {
                            UnityPlayer.this.nativeFocusChanged(false);
                        }
                        F.this.d = C.b;
                    } else if (e == E.g) {
                        F.this.d = C.c;
                    } else if (e == E.i) {
                        UnityPlayer unityPlayer2 = UnityPlayer.this;
                        unityPlayer2.nativeSetLaunchURL(unityPlayer2.getLaunchURL());
                    } else if (e == E.j) {
                        F f5 = F.this;
                        UnityPlayer.this.nativeOrientationChanged(f5.f, f5.g);
                    }
                    a();
                }
                F f6 = F.this;
                if (f6.b && f6.e <= 0) {
                    Message.obtain(f6.f4362a, UnityPlayer.RUN_STATE_CHANGED_MSG_CODE, e2).sendToTarget();
                    F.this.e++;
                }
                return true;
            }
        }

        private F() {
            this.b = false;
            this.c = false;
            this.d = C.b;
            this.e = 0;
            this.h = 5;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("UnityMain");
            Looper.prepare();
            this.f4362a = new Handler(Looper.myLooper(), new a());
            Looper.loop();
        }
    }

    private abstract class G implements Runnable {
        private G() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (UnityPlayer.this.isFinishing()) {
                return;
            }
            a();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$a, reason: case insensitive filesystem */
    class RunnableC1509a implements Runnable {
        RunnableC1509a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.nativeResume();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$b, reason: case insensitive filesystem */
    class RunnableC1510b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UnityPlayer f4366a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;
        final /* synthetic */ boolean d;
        final /* synthetic */ boolean e;
        final /* synthetic */ boolean f;
        final /* synthetic */ boolean g;
        final /* synthetic */ String h;
        final /* synthetic */ int i;
        final /* synthetic */ boolean j;
        final /* synthetic */ boolean k;

        /* renamed from: com.unity3d.player.UnityPlayer$b$a */
        class a implements DialogInterface.OnCancelListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                UnityPlayer.this.nativeSoftInputLostFocus();
                UnityPlayer.this.reportSoftInputStr(null, 1, false);
            }
        }

        RunnableC1510b(UnityPlayer unityPlayer, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
            this.f4366a = unityPlayer;
            this.b = str;
            this.c = i;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
            this.h = str2;
            this.i = i2;
            this.j = z5;
            this.k = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.mSoftInputDialog = new com.unity3d.player.B(UnityPlayer.this.mContext, this.f4366a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
            UnityPlayer.this.mSoftInputDialog.setOnCancelListener(new a());
            UnityPlayer.this.mSoftInputDialog.show();
            UnityPlayer.this.nativeReportKeyboardConfigChanged();
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$c, reason: case insensitive filesystem */
    class RunnableC1511c implements Runnable {
        RunnableC1511c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            I i = UnityPlayer.this.mGlView;
            if (i != null) {
                i.b();
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$d, reason: case insensitive filesystem */
    class RunnableC1512d implements Runnable {
        RunnableC1512d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.reportSoftInputArea(new Rect());
            UnityPlayer.this.reportSoftInputIsVisible(false);
            com.unity3d.player.B b = UnityPlayer.this.mSoftInputDialog;
            if (b != null) {
                b.dismiss();
                UnityPlayer unityPlayer = UnityPlayer.this;
                unityPlayer.mSoftInputDialog = null;
                unityPlayer.nativeReportKeyboardConfigChanged();
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$e, reason: case insensitive filesystem */
    class RunnableC1513e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4370a;

        RunnableC1513e(String str) {
            this.f4370a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            com.unity3d.player.B b = UnityPlayer.this.mSoftInputDialog;
            if (b == null || (str = this.f4370a) == null) {
                return;
            }
            b.a(str);
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$f, reason: case insensitive filesystem */
    class RunnableC1514f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4371a;

        RunnableC1514f(int i) {
            this.f4371a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.unity3d.player.B b = UnityPlayer.this.mSoftInputDialog;
            if (b != null) {
                b.a(this.f4371a);
            }
        }
    }

    /* renamed from: com.unity3d.player.UnityPlayer$g, reason: case insensitive filesystem */
    class RunnableC1515g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4372a;

        RunnableC1515g(boolean z) {
            this.f4372a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.unity3d.player.B b = UnityPlayer.this.mSoftInputDialog;
            if (b != null) {
                b.a(this.f4372a);
            }
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4373a;
        final /* synthetic */ int b;

        h(int i, int i2) {
            this.f4373a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.unity3d.player.B b = UnityPlayer.this.mSoftInputDialog;
            if (b != null) {
                b.a(this.f4373a, this.b);
            }
        }
    }

    class i extends G {
        final /* synthetic */ boolean b;
        final /* synthetic */ String c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z, String str, int i) {
            super();
            this.b = z;
            this.c = str;
            this.d = i;
        }

        @Override // com.unity3d.player.UnityPlayer.G
        public void a() {
            if (this.b) {
                UnityPlayer.this.nativeSoftInputCanceled();
            } else {
                String str = this.c;
                if (str != null) {
                    UnityPlayer.this.nativeSetInputString(str);
                }
            }
            if (this.d == 1) {
                UnityPlayer.this.nativeSoftInputClosed();
            }
        }
    }

    class j extends G {
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i, int i2) {
            super();
            this.b = i;
            this.c = i2;
        }

        @Override // com.unity3d.player.UnityPlayer.G
        public void a() {
            UnityPlayer.this.nativeSetInputSelection(this.b, this.c);
        }
    }

    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            UnityPlayer.this.finish();
        }
    }

    class l extends G {
        final /* synthetic */ Rect b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Rect rect) {
            super();
            this.b = rect;
        }

        @Override // com.unity3d.player.UnityPlayer.G
        public void a() {
            UnityPlayer unityPlayer = UnityPlayer.this;
            Rect rect = this.b;
            unityPlayer.nativeSetInputArea(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    class m extends G {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z) {
            super();
            this.b = z;
        }

        @Override // com.unity3d.player.UnityPlayer.G
        public void a() {
            UnityPlayer.this.nativeSetKeyboardIsVisible(this.b);
        }
    }

    class n implements U.a {
        n() {
        }

        public void a() {
            UnityPlayer.this.mVideoPlayerProxy = null;
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer unityPlayer;
            Activity activity;
            if (!UnityPlayer.this.nativeIsAutorotationOn() || (activity = (unityPlayer = UnityPlayer.this).mActivity) == null) {
                return;
            }
            activity.setRequestedOrientation(unityPlayer.mInitialScreenOrientation);
        }
    }

    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.pause();
            UnityPlayer.this.windowFocusChanged(false);
            UnityPlayer.this.m_UnityPlayerLifecycleEvents.onUnityPlayerUnloaded();
        }
    }

    class q extends OrientationEventListener {
        q(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            UnityPlayer unityPlayer = UnityPlayer.this;
            F f = unityPlayer.m_MainThread;
            f.f = unityPlayer.mNaturalOrientation;
            f.g = i;
            E e = E.j;
            Handler handler = f.f4362a;
            if (handler != null) {
                Message.obtain(handler, UnityPlayer.RUN_STATE_CHANGED_MSG_CODE, e).sendToTarget();
            }
        }
    }

    class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f4379a;

        r(float f) {
            this.f4379a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.mGlView.a(this.f4379a);
        }
    }

    class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f4380a;

        s(float f) {
            this.f4380a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            WindowManager.LayoutParams attributes = UnityPlayer.this.m_Window.getAttributes();
            attributes.screenBrightness = this.f4380a;
            UnityPlayer.this.m_Window.setAttributes(attributes);
        }
    }

    class t implements Runnable {
        t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer unityPlayer = UnityPlayer.this;
            unityPlayer.removeView(unityPlayer.m_SplashScreen);
            UnityPlayer.this.m_SplashScreen = null;
        }
    }

    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.nativeSendSurfaceChangedEvent();
        }
    }

    class v implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4383a;
        final /* synthetic */ Surface b;
        final /* synthetic */ Semaphore c;

        v(int i, Surface surface, Semaphore semaphore) {
            this.f4383a = i;
            this.b = surface;
            this.c = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.nativeRecreateGfxState(this.f4383a, this.b);
            this.c.release();
        }
    }

    class w implements Runnable {
        w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer unityPlayer = UnityPlayer.this;
            if (unityPlayer.mMainDisplayOverride) {
                unityPlayer.removeView(unityPlayer.mGlView);
            } else if (unityPlayer.mGlView.getParent() != null) {
                AbstractC1536u.Log(5, "Couldn't add view, because it's already assigned to another parent");
            } else {
                UnityPlayer unityPlayer2 = UnityPlayer.this;
                unityPlayer2.addView(unityPlayer2.mGlView);
            }
        }
    }

    class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            UnityPlayer.this.destroy();
        }
    }

    class y implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Semaphore f4386a;

        y(Semaphore semaphore) {
            this.f4386a = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            UnityPlayer.this.shutdown();
            this.f4386a.release();
        }
    }

    class z implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Semaphore f4387a;

        z(Semaphore semaphore) {
            this.f4387a = semaphore;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UnityPlayer.this.nativePause()) {
                UnityPlayer unityPlayer = UnityPlayer.this;
                unityPlayer.mQuitting = true;
                unityPlayer.shutdown();
                UnityPlayer.this.queueDestroy();
            }
            this.f4387a.release();
        }
    }

    static {
        new com.unity3d.player.G().a();
    }

    public UnityPlayer(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityPlayer(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) throws ClassNotFoundException {
        super(context);
        this.mHandler = new Handler();
        this.mInitialScreenOrientation = -1;
        this.mMainDisplayOverride = false;
        this.mIsFullscreen = true;
        this.mState = new J();
        this.m_Events = new ConcurrentLinkedQueue();
        this.mOrientationListener = null;
        this.m_MainThread = new F();
        this.m_AddPhoneCallListener = false;
        this.m_PhoneCallListener = new D();
        this.m_ARCoreApi = null;
        this.m_FakeListener = new B(this);
        this.m_Camera2Wrapper = null;
        this.m_HFPStatus = null;
        this.m_AudioVolumeHandler = null;
        this.m_OrientationLockListener = null;
        this.m_launchUri = null;
        this.m_NetworkConnectivity = null;
        this.m_UnityPlayerLifecycleEvents = null;
        this.m_IsNoWindowMode = -1;
        this.mProcessKillRequested = true;
        this.mSoftInputDialog = null;
        this.m_UnityPlayerLifecycleEvents = iUnityPlayerLifecycleEvents == null ? this : iUnityPlayerLifecycleEvents;
        com.unity3d.player.G.a(getUnityNativeLibraryPath(context));
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.mActivity = activity;
            currentActivity = activity;
            this.mInitialScreenOrientation = activity.getRequestedOrientation();
            this.m_launchUri = this.mActivity.getIntent().getData();
        }
        this.mContext = context;
        EarlyEnableFullScreenIfEnabled();
        Configuration configuration = getResources().getConfiguration();
        this.prevConfig = configuration;
        this.mNaturalOrientation = getNaturalOrientation(configuration.orientation);
        if (this.mActivity != null && getSplashEnabled()) {
            com.unity3d.player.C c = new com.unity3d.player.C(this.mContext, C.a.values()[getSplashMode()]);
            this.m_SplashScreen = c;
            addView(c);
        }
        preloadJavaPlugins();
        String strLoadNative = loadNative(getUnityNativeLibraryPath(this.mContext));
        if (!J.d()) {
            AbstractC1536u.Log(6, "Your hardware does not support this application.");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this.mContext).setTitle("Failure to initialize!").setPositiveButton("OK", new k()).setMessage("Your hardware does not support this application.\n\n" + strLoadNative + "\n\n Press OK to quit.").create();
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.show();
            return;
        }
        initJni(context);
        this.mState.d(true);
        I i2 = new I(context, this);
        this.mGlView = i2;
        addView(i2);
        bringChildToFront(this.m_SplashScreen);
        this.mQuitting = false;
        Activity activity2 = this.mActivity;
        if (activity2 != null) {
            this.m_Window = activity2.getWindow();
        }
        hideStatusBar();
        this.m_TelephonyManager = (TelephonyManager) this.mContext.getSystemService("phone");
        this.m_ClipboardManager = (ClipboardManager) this.mContext.getSystemService("clipboard");
        this.m_Camera2Wrapper = new Camera2Wrapper(this.mContext);
        this.m_HFPStatus = new HFPStatus(this.mContext);
        this.m_MainThread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void DisableStaticSplashScreen() {
        runOnUiThread(new t());
    }

    private void EarlyEnableFullScreenIfEnabled() {
        View decorView;
        Activity activity = this.mActivity;
        if (activity == null || activity.getWindow() == null) {
            return;
        }
        if ((getLaunchFullscreen() || this.mActivity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false)) && (decorView = this.mActivity.getWindow().getDecorView()) != null) {
            decorView.setSystemUiVisibility(7);
        }
    }

    private String GetGlViewContentDescription(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", TypedValues.Custom.S_STRING, context.getPackageName()));
    }

    private boolean IsWindowTranslucent() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return false;
        }
        TypedArray typedArrayObtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowIsTranslucent});
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z2;
    }

    public static void UnitySendMessage(String str, String str2, String str3) {
        if (J.d()) {
            try {
                nativeUnitySendMessage(str, str2, str3.getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
                return;
            } catch (UnsupportedEncodingException unused) {
                return;
            }
        }
        AbstractC1536u.Log(5, "Native libraries not loaded - dropping message for " + str + "." + str2);
    }

    private void checkResumePlayer() {
        Activity activity = this.mActivity;
        if (this.mState.a(activity != null ? MultiWindowSupport.getAllowResizableWindow(activity) : false)) {
            this.mState.c(true);
            queueGLThreadEvent(new RunnableC1509a());
            F f = this.m_MainThread;
            E e = E.b;
            Handler handler = f.f4362a;
            if (handler != null) {
                Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, e).sendToTarget();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish() {
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.mActivity.finish();
    }

    private boolean getARCoreEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(ARCORE_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    private ActivityInfo getActivityInfo() {
        return this.mActivity.getPackageManager().getActivityInfo(this.mActivity.getComponentName(), 128);
    }

    private ApplicationInfo getApplicationInfo() {
        return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getAutoReportFullyDrawnEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getHaveAndroidWindowSupport() {
        if (this.m_IsNoWindowMode == -1) {
            this.m_IsNoWindowMode = nativeGetNoWindowMode() ? 1 : 0;
        }
        return this.m_IsNoWindowMode == 1;
    }

    private boolean getLaunchFullscreen() {
        try {
            return getApplicationInfo().metaData.getBoolean(LAUNCH_FULLSCREEN);
        } catch (Exception unused) {
            return false;
        }
    }

    private int getNaturalOrientation(int i2) {
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if ((rotation == 0 || rotation == 2) && i2 == 2) {
            return 0;
        }
        return ((rotation == 1 || rotation == 3) && i2 == 1) ? 0 : 1;
    }

    private String getProcessName() {
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.mContext.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getSplashEnabled() {
        try {
            return getApplicationInfo().metaData.getBoolean(SPLASH_ENABLE_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    private static String getUnityNativeLibraryPath(Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }

    private void hidePreservedContent() {
        runOnUiThread(new RunnableC1511c());
    }

    private void hideStatusBar() {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.getWindow().setFlags(1024, 1024);
        }
    }

    private final native void initJni(Context context);

    private static String loadNative(String str) {
        String str2 = str + "/libmain.so";
        try {
            try {
                try {
                    System.load(str2);
                } catch (SecurityException e) {
                    return logLoadLibMainError(str2, e.toString());
                }
            } catch (UnsatisfiedLinkError e2) {
                return logLoadLibMainError(str2, e2.toString());
            }
        } catch (UnsatisfiedLinkError unused) {
            System.loadLibrary(t2.h.Z);
        }
        if (NativeLoader.load(str)) {
            J.e();
            return "";
        }
        AbstractC1536u.Log(6, "NativeLoader.load failure, Unity libraries were not loaded.");
        return "NativeLoader.load failure, Unity libraries were not loaded.";
    }

    private static String logLoadLibMainError(String str, String str2) {
        String str3 = "Failed to load 'libmain.so'\n\n" + str2;
        AbstractC1536u.Log(6, str3);
        return str3;
    }

    private final native void nativeApplicationUnload();

    private final native boolean nativeDone();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeFocusChanged(boolean z2);

    private final native boolean nativeGetNoWindowMode();

    private final native void nativeHidePreservedContent();

    private final native boolean nativeInjectEvent(InputEvent inputEvent);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeIsAutorotationOn();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeLowMemory();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeMuteMasterAudio(boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOrientationChanged(int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativePause();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeRecreateGfxState(int i2, Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean nativeRender();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeReportKeyboardConfigChanged();

    private final native void nativeRestartActivityIndicator();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeResume();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSendSurfaceChangedEvent();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputArea(int i2, int i3, int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputSelection(int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetInputString(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetKeyboardIsVisible(boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetLaunchURL(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputCanceled();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputClosed();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSoftInputLostFocus();

    private static native void nativeUnitySendMessage(String str, String str2, byte[] bArr);

    private void pauseUnity() {
        reportSoftInputStr(null, 1, true);
        if (!this.mState.c() || this.mState.b()) {
            return;
        }
        if (J.d()) {
            Semaphore semaphore = new Semaphore(0);
            Runnable yVar = isFinishing() ? new y(semaphore) : new z(semaphore);
            F f = this.m_MainThread;
            Handler handler = f.f4362a;
            if (handler != null) {
                Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, E.f4361a).sendToTarget();
                Message.obtain(f.f4362a, yVar).sendToTarget();
            }
            try {
                if (!semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                    AbstractC1536u.Log(5, "Timeout while trying to pause the Unity Engine.");
                }
            } catch (InterruptedException unused) {
                AbstractC1536u.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
            }
        }
        this.mState.c(false);
        this.mState.e(true);
        if (this.m_AddPhoneCallListener) {
            this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
        }
    }

    private static void preloadJavaPlugins() throws ClassNotFoundException {
        try {
            Class.forName("com.unity3d.JavaPluginPreloader");
        } catch (ClassNotFoundException unused) {
        } catch (LinkageError e) {
            AbstractC1536u.Log(6, "Java class preloading failed: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queueDestroy() {
        AbstractC1536u.Log(4, "Queue Destroy");
        runOnUiThread(new x());
    }

    private void queueGLThreadEvent(G g) {
        if (isFinishing()) {
            return;
        }
        queueGLThreadEvent((Runnable) g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdown() {
        this.mProcessKillRequested = nativeDone();
        this.mState.d(false);
    }

    private void swapViews(View view, View view2) {
        boolean z2;
        if (this.mState.b()) {
            z2 = false;
        } else {
            pause();
            z2 = true;
        }
        if (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof UnityPlayer) || ((UnityPlayer) parent) != this) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
                bringChildToFront(view);
                view.setVisibility(0);
            }
        }
        if (view2 != null && view2.getParent() == this) {
            view2.setVisibility(8);
            removeView(view2);
        }
        if (z2) {
            resume();
        }
    }

    private static void unloadNative() {
        if (J.d()) {
            if (!NativeLoader.unload()) {
                throw new UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
            }
            J.f();
        }
    }

    private boolean updateDisplayInternal(int i2, Surface surface) {
        if (!J.d() || !this.mState.a()) {
            return false;
        }
        Semaphore semaphore = new Semaphore(0);
        v vVar = new v(i2, surface, semaphore);
        if (i2 != 0) {
            vVar.run();
        } else if (surface == null) {
            F f = this.m_MainThread;
            Handler handler = f.f4362a;
            if (handler != null) {
                Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, E.d).sendToTarget();
                Message.obtain(f.f4362a, vVar).sendToTarget();
            }
        } else {
            F f2 = this.m_MainThread;
            Handler handler2 = f2.f4362a;
            if (handler2 != null) {
                Message.obtain(handler2, vVar).sendToTarget();
                E e = E.e;
                Handler handler3 = f2.f4362a;
                if (handler3 != null) {
                    Message.obtain(handler3, RUN_STATE_CHANGED_MSG_CODE, e).sendToTarget();
                }
            }
        }
        if (surface != null || i2 != 0) {
            return true;
        }
        try {
            if (semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                return true;
            }
            AbstractC1536u.Log(5, "Timeout while trying detaching primary window.");
            return true;
        } catch (InterruptedException unused) {
            AbstractC1536u.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
            return true;
        }
    }

    protected void addPhoneCallListener() {
        this.m_AddPhoneCallListener = true;
        this.m_TelephonyManager.listen(this.m_PhoneCallListener, 32);
    }

    public boolean addViewToPlayer(View view, boolean z2) {
        swapViews(view, z2 ? this.mGlView : null);
        boolean z3 = true;
        boolean z4 = view.getParent() == this;
        boolean z5 = z2 && this.mGlView.getParent() == null;
        boolean z6 = this.mGlView.getParent() == this;
        if (!z4 || (!z5 && !z6)) {
            z3 = false;
        }
        if (!z3) {
            if (!z4) {
                AbstractC1536u.Log(6, "addViewToPlayer: Failure adding view to hierarchy");
            }
            if (!z5 && !z6) {
                AbstractC1536u.Log(6, "addViewToPlayer: Failure removing old view from hierarchy");
            }
        }
        return z3;
    }

    public void configurationChanged(Configuration configuration) {
        int iDiff = this.prevConfig.diff(configuration);
        if ((iDiff & 256) != 0 || (iDiff & 1024) != 0 || (iDiff & 2048) != 0 || (iDiff & 128) != 0) {
            nativeHidePreservedContent();
        }
        this.prevConfig = new Configuration(configuration);
        U u2 = this.mVideoPlayerProxy;
        if (u2 != null) {
            u2.b();
        }
    }

    public void destroy() throws InterruptedException {
        Camera2Wrapper camera2Wrapper = this.m_Camera2Wrapper;
        if (camera2Wrapper != null) {
            camera2Wrapper.a();
            this.m_Camera2Wrapper = null;
        }
        HFPStatus hFPStatus = this.m_HFPStatus;
        if (hFPStatus != null) {
            hFPStatus.a();
            this.m_HFPStatus = null;
        }
        NetworkConnectivity networkConnectivity = this.m_NetworkConnectivity;
        if (networkConnectivity != null) {
            networkConnectivity.a();
            this.m_NetworkConnectivity = null;
        }
        this.mQuitting = true;
        if (!this.mState.b()) {
            pause();
        }
        F f = this.m_MainThread;
        E e = E.c;
        Handler handler = f.f4362a;
        if (handler != null) {
            Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, e).sendToTarget();
        }
        try {
            this.m_MainThread.join(4000L);
        } catch (InterruptedException unused) {
            this.m_MainThread.interrupt();
        }
        if (J.d()) {
            removeAllViews();
        }
        if (this.mProcessKillRequested) {
            this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
            kill();
        }
        unloadNative();
    }

    protected void disableLogger() {
        AbstractC1536u.f4409a = true;
    }

    public boolean displayChanged(int i2, Surface surface) {
        if (i2 == 0) {
            this.mMainDisplayOverride = surface != null;
            runOnUiThread(new w());
        }
        return updateDisplayInternal(i2, surface);
    }

    protected void executeGLThreadJobs() {
        while (true) {
            Runnable runnable = (Runnable) this.m_Events.poll();
            if (runnable == null) {
                return;
            } else {
                runnable.run();
            }
        }
    }

    protected String getClipboardText() {
        ClipData primaryClip = this.m_ClipboardManager.getPrimaryClip();
        return primaryClip != null ? primaryClip.getItemAt(0).coerceToText(this.mContext).toString() : "";
    }

    protected String getKeyboardLayout() {
        com.unity3d.player.B b = this.mSoftInputDialog;
        if (b == null) {
            return null;
        }
        return b.a();
    }

    protected String getLaunchURL() {
        Uri uri = this.m_launchUri;
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    protected int getNetworkConnectivity() {
        NetworkConnectivity networkConnectivity = this.m_NetworkConnectivity;
        if (networkConnectivity != null) {
            return networkConnectivity.b();
        }
        this.m_NetworkConnectivity = PlatformSupport.NOUGAT_SUPPORT ? new NetworkConnectivityNougat(this.mContext) : new NetworkConnectivity(this.mContext);
        return this.m_NetworkConnectivity.b();
    }

    public String getNetworkProxySettings(String str) {
        String str2;
        String str3;
        if (!str.startsWith("http:")) {
            if (str.startsWith("https:")) {
                str2 = "https.proxyHost";
                str3 = "https.proxyPort";
            }
            return null;
        }
        str2 = "http.proxyHost";
        str3 = "http.proxyPort";
        String property = System.getProperties().getProperty(str2);
        if (property != null && !"".equals(property)) {
            StringBuilder sb = new StringBuilder(property);
            String property2 = System.getProperties().getProperty(str3);
            if (property2 != null && !"".equals(property2)) {
                sb.append(":");
                sb.append(property2);
            }
            String property3 = System.getProperties().getProperty("http.nonProxyHosts");
            if (property3 != null && !"".equals(property3)) {
                sb.append('\n');
                sb.append(property3);
            }
            return sb.toString();
        }
        return null;
    }

    public float getScreenBrightness() {
        Window window = this.m_Window;
        if (window == null) {
            return 1.0f;
        }
        float f = window.getAttributes().screenBrightness;
        if (f >= 0.0f) {
            return f;
        }
        int i2 = Settings.System.getInt(getContext().getContentResolver(), "screen_brightness", 255);
        return PlatformSupport.PIE_SUPPORT ? (float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, Math.min(1.0d, ((Math.log(i2) * 19.811d) - 9.411d) / 100.0d)) : i2 / 255.0f;
    }

    public Bundle getSettings() {
        return Bundle.EMPTY;
    }

    protected int getSplashMode() {
        try {
            return getApplicationInfo().metaData.getInt(SPLASH_MODE_METADATA_NAME);
        } catch (Exception unused) {
            return 0;
        }
    }

    protected int getUaaLLaunchProcessType() {
        String processName = getProcessName();
        return (processName == null || processName.equals(this.mContext.getPackageName())) ? 0 : 1;
    }

    public View getView() {
        return this;
    }

    protected void hideSoftInput() {
        postOnUiThread(new RunnableC1512d());
    }

    public void init(int i2, boolean z2) {
    }

    protected boolean initializeGoogleAr() {
        if (this.m_ARCoreApi != null || this.mActivity == null || !getARCoreEnabled()) {
            return false;
        }
        GoogleARCoreApi googleARCoreApi = new GoogleARCoreApi();
        this.m_ARCoreApi = googleARCoreApi;
        googleARCoreApi.initializeARCore(this.mActivity);
        if (this.mState.b()) {
            return false;
        }
        this.m_ARCoreApi.resumeARCore();
        return false;
    }

    public boolean injectEvent(InputEvent inputEvent) {
        if (J.d()) {
            return nativeInjectEvent(inputEvent);
        }
        return false;
    }

    protected boolean isFinishing() {
        if (this.mQuitting) {
            return true;
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            this.mQuitting = activity.isFinishing();
        }
        return this.mQuitting;
    }

    protected boolean isUaaLUseCase() {
        String callingPackage;
        Activity activity = this.mActivity;
        return (activity == null || (callingPackage = activity.getCallingPackage()) == null || !callingPackage.equals(this.mContext.getPackageName())) ? false : true;
    }

    protected void kill() {
        Process.killProcess(Process.myPid());
    }

    protected boolean loadLibrary(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Exception | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public void lowMemory() {
        if (J.d()) {
            queueGLThreadEvent(new A());
        }
    }

    public void newIntent(Intent intent) {
        this.m_launchUri = intent.getData();
        F f = this.m_MainThread;
        E e = E.i;
        Handler handler = f.f4362a;
        if (handler != null) {
            Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, e).sendToTarget();
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (this.mGlView.c()) {
            return false;
        }
        return injectEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i2, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i2, int i3, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        return injectEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mGlView.c()) {
            return false;
        }
        return injectEvent(motionEvent);
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
    }

    public void pause() {
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.pauseARCore();
        }
        U u2 = this.mVideoPlayerProxy;
        if (u2 != null) {
            u2.c();
        }
        AudioVolumeHandler audioVolumeHandler = this.m_AudioVolumeHandler;
        if (audioVolumeHandler != null) {
            audioVolumeHandler.a();
            this.m_AudioVolumeHandler = null;
        }
        OrientationLockListener orientationLockListener = this.m_OrientationLockListener;
        if (orientationLockListener != null) {
            orientationLockListener.a();
            this.m_OrientationLockListener = null;
        }
        pauseUnity();
    }

    protected void pauseJavaAndCallUnloadCallback() {
        runOnUiThread(new p());
    }

    void postOnUiThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    void queueGLThreadEvent(Runnable runnable) {
        if (J.d()) {
            if (Thread.currentThread() == this.m_MainThread) {
                runnable.run();
            } else {
                this.m_Events.add(runnable);
            }
        }
    }

    public void quit() throws InterruptedException {
        destroy();
    }

    public void removeViewFromPlayer(View view) {
        swapViews(this.mGlView, view);
        boolean z2 = view.getParent() == null;
        boolean z3 = this.mGlView.getParent() == this;
        if (z2 && z3) {
            return;
        }
        if (!z2) {
            AbstractC1536u.Log(6, "removeViewFromPlayer: Failure removing view from hierarchy");
        }
        if (z3) {
            return;
        }
        AbstractC1536u.Log(6, "removeVireFromPlayer: Failure agging old view to hierarchy");
    }

    public void reportError(String str, String str2) {
        AbstractC1536u.Log(6, str + ": " + str2);
    }

    protected void reportSoftInputArea(Rect rect) {
        queueGLThreadEvent((G) new l(rect));
    }

    protected void reportSoftInputIsVisible(boolean z2) {
        queueGLThreadEvent((G) new m(z2));
    }

    protected void reportSoftInputSelection(int i2, int i3) {
        queueGLThreadEvent((G) new j(i2, i3));
    }

    protected void reportSoftInputStr(String str, int i2, boolean z2) {
        if (i2 == 1) {
            hideSoftInput();
        }
        queueGLThreadEvent((G) new i(z2, str, i2));
    }

    protected void requestUserAuthorization(String str) {
        if (str == null || str.isEmpty() || this.mActivity == null) {
            return;
        }
        UnityPermissions.ModalWaitForPermissionResponse modalWaitForPermissionResponse = new UnityPermissions.ModalWaitForPermissionResponse();
        UnityPermissions.requestUserPermissions(this.mActivity, new String[]{str}, modalWaitForPermissionResponse);
        modalWaitForPermissionResponse.waitForResponse();
    }

    public void resume() {
        GoogleARCoreApi googleARCoreApi = this.m_ARCoreApi;
        if (googleARCoreApi != null) {
            googleARCoreApi.resumeARCore();
        }
        this.mState.e(false);
        U u2 = this.mVideoPlayerProxy;
        if (u2 != null) {
            u2.d();
        }
        checkResumePlayer();
        if (J.d()) {
            nativeRestartActivityIndicator();
        }
        if (this.m_AudioVolumeHandler == null) {
            this.m_AudioVolumeHandler = new AudioVolumeHandler(this.mContext);
        }
        if (this.m_OrientationLockListener == null && J.d()) {
            this.m_OrientationLockListener = new OrientationLockListener(this.mContext);
        }
        this.prevConfig = getResources().getConfiguration();
    }

    void runOnAnonymousThread(Runnable runnable) {
        new Thread(runnable).start();
    }

    void runOnUiThread(Runnable runnable) {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.mHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    void sendSurfaceChangedEvent() {
        if (J.d() && this.mState.a()) {
            u uVar = new u();
            Handler handler = this.m_MainThread.f4362a;
            if (handler != null) {
                Message.obtain(handler, uVar).sendToTarget();
            }
        }
    }

    protected void setCharacterLimit(int i2) {
        runOnUiThread(new RunnableC1514f(i2));
    }

    protected void setClipboardText(String str) {
        this.m_ClipboardManager.setPrimaryClip(ClipData.newPlainText("Text", str));
    }

    protected void setHideInputField(boolean z2) {
        runOnUiThread(new RunnableC1515g(z2));
    }

    public void setMainSurfaceViewAspectRatio(float f) {
        if (this.mGlView != null) {
            runOnUiThread(new r(f));
        }
    }

    public void setScreenBrightness(float f) {
        float fMax = Math.max(0.04f, f);
        if (this.m_Window == null || getScreenBrightness() == fMax) {
            return;
        }
        runOnUiThread(new s(fMax));
    }

    protected void setSelection(int i2, int i3) {
        runOnUiThread(new h(i2, i3));
    }

    protected void setSoftInputStr(String str) {
        runOnUiThread(new RunnableC1513e(str));
    }

    protected void showSoftInput(String str, int i2, boolean z2, boolean z3, boolean z4, boolean z5, String str2, int i3, boolean z6, boolean z7) {
        postOnUiThread(new RunnableC1510b(this, str, i2, z2, z3, z4, z5, str2, i3, z6, z7));
    }

    protected boolean showVideoPlayer(String str, int i2, int i3, int i4, boolean z2, int i5, int i6) {
        if (this.mVideoPlayerProxy == null) {
            this.mVideoPlayerProxy = new U(this);
        }
        boolean zA = this.mVideoPlayerProxy.a(this.mContext, str, i2, i3, i4, z2, i5, i6, new n());
        if (zA) {
            runOnUiThread(new o());
        }
        return zA;
    }

    protected boolean skipPermissionsDialog() {
        Activity activity = this.mActivity;
        if (activity != null) {
            return UnityPermissions.skipPermissionsDialog(activity);
        }
        return false;
    }

    public boolean startOrientationListener(int i2) {
        String str;
        if (this.mOrientationListener != null) {
            str = "Orientation Listener already started.";
        } else {
            q qVar = new q(this.mContext, i2);
            this.mOrientationListener = qVar;
            if (qVar.canDetectOrientation()) {
                this.mOrientationListener.enable();
                return true;
            }
            str = "Orientation Listener cannot detect orientation.";
        }
        AbstractC1536u.Log(5, str);
        return false;
    }

    public boolean stopOrientationListener() {
        OrientationEventListener orientationEventListener = this.mOrientationListener;
        if (orientationEventListener == null) {
            AbstractC1536u.Log(5, "Orientation Listener was not started.");
            return false;
        }
        orientationEventListener.disable();
        this.mOrientationListener = null;
        return true;
    }

    protected void toggleGyroscopeSensor(boolean z2) {
        SensorManager sensorManager = (SensorManager) this.mContext.getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (z2) {
            sensorManager.registerListener(this.m_FakeListener, defaultSensor, 1);
        } else {
            sensorManager.unregisterListener(this.m_FakeListener);
        }
    }

    public void unload() {
        nativeApplicationUnload();
    }

    void updateGLDisplay(int i2, Surface surface) {
        if (this.mMainDisplayOverride) {
            return;
        }
        updateDisplayInternal(i2, surface);
    }

    public void windowFocusChanged(boolean z2) {
        this.mState.b(z2);
        if (this.mState.a()) {
            com.unity3d.player.B b = this.mSoftInputDialog;
            if (b == null || b.d) {
                if (z2) {
                    F f = this.m_MainThread;
                    E e = E.g;
                    Handler handler = f.f4362a;
                    if (handler != null) {
                        Message.obtain(handler, RUN_STATE_CHANGED_MSG_CODE, e).sendToTarget();
                    }
                } else {
                    F f2 = this.m_MainThread;
                    E e2 = E.f;
                    Handler handler2 = f2.f4362a;
                    if (handler2 != null) {
                        Message.obtain(handler2, RUN_STATE_CHANGED_MSG_CODE, e2).sendToTarget();
                    }
                }
                checkResumePlayer();
            }
        }
    }
}
