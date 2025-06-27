package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import com.json.t2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FirebaseCrashlytics.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\n\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"crashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lcom/google/firebase/Firebase;", "getCrashlytics", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "setCustomKeys", "", t2.a.e, "Lkotlin/Function1;", "Lcom/google/firebase/crashlytics/KeyValueBuilder;", "Lkotlin/ExtensionFunctionType;", "com.google.firebase-firebase-crashlytics"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FirebaseCrashlyticsKt {
    public static final FirebaseCrashlytics getCrashlytics(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance()");
        return firebaseCrashlytics;
    }

    public static final void setCustomKeys(FirebaseCrashlytics firebaseCrashlytics, Function1<? super KeyValueBuilder, Unit> init) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        init.invoke(new KeyValueBuilder(firebaseCrashlytics));
    }
}
