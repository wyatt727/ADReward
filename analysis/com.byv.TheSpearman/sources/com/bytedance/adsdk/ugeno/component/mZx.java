package com.bytedance.adsdk.ugeno.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.EYQ.Td;
import com.bytedance.adsdk.ugeno.component.EYQ;
import com.bytedance.adsdk.ugeno.core.HX;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.IPb;
import com.bytedance.adsdk.ugeno.core.MxO;
import com.bytedance.adsdk.ugeno.core.QQ;
import com.bytedance.adsdk.ugeno.core.VwS;
import com.bytedance.adsdk.ugeno.core.hu;
import com.bytedance.adsdk.ugeno.core.mZx.Kbd;
import com.bytedance.adsdk.ugeno.core.mZx.Pm;
import com.bytedance.adsdk.ugeno.core.nWX;
import com.bytedance.adsdk.ugeno.core.pi;
import com.bytedance.adsdk.ugeno.core.tsL;
import com.bytedance.adsdk.ugeno.mZx.EYQ;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenWidget.java */
/* loaded from: classes2.dex */
public abstract class mZx<T extends View> implements pi.EYQ, pi.mZx, com.bytedance.adsdk.ugeno.mZx {
    private boolean CsQ;
    protected nWX Dal;
    private boolean Dd;
    private GradientDrawable EYQ;
    protected float FH;
    protected float FtN;
    private boolean GfQ;
    protected HX HX;
    private boolean Hnh;
    protected EYQ<ViewGroup> IPb;
    protected float KO;
    private boolean KR;
    protected int Kbc;
    protected T Kbd;
    protected String MxO;
    protected float NZ;
    private QQ Nuq;
    protected String Nvm;
    private boolean OnO;
    private Kbd OtA;
    protected float PI;
    protected float Pf;
    protected JSONObject Pm;
    protected IPb.EYQ QQ;
    private com.bytedance.adsdk.ugeno.core.EYQ TQF;
    private boolean TZE;
    private com.bytedance.adsdk.ugeno.core.mZx.mZx TZn;
    protected JSONObject Td;
    protected float Tnp;
    protected float UB;
    protected float Uc;
    private boolean VEW;
    private com.bytedance.adsdk.ugeno.core.mZx.EYQ VOV;
    protected EYQ<ViewGroup> VwS;
    protected float WU;
    private JSONObject XL;
    protected float XN;
    protected pi XPd;
    private hu by;
    private boolean dVQ;
    private boolean eFB;
    protected float hYh;
    protected float hu;
    protected float kf;
    protected boolean lEs;
    protected VwS lRN;
    protected int mN;
    protected Context mZx;
    protected float nWX;
    private EYQ.C0079EYQ na;
    protected float pi;
    protected boolean rfB;
    protected boolean tPj;
    protected String tp;
    protected float tr;
    protected float tsL;
    protected boolean vD;
    protected boolean wBa;
    private float wG;
    protected Map<Integer, MxO> wJ;
    private String wa;
    private String xh;
    protected int xt;
    protected float zF;

    public T Td() {
        return null;
    }

    public mZx(Context context) {
        this(context, null);
    }

    public mZx(Context context, EYQ<ViewGroup> eyq) {
        this.tsL = -2.0f;
        this.pi = -2.0f;
        this.Kbc = 0;
        this.vD = true;
        this.Hnh = true;
        this.TZE = false;
        this.CsQ = false;
        this.wG = 12.0f;
        this.mZx = context;
        this.IPb = eyq;
        this.wJ = new HashMap();
        this.EYQ = new GradientDrawable();
        this.Kbd = (T) Td();
    }

    public T HX() {
        return this.Kbd;
    }

