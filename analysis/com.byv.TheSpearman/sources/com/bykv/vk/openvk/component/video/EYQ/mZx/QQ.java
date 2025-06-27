package com.bykv.vk.openvk.component.video.EYQ.mZx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: RandomAccessFileWrapper.java */
/* loaded from: classes.dex */
class QQ {
    private final RandomAccessFile EYQ;

    QQ(File file, String str) throws EYQ {
        try {
            this.EYQ = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e) {
            throw new EYQ(e);
        }
    }

    void EYQ(long j) throws IOException, EYQ {
        try {
            this.EYQ.seek(j);
        } catch (IOException e) {
            throw new EYQ(e);
        }
    }

    void EYQ(byte[] bArr, int i, int i2) throws IOException, EYQ {
        try {
            this.EYQ.write(bArr, i, i2);
        } catch (IOException e) {
            throw new EYQ(e);
        }
    }

    int EYQ(byte[] bArr) throws EYQ {
        try {
            return this.EYQ.read(bArr);
        } catch (IOException e) {
            throw new EYQ(e);
        }
    }

    void EYQ() {
        com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(this.EYQ);
    }

    /* compiled from: RandomAccessFileWrapper.java */
    static class EYQ extends Exception {
        EYQ(Throwable th) {
            super(th);
        }
    }
}
