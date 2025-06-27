package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.core.content.pm.PackageInfoCompat;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.json.m4;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {
    private static final String API_KEY_HEADER = "X-Goog-Api-Key";
    private static final String ETAG_HEADER = "ETag";
    private static final Pattern GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private static final String IF_NONE_MATCH_HEADER = "If-None-Match";
    private static final String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static final String ISO_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    private final String apiKey;
    private final String appId;
    private final long connectTimeoutInSeconds;
    private final Context context;
    private final String namespace;
    private final String projectNumber;
    private final long readTimeoutInSeconds;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.context = context;
        this.appId = str;
        this.apiKey = str2;
        this.projectNumber = extractProjectNumberFromAppId(str);
        this.namespace = str3;
        this.connectTimeoutInSeconds = j;
        this.readTimeoutInSeconds = j2;
    }

    public long getConnectTimeoutInSeconds() {
        return this.connectTimeoutInSeconds;
    }

    public long getReadTimeoutInSeconds() {
        return this.readTimeoutInSeconds;
    }

    private static String extractProjectNumberFromAppId(String str) {
        Matcher matcher = GMP_APP_ID_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    HttpURLConnection createHttpURLConnection() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(getFetchUrl(this.projectNumber, this.namespace)).openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    ConfigFetchHandler.FetchResponse fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) throws FirebaseRemoteConfigException {
        setUpUrlConnection(httpURLConnection, str3, str2, map2);
        try {
            try {
                setFetchRequestBody(httpURLConnection, createFetchRequestBody(str, str2, map, l).toString().getBytes(m4.M));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject fetchResponseBody = getFetchResponseBody(httpURLConnection);
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                ConfigContainer configContainerExtractConfigs = extractConfigs(fetchResponseBody, date);
                if (!backendHasUpdates(fetchResponseBody)) {
                    return ConfigFetchHandler.FetchResponse.forBackendHasNoUpdates(date, configContainerExtractConfigs);
                }
                return ConfigFetchHandler.FetchResponse.forBackendUpdatesFetched(configContainerExtractConfigs, headerField);
            } finally {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException | JSONException e) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e);
        }
    }

    private void setUpUrlConnection(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout((int) TimeUnit.SECONDS.toMillis(this.connectTimeoutInSeconds));
        httpURLConnection.setReadTimeout((int) TimeUnit.SECONDS.toMillis(this.readTimeoutInSeconds));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        setCommonRequestHeaders(httpURLConnection, str2);
        setCustomRequestHeaders(httpURLConnection, map);
    }

    private String getFetchUrl(String str, String str2) {
        return String.format(RemoteConfigConstants.FETCH_REGEX_URL, str, str2);
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(API_KEY_HEADER, this.apiKey);
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, this.context.getPackageName());
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, "yes");
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, str);
        httpURLConnection.setRequestProperty("Content-Type", m4.K);
        httpURLConnection.setRequestProperty("Accept", m4.K);
    }

    private void setCustomRequestHeaders(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
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
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(FirebaseRemoteConfig.TAG, "No such package: " + this.context.getPackageName(), e);
            return null;
        }
    }

    private JSONObject createFetchRequestBody(String str, String str2, Map<String, String> map, Long l) throws PackageManager.NameNotFoundException, FirebaseRemoteConfigClientException {
        String string;
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map2.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        map2.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID_TOKEN, str2);
        map2.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.appId);
        Locale locale = this.context.getResources().getConfiguration().locale;
        map2.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, locale.getCountry());
        if (Build.VERSION.SDK_INT >= 21) {
            string = locale.toLanguageTag();
        } else {
            string = locale.toString();
        }
        map2.put(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, string);
        map2.put(RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        map2.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put(RemoteConfigConstants.RequestFieldKey.APP_BUILD, Long.toString(PackageInfoCompat.getLongVersionCode(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put("packageName", this.context.getPackageName());
        map2.put("sdkVersion", BuildConfig.VERSION_NAME);
        map2.put(RemoteConfigConstants.RequestFieldKey.ANALYTICS_USER_PROPERTIES, new JSONObject(map));
        if (l != null) {
            map2.put(RemoteConfigConstants.RequestFieldKey.FIRST_OPEN_TIME, convertToISOString(l.longValue()));
        }
        return new JSONObject(map2);
    }

    private String convertToISOString(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO_DATE_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    private void setFetchRequestBody(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private JSONObject getFetchResponseBody(URLConnection uRLConnection) throws JSONException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), m4.M));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i != -1) {
                sb.append((char) i);
            } else {
                return new JSONObject(sb.toString());
            }
        }
    }

    private boolean backendHasUpdates(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private static ConfigContainer extractConfigs(JSONObject jSONObject, Date date) throws JSONException, FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            ConfigContainer.Builder builderWithFetchTime = ConfigContainer.newBuilder().withFetchTime(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                builderWithFetchTime = builderWithFetchTime.replaceConfigsWith(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.EXPERIMENT_DESCRIPTIONS);
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                builderWithFetchTime = builderWithFetchTime.withAbtExperiments(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.PERSONALIZATION_METADATA);
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                builderWithFetchTime = builderWithFetchTime.withPersonalizationMetadata(jSONObject3);
            }
            String string = jSONObject.has(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER) ? jSONObject.getString(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER) : null;
            if (string != null) {
                builderWithFetchTime.withTemplateVersionNumber(Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.ROLLOUT_METADATA);
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                builderWithFetchTime = builderWithFetchTime.withRolloutMetadata(jSONArray2);
            }
            return builderWithFetchTime.build();
        } catch (JSONException e) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e);
        }
    }
}
