package com.my.target.common.models.videomotion;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class VideoMotionData {
    public final Disclaimer disclaimer;
    public final Header header;
    public final List<VideoMotionItem> videoMotionItemList;

    public VideoMotionData(Header header, List<VideoMotionItem> list, Disclaimer disclaimer) {
        this.header = header;
        this.videoMotionItemList = list;
        this.disclaimer = disclaimer;
    }

    public String toString() {
        return "VideoMotionData{header=" + this.header + ", videoMotionItemList=" + this.videoMotionItemList + ", disclaimer=" + this.disclaimer + AbstractJsonLexerKt.END_OBJ;
    }
}
