package com.bytedance.sdk.openadsdk.multipro.Pm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.hu;
import java.util.Map;

/* compiled from: SPMultiProviderImpl.java */
/* loaded from: classes2.dex */
public class Td implements com.bytedance.sdk.openadsdk.multipro.EYQ {
    private Context EYQ;

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public String EYQ() {
        return "t_sp";
    }

    private Context mZx() {
        Context context = this.EYQ;
        return context == null ? hu.EYQ() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public Cursor EYQ(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Map<String, ?> mapTd;
        if (!uri.getPath().split("/")[2].equals("get_all") || (mapTd = mZx.Td(mZx(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : mapTd.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            objArr[2] = mapTd.get(str3);
            if (objArr[2] instanceof Boolean) {
                objArr[1] = TypedValues.Custom.S_BOOLEAN;
            } else if (objArr[2] instanceof String) {
                objArr[1] = TypedValues.Custom.S_STRING;
            } else if (objArr[2] instanceof Integer) {
                objArr[1] = "int";
            } else if (objArr[2] instanceof Long) {
                objArr[1] = "long";
            } else if (objArr[2] instanceof Float) {
                objArr[1] = TypedValues.Custom.S_FLOAT;
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public String EYQ(Uri uri) {
        String[] strArrSplit = uri.getPath().split("/");
        String str = strArrSplit[2];
        String str2 = strArrSplit[3];
        if (str.equals("contain")) {
            return String.valueOf(mZx.EYQ(hu.EYQ(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return mZx.EYQ(mZx(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public Uri EYQ(Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split("/")[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            mZx.EYQ(mZx(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public int EYQ(Uri uri, String str, String[] strArr) {
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit[2].equals("clean")) {
            mZx.mZx(mZx(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = strArrSplit[3];
        if (mZx.EYQ(mZx(), uri.getQueryParameter("sp_file_name"), str2)) {
            mZx.mZx(mZx(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.EYQ
    public int EYQ(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        EYQ(uri, contentValues);
        return 0;
    }
}
