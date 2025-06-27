package com.mbridge.msdk.foundation.download.download;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.same.e.b;

/* loaded from: classes4.dex */
public class DownloadTask {
    private b mLoader;

    private DownloadTask() {
        init();
    }

    private void init() {
        if (c.m().c() != null) {
            this.mLoader = new b(c.m().c());
        }
    }

    public static DownloadTask getInstance() {
        return DownloadTaskHolder.instance;
    }

    public void runTask(a aVar) {
        b bVar = this.mLoader;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    private static class DownloadTaskHolder {
        public static DownloadTask instance = new DownloadTask();

        private DownloadTaskHolder() {
        }
    }
}
