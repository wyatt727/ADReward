package com.json.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.json.environment.ContextProvider;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.t2;

/* loaded from: classes4.dex */
public class a extends IronSourceLogger {
    public static final String c = "console";
    public static final String d = "ironSourceSDK: ";

    private a() {
        super(c);
    }

    public a(int i) {
        super(c, i);
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("UIThread: ");
        sb.append(Looper.getMainLooper() == Looper.myLooper());
        sb.append(" ");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Activity: ");
        sb2.append(ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE);
        sb2.append(" ");
        String string2 = sb2.toString();
        if (i == 0) {
            Log.v(d + ironSourceTag, string + string2 + str);
            return;
        }
        if (i == 1) {
            Log.i(d + ironSourceTag, str);
            return;
        }
        if (i == 2) {
            Log.w(d + ironSourceTag, str);
            return;
        }
        if (i != 3) {
            return;
        }
        Log.e(d + ironSourceTag, str);
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        log(ironSourceTag, str + ":stacktrace[" + Log.getStackTraceString(th) + t2.i.e, 3);
    }
}
