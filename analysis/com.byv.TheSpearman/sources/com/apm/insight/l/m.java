package com.apm.insight.l;

import com.json.t2;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    final Writer f98a;
    private final List<a> b = new ArrayList();

    enum a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public m(Writer writer) {
        this.f98a = writer;
    }

    private void a(a aVar) {
        this.b.set(r0.size() - 1, aVar);
    }

    private void a(JSONArray jSONArray) throws JSONException, IOException {
        a();
        for (int i = 0; i < jSONArray.length(); i++) {
            a(jSONArray.get(i));
        }
        b();
    }

    public static void a(JSONArray jSONArray, Writer writer) throws JSONException, IOException {
        new m(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) throws JSONException {
        c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            a(next).a(jSONObject.get(next));
        }
        d();
    }

    public static void a(JSONObject jSONObject, Writer writer) throws JSONException, IOException {
        new m(writer).a(jSONObject);
        writer.flush();
    }

    private void b(String str) throws IOException {
        Writer writer;
        String str2;
        this.f98a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                writer = this.f98a;
                str2 = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"' || cCharAt == '/' || cCharAt == '\\') {
                    this.f98a.write(92);
                } else {
                    switch (cCharAt) {
                        case '\b':
                            writer = this.f98a;
                            str2 = "\\b";
                            break;
                        case '\t':
                            writer = this.f98a;
                            str2 = "\\t";
                            break;
                        case '\n':
                            writer = this.f98a;
                            str2 = "\\n";
                            break;
                        default:
                            if (cCharAt <= 31) {
                                this.f98a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                                break;
                            }
                            break;
                    }
                }
                this.f98a.write(cCharAt);
            } else {
                writer = this.f98a;
                str2 = "\\r";
            }
            writer.write(str2);
        }
        this.f98a.write("\"");
    }

    private a e() {
        return this.b.get(r0.size() - 1);
    }

    private void f() throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.NONEMPTY_OBJECT) {
            this.f98a.write(44);
        } else if (aVarE != a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        a(a.DANGLING_KEY);
    }

    private void g() throws JSONException, IOException {
        a aVar;
        if (this.b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.EMPTY_ARRAY) {
            aVar = a.NONEMPTY_ARRAY;
        } else if (aVarE == a.NONEMPTY_ARRAY) {
            this.f98a.write(44);
            return;
        } else if (aVarE != a.DANGLING_KEY) {
            if (aVarE != a.NULL) {
                throw new JSONException("Nesting problem");
            }
            return;
        } else {
            this.f98a.write(":");
            aVar = a.NONEMPTY_OBJECT;
        }
        a(aVar);
    }

    public m a() {
        return a(a.EMPTY_ARRAY, t2.i.d);
    }

    m a(a aVar, a aVar2, String str) throws IOException {
        e();
        this.b.remove(r1.size() - 1);
        this.f98a.write(str);
        return this;
    }

    m a(a aVar, String str) throws JSONException, IOException {
        g();
        this.b.add(aVar);
        this.f98a.write(str);
        return this;
    }

    public m a(Object obj) throws JSONException, IOException {
        Writer writer;
        String strNumberToString;
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        }
        g();
        if (obj == null || obj == JSONObject.NULL) {
            this.f98a.write(AbstractJsonLexerKt.NULL);
        } else {
            if (obj instanceof Boolean) {
                writer = this.f98a;
                strNumberToString = String.valueOf(obj);
            } else if (obj instanceof Number) {
                writer = this.f98a;
                strNumberToString = JSONObject.numberToString((Number) obj);
            } else {
                b(obj.toString());
            }
            writer.write(strNumberToString);
        }
        return this;
    }

    public m a(String str) throws JSONException, IOException {
        f();
        b(str);
        return this;
    }

    public m b() {
        return a(a.EMPTY_ARRAY, a.NONEMPTY_ARRAY, t2.i.e);
    }

    public m c() {
        return a(a.EMPTY_OBJECT, "{");
    }

    public m d() {
        return a(a.EMPTY_OBJECT, a.NONEMPTY_OBJECT, "}");
    }

    public String toString() {
        return "";
    }
}
