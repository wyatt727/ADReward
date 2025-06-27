package com.unity3d.services.store;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.annotation.Single;

/* compiled from: StoreWebViewEventSender.kt */
@Single
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n\"\u00020\u0001¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/store/StoreWebViewEventSender;", "", "_eventSender", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "(Lcom/unity3d/services/core/webview/bridge/IEventSender;)V", "send", "", NotificationCompat.CATEGORY_EVENT, "Lcom/unity3d/services/store/StoreEvent;", "params", "", "(Lcom/unity3d/services/store/StoreEvent;[Ljava/lang/Object;)V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StoreWebViewEventSender {
    private final IEventSender _eventSender;

    /* JADX WARN: Multi-variable type inference failed */
    public StoreWebViewEventSender() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public StoreWebViewEventSender(IEventSender _eventSender) {
        Intrinsics.checkNotNullParameter(_eventSender, "_eventSender");
        this._eventSender = _eventSender;
    }

    public /* synthetic */ StoreWebViewEventSender(IEventSender iEventSender, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SharedInstances.INSTANCE.getWebViewEventSender() : iEventSender);
    }

    public final void send(StoreEvent event, Object... params) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        this._eventSender.sendEvent(WebViewEventCategory.STORE, event, Arrays.copyOf(params, params.length));
    }
}
