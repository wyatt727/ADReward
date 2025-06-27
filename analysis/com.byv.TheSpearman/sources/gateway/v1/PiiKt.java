package gateway.v1;

import com.google.protobuf.ByteString;
import com.json.td;
import gateway.v1.PiiOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PiiKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgateway/v1/PiiKt;", "", "()V", "Dsl", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PiiKt {
    public static final PiiKt INSTANCE = new PiiKt();

    /* compiled from: PiiKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0019"}, d2 = {"Lgateway/v1/PiiKt$Dsl;", "", "_builder", "Lgateway/v1/PiiOuterClass$Pii$Builder;", "(Lgateway/v1/PiiOuterClass$Pii$Builder;)V", "value", "Lcom/google/protobuf/ByteString;", td.h1, "getAdvertisingId", "()Lcom/google/protobuf/ByteString;", "setAdvertisingId", "(Lcom/google/protobuf/ByteString;)V", "openAdvertisingTrackingId", "getOpenAdvertisingTrackingId", "setOpenAdvertisingTrackingId", "vendorId", "getVendorId", "setVendorId", "_build", "Lgateway/v1/PiiOuterClass$Pii;", "clearAdvertisingId", "", "clearOpenAdvertisingTrackingId", "clearVendorId", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final PiiOuterClass.Pii.Builder _builder;

        public /* synthetic */ Dsl(PiiOuterClass.Pii.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: PiiKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgateway/v1/PiiKt$Dsl$Companion;", "", "()V", "_create", "Lgateway/v1/PiiKt$Dsl;", "builder", "Lgateway/v1/PiiOuterClass$Pii$Builder;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(PiiOuterClass.Pii.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ PiiOuterClass.Pii _build() {
            PiiOuterClass.Pii piiBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(piiBuild, "_builder.build()");
            return piiBuild;
        }

        public final ByteString getAdvertisingId() {
            ByteString advertisingId = this._builder.getAdvertisingId();
            Intrinsics.checkNotNullExpressionValue(advertisingId, "_builder.getAdvertisingId()");
            return advertisingId;
        }

        public final void setAdvertisingId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdvertisingId(value);
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final ByteString getVendorId() {
            ByteString vendorId = this._builder.getVendorId();
            Intrinsics.checkNotNullExpressionValue(vendorId, "_builder.getVendorId()");
            return vendorId;
        }

        public final void setVendorId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setVendorId(value);
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        public final ByteString getOpenAdvertisingTrackingId() {
            ByteString openAdvertisingTrackingId = this._builder.getOpenAdvertisingTrackingId();
            Intrinsics.checkNotNullExpressionValue(openAdvertisingTrackingId, "_builder.getOpenAdvertisingTrackingId()");
            return openAdvertisingTrackingId;
        }

        public final void setOpenAdvertisingTrackingId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOpenAdvertisingTrackingId(value);
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }
    }

    private PiiKt() {
    }
}
