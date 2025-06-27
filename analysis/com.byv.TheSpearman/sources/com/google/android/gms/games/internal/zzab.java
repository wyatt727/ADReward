package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.firebase.FirebaseError;
import com.json.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzab extends com.google.android.gms.internal.games.zza implements zzy {
    public zzab() {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
    }

    @Override // com.google.android.gms.internal.games.zza
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 6001) {
            zze(parcel.readString());
        } else if (i == 6002) {
            zzf(parcel.readString());
        } else if (i == 12011) {
            zzb((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
        } else if (i == 12012) {
            zze(parcel.readInt(), parcel.readString());
        } else if (i == 13001) {
            zzan((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
        } else if (i == 13002) {
            zzd(parcel.readInt());
        } else if (i == 19001) {
            zza(parcel.readInt(), (VideoCapabilities) com.google.android.gms.internal.games.zzd.zza(parcel, VideoCapabilities.CREATOR));
        } else if (i != 19002) {
            switch (i) {
                case 5001:
                    zza(parcel.readInt(), parcel.readString());
                    break;
                case 5002:
                    zza((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                    break;
                case IronSourceConstants.errorCode_loadInProgress /* 5003 */:
                    zzb(parcel.readInt(), parcel.readString());
                    break;
                case IronSourceConstants.errorCode_showInProgress /* 5004 */:
                    zzc((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                    break;
                case IronSourceConstants.errorCode_loadException /* 5005 */:
                    zza((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR), (DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                    break;
                case IronSourceConstants.errorCode_showFailed /* 5006 */:
                    zzd((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                    break;
                case IronSourceConstants.errorCode_initSuccess /* 5007 */:
                    zze((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                    break;
                case IronSourceConstants.errorCode_initFailed /* 5008 */:
                    zzf((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                    break;
                case IronSourceConstants.errorCode_adClosed /* 5009 */:
                    zzg((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                    break;
                case IronSourceConstants.errorCode_destroy /* 5010 */:
                    zzh((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                    break;
                case IronSourceConstants.errorCode_internal /* 5011 */:
                    zzi((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                    break;
                default:
                    switch (i) {
                        case 5016:
                            onSignOutComplete();
                            break;
                        case 5017:
                            zzk((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5018:
                            zzs((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5019:
                            zzt((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5020:
                            zzd(parcel.readInt(), parcel.readString());
                            break;
                        case 5021:
                            zzu((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5022:
                            zzv((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5023:
                            zzw((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5024:
                            zzx((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5025:
                            zzy((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5026:
                            zza((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5027:
                            zzb((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5028:
                            zzc((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5029:
                            zzd((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5030:
                            zze((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5031:
                            zzf((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR), parcel.createStringArray());
                            break;
                        case 5032:
                            zza((com.google.android.gms.games.multiplayer.realtime.zzb) com.google.android.gms.internal.games.zzd.zza(parcel, com.google.android.gms.games.multiplayer.realtime.zzb.CREATOR));
                            break;
                        case 5033:
                            zza(parcel.readInt(), parcel.readInt(), parcel.readString());
                            break;
                        case 5034:
                            zza(parcel.readInt(), parcel.readString(), com.google.android.gms.internal.games.zzd.zza(parcel));
                            break;
                        case 5035:
                            zzaa((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5036:
                            zzb(parcel.readInt());
                            break;
                        case 5037:
                            zzl((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5038:
                            zzz((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5039:
                            zzab((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 5040:
                            zzc(parcel.readInt());
                            break;
                        case 9001:
                            zzj((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 11001:
                            zzc(parcel.readInt(), (Bundle) com.google.android.gms.internal.games.zzd.zza(parcel, Bundle.CREATOR));
                            break;
                        case 12001:
                            zzag((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 14001:
                            zza((DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR));
                            break;
                        case 15001:
                            zzao((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case FirebaseError.ERROR_CUSTOM_TOKEN_MISMATCH /* 17002 */:
                            zze(parcel.readInt());
                            break;
                        case 19008:
                            zzf(parcel.readInt());
                            break;
                        case 19009:
                            zzg(parcel.readInt());
                            break;
                        case 19010:
                            zzh(parcel.readInt());
                            break;
                        case AD_SERVER_ERROR_VALUE:
                            zzap((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 20002:
                            zzaq((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 20003:
                            zzar((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 20004:
                            zzas((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 20005:
                            zzat((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 20006:
                            zzau((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 20007:
                            zzav((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 20008:
                            zzaw((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 20009:
                            zzax((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                            break;
                        case 20012:
                            zzb((Status) com.google.android.gms.internal.games.zzd.zza(parcel, Status.CREATOR));
                            break;
                        case 20019:
                            onCaptureOverlayStateChanged(parcel.readInt());
                            break;
                        case 20020:
                            zze(parcel.readInt(), (Bundle) com.google.android.gms.internal.games.zzd.zza(parcel, Bundle.CREATOR));
                            break;
                        case 23001:
                            zzm(parcel.readInt());
                            break;
                        case 23002:
                            zzi(parcel.readInt());
                            break;
                        case 23003:
                            zzj(parcel.readInt());
                            break;
                        case 23004:
                            zzk(parcel.readInt());
                            break;
                        case 23005:
                            zzl(parcel.readInt());
                            break;
                        case 24002:
                            zza(com.google.android.gms.internal.games.zzd.zza(parcel));
                            break;
                        case 25002:
                            zzg(parcel.readString());
                            break;
                        case 25003:
                            zza((Status) com.google.android.gms.internal.games.zzd.zza(parcel, Status.CREATOR), parcel.readString());
                            break;
                        default:
                            switch (i) {
                                case 8001:
                                    zzac((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                    break;
                                case 8002:
                                    zza(parcel.readInt(), (Bundle) com.google.android.gms.internal.games.zzd.zza(parcel, Bundle.CREATOR));
                                    break;
                                case 8003:
                                    zzn((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                    break;
                                case ConnectionsStatusCodes.STATUS_CONNECTION_REJECTED /* 8004 */:
                                    zzo((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                    break;
                                case ConnectionsStatusCodes.STATUS_NOT_CONNECTED_TO_ENDPOINT /* 8005 */:
                                    zzp((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                    break;
                                case 8006:
                                    zzq((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                    break;
                                case 8007:
                                    zzc(parcel.readInt(), parcel.readString());
                                    break;
                                case ConnectionsStatusCodes.STATUS_ALREADY_HAVE_ACTIVE_STRATEGY /* 8008 */:
                                    zzr((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                    break;
                                case ConnectionsStatusCodes.STATUS_OUT_OF_ORDER_API_CALL /* 8009 */:
                                    zzd(parcel.readString());
                                    break;
                                case 8010:
                                    zzb(parcel.readString());
                                    break;
                                default:
                                    switch (i) {
                                        case 10001:
                                            zzm((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                            break;
                                        case 10002:
                                            zzc(parcel.readString());
                                            break;
                                        case 10003:
                                            zzad((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                            break;
                                        case GamesActivityResultCodes.RESULT_APP_MISCONFIGURED /* 10004 */:
                                            zzae((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                            break;
                                        case 10005:
                                            zzb(parcel.readInt(), (Bundle) com.google.android.gms.internal.games.zzd.zza(parcel, Bundle.CREATOR));
                                            break;
                                        case GamesActivityResultCodes.RESULT_NETWORK_FAILURE /* 10006 */:
                                            zzaf((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                            break;
                                        default:
                                            switch (i) {
                                                case 12004:
                                                    zza((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR), (Contents) com.google.android.gms.internal.games.zzd.zza(parcel, Contents.CREATOR));
                                                    break;
                                                case 12005:
                                                    zzah((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                                    break;
                                                case 12006:
                                                    zzai((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                                    break;
                                                case 12007:
                                                    zzaj((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                                    break;
                                                case 12008:
                                                    zzam((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 12014:
                                                            zzak((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                                            break;
                                                        case 12015:
                                                            zzd(parcel.readInt(), (Bundle) com.google.android.gms.internal.games.zzd.zza(parcel, Bundle.CREATOR));
                                                            break;
                                                        case 12016:
                                                            zzal((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR));
                                                            break;
                                                        case 12017:
                                                            zza((DataHolder) com.google.android.gms.internal.games.zzd.zza(parcel, DataHolder.CREATOR), parcel.readString(), (Contents) com.google.android.gms.internal.games.zzd.zza(parcel, Contents.CREATOR), (Contents) com.google.android.gms.internal.games.zzd.zza(parcel, Contents.CREATOR), (Contents) com.google.android.gms.internal.games.zzd.zza(parcel, Contents.CREATOR));
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            zza(parcel.readInt(), com.google.android.gms.internal.games.zzd.zza(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
