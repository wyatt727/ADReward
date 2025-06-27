package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/* loaded from: classes2.dex */
public final class NativeBridgeActivity extends Activity {
    private static final int BG_COLOR = 1090519039;
    private static final String BRIDGED_INTENT = "BRIDGED_INTENT";
    private static final int GPG_RESPONSE_CODE = 4673607;
    private static final String TAG = "NativeBridgeActivity";
    private boolean pendingResult;

    private native void forwardActivityResult(int i, int i2, Intent intent);

    static {
        System.loadLibrary("gpg");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        View view = new View(this);
        view.setBackgroundColor(BG_COLOR);
        setContentView(view);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        Intent intent = (Intent) getIntent().getParcelableExtra(BRIDGED_INTENT);
        if (intent != null) {
            startActivityForResult(intent, GPG_RESPONSE_CODE);
        }
        super.onStart();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        boolean z = i == GPG_RESPONSE_CODE;
        this.pendingResult = z;
        if (z) {
            String strValueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
            sb.append("starting GPG activity: ");
            sb.append(strValueOf);
            Log.d(TAG, sb.toString());
        } else {
            String strValueOf2 = String.valueOf(intent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 39);
            sb2.append("starting non-GPG activity: ");
            sb2.append(i);
            sb2.append(" ");
            sb2.append(strValueOf2);
            Log.i(TAG, sb2.toString());
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == GPG_RESPONSE_CODE) {
            Log.d(TAG, "Forwarding activity result to native SDK.");
            forwardActivityResult(i, i2, intent);
            this.pendingResult = false;
        } else {
            StringBuilder sb = new StringBuilder(71);
            sb.append("onActivityResult for unknown request code: ");
            sb.append(i);
            sb.append(" calling finish()");
            Log.d(TAG, sb.toString());
        }
        finish();
        super.onActivityResult(i, i2, intent);
    }

    public static void launchBridgeIntent(Activity activity, Intent intent) {
        String strValueOf = String.valueOf(activity);
        String strValueOf2 = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 42 + String.valueOf(strValueOf2).length());
        sb.append("Launching bridge activity: parent:");
        sb.append(strValueOf);
        sb.append(" intent ");
        sb.append(strValueOf2);
        Log.d(TAG, sb.toString());
        Intent intent2 = new Intent(activity, (Class<?>) NativeBridgeActivity.class);
        intent2.putExtra(BRIDGED_INTENT, intent);
        activity.startActivity(intent2);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.pendingResult) {
            Log.w(TAG, "onDestroy called with pendingResult == true.  forwarding canceled result");
            forwardActivityResult(GPG_RESPONSE_CODE, 0, null);
            this.pendingResult = false;
        }
        super.onDestroy();
    }
}
