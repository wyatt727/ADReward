package com.json.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.json.OpenUrl;
import com.json.OpenUrlConfigurations;
import com.json.g;
import com.json.h;
import com.json.sdk.controller.OpenUrlActivity;
import com.json.sdk.controller.k;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0007\b\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/ironsource/sdk/controller/p;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/gb;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface p {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ironsource/sdk/controller/p$a;", "Lcom/ironsource/sdk/controller/p;", "Landroid/content/Context;", "context", "Lcom/ironsource/gb;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "Lcom/ironsource/sdk/controller/p$b;", "Lcom/ironsource/sdk/controller/p$b;", "openUrlStrategy", "", "method", "Lcom/ironsource/hb;", "openUrlConfigurations", "Lcom/ironsource/h;", "activityIntentFactory", "Lcom/ironsource/g;", "actionIntentFactory", "<init>", "(Ljava/lang/String;Lcom/ironsource/hb;Lcom/ironsource/h;Lcom/ironsource/g;)V", "(Ljava/lang/String;Lcom/ironsource/hb;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private b openUrlStrategy;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String method, OpenUrlConfigurations openUrlConfigurations) {
            this(method, openUrlConfigurations, new k.b(), new k.a());
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.String r3, com.json.OpenUrlConfigurations r4, com.json.h r5, com.json.g r6) {
            /*
                r2 = this;
                java.lang.String r0 = "method"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "openUrlConfigurations"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "activityIntentFactory"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "actionIntentFactory"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r2.<init>()
                int r0 = r3.hashCode()
                r1 = -1455867212(0xffffffffa9393ab4, float:-4.112917E-14)
                if (r0 == r1) goto L49
                r6 = 109770977(0x68af8e1, float:5.2275525E-35)
                if (r0 == r6) goto L3a
                r6 = 1224424441(0x48fb3bf9, float:514527.78)
                if (r0 == r6) goto L2b
                goto L57
            L2b:
                java.lang.String r6 = "webview"
                boolean r6 = r3.equals(r6)
                if (r6 != 0) goto L34
                goto L57
            L34:
                com.ironsource.sdk.controller.p$b$d r3 = new com.ironsource.sdk.controller.p$b$d
                r3.<init>(r4, r5)
                goto L5d
            L3a:
                java.lang.String r6 = "store"
                boolean r6 = r3.equals(r6)
                if (r6 != 0) goto L43
                goto L57
            L43:
                com.ironsource.sdk.controller.p$b$c r3 = new com.ironsource.sdk.controller.p$b$c
                r3.<init>(r4, r5)
                goto L5d
            L49:
                java.lang.String r5 = "external_browser"
                boolean r5 = r3.equals(r5)
                if (r5 == 0) goto L57
                com.ironsource.sdk.controller.p$b$a r3 = new com.ironsource.sdk.controller.p$b$a
                r3.<init>(r4, r6)
                goto L5d
            L57:
                com.ironsource.sdk.controller.p$b$b r4 = new com.ironsource.sdk.controller.p$b$b
                r4.<init>(r3)
                r3 = r4
            L5d:
                r2.openUrlStrategy = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.p.a.<init>(java.lang.String, com.ironsource.hb, com.ironsource.h, com.ironsource.g):void");
        }

        @Override // com.json.sdk.controller.p
        public c a(Context context, OpenUrl openUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(openUrl, "openUrl");
            try {
                return this.openUrlStrategy.a(context, openUrl);
            } catch (Exception e) {
                String message = e.getMessage();
                String message2 = message == null || message.length() == 0 ? "" : e.getMessage();
                Intrinsics.checkNotNull(message2);
                return new c.Error(message2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u000b"}, d2 = {"Lcom/ironsource/sdk/controller/p$b;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/gb;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$a;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/gb;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "Lcom/ironsource/hb;", "Lcom/ironsource/hb;", com.json.mediationsdk.d.j, "Lcom/ironsource/g;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/g;", "intentFactory", "<init>", "(Lcom/ironsource/hb;Lcom/ironsource/g;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final OpenUrlConfigurations configurations;

            /* renamed from: b, reason: from kotlin metadata */
            private final g intentFactory;

            public a(OpenUrlConfigurations configurations, g intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.configurations = configurations;
                this.intentFactory = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, OpenUrl openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.d())) {
                    return new c.Error("url is empty");
                }
                Intent intentA = this.intentFactory.a();
                intentA.setData(Uri.parse(openUrl.d()));
                String strC = openUrl.c();
                if (!(strC == null || strC.length() == 0)) {
                    intentA = intentA.setPackage(openUrl.c());
                    Intrinsics.checkNotNullExpressionValue(intentA, "this.setPackage(\n       …                        )");
                }
                if (!(context instanceof Activity)) {
                    intentA = intentA.addFlags(this.configurations.c());
                }
                Intrinsics.checkNotNullExpressionValue(intentA, "intentFactory.create()\n …ations.flags) else this }");
                context.startActivity(intentA);
                return c.b.f2214a;
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$b;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/gb;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "", "Ljava/lang/String;", "method", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C0246b implements b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String method;

            public C0246b(String method) {
                Intrinsics.checkNotNullParameter(method, "method");
                this.method = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, OpenUrl openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                return new c.Error("method " + this.method + " is unsupported");
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$c;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/gb;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "Lcom/ironsource/hb;", "Lcom/ironsource/hb;", com.json.mediationsdk.d.j, "Lcom/ironsource/h;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/h;", "intentFactory", "<init>", "(Lcom/ironsource/hb;Lcom/ironsource/h;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final OpenUrlConfigurations configurations;

            /* renamed from: b, reason: from kotlin metadata */
            private final h intentFactory;

            public c(OpenUrlConfigurations configurations, h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.configurations = configurations;
                this.intentFactory = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, OpenUrl openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.intentFactory).a(this.configurations.c()).a(openUrl.d()).b(true).c(true).a(context));
                return c.b.f2214a;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$d;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/gb;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "Lcom/ironsource/hb;", "Lcom/ironsource/hb;", com.json.mediationsdk.d.j, "Lcom/ironsource/h;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/h;", "intentFactory", "<init>", "(Lcom/ironsource/hb;Lcom/ironsource/h;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class d implements b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final OpenUrlConfigurations configurations;

            /* renamed from: b, reason: from kotlin metadata */
            private final h intentFactory;

            public d(OpenUrlConfigurations configurations, h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.configurations = configurations;
                this.intentFactory = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, OpenUrl openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.intentFactory).a(this.configurations.c()).a(openUrl.d()).a(this.configurations.d()).b(true).a(context));
                return c.b.f2214a;
            }
        }

        c a(Context context, OpenUrl openUrl);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/sdk/controller/p$c;", "", "<init>", "()V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/sdk/controller/p$c$a;", "Lcom/ironsource/sdk/controller/p$c$b;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class c {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$c$a;", "Lcom/ironsource/sdk/controller/p$c;", "", "a", "errorMessage", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: com.ironsource.sdk.controller.p$c$a, reason: from toString */
        public static final /* data */ class Error extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String errorMessage;

            /* JADX WARN: Multi-variable type inference failed */
            public Error() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.errorMessage = errorMessage;
            }

            public /* synthetic */ Error(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ Error a(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.errorMessage;
                }
                return error.a(str);
            }

            public final Error a(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new Error(errorMessage);
            }

            /* renamed from: a, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final String b() {
                return this.errorMessage;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.errorMessage, ((Error) other).errorMessage);
            }

            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.errorMessage + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/sdk/controller/p$c$b;", "Lcom/ironsource/sdk/controller/p$c;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f2214a = new b();

            private b() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    c a(Context context, OpenUrl openUrl);
}
