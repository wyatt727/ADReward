package com.applovin.impl;

import android.util.Xml;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class gs {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.t f476a;
    private Stack b;
    private StringBuilder c;
    private long d;
    private b e;

    gs(com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            this.f476a = kVar.L();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    class a implements ContentHandler {
        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            String strTrim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
            if (StringUtils.isValidString(strTrim)) {
                gs.this.c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i, int i2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }

        a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            com.applovin.impl.sdk.t unused = gs.this.f476a;
            if (com.applovin.impl.sdk.t.a()) {
                gs.this.f476a.a("XmlParser", "Begin parsing...");
            }
            gs.this.d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - gs.this.d;
            com.applovin.impl.sdk.t unused = gs.this.f476a;
            if (com.applovin.impl.sdk.t.a()) {
                gs.this.f476a.a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                b bVar = !gs.this.b.isEmpty() ? (b) gs.this.b.peek() : null;
                b bVar2 = new b(str2, gs.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                gs.this.b.push(bVar2);
            } catch (Exception e) {
                com.applovin.impl.sdk.t unused = gs.this.f476a;
                if (com.applovin.impl.sdk.t.a()) {
                    gs.this.f476a.a("XmlParser", "Unable to process element <" + str2 + ">", e);
                }
                throw new SAXException("Failed to start element", e);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            gs gsVar = gs.this;
            gsVar.e = (b) gsVar.b.pop();
            gs.this.e.d(gs.this.c.toString().trim());
            gs.this.c.setLength(0);
        }
    }

    private static class b extends fs {
        b(String str, Map map, fs fsVar) {
            super(str, map, fsVar);
        }

        void d(String str) {
            this.d = str;
        }

        void a(fs fsVar) {
            if (fsVar != null) {
                this.e.add(fsVar);
                return;
            }
            throw new IllegalArgumentException("None specified.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap map = new HashMap(length);
            for (int i = 0; i < length; i++) {
                map.put(attributes.getQName(i), attributes.getValue(i));
            }
            return map;
        }
        return Collections.emptyMap();
    }

    public fs a(String str) throws SAXException {
        if (str != null) {
            this.c = new StringBuilder();
            this.b = new Stack();
            this.e = null;
            Xml.parse(str, new a());
            b bVar = this.e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    public static fs a(String str, com.applovin.impl.sdk.k kVar) {
        return new gs(kVar).a(str);
    }
}
