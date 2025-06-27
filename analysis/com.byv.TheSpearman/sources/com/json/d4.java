package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.ads.RequestConfiguration;
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

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R8\u0010\u001f\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00030\u00188&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/ironsource/d4;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/ironsource/db;", "", CmcdHeadersFactory.STREAM_TYPE_LIVE, "", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "Lcom/ironsource/c5;", "c", "()Lcom/ironsource/c5;", z4.c.f2475a, "Lcom/ironsource/o7;", "j", "()Lcom/ironsource/o7;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Lcom/ironsource/o7;)V", t2.h.b, "", "()Ljava/lang/String;", "destinationPath", "Lcom/ironsource/c6;", CampaignEx.JSON_KEY_AD_K, "()Lcom/ironsource/c6;", "downloadManager", "Lkotlin/Function1;", "Lkotlin/Result;", "Lkotlin/ParameterName;", "name", "result", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "()Lkotlin/jvm/functions/Function1;", "onFinish", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface d4<T> extends db {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <T> void a(d4<T> d4Var) {
            d4Var.k().a(d4Var);
            if (d4Var.j().exists()) {
                IronSourceStorageUtils.deleteFile(d4Var.j());
            }
            try {
                d4Var.k().a(d4Var.j(), d4Var.c().value(), 5, 5);
            } catch (Exception e) {
                Function1<Result<? extends T>, Unit> function1I = d4Var.i();
                Result.Companion companion = Result.INSTANCE;
                function1I.invoke(Result.m1061boximpl(Result.m1062constructorimpl(ResultKt.createFailure(e))));
            }
        }

        public static <T> boolean b(d4<T> d4Var) {
            return d4Var.j().exists();
        }
    }

    String b();

    void b(o7 o7Var);

    c5 c();

    boolean h();

    Function1<Result<? extends T>, Unit> i();

    o7 j();

    c6 k();

    void l();
}
