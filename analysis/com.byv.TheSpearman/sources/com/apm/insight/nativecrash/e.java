package com.apm.insight.nativecrash;

import com.apm.insight.l.o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class e {
    private static final Pattern i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");
    private static final Pattern j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");
    private static final Pattern k = Pattern.compile("^Abort message: (.*)$");
    private static final Pattern l = Pattern.compile("^Crash message: (.*)$");
    private static final Pattern m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a, reason: collision with root package name */
    private String f116a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Map<String, String> h = new HashMap();

    public e(File file) {
        c(o.b(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
    
        r12 = r3.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0190, code lost:
    
        if (r12 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0198, code lost:
    
        if (r12.contains("BuildId:") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
    
        r12 = com.apm.insight.nativecrash.e.m.matcher(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a5, code lost:
    
        if (r12.find() != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a8, code lost:
    
        r0 = r12.group(1);
        r1 = r12.group(2);
        r12 = r12.group(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ba, code lost:
    
        if (r0.equals("data") == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01bc, code lost:
    
        r11.h.put(r1, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.io.File r12) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.e.c(java.io.File):void");
    }

    public String a() {
        return this.g;
    }

    public void a(File file) {
        File fileB = o.b(file);
        if (fileB.exists()) {
            fileB.renameTo(new File(fileB.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file);
        c(o.b(file));
    }

    public Map<String, String> b() {
        return this.h;
    }

    public void b(File file) {
        c(o.b(file));
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        String str = this.e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }
}
