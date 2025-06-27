package com.apm.insight.l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class e extends PrintWriter {

    /* renamed from: a, reason: collision with root package name */
    private MessageDigest f96a;
    private Charset b;
    private a c;

    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f96a = null;
        this.b = null;
        this.c = null;
        this.f96a = messageDigest;
        this.c = aVar;
        if (messageDigest != null) {
            this.b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f96a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f96a != null) {
            a aVar = this.c;
            if (aVar == null || aVar.a(str)) {
                this.f96a.update(this.b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f96a;
        if (messageDigest != null) {
            messageDigest.update(this.b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
