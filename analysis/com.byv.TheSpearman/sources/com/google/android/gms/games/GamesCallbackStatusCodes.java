package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class GamesCallbackStatusCodes {

    @Deprecated
    public static final int CLIENT_RECONNECT_REQUIRED = 2;
    public static final int INTERNAL_ERROR = 1;
    public static final int OK = 0;

    public static String getStatusCodeString(int i) {
        if (i == 0) {
            return "OK";
        }
        if (i == 1) {
            return "INTERNAL_ERROR";
        }
        if (i == 2) {
            return "CLIENT_RECONNECT_REQUIRED";
        }
        if (i == 6003) {
            return "MULTIPLAYER_DISABLED";
        }
        if (i == 7004) {
            return "REAL_TIME_ROOM_NOT_JOINED";
        }
        if (i == 7000) {
            return "REAL_TIME_CONNECTION_FAILED";
        }
        if (i == 7001) {
            return "REAL_TIME_MESSAGE_SEND_FAILED";
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("unknown games callback status code: ");
        sb.append(i);
        return sb.toString();
    }

    private GamesCallbackStatusCodes() {
    }
}
