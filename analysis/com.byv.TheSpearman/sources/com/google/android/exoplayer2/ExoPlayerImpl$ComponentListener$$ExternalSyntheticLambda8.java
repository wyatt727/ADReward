package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda8 implements ListenerSet.Event {
    public static final /* synthetic */ ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda8 INSTANCE = new ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda8();

    private /* synthetic */ ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda8() {
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }
}
