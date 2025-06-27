package com.google.protobuf;

import com.google.protobuf.BytesValue;
import com.google.protobuf.BytesValueKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BytesValueKt.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"bytesValue", "Lcom/google/protobuf/BytesValue;", "block", "Lkotlin/Function1;", "Lcom/google/protobuf/BytesValueKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializebytesValue", "copy", "protobuf-kotlin-lite"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BytesValueKtKt {
    /* renamed from: -initializebytesValue, reason: not valid java name */
    public static final BytesValue m525initializebytesValue(Function1<? super BytesValueKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.INSTANCE;
        BytesValue.Builder builderNewBuilder = BytesValue.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final BytesValue copy(BytesValue bytesValue, Function1<? super BytesValueKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(bytesValue, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.INSTANCE;
        BytesValue.Builder builder = bytesValue.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
