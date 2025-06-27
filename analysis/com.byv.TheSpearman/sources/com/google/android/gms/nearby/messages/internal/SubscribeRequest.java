package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new zzcc();
    final int zza;
    public final zzo zzb;
    public final Strategy zzc;
    public final zzr zzd;
    public final MessageFilter zze;
    public final PendingIntent zzf;

    @Deprecated
    public final int zzg;

    @Deprecated
    public final String zzh;

    @Deprecated
    public final String zzi;
    public final byte[] zzj;

    @Deprecated
    public final boolean zzk;
    public final zzab zzl;

    @Deprecated
    public final boolean zzm;

    @Deprecated
    public final ClientAppContext zzn;
    public final boolean zzo;
    public final int zzp;
    public final int zzq;

    public SubscribeRequest(int i, IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i2, String str, String str2, byte[] bArr, boolean z, IBinder iBinder3, boolean z2, ClientAppContext clientAppContext, boolean z3, int i3, int i4) {
        zzo zzmVar;
        zzr zzpVar;
        this.zza = i;
        zzab zzzVar = null;
        if (iBinder == null) {
            zzmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            zzmVar = iInterfaceQueryLocalInterface instanceof zzo ? (zzo) iInterfaceQueryLocalInterface : new zzm(iBinder);
        }
        this.zzb = zzmVar;
        this.zzc = strategy;
        if (iBinder2 == null) {
            zzpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface2 instanceof zzr ? (zzr) iInterfaceQueryLocalInterface2 : new zzp(iBinder2);
        }
        this.zzd = zzpVar;
        this.zze = messageFilter;
        this.zzf = pendingIntent;
        this.zzg = i2;
        this.zzh = str;
        this.zzi = str2;
        this.zzj = bArr;
        this.zzk = z;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            zzzVar = iInterfaceQueryLocalInterface3 instanceof zzab ? (zzab) iInterfaceQueryLocalInterface3 : new zzz(iBinder3);
        }
        this.zzl = zzzVar;
        this.zzm = z2;
        this.zzn = ClientAppContext.zza(clientAppContext, str2, str, z2);
        this.zzo = z3;
        this.zzp = i3;
        this.zzq = i4;
    }

    public final String toString() {
        String string;
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzc);
        String strValueOf3 = String.valueOf(this.zzd);
        String strValueOf4 = String.valueOf(this.zze);
        String strValueOf5 = String.valueOf(this.zzf);
        byte[] bArr = this.zzj;
        if (bArr == null) {
            string = null;
        } else {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(19);
            sb.append("<");
            sb.append(length);
            sb.append(" bytes>");
            string = sb.toString();
        }
        String strValueOf6 = String.valueOf(this.zzl);
        boolean z = this.zzm;
        String strValueOf7 = String.valueOf(this.zzn);
        boolean z2 = this.zzo;
        String str = this.zzh;
        String str2 = this.zzi;
        boolean z3 = this.zzk;
        int i = this.zzq;
        int length2 = String.valueOf(strValueOf).length();
        int length3 = String.valueOf(strValueOf2).length();
        int length4 = String.valueOf(strValueOf3).length();
        int length5 = String.valueOf(strValueOf4).length();
        int length6 = String.valueOf(strValueOf5).length();
        int length7 = String.valueOf(string).length();
        int length8 = String.valueOf(strValueOf6).length();
        int length9 = String.valueOf(strValueOf7).length();
        StringBuilder sb2 = new StringBuilder(length2 + 291 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb2.append("SubscribeRequest{messageListener=");
        sb2.append(strValueOf);
        sb2.append(", strategy=");
        sb2.append(strValueOf2);
        sb2.append(", callback=");
        sb2.append(strValueOf3);
        sb2.append(", filter=");
        sb2.append(strValueOf4);
        sb2.append(", pendingIntent=");
        sb2.append(strValueOf5);
        sb2.append(", hint=");
        sb2.append(string);
        sb2.append(", subscribeCallback=");
        sb2.append(strValueOf6);
        sb2.append(", useRealClientApiKey=");
        sb2.append(z);
        sb2.append(", clientAppContext=");
        sb2.append(strValueOf7);
        sb2.append(", isDiscardPendingIntent=");
        sb2.append(z2);
        sb2.append(", zeroPartyPackageName=");
        sb2.append(str);
        sb2.append(", realClientPackageName=");
        sb2.append(str2);
        sb2.append(", isIgnoreNearbyPermission=");
        sb2.append(z3);
        sb2.append(", callingContext=");
        sb2.append(i);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        zzo zzoVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzoVar == null ? null : zzoVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        zzr zzrVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 4, zzrVar == null ? null : zzrVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeByteArray(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        zzab zzabVar = this.zzl;
        SafeParcelWriter.writeIBinder(parcel, 12, zzabVar != null ? zzabVar.asBinder() : null, false);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzn, i, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzo);
        SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        SafeParcelWriter.writeInt(parcel, 17, this.zzq);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, byte[] bArr, IBinder iBinder3, boolean z, int i, int i2) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, 0, null, null, null, false, iBinder3, false, null, false, 0, i2);
    }
}
