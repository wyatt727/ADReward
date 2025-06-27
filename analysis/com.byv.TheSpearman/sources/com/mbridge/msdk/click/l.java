package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: SocketSpider.java */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static volatile AtomicInteger f2536a = new AtomicInteger(1);
    private com.mbridge.msdk.c.g b;
    private String c;
    private int d = 9377;

    public l() {
        com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        this.b = gVarB;
        if (gVarB == null) {
            com.mbridge.msdk.c.h.a();
            this.b = com.mbridge.msdk.c.i.a();
        }
    }

    public final com.mbridge.msdk.click.entity.a a(String str, CampaignEx campaignEx, boolean z, boolean z2) {
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        aVar.g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.h = "request url can not null.";
            return aVar;
        }
        String strReplace = str.replace(" ", "%20");
        JSONObject jSONObjectB = b(strReplace, campaignEx, z, z2);
        if (jSONObjectB.length() == 0) {
            aVar.h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(jSONObjectB.optString("uri"))) {
            aVar.h = "request url parse error.";
            return aVar;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.d = trackingTcpPort;
        }
        if (TextUtils.isEmpty(this.c)) {
            aVar.h = "request url parse error.";
            return aVar;
        }
        return a(strReplace, jSONObjectB.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.mbridge.msdk.click.entity.a a(String str, String str2) throws IOException {
        OutputStream outputStream;
        Socket socket;
        int length;
        InputStream inputStream;
        int i;
        boolean z;
        Object[] objArr;
        byte[] bArr;
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        Socket socket2 = null;
        byte[] byteArray = null;
        try {
            try {
                socket = new Socket(this.c, this.d);
                try {
                    socket.setSoTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
                    outputStream = socket.getOutputStream();
                    try {
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
                        byteBufferWrap.put((byte) 2);
                        byteBufferWrap.put((byte) 3);
                        byteBufferWrap.putShort((short) f2536a.getAndIncrement());
                        if (TextUtils.isEmpty(str2)) {
                            byteBufferWrap.putInt(0);
                            outputStream.write(byteBufferWrap.array());
                            length = 0;
                        } else {
                            if (!TextUtils.isEmpty(str2)) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                gZIPOutputStream.write(str2.getBytes());
                                gZIPOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                            }
                            length = byteArray.length;
                            byteBufferWrap.putInt(length);
                            outputStream.write(byteBufferWrap.array());
                            outputStream.write(byteArray);
                        }
                        outputStream.flush();
                        ad.a("SocketSpider", "Socket Request : header : " + Arrays.toString(byteBufferWrap.array()) + " length : " + length);
                        inputStream = socket.getInputStream();
                        byte[] bArr2 = new byte[8];
                        inputStream.read(bArr2, 0, 8);
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
                        byteBufferWrap2.order(ByteOrder.BIG_ENDIAN);
                        i = byteBufferWrap2.getInt(4);
                        z = bArr2[1] == 3;
                        objArr = bArr2[1] == 2;
                        ad.b("SocketSpider", "Socket Response : header : " + Arrays.toString(bArr2) + " length : " + i + " isGzip : " + z);
                        bArr = new byte[i];
                        new DataInputStream(socket.getInputStream()).readFully(bArr);
                        if (!z && i > 2 && ((bArr[0] << 8) | (bArr[1] & 255)) == 8075) {
                            z = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        socket2 = socket;
                        try {
                            ad.a("SocketSpider", "Socket exception: " + th.getMessage());
                            aVar.h = th.getMessage();
                            if (socket2 != null) {
                                socket2.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                            }
                            return aVar;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                }
            } catch (Exception e) {
                ad.b("SocketSpider", e.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
        if (objArr == true && i == 0) {
            aVar.f = 200;
            aVar.g = str;
            aVar.e = 0;
            try {
                socket.close();
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (Exception e2) {
                ad.b("SocketSpider", e2.getMessage());
            }
            return aVar;
        }
        if (i < 1) {
            aVar.f = 200;
            aVar.g = str;
            aVar.e = 0;
            try {
                socket.close();
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (Exception e3) {
                ad.b("SocketSpider", e3.getMessage());
            }
            return aVar;
        }
        try {
            String strA = z ? a(bArr) : new String(bArr);
            if (!TextUtils.isEmpty(strA)) {
                aVar.f = 200;
                aVar.g = str;
                aVar.e = 0;
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(strA).optJSONObject("data");
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString(FirebaseAnalytics.Param.LOCATION);
                        if (!TextUtils.isEmpty(strOptString)) {
                            aVar.f = 302;
                            aVar.f2530a = strOptString;
                        }
                    }
                } catch (Throwable th4) {
                    ad.b("SocketSpider", th4.getMessage());
                }
                try {
                    socket.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Exception e4) {
                    ad.b("SocketSpider", e4.getMessage());
                }
                return aVar;
            }
        } catch (Throwable th5) {
            ad.b("SocketSpider", th5.getMessage());
            aVar.h = th5.getMessage();
        }
        inputStream.close();
        socket.close();
        if (outputStream != null) {
            outputStream.close();
        }
        return aVar;
    }

    private JSONObject b(String str, CampaignEx campaignEx, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                String encodedQuery = uri.getEncodedQuery();
                this.c = host;
                jSONObject.put("uri", "https://" + host + path);
                jSONObject.put("data", encodedQuery);
            }
        } catch (Throwable th) {
            ad.b("SocketSpider", th.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z && !z2) {
                jSONObject2.put("User-Agent", z.g());
            }
            if (campaignEx != null) {
                if (z && campaignEx.getcUA() == 1) {
                    jSONObject2.put("User-Agent", z.g());
                }
                if (z2 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put("User-Agent", z.g());
                }
            } else {
                jSONObject2.put("User-Agent", z.g());
            }
            jSONObject2.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
            if (this.b.aI() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put("header", jSONObject2);
        } catch (Throwable th2) {
            ad.b("SocketSpider", th2.getMessage());
        }
        return jSONObject;
    }

    private String a(byte[] bArr) throws IOException {
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
}
