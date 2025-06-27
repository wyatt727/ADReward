package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class ng {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f717a = new AtomicReference();

    public static String a() {
        return "iabtechlab-Applovin";
    }

    public static URL b() {
        try {
            return new URL("https://compliance.iabtechnologylab.com/compliance-js/omid-validation-verification-script-v1-APPLOVIN-01102024.js");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c() {
        return "iabtechlab.com-omid";
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        InputStream inputStreamA;
        String str = (String) f717a.get();
        if (StringUtils.isValidString(str)) {
            return str;
        }
        URL urlB = b();
        BufferedReader bufferedReader = null;
        if (urlB == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (((Boolean) kVar.a(oj.M)).booleanValue()) {
            try {
                InputStream inputStreamA2 = kVar.D().a(urlB.toString(), (List) null, false, new s2());
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamA2));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                            sb.append("\n");
                        } finally {
                        }
                    }
                    bufferedReader2.close();
                    if (inputStreamA2 != null) {
                        inputStreamA2.close();
                    }
                } finally {
                }
            } catch (Throwable th) {
                kVar.L().a("OpenMeasurementTestParameters", th);
                kVar.B().a("OpenMeasurementTestParameters", "getTestValidationJavaScriptContent", th);
            }
        } else {
            try {
                inputStreamA = kVar.D().a(urlB.toString(), (List) null, false, new s2());
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(inputStreamA));
                    while (true) {
                        try {
                            String line2 = bufferedReader3.readLine();
                            if (line2 == null) {
                                break;
                            }
                            sb.append(line2);
                            sb.append("\n");
                        } catch (Throwable unused) {
                            bufferedReader = bufferedReader3;
                            zp.a((Closeable) inputStreamA, kVar);
                            zp.a((Closeable) bufferedReader, kVar);
                            String string = sb.toString();
                            f717a.set(string);
                            return string;
                        }
                    }
                    zp.a((Closeable) inputStreamA, kVar);
                    zp.a((Closeable) bufferedReader3, kVar);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                inputStreamA = null;
            }
        }
        String string2 = sb.toString();
        f717a.set(string2);
        return string2;
    }
}
