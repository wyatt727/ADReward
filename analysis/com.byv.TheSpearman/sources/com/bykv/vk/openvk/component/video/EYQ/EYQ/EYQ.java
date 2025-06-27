package com.bykv.vk.openvk.component.video.EYQ.EYQ;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ.mZx;
import com.bykv.vk.openvk.component.video.api.Td.Td;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SdkMediaDataSource.java */
/* loaded from: classes.dex */
public class EYQ extends MediaDataSource {
    public static final ConcurrentHashMap<String, EYQ> EYQ = new ConcurrentHashMap<>();
    private final Td Kbd;
    private final Context Pm;
    private long Td = -2147483648L;
    private final com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ.Td mZx;

    public EYQ(Context context, Td td) {
        this.Pm = context;
        this.Kbd = td;
        this.mZx = new mZx(context, td);
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        int iEYQ = this.mZx.EYQ(j, bArr, i, i2);
        int length = bArr.length;
        Objects.toString(Thread.currentThread());
        return iEYQ;
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.Td == -2147483648L) {
            if (this.Pm == null || TextUtils.isEmpty(this.Kbd.pi())) {
                return -1L;
            }
            this.Td = this.mZx.Td();
        }
        return this.Td;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.Kbd.pi();
        com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ.Td td = this.mZx;
        if (td != null) {
            td.mZx();
        }
        EYQ.remove(this.Kbd.nWX());
    }

    public Td EYQ() {
        return this.Kbd;
    }

    public static EYQ EYQ(Context context, Td td) {
        EYQ eyq = new EYQ(context, td);
        EYQ.put(td.nWX(), eyq);
        return eyq;
    }
}
