package com.google.games.bridge;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.games.bridge.SelectSnapshotUiRequest;

/* loaded from: classes2.dex */
public class HelperFragment extends Fragment {
    private static final String FRAGMENT_TAG = "gpg.HelperFragment";
    static final int RC_CAPTURE_OVERLAY_UI = 9005;
    static final int RC_RESOLUTION_DIALOG = 9011;
    static final int RC_SELECT_OPPONENTS_UI = 9006;
    static final int RC_SELECT_SNAPSHOT_UI = 9004;
    static final int RC_SHOW_REQUEST_PERMISSIONS_UI = 9010;
    static final int RC_SIGN_IN = 9002;
    static final int RC_SIMPLE_UI = 9003;
    private static final String TAG = "HelperFragment";
    private static HelperFragment helperFragment = null;
    private static final Object lock = new Object();
    private static boolean mStartUpSignInCheckPerformed = false;
    private static Request pendingRequest;
    private static Request runningRequest;

    interface Request {
        void onActivityResult(int i, int i2, Intent intent);

        void process(HelperFragment helperFragment);
    }

    public static PendingResult fetchToken(Activity activity, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, String[] strArr, boolean z6, String str2) {
        SignInRequest signInRequest = new SignInRequest(z, z2, z3, z4, str, z5, strArr, z6, str2);
        if (!startRequest(activity, signInRequest)) {
            signInRequest.setFailure(10);
        }
        return signInRequest.getPendingResponse();
    }

    public static Task<Integer> showAchievementUi(Activity activity) {
        AchievementUiRequest achievementUiRequest = new AchievementUiRequest();
        if (!startRequest(activity, achievementUiRequest)) {
            achievementUiRequest.setResult(-12);
        }
        return achievementUiRequest.getTask();
    }

    public static void showCaptureOverlayUi(Activity activity) {
        startRequest(activity, new CaptureOverlayUiRequest());
    }

    public static Task<Integer> showAllLeaderboardsUi(Activity activity) {
        AllLeaderboardsUiRequest allLeaderboardsUiRequest = new AllLeaderboardsUiRequest();
        if (!startRequest(activity, allLeaderboardsUiRequest)) {
            allLeaderboardsUiRequest.setResult(-12);
        }
        return allLeaderboardsUiRequest.getTask();
    }

    public static Task<Integer> showLeaderboardUi(Activity activity, String str, int i) {
        LeaderboardUiRequest leaderboardUiRequest = new LeaderboardUiRequest(str, i);
        if (!startRequest(activity, leaderboardUiRequest)) {
            leaderboardUiRequest.setResult(-12);
        }
        return leaderboardUiRequest.getTask();
    }

    public static Task<SelectSnapshotUiRequest.Result> showSelectSnapshotUi(Activity activity, String str, boolean z, boolean z2, int i) {
        SelectSnapshotUiRequest selectSnapshotUiRequest = new SelectSnapshotUiRequest(str, z, z2, i);
        if (!startRequest(activity, selectSnapshotUiRequest)) {
            selectSnapshotUiRequest.setResult(-5);
        }
        return selectSnapshotUiRequest.getTask();
    }

    public static boolean isResolutionRequired(Exception exc) {
        return exc instanceof ResolvableApiException;
    }

    public static Task<Integer> askForLoadFriendsResolution(Activity activity, PendingIntent pendingIntent) {
        GenericResolutionUiRequest genericResolutionUiRequest = new GenericResolutionUiRequest(pendingIntent);
        if (!startRequest(activity, genericResolutionUiRequest)) {
            genericResolutionUiRequest.setResult(-12);
        }
        return genericResolutionUiRequest.getTask();
    }

    public static Task<Integer> showCompareProfileWithAlternativeNameHintsUI(Activity activity, String str, String str2, String str3) {
        CompareProfileUiRequest compareProfileUiRequest = new CompareProfileUiRequest(str, str2, str3);
        if (!startRequest(activity, compareProfileUiRequest)) {
            compareProfileUiRequest.setResult(-12);
        }
        return compareProfileUiRequest.getTask();
    }

