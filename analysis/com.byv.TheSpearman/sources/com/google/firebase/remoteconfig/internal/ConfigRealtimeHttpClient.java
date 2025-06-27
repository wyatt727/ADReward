package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.m4;
import com.json.mediationsdk.metadata.a;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfigRealtimeHttpClient {
    private static final String API_KEY_HEADER = "X-Goog-Api-Key";
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private static final String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static final String X_ACCEPT_RESPONSE_STREAMING = "X-Accept-Response-Streaming";
    private static final String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    ConfigCacheClient activatedCache;
    private final ConfigFetchHandler configFetchHandler;
    private final Context context;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private int httpRetriesRemaining;
    private final Set<ConfigUpdateListener> listeners;
    private final ConfigMetadataClient metadataClient;
    private final String namespace;
    private final ScheduledExecutorService scheduledExecutorService;
    private final int ORIGINAL_RETRIES = 8;
    private boolean isHttpConnectionRunning = false;
    private final Random random = new Random();
    private final Clock clock = DefaultClock.getInstance();
    private boolean isRealtimeDisabled = false;
    private boolean isInBackground = false;

    private boolean isStatusCodeRetryable(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, Set<ConfigUpdateListener> set, ConfigMetadataClient configMetadataClient, ScheduledExecutorService scheduledExecutorService) {
        this.listeners = set;
        this.scheduledExecutorService = scheduledExecutorService;
        this.httpRetriesRemaining = Math.max(8 - configMetadataClient.getRealtimeBackoffMetadata().getNumFailedStreams(), 1);
        this.firebaseApp = firebaseApp;
        this.configFetchHandler = configFetchHandler;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCache = configCacheClient;
        this.context = context;
        this.namespace = str;
        this.metadataClient = configMetadataClient;
    }

    private static String extractProjectNumberFromAppId(String str) {
        Matcher matcher = GMP_APP_ID_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String getFingerprintHashForPackage() {
        try {
            Context context = this.context;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e(FirebaseRemoteConfig.TAG, "Could not get fingerprint hash for package: " + this.context.getPackageName());
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i(FirebaseRemoteConfig.TAG, "No such package: " + this.context.getPackageName());
            return null;
        }
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, str);
        httpURLConnection.setRequestProperty(API_KEY_HEADER, this.firebaseApp.getOptions().getApiKey());
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, this.context.getPackageName());
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, "yes");
        httpURLConnection.setRequestProperty(X_ACCEPT_RESPONSE_STREAMING, a.g);
        httpURLConnection.setRequestProperty("Content-Type", m4.K);
        httpURLConnection.setRequestProperty("Accept", m4.K);
    }

    private JSONObject createRequestBody(String str) {
        HashMap map = new HashMap();
        map.put("project", extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()));
        map.put("namespace", this.namespace);
        map.put("lastKnownVersionNumber", Long.toString(this.configFetchHandler.getTemplateVersionNumber()));
        map.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.firebaseApp.getOptions().getApplicationId());
        map.put("sdkVersion", BuildConfig.VERSION_NAME);
        map.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        return new JSONObject(map);
    }

    public void setRequestParams(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        setCommonRequestHeaders(httpURLConnection, str2);
        byte[] bytes = createRequestBody(str).toString().getBytes(m4.M);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<ConfigUpdateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(firebaseRemoteConfigException);
        }
    }

    public int getNumberOfFailedStreams() {
        return this.metadataClient.getRealtimeBackoffMetadata().getNumFailedStreams();
    }

    public Date getBackoffEndTime() {
        return this.metadataClient.getRealtimeBackoffMetadata().getBackoffEndTime();
    }

    private void updateBackoffMetadataWithLastFailedStreamConnectionTime(Date date) {
        int numFailedStreams = this.metadataClient.getRealtimeBackoffMetadata().getNumFailedStreams() + 1;
        this.metadataClient.setRealtimeBackoffMetadata(numFailedStreams, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedStreams)));
    }

    private long getRandomizedBackoffDurationInMillis(int i) {
        int length = BACKOFF_TIME_DURATIONS_IN_MINUTES.length;
        if (i >= length) {
            i = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i - 1]) / 2) + this.random.nextInt((int) r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void enableBackoff() {
        this.isRealtimeDisabled = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean canMakeHttpStreamConnection() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Set<com.google.firebase.remoteconfig.ConfigUpdateListener> r0 = r1.listeners     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L17
            boolean r0 = r1.isHttpConnectionRunning     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L17
            boolean r0 = r1.isRealtimeDisabled     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L17
            boolean r0 = r1.isInBackground     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            monitor-exit(r1)
            return r0
        L1a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.canMakeHttpStreamConnection():boolean");
    }

    private String getRealtimeURL(String str) {
        return String.format(RemoteConfigConstants.REALTIME_REGEX_URL, extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()), str);
    }

    private URL getUrl() {
        try {
            return new URL(getRealtimeURL(this.namespace));
        } catch (MalformedURLException unused) {
            Log.e(FirebaseRemoteConfig.TAG, "URL is malformed");
            return null;
        }
    }

    public Task<HttpURLConnection> createRealtimeConnection() {
        final Task<InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
        final Task<String> id = this.firebaseInstallations.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{token, id}).continueWithTask(this.scheduledExecutorService, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f$0.m514xad28ecdf(token, id, task);
            }
        });
    }

    /* renamed from: lambda$createRealtimeConnection$0$com-google-firebase-remoteconfig-internal-ConfigRealtimeHttpClient, reason: not valid java name */
    public /* synthetic */ Task m514xad28ecdf(Task task, Task task2, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) getUrl().openConnection();
            setRequestParams(httpURLConnection, (String) task2.getResult(), ((InstallationTokenResult) task.getResult()).getToken());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e));
        }
    }

    public void startHttpConnection() {
        makeRealtimeHttpConnection(0L);
    }

    public synchronized void retryHttpConnectionWhenBackoffEnds() {
        makeRealtimeHttpConnection(Math.max(0L, this.metadataClient.getRealtimeBackoffMetadata().getBackoffEndTime().getTime() - new Date(this.clock.currentTimeMillis()).getTime()));
    }

    private synchronized void makeRealtimeHttpConnection(long j) {
        if (canMakeHttpStreamConnection()) {
            int i = this.httpRetriesRemaining;
            if (i > 0) {
                this.httpRetriesRemaining = i - 1;
                this.scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ConfigRealtimeHttpClient.this.beginRealtimeHttpStream();
                    }
                }, j, TimeUnit.MILLISECONDS);
            } else if (!this.isInBackground) {
                propagateErrors(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
            }
        }
    }

    void setRealtimeBackgroundState(boolean z) {
        this.isInBackground = z;
    }

    private synchronized void resetRetryCount() {
        this.httpRetriesRemaining = 8;
    }

    private synchronized void setIsHttpConnectionRunning(boolean z) {
        this.isHttpConnectionRunning = z;
    }

    public synchronized ConfigAutoFetch startAutoFetch(HttpURLConnection httpURLConnection) {
        return new ConfigAutoFetch(httpURLConnection, this.configFetchHandler, this.activatedCache, this.listeners, new ConfigUpdateListener() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.2
            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onUpdate(ConfigUpdate configUpdate) {
            }

            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
                ConfigRealtimeHttpClient.this.enableBackoff();
                ConfigRealtimeHttpClient.this.propagateErrors(firebaseRemoteConfigException);
            }
        }, this.scheduledExecutorService);
    }

    private String parseForbiddenErrorResponseMessage(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public void beginRealtimeHttpStream() {
        if (canMakeHttpStreamConnection()) {
            if (new Date(this.clock.currentTimeMillis()).before(this.metadataClient.getRealtimeBackoffMetadata().getBackoffEndTime())) {
                retryHttpConnectionWhenBackoffEnds();
            } else {
                final Task<HttpURLConnection> taskCreateRealtimeConnection = createRealtimeConnection();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskCreateRealtimeConnection}).continueWith(this.scheduledExecutorService, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return this.f$0.m513x5fb1dc1(taskCreateRealtimeConnection, task);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.net.HttpURLConnection] */
    /* renamed from: lambda$beginRealtimeHttpStream$1$com-google-firebase-remoteconfig-internal-ConfigRealtimeHttpClient, reason: not valid java name */
    public /* synthetic */ Task m513x5fb1dc1(Task task, Task task2) throws Exception {
        Integer num;
        Throwable th;
        Integer numValueOf;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        boolean z;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e) {
            e = e;
            task = 0;
            numValueOf = null;
        } catch (Throwable th3) {
            num = null;
            th = th3;
            task = 0;
        }
        if (!task.isSuccessful()) {
            throw new IOException(task.getException());
        }
        setIsHttpConnectionRunning(true);
        task = (HttpURLConnection) task.getResult();
        try {
            numValueOf = Integer.valueOf(task.getResponseCode());
            try {
                if (numValueOf.intValue() == 200) {
                    resetRetryCount();
                    this.metadataClient.resetRealtimeBackoff();
                    startAutoFetch(task).listenForNotifications();
                }
                closeRealtimeHttpStream(task);
                setIsHttpConnectionRunning(false);
                z = numValueOf == null || isStatusCodeRetryable(numValueOf.intValue());
                if (z) {
                    updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                }
            } catch (IOException e2) {
                e = e2;
                Log.d(FirebaseRemoteConfig.TAG, "Exception connecting to real-time RC backend. Retrying the connection...", e);
                closeRealtimeHttpStream(task);
                setIsHttpConnectionRunning(false);
                boolean z2 = numValueOf == null || isStatusCodeRetryable(numValueOf.intValue());
                if (z2) {
                    updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                }
                if (!z2 && numValueOf.intValue() != 200) {
                    String forbiddenErrorResponseMessage = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                    if (numValueOf.intValue() == 403) {
                        forbiddenErrorResponseMessage = parseForbiddenErrorResponseMessage(task.getErrorStream());
                    }
                    firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), forbiddenErrorResponseMessage, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                    propagateErrors(firebaseRemoteConfigServerException);
                    return Tasks.forResult(null);
                }
                retryHttpConnectionWhenBackoffEnds();
                return Tasks.forResult(null);
            }
        } catch (IOException e3) {
            e = e3;
            numValueOf = null;
        } catch (Throwable th4) {
            num = null;
            th = th4;
            closeRealtimeHttpStream(task);
            setIsHttpConnectionRunning(false);
            boolean z3 = num == null || isStatusCodeRetryable(num.intValue());
            if (z3) {
                updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
            }
            if (z3 || num.intValue() == 200) {
                retryHttpConnectionWhenBackoffEnds();
            } else {
                String forbiddenErrorResponseMessage2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                if (num.intValue() == 403) {
                    forbiddenErrorResponseMessage2 = parseForbiddenErrorResponseMessage(task.getErrorStream());
                }
                propagateErrors(new FirebaseRemoteConfigServerException(num.intValue(), forbiddenErrorResponseMessage2, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
            }
            throw th;
        }
        if (!z && numValueOf.intValue() != 200) {
            String forbiddenErrorResponseMessage3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
            if (numValueOf.intValue() == 403) {
                forbiddenErrorResponseMessage3 = parseForbiddenErrorResponseMessage(task.getErrorStream());
            }
            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), forbiddenErrorResponseMessage3, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
            propagateErrors(firebaseRemoteConfigServerException);
            return Tasks.forResult(null);
        }
        retryHttpConnectionWhenBackoffEnds();
        return Tasks.forResult(null);
    }

    public void closeRealtimeHttpStream(HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }
}
