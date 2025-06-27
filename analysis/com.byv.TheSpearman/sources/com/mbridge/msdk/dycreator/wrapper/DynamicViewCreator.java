package com.mbridge.msdk.dycreator.wrapper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.b.a;
import com.mbridge.msdk.dycreator.e.f;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.viewmodel.MBCommonViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBRewardViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class DynamicViewCreator {

    /* renamed from: a, reason: collision with root package name */
    private static volatile DynamicViewCreator f2686a = null;
    private static int b = -201;

    private DynamicViewCreator() {
        b.a().a(c.m().c());
    }

    public static DynamicViewCreator getInstance() {
        if (f2686a == null) {
            synchronized (DynamicViewCreator.class) {
                if (f2686a == null) {
                    f2686a = new DynamicViewCreator();
                }
            }
        }
        return f2686a;
    }

    public void createDynamicView(DyOption dyOption, DynamicViewBackListener dynamicViewBackListener) {
        boolean z;
        BaseViewModel mBSplashViewVModel;
        BaseViewModel mBCommonViewVModel;
        boolean z2;
        if (dyOption == null) {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.NOT_FOUND_DYNAMIC_OPTION));
            return;
        }
        if (dynamicViewBackListener == null) {
            return;
        }
        Context contextC = c.m().c();
        if (contextC == null) {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.NOT_FOUND_CONTEXT));
            return;
        }
        if (dyOption != null) {
            z = false;
            if (dyOption.getCampaignEx() == null) {
                dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.NOT_FOUND_CAMPAIGN));
                z2 = false;
            } else {
                z2 = true;
            }
            if (dyOption.getFile() != null || dyOption.getFileDirs() == null) {
                z = z2;
            } else {
                dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.BIND_DATA_FILE_OR_DIR));
            }
        } else {
            z = true;
        }
        if (z) {
            try {
                View viewA = a(contextC, dyOption);
                if (viewA == null) {
                    dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.b.b.FILE_CREATE_VIEW_FILE));
                    return;
                }
                int i = AnonymousClass1.f2687a[dyOption.getDyAdType().ordinal()];
                if (i == 1) {
                    mBSplashViewVModel = new MBSplashViewVModel(dyOption);
                } else if (i == 2) {
                    mBSplashViewVModel = new MBRewardViewVModel(dyOption);
                } else {
                    mBCommonViewVModel = new MBCommonViewVModel();
                    mBCommonViewVModel.setDynamicViewBackListener(dynamicViewBackListener);
                    com.mbridge.msdk.dycreator.binding.b.a().a(mBCommonViewVModel);
                    mBCommonViewVModel.setModelDataAndBind();
                    dynamicViewBackListener.viewCreatedSuccess(viewA);
                }
                mBCommonViewVModel = mBSplashViewVModel;
                mBCommonViewVModel.setDynamicViewBackListener(dynamicViewBackListener);
                com.mbridge.msdk.dycreator.binding.b.a().a(mBCommonViewVModel);
                mBCommonViewVModel.setModelDataAndBind();
                dynamicViewBackListener.viewCreatedSuccess(viewA);
            } catch (Exception e) {
                ad.b("DynamicViewCreator", e.getMessage());
                dynamicViewBackListener.viewCreateFail(new a(b, e.getMessage()));
            }
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2687a;

        static {
            int[] iArr = new int[DyAdType.values().length];
            f2687a = iArr;
            try {
                iArr[DyAdType.SPLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2687a[DyAdType.REWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public View createDynamicView(DyOption dyOption) {
        Context contextC;
        if (dyOption == null || (contextC = c.m().c()) == null) {
            return null;
        }
        return a(contextC, dyOption);
    }

    private View a(Context context, DyOption dyOption) throws JSONException {
        List<String> fileDirs;
        if (dyOption == null || (fileDirs = dyOption.getFileDirs()) == null) {
            return null;
        }
        int i = 0;
        ViewGroup viewGroup = null;
        int i2 = 0;
        while (i2 < fileDirs.size()) {
            try {
                if (!TextUtils.isEmpty(fileDirs.get(i2))) {
                    if (i2 == 0) {
                        viewGroup = (ViewGroup) f.a(context).a(fileDirs.get(i2));
                    } else {
                        String str = fileDirs.get(i2);
                        if (context != null && viewGroup != null && !TextUtils.isEmpty(str)) {
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                String string = jSONObject.getString("folder_dir");
                                if (!TextUtils.isEmpty(string)) {
                                    JSONArray jSONArray = new JSONArray(jSONObject.optString("ext_template"));
                                    if (jSONArray.length() != 0) {
                                        int i3 = i;
                                        while (i3 < jSONArray.length()) {
                                            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                            if (jSONObject2 != null) {
                                                View viewA = f.a(context).a(string + File.separator + jSONObject2.optString("name"));
                                                if (viewGroup != null && viewA != null) {
                                                    JSONObject jSONObject3 = jSONObject2.getJSONObject("layout");
                                                    if (jSONObject3 == null) {
                                                        viewGroup.addView(viewA, 3);
                                                    } else if (context != null && viewGroup != null && viewA != null && jSONObject3 != null) {
                                                        try {
                                                            String strOptString = jSONObject3.optString("parent_id");
                                                            ViewGroup viewGroup2 = !TextUtils.isEmpty(strOptString) ? (ViewGroup) f.a(context).a(viewGroup, strOptString) : viewGroup;
                                                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
                                                            if (layoutParams != null) {
                                                                String strOptString2 = jSONObject3.optString("below", "");
                                                                if (!TextUtils.isEmpty(strOptString2)) {
                                                                    layoutParams.addRule(3, strOptString2.hashCode());
                                                                }
                                                                String strOptString3 = jSONObject3.optString("left_of", "");
                                                                if (!TextUtils.isEmpty(strOptString3)) {
                                                                    layoutParams.addRule(i, strOptString3.hashCode());
                                                                }
                                                                String strOptString4 = jSONObject3.optString("right_of", "");
                                                                if (!TextUtils.isEmpty(strOptString4)) {
                                                                    layoutParams.addRule(1, strOptString4.hashCode());
                                                                }
                                                                int iOptInt = jSONObject3.optInt(FirebaseAnalytics.Param.INDEX, -2);
                                                                int iOptInt2 = jSONObject3.optInt("visibility", -1);
                                                                if (iOptInt2 != -1) {
                                                                    viewA.setVisibility(iOptInt2);
                                                                }
                                                                if (iOptInt != -2) {
                                                                    viewGroup2.addView(viewA, iOptInt, layoutParams);
                                                                } else {
                                                                    viewGroup2.addView(viewA, layoutParams);
                                                                }
                                                            }
                                                        } catch (Exception e) {
                                                            ad.b("DynamicViewCreator", e.getMessage());
                                                        }
                                                    }
                                                }
                                            }
                                            i3++;
                                            i = 0;
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                ad.b("DynamicViewCreator", e2.getMessage());
                            }
                        }
                    }
                }
                i2++;
                i = 0;
            } catch (Exception e3) {
                ad.b("DynamicViewCreator", e3.getMessage());
            }
        }
        return viewGroup;
    }
}
