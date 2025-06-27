package com.google.android.gms.auth.api.signin.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes2.dex */
public final class zbb implements Runnable {
    private static final Logger zba = new Logger("RevokeAccessOperation", new String[0]);
    private final String zbb;
    private final StatusPendingResult zbc = new StatusPendingResult((GoogleApiClient) null);

    public zbb(String str) {
        this.zbb = Preconditions.checkNotEmpty(str);
    }

    public static PendingResult<Status> zba(String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        zbb zbbVar = new zbb(str);
        new Thread(zbbVar).start();
        return zbbVar.zbc;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String strValueOf = String.valueOf(this.zbb);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strValueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(strValueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                zba.e("Unable to revoke access!", new Object[0]);
            }
            Logger logger = zba;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            logger.d(sb.toString(), new Object[0]);
        } catch (IOException e) {
            Logger logger2 = zba;
            String strValueOf2 = String.valueOf(e.toString());
            logger2.e(strValueOf2.length() != 0 ? "IOException when revoking access: ".concat(strValueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            Logger logger3 = zba;
            String strValueOf3 = String.valueOf(e2.toString());
            logger3.e(strValueOf3.length() != 0 ? "Exception when revoking access: ".concat(strValueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.zbc.setResult(status);
    }
}
