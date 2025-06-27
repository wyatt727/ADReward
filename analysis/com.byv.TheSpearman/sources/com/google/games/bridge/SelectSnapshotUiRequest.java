package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.games.bridge.HelperFragment;

/* loaded from: classes2.dex */
class SelectSnapshotUiRequest implements HelperFragment.Request {
    static final int SELECT_UI_STATUS_AUTHENTICATION_ERROR = -3;
    static final int SELECT_UI_STATUS_GAME_SELECTED = 1;
    static final int SELECT_UI_STATUS_INTERNAL_ERROR = -1;
    static final int SELECT_UI_STATUS_UI_BUSY = -5;
    static final int SELECT_UI_STATUS_USER_CLOSED_UI = 2;
    private static final String TAG = "SelectSnapshotUiRequest";
    private boolean allowAddButton;
    private boolean allowDelete;
    private int maxSnapshots;
    private final TaskCompletionSource<Result> resultTaskSource = new TaskCompletionSource<>();
    private String title;

    public class Result {
        public SnapshotMetadata metadata;
        public int status;

        Result(SelectSnapshotUiRequest selectSnapshotUiRequest, int i, SnapshotMetadata snapshotMetadata) {
            this.status = i;
            this.metadata = snapshotMetadata;
        }
    }

    SelectSnapshotUiRequest(String str, boolean z, boolean z2, int i) {
        this.title = str;
        this.allowAddButton = z;
        this.allowDelete = z2;
        this.maxSnapshots = i;
    }

    Task<Result> getTask() {
        return this.resultTaskSource.getTask();
    }

    @Override // com.google.games.bridge.HelperFragment.Request
    public void process(final HelperFragment helperFragment) {
        Activity activity = helperFragment.getActivity();
        Games.getSnapshotsClient(activity, HelperFragment.getAccount(activity)).getSelectSnapshotIntent(this.title, this.allowAddButton, this.allowDelete, this.maxSnapshots).addOnSuccessListener(activity, new OnSuccessListener<Intent>(this) { // from class: com.google.games.bridge.SelectSnapshotUiRequest.2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Intent intent) {
                Utils.startActivityForResult(helperFragment, intent, GamesStatusCodes.STATUS_VIDEO_UNEXPECTED_CAPTURE_ERROR);
            }
        }).addOnFailureListener(activity, new OnFailureListener() { // from class: com.google.games.bridge.SelectSnapshotUiRequest.1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                SelectSnapshotUiRequest.this.setFailure(exc);
            }
        });
    }

    @Override // com.google.games.bridge.HelperFragment.Request
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9004) {
            if (i2 == -1) {
                setResult(1, (SnapshotMetadata) intent.getParcelableExtra("com.google.android.gms.games.SNAPSHOT_METADATA"));
                return;
            }
            if (i2 == 0) {
                setResult(2);
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
            setResult(-1);
        }
    }

    void setResult(int i, SnapshotMetadata snapshotMetadata) {
        this.resultTaskSource.setResult(new Result(this, i, snapshotMetadata));
        HelperFragment.finishRequest(this);
    }

    void setResult(int i) {
        setResult(i, null);
    }

    void setFailure(Exception exc) {
        this.resultTaskSource.setException(exc);
        HelperFragment.finishRequest(this);
    }
}
