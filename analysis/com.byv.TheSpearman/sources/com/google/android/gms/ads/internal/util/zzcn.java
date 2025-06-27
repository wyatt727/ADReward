package com.google.android.gms.ads.internal.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzcn {
    private static List zzb;
    private static final Map zza = new HashMap();
    private static final Object zzc = new Object();

    public static List zza(String str) {
        ArrayList arrayList;
        Object obj = zzc;
        synchronized (obj) {
            Map map = zza;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    if (zzb == null) {
                        zzb = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : zzb) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap map2 = new HashMap();
                            map2.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            map2.put("profileLevels", arrayList2);
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            map2.put("bitRatesBps", zzb(videoCapabilities.getBitrateRange()));
                            map2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            map2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            map2.put("frameRates", zzb(videoCapabilities.getSupportedFrameRates()));
                            map2.put("widths", zzb(videoCapabilities.getSupportedWidths()));
                            map2.put("heights", zzb(videoCapabilities.getSupportedHeights()));
                            if (Build.VERSION.SDK_INT >= 23) {
                                map2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            }
                            arrayList.add(map2);
                        }
                    }
                    zza.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap map3 = new HashMap();
                map3.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map3);
                zza.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    private static Integer[] zzb(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
