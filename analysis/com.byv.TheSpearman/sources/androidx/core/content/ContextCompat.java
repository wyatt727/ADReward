package androidx.core.content;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BuildCompat;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.ObjectsCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.p2;
import com.json.t2;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class ContextCompat {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RegisterReceiverFlags {
    }

    protected ContextCompat() {
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getAttributionTag(context);
        }
        return null;
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            Api16Impl.startActivities(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            Api16Impl.startActivity(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getDataDir(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static File[] getObbDirs(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? Api19Impl.getObbDirs(context) : new File[]{context.getObbDir()};
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? Api19Impl.getExternalFilesDirs(context, str) : new File[]{context.getExternalFilesDir(str)};
    }

    public static File[] getExternalCacheDirs(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? Api19Impl.getExternalCacheDirs(context) : new File[]{context.getExternalCacheDir()};
    }

    public static Drawable getDrawable(Context context, int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.getDrawable(context, i);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (sLock) {
            if (sTempValue == null) {
                sTempValue = new TypedValue();
            }
            context.getResources().getValue(i, sTempValue, true);
            i2 = sTempValue.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        return ResourcesCompat.getColorStateList(context.getResources(), i, context.getTheme());
    }

    public static int getColor(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getColor(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static int checkSelfPermission(Context context, String str) {
        ObjectsCompat.requireNonNull(str, "permission must be non-null");
        if (BuildCompat.isAtLeastT() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    public static File getNoBackupFilesDir(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.getNoBackupFilesDir(context);
        }
        return createFilesDir(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static File getCodeCacheDir(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.getCodeCacheDir(context);
        }
        return createFilesDir(new File(context.getApplicationInfo().dataDir, "code_cache"));
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w(TAG, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.createDeviceProtectedStorageContext(context);
        }
        return null;
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.isDeviceProtectedStorage(context);
        }
        return false;
    }

    public static Executor getMainExecutor(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getMainExecutor(context);
        }
        return ExecutorCompat.create(new Handler(context.getMainLooper()));
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) Api23Impl.getSystemService(context, cls);
        }
        String systemServiceName = getSystemServiceName(context, cls);
        if (systemServiceName != null) {
            return (T) context.getSystemService(systemServiceName);
        }
        return null;
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 != 0 && (i3 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (BuildCompat.isAtLeastT()) {
            return Api33Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if ((i3 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getSystemServiceName(context, cls);
        }
        return LegacyServiceMapHolder.SERVICES.get(cls);
    }

    static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (PermissionChecker.checkSelfPermission(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    private static final class LegacyServiceMapHolder {
        static final HashMap<Class<?>, String> SERVICES;

        private LegacyServiceMapHolder() {
        }

        static {
            HashMap<Class<?>, String> map = new HashMap<>();
            SERVICES = map;
            if (Build.VERSION.SDK_INT >= 22) {
                map.put(SubscriptionManager.class, "telephony_subscription_service");
                map.put(UsageStatsManager.class, "usagestats");
            }
            if (Build.VERSION.SDK_INT >= 21) {
                map.put(AppWidgetManager.class, "appwidget");
                map.put(BatteryManager.class, "batterymanager");
                map.put(CameraManager.class, "camera");
                map.put(JobScheduler.class, "jobscheduler");
                map.put(LauncherApps.class, "launcherapps");
                map.put(MediaProjectionManager.class, "media_projection");
                map.put(MediaSessionManager.class, "media_session");
                map.put(RestrictionsManager.class, "restrictions");
                map.put(TelecomManager.class, "telecom");
                map.put(TvInputManager.class, "tv_input");
            }
            if (Build.VERSION.SDK_INT >= 19) {
                map.put(AppOpsManager.class, "appops");
                map.put(CaptioningManager.class, "captioning");
                map.put(ConsumerIrManager.class, "consumer_ir");
                map.put(PrintManager.class, "print");
            }
            if (Build.VERSION.SDK_INT >= 18) {
                map.put(BluetoothManager.class, p2.d);
            }
            if (Build.VERSION.SDK_INT >= 17) {
                map.put(DisplayManager.class, t2.h.d);
                map.put(UserManager.class, "user");
            }
            if (Build.VERSION.SDK_INT >= 16) {
                map.put(InputManager.class, "input");
                map.put(MediaRouter.class, "media_router");
                map.put(NsdManager.class, "servicediscovery");
            }
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, "activity");
            map.put(AlarmManager.class, NotificationCompat.CATEGORY_ALARM);
            map.put(AudioManager.class, "audio");
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, NativeAdPresenter.DOWNLOAD);
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, FirebaseAnalytics.Param.LOCATION);
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, "notification");
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, "search");
            map.put(SensorManager.class, "sensor");
            map.put(StorageManager.class, t2.a.j);
            map.put(TelephonyManager.class, "phone");
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, p2.b);
            map.put(WindowManager.class, "window");
        }
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static void startActivities(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void startActivity(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static File[] getExternalCacheDirs(Context context) {
            return context.getExternalCacheDirs();
        }

        static File[] getExternalFilesDirs(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        static File[] getObbDirs(Context context) {
            return context.getObbDirs();
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static Drawable getDrawable(Context context, int i) {
            return context.getDrawable(i);
        }

        static File getNoBackupFilesDir(Context context) {
            return context.getNoBackupFilesDir();
        }

        static File getCodeCacheDir(Context context) {
            return context.getCodeCacheDir();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static int getColor(Context context, int i) {
            return context.getColor(i);
        }

        static <T> T getSystemService(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static String getSystemServiceName(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static File getDataDir(Context context) {
            return context.getDataDir();
        }

        static Context createDeviceProtectedStorageContext(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static boolean isDeviceProtectedStorage(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, ContextCompat.obtainAndCheckReceiverPermission(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        static ComponentName startForegroundService(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static Executor getMainExecutor(Context context) {
            return context.getMainExecutor();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static String getAttributionTag(Context context) {
            return context.getAttributionTag();
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }
}
