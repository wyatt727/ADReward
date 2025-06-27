package com.facebook.ads.redexgen.uinode;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.8o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05658o {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"Qr1EFu0kx1tI01867m6ODqfSZ9SwtWDI", "3TYgkAWbIjP9kMvunjr7VwfmqgOZ7ZQ4", "kyx9q1x7DLL5BxK3faNs604Sw4dxbCMr", "cJW9lkVABx2P1Kp63XktrUnlRFV2zQAL", "nhxLXaLaMxGTsXNVJcvnwyCHZZV2RS3H", "y9xLyKazRl3zNBUnfIZmAOMjGK0AXhl4", "DTEqb4TbXnNBCaxA5atVnYK0pSb9DMUi", "fZvghiN"};
    public static final AtomicBoolean A03;
    public static final AtomicReference<String> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{76, 55, 42, 46, 45, 34, 67, 45, 25, 8, 5, 9, 2, 15, 9, 34, 9, 24, 27, 3, 30, 7, 42, 3, 30, 45, 2, 8, 30, 3, 5, 8, 87, 42, 46, Utf8.REPLACEMENT_BYTE, 34, 67, 71, 87, 42, 46, 45, 58, 67, 81, 44, 40, 40, 60, 69, 101, 24, 28, 18, 29, 113, 30, 99, 103, 118, 115, 10, 32, 36, 39, 36, 73, 16, 20, 0, 5, 121, 94, 71, 81, 64, 91, 66, 66, 20, 47, 42, 47, 46, 54, 47, 1, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 21, 15, 30, 9, 21, 26, 23, 85, 14, 26, 53, 55, 60, 55, 32, 59, 49, 49, 45, 45, 41, 119, 56, 62, 60, 55, 45, 38, 32, 54, 33, 12, 50, 52, 54, Base64.padSymbol, 39, 60, 58, 44, 59, 22, 40, 46, 44, 39, Base64.padSymbol, 22, 37, 40, 58, Base64.padSymbol, 22, 59, 44, 47, 59, 44, 58, 33, 48, 34, 37, 24, 49, 46, 34, 48};
    }

    static {
        A08();
        A00 = A00(80, 7, 82);
        A03 = new AtomicBoolean();
        A04 = new AtomicReference<>();
    }

    public static String A01(C05357f c05357f) {
        return WebSettings.getDefaultUserAgent(c05357f);
    }

    public static String A02(final C05357f c05357f) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.8n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final String call() {
                String browserUserAgent = (String) AbstractC05658o.A04.get();
                if (browserUserAgent != null) {
                    return browserUserAgent;
                }
                WebView webView = new WebView(c05357f.getApplicationContext());
                webView.setWebViewClient(new WebViewClient() { // from class: com.facebook.ads.redexgen.X.8m
                    @Override // android.webkit.WebViewClient
                    public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                        NY.A02(C8A.A2h);
                        return true;
                    }
                });
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    AbstractC05658o.A04.set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i = 0; i < 3; i++) {
            ExecutorC0868Li.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th) {
                A09(c05357f, th);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C05357f c05357f, C8K c8k) {
        String strA07 = c8k.A07();
        if (TextUtils.isEmpty(strA07)) {
            boolean andSet = A03.getAndSet(true);
            String[] strArr = A02;
            if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "SlGltdwaGCQXXY2U2bjZ1NfeES9SOW6r";
            strArr2[0] = "AnJMWH4pc3dV3Xqon1tLsffrk7nZCcYt";
            if (!andSet) {
                AnonymousClass89 anonymousClass89A07 = c05357f.A07();
                int i = C8A.A1Z;
                String bundle = A00(73, 7, 29);
                C8B c8b = new C8B(bundle);
                String bundle2 = A00(116, 7, 65);
                anonymousClass89A07.A9a(bundle2, i, c8b);
            }
        }
        return strA07;
    }

    public static String A04(C05357f c05357f, boolean z) {
        if (c05357f == null) {
            return A00;
        }
        if (z) {
            return System.getProperty(A00(123, 10, 74));
        }
        AtomicReference<String> atomicReference = A04;
        String str = atomicReference.get();
        if (str != null) {
            return str;
        }
        long jA01 = AbstractC0795Ig.A01(c05357f);
        String strA00 = A00(Opcodes.D2L, 23, 90);
        String strA002 = A00(133, 10, 64);
        String userAgentString = A00(88, 28, 104);
        if (jA01 > 0) {
            SharedPreferences sharedPreferences = c05357f.getSharedPreferences(ProcessUtils.getProcessSpecificName(userAgentString, c05357f), 0);
            String string = sharedPreferences.getString(strA002, null);
            long spUserAgentRefresh = sharedPreferences.getLong(strA00, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - spUserAgentRefresh < jA01) {
                atomicReference.set(string);
                return string;
            }
        }
        String strA01 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                strA01 = A01(c05357f);
                atomicReference.set(strA01);
            } catch (Throwable t) {
                A09(c05357f, t);
            }
        }
        if (strA01 == null) {
            strA01 = A02(c05357f);
        }
        if (strA01 == null) {
            String str2 = A00;
            String[] strArr = A02;
            String str3 = strArr[2];
            String browserUserAgent = strArr[6];
            if (str3.charAt(19) == browserUserAgent.charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "StKvz6zSFpxDJ9oVJdJRJeNQczVDnPLD";
            strArr2[3] = "N8R2WFi4AoJsdw6tflYfsN6oN8Vo9HPM";
            return str2;
        }
        if (jA01 > 0) {
            SharedPreferences sharedPreferences2 = c05357f.getSharedPreferences(ProcessUtils.getProcessSpecificName(userAgentString, c05357f), 0);
            sharedPreferences2.edit().putString(strA002, A04.get()).apply();
            sharedPreferences2.edit().putLong(strA00, System.currentTimeMillis()).apply();
        }
        return strA01;
    }

    public static String A05(C8K c8k, C05357f c05357f) {
        if (AbstractC0795Ig.A04(c05357f)) {
            return A00(63, 5, 117) + A03(c05357f, c8k) + A00(39, 6, 127) + c8k.A06() + A00(45, 6, 121) + c8k.A04() + A00(38, 1, 111);
        }
        return A00(0, 0, 40);
    }

    public static String A06(C8K c8k, C05357f c05357f, boolean z) {
        return A04(c05357f, z) + A00(0, 38, 127) + c05357f.A04().A8H() + A00(57, 6, 54) + C8K.A04 + A00(38, 1, 111) + A05(c8k, c05357f) + A00(68, 5, 69) + c05357f.A04().A8I() + A00(51, 6, 77) + Locale.getDefault().toString() + A00(87, 1, 79);
    }

    public static void A09(C05357f c05357f, Throwable th) {
        c05357f.A07().A9a(A00(Opcodes.IF_ACMPNE, 8, 84), C8A.A2g, new C8B(th));
    }
}
