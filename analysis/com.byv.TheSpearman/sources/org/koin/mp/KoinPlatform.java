package org.koin.mp;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.logger.Level;
import org.koin.core.module.Module;

/* compiled from: KoinPlatform.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lorg/koin/mp/KoinPlatform;", "", "()V", "getKoin", "Lorg/koin/core/Koin;", "startKoin", "", "modules", "", "Lorg/koin/core/module/Module;", "level", "Lorg/koin/core/logger/Level;", "stopKoin", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KoinPlatform {
    public static final KoinPlatform INSTANCE = new KoinPlatform();

    private KoinPlatform() {
    }

    public final void startKoin(final List<Module> modules, final Level level) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(level, "level");
        DefaultContextExtKt.startKoin(new Function1<KoinApplication, Unit>() { // from class: org.koin.mp.KoinPlatform.startKoin.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KoinApplication koinApplication) {
                invoke2(koinApplication);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KoinApplication startKoin) {
                Intrinsics.checkNotNullParameter(startKoin, "$this$startKoin");
                startKoin.logger(KoinPlatformTools.INSTANCE.defaultLogger(level));
                startKoin.modules(modules);
            }
        });
    }

    public final void stopKoin() {
        DefaultContextExtKt.stopKoin();
    }

    public final Koin getKoin() {
        return KoinPlatformTools.INSTANCE.defaultContext().get();
    }
}
