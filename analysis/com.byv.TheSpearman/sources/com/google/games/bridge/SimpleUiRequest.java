package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.games.bridge.HelperFragment;

/* loaded from: classes2.dex */
class SimpleUiRequest implements HelperFragment.Request {
    private static final String TAG = "SimpleUiRequest";
    private final TaskCompletionSource<Integer> resultTaskSource = new TaskCompletionSource<>();

    protected Task<Intent> getIntent(Activity activity) {
        return null;
    }

    SimpleUiRequest() {
    }

    public Task<Integer> getTask() {
        return this.resultTaskSource.getTask();
    }

    @Override // com.google.games.bridge.HelperFragment.Request
    public void process(final HelperFragment helperFragment) {
        Activity activity = helperFragment.getActivity();
        getIntent(activity).addOnSuccessListener(activity, new OnSuccessListener<Intent>(this) { // from class: com.google.games.bridge.SimpleUiRequest.2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Intent intent) {
                Utils.startActivityForResult(helperFragment, intent, GamesStatusCodes.STATUS_VIDEO_STORAGE_ERROR);
            }
        }).addOnFailureListener(activity, new OnFailureListener() { // from class: com.google.games.bridge.SimpleUiRequest.1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                SimpleUiRequest.this.setFailure(exc);
            }
        });
    }

    @Override // com.google.games.bridge.HelperFragment.Request
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9003) {
            if (i2 == -1 || i2 == 0) {
                setResult(1);
                return;
            }
            if (i2 == 10001) {
                setResult(-3);
                return;
            }
            StringBuilder sb = new StringBuilder(48);
            sb.append("onActivityResult unknown resultCode: ");
            sb.append(i2);
            Log.d(TAG, sb.toString());
            setResult(-2);
        }
    }

    void setResult(int i) {
        this.resultTaskSource.setResult(Integer.valueOf(i));
        HelperFragment.finishRequest(this);
    }

    void setFailure(Exception exc) {
        this.resultTaskSource.setException(exc);
        HelperFragment.finishRequest(this);
    }
}
