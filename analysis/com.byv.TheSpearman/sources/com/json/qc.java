package com.json;

import com.json.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/ironsource/qc;", "", "", "a", "Lcom/ironsource/e5;", "Lcom/ironsource/e5;", "calculator", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private e5 calculator;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ironsource/qc$a;", "Lcom/ironsource/pc;", "", "run", "<init>", "(Lcom/ironsource/qc;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    private final class a extends pc {
        public a() {
        }

        @Override // com.json.pc, java.lang.Runnable
        public void run() throws JSONException {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put("duration", getTimeInForeground());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            lb.P.a(new l4(44, mediationAdditionalData));
        }
    }

    public final void a() {
        this.calculator = new e5(new a());
    }
}
