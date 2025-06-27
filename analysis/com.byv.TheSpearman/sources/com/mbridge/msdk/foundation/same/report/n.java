package com.mbridge.msdk.foundation.same.report;

import android.util.Log;
import com.mbridge.msdk.e.a.p;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;

/* compiled from: SocketStack.java */
/* loaded from: classes4.dex */
public final class n extends com.mbridge.msdk.e.a.a.a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f2958a = new AtomicInteger(1);
    private final byte b;

    public n(byte b) {
        this.b = b;
    }

    @Override // com.mbridge.msdk.e.a.a.a
    public final com.mbridge.msdk.e.a.a.f a(p<?> pVar, Map<String, String> map) throws IOException {
        ByteBuffer byteBuffer;
        OutputStream outputStream;
        ByteBuffer byteBufferWrap;
        Socket socket;
        boolean z;
        byte[] bArr;
        ByteBuffer byteBufferWrap2;
        com.mbridge.msdk.e.a.a.f fVar;
        com.mbridge.msdk.e.a.a.f fVar2;
        byte[] byteArray;
        if (com.mbridge.msdk.e.a.f2688a) {
            Log.d("TrackManager_Volley", "SocketStack executeRequest " + pVar.i() + ":" + pVar.f());
        }
        Socket socket2 = null;
        try {
            Socket socket3 = new Socket(pVar.i(), pVar.f());
            try {
                socket3.setSoTimeout(pVar.s());
                outputStream = socket3.getOutputStream();
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                byteBufferWrap = null;
            }
            try {
                if (outputStream == null) {
                    throw new IOException("create outputStream exception");
                }
                byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                try {
                    byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
                    byteBufferWrap.put(this.b);
                    byte[] bArrO = pVar.o();
                    z = true;
                    if (bArrO == null || bArrO.length == 0) {
                        byteBufferWrap.put((byte) 1);
                    } else {
                        byteBufferWrap.put((byte) 3);
                    }
                    byteBufferWrap.putShort((short) f2958a.getAndIncrement());
                    if (bArrO == null || bArrO.length == 0) {
                        byteBufferWrap.putInt(0);
                        outputStream.write(byteBufferWrap.array());
                    } else {
                        if (bArrO == null || bArrO.length == 0) {
                            byteArray = null;
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArrO);
                            gZIPOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                        }
                        byteBufferWrap.putInt(byteArray == null ? 0 : byteArray.length);
                        outputStream.write(byteBufferWrap.array());
                        outputStream.write(byteArray);
                    }
                    outputStream.flush();
                    bArr = new byte[8];
                    socket3.getInputStream().read(bArr, 0, 8);
                    byteBufferWrap2 = ByteBuffer.wrap(bArr);
                } catch (Throwable th2) {
                    th = th2;
                    socket = socket3;
                    byteBuffer = null;
                }
                try {
                    byteBufferWrap2.order(ByteOrder.BIG_ENDIAN);
                    int i = byteBufferWrap2.getInt(4);
                    boolean z2 = bArr[1] == 2;
                    byte[] bArr2 = new byte[i];
                    new DataInputStream(socket3.getInputStream()).readFully(bArr2);
                    if (z2 && i == 0) {
                        fVar2 = new com.mbridge.msdk.e.a.a.f(204, new ArrayList(), i, null);
                    } else {
                        if (i < 1) {
                            fVar = new com.mbridge.msdk.e.a.a.f(500, new ArrayList(), 0, null);
                        } else {
                            if (bArr2[0] != 1) {
                                z = false;
                            }
                            if (z) {
                                fVar2 = new com.mbridge.msdk.e.a.a.f(200, new ArrayList(), i, null);
                            } else {
                                fVar = new com.mbridge.msdk.e.a.a.f(500, new ArrayList(), 0, null);
                            }
                        }
                        a(outputStream);
                        a(socket3);
                        a(byteBufferWrap);
                        a(byteBufferWrap2);
                        return fVar;
                    }
                    a(outputStream);
                    a(socket3);
                    a(byteBufferWrap);
                    a(byteBufferWrap2);
                    return fVar2;
                } catch (Throwable th3) {
                    socket = socket3;
                    byteBuffer = byteBufferWrap2;
                    th = th3;
                    socket2 = socket;
                    try {
                        throw new IOException(th);
                    } catch (Throwable th4) {
                        a(outputStream);
                        a(socket2);
                        a(byteBufferWrap);
                        a(byteBuffer);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                byteBufferWrap = null;
                socket2 = socket3;
                byteBuffer = byteBufferWrap;
                throw new IOException(th);
            }
        } catch (Throwable th6) {
            th = th6;
            byteBuffer = null;
            outputStream = null;
            byteBufferWrap = null;
        }
    }

    private static void a(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    private static void a(Socket socket) throws IOException {
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception unused) {
            }
        }
    }

    private void a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            try {
                byteBuffer.clear();
            } catch (Exception unused) {
            }
        }
    }
}
