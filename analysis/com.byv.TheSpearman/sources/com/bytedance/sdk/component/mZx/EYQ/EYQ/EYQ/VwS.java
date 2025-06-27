package com.bytedance.sdk.component.mZx.EYQ.EYQ.EYQ;

import com.bytedance.sdk.component.mZx.EYQ.HX;
import com.bytedance.sdk.component.mZx.EYQ.hu;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: NetResponseBody.java */
/* loaded from: classes2.dex */
public class VwS extends hu {
    HttpURLConnection EYQ;
    InputStream mZx;

    VwS(HttpURLConnection httpURLConnection) throws IOException {
        this.EYQ = httpURLConnection;
        this.mZx = new Kbd(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.hu
    public long EYQ() {
        try {
            return this.EYQ.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.hu
    public String mZx() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.mZx));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    stringBuffer.append(line + "\n");
                } else {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.hu, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.mZx.close();
            this.EYQ.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.hu
    public InputStream Td() {
        return this.mZx;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.hu
    public byte[] Pm() throws IOException {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = this.mZx.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.hu
    public HX Kbd() {
        if (this.EYQ.getContentType() != null) {
            return HX.EYQ(this.EYQ.getContentType());
        }
        return null;
    }
}
