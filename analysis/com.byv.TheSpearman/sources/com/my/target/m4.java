package com.my.target;

import android.content.Context;
import android.view.View;

/* loaded from: classes4.dex */
public interface m4 {

    public interface a {
        void a();

        void a(b bVar, Context context);

        void a(b bVar, View view);

        void a(b bVar, String str, Context context);
    }

    void a();

    void destroy();

    View getCloseButton();

    View i();

    void pause();

    void stop();
}
