package com.google.android.exoplayer2.text;

import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public interface TextOutput {

    /* renamed from: com.google.android.exoplayer2.text.TextOutput$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @Deprecated
        public static void $default$onCues(TextOutput _this, List list) {
        }
    }

    void onCues(CueGroup cueGroup);

    @Deprecated
    void onCues(List<Cue> list);
}
