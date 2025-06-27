package com.json;

import android.util.Log;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.a3;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.sdk.utils.SDKUtils;
import com.json.t2;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BD\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012#\u0010\u0019\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b3\u00104J \u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0006\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R4\u0010\u0019\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00150\u00128\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001c\u0010%\u001a\n \"*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/ironsource/c3;", "Lcom/ironsource/z5;", "Lkotlin/Result;", "Lorg/json/JSONObject;", "result", "", "a", "(Ljava/lang/Object;)V", "", "version", "Lcom/ironsource/b3;", "Lcom/ironsource/o7;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, t2.h.b, "", "Lcom/ironsource/z2;", "Lcom/ironsource/z2;", "config", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "Lkotlin/jvm/functions/Function1;", "c", "()Lkotlin/jvm/functions/Function1;", "onFinish", "Lcom/ironsource/c6;", "Lcom/ironsource/c6;", "downloadManager", "Lcom/ironsource/od;", "d", "Lcom/ironsource/od;", "()Lcom/ironsource/od;", "time", "kotlin.jvm.PlatformType", "e", "Ljava/lang/String;", "TAG", "f", "Lcom/ironsource/o7;", "htmlFile", "", "g", "J", "mLoadControllerStartTime", "Lcom/ironsource/kb;", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "Lcom/ironsource/kb;", "rootFolder", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "htmlBuildNumber", "<init>", "(Lcom/ironsource/z2;Lkotlin/jvm/functions/Function1;Lcom/ironsource/c6;Lcom/ironsource/od;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class c3 implements z5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z2 config;

    /* renamed from: b, reason: from kotlin metadata */
    private final Function1<o7, Object> onFinish;

    /* renamed from: c, reason: from kotlin metadata */
    private final c6 downloadManager;

    /* renamed from: d, reason: from kotlin metadata */
    private final od time;

    /* renamed from: e, reason: from kotlin metadata */
    private final String TAG;

    /* renamed from: f, reason: from kotlin metadata */
    private o7 htmlFile;

    /* renamed from: g, reason: from kotlin metadata */
    private long mLoadControllerStartTime;

    /* renamed from: h, reason: from kotlin metadata */
    private final kb rootFolder;

    /* renamed from: i, reason: from kotlin metadata */
    private String htmlBuildNumber;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Result<? extends o7>, Unit> {
        a(Object obj) {
            super(1, obj, c3.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((c3) this.receiver).b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends o7> result) {
            a(result.getValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Result<? extends JSONObject>, Unit> {
        b(Object obj) {
            super(1, obj, c3.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) throws JSONException {
            ((c3) this.receiver).a(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends JSONObject> result) throws JSONException {
            a(result.getValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c3(z2 config, Function1<? super o7, ? extends Object> onFinish, c6 downloadManager, od time) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(time, "time");
        this.config = config;
        this.onFinish = onFinish;
        this.downloadManager = downloadManager;
        this.time = time;
        this.TAG = "c3";
        this.htmlFile = new o7(config.getCacheFolder(), "mobileController_0.html");
        this.mLoadControllerStartTime = time.a();
        this.rootFolder = new kb(config.getControllerUrl());
        this.htmlBuildNumber = "";
    }

    private final b3 a(String version) {
        return new b3(new de(this.rootFolder, version), this.config.getCacheFolder() + "/mobileController_" + version + ".html", this.downloadManager, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object result) throws JSONException {
        b3 b3VarA;
        if (Result.m1068isFailureimpl(result)) {
            result = null;
        }
        JSONObject jSONObject = (JSONObject) result;
        if (jSONObject == null || Intrinsics.areEqual(jSONObject.optString("htmlBuildNumber"), "")) {
            b3VarA = a("0");
        } else {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            Intrinsics.checkNotNullExpressionValue(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.htmlBuildNumber = string;
            b3VarA = a(string);
            if (b3VarA.h()) {
                o7 file = b3VarA.getCom.ironsource.t2.h.b java.lang.String();
                this.htmlFile = file;
                this.onFinish.invoke(file);
                return;
            }
        }
        b3VarA.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object result) {
        if (Result.m1069isSuccessimpl(result)) {
            o7 o7Var = (o7) (Result.m1068isFailureimpl(result) ? null : result);
            if (!Intrinsics.areEqual(o7Var != null ? o7Var.getAbsolutePath() : null, this.htmlFile.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.htmlFile);
                    Intrinsics.checkNotNull(o7Var);
                    FilesKt.copyTo$default(o7Var, this.htmlFile, true, 0, 4, null);
                } catch (Exception e) {
                    Log.e(this.TAG, "Unable to copy downloaded mobileController.html to cache folder: " + e.getMessage());
                }
                Intrinsics.checkNotNull(o7Var);
                this.htmlFile = o7Var;
            }
            new a3.b(this.config.getShouldUseVersionedFlow(), this.mLoadControllerStartTime, this.time).a();
        } else {
            new a3.a(this.config.getShouldUseVersionedFlow()).a();
        }
        Function1<o7, Object> function1 = this.onFinish;
        if (Result.m1068isFailureimpl(result)) {
            result = null;
        }
        function1.invoke(result);
    }

    @Override // com.json.z5
    public void a() {
        this.mLoadControllerStartTime = this.time.a();
        new c(new d(this.rootFolder), this.config.getCacheFolder() + "/temp", this.downloadManager, new b(this)).l();
    }

    @Override // com.json.z5
    public boolean a(o7 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").matches(name);
    }

    @Override // com.json.z5
    /* renamed from: b, reason: from getter */
    public o7 getHtmlFile() {
        return this.htmlFile;
    }

    public final Function1<o7, Object> c() {
        return this.onFinish;
    }

    /* renamed from: d, reason: from getter */
    public final od getTime() {
        return this.time;
    }
}
