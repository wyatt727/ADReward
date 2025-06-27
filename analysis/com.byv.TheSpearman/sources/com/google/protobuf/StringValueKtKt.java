package com.google.protobuf;

import com.google.protobuf.StringValue;
import com.google.protobuf.StringValueKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringValueKt.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"stringValue", "Lcom/google/protobuf/StringValue;", "block", "Lkotlin/Function1;", "Lcom/google/protobuf/StringValueKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializestringValue", "copy", "protobuf-kotlin-lite"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StringValueKtKt {
    /* renamed from: -initializestringValue, reason: not valid java name */
    public static final StringValue m542initializestringValue(Function1<? super StringValueKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.INSTANCE;
        StringValue.Builder builderNewBuilder = StringValue.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        StringValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final StringValue copy(StringValue stringValue, Function1<? super StringValueKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(stringValue, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.INSTANCE;
        StringValue.Builder builder = stringValue.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        StringValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
