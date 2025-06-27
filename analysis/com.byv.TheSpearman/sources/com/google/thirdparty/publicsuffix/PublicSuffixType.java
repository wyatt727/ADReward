package com.google.thirdparty.publicsuffix;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public enum PublicSuffixType {
    PRIVATE(AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.COMMA),
    REGISTRY('!', '?');

    private final char innerNodeCode;
    private final char leafNodeCode;

    PublicSuffixType(char c, char c2) {
        this.innerNodeCode = c;
        this.leafNodeCode = c2;
    }

    char getLeafNodeCode() {
        return this.leafNodeCode;
    }

    char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    static PublicSuffixType fromCode(char c) {
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.getInnerNodeCode() == c || publicSuffixType.getLeafNodeCode() == c) {
                return publicSuffixType;
            }
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("No enum corresponding to given code: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }
}
