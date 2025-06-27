package com.google.protobuf;

import com.google.protobuf.UInt64Value;
import com.google.protobuf.UInt64ValueKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UInt64ValueKt.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"uInt64Value", "Lcom/google/protobuf/UInt64Value;", "block", "Lkotlin/Function1;", "Lcom/google/protobuf/UInt64ValueKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeuInt64Value", "copy", "protobuf-kotlin-lite"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UInt64ValueKtKt {
    /* renamed from: -initializeuInt64Value, reason: not valid java name */
    public static final UInt64Value m547initializeuInt64Value(Function1<? super UInt64ValueKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.INSTANCE;
        UInt64Value.Builder builderNewBuilder = UInt64Value.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        UInt64ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UInt64Value copy(UInt64Value uInt64Value, Function1<? super UInt64ValueKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(uInt64Value, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.INSTANCE;
        UInt64Value.Builder builder = uInt64Value.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        UInt64ValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
