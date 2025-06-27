package com.json.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MetaData {

    /* renamed from: a, reason: collision with root package name */
    private String f1970a;
    private List<String> b;
    private List<MetaDataValueTypes> c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f1970a = str;
        this.b = list;
        this.c = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f1970a = str;
        this.b = list;
        this.c = list2;
    }

    public String getMetaDataKey() {
        return this.f1970a;
    }

    public List<String> getMetaDataValue() {
        return this.b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.c;
    }
}
