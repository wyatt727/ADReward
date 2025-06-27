package com.mbridge.msdk.playercommon.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class Requirements {
    private static final int DEVICE_CHARGING = 16;
    private static final int DEVICE_IDLE = 8;
    public static final int NETWORK_TYPE_ANY = 1;
    private static final int NETWORK_TYPE_MASK = 7;
    public static final int NETWORK_TYPE_METERED = 4;
    public static final int NETWORK_TYPE_NONE = 0;
    public static final int NETWORK_TYPE_NOT_ROAMING = 3;
    private static final String[] NETWORK_TYPE_STRINGS = null;
    public static final int NETWORK_TYPE_UNMETERED = 2;
    private static final String TAG = "Requirements";
    private final int requirements;

    public @interface NetworkType {
    }

    private static void logd(String str) {
    }

    public Requirements(int i, boolean z, boolean z2) {
        this(i | (z ? 16 : 0) | (z2 ? 8 : 0));
    }

    public Requirements(int i) {
        this.requirements = i;
    }

    public final int getRequiredNetworkType() {
        return this.requirements & 7;
    }

    public final boolean isChargingRequired() {
        return (this.requirements & 16) != 0;
    }

    public final boolean isIdleRequired() {
        return (this.requirements & 8) != 0;
    }

    public final boolean checkRequirements(Context context) {
        return checkNetworkRequirements(context) && checkChargingRequirement(context) && checkIdleRequirement(context);
    }

    public final int getRequirementsData() {
        return this.requirements;
    }

    private boolean checkNetworkRequirements(Context context) {
        int requiredNetworkType = getRequiredNetworkType();
        if (requiredNetworkType == 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            logd("No network info or no connection.");
            return false;
        }
        if (!checkInternetConnectivity(connectivityManager)) {
            return false;
        }
        if (requiredNetworkType == 1) {
            return true;
        }
        if (requiredNetworkType == 3) {
            boolean zIsRoaming = activeNetworkInfo.isRoaming();
            logd("Roaming: " + zIsRoaming);
            return !zIsRoaming;
        }
        boolean zIsActiveNetworkMetered = isActiveNetworkMetered(connectivityManager, activeNetworkInfo);
        logd("Metered network: " + zIsActiveNetworkMetered);
        if (requiredNetworkType == 2) {
            return !zIsActiveNetworkMetered;
        }
        if (requiredNetworkType == 4) {
            return zIsActiveNetworkMetered;
        }
        throw new IllegalStateException();
    }

    private boolean checkChargingRequirement(Context context) {
        if (!isChargingRequired()) {
            return true;
        }
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean checkIdleRequirement(Context context) {
        if (!isIdleRequired()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (Util.SDK_INT >= 23) {
            if (!powerManager.isDeviceIdleMode()) {
                return true;
            }
        } else if (Util.SDK_INT >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    private static boolean checkInternetConnectivity(ConnectivityManager connectivityManager) {
        if (Util.SDK_INT < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            logd("No active network.");
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        boolean z = networkCapabilities == null || !networkCapabilities.hasCapability(16);
        logd("Network capability validated: " + z);
        return !z;
    }

    private static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (Util.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }

    public final String toString() {
        return super.toString();
    }
}