    public void EYQ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        this.Pm = jSONObject;
        JSONObject jSONObject3 = this.Td;
        if (jSONObject3 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject3.keys();
        EYQ<ViewGroup> eyq = this.IPb;
        EYQ.C0075EYQ c0075eyqQQ = eyq instanceof EYQ ? eyq.QQ() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strEYQ = Td.EYQ(this.Td.optString(next), jSONObject);
            EYQ(next, strEYQ);
            if (c0075eyqQQ != null) {
                c0075eyqQQ.EYQ(this.mZx, next, strEYQ);
            }
        }
        if (c0075eyqQQ != null) {
            EYQ(c0075eyqQQ.EYQ());
        }
        JSONObject jSONObject4 = this.XL;
        if (jSONObject4 == null || (jSONObject2 = this.Pm) == null) {
            return;
        }
        try {
            jSONObject2.put("i18n", jSONObject4);
            Log.d("nxb", "id: " + this.tp + "; " + this.XL);
        } catch (JSONException unused) {
        }
    }

    public JSONObject tp() {
        return this.Pm;
    }

    public void mZx() {
        final Pm pm;
        EYQ();
        this.Kbd.setPadding((int) (this.tPj ? this.zF : this.hYh), (int) (this.rfB ? this.XN : this.hYh), (int) (this.wBa ? this.WU : this.hYh), (int) (this.lEs ? this.NZ : this.hYh));
        this.Kbd.setVisibility(this.Kbc);
        IPb.EYQ eyq = this.QQ;
        if (eyq != null && TextUtils.isEmpty(eyq.mZx())) {
            this.Kbd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.component.mZx.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (mZx.this.lRN != null) {
                        boolean unused = mZx.this.Hnh;
                    }
                }
            });
        } else if (EYQ(1) && !this.dVQ) {
            this.Kbd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.component.mZx.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (mZx.this.XPd == null || !mZx.this.Hnh) {
                        return;
                    }
                    pi piVar = mZx.this.XPd;
                    MxO mxO = mZx.this.wJ.get(1);
                    mZx mzx = mZx.this;
                    piVar.EYQ(mxO, mzx, mzx);
                }
            });
        }
        final com.bytedance.adsdk.ugeno.core.mZx.Td td = null;
        if (this.XPd == null || !EYQ(4)) {
            pm = null;
        } else if (EYQ(1)) {
            this.GfQ = true;
            pm = new Pm(this.mZx, this.wJ.get(4), this.wJ.get(1), this.GfQ);
        } else {
            pm = new Pm(this.mZx, this.wJ.get(4), this.GfQ);
        }
        if (this.XPd != null && EYQ(1) && this.dVQ) {
            td = new com.bytedance.adsdk.ugeno.core.mZx.Td(this.mZx, this.wJ.get(1));
        }
        if (this.XPd != null && EYQ(3)) {
            this.VOV = new com.bytedance.adsdk.ugeno.core.mZx.EYQ(this.mZx);
            new Object() { // from class: com.bytedance.adsdk.ugeno.component.mZx.3
            };
        }
        if (this.XPd != null && EYQ(9)) {
            Kbd kbd = new Kbd(this.mZx, this.wJ.get(9), this);
            this.OtA = kbd;
            kbd.EYQ(this.XPd);
        }
        if (EYQ(10)) {
            com.bytedance.adsdk.ugeno.core.mZx.mZx mzx = new com.bytedance.adsdk.ugeno.core.mZx.mZx(this.mZx, this.wJ.get(10), this);
            this.TZn = mzx;
            mzx.EYQ(this.XPd);
        }
        this.Kbd.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.adsdk.ugeno.component.mZx.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Pm pm2;
                com.bytedance.adsdk.ugeno.core.mZx.Td td2;
                if (mZx.this.Dal != null) {
                    mZx.this.Dal.EYQ(mZx.this, motionEvent);
                }
                if (mZx.this.EYQ(17) && motionEvent.getAction() == 0) {
                    pi piVar = mZx.this.XPd;
                    MxO mxO = mZx.this.wJ.get(17);
                    mZx mzx2 = mZx.this;
                    piVar.EYQ(mxO, mzx2, mzx2);
                }
                if (mZx.this.EYQ(1) && mZx.this.dVQ && mZx.this.XPd != null && (td2 = td) != null) {
                    return td2.EYQ(mZx.this.XPd, mZx.this, motionEvent);
                }
                if (mZx.this.XPd == null || (pm2 = pm) == null) {
                    return false;
                }
                return pm2.EYQ(mZx.this.XPd, mZx.this, motionEvent);
            }
        });
    }

    public void EYQ(hu huVar) {
        this.by = huVar;
    }

    @Override // com.bytedance.adsdk.ugeno.mZx
    public void IPb() {
        com.bytedance.adsdk.ugeno.core.EYQ eyq = this.TQF;
        if (eyq != null) {
            QQ qq = new QQ(this.Kbd, eyq);
            this.Nuq = qq;
            qq.EYQ();
        }
        if (this.TZn != null && EYQ(10)) {
            this.TZn.EYQ();
        }
        if (this.OtA == null || !EYQ(9)) {
            return;
        }
        this.OtA.EYQ();
    }

    @Override // com.bytedance.adsdk.ugeno.mZx
    public void VwS() {
        QQ qq = this.Nuq;
        if (qq != null) {
            qq.mZx();
        }
    }

    public boolean EYQ(int i) {
        Map<Integer, MxO> map = this.wJ;
        return map != null && map.containsKey(Integer.valueOf(i));
    }

    public void mZx(int i) {
        this.Kbd.setVisibility(i);
    }

    public void EYQ(nWX nwx) {
        this.Dal = nwx;
    }

    public void EYQ(pi piVar) {
        this.XPd = piVar;
    }

    public void mZx(JSONObject jSONObject) {
        this.Td = jSONObject;
    }

    public JSONObject MxO() {
        return this.Td;
    }

    private void EYQ() {
        if (TextUtils.isEmpty(this.Nvm)) {
            this.EYQ.setShape(0);
            if (this.KR) {
                EYQ.C0079EYQ c0079eyq = this.na;
                if (c0079eyq != null) {
                    this.EYQ.setOrientation(c0079eyq.EYQ);
                    if (Build.VERSION.SDK_INT >= 29) {
                        this.EYQ.setColors(this.na.mZx, this.na.Td);
                    } else {
                        this.EYQ.setColors(this.na.mZx);
                    }
                }
            } else {
                this.EYQ.setColor(this.xt);
            }
            this.EYQ.setCornerRadius(this.FH);
            this.EYQ.setStroke((int) this.kf, this.mN);
            this.Kbd.setBackground(this.EYQ);
            return;
        }
        if (this.Nvm.startsWith("local://")) {
            String strReplace = this.Nvm.replace("local://", "");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                options.inPurgeable = true;
                options.inInputShareable = true;
                this.Kbd.setBackground(new BitmapDrawable(this.mZx.getResources(), BitmapFactory.decodeStream(this.mZx.getResources().openRawResource(com.bytedance.adsdk.ugeno.mZx.Pm.mZx(this.mZx, strReplace)), null, options)));
            } catch (Throwable unused) {
            }
        }
    }

    public void EYQ(ViewGroup.LayoutParams layoutParams) {
        T t = this.Kbd;
        if (t != null) {
            t.setLayoutParams(layoutParams);
        }
    }

    public void EYQ(IPb.EYQ eyq) {
        this.QQ = eyq;
    }

    public mZx<T> mZx(String str) {
        return EYQ(str);
    }

    protected mZx<T> EYQ(String str) {
        if (TextUtils.isEmpty(this.tp) || !TextUtils.equals(this.tp, str)) {
            return null;
        }
        return this;
    }

    public EYQ tsL() {
        return this.IPb;
    }

    public void EYQ(EYQ eyq) {
        this.IPb = eyq;
    }

    public void Td(String str) {
        this.tp = str;
    }

    public String pi() {
        return this.tp;
    }

    public void Pm(String str) {
        this.MxO = str;
    }

    public String nWX() {
        return this.MxO;
    }

    public int KO() {
        return (int) this.tsL;
    }

    public int hu() {
        return (int) this.pi;
    }

    public void EYQ(HX hx) {
        this.HX = hx;
    }

    public boolean UB() {
        return this.vD;
    }

    public void EYQ(VwS vwS) {
        this.lRN = vwS;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void EYQ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    c = 0;
                    break;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c = 1;
                    break;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    c = 2;
                    break;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    c = 3;
                    break;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    c = 4;
                    break;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    c = 5;
                    break;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    c = 6;
                    break;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c = 7;
                    break;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    c = '\b';
                    break;
                }
                break;
            case -1055029545:
                if (str.equals("borderRightTopRadius")) {
                    c = '\t';
                    break;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    c = '\n';
                    break;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    c = 11;
                    break;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    c = '\f';
                    break;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    c = '\r';
                    break;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    c = 14;
                    break;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    c = 15;
                    break;
                }
                break;
            case -179345264:
                if (str.equals("borderLeftBottomRadius")) {
                    c = 16;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c = 17;
                    break;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    c = 18;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 19;
                    break;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c = 20;
                    break;
                }
                break;
            case 94750088:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                    c = 21;
                    break;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    c = 22;
                    break;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    c = 23;
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = 24;
                    break;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c = 25;
                    break;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    c = 26;
                    break;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c = 27;
                    break;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c = 28;
                    break;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c = 29;
                    break;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    c = 30;
                    break;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    c = 31;
                    break;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    c = ' ';
                    break;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    c = '!';
                    break;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    c = '\"';
                    break;
                }
                break;
            case 1259700532:
                if (str.equals("borderLeftTopRadius")) {
                    c = '#';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c = Typography.dollar;
                    break;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    c = '%';
                    break;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    c = Typography.amp;
                    break;
                }
                break;
            case 1691835405:
                if (str.equals("borderRightBottomRadius")) {
                    c = '\'';
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = '(';
                    break;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    c = ')';
                    break;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    c = '*';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.Hnh = com.bytedance.adsdk.ugeno.mZx.Td.EYQ(str2, true);
                break;
            case 1:
                this.zF = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                this.tPj = true;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 11:
            case 22:
            case 26:
            case 30:
            case ' ':
            case '\"':
            case '%':
            case '&':
                mZx(str, str2);
                break;
            case 6:
                if (com.bytedance.adsdk.ugeno.mZx.EYQ.Td(str2)) {
                    this.KR = true;
                    this.na = com.bytedance.adsdk.ugeno.mZx.EYQ.mZx(str2);
                    break;
                } else {
                    this.xt = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                    this.KR = false;
                    break;
                }
            case 7:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.pi = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.pi = -2.0f;
                } else {
                    this.pi = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                }
                this.CsQ = true;
                break;
            case '\b':
                this.nWX = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case '\t':
                this.FtN = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case '\n':
                this.UB = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case '\f':
                this.Nvm = str2;
                break;
            case '\r':
                this.hYh = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case 14:
                this.xh = str2;
                break;
            case 15:
                this.Uc = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case 16:
                this.Tnp = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case 17:
                this.tp = str2;
                break;
            case 18:
                this.XL = com.bytedance.adsdk.ugeno.mZx.mZx.EYQ(str2, (JSONObject) null);
                break;
            case 19:
                this.MxO = str2;
                break;
            case 20:
                this.XN = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                this.rfB = true;
                break;
            case 21:
                this.wa = str2;
                break;
            case 23:
                this.Pf = com.bytedance.adsdk.ugeno.mZx.Td.EYQ(str2, 0.0f);
                break;
            case 24:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.tsL = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.tsL = -2.0f;
                } else {
                    this.tsL = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                }
                this.TZE = true;
                break;
            case 25:
                this.NZ = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                this.lEs = true;
                break;
            case 27:
                this.WU = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                this.wBa = true;
                break;
            case 28:
                this.mN = com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(str2);
                break;
            case 29:
                this.kf = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case 31:
                this.hu = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case '!':
                this.TQF = com.bytedance.adsdk.ugeno.core.EYQ.EYQ(str2, this);
                break;
            case '#':
                this.tr = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case '$':
                this.FH = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case '\'':
                this.PI = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case '(':
                if (TextUtils.equals("visible", str2)) {
                    this.Kbc = 0;
                    break;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.Kbc = 4;
                    break;
                } else if (TextUtils.equals("gone", str2)) {
                    this.Kbc = 8;
                    break;
                }
                break;
            case ')':
                this.KO = com.bytedance.adsdk.ugeno.mZx.QQ.EYQ(this.mZx, str2);
                break;
            case '*':
                this.vD = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    protected void mZx(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.wJ == null) {
            return;
        }
        try {
            int iEYQ = tsL.EYQ(str).EYQ();
            MxO mxO = new MxO();
            mxO.EYQ(iEYQ);
            mxO.EYQ(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iEYQ == 3) {
                try {
                    this.wG = Float.parseFloat(Td.EYQ(jSONObject.optString("shakeAmplitude"), this.Pm));
                } catch (NumberFormatException unused) {
                    this.wG = 12.0f;
                }
            }
            pi piVar = this.XPd;
            if (!(piVar instanceof com.bytedance.adsdk.ugeno.core.EYQ.EYQ)) {
                EYQ(iEYQ, jSONObject, mxO);
            } else if (!((com.bytedance.adsdk.ugeno.core.EYQ.EYQ) piVar).EYQ()) {
                EYQ(iEYQ, jSONObject, mxO);
            } else {
                mxO.EYQ(jSONObject);
                this.wJ.put(Integer.valueOf(iEYQ), mxO);
            }
        } catch (JSONException unused2) {
        }
    }

    @Deprecated
    protected void EYQ(int i, JSONObject jSONObject, MxO mxO) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            MxO mxO2 = new MxO();
            mxO2.EYQ(jSONObjectOptJSONObject);
            mxO2.EYQ(this);
            mxO.EYQ(mxO2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(t2.f.e);
        if (jSONObjectOptJSONObject2 != null) {
            MxO mxO3 = new MxO();
            mxO3.EYQ(jSONObjectOptJSONObject2);
            mxO3.EYQ(this);
            mxO.mZx(mxO3);
        }
        mxO.EYQ(jSONObject);
        this.wJ.put(Integer.valueOf(i), mxO);
    }

    @Override // com.bytedance.adsdk.ugeno.mZx
    public void Pm() {
        if (this.by == null || this.VEW) {
            return;
        }
        this.VEW = true;
    }

    @Override // com.bytedance.adsdk.ugeno.mZx
    public void Kbd() {
        if (this.by == null || this.OnO) {
            return;
        }
        this.OnO = true;
    }

    @Override // com.bytedance.adsdk.ugeno.mZx
    public int[] EYQ(int i, int i2) {
        if (this.Pf > 0.0f) {
            if (this.TZE) {
                int size = View.MeasureSpec.getSize(i);
                float f = this.Pf;
                if (f != 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                }
            } else if (this.CsQ) {
                int size2 = View.MeasureSpec.getSize(i2);
                float f2 = this.Pf;
                if (f2 != 0.0f) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                }
            }
        }
        if (this.by != null && !this.Dd) {
            this.Dd = true;
        }
        return new int[]{i, i2};
    }

    @Override // com.bytedance.adsdk.ugeno.mZx
    public void EYQ(int i, int i2, int i3, int i4) {
        if (this.by == null || this.eFB) {
            return;
        }
        this.eFB = true;
    }

    @Override // com.bytedance.adsdk.ugeno.mZx
    public void EYQ(Canvas canvas, IAnimation iAnimation) {
        QQ qq = this.Nuq;
        if (qq != null) {
            qq.EYQ(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mZx
    public void mZx(int i, int i2, int i3, int i4) {
        QQ qq = this.Nuq;
        if (qq != null) {
            qq.EYQ(i, i2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.pi.mZx
    public void EYQ(MxO mxO) {
        EYQ<ViewGroup> eyq;
        mZx<T> mZx;
        if (mxO == null || mxO.Td() == null || !TextUtils.equals(mxO.Td().optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = mxO.Td().optString("nodeId");
        mZx(8);
        this.VwS = (EYQ) mZx(this);
        if (TextUtils.isEmpty(strOptString) || (eyq = this.VwS) == null || (mZx = eyq.mZx(strOptString)) == null) {
            return;
        }
        mZx.mZx(8);
    }

    public mZx mZx(mZx mzx) {
        return (mzx.tsL() == null && (mzx instanceof EYQ)) ? mzx : mZx(mzx.tsL());
    }
}
