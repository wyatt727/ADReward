package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.d4;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.t2;
import com.json.z4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B<\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0018ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R/\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b\u000f\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/ironsource/c;", "Lcom/ironsource/d4;", "Lorg/json/JSONObject;", "Lcom/ironsource/o7;", t2.h.b, "c", "", "a", "Lcom/ironsource/g7;", "error", "Lcom/ironsource/c5;", "Lcom/ironsource/c5;", "()Lcom/ironsource/c5;", z4.c.f2475a, "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "()Ljava/lang/String;", "destinationPath", "Lcom/ironsource/c6;", "Lcom/ironsource/c6;", CampaignEx.JSON_KEY_AD_K, "()Lcom/ironsource/c6;", "downloadManager", "Lkotlin/Function1;", "Lkotlin/Result;", "d", "Lkotlin/jvm/functions/Function1;", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "()Lkotlin/jvm/functions/Function1;", "onFinish", "e", "Lcom/ironsource/o7;", "j", "()Lcom/ironsource/o7;", "(Lcom/ironsource/o7;)V", "<init>", "(Lcom/ironsource/c5;Ljava/lang/String;Lcom/ironsource/c6;Lkotlin/jvm/functions/Function1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class c implements d4<JSONObject> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c5 fileUrl;

    /* renamed from: b, reason: from kotlin metadata */
    private final String destinationPath;

    /* renamed from: c, reason: from kotlin metadata */
    private final c6 downloadManager;

    /* renamed from: d, reason: from kotlin metadata */
    private final Function1<Result<? extends JSONObject>, Unit> onFinish;

    /* renamed from: e, reason: from kotlin metadata */
    private o7 file;

    /* JADX WARN: Multi-variable type inference failed */
    public c(c5 fileUrl, String destinationPath, c6 downloadManager, Function1<? super Result<? extends JSONObject>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.fileUrl = fileUrl;
        this.destinationPath = destinationPath;
        this.downloadManager = downloadManager;
        this.onFinish = onFinish;
        this.file = new o7(getDestinationPath(), t2.i);
    }

    private final JSONObject c(o7 file) {
        return new JSONObject(IronSourceStorageUtils.readFile(file));
    }

    @Override // com.json.db
    public void a(o7 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Intrinsics.areEqual(file.getName(), t2.i)) {
            try {
                JSONObject jSONObjectC = c(file);
                Function1<Result<? extends JSONObject>, Unit> function1I = i();
                Result.Companion companion = Result.INSTANCE;
                function1I.invoke(Result.m1061boximpl(Result.m1062constructorimpl(jSONObjectC)));
            } catch (Exception e) {
                Function1<Result<? extends JSONObject>, Unit> function1I2 = i();
                Result.Companion companion2 = Result.INSTANCE;
                function1I2.invoke(Result.m1061boximpl(Result.m1062constructorimpl(ResultKt.createFailure(e))));
            }
        }
    }

    @Override // com.json.db
    public void a(o7 file, g7 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends JSONObject>, Unit> function1I = i();
        Result.Companion companion = Result.INSTANCE;
        function1I.invoke(Result.m1061boximpl(Result.m1062constructorimpl(ResultKt.createFailure(new Exception("Unable to download abTestMap.json: " + error.b())))));
    }

    @Override // com.json.d4
    /* renamed from: b, reason: from getter */
    public String getDestinationPath() {
        return this.destinationPath;
    }

    @Override // com.json.d4
    public void b(o7 o7Var) {
        Intrinsics.checkNotNullParameter(o7Var, "<set-?>");
        this.file = o7Var;
    }

    @Override // com.json.d4
    /* renamed from: c, reason: from getter */
    public c5 getFileUrl() {
        return this.fileUrl;
    }

    @Override // com.json.d4
    public boolean h() {
        return d4.a.b(this);
    }

    @Override // com.json.d4
    public Function1<Result<? extends JSONObject>, Unit> i() {
        return this.onFinish;
    }

    @Override // com.json.d4
    /* renamed from: j, reason: from getter */
    public o7 getFile() {
        return this.file;
    }

    @Override // com.json.d4
    /* renamed from: k, reason: from getter */
    public c6 getDownloadManager() {
        return this.downloadManager;
    }

    @Override // com.json.d4
    public void l() {
        d4.a.a(this);
    }
}
