package com.google.protobuf;

import com.google.protobuf.Option;
import com.google.protobuf.OptionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionKt.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\f\u001a)\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"valueOrNull", "Lcom/google/protobuf/Any;", "Lcom/google/protobuf/OptionOrBuilder;", "getValueOrNull", "(Lcom/google/protobuf/OptionOrBuilder;)Lcom/google/protobuf/Any;", "option", "Lcom/google/protobuf/Option;", "block", "Lkotlin/Function1;", "Lcom/google/protobuf/OptionKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeoption", "copy", "protobuf-kotlin-lite"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OptionKtKt {
    /* renamed from: -initializeoption, reason: not valid java name */
    public static final Option m540initializeoption(Function1<? super OptionKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.INSTANCE;
        Option.Builder builderNewBuilder = Option.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        OptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Option copy(Option option, Function1<? super OptionKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(option, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.INSTANCE;
        Option.Builder builder = option.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        OptionKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Any getValueOrNull(OptionOrBuilder optionOrBuilder) {
        Intrinsics.checkNotNullParameter(optionOrBuilder, "<this>");
        if (optionOrBuilder.hasValue()) {
            return optionOrBuilder.getValue();
        }
        return null;
    }
}
