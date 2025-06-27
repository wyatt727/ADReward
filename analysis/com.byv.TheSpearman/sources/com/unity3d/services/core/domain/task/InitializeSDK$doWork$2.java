package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InitializeSDK.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", i = {0, 1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10}, l = {44, 49, 51, 56, 58, 62, 65, 80, 83, 91, 94, 97}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "configuration", "resetResult", "$this$withContext", "configuration", "$this$withContext", "configResult", "configuration", "$this$withContext", "configResult", "configuration", "loadCacheResult", "configResult", "configResult", "loadWebResult", "configResult", "configResult"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$2", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$1", "L$1", "L$2", "L$1", "L$1"})
/* loaded from: classes4.dex */
final class InitializeSDK$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$2(InitializeSDK initializeSDK, Continuation<? super InitializeSDK$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, continuation);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((InitializeSDK$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0281 A[Catch: all -> 0x031a, CancellationException -> 0x0347, TryCatch #2 {CancellationException -> 0x0347, all -> 0x031a, blocks: (B:6:0x0012, B:118:0x0304, B:9:0x0023, B:115:0x02e5, B:12:0x002e, B:110:0x02cc, B:112:0x02d2, B:15:0x0041, B:103:0x0296, B:106:0x02a6, B:18:0x004c, B:98:0x027b, B:100:0x0281, B:22:0x005c, B:84:0x020b, B:86:0x0211, B:87:0x021e, B:25:0x0074, B:78:0x01ec, B:80:0x01f2, B:88:0x021f, B:90:0x022a, B:92:0x0234, B:94:0x023a, B:95:0x0257, B:104:0x02a0, B:119:0x030e, B:120:0x0319, B:28:0x008d, B:75:0x01c9, B:31:0x009e, B:70:0x01ad, B:72:0x01b3, B:34:0x00ae, B:63:0x017e, B:65:0x0184, B:66:0x0191, B:37:0x00c4, B:57:0x0161, B:59:0x0167, B:67:0x0192, B:40:0x00d7, B:48:0x0119, B:50:0x011f, B:51:0x0137, B:54:0x0143, B:44:0x00ec), top: B:133:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d2 A[Catch: all -> 0x031a, CancellationException -> 0x0347, TryCatch #2 {CancellationException -> 0x0347, all -> 0x031a, blocks: (B:6:0x0012, B:118:0x0304, B:9:0x0023, B:115:0x02e5, B:12:0x002e, B:110:0x02cc, B:112:0x02d2, B:15:0x0041, B:103:0x0296, B:106:0x02a6, B:18:0x004c, B:98:0x027b, B:100:0x0281, B:22:0x005c, B:84:0x020b, B:86:0x0211, B:87:0x021e, B:25:0x0074, B:78:0x01ec, B:80:0x01f2, B:88:0x021f, B:90:0x022a, B:92:0x0234, B:94:0x023a, B:95:0x0257, B:104:0x02a0, B:119:0x030e, B:120:0x0319, B:28:0x008d, B:75:0x01c9, B:31:0x009e, B:70:0x01ad, B:72:0x01b3, B:34:0x00ae, B:63:0x017e, B:65:0x0184, B:66:0x0191, B:37:0x00c4, B:57:0x0161, B:59:0x0167, B:67:0x0192, B:40:0x00d7, B:48:0x0119, B:50:0x011f, B:51:0x0137, B:54:0x0143, B:44:0x00ec), top: B:133:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0303 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f A[Catch: all -> 0x031a, CancellationException -> 0x0347, TryCatch #2 {CancellationException -> 0x0347, all -> 0x031a, blocks: (B:6:0x0012, B:118:0x0304, B:9:0x0023, B:115:0x02e5, B:12:0x002e, B:110:0x02cc, B:112:0x02d2, B:15:0x0041, B:103:0x0296, B:106:0x02a6, B:18:0x004c, B:98:0x027b, B:100:0x0281, B:22:0x005c, B:84:0x020b, B:86:0x0211, B:87:0x021e, B:25:0x0074, B:78:0x01ec, B:80:0x01f2, B:88:0x021f, B:90:0x022a, B:92:0x0234, B:94:0x023a, B:95:0x0257, B:104:0x02a0, B:119:0x030e, B:120:0x0319, B:28:0x008d, B:75:0x01c9, B:31:0x009e, B:70:0x01ad, B:72:0x01b3, B:34:0x00ae, B:63:0x017e, B:65:0x0184, B:66:0x0191, B:37:0x00c4, B:57:0x0161, B:59:0x0167, B:67:0x0192, B:40:0x00d7, B:48:0x0119, B:50:0x011f, B:51:0x0137, B:54:0x0143, B:44:0x00ec), top: B:133:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167 A[Catch: all -> 0x031a, CancellationException -> 0x0347, TryCatch #2 {CancellationException -> 0x0347, all -> 0x031a, blocks: (B:6:0x0012, B:118:0x0304, B:9:0x0023, B:115:0x02e5, B:12:0x002e, B:110:0x02cc, B:112:0x02d2, B:15:0x0041, B:103:0x0296, B:106:0x02a6, B:18:0x004c, B:98:0x027b, B:100:0x0281, B:22:0x005c, B:84:0x020b, B:86:0x0211, B:87:0x021e, B:25:0x0074, B:78:0x01ec, B:80:0x01f2, B:88:0x021f, B:90:0x022a, B:92:0x0234, B:94:0x023a, B:95:0x0257, B:104:0x02a0, B:119:0x030e, B:120:0x0319, B:28:0x008d, B:75:0x01c9, B:31:0x009e, B:70:0x01ad, B:72:0x01b3, B:34:0x00ae, B:63:0x017e, B:65:0x0184, B:66:0x0191, B:37:0x00c4, B:57:0x0161, B:59:0x0167, B:67:0x0192, B:40:0x00d7, B:48:0x0119, B:50:0x011f, B:51:0x0137, B:54:0x0143, B:44:0x00ec), top: B:133:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184 A[Catch: all -> 0x031a, CancellationException -> 0x0347, TryCatch #2 {CancellationException -> 0x0347, all -> 0x031a, blocks: (B:6:0x0012, B:118:0x0304, B:9:0x0023, B:115:0x02e5, B:12:0x002e, B:110:0x02cc, B:112:0x02d2, B:15:0x0041, B:103:0x0296, B:106:0x02a6, B:18:0x004c, B:98:0x027b, B:100:0x0281, B:22:0x005c, B:84:0x020b, B:86:0x0211, B:87:0x021e, B:25:0x0074, B:78:0x01ec, B:80:0x01f2, B:88:0x021f, B:90:0x022a, B:92:0x0234, B:94:0x023a, B:95:0x0257, B:104:0x02a0, B:119:0x030e, B:120:0x0319, B:28:0x008d, B:75:0x01c9, B:31:0x009e, B:70:0x01ad, B:72:0x01b3, B:34:0x00ae, B:63:0x017e, B:65:0x0184, B:66:0x0191, B:37:0x00c4, B:57:0x0161, B:59:0x0167, B:67:0x0192, B:40:0x00d7, B:48:0x0119, B:50:0x011f, B:51:0x0137, B:54:0x0143, B:44:0x00ec), top: B:133:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0192 A[Catch: all -> 0x031a, CancellationException -> 0x0347, TryCatch #2 {CancellationException -> 0x0347, all -> 0x031a, blocks: (B:6:0x0012, B:118:0x0304, B:9:0x0023, B:115:0x02e5, B:12:0x002e, B:110:0x02cc, B:112:0x02d2, B:15:0x0041, B:103:0x0296, B:106:0x02a6, B:18:0x004c, B:98:0x027b, B:100:0x0281, B:22:0x005c, B:84:0x020b, B:86:0x0211, B:87:0x021e, B:25:0x0074, B:78:0x01ec, B:80:0x01f2, B:88:0x021f, B:90:0x022a, B:92:0x0234, B:94:0x023a, B:95:0x0257, B:104:0x02a0, B:119:0x030e, B:120:0x0319, B:28:0x008d, B:75:0x01c9, B:31:0x009e, B:70:0x01ad, B:72:0x01b3, B:34:0x00ae, B:63:0x017e, B:65:0x0184, B:66:0x0191, B:37:0x00c4, B:57:0x0161, B:59:0x0167, B:67:0x0192, B:40:0x00d7, B:48:0x0119, B:50:0x011f, B:51:0x0137, B:54:0x0143, B:44:0x00ec), top: B:133:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b3 A[Catch: all -> 0x031a, CancellationException -> 0x0347, TryCatch #2 {CancellationException -> 0x0347, all -> 0x031a, blocks: (B:6:0x0012, B:118:0x0304, B:9:0x0023, B:115:0x02e5, B:12:0x002e, B:110:0x02cc, B:112:0x02d2, B:15:0x0041, B:103:0x0296, B:106:0x02a6, B:18:0x004c, B:98:0x027b, B:100:0x0281, B:22:0x005c, B:84:0x020b, B:86:0x0211, B:87:0x021e, B:25:0x0074, B:78:0x01ec, B:80:0x01f2, B:88:0x021f, B:90:0x022a, B:92:0x0234, B:94:0x023a, B:95:0x0257, B:104:0x02a0, B:119:0x030e, B:120:0x0319, B:28:0x008d, B:75:0x01c9, B:31:0x009e, B:70:0x01ad, B:72:0x01b3, B:34:0x00ae, B:63:0x017e, B:65:0x0184, B:66:0x0191, B:37:0x00c4, B:57:0x0161, B:59:0x0167, B:67:0x0192, B:40:0x00d7, B:48:0x0119, B:50:0x011f, B:51:0x0137, B:54:0x0143, B:44:0x00ec), top: B:133:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f2 A[Catch: all -> 0x031a, CancellationException -> 0x0347, TryCatch #2 {CancellationException -> 0x0347, all -> 0x031a, blocks: (B:6:0x0012, B:118:0x0304, B:9:0x0023, B:115:0x02e5, B:12:0x002e, B:110:0x02cc, B:112:0x02d2, B:15:0x0041, B:103:0x0296, B:106:0x02a6, B:18:0x004c, B:98:0x027b, B:100:0x0281, B:22:0x005c, B:84:0x020b, B:86:0x0211, B:87:0x021e, B:25:0x0074, B:78:0x01ec, B:80:0x01f2, B:88:0x021f, B:90:0x022a, B:92:0x0234, B:94:0x023a, B:95:0x0257, B:104:0x02a0, B:119:0x030e, B:120:0x0319, B:28:0x008d, B:75:0x01c9, B:31:0x009e, B:70:0x01ad, B:72:0x01b3, B:34:0x00ae, B:63:0x017e, B:65:0x0184, B:66:0x0191, B:37:0x00c4, B:57:0x0161, B:59:0x0167, B:67:0x0192, B:40:0x00d7, B:48:0x0119, B:50:0x011f, B:51:0x0137, B:54:0x0143, B:44:0x00ec), top: B:133:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211 A[Catch: all -> 0x031a, CancellationException -> 0x0347, TryCatch #2 {CancellationException -> 0x0347, all -> 0x031a, blocks: (B:6:0x0012, B:118:0x0304, B:9:0x0023, B:115:0x02e5, B:12:0x002e, B:110:0x02cc, B:112:0x02d2, B:15:0x0041, B:103:0x0296, B:106:0x02a6, B:18:0x004c, B:98:0x027b, B:100:0x0281, B:22:0x005c, B:84:0x020b, B:86:0x0211, B:87:0x021e, B:25:0x0074, B:78:0x01ec, B:80:0x01f2, B:88:0x021f, B:90:0x022a, B:92:0x0234, B:94:0x023a, B:95:0x0257, B:104:0x02a0, B:119:0x030e, B:120:0x0319, B:28:0x008d, B:75:0x01c9, B:31:0x009e, B:70:0x01ad, B:72:0x01b3, B:34:0x00ae, B:63:0x017e, B:65:0x0184, B:66:0x0191, B:37:0x00c4, B:57:0x0161, B:59:0x0167, B:67:0x0192, B:40:0x00d7, B:48:0x0119, B:50:0x011f, B:51:0x0137, B:54:0x0143, B:44:0x00ec), top: B:133:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021f A[Catch: all -> 0x031a, CancellationException -> 0x0347, TryCatch #2 {CancellationException -> 0x0347, all -> 0x031a, blocks: (B:6:0x0012, B:118:0x0304, B:9:0x0023, B:115:0x02e5, B:12:0x002e, B:110:0x02cc, B:112:0x02d2, B:15:0x0041, B:103:0x0296, B:106:0x02a6, B:18:0x004c, B:98:0x027b, B:100:0x0281, B:22:0x005c, B:84:0x020b, B:86:0x0211, B:87:0x021e, B:25:0x0074, B:78:0x01ec, B:80:0x01f2, B:88:0x021f, B:90:0x022a, B:92:0x0234, B:94:0x023a, B:95:0x0257, B:104:0x02a0, B:119:0x030e, B:120:0x0319, B:28:0x008d, B:75:0x01c9, B:31:0x009e, B:70:0x01ad, B:72:0x01b3, B:34:0x00ae, B:63:0x017e, B:65:0x0184, B:66:0x0191, B:37:0x00c4, B:57:0x0161, B:59:0x0167, B:67:0x0192, B:40:0x00d7, B:48:0x0119, B:50:0x011f, B:51:0x0137, B:54:0x0143, B:44:0x00ec), top: B:133:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
