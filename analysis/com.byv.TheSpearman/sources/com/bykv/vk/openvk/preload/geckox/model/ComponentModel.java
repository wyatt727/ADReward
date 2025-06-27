package com.bykv.vk.openvk.preload.geckox.model;

import com.bykv.vk.openvk.preload.a.a.c;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ComponentModel {

    @c(a = "packages")
    private Map<String, List<UpdatePackage>> packages;

    @c(a = "universal_strategies")
    private Map<String, b> universalStrategies;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @c(a = "c")
        public String f1425a;

        @c(a = "clean_type")
        public int b;

        @c(a = "version")
        public List<Long> c;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @c(a = "specified_clean")
        public List<a> f1426a;
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, b> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
