package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzawn extends zzawm {
    protected zzawn(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzawn zzt(String str, Context context, boolean z) {
        zzr(context, false);
        return new zzawn(context, str, false);
    }

    @Deprecated
    public static zzawn zzu(String str, Context context, boolean z, int i) {
        zzr(context, z);
        return new zzawn(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzawm
    protected final List zzp(zzaxp zzaxpVar, Context context, zzata zzataVar, zzasr zzasrVar) {
        if (zzaxpVar.zzk() == null || !this.zzu) {
            return super.zzp(zzaxpVar, context, zzataVar, null);
        }
        int iZza = zzaxpVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzp(zzaxpVar, context, zzataVar, null));
        arrayList.add(new zzayh(zzaxpVar, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", zzataVar, iZza, 24));
        return arrayList;
    }
}
