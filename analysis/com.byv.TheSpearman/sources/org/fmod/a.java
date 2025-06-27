package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final FMODAudioDevice f4418a;
    private final ByteBuffer b;
    private final int c;
    private final int d;
    private volatile Thread e;
    private volatile boolean f;
    private AudioRecord g;
    private boolean h;

    a(FMODAudioDevice fMODAudioDevice, int i, int i2, int i3) {
        this.f4418a = fMODAudioDevice;
        this.c = i;
        this.d = i2;
        this.b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i, i2, i3));
    }

    private void b() throws IllegalStateException {
        AudioRecord audioRecord = this.g;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                this.g.stop();
            }
            this.g.release();
            this.g = null;
        }
        this.b.position(0);
        this.h = false;
    }

    public int a() {
        return this.b.capacity();
    }

    public void c() throws InterruptedException {
        if (this.e != null) {
            d();
        }
        this.f = true;
        this.e = new Thread(this);
        this.e.start();
    }

    public void d() throws InterruptedException {
        while (this.e != null) {
            this.f = false;
            try {
                this.e.join();
                this.e = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() throws IllegalStateException {
        int i = 3;
        while (this.f) {
            if (!this.h && i > 0) {
                b();
                AudioRecord audioRecord = new AudioRecord(1, this.c, this.d, 2, this.b.capacity());
                this.g = audioRecord;
                boolean z = audioRecord.getState() == 1;
                this.h = z;
                if (z) {
                    this.b.position(0);
                    this.g.startRecording();
                    i = 3;
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.g.getState() + ")");
                    i += -1;
                    b();
                }
            }
            if (this.h && this.g.getRecordingState() == 3) {
                AudioRecord audioRecord2 = this.g;
                ByteBuffer byteBuffer = this.b;
                this.f4418a.fmodProcessMicData(this.b, audioRecord2.read(byteBuffer, byteBuffer.capacity()));
                this.b.position(0);
            }
        }
        b();
    }
}
