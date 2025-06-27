package com.json;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.json.sdk.utils.IronSourceStorageUtils;
import com.json.sdk.utils.SDKUtils;
import com.json.z4;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b5 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1703a;
    private final c4 b;
    private final a5 c;
    private final ea d;
    private final b6 e = ca.h().c();

    class a implements db {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ db f1704a;

        /* renamed from: com.ironsource.b5$a$a, reason: collision with other inner class name */
        class C0234a extends JSONObject {
            C0234a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        a(db dbVar) {
            this.f1704a = dbVar;
        }

        @Override // com.json.db
        public void a(o7 o7Var) {
            this.f1704a.a(o7Var);
            try {
                b5.this.d.a(o7Var.getName(), new C0234a());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.json.db
        public void a(o7 o7Var, g7 g7Var) {
            this.f1704a.a(o7Var, g7Var);
        }
    }

    public b5(Context context, c4 c4Var, a5 a5Var, ea eaVar) {
        this.f1703a = context;
        this.b = c4Var;
        this.c = a5Var;
        this.d = eaVar;
    }

    public void a(o7 o7Var) throws Exception {
        if (o7Var.exists()) {
            if (!o7Var.delete()) {
                throw new Exception("Failed to delete file");
            }
            this.d.a(o7Var.getName());
        }
    }

    public void a(o7 o7Var, String str, int i, int i2, db dbVar) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(z4.a.f2473a);
        }
        if (this.e.a(this.b.a()) <= 0) {
            throw new Exception(u2.A);
        }
        if (!SDKUtils.isExternalStorageAvailable()) {
            throw new Exception(u2.B);
        }
        if (!p2.g(this.f1703a)) {
            throw new Exception(u2.C);
        }
        this.c.a(o7Var.getPath(), new a(dbVar));
        if (!o7Var.exists()) {
            this.b.a(o7Var, str, i, i2, this.c);
            return;
        }
        Message message = new Message();
        message.obj = o7Var;
        message.what = 1015;
        this.c.sendMessage(message);
    }

    public void a(o7 o7Var, JSONObject jSONObject) throws Exception {
        if (jSONObject == null) {
            throw new Exception("Missing attributes to update");
        }
        if (!o7Var.exists()) {
            throw new Exception("File does not exist");
        }
        if (!this.d.b(o7Var.getName(), jSONObject)) {
            throw new Exception("Failed to update attribute");
        }
    }

    public void b(o7 o7Var) throws Exception {
        if (o7Var.exists()) {
            ArrayList<o7> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(o7Var);
            if (!(IronSourceStorageUtils.deleteFolderContentRecursive(o7Var) && o7Var.delete())) {
                throw new Exception("Failed to delete folder");
            }
            this.d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(o7 o7Var) throws Exception {
        if (o7Var.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(o7Var, this.d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(o7 o7Var) throws Exception {
        if (o7Var.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(o7Var);
        }
        throw new Exception("Folder does not exist");
    }
}
