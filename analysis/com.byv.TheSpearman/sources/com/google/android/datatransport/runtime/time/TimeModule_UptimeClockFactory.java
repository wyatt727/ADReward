package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {
    @Override // javax.inject.Provider
    public Clock get() {
        return uptimeClock();
    }

    public static TimeModule_UptimeClockFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Clock uptimeClock() {
        return (Clock) Preconditions.checkNotNull(TimeModule.uptimeClock(), "Cannot return null from a non-@Nullable @Provides method");
    }

    private static final class InstanceHolder {
        private static final TimeModule_UptimeClockFactory INSTANCE = new TimeModule_UptimeClockFactory();

        private InstanceHolder() {
        }
    }
}
