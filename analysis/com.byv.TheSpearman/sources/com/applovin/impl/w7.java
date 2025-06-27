package com.applovin.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w7 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f1124a;
    private final DataOutputStream b;

    public w7() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f1124a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] a(u7 u7Var) throws IOException {
        this.f1124a.reset();
        try {
            a(this.b, u7Var.f1058a);
            String str = u7Var.b;
            if (str == null) {
                str = "";
            }
            a(this.b, str);
            this.b.writeLong(u7Var.c);
            this.b.writeLong(u7Var.d);
            this.b.write(u7Var.f);
            this.b.flush();
            return this.f1124a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
