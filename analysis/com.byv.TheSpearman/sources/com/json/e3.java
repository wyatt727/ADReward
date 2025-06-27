package com.json;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.json.environment.ContextProvider;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e3 {
    private static final String k = "1.0.5";
    public static String l = "";

    /* renamed from: a, reason: collision with root package name */
    private final b6 f1744a;
    private JSONObject b;
    private String c;
    private String d;
    private String e;
    private String f;
    private ContextProvider g;
    private Thread.UncaughtExceptionHandler h;
    private String i;
    private String j;

    class a implements com.json.b {
        a() {
        }

        @Override // com.json.b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" ");
                    sb.append("(");
                    sb.append(thread.getState().toString());
                    sb.append(")");
                    sb.append(" ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            e3.l = sb.toString();
        }

        @Override // com.json.b
        public void b() {
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1746a;
        final /* synthetic */ String b;

        b(Context context, String str) {
            this.f1746a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strP = e3.this.f1744a.p(this.f1746a);
                if (!TextUtils.isEmpty(strP)) {
                    e3.this.d = strP;
                }
                String strA = e3.this.f1744a.a(this.f1746a);
                if (!TextUtils.isEmpty(strA)) {
                    e3.this.f = strA;
                }
                SharedPreferences.Editor editorEdit = this.f1746a.getSharedPreferences("CRep", 0).edit();
                editorEdit.putString("String1", e3.this.d);
                editorEdit.putString(td.m, this.b);
                editorEdit.apply();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(e3.d().i).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                httpURLConnection.setRequestProperty("Accept", m4.K);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                Log.i("JSON", e3.this.b.toString());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes(e3.this.b.toString());
                dataOutputStream.flush();
                dataOutputStream.close();
                Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
                Log.i("MSG", httpURLConnection.getResponseMessage());
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        static volatile e3 f1748a = new e3(null);

        private d() {
        }
    }

    private e3() {
        this.f1744a = ca.h().c();
        this.b = new JSONObject();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.h = defaultUncaughtExceptionHandler;
        this.j = " ";
        this.i = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new d3(defaultUncaughtExceptionHandler));
    }

    /* synthetic */ e3(a aVar) {
        this();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return p2.b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return p2.g;
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return p2.b;
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return p2.g;
                    }
                }
            }
            return "none";
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    private void a(Context context, HashSet<String> hashSet) throws JSONException {
        String strA = a(a());
        if (strA.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.d);
        String string2 = sharedPreferences.getString(td.m, this.e);
        for (u4 u4Var : l3.b()) {
            String strB = u4Var.b();
            String strE = u4Var.e();
            String strD = u4Var.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("crashDate", strB);
                jSONObject.put("stacktraceCrash", strE);
                jSONObject.put("crashType", strD);
                jSONObject.put("CrashReporterVersion", k);
                jSONObject.put("SDKVersion", "7.9.0");
                jSONObject.put("deviceLanguage", this.f1744a.b(context));
                jSONObject.put("appVersion", p0.b(context, packageName));
                jSONObject.put("deviceOSVersion", this.f1744a.o());
                jSONObject.put("network", strA);
                jSONObject.put("deviceApiLevel", this.f1744a.k());
                jSONObject.put("deviceModel", this.f1744a.e());
                jSONObject.put(td.p0, this.f1744a.l());
                jSONObject.put(td.h1, string);
                jSONObject.put("deviceOEM", this.f1744a.g());
                jSONObject.put("systemProperties", System.getProperties());
                jSONObject.put("bundleId", packageName);
                jSONObject.put(td.m, string2);
                if (!TextUtils.isEmpty(this.f)) {
                    jSONObject.put("isLimitAdTrackingEnabled", Boolean.parseBoolean(this.f));
                }
                JSONObject jSONObject2 = new JSONObject();
                if (hashSet != null && !hashSet.isEmpty()) {
                    Iterator<String> it = hashSet.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            if (jSONObject.has(next)) {
                                jSONObject2.put(next, jSONObject.opt(next));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    jSONObject = jSONObject2;
                }
                this.b = jSONObject;
            } catch (Exception unused) {
            }
            if (this.b.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c()).start();
                l3.a();
            }
        }
    }

    static List<u4> c() {
        return null;
    }

    public static e3 d() {
        return d.f1748a;
    }

    Context a() {
        return this.g.getApplicationContext();
    }

    public void a(ContextProvider contextProvider, HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) throws JSONException {
        this.g = contextProvider;
        Context applicationContext = contextProvider.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.j = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.i = str;
            }
            this.e = str3;
            if (z) {
                new com.json.a(i).a(z2).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
    }

    public String b() {
        return k;
    }

    String e() {
        return this.j;
    }
}
