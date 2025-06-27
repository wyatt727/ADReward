package com.my.target;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class h7 {

    /* renamed from: a, reason: collision with root package name */
    public final a7 f3992a;
    public final j b;

    public h7(a7 a7Var, j jVar) {
        this.f3992a = a7Var;
        this.b = jVar;
    }

    public static h7 a(a7 a7Var, j jVar) {
        return new h7(a7Var, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(u6 u6Var, Context context) {
        String strA = a(u6Var);
        if (strA == null) {
            return;
        }
        l1 l1VarA = l1.a(context);
        if (l1VarA != null) {
            l1VarA.a(this.b.getSlotId(), strA, true);
            return;
        }
        ba.a("NotificationHandler: Unable to open disk cache and save text data for slotId - " + this.b.getSlotId());
    }

    public final String a(u6 u6Var) {
        JSONObject jSONObjectJ;
        String id = u6Var.getId();
        try {
            jSONObjectJ = this.f3992a.j();
        } catch (Throwable th) {
            ba.a("NotificationHandler: Error updating cached notification for section " + this.f3992a.i() + " and banner " + id + " - " + th);
        }
        if (jSONObjectJ == null) {
            ba.a("NotificationHandler: Unable to change cached notification for banner " + id + " - no raw data in section");
            return null;
        }
        JSONObject jSONObject = jSONObjectJ.getJSONObject(this.f3992a.i());
        if (jSONObject == null) {
            ba.a("NotificationHandler: Unable to change cached notification for banner " + id + " - no section object in raw data");
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("banners");
        if (jSONArray == null) {
            ba.a("NotificationHandler: Uunable to change cached notification for banner " + id + " - no banners array in section object");
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
            String string = jSONObject2.getString("bannerID");
            if (string != null && string.equals(id)) {
                jSONObject2.put("hasNotification", u6Var.isHasNotification());
                ba.a("NotificationHandler: Notification changed in raw data for banner " + id);
                return jSONObjectJ.toString();
            }
        }
        return null;
    }

    public void a(final u6 u6Var, boolean z, Context context) {
        if (u6Var.isHasNotification() != z) {
            u6Var.setHasNotification(z);
            final Context applicationContext = context.getApplicationContext();
            c0.b(new Runnable() { // from class: com.my.target.h7$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(u6Var, applicationContext);
                }
            });
        }
    }
}
