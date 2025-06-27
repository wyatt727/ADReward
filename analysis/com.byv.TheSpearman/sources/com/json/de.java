package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ironsource/de;", "Lcom/ironsource/c5;", "", "value", "Lcom/ironsource/kb;", "a", "Lcom/ironsource/kb;", "folderRootUrl", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "()Ljava/lang/String;", "version", "<init>", "(Lcom/ironsource/kb;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class de implements c5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kb folderRootUrl;

    /* renamed from: b, reason: from kotlin metadata */
    private final String version;

    public de(kb folderRootUrl, String version) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        Intrinsics.checkNotNullParameter(version, "version");
        this.folderRootUrl = folderRootUrl;
        this.version = version;
    }

    /* renamed from: a, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Override // com.json.c5
    public String value() {
        return this.folderRootUrl.a() + "/versions/" + this.version + "/mobileController.html";
    }
}
