package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.d4;
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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B<\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0017ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R/\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u00178\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u000e\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/ironsource/b3;", "Lcom/ironsource/d4;", "Lcom/ironsource/o7;", t2.h.b, "", "a", "Lcom/ironsource/g7;", "error", "Lcom/ironsource/c5;", "Lcom/ironsource/c5;", "c", "()Lcom/ironsource/c5;", z4.c.f2475a, "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "()Ljava/lang/String;", "destinationPath", "Lcom/ironsource/c6;", "Lcom/ironsource/c6;", CampaignEx.JSON_KEY_AD_K, "()Lcom/ironsource/c6;", "downloadManager", "Lkotlin/Function1;", "Lkotlin/Result;", "d", "Lkotlin/jvm/functions/Function1;", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "()Lkotlin/jvm/functions/Function1;", "onFinish", "e", "Lcom/ironsource/o7;", "j", "()Lcom/ironsource/o7;", "(Lcom/ironsource/o7;)V", "<init>", "(Lcom/ironsource/c5;Ljava/lang/String;Lcom/ironsource/c6;Lkotlin/jvm/functions/Function1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class b3 implements d4<o7> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c5 fileUrl;

    /* renamed from: b, reason: from kotlin metadata */
    private final String destinationPath;

    /* renamed from: c, reason: from kotlin metadata */
    private final c6 downloadManager;

    /* renamed from: d, reason: from kotlin metadata */
    private final Function1<Result<? extends o7>, Unit> onFinish;

    /* renamed from: e, reason: from kotlin metadata */
    private o7 file;

    /* JADX WARN: Multi-variable type inference failed */
    public b3(c5 fileUrl, String destinationPath, c6 downloadManager, Function1<? super Result<? extends o7>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.fileUrl = fileUrl;
        this.destinationPath = destinationPath;
        this.downloadManager = downloadManager;
        this.onFinish = onFinish;
        this.file = new o7(getDestinationPath());
    }

    @Override // com.json.db
    public void a(o7 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Function1<Result<? extends o7>, Unit> function1I = i();
        Result.Companion companion = Result.INSTANCE;
        function1I.invoke(Result.m1061boximpl(Result.m1062constructorimpl(file)));
    }

    @Override // com.json.db
    public void a(o7 file, g7 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends o7>, Unit> function1I = i();
        Result.Companion companion = Result.INSTANCE;
        function1I.invoke(Result.m1061boximpl(Result.m1062constructorimpl(ResultKt.createFailure(new Exception("Unable to download mobileController.html: " + error.b())))));
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
    public Function1<Result<? extends o7>, Unit> i() {
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
