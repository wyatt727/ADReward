package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.l.i;
import com.apm.insight.l.k;
import com.apm.insight.l.o;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    public static class a extends c {
        a(File file) {
            super(file);
            this.b = "Total FD Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    public static class b extends c {
        b(File file) {
            super(file);
            this.b = "VmSize:";
            this.c = "\\s+";
            this.d = -1;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        protected File f115a;
        protected String b;
        protected String c;
        protected int d;

        public c(File file) {
            this.f115a = file;
        }

        public int a() {
            int i;
            Throwable th;
            if (!this.f115a.exists() || !this.f115a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f115a));
                int iA = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iA = a(line);
                    } catch (Throwable th2) {
                        th = th2;
                        i = iA;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                k.a(bufferedReader);
                            }
                        }
                    }
                } while (iA == -1);
                k.a(bufferedReader2);
                return iA;
            } catch (Throwable th3) {
                i = -1;
                th = th3;
            }
        }

        public int a(String str) throws NumberFormatException {
            int i = this.d;
            if (!str.startsWith(this.b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.c)[1].trim());
            } catch (NumberFormatException e) {
                com.apm.insight.c.a().a("NPTH_CATCH", e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.d$d, reason: collision with other inner class name */
    public static class C0013d extends c {
        C0013d(File file) {
            super(file);
        }

        public HashMap<String, List<String>> b() {
            JSONArray jSONArrayB;
            HashMap<String, List<String>> map = new HashMap<>();
            try {
                jSONArrayB = i.b(this.f115a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
            if (jSONArrayB == null) {
                return map;
            }
            for (int i = 0; i < jSONArrayB.length(); i++) {
                String strOptString = jSONArrayB.optString(i);
                if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith("[tid:0") && strOptString.endsWith("sigstack:0x0]")) {
                    int iIndexOf = strOptString.indexOf("[routine:0x");
                    int i2 = iIndexOf + 11;
                    String strSubstring = iIndexOf > 0 ? strOptString.substring(i2, strOptString.indexOf(93, i2)) : "unknown addr";
                    List<String> arrayList = map.get(strSubstring);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        map.put(strSubstring, arrayList);
                    }
                    arrayList.add(strOptString);
                }
            }
            return map;
        }
    }

    public static class e extends c {
        e(File file) {
            super(file);
        }

        public JSONArray a(HashMap<String, List<String>> map) {
            JSONArray jSONArrayB;
            int iIndexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (map.isEmpty()) {
                return jSONArray;
            }
            try {
                jSONArrayB = i.b(this.f115a.getAbsolutePath());
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
            if (jSONArrayB == null) {
                return jSONArray;
            }
            for (int i = 0; i < jSONArrayB.length(); i++) {
                String strOptString = jSONArrayB.optString(i);
                if (!TextUtils.isEmpty(strOptString) && (iIndexOf = strOptString.indexOf(":")) > 2) {
                    String strSubstring = strOptString.substring(2, iIndexOf);
                    if (map.containsKey(strSubstring) && (list = map.get(strSubstring)) != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next() + " " + strOptString);
                        }
                        map.remove(strSubstring);
                    }
                }
            }
            Iterator<List<String>> it2 = map.values().iterator();
            while (it2.hasNext()) {
                Iterator<String> it3 = it2.next().iterator();
                while (it3.hasNext()) {
                    jSONArray.put(it3.next() + "  0x000000:unknown");
                }
            }
            return jSONArray;
        }
    }

    public static class f extends c {
        f(File file) {
            super(file);
            this.b = "Total Threads Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    public static int a(String str) {
        return new a(o.b(str)).a();
    }

    public static JSONArray a(File file, File file2) {
        return new e(file2).a(new C0013d(file).b());
    }

    public static int b(String str) {
        return new f(o.c(str)).a();
    }

    public static int c(String str) {
        return new b(o.d(str)).a();
    }
}
