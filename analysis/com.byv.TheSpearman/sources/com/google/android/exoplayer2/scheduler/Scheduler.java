package com.google.android.exoplayer2.scheduler;

@Deprecated
/* loaded from: classes2.dex */
public interface Scheduler {
    boolean cancel();

    Requirements getSupportedRequirements(Requirements requirements);

    boolean schedule(Requirements requirements, String str, String str2);
}
