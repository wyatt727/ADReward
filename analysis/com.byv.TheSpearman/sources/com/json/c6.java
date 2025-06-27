package com.json;

import android.os.Handler;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.t2;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J6\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/ironsource/c6;", "", "Lcom/ironsource/o7;", t2.h.b, "", "url", "", "connectionTimeout", "readTimeout", "", "a", "Landroid/os/Handler;", "handler", "Lcom/ironsource/db;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface c6 {
    void a(db listener);

    void a(o7 file, String url);

    void a(o7 file, String url, int connectionTimeout, int readTimeout);

    void a(o7 file, String url, int connectionTimeout, int readTimeout, Handler handler);
}
