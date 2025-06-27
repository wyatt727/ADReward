package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: SocketManager.java */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile AtomicInteger f2901a = new AtomicInteger(1);
    private ExecutorService b;

    private m() {
        this.b = new ThreadPoolExecutor(5, 10, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.net.m.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("SocketThreadPool");
                return threadNewThread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    public static m a() {
        return b.f2905a;
    }

    public final String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2, 0, 1024);
            if (i > 0) {
                byteArrayOutputStream.write(bArr2, 0, i);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }

    public final void a(String str, int i, String str2, boolean z, e eVar) {
        final a aVar = new a(str, i, str2, z, eVar);
        this.b.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.m.2
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                aVar.a();
            }
        });
    }

    /* compiled from: SocketManager.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static m f2905a = new m();
    }

    /* compiled from: SocketManager.java */
    public class a {
        private ByteBuffer b;
        private String c;
        private boolean d;
        private e e;
        private OutputStream f;
        private int g;
        private Socket h;
        private String i;

        a(String str, int i, String str2, boolean z, e eVar) {
            this.d = false;
            this.c = str;
            this.g = i;
            this.i = str2;
            this.d = z;
            this.e = eVar;
        }

        /* JADX WARN: Finally extract failed */
        public final void a() throws IOException {
            byte[] bytes;
            int length;
            try {
                try {
                    Socket socket = new Socket(this.c, this.g);
                    this.h = socket;
                    socket.setSoTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
                    boolean z = this.c.contains(com.mbridge.msdk.foundation.same.net.g.d.f().i) || this.c.contains(com.mbridge.msdk.foundation.same.net.g.d.f().k);
                    ad.b("SocketManager", "Socket connect : " + this.c + " : " + this.g + " isAnalytics : " + z);
                    this.f = this.h.getOutputStream();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                    this.b = byteBufferWrap;
                    byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
                    this.b.put((byte) 2);
                    if (TextUtils.isEmpty(this.i)) {
                        this.b.put((byte) 1);
                    } else {
                        this.b.put(this.d ? (byte) 3 : (byte) 2);
                    }
                    this.b.putShort((short) m.f2901a.getAndIncrement());
                    if (TextUtils.isEmpty(this.i)) {
                        this.b.putInt(0);
                        this.f.write(this.b.array());
                        length = 0;
                    } else {
                        if (this.d) {
                            String str = this.i;
                            if (TextUtils.isEmpty(str)) {
                                bytes = null;
                            } else {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                gZIPOutputStream.write(str.getBytes());
                                gZIPOutputStream.close();
                                bytes = byteArrayOutputStream.toByteArray();
                            }
                        } else {
                            bytes = this.i.getBytes();
                        }
                        length = bytes.length;
                        this.b.putInt(length);
                        this.f.write(this.b.array());
                        this.f.write(bytes);
                    }
                    this.f.flush();
                    ad.a("SocketManager", "Socket Request : header : " + Arrays.toString(this.b.array()) + " length : " + length);
                    InputStream inputStream = this.h.getInputStream();
                    byte[] bArr = new byte[8];
                    inputStream.read(bArr, 0, 8);
                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                    this.b = byteBufferWrap2;
                    byteBufferWrap2.order(ByteOrder.BIG_ENDIAN);
                    int i = this.b.getInt(4);
                    boolean z2 = bArr[1] == 3;
                    boolean z3 = bArr[1] == 2;
                    ad.b("SocketManager", "Socket Response : header : " + Arrays.toString(bArr) + " length : " + i + " isGzip : " + z2);
                    byte[] bArr2 = new byte[i];
                    new DataInputStream(this.h.getInputStream()).readFully(bArr2);
                    if (!z2 && i > 2 && ((bArr2[0] << 8) | (bArr2[1] & 255)) == 8075) {
                        z2 = true;
                    }
                    e eVar = this.e;
                    if (eVar == null) {
                        Socket socket2 = this.h;
                        if (socket2 != null) {
                            try {
                                socket2.close();
                                this.b = null;
                                this.f.close();
                                return;
                            } catch (IOException e) {
                                ad.b("SocketManager", e.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    if (z3 && i == 0) {
                        eVar.onSuccess(k.a(null, new com.mbridge.msdk.foundation.same.net.f.c(204, null, null)));
                        Socket socket3 = this.h;
                        if (socket3 != null) {
                            try {
                                socket3.close();
                                this.b = null;
                                this.f.close();
                                return;
                            } catch (IOException e2) {
                                ad.b("SocketManager", e2.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    if (i < 1) {
                        a("The response data less than 1");
                        Socket socket4 = this.h;
                        if (socket4 != null) {
                            try {
                                socket4.close();
                                this.b = null;
                                this.f.close();
                                return;
                            } catch (IOException e3) {
                                ad.b("SocketManager", e3.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    if (z) {
                        if (bArr2[0] == 1) {
                            eVar.onSuccess(k.a(null, new com.mbridge.msdk.foundation.same.net.f.c(200, null, null)));
                        } else {
                            a("The server returns fail");
                        }
                        Socket socket5 = this.h;
                        if (socket5 != null) {
                            try {
                                socket5.close();
                                this.b = null;
                                this.f.close();
                                return;
                            } catch (IOException e4) {
                                ad.b("SocketManager", e4.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        String strA = z2 ? m.this.a(bArr2) : new String(bArr2);
                        JSONObject jSONObject = !TextUtils.isEmpty(strA) ? new JSONObject(strA) : null;
                        ad.b("SocketManager", "Socket Response length : " + i + " " + strA.length());
                        this.e.onSuccess(k.a(jSONObject, new com.mbridge.msdk.foundation.same.net.f.c(200, null, null)));
                    } catch (Throwable th) {
                        String message = th.getMessage();
                        ad.b("SocketManager", th.getMessage());
                        if (TextUtils.isEmpty(message)) {
                            message = "The JSON data is illegal";
                        }
                        a(message);
                    }
                    inputStream.close();
                    Socket socket6 = this.h;
                    if (socket6 != null) {
                        socket6.close();
                        this.b = null;
                        this.f.close();
                    }
                } catch (IOException e5) {
                    ad.b("SocketManager", e5.getMessage());
                }
            } catch (Throwable th2) {
                try {
                    String message2 = th2.getMessage();
                    ad.a("SocketManager", "Socket exception: " + message2);
                    a(message2);
                    Socket socket7 = this.h;
                    if (socket7 != null) {
                        socket7.close();
                        this.b = null;
                        this.f.close();
                    }
                } catch (Throwable th3) {
                    Socket socket8 = this.h;
                    if (socket8 != null) {
                        try {
                            socket8.close();
                            this.b = null;
                            this.f.close();
                        } catch (IOException e6) {
                            ad.b("SocketManager", e6.getMessage());
                        }
                    }
                    throw th3;
                }
            }
        }

        private void a(String str) {
            if (this.e != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.e.onError(new com.mbridge.msdk.foundation.same.net.b.a(13, new com.mbridge.msdk.foundation.same.net.f.c(404, str.getBytes(), null)));
            }
        }
    }
}
