package com.json;

import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0014J\b\u0010\b\u001a\u00020\u000bH\u0014J\u0018\u0010\u0012\u001a\u00020\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010H\u0014J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0017"}, d2 = {"Lcom/ironsource/lb;", "Lcom/ironsource/z1;", "Lcom/ironsource/l4;", NotificationCompat.CATEGORY_EVENT, "", "j", CampaignEx.JSON_KEY_AD_K, "currentEvent", "d", "", "c", "", "f", "eventId", "", "e", "Ljava/util/ArrayList;", "combinedEventList", "a", "g", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class lb extends z1 {
    public static final lb P;

    static {
        lb lbVar = new lb();
        P = lbVar;
        lbVar.H = "outcome";
        lbVar.G = 0;
        lbVar.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        lbVar.e();
    }

    private lb() {
    }

    @Override // com.json.z1
    protected void a(ArrayList<l4> combinedEventList) {
    }

    @Override // com.json.z1
    protected int c(l4 event) {
        return 1;
    }

    @Override // com.json.z1
    protected void d() {
    }

    @Override // com.json.z1
    protected boolean d(l4 currentEvent) {
        return true;
    }

    @Override // com.json.z1
    protected String e(int eventId) {
        return "";
    }

    @Override // com.json.z1
    protected void f(l4 event) {
    }

    @Override // com.json.z1
    protected boolean g(l4 event) {
        return false;
    }

    @Override // com.json.z1
    protected boolean h(l4 event) {
        return false;
    }

    @Override // com.json.z1
    protected boolean j(l4 event) {
        return false;
    }

    @Override // com.json.z1
    protected boolean k(l4 event) {
        return false;
    }
}
