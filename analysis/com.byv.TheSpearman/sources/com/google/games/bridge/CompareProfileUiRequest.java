package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.games.Games;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
class CompareProfileUiRequest extends SimpleUiRequest {
    private static final String TAG = "CompareProfileUiRequest";
    private String currentPlayerInGameName;
    private String otherPlayerInGameName;
    private String playerId;

    CompareProfileUiRequest(String str, String str2, String str3) {
        this.playerId = str;
        this.otherPlayerInGameName = str2;
        this.currentPlayerInGameName = str3;
    }

    @Override // com.google.games.bridge.SimpleUiRequest
    protected Task<Intent> getIntent(Activity activity) {
        return Games.getPlayersClient(activity, HelperFragment.getAccount(activity)).getCompareProfileIntentWithAlternativeNameHints(this.playerId, this.otherPlayerInGameName, this.currentPlayerInGameName);
    }
}
