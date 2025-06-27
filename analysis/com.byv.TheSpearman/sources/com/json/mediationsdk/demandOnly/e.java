package com.json.mediationsdk.demandOnly;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.m4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/e;", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface e {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/e$a;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "ERROR_LOAD_ALREADY_IN_PROGRESS", "c", "ERROR_LOAD_TIMED_OUT", "d", "ERROR_CODE_MISSING_CONFIGURATION", "e", "ERROR_SHOW_DURING_SHOW", "f", "ERROR_SHOW_DURING_LOAD", "g", "ERROR_SHOW_NO_AVAILABLE_ADS", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "ERROR_LOAD_NO_FILL", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA", "j", "ERROR_INSTANCE_LOAD_AUCTION_FAILED", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1932a = new a();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int ERROR_LOAD_ALREADY_IN_PROGRESS = 1050;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int ERROR_LOAD_TIMED_OUT = 1052;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int ERROR_CODE_MISSING_CONFIGURATION = 1063;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int ERROR_SHOW_DURING_SHOW = 1064;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int ERROR_SHOW_DURING_LOAD = 1065;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int ERROR_SHOW_NO_AVAILABLE_ADS = 1066;

        /* renamed from: h, reason: from kotlin metadata */
        public static final int ERROR_LOAD_NO_FILL = 1158;

        /* renamed from: i, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA = 1162;

        /* renamed from: j, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_AUCTION_FAILED = 1164;

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b&\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004¨\u0006("}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/e$b;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "INSTANCE_LOAD", "c", "INSTANCE_LOAD_SUCCESS", "d", "INSTANCE_OPENED", "e", "INSTANCE_CLICKED", "f", "INSTANCE_LOAD_FAILED", "g", "INSTANCE_SHOW", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "INSTANCE_SHOW_SUCCESS", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "INSTANCE_SHOW_FAILED", "j", "INSTANCE_CLOSED", CampaignEx.JSON_KEY_AD_K, "INSTANCE_VISIBLE", CmcdHeadersFactory.STREAM_TYPE_LIVE, "INSTANCE_READY_TRUE", "m", "INSTANCE_READY_FALSE", m4.p, "INSTANCE_LOAD_NO_FILL", "o", "INSTANCE_LOAD_ERROR", "p", "INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK", CampaignEx.JSON_KEY_AD_Q, "INSTANCE_NOT_FOUND_IN_LOAD", "r", "INSTANCE_NOT_FOUND_IN_SHOW", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1933a = new b();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD = 2002;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_SUCCESS = 2003;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_OPENED = 2005;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_CLICKED = 2006;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_FAILED = 2200;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int INSTANCE_SHOW = 2201;

        /* renamed from: h, reason: from kotlin metadata */
        public static final int INSTANCE_SHOW_SUCCESS = 2202;

        /* renamed from: i, reason: from kotlin metadata */
        public static final int INSTANCE_SHOW_FAILED = 2203;

        /* renamed from: j, reason: from kotlin metadata */
        public static final int INSTANCE_CLOSED = 2204;

        /* renamed from: k, reason: from kotlin metadata */
        public static final int INSTANCE_VISIBLE = 2210;

        /* renamed from: l, reason: from kotlin metadata */
        public static final int INSTANCE_READY_TRUE = 2211;

        /* renamed from: m, reason: from kotlin metadata */
        public static final int INSTANCE_READY_FALSE = 2212;

        /* renamed from: n, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_NO_FILL = 2213;

        /* renamed from: o, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_ERROR = 2303;

        /* renamed from: p, reason: from kotlin metadata */
        public static final int INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK = 2500;

        /* renamed from: q, reason: from kotlin metadata */
        public static final int INSTANCE_NOT_FOUND_IN_LOAD = 2503;

        /* renamed from: r, reason: from kotlin metadata */
        public static final int INSTANCE_NOT_FOUND_IN_SHOW = 2507;

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/e$c;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM", "c", "TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS", "d", "TROUBLESHOOTING_INSTANCE_LOAD_FAILED", "e", "TROUBLESHOOTING_INSTANCE_AUCTION_FAILED", "f", "TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS", "g", "TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST_WATERFALL", "j", "TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1934a = new c();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM = 82002;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS = 82003;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_FAILED = 82110;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_FAILED = 82300;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS = 82301;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL = 82302;

        /* renamed from: h, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST = 82500;

        /* renamed from: i, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST_WATERFALL = 82510;

        /* renamed from: j, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR = 88002;

        private c() {
        }
    }
}
