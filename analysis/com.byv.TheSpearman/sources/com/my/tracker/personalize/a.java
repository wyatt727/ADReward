package com.my.tracker.personalize;

import java.util.List;

/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    final String f4279a;
    final String b;

    a(String str, String str2, List<String> list) {
        this.f4279a = str;
        this.b = (list == null || str2 == null || !list.contains(str2)) ? "https://mlapi.tracker.my.com" : "https://beta.ml.tracker.my.com";
    }
}
