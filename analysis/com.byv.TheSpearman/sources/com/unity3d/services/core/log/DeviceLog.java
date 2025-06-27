package com.unity3d.services.core.log;

import android.util.Log;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class DeviceLog {
    private static boolean FORCE_DEBUG_LOG = false;
    public static final int LOGLEVEL_DEBUG = 8;
    private static final int LOGLEVEL_ERROR = 1;
    public static final int LOGLEVEL_INFO = 4;
    private static final int LOGLEVEL_WARNING = 2;
    private static boolean LOG_DEBUG = true;
    private static boolean LOG_ERROR = true;
    private static boolean LOG_INFO = true;
    private static boolean LOG_WARNING = true;
    private static final int MAX_DEBUG_MSG_LENGTH = 3072;
    private static final HashMap<UnityAdsLogLevel, DeviceLogLevel> _deviceLogLevel;

    public enum UnityAdsLogLevel {
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    static {
        HashMap<UnityAdsLogLevel, DeviceLogLevel> map = new HashMap<>();
        _deviceLogLevel = map;
        if (map.size() == 0) {
            map.put(UnityAdsLogLevel.INFO, new DeviceLogLevel(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT));
            map.put(UnityAdsLogLevel.DEBUG, new DeviceLogLevel("d"));
            map.put(UnityAdsLogLevel.WARNING, new DeviceLogLevel("w"));
            map.put(UnityAdsLogLevel.ERROR, new DeviceLogLevel("e"));
        }
        if (new File("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
            FORCE_DEBUG_LOG = true;
        }
    }

    public static void setLogLevel(int i) {
        if (i >= 8) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = true;
            return;
        }
        if (i >= 4) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = false;
            return;
        }
        if (i >= 2) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = false;
            LOG_DEBUG = false;
            return;
        }
        if (i >= 1) {
            LOG_ERROR = true;
            LOG_WARNING = false;
            LOG_INFO = false;
            LOG_DEBUG = false;
            return;
        }
        LOG_ERROR = false;
        LOG_WARNING = false;
        LOG_INFO = false;
        LOG_DEBUG = false;
    }

    public static void entered() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        debug("ENTERED METHOD");
    }

    public static void info(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        write(UnityAdsLogLevel.INFO, checkMessage(str));
    }

    public static void info(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        info(String.format(str, objArr));
    }

    public static void debug(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (isDebugEnabled()) {
            if (str.length() > MAX_DEBUG_MSG_LENGTH) {
                debug(str.substring(0, MAX_DEBUG_MSG_LENGTH));
                if (str.length() < 30720) {
                    debug(str.substring(MAX_DEBUG_MSG_LENGTH));
                    return;
                }
                return;
            }
            write(UnityAdsLogLevel.DEBUG, checkMessage(str));
        }
    }

    public static void debug(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (isDebugEnabled()) {
            debug(String.format(str, objArr));
        }
    }

    private static boolean isDebugEnabled() {
        return LOG_DEBUG || FORCE_DEBUG_LOG;
    }

    public static void warning(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        write(UnityAdsLogLevel.WARNING, checkMessage(str));
    }

    public static void warning(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        warning(String.format(str, objArr));
    }

    public static void error(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        write(UnityAdsLogLevel.ERROR, checkMessage(str));
    }

    public static void exception(String str, Exception exc) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str2 = "";
        if (str != null) {
            str2 = "" + str;
        }
        if (exc != null) {
            str2 = str2 + ": " + exc.getMessage();
        }
        if (exc != null && exc.getCause() != null) {
            str2 = str2 + ": " + exc.getCause().getMessage();
        }
        write(UnityAdsLogLevel.ERROR, str2);
    }

    public static void error(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        error(String.format(str, objArr));
    }

    /* renamed from: com.unity3d.services.core.log.DeviceLog$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel;

        static {
            int[] iArr = new int[UnityAdsLogLevel.values().length];
            $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel = iArr;
            try {
                iArr[UnityAdsLogLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[UnityAdsLogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[UnityAdsLogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[UnityAdsLogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void write(UnityAdsLogLevel unityAdsLogLevel, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        int i = AnonymousClass1.$SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[unityAdsLogLevel.ordinal()];
        if (i == 1) {
            z = LOG_INFO;
        } else if (i == 2) {
            z = LOG_DEBUG;
        } else if (i == 3) {
            z = LOG_WARNING;
        } else {
            z = i != 4 ? true : LOG_ERROR;
        }
        if (FORCE_DEBUG_LOG ? true : z) {
            writeToLog(createLogEntry(unityAdsLogLevel, str));
        }
    }

    private static String checkMessage(String str) {
        return (str == null || str.length() == 0) ? "DO NOT USE EMPTY MESSAGES, use DeviceLog.entered() instead" : str;
    }

    private static DeviceLogLevel getLogLevel(UnityAdsLogLevel unityAdsLogLevel) {
        return _deviceLogLevel.get(unityAdsLogLevel);
    }

    private static DeviceLogEntry createLogEntry(UnityAdsLogLevel unityAdsLogLevel, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        DeviceLogLevel logLevel = getLogLevel(unityAdsLogLevel);
        if (logLevel == null) {
            return null;
        }
        int i = 0;
        boolean z = false;
        while (i < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if (stackTraceElement.getClassName().equals(DeviceLog.class.getName())) {
                z = true;
            }
            if (!stackTraceElement.getClassName().equals(DeviceLog.class.getName()) && z) {
                break;
            }
            i++;
        }
        StackTraceElement stackTraceElement2 = i < stackTrace.length ? stackTrace[i] : null;
        if (stackTraceElement2 != null) {
            return new DeviceLogEntry(logLevel, str, stackTraceElement2);
        }
        return null;
    }

    private static void writeToLog(DeviceLogEntry deviceLogEntry) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        if (deviceLogEntry == null || deviceLogEntry.getLogLevel() == null) {
            return;
        }
        try {
            method = Log.class.getMethod(deviceLogEntry.getLogLevel().getReceivingMethodName(), String.class, String.class);
        } catch (Exception e) {
            Log.e("UnityAds", "Writing to log failed!", e);
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(null, deviceLogEntry.getLogLevel().getLogTag(), deviceLogEntry.getParsedMessage());
            } catch (Exception e2) {
                Log.e("UnityAds", "Writing to log failed!", e2);
            }
        }
    }
}
