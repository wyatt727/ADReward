package com.applovin.impl;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class op extends z1 {
    private final int e;
    private final byte[] f;
    private final DatagramPacket g;
    private Uri h;
    private DatagramSocket i;
    private MulticastSocket j;
    private InetAddress k;
    private InetSocketAddress l;
    private boolean m;
    private int n;

    public static final class a extends h5 {
        public a(Throwable th, int i) {
            super(th, i);
        }
    }

    public op() {
        this(2000);
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) throws IOException {
        Uri uri = j5Var.f560a;
        this.h = uri;
        String host = uri.getHost();
        int port = this.h.getPort();
        b(j5Var);
        try {
            this.k = InetAddress.getByName(host);
            this.l = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.l);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.i = this.j;
            } else {
                this.i = new DatagramSocket(this.l);
            }
            this.i.setSoTimeout(this.e);
            this.m = true;
            c(j5Var);
            return -1L;
        } catch (IOException e) {
            throw new a(e, 2001);
        } catch (SecurityException e2) {
            throw new a(e2, 2006);
        }
    }

    public op(int i) {
        this(i, 8000);
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.h;
    }

    @Override // com.applovin.impl.g5
    public void close() throws IOException {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.k);
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.l = null;
        this.n = 0;
        if (this.m) {
            this.m = false;
            g();
        }
    }

    public op(int i, int i2) {
        super(true);
        this.e = i2;
        byte[] bArr = new byte[i];
        this.f = bArr;
        this.g = new DatagramPacket(bArr, 0, i);
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            try {
                this.i.receive(this.g);
                int length = this.g.getLength();
                this.n = length;
                d(length);
            } catch (SocketTimeoutException e) {
                throw new a(e, 2002);
            } catch (IOException e2) {
                throw new a(e2, 2001);
            }
        }
        int length2 = this.g.getLength();
        int i3 = this.n;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f, length2 - i3, bArr, i, iMin);
        this.n -= iMin;
        return iMin;
    }
}
