package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.container.CreationTime;
import com.google.android.exoplayer2.container.Mp4LocationData;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

@Deprecated
/* loaded from: classes2.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    private interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static boolean canTrimSamplesWithTimestampChange(int i) {
        return i != 1;
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static final class UdtaInfo {
        public final Metadata metaMetadata;
        public final Metadata smtaMetadata;
        public final Metadata xyzMetadata;

        public UdtaInfo(Metadata metadata, Metadata metadata2, Metadata metadata3) {
            this.metaMetadata = metadata;
            this.smtaMetadata = metadata2;
            this.xyzMetadata = metadata3;
        }
    }

    public static final class MvhdInfo {
        public final Metadata metadata;
        public final long timescale;

        public MvhdInfo(Metadata metadata, long j) {
            this.metadata = metadata;
            this.timescale = j;
        }
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z, boolean z2, Function<Track, Track> function) throws ParserException {
        Track trackApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerAtom.containerChildren.size(); i++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i);
            if (containerAtom2.type == 1953653099 && (trackApply = function.apply(parseTrak(containerAtom2, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(trackApply, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia))).getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static UdtaInfo parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata udtaMeta = null;
        Metadata smta = null;
        Metadata xyz = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i = parsableByteArray.readInt();
            int i2 = parsableByteArray.readInt();
            if (i2 == 1835365473) {
                parsableByteArray.setPosition(position);
                udtaMeta = parseUdtaMeta(parsableByteArray, position + i);
            } else if (i2 == 1936553057) {
                parsableByteArray.setPosition(position);
                smta = parseSmta(parsableByteArray, position + i);
            } else if (i2 == -1451722374) {
                xyz = parseXyz(parsableByteArray);
            }
            parsableByteArray.setPosition(position + i);
        }
        return new UdtaInfo(udtaMeta, smta, xyz);
    }

    public static MvhdInfo parseMvhd(ParsableByteArray parsableByteArray) {
        long unsignedInt;
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
            parsableByteArray.skipBytes(4);
        } else {
            long j = parsableByteArray.readLong();
            parsableByteArray.skipBytes(8);
            unsignedInt = j;
        }
        return new MvhdInfo(new Metadata(new CreationTime((unsignedInt - 2082844800) * 1000)), parsableByteArray.readUnsignedInt());
    }

    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_hdlr);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_keys);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_ilst);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int i = parsableByteArray.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i2] = parsableByteArray.readString(i3 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i4 = parsableByteArray2.readInt();
            int i5 = parsableByteArray2.readInt() - 1;
            if (i5 >= 0 && i5 < i) {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i4, strArr[i5]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            } else {
                Log.w(TAG, "Skipped metadata with unknown key index: " + i5);
            }
            parsableByteArray2.setPosition(position + i4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        Atom.LeafAtom leafAtom2;
        long j2;
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> edts;
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(Atom.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd))).data);
        if (j == -9223372036854775807L) {
            leafAtom2 = leafAtom;
            j2 = tkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j2 = j;
        }
        long j3 = parseMvhd(leafAtom2.data).timescale;
        long jScaleLargeTimestamp = j2 != -9223372036854775807L ? Util.scaleLargeTimestamp(j2, 1000000L, j3) : -9223372036854775807L;
        Atom.ContainerAtom containerAtom3 = (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(Atom.TYPE_minf))).getContainerAtomOfType(Atom.TYPE_stbl));
        Pair<Long, String> mdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(Atom.TYPE_mdhd))).data);
        Atom.LeafAtom leafAtomOfType = containerAtom3.getLeafAtomOfType(Atom.TYPE_stsd);
        if (leafAtomOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData stsd = parseStsd(leafAtomOfType.data, tkhd.id, tkhd.rotationDegrees, (String) mdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_edts)) == null || (edts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        return new Track(tkhd.id, trackTypeForHdlr, ((Long) mdhd.first).longValue(), j3, jScaleLargeTimestamp, stsd.format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0478  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.extractor.mp4.TrackSampleTable parseStbl(com.google.android.exoplayer2.extractor.mp4.Track r37, com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r38, com.google.android.exoplayer2.extractor.GaplessInfoHolder r39) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseStbl(com.google.android.exoplayer2.extractor.mp4.Track, com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom, com.google.android.exoplayer2.extractor.GaplessInfoHolder):com.google.android.exoplayer2.extractor.mp4.TrackSampleTable");
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i2);
            }
            parsableByteArray.setPosition(position + i2);
        }
        return null;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short s = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String string = parsableByteArray.readString(s);
        int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static Metadata parseSmta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (i2 < 14) {
                    return null;
                }
                parsableByteArray.skipBytes(5);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                if (unsignedByte != 12 && unsignedByte != 13) {
                    return null;
                }
                float f = unsignedByte == 12 ? 240.0f : 120.0f;
                parsableByteArray.skipBytes(1);
                return new Metadata(new SmtaMetadataEntry(f, parsableByteArray.readUnsignedByte()));
            }
            parsableByteArray.setPosition(position + i2);
        }
        return null;
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        boolean z;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i2 = fullAtomVersion == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                z = true;
                break;
            }
            if (parsableByteArray.getData()[position + i4] != -1) {
                z = false;
                break;
            }
            i4++;
        }
        long j = -9223372036854775807L;
        if (z) {
            parsableByteArray.skipBytes(i2);
        } else {
            long unsignedInt = fullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
            if (unsignedInt != 0) {
                j = unsignedInt;
            }
        }
        parsableByteArray.skipBytes(16);
        int i5 = parsableByteArray.readInt();
        int i6 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i7 = parsableByteArray.readInt();
        int i8 = parsableByteArray.readInt();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = 270;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = Opcodes.GETFIELD;
        }
        return new TkhdData(i, j, i3);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        int i3;
        parsableByteArray.setPosition(12);
        int i4 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            int position = parsableByteArray.getPosition();
            int i6 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i6 > 0, "childAtomSize must be positive");
            int i7 = parsableByteArray.readInt();
            if (i7 == 1635148593 || i7 == 1635148595 || i7 == 1701733238 || i7 == 1831958048 || i7 == 1836070006 || i7 == 1752589105 || i7 == 1751479857 || i7 == 1932670515 || i7 == 1211250227 || i7 == 1987063864 || i7 == 1987063865 || i7 == 1635135537 || i7 == 1685479798 || i7 == 1685479729 || i7 == 1685481573 || i7 == 1685481521) {
                i3 = position;
                parseVideoSampleEntry(parsableByteArray, i7, i3, i6, i, i2, drmInitData, stsdData, i5);
            } else if (i7 == 1836069985 || i7 == 1701733217 || i7 == 1633889587 || i7 == 1700998451 || i7 == 1633889588 || i7 == 1835823201 || i7 == 1685353315 || i7 == 1685353317 || i7 == 1685353320 || i7 == 1685353324 || i7 == 1685353336 || i7 == 1935764850 || i7 == 1935767394 || i7 == 1819304813 || i7 == 1936684916 || i7 == 1953984371 || i7 == 778924082 || i7 == 778924083 || i7 == 1835557169 || i7 == 1835560241 || i7 == 1634492771 || i7 == 1634492791 || i7 == 1970037111 || i7 == 1332770163 || i7 == 1716281667) {
                i3 = position;
                parseAudioSampleEntry(parsableByteArray, i7, position, i6, i, str, z, drmInitData, stsdData, i5);
            } else {
                if (i7 == 1414810956 || i7 == 1954034535 || i7 == 2004251764 || i7 == 1937010800 || i7 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, i7, position, i6, i, str, stsdData);
                } else if (i7 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray, i7, position, i, stsdData);
                } else if (i7 == 1667329389) {
                    stsdData.format = new Format.Builder().setId(i).setSampleMimeType("application/x-camera-motion").build();
                }
                i3 = position;
            }
            parsableByteArray.setPosition(i3 + i6);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListOf = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableListOf = ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableListOf).build();
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        DrmInitData drmInitData2;
        int i7;
        int i8;
        int i9;
        float f;
        List<byte[]> list;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        int i13 = i2;
        int i14 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i13 + 8 + 8);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i13, i14);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i6] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float paspFromParent = 1.0f;
        int iIsoColorPrimariesToColorSpace = -1;
        String str5 = null;
        List<byte[]> listOf = null;
        byte[] projFromParent = null;
        int i15 = -1;
        int i16 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        EsdsData esdsFromParent = null;
        boolean z = false;
        while (true) {
            if (position - i13 >= i14) {
                drmInitData2 = drmInitDataCopyWithSchemeType;
                break;
            }
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            String str6 = str3;
            int i17 = parsableByteArray.readInt();
            if (i17 == 0) {
                drmInitData2 = drmInitDataCopyWithSchemeType;
                if (parsableByteArray.getPosition() - i13 == i14) {
                    break;
                }
            } else {
                drmInitData2 = drmInitDataCopyWithSchemeType;
            }
            ExtractorUtil.checkContainerInput(i17 > 0, "childAtomSize must be positive");
            int i18 = parsableByteArray.readInt();
            if (i18 == 1635148611) {
                ExtractorUtil.checkContainerInput(str4 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                listOf = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                str5 = avcConfig.codecs;
                iIsoColorPrimariesToColorSpace = avcConfig.colorSpace;
                i11 = avcConfig.colorRange;
                i12 = avcConfig.colorTransfer;
                str2 = "video/avc";
            } else if (i18 == 1752589123) {
                ExtractorUtil.checkContainerInput(str4 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                listOf = hevcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = hevcConfig.pixelWidthHeightRatio;
                }
                str5 = hevcConfig.codecs;
                iIsoColorPrimariesToColorSpace = hevcConfig.colorSpace;
                i11 = hevcConfig.colorRange;
                i12 = hevcConfig.colorTransfer;
                str2 = "video/hevc";
            } else {
                if (i18 == 1685480259 || i18 == 1685485123) {
                    i7 = unsignedShort;
                    i8 = unsignedShort2;
                    i9 = iIntValue;
                    f = paspFromParent;
                    list = listOf;
                    i10 = iIsoTransferCharacteristicsToColorTransfer;
                    DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                    if (dolbyVisionConfig != null) {
                        str5 = dolbyVisionConfig.codecs;
                        str4 = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                } else {
                    if (i18 == 1987076931) {
                        ExtractorUtil.checkContainerInput(str4 == null, null);
                        str = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        parsableByteArray.setPosition(position2 + 12);
                        parsableByteArray.skipBytes(2);
                        boolean z2 = (parsableByteArray.readUnsignedByte() & 1) != 0;
                        int unsignedByte = parsableByteArray.readUnsignedByte();
                        int unsignedByte2 = parsableByteArray.readUnsignedByte();
                        iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedByte);
                        i16 = z2 ? 1 : 2;
                        iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedByte2);
                    } else if (i18 == 1635135811) {
                        ExtractorUtil.checkContainerInput(str4 == null, null);
                        str = "video/av01";
                    } else if (i18 == 1668050025) {
                        if (byteBufferAllocateHdrStaticInfo == null) {
                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                        byteBuffer.position(21);
                        byteBuffer.putShort(parsableByteArray.readShort());
                        byteBuffer.putShort(parsableByteArray.readShort());
                        byteBufferAllocateHdrStaticInfo = byteBuffer;
                        i7 = unsignedShort;
                        i8 = unsignedShort2;
                        i9 = iIntValue;
                        position += i17;
                        i13 = i2;
                        i14 = i3;
                        stsdData2 = stsdData;
                        str3 = str6;
                        drmInitDataCopyWithSchemeType = drmInitData2;
                        iIntValue = i9;
                        unsignedShort2 = i8;
                        unsignedShort = i7;
                    } else if (i18 == 1835295606) {
                        if (byteBufferAllocateHdrStaticInfo == null) {
                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                        short s = parsableByteArray.readShort();
                        short s2 = parsableByteArray.readShort();
                        short s3 = parsableByteArray.readShort();
                        i9 = iIntValue;
                        short s4 = parsableByteArray.readShort();
                        short s5 = parsableByteArray.readShort();
                        List<byte[]> list2 = listOf;
                        short s6 = parsableByteArray.readShort();
                        float f2 = paspFromParent;
                        short s7 = parsableByteArray.readShort();
                        i8 = unsignedShort2;
                        short s8 = parsableByteArray.readShort();
                        long unsignedInt = parsableByteArray.readUnsignedInt();
                        long unsignedInt2 = parsableByteArray.readUnsignedInt();
                        i7 = unsignedShort;
                        byteBuffer2.position(1);
                        byteBuffer2.putShort(s5);
                        byteBuffer2.putShort(s6);
                        byteBuffer2.putShort(s);
                        byteBuffer2.putShort(s2);
                        byteBuffer2.putShort(s3);
                        byteBuffer2.putShort(s4);
                        byteBuffer2.putShort(s7);
                        byteBuffer2.putShort(s8);
                        byteBuffer2.putShort((short) (unsignedInt / 10000));
                        byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                        byteBufferAllocateHdrStaticInfo = byteBuffer2;
                        listOf = list2;
                        paspFromParent = f2;
                        position += i17;
                        i13 = i2;
                        i14 = i3;
                        stsdData2 = stsdData;
                        str3 = str6;
                        drmInitDataCopyWithSchemeType = drmInitData2;
                        iIntValue = i9;
                        unsignedShort2 = i8;
                        unsignedShort = i7;
                    } else {
                        i7 = unsignedShort;
                        i8 = unsignedShort2;
                        i9 = iIntValue;
                        f = paspFromParent;
                        list = listOf;
                        if (i18 == 1681012275) {
                            ExtractorUtil.checkContainerInput(str4 == null, null);
                            str4 = str6;
                        } else if (i18 == 1702061171) {
                            ExtractorUtil.checkContainerInput(str4 == null, null);
                            esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                            String str7 = esdsFromParent.mimeType;
                            byte[] bArr = esdsFromParent.initializationData;
                            listOf = bArr != null ? ImmutableList.of(bArr) : list;
                            str4 = str7;
                            paspFromParent = f;
                            position += i17;
                            i13 = i2;
                            i14 = i3;
                            stsdData2 = stsdData;
                            str3 = str6;
                            drmInitDataCopyWithSchemeType = drmInitData2;
                            iIntValue = i9;
                            unsignedShort2 = i8;
                            unsignedShort = i7;
                        } else if (i18 == 1885434736) {
                            paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                            listOf = list;
                            z = true;
                            position += i17;
                            i13 = i2;
                            i14 = i3;
                            stsdData2 = stsdData;
                            str3 = str6;
                            drmInitDataCopyWithSchemeType = drmInitData2;
                            iIntValue = i9;
                            unsignedShort2 = i8;
                            unsignedShort = i7;
                        } else if (i18 == 1937126244) {
                            projFromParent = parseProjFromParent(parsableByteArray, position2, i17);
                        } else if (i18 == 1936995172) {
                            int unsignedByte3 = parsableByteArray.readUnsignedByte();
                            parsableByteArray.skipBytes(3);
                            if (unsignedByte3 == 0) {
                                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                                if (unsignedByte4 == 0) {
                                    i15 = 0;
                                } else if (unsignedByte4 == 1) {
                                    i15 = 1;
                                } else if (unsignedByte4 == 2) {
                                    i15 = 2;
                                } else if (unsignedByte4 == 3) {
                                    i15 = 3;
                                }
                            }
                        } else if (i18 == 1668246642 && iIsoColorPrimariesToColorSpace == -1) {
                            i10 = iIsoTransferCharacteristicsToColorTransfer;
                            if (i10 == -1) {
                                int i19 = parsableByteArray.readInt();
                                if (i19 == TYPE_nclx || i19 == TYPE_nclc) {
                                    int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                    parsableByteArray.skipBytes(2);
                                    boolean z3 = i17 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                    iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                    i16 = z3 ? 1 : 2;
                                    iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                } else {
                                    Log.w(TAG, "Unsupported color type: " + Atom.getAtomTypeString(i19));
                                }
                            }
                            position += i17;
                            i13 = i2;
                            i14 = i3;
                            stsdData2 = stsdData;
                            str3 = str6;
                            drmInitDataCopyWithSchemeType = drmInitData2;
                            iIntValue = i9;
                            unsignedShort2 = i8;
                            unsignedShort = i7;
                        } else {
                            i10 = iIsoTransferCharacteristicsToColorTransfer;
                        }
                        listOf = list;
                        paspFromParent = f;
                        position += i17;
                        i13 = i2;
                        i14 = i3;
                        stsdData2 = stsdData;
                        str3 = str6;
                        drmInitDataCopyWithSchemeType = drmInitData2;
                        iIntValue = i9;
                        unsignedShort2 = i8;
                        unsignedShort = i7;
                    }
                    str4 = str;
                    i7 = unsignedShort;
                    i8 = unsignedShort2;
                    i9 = iIntValue;
                    position += i17;
                    i13 = i2;
                    i14 = i3;
                    stsdData2 = stsdData;
                    str3 = str6;
                    drmInitDataCopyWithSchemeType = drmInitData2;
                    iIntValue = i9;
                    unsignedShort2 = i8;
                    unsignedShort = i7;
                }
                iIsoTransferCharacteristicsToColorTransfer = i10;
                listOf = list;
                paspFromParent = f;
                position += i17;
                i13 = i2;
                i14 = i3;
                stsdData2 = stsdData;
                str3 = str6;
                drmInitDataCopyWithSchemeType = drmInitData2;
                iIntValue = i9;
                unsignedShort2 = i8;
                unsignedShort = i7;
            }
            iIsoTransferCharacteristicsToColorTransfer = i12;
            i16 = i11;
            i7 = unsignedShort;
            i8 = unsignedShort2;
            str4 = str2;
            i9 = iIntValue;
            position += i17;
            i13 = i2;
            i14 = i3;
            stsdData2 = stsdData;
            str3 = str6;
            drmInitDataCopyWithSchemeType = drmInitData2;
            iIntValue = i9;
            unsignedShort2 = i8;
            unsignedShort = i7;
        }
        int i20 = unsignedShort;
        int i21 = unsignedShort2;
        float f3 = paspFromParent;
        List<byte[]> list3 = listOf;
        int i22 = iIsoTransferCharacteristicsToColorTransfer;
        if (str4 == null) {
            return;
        }
        Format.Builder drmInitData3 = new Format.Builder().setId(i4).setSampleMimeType(str4).setCodecs(str5).setWidth(i20).setHeight(i21).setPixelWidthHeightRatio(f3).setRotationDegrees(i5).setProjectionData(projFromParent).setStereoMode(i15).setInitializationData(list3).setDrmInitData(drmInitData2);
        int i23 = i16;
        if (iIsoColorPrimariesToColorSpace != -1 || i23 != -1 || i22 != -1 || byteBufferAllocateHdrStaticInfo != null) {
            drmInitData3.setColorInfo(new ColorInfo(iIsoColorPrimariesToColorSpace, i23, i22, byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null));
        }
        if (esdsFromParent != null) {
            drmInitData3.setAverageBitrate(Ints.saturatedCast(esdsFromParent.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsFromParent.peakBitrate));
        }
        stsdData.format = drmInitData3.build();
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 8 + 8);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i = 0; i < unsignedIntToInt; i++) {
            jArr[i] = fullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = fullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseAudioSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, com.google.android.exoplayer2.drm.DrmInitData r29, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData r30, int r31) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseAudioSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, com.google.android.exoplayer2.extractor.mp4.AtomParsers$StsdData, int):void");
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i4 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += i4;
        }
        return -1;
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8 + 4);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, unsignedInt2 > 0 ? unsignedInt2 : -1L, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i3)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i3;
        }
        return null;
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        int i3 = i + 8;
        int i4 = -1;
        String string = null;
        Integer numValueOf = null;
        int i5 = 0;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i6 = parsableByteArray.readInt();
            int i7 = parsableByteArray.readInt();
            if (i7 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i7 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i7 == 1935894633) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!"cenc".equals(string) && !"cbc1".equals(string) && !"cens".equals(string) && !"cbcs".equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int i6 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = unsignedByte & 15;
                    i4 = (unsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z, str, unsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i4 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (unsignedByte & 127);
        }
        return i;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private AtomParsers() {
    }

    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long unsignedInt;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                unsignedInt = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                unsignedInt = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = unsignedInt;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    private static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(AtomParsers.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 == 0) {
                int unsignedByte = this.data.readUnsignedByte();
                this.currentByte = unsignedByte;
                return (unsignedByte & 240) >> 4;
            }
            return this.currentByte & 15;
        }
    }
}
