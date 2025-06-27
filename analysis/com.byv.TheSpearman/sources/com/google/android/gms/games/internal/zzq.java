package com.google.android.gms.games.internal;

import com.google.android.gms.games.internal.zzf;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final class zzq<T> extends zzf.zzz<T> {
    private final /* synthetic */ zzf.zzar zzds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzq(zzf.zzar zzarVar) {
        super(null);
        this.zzds = zzarVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(T t) {
        this.zzds.accept(t);
    }
}
