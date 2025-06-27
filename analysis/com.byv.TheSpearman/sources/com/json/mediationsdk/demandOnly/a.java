package com.json.mediationsdk.demandOnly;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.i1;
import com.json.mediationsdk.d;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&¨\u0006\r"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/a;", "", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "isEmpty", "instanceName", "Lcom/ironsource/i1;", "a", "", FirebaseAnalytics.Param.INDEX, "get", "", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface a {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/a$a;", "Lcom/ironsource/mediationsdk/demandOnly/a;", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "isEmpty", "instanceName", "Lcom/ironsource/i1;", "a", "", FirebaseAnalytics.Param.INDEX, "get", "", "Ljava/util/List;", d.h, "<init>", "(Ljava/util/List;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C0237a implements a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<i1> waterfall;

        /* JADX WARN: Multi-variable type inference failed */
        public C0237a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public C0237a(List<i1> waterfall) {
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            this.waterfall = waterfall;
        }

        public /* synthetic */ C0237a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list);
        }

        @Override // com.json.mediationsdk.demandOnly.a
        public i1 a(String instanceName) {
            Object next;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            Iterator<T> it = this.waterfall.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((i1) next).c(), instanceName)) {
                    break;
                }
            }
            return (i1) next;
        }

        @Override // com.json.mediationsdk.demandOnly.a
        public List<i1> a() {
            return this.waterfall;
        }

        @Override // com.json.mediationsdk.demandOnly.a
        public String b() {
            if (this.waterfall.isEmpty()) {
                return "";
            }
            return '1' + ((i1) CollectionsKt.first((List) this.waterfall)).c();
        }

        @Override // com.json.mediationsdk.demandOnly.a
        public i1 get(int index) {
            if (index < 0 || index >= this.waterfall.size()) {
                return null;
            }
            return this.waterfall.get(index);
        }

        @Override // com.json.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.waterfall.isEmpty();
        }
    }

    i1 a(String instanceName);

    List<i1> a();

    String b();

    i1 get(int index);

    boolean isEmpty();
}
