package com.bytedance.sdk.component.mZx.EYQ.EYQ.EYQ;

import android.text.TextUtils;
import com.bytedance.sdk.component.mZx.EYQ.KO;
import com.bytedance.sdk.component.mZx.EYQ.QQ;
import com.bytedance.sdk.component.mZx.EYQ.nWX;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NetCall.java */
/* loaded from: classes2.dex */
public class EYQ implements com.bytedance.sdk.component.mZx.EYQ.mZx {
    pi EYQ;
    private AtomicBoolean Td = new AtomicBoolean(false);
    com.bytedance.sdk.component.mZx.EYQ.Pm mZx;

    EYQ(pi piVar, com.bytedance.sdk.component.mZx.EYQ.Pm pm) {
        this.EYQ = piVar;
        this.mZx = pm;
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx
    public KO EYQ() throws IOException {
        this.mZx.Td().remove(this);
        this.mZx.Pm().add(this);
        if (this.mZx.Td().size() + this.mZx.Pm().size() > this.mZx.EYQ() || this.Td.get()) {
            this.mZx.Pm().remove(this);
            return null;
        }
        try {
            if (this.EYQ.EYQ != null && this.EYQ.EYQ.EYQ != null && this.EYQ.EYQ.EYQ.size() > 0) {
                ArrayList arrayList = new ArrayList(this.EYQ.EYQ.EYQ);
                arrayList.add(new QQ() { // from class: com.bytedance.sdk.component.mZx.EYQ.EYQ.EYQ.EYQ.1
                    @Override // com.bytedance.sdk.component.mZx.EYQ.QQ
                    public KO EYQ(QQ.EYQ eyq) throws IOException {
                        return EYQ.this.EYQ(eyq.EYQ());
                    }
                });
                return ((QQ) arrayList.get(0)).EYQ(new mZx(arrayList, this.EYQ));
            }
            return EYQ(this.EYQ);
        } catch (Throwable th) {
            throw new IOException(th.getMessage());
        }
    }

    private boolean EYQ(nWX nwx) {
        pi piVar;
        return nwx != null && (piVar = this.EYQ) != null && "POST".equalsIgnoreCase(piVar.Td()) && nwx.IPb == nWX.EYQ.BYTE_ARRAY_TYPE && nwx.Kbd != null && nwx.Kbd.length > 0;
    }

    private boolean mZx(nWX nwx) {
        pi piVar;
        return (nwx == null || (piVar = this.EYQ) == null || !"POST".equalsIgnoreCase(piVar.Td()) || nwx.IPb != nWX.EYQ.STRING_TYPE || TextUtils.isEmpty(nwx.Pm)) ? false : true;
    }

    public KO EYQ(pi piVar) throws IOException {
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(piVar.mZx().EYQ().toString()).openConnection();
                if (piVar.Pm() != null && piVar.Pm().size() > 0) {
                    for (Map.Entry<String, List<String>> entry : piVar.Pm().entrySet()) {
                        String key = entry.getKey();
                        for (String str : entry.getValue()) {
                            if ("_disable_retry".equals(key) && "1".equals(str)) {
                                EYQ(httpURLConnection);
                            } else {
                                httpURLConnection.addRequestProperty(key, str);
                            }
                        }
                    }
                }
                if (piVar.EYQ != null) {
                    if (piVar.EYQ.Td != null) {
                        httpURLConnection.setConnectTimeout((int) piVar.EYQ.Td.toMillis(piVar.EYQ.mZx));
                    }
                    if (piVar.EYQ.Td != null) {
                        httpURLConnection.setReadTimeout((int) piVar.EYQ.Kbd.toMillis(piVar.EYQ.Pm));
                    }
                }
                if (piVar.IPb() == null) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    if (!Td() && piVar.IPb().Td != null) {
                        httpURLConnection.addRequestProperty("Content-Type", piVar.IPb().Td.EYQ());
                    }
                    httpURLConnection.setRequestMethod(piVar.Td());
                    if ("POST".equalsIgnoreCase(piVar.Td())) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        if (EYQ(piVar.IPb())) {
                            outputStream.write(piVar.IPb().Kbd);
                        } else if (mZx(piVar.IPb())) {
                            outputStream.write(piVar.IPb().Pm.getBytes());
                        }
                        outputStream.flush();
                        outputStream.close();
                    }
                }
                httpURLConnection.connect();
                httpURLConnection.getResponseCode();
                if (this.Td.get()) {
                    httpURLConnection.disconnect();
                    this.mZx.Pm().remove(this);
                    return null;
                }
                return new IPb(httpURLConnection, piVar);
            } catch (Exception e) {
                throw new IOException(e.getMessage());
            }
        } finally {
            this.mZx.Pm().remove(this);
        }
    }

    private static void EYQ(HttpURLConnection httpURLConnection) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    private boolean Td() {
        if (this.EYQ.Pm() == null) {
            return false;
        }
        return this.EYQ.Pm().containsKey("Content-Type");
    }

    @Override // com.bytedance.sdk.component.mZx.EYQ.mZx
    public void EYQ(final com.bytedance.sdk.component.mZx.EYQ.Td td) {
        this.mZx.mZx().submit(new Runnable() { // from class: com.bytedance.sdk.component.mZx.EYQ.EYQ.EYQ.EYQ.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    KO koEYQ = EYQ.this.EYQ();
                    if (koEYQ == null) {
                        td.EYQ(EYQ.this, new IOException("response is null"));
                    } else {
                        td.EYQ(EYQ.this, koEYQ);
                    }
                } catch (IOException e) {
                    td.EYQ(EYQ.this, e);
                }
            }
        });
    }

    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.mZx.EYQ.mZx clone() {
        return new EYQ(this.EYQ, this.mZx);
    }
}
