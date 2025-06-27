package com.mbridge.msdk.out;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.same.c.c;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

/* loaded from: classes4.dex */
abstract class BaseCampaign implements c, NoProGuard, Serializable {
    public static final int TYPE_BIG = 3;
    public static final int TYPE_ICON = 2;
    public static final int TYPE_MB = 1;
    private static final long serialVersionUID = 1;
    public String adCall;
    private Drawable bigDrawable;
    private Drawable iconDrawable;
    private OnImageLoadListener mOnImageLoadListener;
    private Object nativead;
    private double rating;
    private String subType;
    private int adchoiceSizeHeight = 0;
    private int adchoiceSizeWidth = 0;
    private String appDesc = "";
    private String appName = "";
    private String iconUrl = "";
    private String id = "";
    private String imageUrl = "";
    private int numberRating = 33333;
    private String packageName = "";
    private String size = "";
    private long timestamp = 0;
    private int type = 1;
    private int videoLength = 0;
    private long creativeId = 0;

    @Override // com.mbridge.msdk.foundation.same.c.c
    public void onFailedLoad(String str, String str2) {
    }

    BaseCampaign() {
    }

    public String getAdCall() {
        return this.adCall;
    }

    public void setAdCall(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.adCall = str;
    }

    public int getAdchoiceSizeHeight() {
        return this.adchoiceSizeHeight;
    }

    public void setAdchoiceSizeHeight(int i) {
        this.adchoiceSizeHeight = i;
    }

    public int getAdchoiceSizeWidth() {
        return this.adchoiceSizeWidth;
    }

    public void setAdchoiceSizeWidth(int i) {
        this.adchoiceSizeWidth = i;
    }

    public String getAppDesc() {
        return this.appDesc;
    }

    public void setAppDesc(String str) {
        this.appDesc = str;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public Drawable getBigDrawable() {
        return this.bigDrawable;
    }

    public void setBigDrawable(Drawable drawable) {
        this.bigDrawable = drawable;
    }

    public Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    public void setIconDrawable(Drawable drawable) {
        this.iconDrawable = drawable;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public Object getNativead() {
        return this.nativead;
    }

    public void setNativead(Object obj) {
        this.nativead = obj;
    }

    public int getNumberRating() {
        return this.numberRating;
    }

    public void setNumberRating(int i) {
        if (i > 0) {
            this.numberRating = i;
        }
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double d) {
        this.rating = d;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String str) {
        this.size = str;
    }

    public String getSubType() {
        return this.subType;
    }

    public void setSubType(String str) {
        this.subType = str;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public int getVideoLength() {
        return this.videoLength;
    }

    public void setVideoLength(int i) {
        this.videoLength = i;
    }

    public void loadIconUrlAsyncWithBlock(OnImageLoadListener onImageLoadListener) {
        this.mOnImageLoadListener = onImageLoadListener;
        if (TextUtils.isEmpty(getIconUrl())) {
            return;
        }
        b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(getIconUrl(), this);
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void loadImageUrlAsyncWithBlock(OnImageLoadListener onImageLoadListener) {
        this.mOnImageLoadListener = onImageLoadListener;
        if (TextUtils.isEmpty(getImageUrl())) {
            return;
        }
        b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(getImageUrl(), this);
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    @Override // com.mbridge.msdk.foundation.same.c.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        if (!TextUtils.isEmpty(getImageUrl()) && getImageUrl().equals(str) && bitmap != null) {
            setBigDrawable(BitmapToDrawable(bitmap));
            OnImageLoadListener onImageLoadListener = this.mOnImageLoadListener;
            if (onImageLoadListener != null) {
                onImageLoadListener.loadSuccess(BitmapToDrawable(bitmap), 3);
            }
        }
        if (TextUtils.isEmpty(getIconUrl()) || getIconUrl() == null || !getIconUrl().equals(str) || bitmap == null) {
            return;
        }
        setIconDrawable(BitmapToDrawable(bitmap));
        OnImageLoadListener onImageLoadListener2 = this.mOnImageLoadListener;
        if (onImageLoadListener2 != null) {
            onImageLoadListener2.loadSuccess(BitmapToDrawable(bitmap), 2);
        }
    }

    private Drawable BitmapToDrawable(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    public void setOnImageLoadListener(OnImageLoadListener onImageLoadListener) {
        this.mOnImageLoadListener = onImageLoadListener;
    }

    public long getCreativeId() {
        return this.creativeId;
    }

    public void setCreativeId(long j) {
        this.creativeId = j;
    }
}
