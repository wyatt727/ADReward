package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.v;
import java.util.Locale;

/* loaded from: classes4.dex */
public class MBAlertDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private Button f3909a;
    private Button b;
    private TextView c;
    private a d;
    private TextView e;

    public void makeDownloadAlert(String str) {
    }

    public void makeInsAlert(String str) {
    }

    public MBAlertDialog(Context context, final a aVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(v.a(context, "mbridge_cm_alertview", "layout"), (ViewGroup) null);
        this.d = aVar;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.e = (TextView) viewInflate.findViewById(v.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e) {
                ad.a("MBAlertDialog", e.getMessage());
            }
            try {
                this.c = (TextView) viewInflate.findViewById(v.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.b = (Button) viewInflate.findViewById(v.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f3909a = (Button) viewInflate.findViewById(v.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
            } catch (Exception e2) {
                ad.a("MBAlertDialog", e2.getMessage());
            }
        }
        Button button = this.f3909a;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBAlertDialog.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                    MBAlertDialog.this.cancel();
                    MBAlertDialog.this.clear();
                }
            });
        }
        Button button2 = this.b;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.widget.dialog.MBAlertDialog.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                    MBAlertDialog.this.cancel();
                    MBAlertDialog.this.clear();
                }
            });
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    public void clear() {
        if (this.d != null) {
            this.d = null;
        }
    }

    public a getListener() {
        return this.d;
    }

    public void makeIVAlertView(int i, String str) {
        try {
            String string = al.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = al.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = al.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = al.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3) || !TextUtils.isEmpty(string4)) {
                a(string, string2, string3, string4);
            } else {
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                    setTitle(i == com.mbridge.msdk.foundation.same.a.G ? "确认关闭？" : "提示");
                    setContent(i == com.mbridge.msdk.foundation.same.a.G ? "如果你选择继续，结束后将会获得奖励。确认关闭吗？" : "如果你选择继续，结束后将会获得奖励。是否继续？");
                    setConfirmText(i == com.mbridge.msdk.foundation.same.a.G ? "确认关闭" : "取消");
                    setCancelText("继续");
                } else {
                    setTitle(i == com.mbridge.msdk.foundation.same.a.G ? "Confirm" : "Tips");
                    setContent(i == com.mbridge.msdk.foundation.same.a.G ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?");
                    setConfirmText(i == com.mbridge.msdk.foundation.same.a.G ? "Close" : "Cancel");
                    setCancelText("Continue");
                }
            }
        } catch (Exception e) {
            ad.a("MBAlertDialog", e.getMessage());
        }
    }

    private void a(String str, String str2, String str3, String str4) {
        setTitle(str);
        setContent(str2);
        setConfirmText(str3);
        setCancelText(str4);
    }

    public void setTitle(String str) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setContent(String str) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setConfirmText(String str) {
        Button button = this.b;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setCancelText(String str) {
        Button button = this.f3909a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void makePlayableAlertView() {
        g gVarB = h.a().b(c.m().k());
        if (gVarB != null) {
            a(gVarB.w(), gVarB.u(), gVarB.v(), gVarB.s());
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
            setTitle("确认关闭？");
            setContent("关闭后您将不会获得任何奖励噢~ ");
            setConfirmText("确认关闭");
            setCancelText("继续试玩");
            return;
        }
        setTitle("Confirm to close? ");
        setContent("You will not be rewarded after closing the window");
        setConfirmText("Close it");
        setCancelText("Continue");
    }

    public void makeRVAlertView(String str) {
        try {
            String string = al.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = al.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = al.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = al.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            g gVarB = h.a().b(c.m().k());
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                if (gVarB != null) {
                    a(gVarB.w(), gVarB.u(), gVarB.v(), gVarB.t());
                    return;
                }
                String language = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                    setTitle("确认关闭？");
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                    setConfirmText("确认关闭");
                    setCancelText("继续观看");
                    return;
                }
                setTitle("Confirm to close? ");
                setContent("You will not be rewarded after closing the window");
                setConfirmText("Close it");
                setCancelText("Continue");
                return;
            }
            String language2 = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(string)) {
                if (gVarB != null) {
                    string = gVarB.w();
                } else if (!TextUtils.isEmpty(language2) && language2.equals("zh")) {
                    setTitle("确认关闭？");
                } else {
                    setTitle("Confirm to close? ");
                }
            }
            if (TextUtils.isEmpty(string2)) {
                if (gVarB != null) {
                    string2 = gVarB.u();
                } else if (!TextUtils.isEmpty(language2) && language2.equals("zh")) {
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                } else {
                    setContent("You will not be rewarded after closing the window");
                }
            }
            if (TextUtils.isEmpty(string4)) {
                if (gVarB != null) {
                    string4 = gVarB.v();
                } else if (!TextUtils.isEmpty(language2) && language2.equals("zh")) {
                    setConfirmText("确认关闭");
                } else {
                    setConfirmText("Close it");
                }
            }
            if (TextUtils.isEmpty(string3)) {
                if (gVarB != null) {
                    string3 = gVarB.t();
                } else if (!TextUtils.isEmpty(language2) && language2.equals("zh")) {
                    setCancelText("继续观看");
                } else {
                    setCancelText("Continue");
                }
            }
            a(string, string2, string4, string3);
        } catch (Exception e) {
            ad.a("MBAlertDialog", e.getMessage());
        }
    }

    public void onlyShow() {
        super.show();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e) {
            ad.b("MBAlertDialog", e.getMessage());
            super.show();
        }
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            if (Build.VERSION.SDK_INT >= 19) {
                window.addFlags(67108864);
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            } else {
                window.getDecorView().setSystemUiVisibility(2);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }
}
