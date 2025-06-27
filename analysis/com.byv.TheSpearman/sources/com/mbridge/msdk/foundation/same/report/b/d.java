package com.mbridge.msdk.foundation.same.report.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Log;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.same.report.i;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CrashHandlerUtil.java */
/* loaded from: classes4.dex */
public class d implements Thread.UncaughtExceptionHandler {
    private static volatile d b;

    /* renamed from: a, reason: collision with root package name */
    Handler f2921a = new Handler() { // from class: com.mbridge.msdk.foundation.same.report.b.d.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Context context;
            HashMap map;
            super.handleMessage(message);
            if (message.what == 101 && (context = (Context) d.this.c.get()) != null && (message.obj instanceof HashMap) && (map = (HashMap) message.obj) != null) {
                new i(context).a((String) map.get("crashinfo"), (File) map.get(t2.h.b));
            }
        }
    };
    private final WeakReference<Context> c;
    private Throwable d;
    private Thread.UncaughtExceptionHandler e;

    private d(Context context) {
        this.c = new WeakReference<>(context);
    }

    private static String b(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("", e.getMessage());
            return "";
        }
    }

    public static d a(Context context) {
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d(context);
                }
            }
        }
        return b;
    }

    private static List<String> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static String a() {
        try {
            g gVarB = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (gVarB == null) {
                h.a();
                gVarB = com.mbridge.msdk.c.i.a();
            }
            String strU = gVarB.U();
            return TextUtils.isEmpty(strU) ? "<mvpackage>mbridge</mvpackage>" : strU;
        } catch (Exception unused) {
            return "<mvpackage>mbridge</mvpackage>";
        }
    }

    public static List<String> a(String str) {
        try {
            List<String> listA = a(str, "<mvpackage>(.*?)</mvpackage>");
            return listA == null ? new ArrayList() : listA;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private String a(Throwable th, String str) {
        try {
            JSONObject jSONObjectB = b(str);
            if (jSONObjectB == null) {
                return "";
            }
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            jSONObjectB.put("crashinfo", stringWriter.toString());
            String string = jSONObjectB.toString();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000052");
            if (th != null) {
                stringBuffer.append(t2.i.c);
                stringBuffer.append("crash_first_index_from_mtg=");
                stringBuffer.append(c.b(th.getStackTrace()));
            } else {
                stringBuffer.append(t2.i.c);
                stringBuffer.append("crash_first_index_from_mtg=0");
            }
            stringBuffer.append("&exception=" + string);
            return stringBuffer.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    private HashMap<String, Object> c() {
        HashMap<String, Object> map = new HashMap<>();
        if (this.d == null) {
            return null;
        }
        String strA = e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_CRASH_INFO);
        File file = new File(strA + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        File file2 = new File(strA + "/sdkcrash" + str + ".txt");
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
            printWriter.println(a(this.d, str));
            printWriter.println("====");
            this.d.printStackTrace(printWriter);
            printWriter.close();
            map.put(t2.h.b, file2);
            map.put("time", str);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String c(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final JSONObject b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context context = this.c.get();
        if (context == null) {
            return null;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        long usableSpace = externalStorageDirectory.getUsableSpace();
        long totalSpace = externalStorageDirectory.getTotalSpace();
        String fileSize = Formatter.formatFileSize(context, usableSpace);
        String fileSize2 = Formatter.formatFileSize(context, totalSpace);
        jSONObject.put("max_memory", String.valueOf((float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d)));
        jSONObject.put("memoryby_app", String.valueOf((float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d)));
        jSONObject.put("remaining_memory", (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d));
        jSONObject.put("sdcard_remainder", fileSize);
        jSONObject.put("totalspacestr", fileSize2);
        jSONObject.put("crashtime", str);
        String strA = com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.SDK_APP_ID);
        if (!TextUtils.isEmpty(strA)) {
            jSONObject.put("appid", strA);
        }
        try {
            jSONObject.put("osversion", Build.VERSION.SDK_INT);
            jSONObject.put("appversioncode", d(context));
            jSONObject.put("appversionname", b(context));
            jSONObject.put("appname", c(context));
        } catch (Exception unused) {
            jSONObject.put("osversion", 0);
            jSONObject.put("appversioncode", "-1");
            jSONObject.put("appversionname", "-1");
            jSONObject.put("appname", "");
        }
        return jSONObject;
    }

    private String a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString() + "\n");
        }
        return sb.toString();
    }

    private int d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    private void a(String str, String str2, Throwable th, Thread thread) throws InterruptedException {
        if (str.contains(str2)) {
            HashMap<String, Object> mapC = c();
            if (mapC == null || mapC.get(t2.h.b) == null) {
                return;
            }
            Message messageObtain = Message.obtain();
            HashMap map = new HashMap();
            map.put("crashinfo", a(th, (String) mapC.get("time")));
            map.put(t2.h.b, mapC.get(t2.h.b));
            messageObtain.obj = map;
            messageObtain.what = 101;
            this.f2921a.sendMessage(messageObtain);
            a(thread, th);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public final void b() {
        this.e = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private void a(Thread thread, Throwable th) throws InterruptedException {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Process.killProcess(Process.myPid());
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws InterruptedException {
        com.mbridge.msdk.foundation.same.report.g.a().b();
        try {
            this.d = th;
            String strA = a();
            List<String> listA = a(strA);
            if (listA.size() > 0) {
                for (int i = 0; i < listA.size(); i++) {
                    a(a(th), listA.get(i), th, thread);
                }
                return;
            }
            a(a(th), strA, th, thread);
        } catch (Exception e) {
            a(thread, th);
            e.printStackTrace();
        }
    }
}
