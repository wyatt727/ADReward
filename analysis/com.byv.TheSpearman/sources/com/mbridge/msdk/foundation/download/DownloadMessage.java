package com.mbridge.msdk.foundation.download;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.core.GlobalComponent;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.same.net.g.b;
import com.mbridge.msdk.foundation.tools.ad;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class DownloadMessage<T> {
    private static final String TAG = "DownloadMessage";
    private boolean checkMD5;
    private int downloadRate;
    private DownloadResourceType downloadResourceType;
    private String downloadUrl;
    private Map<String, Object> extraData;
    private String host;
    private boolean isCache;
    private String md5;
    private T object;
    private String resourceUrl;
    private String saveFileName;
    private String saveFilePath;
    private int from = 0;
    private boolean isUseCronet = false;
    private int md5VerifyResult = 0;

    public DownloadMessage(T t, String str, String str2, int i, DownloadResourceType downloadResourceType) {
        this.checkMD5 = false;
        this.downloadRate = 100;
        this.md5 = "";
        this.object = t;
        this.downloadUrl = str;
        this.saveFileName = str2;
        this.downloadRate = i;
        this.downloadResourceType = downloadResourceType;
        try {
            URL url = new URL(str);
            this.resourceUrl = url.getProtocol() + "://" + url.getHost() + url.getPath();
            ILogger logger = GlobalComponent.getInstance().getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append(" resourceUrl: ");
            sb.append(this.resourceUrl);
            logger.log(TAG, sb.toString());
        } catch (MalformedURLException unused) {
            this.resourceUrl = "";
        }
        try {
            Uri uri = Uri.parse(str);
            String queryParameter = uri.getQueryParameter(ResourceManager.KEY_MD5CHECK);
            String queryParameter2 = uri.getQueryParameter(ResourceManager.KEY_MD5FILENAME);
            if (!TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            this.checkMD5 = true;
            this.md5 = queryParameter2;
        } catch (Throwable th) {
            GlobalComponent.getInstance().getLogger().log(TAG, th.getMessage());
        }
    }

    public void addExtra(String str, Object obj) {
        if (this.extraData == null) {
            this.extraData = new HashMap(4);
        }
        this.extraData.put(str, obj);
    }

    public boolean canUseCronet() {
        return this.isUseCronet;
    }

    public T getObject() {
        return this.object;
    }

    public int getDownloadRate() {
        return this.downloadRate;
    }

    public void setDownloadRate(int i) {
        this.downloadRate = i;
    }

    public DownloadResourceType getDownloadResourceType() {
        return this.downloadResourceType;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public Object getExtra(String str) {
        Map<String, Object> map = this.extraData;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.extraData.get(str);
    }

    public int getFrom() {
        return this.from;
    }

    public void setFrom(int i) {
        this.from = i;
    }

    public String getMd5() {
        return this.md5;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public String getSaveFileName() {
        return this.saveFileName;
    }

    public String getSaveFilePath() {
        return this.saveFilePath;
    }

    public void setSaveFilePath(String str) {
        this.saveFilePath = str;
    }

    public boolean isCheckMD5() {
        return this.checkMD5;
    }

    public void setCheckMD5(boolean z) {
        this.checkMD5 = z;
    }

    public void setUseCronetDownload(int i) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        try {
            this.isUseCronet = z;
            if (TextUtils.isEmpty(this.downloadUrl)) {
                return;
            }
            if (TextUtils.isEmpty(this.host)) {
                this.host = new URL(this.downloadUrl).getHost();
            }
            if (this.isUseCronet) {
                b.a(this.host);
            }
        } catch (Throwable th) {
            ad.b(TAG, th.getMessage());
        }
    }

    public int getMd5VerifyResult() {
        return this.md5VerifyResult;
    }

    public void setMd5VerifyResult(int i) {
        this.md5VerifyResult = i;
    }

    public boolean isCache() {
        return this.isCache;
    }

    public void setCache(boolean z) {
        this.isCache = z;
    }
}
