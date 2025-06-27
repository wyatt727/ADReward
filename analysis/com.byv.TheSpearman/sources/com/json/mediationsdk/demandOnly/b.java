package com.json.mediationsdk.demandOnly;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b;", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b$a;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "ERROR_LOAD_NO_FILL", "c", "ERROR_INSTANCE_LOAD_TIMEOUT", "d", "ERROR_INSTANCE_LOAD_EMPTY_BANNER", "e", "ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA", "f", "ERROR_LOAD_ALREADY_IN_PROGRESS", "g", "ERROR_INSTANCE_LOAD_AUCTION_FAILED", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "ERROR_CODE_MISSING_CONFIGURATION", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1926a = new a();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int ERROR_LOAD_NO_FILL = 606;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_TIMEOUT = 608;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_EMPTY_BANNER = 610;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA = 618;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int ERROR_LOAD_ALREADY_IN_PROGRESS = 619;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_AUCTION_FAILED = 621;

        /* renamed from: h, reason: from kotlin metadata */
        public static final int ERROR_CODE_MISSING_CONFIGURATION = 1063;

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b$b;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "INSTANCE_LOAD", "c", "INSTANCE_LOAD_SUCCESS", "d", "INSTANCE_CLICK", "e", "INSTANCE_SHOW", "f", "INSTANCE_LOAD_ERROR", "g", "INSTANCE_LEAVE_APP", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "INSTANCE_DESTROY", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "INSTANCE_LOAD_NO_FILL", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.mediationsdk.demandOnly.b$b, reason: collision with other inner class name */
    public static final class C0238b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0238b f1927a = new C0238b();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD = 3002;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_SUCCESS = 3005;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_CLICK = 3008;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_SHOW = 3009;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_ERROR = 3300;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int INSTANCE_LEAVE_APP = 3304;

        /* renamed from: h, reason: from kotlin metadata */
        public static final int INSTANCE_DESTROY = 3305;

        /* renamed from: i, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_NO_FILL = 3306;

        private C0238b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b$c;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "TROUBLESHOOTING_INSTANCE_LOAD_FAILED", "c", "TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM", "d", "TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS", "e", "TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING", "f", "TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST", "g", "TROUBLESHOOTING_INSTANCE_AUCTION_FAILED", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST_WATERFALL", "j", "TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL", CampaignEx.JSON_KEY_AD_K, "TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1928a = new c();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_FAILED = 83300;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM = 83302;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS = 83305;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING = 83309;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST = 83500;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_FAILED = 83501;

        /* renamed from: h, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS = 83502;

        /* renamed from: i, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST_WATERFALL = 83510;

        /* renamed from: j, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL = 83511;

        /* renamed from: k, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR = 88002;

        private c() {
        }
    }
}
