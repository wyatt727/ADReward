package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzl extends zzaz {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzaz;
    private final Set<Integer> zzba;
    private ArrayList<zzr> zzbb;
    private int zzbc;
    private zzo zzbd;
    private final int zzv;

    zzl(Set<Integer> set, int i, ArrayList<zzr> arrayList, int i2, zzo zzoVar) {
        this.zzba = set;
        this.zzv = i;
        this.zzbb = arrayList;
        this.zzbc = i2;
        this.zzbd = zzoVar;
    }

    public zzl() {
        this.zzba = new HashSet(1);
        this.zzv = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set<Integer> set = this.zzba;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeTypedList(parcel, 2, this.zzbb, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.zzbc);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeParcelable(parcel, 4, this.zzbd, i, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zzba.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return Integer.valueOf(this.zzv);
        }
        if (safeParcelableFieldId == 2) {
            return this.zzbb;
        }
        if (safeParcelableFieldId == 4) {
            return this.zzbd;
        }
        int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(safeParcelableFieldId2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<T> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbb = arrayList;
            this.zzba.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> field, String str, T t) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.zzbd = (zzo) t;
            this.zzba.add(Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(safeParcelableFieldId), t.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return zzaz;
    }

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> map = new HashMap<>();
        zzaz = map;
        map.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, zzr.class));
        map.put("progress", FastJsonResponse.Field.forConcreteType("progress", 4, zzo.class));
    }
}
