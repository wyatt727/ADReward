package com.json.mediationsdk.demandOnly;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.m4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/j;", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface j {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/j$a;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "LOAD_ALREADY_IN_PROGRESS", "c", "LOAD_TIMED_OUT", "d", "LOAD_NO_FILL", "e", "INSTANCE_LOAD_EMPTY_SERVER_DATA", "f", "CODE_MISSING_CONFIGURATION", "g", "SHOW_DURING_SHOW", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "SHOW_DURING_LOAD", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "SHOW_NO_AVAILABLE_ADS", "j", "INSTANCE_LOAD_AUCTION_FAILED", CampaignEx.JSON_KEY_AD_K, "LOAD_ERROR", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1940a = new a();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int LOAD_ALREADY_IN_PROGRESS = 1053;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int LOAD_TIMED_OUT = 1055;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int LOAD_NO_FILL = 1058;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_EMPTY_SERVER_DATA = 1062;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int CODE_MISSING_CONFIGURATION = 1063;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int SHOW_DURING_SHOW = 1067;

        /* renamed from: h, reason: from kotlin metadata */
        public static final int SHOW_DURING_LOAD = 1068;

        /* renamed from: i, reason: from kotlin metadata */
        public static final int SHOW_NO_AVAILABLE_ADS = 1069;

        /* renamed from: j, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_AUCTION_FAILED = 1070;

        /* renamed from: k, reason: from kotlin metadata */
        public static final int LOAD_ERROR = 1071;

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b$\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004¨\u0006&"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/j$b;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "LOAD", "c", "LOAD_SUCCESS", "d", "OPENED", "e", "CLICKED", "f", "REWARDED", "g", "LOAD_FAILED", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "SHOW", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "SHOW_FAILED", "j", "CLOSED", CampaignEx.JSON_KEY_AD_K, "VISIBLE", CmcdHeadersFactory.STREAM_TYPE_LIVE, "LOAD_NO_FILL", "m", "READY_TRUE", m4.p, "READY_FALSE", "o", "NOT_FOUND_IN_AVAILABILITY_CHECK", "p", "NOT_FOUND_IN_LOAD", CampaignEx.JSON_KEY_AD_Q, "NOT_FOUND_IN_SHOW", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1941a = new b();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int LOAD = 1001;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int LOAD_SUCCESS = 1002;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int OPENED = 1005;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int CLICKED = 1006;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int REWARDED = 1010;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int LOAD_FAILED = 1200;

        /* renamed from: h, reason: from kotlin metadata */
        public static final int SHOW = 1201;

        /* renamed from: i, reason: from kotlin metadata */
        public static final int SHOW_FAILED = 1202;

        /* renamed from: j, reason: from kotlin metadata */
        public static final int CLOSED = 1203;

        /* renamed from: k, reason: from kotlin metadata */
        public static final int VISIBLE = 1206;

        /* renamed from: l, reason: from kotlin metadata */
        public static final int LOAD_NO_FILL = 1213;

        /* renamed from: m, reason: from kotlin metadata */
        public static final int READY_TRUE = 1210;

        /* renamed from: n, reason: from kotlin metadata */
        public static final int READY_FALSE = 1211;

        /* renamed from: o, reason: from kotlin metadata */
        public static final int NOT_FOUND_IN_AVAILABILITY_CHECK = 1500;

        /* renamed from: p, reason: from kotlin metadata */
        public static final int NOT_FOUND_IN_LOAD = 1503;

        /* renamed from: q, reason: from kotlin metadata */
        public static final int NOT_FOUND_IN_SHOW = 1507;

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/j$c;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "INSTANCE_LOAD_WITH_ADM", "c", "INSTANCE_LOAD_SUCCESS", "d", "INSTANCE_LOAD_FAILED", "e", "INSTANCE_AUCTION_FAILED", "f", "INSTANCE_AUCTION_SUCCESS", "g", "INSTANCE_AUCTION_RESPONSE_WATERFALL", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "INSTANCE_AUCTION_REQUEST", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "INSTANCE_AUCTION_REQUEST_WATERFALL", "j", "AUCTION_SUCCESSFUL_RECOVERY_ERROR", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1942a = new c();

        /* renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_WITH_ADM = 81002;

        /* renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_SUCCESS = 81003;

        /* renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_FAILED = 81110;

        /* renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_FAILED = 81300;

        /* renamed from: f, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_SUCCESS = 81301;

        /* renamed from: g, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_RESPONSE_WATERFALL = 81302;

        /* renamed from: h, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_REQUEST = 81500;

        /* renamed from: i, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_REQUEST_WATERFALL = 81510;

        /* renamed from: j, reason: from kotlin metadata */
        public static final int AUCTION_SUCCESSFUL_RECOVERY_ERROR = 88002;

        private c() {
        }
    }
}
