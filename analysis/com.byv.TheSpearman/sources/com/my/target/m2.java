package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.my.target.common.models.ImageData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class m2 {
    public static final WeakHashMap<ImageView, ImageData> f = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public final List<ImageData> f4052a;
    public a b;
    public boolean c;
    public int d = 0;
    public String e;

    public interface a {
        void a(boolean z);
    }

    public m2(List<ImageData> list) {
        this.f4052a = list;
    }

    public static m2 a(ImageData imageData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(imageData);
        return new m2(arrayList);
    }

    public static m2 a(List<ImageData> list) {
        return new m2(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        c(context);
        a();
    }

    public static void a(Bitmap bitmap, ImageView imageView) {
        if (imageView instanceof i9) {
            ((i9) imageView).setImageBitmap(bitmap, true);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static void a(ImageData imageData, ImageView imageView) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ba.b("ImageLoader: Method cancel called from worker thread");
            return;
        }
        WeakHashMap<ImageView, ImageData> weakHashMap = f;
        if (weakHashMap.get(imageView) == imageData) {
            weakHashMap.remove(imageView);
        }
    }

    public static void a(final ImageData imageData, ImageView imageView, final a aVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ba.b("ImageLoader: Method loadAndDisplay called from worker thread");
            return;
        }
        WeakHashMap<ImageView, ImageData> weakHashMap = f;
        if (weakHashMap.get(imageView) == imageData) {
            return;
        }
        weakHashMap.remove(imageView);
        if (imageData.getBitmap() != null) {
            a(imageData.getBitmap(), imageView);
            return;
        }
        weakHashMap.put(imageView, imageData);
        final WeakReference weakReference = new WeakReference(imageView);
        a(imageData).a(new a() { // from class: com.my.target.m2$$ExternalSyntheticLambda0
            @Override // com.my.target.m2.a
            public final void a(boolean z) {
                m2.a(weakReference, imageData, aVar, z);
            }
        }).b(imageView.getContext());
    }

    public static /* synthetic */ void a(WeakReference weakReference, ImageData imageData, a aVar, boolean z) {
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            WeakHashMap<ImageView, ImageData> weakHashMap = f;
            if (imageData == weakHashMap.get(imageView)) {
                weakHashMap.remove(imageView);
                Bitmap bitmap = imageData.getBitmap();
                if (bitmap != null) {
                    a(bitmap, imageView);
                }
            }
        }
        if (aVar != null) {
            aVar.a(imageData.getBitmap() != null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(true);
            this.b = null;
        }
    }

    public static void b(ImageData imageData, ImageView imageView) {
        a(imageData, imageView, (a) null);
    }

    public m2 a(int i, String str) {
        this.d = i;
        this.e = str;
        return this;
    }

    public m2 a(a aVar) {
        this.b = aVar;
        return this;
    }

    public final void a() {
        if (this.b == null) {
            return;
        }
        c0.d(new Runnable() { // from class: com.my.target.m2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b();
            }
        });
    }

    public void a(String str, String str2, Context context) {
        z4 z4VarB = z4.a("Bad value").e(str).a(Math.max(this.d, 0)).b(str2);
        String str3 = this.e;
        if (str3 == null) {
            str3 = null;
        }
        z4VarB.c(str3).b(context);
    }

    public void b(Context context) {
        if (this.f4052a.isEmpty()) {
            a();
        } else {
            final Context applicationContext = context.getApplicationContext();
            c0.b(new Runnable() { // from class: com.my.target.m2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(applicationContext);
                }
            });
        }
    }

    public void c(Context context) {
        if (c0.a()) {
            ba.b("ImageLoader: Method loadSync called from main thread");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        y1 y1VarA = this.c ? y1.a() : y1.b();
        for (ImageData imageData : this.f4052a) {
            if (imageData.getBitmap() == null) {
                String url = imageData.getUrl();
                Bitmap bitmapC = y1VarA.a(url, (String) null, applicationContext).c();
                if (bitmapC != null) {
                    imageData.setData(bitmapC);
                    int width = bitmapC.getWidth();
                    int height = bitmapC.getHeight();
                    if (imageData.getHeight() == 0 || imageData.getWidth() == 0) {
                        imageData.setHeight(height);
                        imageData.setWidth(width);
                    }
                    int width2 = imageData.getWidth();
                    int height2 = imageData.getHeight();
                    if (width2 != width || height2 != height) {
                        String str = String.format(Locale.getDefault(), "JSON image params (%d x %d) differ than loaded bitmap params (%d x %d)", Integer.valueOf(width2), Integer.valueOf(height2), Integer.valueOf(width), Integer.valueOf(height));
                        ba.d(str);
                        a(str, url, context);
                    }
                }
            }
        }
    }
}
