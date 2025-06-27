package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.ImmutableMap;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

@Deprecated
/* loaded from: classes2.dex */
public final class CmcdConfiguration {
    public static final String KEY_BITRATE = "br";
    public static final String KEY_BUFFER_LENGTH = "bl";
    public static final String KEY_CMCD_OBJECT = "CMCD-Object";
    public static final String KEY_CMCD_REQUEST = "CMCD-Request";
    public static final String KEY_CMCD_SESSION = "CMCD-Session";
    public static final String KEY_CMCD_STATUS = "CMCD-Status";
    public static final String KEY_CONTENT_ID = "cid";
    public static final String KEY_MAXIMUM_REQUESTED_BITRATE = "rtp";
    public static final String KEY_MEASURED_THROUGHPUT = "mtp";
    public static final String KEY_OBJECT_DURATION = "d";
    public static final String KEY_OBJECT_TYPE = "ot";
    public static final String KEY_SESSION_ID = "sid";
    public static final String KEY_STREAMING_FORMAT = "sf";
    public static final String KEY_STREAM_TYPE = "st";
    public static final String KEY_TOP_BITRATE = "tb";
    public static final String KEY_VERSION = "v";
    public static final int MAX_ID_LENGTH = 64;
    public final String contentId;
    public final RequestConfig requestConfig;
    public final String sessionId;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CmcdKey {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HeaderKey {
    }

    public interface Factory {
        public static final Factory DEFAULT = new Factory() { // from class: com.google.android.exoplayer2.upstream.CmcdConfiguration$Factory$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.upstream.CmcdConfiguration.Factory
            public final CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem) {
                return CmcdConfiguration.Factory.CC.lambda$static$0(mediaItem);
            }
        };

        CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem);

        /* renamed from: com.google.android.exoplayer2.upstream.CmcdConfiguration$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                Factory factory = Factory.DEFAULT;
            }

            public static /* synthetic */ CmcdConfiguration lambda$static$0(MediaItem mediaItem) {
                return new CmcdConfiguration(UUID.randomUUID().toString(), mediaItem.mediaId != null ? mediaItem.mediaId : "", new RequestConfig() { // from class: com.google.android.exoplayer2.upstream.CmcdConfiguration.Factory.1
                    @Override // com.google.android.exoplayer2.upstream.CmcdConfiguration.RequestConfig
                    public /* synthetic */ ImmutableMap getCustomData() {
                        return RequestConfig.CC.$default$getCustomData(this);
                    }

                    @Override // com.google.android.exoplayer2.upstream.CmcdConfiguration.RequestConfig
                    public /* synthetic */ int getRequestedMaximumThroughputKbps(int i) {
                        return C.RATE_UNSET_INT;
                    }

                    @Override // com.google.android.exoplayer2.upstream.CmcdConfiguration.RequestConfig
                    public /* synthetic */ boolean isKeyAllowed(String str) {
                        return RequestConfig.CC.$default$isKeyAllowed(this, str);
                    }
                });
            }
        }
    }

    public interface RequestConfig {
        ImmutableMap<String, String> getCustomData();

        int getRequestedMaximumThroughputKbps(int i);

        boolean isKeyAllowed(String str);

        /* renamed from: com.google.android.exoplayer2.upstream.CmcdConfiguration$RequestConfig$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static boolean $default$isKeyAllowed(RequestConfig _this, String str) {
                return true;
            }

            public static ImmutableMap $default$getCustomData(RequestConfig _this) {
                return ImmutableMap.of();
            }
        }
    }

    public CmcdConfiguration(String str, String str2, RequestConfig requestConfig) {
        Assertions.checkArgument(str == null || str.length() <= 64);
        Assertions.checkArgument(str2 == null || str2.length() <= 64);
        Assertions.checkNotNull(requestConfig);
        this.sessionId = str;
        this.contentId = str2;
        this.requestConfig = requestConfig;
    }

    public boolean isBitrateLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("br");
    }

    public boolean isBufferLengthLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_BUFFER_LENGTH);
    }

    public boolean isContentIdLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("cid");
    }

    public boolean isSessionIdLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("sid");
    }

    public boolean isMaximumRequestThroughputLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_MAXIMUM_REQUESTED_BITRATE);
    }

    public boolean isStreamingFormatLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_STREAMING_FORMAT);
    }

    public boolean isStreamTypeLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_STREAM_TYPE);
    }

    public boolean isTopBitrateLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("tb");
    }

    public boolean isObjectDurationLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("d");
    }

    public boolean isMeasuredThroughputLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_MEASURED_THROUGHPUT);
    }

    public boolean isObjectTypeLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_OBJECT_TYPE);
    }
}
