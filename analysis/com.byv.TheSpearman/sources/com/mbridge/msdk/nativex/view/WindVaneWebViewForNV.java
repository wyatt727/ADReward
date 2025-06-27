package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.nativex.listener.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class WindVaneWebViewForNV extends WindVaneWebView {
    private static String e = "WindVaneWebViewForNV";
    private b f;
    private boolean g;

    public void setInterceptTouch(boolean z) {
        this.g = z;
    }

    public void setBackListener(b bVar) {
        this.f = bVar;
    }

    public WindVaneWebViewForNV(Context context) {
        super(context);
        this.g = false;
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = false;
    }

    public WindVaneWebViewForNV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = false;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        b bVar;
        if (i == 4 && (bVar = this.f) != null) {
            bVar.a();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void webViewShow(CampaignEx campaignEx, String str) {
        try {
            g.a().a((WebView) this, "webviewshow", "");
            n nVar = new n();
            nVar.f(campaignEx.getRequestId());
            nVar.g(campaignEx.getRequestIdNotice());
            if (getContext() != null && getContext().getApplicationContext() != null) {
                nVar.e(campaignEx.getId());
                nVar.d(campaignEx.isMraid() ? n.f2819a : n.b);
                h.d(nVar, getContext().getApplicationContext(), str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void orientation(boolean z) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("orientation", t2.h.C);
            } else {
                jSONObject.put("orientation", t2.h.D);
            }
            g.a().a((WebView) this, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
