package com.my.target.common.models;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.my.target.ba;
import com.my.target.core.models.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class ImageData extends a<Bitmap> {
    private static final int MIN_CACHE_SIZE = 5242880;
    private volatile boolean useCache;
    private static final int DEFAULT_CACHE_SIZE = 31457280;
    private static volatile LruCache<String, Bitmap> memcache = new BitmapCache(DEFAULT_CACHE_SIZE);

    public static class BitmapCache extends LruCache<String, Bitmap> {
        public BitmapCache(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    private ImageData(String str) {
        super(str);
    }

    private ImageData(String str, int i, int i2) {
        super(str);
        this.width = i;
        this.height = i2;
    }

    public static void clearCache() {
        memcache.evictAll();
    }

    public static ImageData newImageData(String str) {
        return new ImageData(str);
    }

    public static ImageData newImageData(String str, int i, int i2) {
        return new ImageData(str, i, i2);
    }

    public static void setCacheSize(int i) {
        if (i < MIN_CACHE_SIZE) {
            ba.a("ImageData: Setting cache size ignored - size should be >= 5242880");
        } else {
            memcache.resize(i);
        }
    }

    @Override // com.my.target.core.models.a
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ImageData.class == obj.getClass() && super.equals(obj) && this.useCache == ((ImageData) obj).useCache;
    }

    public Bitmap getBitmap() {
        return getData();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.my.target.core.models.a
    public Bitmap getData() {
        return (Bitmap) (this.useCache ? memcache.get(this.url) : super.getData());
    }

    public boolean isUseCache() {
        return this.useCache;
    }

    public void setBitmap(Bitmap bitmap) {
        setData(bitmap);
    }

    @Override // com.my.target.core.models.a
    public void setData(Bitmap bitmap) {
        if (!this.useCache) {
            super.setData((ImageData) bitmap);
        } else if (bitmap == null) {
            memcache.remove(this.url);
        } else {
            memcache.put(this.url, bitmap);
        }
    }

    public String toString() {
        return "ImageData{url='" + this.url + "', width=" + this.width + ", height=" + this.height + ", bitmap=" + getData() + AbstractJsonLexerKt.END_OBJ;
    }

    public void useCache(boolean z) {
        if (z == this.useCache) {
            return;
        }
        this.useCache = z;
        if (!z) {
            super.setData((ImageData) memcache.remove(this.url));
            return;
        }
        Bitmap bitmap = (Bitmap) super.getData();
        if (bitmap != null) {
            super.setData((ImageData) null);
            memcache.put(this.url, bitmap);
        }
    }
}
