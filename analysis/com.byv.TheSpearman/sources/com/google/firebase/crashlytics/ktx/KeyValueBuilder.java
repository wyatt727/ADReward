package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.json.t2;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyValueBuilder.kt */
@Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder` from the main module.")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\fH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rH\u0007J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/google/firebase/crashlytics/ktx/KeyValueBuilder;", "", "crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", t2.h.W, "", "", "value", "", "", "", "", "", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyValueBuilder {
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(FirebaseCrashlytics crashlytics) {
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.crashlytics = crashlytics;
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(String key, float value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, value);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void key(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.crashlytics.setCustomKey(key, value);
    }
}
