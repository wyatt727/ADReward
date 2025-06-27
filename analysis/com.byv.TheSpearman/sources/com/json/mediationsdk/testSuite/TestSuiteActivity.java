package com.json.mediationsdk.testSuite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.json.bd;
import com.json.hd;
import com.json.ld;
import com.json.y7;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;", "Landroid/app/Activity;", "Lcom/ironsource/y7;", "Lorg/json/JSONObject;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "a", "Landroid/widget/RelativeLayout$LayoutParams;", "c", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "onDestroy", "onUIReady", "onClosed", "Landroid/widget/RelativeLayout;", "getContainer", "Landroid/widget/RelativeLayout;", "mContainer", "Lcom/ironsource/ld;", "Lcom/ironsource/ld;", "mWebViewWrapper", "Lcom/ironsource/hd;", "Lcom/ironsource/hd;", "mNativeBridge", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class TestSuiteActivity extends Activity implements y7 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private RelativeLayout mContainer;

    /* renamed from: b, reason: from kotlin metadata */
    private ld mWebViewWrapper;

    /* renamed from: c, reason: from kotlin metadata */
    private hd mNativeBridge;

    private final String a() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final JSONObject b() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            String string = extras != null ? extras.getString(bd.f1711a) : null;
            if (!(string == null || string.length() == 0)) {
                return new JSONObject(string);
            }
        }
        return new JSONObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ld ldVar = this$0.mWebViewWrapper;
        ld ldVar2 = null;
        if (ldVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            ldVar = null;
        }
        if (ldVar.getMAppWebView().getParent() == null) {
            RelativeLayout relativeLayout = this$0.mContainer;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            ld ldVar3 = this$0.mWebViewWrapper;
            if (ldVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                ldVar3 = null;
            }
            relativeLayout.removeView(ldVar3.getMLoadingScreenWebView());
            RelativeLayout relativeLayout2 = this$0.mContainer;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout2 = null;
            }
            ld ldVar4 = this$0.mWebViewWrapper;
            if (ldVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                ldVar4 = null;
            }
            relativeLayout2.addView(ldVar4.getMAppWebView(), this$0.c());
            ld ldVar5 = this$0.mWebViewWrapper;
            if (ldVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            } else {
                ldVar2 = ldVar5;
            }
            ldVar2.b();
        }
    }

    private final RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.mContainer;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.json.y7
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.a(this.f$0);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.mContainer = relativeLayout;
        setContentView(relativeLayout, c());
        ld ldVar = new ld(this, this, b(), a());
        this.mWebViewWrapper = ldVar;
        hd hdVar = new hd(ldVar);
        this.mNativeBridge = hdVar;
        hdVar.d();
        RelativeLayout relativeLayout2 = this.mContainer;
        ld ldVar2 = null;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout2 = null;
        }
        ld ldVar3 = this.mWebViewWrapper;
        if (ldVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            ldVar2 = ldVar3;
        }
        relativeLayout2.addView(ldVar2.getMLoadingScreenWebView(), c());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        hd hdVar = this.mNativeBridge;
        ld ldVar = null;
        if (hdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBridge");
            hdVar = null;
        }
        hdVar.a();
        RelativeLayout relativeLayout = this.mContainer;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        ld ldVar2 = this.mWebViewWrapper;
        if (ldVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            ldVar = ldVar2;
        }
        ldVar.a();
        super.onDestroy();
    }

    @Override // com.json.y7
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.b(this.f$0);
            }
        });
    }
}
