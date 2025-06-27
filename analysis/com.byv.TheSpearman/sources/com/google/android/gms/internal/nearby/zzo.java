package com.google.android.gms.internal.nearby;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzo {
    private static final Map<zzn, zzo> zza = new ArrayMap();
    private final Map<String, Set<ListenerHolder.ListenerKey<?>>> zzb = new ArrayMap();
    private final Set<ListenerHolder.ListenerKey<?>> zzc = new ArraySet();
    private final Map<String, Object> zzd = new ArrayMap();

    private zzo() {
    }

    public static synchronized zzo zza(GoogleApi<?> googleApi, Api.ApiOptions apiOptions) {
        zzn zznVar;
        Map<zzn, zzo> map;
        zznVar = new zzn(googleApi, null);
        map = zza;
        if (!map.containsKey(zznVar)) {
            map.put(zznVar, new zzo());
        }
        return map.get(zznVar);
    }

    private final Object zzh(String str) {
        if (!this.zzd.containsKey(str)) {
            this.zzd.put(str, new Object());
        }
        return this.zzd.get(str);
    }

    public final synchronized <T> ListenerHolder<T> zzb(GoogleApi googleApi, T t, String str) {
        ListenerHolder<T> listenerHolderRegisterListener;
        listenerHolderRegisterListener = googleApi.registerListener(t, str);
        ListenerHolder.ListenerKey<?> listenerKey = (ListenerHolder.ListenerKey) Preconditions.checkNotNull(listenerHolderRegisterListener.getListenerKey(), "Key must not be null");
        Set<ListenerHolder.ListenerKey<?>> arraySet = this.zzb.get(str);
        if (arraySet == null) {
            arraySet = new ArraySet<>();
            this.zzb.put(str, arraySet);
        }
        arraySet.add(listenerKey);
        return listenerHolderRegisterListener;
    }

    public final synchronized ListenerHolder<Object> zzc(GoogleApi<?> googleApi, String str, String str2) {
        return zzb(googleApi, zzh(str), "connection");
    }

    public final synchronized ListenerHolder.ListenerKey<Object> zzd(String str, String str2) {
        return ListenerHolders.createListenerKey(zzh(str), "connection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized Task<Void> zze(GoogleApi<?> googleApi, RegistrationMethods<?, ?> registrationMethods) {
        ListenerHolder.ListenerKey<?> listenerKey;
        listenerKey = (ListenerHolder.ListenerKey) Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Key must not be null");
        this.zzc.add(listenerKey);
        return googleApi.doRegisterEventListener(registrationMethods).addOnFailureListener(new zzm(this, googleApi, listenerKey));
    }

    public final synchronized Task<Boolean> zzf(GoogleApi<?> googleApi, ListenerHolder.ListenerKey<?> listenerKey) {
        String next;
        this.zzc.remove(listenerKey);
        Iterator<String> it = this.zzb.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Set<ListenerHolder.ListenerKey<?>> set = this.zzb.get(next);
            if (set.contains(listenerKey)) {
                set.remove(listenerKey);
                break;
            }
        }
        if (next != null) {
            Iterator<Map.Entry<String, Object>> it2 = this.zzd.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, Object> next2 = it2.next();
                if (ListenerHolders.createListenerKey(next2.getValue(), next).equals(listenerKey)) {
                    this.zzd.remove(next2.getKey());
                    break;
                }
            }
        }
        return googleApi.doUnregisterEventListener(listenerKey);
    }

    public final synchronized Task<Void> zzg(GoogleApi<?> googleApi, String str) {
        ArraySet arraySet = new ArraySet();
        Set<ListenerHolder.ListenerKey<?>> set = this.zzb.get(str);
        if (set == null) {
            return Tasks.whenAll(arraySet);
        }
        Iterator it = new ArraySet(set).iterator();
        while (it.hasNext()) {
            ListenerHolder.ListenerKey<?> listenerKey = (ListenerHolder.ListenerKey) it.next();
            if (this.zzc.contains(listenerKey)) {
                arraySet.add(zzf(googleApi, listenerKey));
            }
        }
        this.zzb.remove(str);
        return Tasks.whenAll(arraySet);
    }
}
