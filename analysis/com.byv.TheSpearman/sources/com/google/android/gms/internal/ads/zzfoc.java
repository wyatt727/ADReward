package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfoc implements zzfoa {
    private final zzfoa zza;

    public zzfoc(zzfoa zzfoaVar) {
        this.zza = zzfoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final JSONObject zza(View view) throws JSONException {
        JSONObject jSONObjectZza = zzfok.zza(0, 0, 0, 0);
        int iZzb = zzfon.zzb();
        int i = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZza.put("noOutputDevice", i == 0);
        } catch (JSONException e) {
            zzfol.zza("Error with setting output device status", e);
        }
        return jSONObjectZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final void zzb(View view, JSONObject jSONObject, zzfnz zzfnzVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzfnq zzfnqVarZza = zzfnq.zza();
        if (zzfnqVarZza != null) {
            Collection collectionZzb = zzfnqVarZza.zzb();
            int size = collectionZzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzb.iterator();
            while (it.hasNext()) {
                View viewZzf = ((zzfnc) it.next()).zzf();
                if (viewZzf != null && viewZzf.isAttachedToWindow() && viewZzf.isShown()) {
                    View view2 = viewZzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z3) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfnzVar.zza((View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}
