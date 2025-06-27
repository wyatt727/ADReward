package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgzh extends zzgzg {
    zzgzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final int zza(Map.Entry entry) {
        return ((zzgzs) entry.getKey()).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final zzgzk zzb(Object obj) {
        return ((zzgzr) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final zzgzk zzc(Object obj) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final Object zzd(zzgzf zzgzfVar, zzhbl zzhblVar, int i) {
        return zzgzfVar.zzc(zzhblVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final void zzf(Object obj) {
        ((zzgzr) obj).zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final void zzg(zzhby zzhbyVar, Object obj, zzgzf zzgzfVar, zzgzk zzgzkVar) throws IOException {
        zzgzt zzgztVar = (zzgzt) obj;
        zzgzkVar.zzk(zzgztVar.zzd, zzhbyVar.zzs(zzgztVar.zzc.getClass(), zzgzfVar));
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final void zzh(zzgyj zzgyjVar, Object obj, zzgzf zzgzfVar, zzgzk zzgzkVar) throws IOException {
        zzgzt zzgztVar = (zzgzt) obj;
        zzhbk zzhbkVarZzcY = zzgztVar.zzc.zzcY();
        zzgyt zzgytVarZzl = zzgyjVar.zzl();
        zzhbkVarZzcY.zzaW(zzgytVarZzl, zzgzfVar);
        zzgzkVar.zzk(zzgztVar.zzd, zzhbkVarZzcY.zzbs());
        zzgytVarZzl.zzz(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final boolean zzi(zzhbl zzhblVar) {
        return zzhblVar instanceof zzgzr;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final void zzj(zzgzb zzgzbVar, Map.Entry entry) throws IOException {
        zzgzs zzgzsVar = (zzgzs) entry.getKey();
        if (!zzgzsVar.zzd) {
            zzhdn zzhdnVar = zzhdn.DOUBLE;
            switch (zzgzsVar.zzc) {
                case DOUBLE:
                    zzgzbVar.zzf(zzgzsVar.zzb, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zzgzbVar.zzo(zzgzsVar.zzb, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zzgzbVar.zzt(zzgzsVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zzgzbVar.zzK(zzgzsVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zzgzbVar.zzr(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zzgzbVar.zzm(zzgzsVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zzgzbVar.zzk(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zzgzbVar.zzb(zzgzsVar.zzb, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zzgzbVar.zzG(zzgzsVar.zzb, (String) entry.getValue());
                    break;
                case GROUP:
                    zzgzbVar.zzq(zzgzsVar.zzb, entry.getValue(), zzhbv.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zzgzbVar.zzv(zzgzsVar.zzb, entry.getValue(), zzhbv.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zzgzbVar.zzd(zzgzsVar.zzb, (zzgyj) entry.getValue());
                    break;
                case UINT32:
                    zzgzbVar.zzI(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zzgzbVar.zzr(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zzgzbVar.zzx(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zzgzbVar.zzz(zzgzsVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zzgzbVar.zzB(zzgzsVar.zzb, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zzgzbVar.zzD(zzgzsVar.zzb, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzhdn zzhdnVar2 = zzhdn.DOUBLE;
        switch (zzgzsVar.zzc) {
            case DOUBLE:
                zzhci.zzw(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case FLOAT:
                zzhci.zzA(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case INT64:
                zzhci.zzD(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case UINT64:
                zzhci.zzL(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case INT32:
                zzhci.zzC(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case FIXED64:
                zzhci.zzz(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case FIXED32:
                zzhci.zzy(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case BOOL:
                zzhci.zzu(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case STRING:
                zzhci.zzJ(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzhci.zzB(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzhbv.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzhci.zzE(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzhbv.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                zzhci.zzv(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar);
                break;
            case UINT32:
                zzhci.zzK(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case ENUM:
                zzhci.zzC(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case SFIXED32:
                zzhci.zzF(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case SFIXED64:
                zzhci.zzG(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case SINT32:
                zzhci.zzH(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
            case SINT64:
                zzhci.zzI(zzgzsVar.zzb, (List) entry.getValue(), zzgzbVar, zzgzsVar.zze);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final Object zze(Object obj, zzhby zzhbyVar, Object obj2, zzgzf zzgzfVar, zzgzk zzgzkVar, Object obj3, zzhcx zzhcxVar) throws IOException {
        Object objValueOf;
        Object objZzf;
        ArrayList arrayList;
        zzgzt zzgztVar = (zzgzt) obj2;
        zzgzs zzgzsVar = zzgztVar.zzd;
        boolean z = zzgzsVar.zzd;
        int i = zzgzsVar.zzb;
        if (z && zzgzsVar.zze) {
            zzhdn zzhdnVar = zzhdn.DOUBLE;
            switch (zzgztVar.zzd.zzc) {
                case DOUBLE:
                    arrayList = new ArrayList();
                    zzhbyVar.zzz(arrayList);
                    break;
                case FLOAT:
                    arrayList = new ArrayList();
                    zzhbyVar.zzD(arrayList);
                    break;
                case INT64:
                    arrayList = new ArrayList();
                    zzhbyVar.zzG(arrayList);
                    break;
                case UINT64:
                    arrayList = new ArrayList();
                    zzhbyVar.zzO(arrayList);
                    break;
                case INT32:
                    arrayList = new ArrayList();
                    zzhbyVar.zzF(arrayList);
                    break;
                case FIXED64:
                    arrayList = new ArrayList();
                    zzhbyVar.zzC(arrayList);
                    break;
                case FIXED32:
                    arrayList = new ArrayList();
                    zzhbyVar.zzB(arrayList);
                    break;
                case BOOL:
                    arrayList = new ArrayList();
                    zzhbyVar.zzx(arrayList);
                    break;
                case STRING:
                case GROUP:
                case MESSAGE:
                case BYTES:
                default:
                    throw new IllegalStateException("Type cannot be packed: ".concat(String.valueOf(String.valueOf(zzgztVar.zzd.zzc))));
                case UINT32:
                    arrayList = new ArrayList();
                    zzhbyVar.zzN(arrayList);
                    break;
                case ENUM:
                    ArrayList arrayList2 = new ArrayList();
                    zzhbyVar.zzA(arrayList2);
                    zzgzs zzgzsVar2 = zzgztVar.zzd;
                    int i2 = zzhci.zza;
                    zzhaa zzhaaVar = zzgzsVar2.zza;
                    if (zzhaaVar != null) {
                        int size = arrayList2.size();
                        int i3 = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            int iIntValue = ((Integer) arrayList2.get(i4)).intValue();
                            if (zzhaaVar.zza(iIntValue) != null) {
                                if (i4 != i3) {
                                    arrayList2.set(i3, Integer.valueOf(iIntValue));
                                }
                                i3++;
                            } else {
                                obj3 = zzhci.zzp(obj, i, iIntValue, obj3, zzhcxVar);
                            }
                        }
                        if (i3 != size) {
                            arrayList2.subList(i3, size).clear();
                        }
                    }
                    arrayList = arrayList2;
                    break;
                case SFIXED32:
                    arrayList = new ArrayList();
                    zzhbyVar.zzI(arrayList);
                    break;
                case SFIXED64:
                    arrayList = new ArrayList();
                    zzhbyVar.zzJ(arrayList);
                    break;
                case SINT32:
                    arrayList = new ArrayList();
                    zzhbyVar.zzK(arrayList);
                    break;
                case SINT64:
                    arrayList = new ArrayList();
                    zzhbyVar.zzL(arrayList);
                    break;
            }
            zzgzkVar.zzk(zzgztVar.zzd, arrayList);
        } else {
            if (zzgzsVar.zzc != zzhdn.ENUM) {
                switch (zzgztVar.zzd.zzc) {
                    case DOUBLE:
                        objValueOf = Double.valueOf(zzhbyVar.zza());
                        break;
                    case FLOAT:
                        objValueOf = Float.valueOf(zzhbyVar.zzb());
                        break;
                    case INT64:
                        objValueOf = Long.valueOf(zzhbyVar.zzl());
                        break;
                    case UINT64:
                        objValueOf = Long.valueOf(zzhbyVar.zzo());
                        break;
                    case INT32:
                        objValueOf = Integer.valueOf(zzhbyVar.zzg());
                        break;
                    case FIXED64:
                        objValueOf = Long.valueOf(zzhbyVar.zzk());
                        break;
                    case FIXED32:
                        objValueOf = Integer.valueOf(zzhbyVar.zzf());
                        break;
                    case BOOL:
                        objValueOf = Boolean.valueOf(zzhbyVar.zzP());
                        break;
                    case STRING:
                        objValueOf = zzhbyVar.zzt();
                        break;
                    case GROUP:
                        zzgzs zzgzsVar3 = zzgztVar.zzd;
                        if (!zzgzsVar3.zzd) {
                            Object objZzf2 = zzgzkVar.zzf(zzgzsVar3);
                            if (objZzf2 instanceof zzgzv) {
                                zzhcg zzhcgVarZzb = zzhbv.zza().zzb(objZzf2.getClass());
                                if (!((zzgzv) objZzf2).zzce()) {
                                    Object objZze = zzhcgVarZzb.zze();
                                    zzhcgVarZzb.zzg(objZze, objZzf2);
                                    zzgzkVar.zzk(zzgztVar.zzd, objZze);
                                    objZzf2 = objZze;
                                }
                                zzhbyVar.zzv(objZzf2, zzhcgVarZzb, zzgzfVar);
                                return obj3;
                            }
                        }
                        objValueOf = zzhbyVar.zzr(zzgztVar.zzc.getClass(), zzgzfVar);
                        break;
                    case MESSAGE:
                        zzgzs zzgzsVar4 = zzgztVar.zzd;
                        if (!zzgzsVar4.zzd) {
                            Object objZzf3 = zzgzkVar.zzf(zzgzsVar4);
                            if (objZzf3 instanceof zzgzv) {
                                zzhcg zzhcgVarZzb2 = zzhbv.zza().zzb(objZzf3.getClass());
                                if (!((zzgzv) objZzf3).zzce()) {
                                    Object objZze2 = zzhcgVarZzb2.zze();
                                    zzhcgVarZzb2.zzg(objZze2, objZzf3);
                                    zzgzkVar.zzk(zzgztVar.zzd, objZze2);
                                    objZzf3 = objZze2;
                                }
                                zzhbyVar.zzw(objZzf3, zzhcgVarZzb2, zzgzfVar);
                                return obj3;
                            }
                        }
                        objValueOf = zzhbyVar.zzs(zzgztVar.zzc.getClass(), zzgzfVar);
                        break;
                    case BYTES:
                        objValueOf = zzhbyVar.zzp();
                        break;
                    case UINT32:
                        objValueOf = Integer.valueOf(zzhbyVar.zzj());
                        break;
                    case ENUM:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case SFIXED32:
                        objValueOf = Integer.valueOf(zzhbyVar.zzh());
                        break;
                    case SFIXED64:
                        objValueOf = Long.valueOf(zzhbyVar.zzm());
                        break;
                    case SINT32:
                        objValueOf = Integer.valueOf(zzhbyVar.zzi());
                        break;
                    case SINT64:
                        objValueOf = Long.valueOf(zzhbyVar.zzn());
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int iZzg = zzhbyVar.zzg();
                if (zzgztVar.zzd.zza.zza(iZzg) == null) {
                    return zzhci.zzp(obj, i, iZzg, obj3, zzhcxVar);
                }
                objValueOf = Integer.valueOf(iZzg);
            }
            zzgzs zzgzsVar5 = zzgztVar.zzd;
            if (zzgzsVar5.zzd) {
                zzgzkVar.zzh(zzgzsVar5, objValueOf);
            } else {
                int iOrdinal = zzgzsVar5.zzc.ordinal();
                if ((iOrdinal == 9 || iOrdinal == 10) && (objZzf = zzgzkVar.zzf(zzgztVar.zzd)) != null) {
                    byte[] bArr = zzhai.zzd;
                    objValueOf = ((zzhbl) objZzf).zzcZ().zzaS((zzhbl) objValueOf).zzbs();
                }
                zzgzkVar.zzk(zzgztVar.zzd, objValueOf);
            }
        }
        return obj3;
    }
}
