package com.json;

import android.text.TextUtils;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.sdk.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
class d5 implements Callable<a4> {
    private static final String d = "FileWorkerThread";

    /* renamed from: a, reason: collision with root package name */
    private final z3 f1730a;
    private final String b;
    private long c;

    d5(z3 z3Var, String str, long j) {
        this.f1730a = z3Var;
        this.b = str;
        this.c = j;
    }

    int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a4 call() {
        int i;
        int iB;
        if (this.c == 0) {
            this.c = 1L;
        }
        a4 a4VarA = null;
        for (int i2 = 0; i2 < this.c && ((iB = (a4VarA = a(this.f1730a.e(), i2, this.f1730a.a(), this.f1730a.c())).b()) == 1008 || iB == 1009); i2++) {
        }
        if (a4VarA != null && a4VarA.a() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            String str = File.separator;
            sb.append(str);
            sb.append(this.f1730a.b().getName());
            String string = sb.toString();
            String str2 = this.f1730a.d() + str + u2.E + this.f1730a.b().getName();
            try {
                if (a(a4VarA.a(), str2) == 0) {
                    a4VarA.a(1006);
                } else if (!a(str2, string)) {
                    a4VarA.a(1014);
                }
            } catch (FileNotFoundException unused) {
                i = 1018;
                a4VarA.a(i);
            } catch (Error e) {
                if (!TextUtils.isEmpty(e.getMessage())) {
                    Logger.i(d, e.getMessage());
                }
                i = 1019;
                a4VarA.a(i);
            } catch (Exception e2) {
                if (!TextUtils.isEmpty(e2.getMessage())) {
                    Logger.i(d, e2.getMessage());
                }
                a4VarA.a(1009);
            }
        }
        return a4VarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    a4 a(String str, int i, int i2, int i3) throws Throwable {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        InputStream inputStream2;
        a4 a4Var = new a4();
        if (TextUtils.isEmpty(str)) {
            a4Var.a(str);
            a4Var.a(1007);
            return a4Var;
        }
        InputStream inputStream3 = null;
        InputStream inputStream4 = null;
        inputStream3 = null;
        HttpURLConnection httpURLConnection2 = null;
        HttpURLConnection httpURLConnection3 = null;
        int responseCode = 0;
        try {
            try {
                try {
                    try {
                        URL url = new URL(str);
                        url.toURI();
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                    } catch (Throwable th) {
                        th.printStackTrace();
                        a4Var.a(str);
                        a4Var.a(i);
                        return a4Var;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = null;
                    inputStream3 = i2;
                }
            } catch (FileNotFoundException unused) {
                httpURLConnection = null;
            } catch (Error e) {
                e = e;
                inputStream2 = null;
            } catch (MalformedURLException unused2) {
                httpURLConnection = null;
            } catch (SocketTimeoutException unused3) {
                httpURLConnection = null;
            } catch (URISyntaxException unused4) {
                httpURLConnection = null;
            } catch (Exception e2) {
                e = e2;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
            }
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        try {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i3);
            httpURLConnection.connect();
            responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 400) {
                Logger.i(d, " RESPONSE CODE: " + responseCode + " URL: " + str + " ATTEMPT: " + i);
                responseCode = 1011;
            } else {
                inputStream4 = httpURLConnection.getInputStream();
                a4Var.a(a(inputStream4));
            }
            if (inputStream4 != null) {
                inputStream4.close();
            }
            httpURLConnection.disconnect();
        } catch (FileNotFoundException unused5) {
            i = 1018;
            if (0 != 0) {
                inputStream3.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            a4Var.a(str);
            a4Var.a(i);
            return a4Var;
        } catch (Error e3) {
            e = e3;
            inputStream2 = null;
            httpURLConnection2 = httpURLConnection;
            responseCode = 1019;
            if (!TextUtils.isEmpty(e.getMessage())) {
                Logger.i(d, e.getMessage());
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            a4Var.a(str);
            a4Var.a(responseCode);
            return a4Var;
        } catch (MalformedURLException unused6) {
            i = 1004;
            if (0 != 0) {
                inputStream3.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            a4Var.a(str);
            a4Var.a(i);
            return a4Var;
        } catch (SocketTimeoutException unused7) {
            i = 1008;
            if (0 != 0) {
                inputStream3.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            a4Var.a(str);
            a4Var.a(i);
            return a4Var;
        } catch (URISyntaxException unused8) {
            i = 1010;
            if (0 != 0) {
                inputStream3.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            a4Var.a(str);
            a4Var.a(i);
            return a4Var;
        } catch (Exception e4) {
            e = e4;
            inputStream = null;
            httpURLConnection3 = httpURLConnection;
            if (!TextUtils.isEmpty(e.getMessage())) {
                Logger.i(d, e.getMessage());
            }
            i = 1009;
            if (inputStream != null) {
                inputStream.close();
            }
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
            }
            a4Var.a(str);
            a4Var.a(i);
            return a4Var;
        } catch (Throwable th5) {
            th = th5;
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (Throwable th6) {
                    th6.printStackTrace();
                    a4Var.a(str);
                    a4Var.a(0);
                    throw th;
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            a4Var.a(str);
            a4Var.a(0);
            throw th;
        }
        a4Var.a(str);
        a4Var.a(responseCode);
        return a4Var;
    }

    boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
