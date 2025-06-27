package com.bykv.vk.openvk.preload.geckox.statistic.model;

import com.bykv.vk.openvk.preload.a.a.c;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.json.t2;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class StatisticModel {

    @c(a = "common")
    public Common common;

    @c(a = "packages")
    public List<PackageStatisticModel> packages = new ArrayList();

    public static class PackageStatisticModel {

        @c(a = "ac")
        public String ac;

        @c(a = "access_key")
        public String accessKey;

        @c(a = "active_check_duration")
        public Long activeCheckDuration;

        @c(a = "apply_duration")
        public Long applyDuration;

        @c(a = "channel")
        public String channel;

        @c(a = "clean_duration")
        public Long cleanDuration;

        @c(a = "clean_strategy")
        public Integer cleanStrategy;

        @c(a = "clean_type")
        public Integer cleanType;

        @c(a = "download_duration")
        public Long downloadDuration;

        @c(a = "download_fail_records")
        public List<DownloadFailRecords> downloadFailRecords;

        @c(a = "download_retry_times")
        public Integer downloadRetryTimes;

        @c(a = DownloadModel.DOWNLOAD_URL)
        public String downloadUrl;

        @c(a = "err_code")
        public String errCode;

        @c(a = "err_msg")
        public String errMsg;

        @c(a = "group_name")
        public String groupName;

        @c(a = "id")
        public Long id;

        @c(a = "log_id")
        public String logId;

        @c(a = "patch_id")
        public Long patchId;

        @c(a = "stats_type")
        public Integer statsType;

        public static class DownloadFailRecords {

            @c(a = t2.i.C)
            public String domain;

            @c(a = "reason")
            public String reason;

            public DownloadFailRecords(String str, String str2) {
                this.domain = str;
                this.reason = str2;
            }
        }
    }
}