    public static Task<GoogleSignInAccount> showRequestPermissionsUi(Activity activity, String[] strArr) {
        RequestPermissionsRequest requestPermissionsRequest = new RequestPermissionsRequest(toScopeList(strArr));
        if (!startRequest(activity, requestPermissionsRequest)) {
            requestPermissionsRequest.setFailure(-12);
        }
        return requestPermissionsRequest.getTask();
    }

    public static boolean hasPermissions(Activity activity, String[] strArr) {
        return GoogleSignIn.hasPermissions(getAccount(activity), toScopeList(strArr));
    }

    private static Scope[] toScopeList(String[] strArr) {
        Scope[] scopeArr = new Scope[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            scopeArr[i] = new Scope(strArr[i]);
        }
        return scopeArr;
    }

    public static void signOut(Activity activity) {
        GoogleSignIn.getClient(activity, GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN).signOut().addOnSuccessListener(activity, new OnSuccessListener<Void>() { // from class: com.google.games.bridge.HelperFragment.2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Void r2) {
                Log.d(HelperFragment.TAG, "signOut.onSuccess");
            }
        }).addOnFailureListener(activity, new OnFailureListener() { // from class: com.google.games.bridge.HelperFragment.1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception exc) {
                String strValueOf = String.valueOf(exc.toString());
                Log.d(HelperFragment.TAG, strValueOf.length() != 0 ? "signOut.onFailure with ".concat(strValueOf) : new String("signOut.onFailure with "));
            }
        });
        synchronized (lock) {
            pendingRequest = null;
            runningRequest = null;
        }
    }

    private static boolean startRequest(Activity activity, Request request) {
        boolean z;
        synchronized (lock) {
            if (pendingRequest == null && runningRequest == null) {
                pendingRequest = request;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            HelperFragment helperFragment2 = getHelperFragment(activity);
            if (helperFragment2.isResumed()) {
                helperFragment2.processRequest();
            }
        }
        return z;
    }

    private static HelperFragment getHelperFragment(Activity activity) {
        HelperFragment helperFragment2 = (HelperFragment) activity.getFragmentManager().findFragmentByTag(FRAGMENT_TAG);
        if (helperFragment2 != null) {
            return helperFragment2;
        }
        try {
            Log.d(TAG, "Creating fragment");
            HelperFragment helperFragment3 = new HelperFragment();
            FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.add(helperFragment3, FRAGMENT_TAG);
            fragmentTransactionBeginTransaction.commit();
            return helperFragment3;
        } catch (Throwable th) {
            String strValueOf = String.valueOf(th.getMessage());
            Log.e(TAG, strValueOf.length() != 0 ? "Cannot launch token fragment:".concat(strValueOf) : new String("Cannot launch token fragment:"), th);
            return null;
        }
    }

    private void processRequest() {
        synchronized (lock) {
            if (runningRequest != null) {
                return;
            }
            Request request = pendingRequest;
            pendingRequest = null;
            runningRequest = request;
            if (request == null) {
                return;
            }
            request.process(this);
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Request request;
        super.onActivityResult(i, i2, intent);
        synchronized (lock) {
            request = runningRequest;
        }
        if (request == null) {
            return;
        }
        request.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Fragment
    public void onResume() {
        Log.d(TAG, "onResume called");
        super.onResume();
        if (helperFragment == null) {
            helperFragment = this;
        }
        processRequest();
    }

    static void finishRequest(Request request) {
        synchronized (lock) {
            if (runningRequest == request) {
                runningRequest = null;
            }
        }
    }

    public static GoogleSignInAccount getAccount(Activity activity) {
        return GoogleSignIn.getLastSignedInAccount(activity);
    }

    public static View createInvisibleView(Activity activity) {
        View view = new View(activity);
        view.setVisibility(4);
        view.setClickable(false);
        return view;
    }

    public static View getDecorView(Activity activity) {
        return activity.getWindow().getDecorView();
    }
}
