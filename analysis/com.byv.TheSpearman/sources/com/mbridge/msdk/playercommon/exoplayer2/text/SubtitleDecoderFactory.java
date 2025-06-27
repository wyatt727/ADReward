package com.mbridge.msdk.playercommon.exoplayer2.text;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.text.cea.Cea608Decoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.cea.Cea708Decoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.dvb.DvbDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.pgs.PgsDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.ssa.SsaDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.subrip.SubripDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.tx3g.Tx3gDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.webvtt.Mp4WebvttDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.webvtt.WebvttDecoder;

/* loaded from: classes4.dex */
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = new SubtitleDecoderFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderFactory.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderFactory
        public SubtitleDecoder createDecoder(Format format) {
            String str = format.sampleMimeType;
            str.hashCode();
            switch (str) {
                case "application/dvbsubs":
                    return new DvbDecoder(format.initializationData);
                case "application/pgs":
                    return new PgsDecoder();
                case "application/x-mp4-vtt":
                    return new Mp4WebvttDecoder();
                case "text/vtt":
                    return new WebvttDecoder();
                case "application/x-quicktime-tx3g":
                    return new Tx3gDecoder(format.initializationData);
                case "text/x-ssa":
                    return new SsaDecoder(format.initializationData);
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new Cea608Decoder(format.sampleMimeType, format.accessibilityChannel);
                case "application/cea-708":
                    return new Cea708Decoder(format.accessibilityChannel);
                case "application/x-subrip":
                    return new SubripDecoder();
                case "application/ttml+xml":
                    return new TtmlDecoder();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    };

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
