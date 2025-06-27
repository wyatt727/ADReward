package com.my.target;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.hls.DefaultHlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public class a6 {
    public static MediaSource a(Uri uri, Context context) {
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(context, Util.getUserAgent(context, "myTarget"));
        return Util.inferContentType(uri) == 2 ? new HlsMediaSource.Factory(new DefaultHlsDataSourceFactory(defaultDataSourceFactory)).createMediaSource(MediaItem.fromUri(uri)) : new ProgressiveMediaSource.Factory(defaultDataSourceFactory).createMediaSource(MediaItem.fromUri(uri));
    }
}
