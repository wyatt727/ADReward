package com.bytedance.sdk.openadsdk.EYQ;

import com.bytedance.sdk.component.utils.IPb;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: LruDiskFile.java */
/* loaded from: classes2.dex */
public abstract class EYQ {
    private final ExecutorService EYQ = Executors.newSingleThreadExecutor();

    protected abstract void EYQ(List<File> list);

    protected abstract boolean EYQ(long j, int i);

    protected abstract boolean EYQ(File file, long j, int i);

    public void EYQ(File file) throws IOException {
        this.EYQ.submit(new CallableC0103EYQ(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(File file) throws IOException {
        try {
            IPb.mZx(file);
        } catch (Throwable unused) {
        }
        EYQ(IPb.EYQ(file.getParentFile()));
    }

    long mZx(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }

    /* compiled from: LruDiskFile.java */
    /* renamed from: com.bytedance.sdk.openadsdk.EYQ.EYQ$EYQ, reason: collision with other inner class name */
    private class CallableC0103EYQ implements Callable<Void> {
        private final File mZx;

        private CallableC0103EYQ(File file) {
            this.mZx = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            EYQ.this.mZx(this.mZx);
            return null;
        }
    }
}
