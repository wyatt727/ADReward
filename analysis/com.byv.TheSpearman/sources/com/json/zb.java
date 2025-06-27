package com.json;

import com.json.d0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"Lcom/ironsource/cc;", x6.p, "", "isManual", "Lcom/ironsource/d0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class zb {
    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 b(cc ccVar, boolean z) {
        return new d0(z ? d0.a.MANUAL : ccVar.k().e() ? d0.a.AUTOMATIC_LOAD_WHILE_SHOW : d0.a.AUTOMATIC_LOAD_AFTER_CLOSE, ccVar.k().j(), ccVar.k().b(), -1L);
    }
}
