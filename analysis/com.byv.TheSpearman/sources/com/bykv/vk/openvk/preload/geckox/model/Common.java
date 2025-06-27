package com.bykv.vk.openvk.preload.geckox.model;

import android.os.Build;
import com.bykv.vk.openvk.preload.a.a.c;
import com.json.i5;

/* loaded from: classes2.dex */
public class Common {

    @c(a = "ac")
    public String ac;

    @c(a = "aid")
    public long aid;

    @c(a = "app_name")
    public String appName;

    @c(a = "app_version")
    public String appVersion;

    @c(a = "device_id")
    public String deviceId;

    @c(a = "device_model")
    public String deviceModel;

    @c(a = "device_platform")
    public String devicePlatform;

    @c(a = i5.x)
    public int os = 0;

    @c(a = "os_version")
    public String osVersion;

    @c(a = "region")
    public String region;

    @c(a = "sdk_version")
    public String sdkVersion;

    @c(a = "uid")
    public String uid;

    public Common(long j, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        this.osVersion = sb.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
    }

    public Common(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        this.osVersion = sb.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
        this.uid = str5;
        this.region = str6;
    }
}
