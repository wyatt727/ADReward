package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/z2;", "Lcom/ironsource/a6;", "", "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "d", "Lcom/ironsource/kb;", "a", "Ljava/lang/String;", "controllerUrl", "cacheFolder", "Z", "shouldUseVersionedFlow", "Lcom/ironsource/kb;", "rootFolder", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/ironsource/kb;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class z2 implements a6 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String controllerUrl;

    /* renamed from: b, reason: from kotlin metadata */
    private final String cacheFolder;

    /* renamed from: c, reason: from kotlin metadata */
    private final boolean shouldUseVersionedFlow;

    /* renamed from: d, reason: from kotlin metadata */
    private final kb rootFolder;

    public z2() {
        this(null, null, false, null, 15, null);
    }

    public z2(String controllerUrl, String cacheFolder, boolean z, kb rootFolder) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.controllerUrl = controllerUrl;
        this.cacheFolder = cacheFolder;
        this.shouldUseVersionedFlow = z;
        this.rootFolder = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ z2(String str, String str2, boolean z, kb kbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new kb(str) : kbVar);
    }

    @Override // com.json.a6
    /* renamed from: a, reason: from getter */
    public kb getRootFolder() {
        return this.rootFolder;
    }

    @Override // com.json.a6
    /* renamed from: b, reason: from getter */
    public String getCacheFolder() {
        return this.cacheFolder;
    }

    @Override // com.json.a6
    /* renamed from: c, reason: from getter */
    public String getControllerUrl() {
        return this.controllerUrl;
    }

    @Override // com.json.a6
    /* renamed from: d, reason: from getter */
    public boolean getShouldUseVersionedFlow() {
        return this.shouldUseVersionedFlow;
    }
}
