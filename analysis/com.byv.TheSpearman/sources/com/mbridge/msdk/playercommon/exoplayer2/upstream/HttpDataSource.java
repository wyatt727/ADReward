package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface HttpDataSource extends DataSource {
    public static final Predicate<String> REJECT_PAYWALL_TYPES = new Predicate<String>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.util.Predicate
        public boolean evaluate(String str) {
            String lowerInvariant = Util.toLowerInvariant(str);
            return (TextUtils.isEmpty(lowerInvariant) || (lowerInvariant.contains("text") && !lowerInvariant.contains("text/vtt")) || lowerInvariant.contains("html") || lowerInvariant.contains("xml")) ? false : true;
        }
    };

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    void close() throws HttpDataSourceException;

    Map<String, List<String>> getResponseHeaders();

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    long open(DataSpec dataSpec) throws HttpDataSourceException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    int read(byte[] bArr, int i, int i2) throws HttpDataSourceException;

    void setRequestProperty(String str, String str2);

    public interface Factory extends DataSource.Factory {
        void clearAllDefaultRequestProperties();

        void clearDefaultRequestProperty(String str);

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource.Factory
        HttpDataSource createDataSource();

        RequestProperties getDefaultRequestProperties();

        void setDefaultRequestProperty(String str, String str2);

        /* renamed from: com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }
    }

    public static final class RequestProperties {
        private final Map<String, String> requestProperties = new HashMap();
        private Map<String, String> requestPropertiesSnapshot;

        public final synchronized void set(String str, String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public final synchronized void set(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }

        public final synchronized void clearAndSet(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public final synchronized void remove(String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public final synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public final synchronized Map<String, String> getSnapshot() {
            if (this.requestPropertiesSnapshot == null) {
                this.requestPropertiesSnapshot = Collections.unmodifiableMap(new HashMap(this.requestProperties));
            }
            return this.requestPropertiesSnapshot;
        }
    }

    public static abstract class BaseFactory implements Factory {
        private final RequestProperties defaultRequestProperties = new RequestProperties();

        protected abstract HttpDataSource createDataSourceInternal(RequestProperties requestProperties);

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource.Factory
        public final HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        public final RequestProperties getDefaultRequestProperties() {
            return this.defaultRequestProperties;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        public final void setDefaultRequestProperty(String str, String str2) {
            this.defaultRequestProperties.set(str, str2);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        public final void clearDefaultRequestProperty(String str) {
            this.defaultRequestProperties.remove(str);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        public final void clearAllDefaultRequestProperties() {
            this.defaultRequestProperties.clear();
        }
    }

    public static class HttpDataSourceException extends IOException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final DataSpec dataSpec;
        public final int type;

        public @interface Type {
        }

        public HttpDataSourceException(DataSpec dataSpec, int i) {
            this.dataSpec = dataSpec;
            this.type = i;
        }

        public HttpDataSourceException(String str, DataSpec dataSpec, int i) {
            super(str);
            this.dataSpec = dataSpec;
            this.type = i;
        }

        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i) {
            super(iOException);
            this.dataSpec = dataSpec;
            this.type = i;
        }

        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i) {
            super(str, iOException);
            this.dataSpec = dataSpec;
            this.type = i;
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, DataSpec dataSpec) {
            super("Invalid content type: " + str, dataSpec, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final int responseCode;

        public InvalidResponseCodeException(int i, Map<String, List<String>> map, DataSpec dataSpec) {
            super("Response code: " + i, dataSpec, 1);
            this.responseCode = i;
            this.headerFields = map;
        }
    }
}
