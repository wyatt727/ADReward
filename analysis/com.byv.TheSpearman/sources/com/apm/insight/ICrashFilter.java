package com.apm.insight;

/* loaded from: classes.dex */
public interface ICrashFilter {
    boolean onJavaCrashFilter(Throwable th, Thread thread);

    boolean onNativeCrashFilter(String str, String str2);
}
