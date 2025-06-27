package com.apm.insight.entity;

import com.apm.insight.i;

/* loaded from: classes.dex */
public class c extends a {
    private String c;

    public c(String str) {
        this.c = str;
    }

    public static c a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        c cVar = new c(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        cVar.a("event_type", (Object) "exception");
        cVar.a("log_type", (Object) str5);
        cVar.a("timestamp", Long.valueOf(System.currentTimeMillis()));
        cVar.a("crash_time", Long.valueOf(System.currentTimeMillis()));
        cVar.a("class_ref", (Object) className);
        cVar.a("method", (Object) methodName);
        cVar.a("line_num", Integer.valueOf(lineNumber));
        cVar.a("stack", (Object) str);
        cVar.a("exception_type", (Object) 1);
        cVar.a("ensure_type", (Object) str4);
        cVar.a("is_core", Integer.valueOf(z ? 1 : 0));
        cVar.a("message", (Object) str2);
        cVar.a("process_name", (Object) com.apm.insight.l.a.c(i.g()));
        cVar.a("crash_thread_name", (Object) str3);
        d.b(cVar.h());
        return cVar;
    }
}
