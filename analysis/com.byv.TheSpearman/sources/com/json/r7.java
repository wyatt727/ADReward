package com.json;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.sdk.utils.Logger;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/ironsource/r7;", "Landroid/widget/FrameLayout;", "Lcom/ironsource/ge;", "a", "Landroid/view/View;", "changedView", "", "visibility", "", "onVisibilityChanged", "onWindowVisibilityChanged", "", "Ljava/lang/String;", "logTag", "Lcom/ironsource/r7$a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/r7$a;", "getListener$mediationsdk_release", "()Lcom/ironsource/r7$a;", "setListener$mediationsdk_release", "(Lcom/ironsource/r7$a;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class r7 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String logTag;

    /* renamed from: b, reason: from kotlin metadata */
    private a listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/ironsource/r7$a;", "", "Lcom/ironsource/ge;", "viewVisibilityParams", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(ViewVisibilityParams viewVisibilityParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.logTag = "ISNNativeAdContainer";
    }

    private final ViewVisibilityParams a() {
        return new ViewVisibilityParams(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    /* renamed from: getListener$mediationsdk_release, reason: from getter */
    public final a getListener() {
        return this.listener;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        Logger.i(this.logTag, "onVisibilityChanged: " + visibility);
        a aVar = this.listener;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        Logger.i(this.logTag, "onWindowVisibilityChanged: " + visibility);
        a aVar = this.listener;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(a aVar) {
        this.listener = aVar;
    }
}
