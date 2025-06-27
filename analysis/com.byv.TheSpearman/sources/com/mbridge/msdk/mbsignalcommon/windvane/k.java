package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: WindVaneWebViewChromeClient.java */
/* loaded from: classes4.dex */
public final class k extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    WindVaneWebView f3193a;
    private d b;

    public k(WindVaneWebView windVaneWebView) {
        this.f3193a = windVaneWebView;
    }

    public final void a(d dVar) {
        this.b = dVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        ad.b("H5_ENTRY", str2 + "");
        c signalCommunication = this.f3193a.getSignalCommunication();
        if (signalCommunication == null || str3 == null || !signalCommunication.a(str3)) {
            return false;
        }
        signalCommunication.b(str2);
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        d dVar = this.b;
        if (dVar != null) {
            dVar.b(webView, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        c signalCommunication = this.f3193a.getSignalCommunication();
        if (signalCommunication != null && consoleMessage != null) {
            String strMessage = consoleMessage.message();
            if (TextUtils.isEmpty(strMessage) || !strMessage.startsWith("mv://")) {
                return false;
            }
            ad.a("H5_ENTRY", "onConsoleMessage: message.length() = " + strMessage.length() + " " + strMessage);
            if (strMessage.contains("wv_hybrid:") && signalCommunication.a("wv_hybrid:")) {
                String strSubstring = strMessage.substring(0, strMessage.lastIndexOf(" ") + 1);
                ad.a("H5_ENTRY", "message = " + strSubstring);
                signalCommunication.b(strSubstring);
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
