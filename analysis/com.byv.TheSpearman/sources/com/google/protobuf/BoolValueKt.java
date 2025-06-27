package com.google.protobuf;

import com.google.protobuf.BoolValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoolValueKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/BoolValueKt;", "", "()V", "Dsl", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BoolValueKt {
    public static final BoolValueKt INSTANCE = new BoolValueKt();

    /* compiled from: BoolValueKt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0001J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/google/protobuf/BoolValueKt$Dsl;", "", "_builder", "Lcom/google/protobuf/BoolValue$Builder;", "(Lcom/google/protobuf/BoolValue$Builder;)V", "value", "", "getValue", "()Z", "setValue", "(Z)V", "_build", "Lcom/google/protobuf/BoolValue;", "clearValue", "", "Companion", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BoolValue.Builder _builder;

        public /* synthetic */ Dsl(BoolValue.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(BoolValue.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: BoolValueKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/BoolValueKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/BoolValueKt$Dsl;", "builder", "Lcom/google/protobuf/BoolValue$Builder;", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(BoolValue.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ BoolValue _build() {
            BoolValue boolValueBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(boolValueBuild, "_builder.build()");
            return boolValueBuild;
        }

        public final boolean getValue() {
            return this._builder.getValue();
        }

        public final void setValue(boolean z) {
            this._builder.setValue(z);
        }

        public final void clearValue() {
            this._builder.clearValue();
        }
    }

    private BoolValueKt() {
    }
}
