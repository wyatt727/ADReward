package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqa;
import com.google.android.gms.internal.measurement.zzqf;
import com.google.android.gms.internal.measurement.zzqg;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzqm;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzqs;
import com.google.android.gms.internal.measurement.zzqx;
import com.google.android.gms.internal.measurement.zzqy;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzbf {
    public static final zzfq<Long> zzaa;
    public static final zzfq<Long> zzab;
    public static final zzfq<Integer> zzac;
    public static final zzfq<Long> zzad;
    public static final zzfq<Integer> zzae;
    public static final zzfq<Integer> zzaf;
    public static final zzfq<Integer> zzag;
    public static final zzfq<Integer> zzah;
    public static final zzfq<Integer> zzai;
    public static final zzfq<Long> zzaj;
    public static final zzfq<Boolean> zzak;
    public static final zzfq<String> zzal;
    public static final zzfq<Long> zzam;
    public static final zzfq<Integer> zzan;
    public static final zzfq<Double> zzao;
    public static final zzfq<Integer> zzap;
    public static final zzfq<Integer> zzaq;
    public static final zzfq<Integer> zzar;
    public static final zzfq<Integer> zzas;
    public static final zzfq<Long> zzat;
    public static final zzfq<Long> zzau;
    public static final zzfq<Integer> zzav;
    public static final zzfq<Integer> zzaw;
    public static final zzfq<String> zzax;
    public static final zzfq<String> zzay;
    public static final zzfq<String> zzaz;
    public static final zzfq<Long> zzba;
    public static final zzfq<String> zzbb;
    public static final zzfq<String> zzbc;
    public static final zzfq<String> zzbd;
    public static final zzfq<String> zzbe;
    public static final zzfq<Boolean> zzbf;
    public static final zzfq<Boolean> zzbg;
    public static final zzfq<Boolean> zzbh;
    public static final zzfq<Boolean> zzbi;
    public static final zzfq<Boolean> zzbj;
    public static final zzfq<Boolean> zzbk;
    public static final zzfq<Boolean> zzbl;
    public static final zzfq<Boolean> zzbm;
    public static final zzfq<Integer> zzbn;
    public static final zzfq<Boolean> zzbo;
    public static final zzfq<Boolean> zzbp;
    public static final zzfq<Boolean> zzbq;
    public static final zzfq<Boolean> zzbr;
    public static final zzfq<Boolean> zzbs;
    public static final zzfq<Boolean> zzbt;
    public static final zzfq<Boolean> zzbu;
    public static final zzfq<String> zzbv;
    public static final zzfq<Boolean> zzbw;
    public static final zzfq<Boolean> zzbx;
    public static final zzfq<Boolean> zzby;
    public static final zzfq<Boolean> zzbz;
    public static final zzfq<Long> zzc;
    public static final zzfq<Boolean> zzca;
    public static final zzfq<Boolean> zzcb;
    public static final zzfq<Boolean> zzcc;
    public static final zzfq<Boolean> zzcd;
    public static final zzfq<Boolean> zzce;
    public static final zzfq<Boolean> zzcf;
    public static final zzfq<Boolean> zzcg;
    public static final zzfq<Boolean> zzch;
    public static final zzfq<Boolean> zzci;
    public static final zzfq<Boolean> zzcj;
    public static final zzfq<Boolean> zzck;
    public static final zzfq<Boolean> zzcl;
    public static final zzfq<Boolean> zzcm;
    public static final zzfq<Boolean> zzcn;
    public static final zzfq<Boolean> zzco;
    public static final zzfq<Boolean> zzcp;
    public static final zzfq<Boolean> zzcq;
    public static final zzfq<Boolean> zzcr;
    public static final zzfq<Boolean> zzcs;
    public static final zzfq<Boolean> zzct;
    public static zzfq<Boolean> zzcu;
    public static final zzfq<Boolean> zzcv;
    public static final zzfq<Boolean> zzcw;
    public static final zzfq<Boolean> zzcx;
    public static final zzfq<Boolean> zzcy;
    public static final zzfq<Boolean> zzcz;
    public static final zzfq<Long> zzd;
    public static final zzfq<Boolean> zzda;
    public static final zzfq<Boolean> zzdb;
    public static final zzfq<Boolean> zzdc;
    public static final zzfq<Boolean> zzdd;
    public static final zzfq<Boolean> zzde;
    public static final zzfq<Boolean> zzdf;
    public static final zzfq<Boolean> zzdg;
    private static final zzfq<Boolean> zzdj;
    private static final zzfq<Boolean> zzdk;
    public static final zzfq<String> zze;
    public static final zzfq<String> zzf;
    public static final zzfq<Integer> zzg;
    public static final zzfq<Integer> zzh;
    public static final zzfq<Integer> zzi;
    public static final zzfq<Integer> zzj;
    public static final zzfq<Integer> zzk;
    public static final zzfq<Integer> zzl;
    public static final zzfq<Integer> zzm;
    public static final zzfq<Integer> zzn;
    public static final zzfq<Integer> zzo;
    public static final zzfq<Integer> zzp;
    public static final zzfq<String> zzq;
    public static final zzfq<Long> zzr;
    public static final zzfq<Long> zzs;
    public static final zzfq<Long> zzt;
    public static final zzfq<Long> zzu;
    public static final zzfq<Long> zzv;
    public static final zzfq<Long> zzw;
    public static final zzfq<Long> zzx;
    public static final zzfq<Long> zzy;
    public static final zzfq<Long> zzz;
    private static final List<zzfq<?>> zzdh = Collections.synchronizedList(new ArrayList());
    private static final Set<zzfq<?>> zzdi = Collections.synchronizedSet(new HashSet());
    public static final zzfq<Long> zza = zza("measurement.ad_id_cache_time", 10000L, 10000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbh
        @Override // com.google.android.gms.measurement.internal.zzfo
        public final Object zza() {
            return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zza());
        }
    });
    public static final zzfq<Long> zzb = zza("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcg
        @Override // com.google.android.gms.measurement.internal.zzfo
        public final Object zza() {
            return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzb());
        }
    });

    private static <V> zzfq<V> zza(String str, V v, V v2, zzfo<V> zzfoVar) {
        zzfq<V> zzfqVar = new zzfq<>(str, v, v2, zzfoVar);
        zzdh.add(zzfqVar);
        return zzfqVar;
    }

    static /* synthetic */ Long zzcl() {
        zzab zzabVar = zzfn.zza;
        return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzd());
    }

    public static Map<String, String> zza(Context context) {
        com.google.android.gms.internal.measurement.zzgs zzgsVarZza = com.google.android.gms.internal.measurement.zzgs.zza(context.getContentResolver(), com.google.android.gms.internal.measurement.zzhi.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzbi
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.measurement.zzhh.zzc();
            }
        });
        return zzgsVarZza == null ? Collections.emptyMap() : zzgsVarZza.zza();
    }

    static {
        Long lValueOf = Long.valueOf(SignalManager.TWENTY_FOUR_HOURS_MILLIS);
        zzc = zza("measurement.monitoring.sample_period_millis", lValueOf, lValueOf, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzq());
            }
        });
        zzd = zza("measurement.config.cache_time", lValueOf, 3600000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return zzbf.zzcl();
            }
        });
        zze = zza("measurement.config.url_scheme", "https", "https", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdq
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return com.google.android.gms.internal.measurement.zznx.zzao();
            }
        });
        zzf = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzec
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return com.google.android.gms.internal.measurement.zznx.zzan();
            }
        });
        zzg = zza("measurement.upload.max_bundles", 100, 100, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzeo
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzab());
            }
        });
        zzh = zza("measurement.upload.max_batch_size", 65536, 65536, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfa
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzaj());
            }
        });
        zzi = zza("measurement.upload.max_bundle_size", 65536, 65536, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfm
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzaa());
            }
        });
        zzj = zza("measurement.upload.max_events_per_bundle", 1000, 1000, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbu
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzae());
            }
        });
        zzk = zza("measurement.upload.max_events_per_day", 100000, 100000, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzaf());
            }
        });
        zzl = zza("measurement.upload.max_error_events_per_day", 1000, 1000, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzad());
            }
        });
        zzm = zza("measurement.upload.max_public_events_per_day", 50000, 50000, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzag());
            }
        });
        zzn = zza("measurement.upload.max_conversions_per_day", 10000, 10000, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzac());
            }
        });
        zzo = zza("measurement.upload.max_realtime_events_per_day", 10, 10, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbx
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzai());
            }
        });
        zzp = zza("measurement.store.max_stored_events_per_app", 100000, 100000, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzj());
            }
        });
        zzq = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbz
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return com.google.android.gms.internal.measurement.zznx.zzaw();
            }
        });
        zzr = zza("measurement.upload.backoff_period", 43200000L, 43200000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzx());
            }
        });
        zzs = zza("measurement.upload.window_interval", 3600000L, 3600000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzam());
            }
        });
        zzt = zza("measurement.upload.interval", 3600000L, 3600000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzz());
            }
        });
        zzu = zza("measurement.upload.realtime_upload_interval", 10000L, 10000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzr());
            }
        });
        zzv = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zze());
            }
        });
        zzw = zza("measurement.upload.minimum_delay", 500L, 500L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzp());
            }
        });
        zzx = zza("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzo());
            }
        });
        zzy = zza("measurement.upload.stale_data_deletion_interval", lValueOf, lValueOf, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcj
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzu());
            }
        });
        zzz = zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzs());
            }
        });
        Long lValueOf2 = Long.valueOf(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        zzaa = zza("measurement.upload.initial_upload_delay_time", lValueOf2, lValueOf2, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcl
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzy());
            }
        });
        zzab = zza("measurement.upload.retry_time", 1800000L, 1800000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzal());
            }
        });
        zzac = zza("measurement.upload.retry_count", 6, 6, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzak());
            }
        });
        zzad = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzah());
            }
        });
        zzae = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzg());
            }
        });
        zzaf = zza("measurement.audience.filter_result_max_count", 200, 200, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzl());
            }
        });
        zzag = zza("measurement.upload.max_public_user_properties", 25, 25, null);
        zzah = zza("measurement.upload.max_event_name_cardinality", 500, 500, null);
        zzai = zza("measurement.upload.max_public_event_params", 25, 25, null);
        zzaj = zza("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzt());
            }
        });
        zzak = zza("measurement.test.boolean_flag", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpt.zze());
            }
        });
        zzal = zza("measurement.test.string_flag", "---", "---", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcv
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return zzpt.zzd();
            }
        });
        zzam = zza("measurement.test.long_flag", -1L, -1L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(zzpt.zzc());
            }
        });
        zzan = zza("measurement.test.int_flag", -2, -2, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcx
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) zzpt.zzb());
            }
        });
        Double dValueOf = Double.valueOf(-3.0d);
        zzao = zza("measurement.test.double_flag", dValueOf, dValueOf, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Double.valueOf(zzpt.zza());
            }
        });
        zzap = zza("measurement.experiment.max_ids", 50, 50, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzk());
            }
        });
        zzaq = zza("measurement.upload.max_item_scoped_custom_parameters", 27, 27, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzm());
            }
        });
        zzar = zza("measurement.upload.max_event_parameter_value_length", 100, 100, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzi());
            }
        });
        zzas = zza("measurement.max_bundles_per_iteration", 100, 100, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzc());
            }
        });
        zzat = zza("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzv());
            }
        });
        zzau = zza("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzw());
            }
        });
        zzav = zza("measurement.rb.attribution.client.min_ad_services_version", 7, 7, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdh
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzn());
            }
        });
        zzaw = zza("measurement.dma_consent.max_daily_dcu_realtime_events", 1, 1, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.zznx.zzh());
            }
        });
        zzax = zza("measurement.rb.attribution.uri_scheme", "https", "https", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return com.google.android.gms.internal.measurement.zznx.zzav();
            }
        });
        zzay = zza("measurement.rb.attribution.uri_authority", "google-analytics.com", "google-analytics.com", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return com.google.android.gms.internal.measurement.zznx.zzas();
            }
        });
        zzaz = zza("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", "privacy-sandbox/register-app-conversion", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return com.google.android.gms.internal.measurement.zznx.zzat();
            }
        });
        zzba = zza("measurement.session.engagement_interval", 3600000L, 3600000L, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.zznx.zzf());
            }
        });
        zzbb = zza("measurement.rb.attribution.app_allowlist", "com.labpixies.flood", "com.labpixies.flood", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return com.google.android.gms.internal.measurement.zznx.zzaq();
            }
        });
        zzbc = zza("measurement.rb.attribution.user_properties", "_npa,npa", "_npa,npa", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzds
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return com.google.android.gms.internal.measurement.zznx.zzax();
            }
        });
        zzbd = zza("measurement.rb.attribution.event_params", "value|currency", "value|currency", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdr
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return com.google.android.gms.internal.measurement.zznx.zzap();
            }
        });
        zzbe = zza("measurement.rb.attribution.query_parameters_to_remove", "", "", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdu
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return com.google.android.gms.internal.measurement.zznx.zzau();
            }
        });
        zzbf = zza("measurement.collection.log_event_and_bundle_v2", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdt
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpu.zza());
            }
        });
        zzbg = zza("measurement.quality.checksum", false, false, null);
        zzbh = zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdv
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzow.zzc());
            }
        });
        zzbi = zza("measurement.audience.refresh_event_count_filters_timestamp", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdy
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzow.zzb());
            }
        });
        zzbj = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdx
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzow.zzd());
            }
        });
        zzbk = zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzea
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpo.zza());
            }
        });
        zzbl = zza("measurement.integration.disable_firebase_instance_id", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdz
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqx.zzb());
            }
        });
        zzbm = zza("measurement.collection.service.update_with_analytics_fix", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzeb
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqy.zza());
            }
        });
        zzbn = zza("measurement.service.storage_consent_support_version", 203600, 203600, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzee
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Integer.valueOf((int) zzod.zza());
            }
        });
        zzbo = zza("measurement.service.store_null_safelist", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzed
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzoq.zzb());
            }
        });
        zzbp = zza("measurement.service.store_safelist", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzeg
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzoq.zzc());
            }
        });
        zzbq = zza("measurement.collection.enable_session_stitching_token.first_open_fix", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzei
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzql.zzc());
            }
        });
        zzbr = zza("measurement.collection.enable_session_stitching_token.client.dev", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzeh
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzql.zzb());
            }
        });
        zzbs = zza("measurement.session_stitching_token_enabled", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzek
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzql.zzd());
            }
        });
        zzbt = zza("measurement.sgtm.service", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzej
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqr.zzc());
            }
        });
        zzbu = zza("measurement.sgtm.preview_mode_enabled", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzem
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqr.zzb());
            }
        });
        zzbv = zza("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile", new zzfo() { // from class: com.google.android.gms.measurement.internal.zzel
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return com.google.android.gms.internal.measurement.zznx.zzar();
            }
        });
        zzbw = zza("measurement.redaction.retain_major_os_version", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzen
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqa.zza());
            }
        });
        zzbx = zza("measurement.redaction.scion_payload_generator", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzeq
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqa.zzb());
            }
        });
        zzby = zza("measurement.sessionid.enable_client_session_id", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzep
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqg.zzb());
            }
        });
        zzbz = zza("measurement.gmscore_feature_tracking", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzer
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzph.zzb());
            }
        });
        zzca = zza("measurement.fix_health_monitor_stack_trace", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzeu
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpb.zzb());
            }
        });
        zzcb = zza("measurement.item_scoped_custom_parameters.client", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzet
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpn.zzb());
            }
        });
        zzcc = zza("measurement.item_scoped_custom_parameters.service", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzew
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpn.zzc());
            }
        });
        zzcd = zza("measurement.remove_app_background.client", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzev
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqf.zzb());
            }
        });
        zzce = zza("measurement.rb.attribution.service", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzey
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpz.zzf());
            }
        });
        zzcf = zza("measurement.rb.attribution.client2", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzex
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpz.zzb());
            }
        });
        zzcg = zza("measurement.rb.attribution.uuid_generation", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzez
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpz.zzh());
            }
        });
        zzch = zza("measurement.rb.attribution.enable_trigger_redaction", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfc
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpz.zzg());
            }
        });
        zzdj = zza("measurement.rb.attribution.followup1.service", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfe
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpz.zzd());
            }
        });
        zzci = zza("measurement.rb.attribution.dma_fix", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfd
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpz.zzc());
            }
        });
        zzcj = zza("measurement.rb.attribution.improved_retry", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfg
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpz.zzi());
            }
        });
        zzck = zza("measurement.rb.attribution.index_out_of_bounds_fix", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzff
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpz.zze());
            }
        });
        zzcl = zza("measurement.client.sessions.enable_fix_background_engagement", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfi
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqm.zza());
            }
        });
        zzcm = zza("measurement.client.sessions.enable_pause_engagement_in_background", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfh
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqm.zzb());
            }
        });
        zzcn = zza("measurement.dma_consent.service_dcu_event2", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfk
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzop.zzc());
            }
        });
        zzco = zza("measurement.dma_consent.services_database_update_fix", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfj
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzop.zzb());
            }
        });
        zzcp = zza("measurement.dma_consent.separate_service_calls_fix", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfl
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzop.zza());
            }
        });
        zzcq = zza("measurement.dma_consent.set_consent_inline_on_worker", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbj
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzop.zzd());
            }
        });
        zzcr = zza("measurement.service.deferred_first_open", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzoj.zzb());
            }
        });
        zzcs = zza("measurement.gbraid_campaign.gbraid.client.dev", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbl
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpc.zzb());
            }
        });
        zzct = zza("measurement.gbraid_campaign.gbraid.service", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpc.zzc());
            }
        });
        zzcu = zza("measurement.increase_param_lengths", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbn
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzpi.zzb());
            }
        });
        zzcv = zza("measurement.disable_npa_for_dasher_and_unicorn", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzok.zzb());
            }
        });
        zzcw = zza("measurement.tcf.client", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqs.zzb());
            }
        });
        zzcx = zza("measurement.tcf.service", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzqs.zzc());
            }
        });
        zzcy = zza("measurement.consent_regional_defaults.service", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.zzny.zzc());
            }
        });
        zzcz = zza("measurement.consent_regional_defaults.client", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.zzny.zzb());
            }
        });
        zzdk = zza("measurement.service.consent.aiid_reset_fix", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzov.zza());
            }
        });
        zzda = zza("measurement.service.consent.aiid_reset_fix2", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzov.zzb());
            }
        });
        zzdb = zza("measurement.service.consent.pfo_on_fx", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzov.zze());
            }
        });
        zzdc = zza("measurement.service.consent.params_on_fx", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzdw
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzov.zzd());
            }
        });
        zzdd = zza("measurement.service.consent.app_start_fix", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzef
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzov.zzc());
            }
        });
        zzde = zza("measurement.consent.stop_reset_on_storage_denied.client", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzes
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzoe.zzb());
            }
        });
        zzdf = zza("measurement.consent.stop_reset_on_storage_denied.service", false, false, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzfb
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzoe.zzc());
            }
        });
        zzdg = zza("measurement.consent.scrub_audience_data_analytics_consent", true, true, new zzfo() { // from class: com.google.android.gms.measurement.internal.zzbk
            @Override // com.google.android.gms.measurement.internal.zzfo
            public final Object zza() {
                return Boolean.valueOf(zzoe.zzd());
            }
        });
    }
}
