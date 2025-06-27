package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafd implements zzaev {
    public final zzfzn zza;
    private final int zzb;

    private zzafd(int i, zzfzn zzfznVar) {
        this.zzb = i;
        this.zza = zzfznVar;
    }

    public static zzafd zzc(int i, zzfo zzfoVar) {
        String str;
        zzfzk zzfzkVar = new zzfzk();
        int iZze = zzfoVar.zze();
        int i2 = -2;
        while (zzfoVar.zzb() > 8) {
            int iZzi = zzfoVar.zzi();
            int iZzd = zzfoVar.zzd() + zzfoVar.zzi();
            zzfoVar.zzJ(iZzd);
            zzaev zzafeVar = null;
            if (iZzi != 1414744396) {
                switch (iZzi) {
                    case AviExtractor.FOURCC_strf /* 1718776947 */:
                        if (i2 != 2) {
                            if (i2 != 1) {
                                zzfe.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfx.zzC(i2)));
                                break;
                            } else {
                                int iZzk = zzfoVar.zzk();
                                String str2 = iZzk != 1 ? iZzk != 85 ? iZzk != 255 ? iZzk != 8192 ? iZzk != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iZzk2 = zzfoVar.zzk();
                                    int iZzi2 = zzfoVar.zzi();
                                    zzfoVar.zzL(6);
                                    int iZzl = zzfx.zzl(zzfoVar.zzq());
                                    int iZzk3 = zzfoVar.zzk();
                                    byte[] bArr = new byte[iZzk3];
                                    zzfoVar.zzG(bArr, 0, iZzk3);
                                    zzak zzakVar = new zzak();
                                    zzakVar.zzW(str2);
                                    zzakVar.zzy(iZzk2);
                                    zzakVar.zzX(iZzi2);
                                    if ("audio/raw".equals(str2) && iZzl != 0) {
                                        zzakVar.zzQ(iZzl);
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && iZzk3 > 0) {
                                        zzakVar.zzL(zzfzn.zzn(bArr));
                                    }
                                    zzafeVar = new zzafe(zzakVar.zzac());
                                    break;
                                } else {
                                    zzfe.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + iZzk);
                                    break;
                                }
                            }
                        } else {
                            zzfoVar.zzL(4);
                            int iZzi3 = zzfoVar.zzi();
                            int iZzi4 = zzfoVar.zzi();
                            zzfoVar.zzL(4);
                            int iZzi5 = zzfoVar.zzi();
                            switch (iZzi5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = MimeTypes.VIDEO_MP42;
                                    break;
                                case 859066445:
                                    str = MimeTypes.VIDEO_MP43;
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = MimeTypes.VIDEO_MJPEG;
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                zzak zzakVar2 = new zzak();
                                zzakVar2.zzab(iZzi3);
                                zzakVar2.zzI(iZzi4);
                                zzakVar2.zzW(str);
                                zzafeVar = new zzafe(zzakVar2.zzac());
                                break;
                            } else {
                                zzfe.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + iZzi5);
                                break;
                            }
                        }
                    case AviExtractor.FOURCC_avih /* 1751742049 */:
                        zzafeVar = zzafa.zzb(zzfoVar);
                        break;
                    case AviExtractor.FOURCC_strh /* 1752331379 */:
                        zzafeVar = zzafb.zzb(zzfoVar);
                        break;
                    case AviExtractor.FOURCC_strn /* 1852994675 */:
                        zzafeVar = zzaff.zzb(zzfoVar);
                        break;
                }
            } else {
                zzafeVar = zzc(zzfoVar.zzi(), zzfoVar);
            }
            if (zzafeVar != null) {
                if (zzafeVar.zza() == 1752331379) {
                    int i3 = ((zzafb) zzafeVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzfe.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfzkVar.zzf(zzafeVar);
            }
            zzfoVar.zzK(iZzd);
            zzfoVar.zzJ(iZze);
        }
        return new zzafd(i, zzfzkVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final int zza() {
        return this.zzb;
    }

    public final zzaev zzb(Class cls) {
        zzfzn zzfznVar = this.zza;
        int size = zzfznVar.size();
        int i = 0;
        while (i < size) {
            zzaev zzaevVar = (zzaev) zzfznVar.get(i);
            i++;
            if (zzaevVar.getClass() == cls) {
                return zzaevVar;
            }
        }
        return null;
    }
}
