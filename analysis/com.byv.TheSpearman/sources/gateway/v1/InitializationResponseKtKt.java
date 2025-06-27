package gateway.v1;

import gateway.v1.ErrorOuterClass;
import gateway.v1.InitializationResponseKt;
import gateway.v1.InitializationResponseOuterClass;
import gateway.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitializationResponseKt.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0010\u001a)\u0010\u0011\u001a\u00020\n*\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"errorOrNull", "Lgateway/v1/ErrorOuterClass$Error;", "Lgateway/v1/InitializationResponseOuterClass$InitializationResponseOrBuilder;", "getErrorOrNull", "(Lgateway/v1/InitializationResponseOuterClass$InitializationResponseOrBuilder;)Lgateway/v1/ErrorOuterClass$Error;", "nativeConfigurationOrNull", "Lgateway/v1/NativeConfigurationOuterClass$NativeConfiguration;", "getNativeConfigurationOrNull", "(Lgateway/v1/InitializationResponseOuterClass$InitializationResponseOrBuilder;)Lgateway/v1/NativeConfigurationOuterClass$NativeConfiguration;", "initializationResponse", "Lgateway/v1/InitializationResponseOuterClass$InitializationResponse;", "block", "Lkotlin/Function1;", "Lgateway/v1/InitializationResponseKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeinitializationResponse", "copy", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InitializationResponseKtKt {
    /* renamed from: -initializeinitializationResponse, reason: not valid java name */
    public static final InitializationResponseOuterClass.InitializationResponse m1030initializeinitializationResponse(Function1<? super InitializationResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        InitializationResponseKt.Dsl.Companion companion = InitializationResponseKt.Dsl.INSTANCE;
        InitializationResponseOuterClass.InitializationResponse.Builder builderNewBuilder = InitializationResponseOuterClass.InitializationResponse.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        InitializationResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationResponseOuterClass.InitializationResponse copy(InitializationResponseOuterClass.InitializationResponse initializationResponse, Function1<? super InitializationResponseKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(initializationResponse, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        InitializationResponseKt.Dsl.Companion companion = InitializationResponseKt.Dsl.INSTANCE;
        InitializationResponseOuterClass.InitializationResponse.Builder builder = initializationResponse.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        InitializationResponseKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.NativeConfiguration getNativeConfigurationOrNull(InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasNativeConfiguration()) {
            return initializationResponseOrBuilder.getNativeConfiguration();
        }
        return null;
    }

    public static final ErrorOuterClass.Error getErrorOrNull(InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        Intrinsics.checkNotNullParameter(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasError()) {
            return initializationResponseOrBuilder.getError();
        }
        return null;
    }
}
