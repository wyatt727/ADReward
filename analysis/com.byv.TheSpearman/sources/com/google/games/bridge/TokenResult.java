package com.google.games.bridge;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public class TokenResult implements Result {
    private GoogleSignInAccount account;
    private Status status;

    public String toString() {
        String strValueOf = String.valueOf(this.status);
        String email = getEmail();
        String idToken = getIdToken();
        String authCode = getAuthCode();
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 29 + String.valueOf(email).length() + String.valueOf(idToken).length() + String.valueOf(authCode).length());
        sb.append("Status: ");
        sb.append(strValueOf);
        sb.append(" email: ");
        sb.append(email);
        sb.append(" id:");
        sb.append(idToken);
        sb.append(" access: ");
        sb.append(authCode);
        return sb.toString();
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.status;
    }

    public int getStatusCode() {
        return this.status.getStatusCode();
    }

    public GoogleSignInAccount getAccount() {
        return this.account;
    }

    public String getAuthCode() {
        GoogleSignInAccount googleSignInAccount = this.account;
        String serverAuthCode = googleSignInAccount == null ? "" : googleSignInAccount.getServerAuthCode();
        return serverAuthCode == null ? "" : serverAuthCode;
    }

    public String getIdToken() {
        GoogleSignInAccount googleSignInAccount = this.account;
        String idToken = googleSignInAccount == null ? "" : googleSignInAccount.getIdToken();
        return idToken == null ? "" : idToken;
    }

    public String getEmail() {
        GoogleSignInAccount googleSignInAccount = this.account;
        String email = googleSignInAccount == null ? "" : googleSignInAccount.getEmail();
        return email == null ? "" : email;
    }

    public void setStatus(int i) {
        this.status = new Status(i);
    }

    public void setAccount(GoogleSignInAccount googleSignInAccount) {
        this.account = googleSignInAccount;
    }
}
