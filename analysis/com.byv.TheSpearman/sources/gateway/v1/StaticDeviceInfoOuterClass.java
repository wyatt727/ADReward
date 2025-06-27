package gateway.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class StaticDeviceInfoOuterClass {

    public interface StaticDeviceInfoOrBuilder extends MessageLiteOrBuilder {
        StaticDeviceInfo.Android getAndroid();

        boolean getAppDebuggable();

        String getBundleId();

        ByteString getBundleIdBytes();

        String getBundleVersion();

        ByteString getBundleVersionBytes();

        long getCpuCount();

        String getCpuModel();

        ByteString getCpuModelBytes();

        String getDeviceMake();

        ByteString getDeviceMakeBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getGpuModel();

        ByteString getGpuModelBytes();

        StaticDeviceInfo.Ios getIos();

        String getOsVersion();

        ByteString getOsVersionBytes();

        StaticDeviceInfo.PlatformSpecificCase getPlatformSpecificCase();

        boolean getRooted();

        int getScreenDensity();

        int getScreenHeight();

        int getScreenSize();

        int getScreenWidth();

        String getStores(int i);

        ByteString getStoresBytes(int i);

        int getStoresCount();

        List<String> getStoresList();

        long getTotalDiskSpace();

        long getTotalRamMemory();

        String getWebviewUa();

        ByteString getWebviewUaBytes();

        boolean hasAndroid();

        boolean hasAppDebuggable();

        boolean hasBundleId();

        boolean hasBundleVersion();

        boolean hasCpuCount();

        boolean hasCpuModel();

        boolean hasDeviceMake();

        boolean hasDeviceModel();

        boolean hasGpuModel();

        boolean hasIos();

        boolean hasOsVersion();

        boolean hasRooted();

        boolean hasScreenDensity();

        boolean hasScreenHeight();

        boolean hasScreenSize();

        boolean hasScreenWidth();

        boolean hasTotalDiskSpace();

        boolean hasTotalRamMemory();

        boolean hasWebviewUa();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private StaticDeviceInfoOuterClass() {
    }

    public static final class StaticDeviceInfo extends GeneratedMessageLite<StaticDeviceInfo, Builder> implements StaticDeviceInfoOrBuilder {
        public static final int ANDROID_FIELD_NUMBER = 19;
        public static final int APP_DEBUGGABLE_FIELD_NUMBER = 3;
        public static final int BUNDLE_ID_FIELD_NUMBER = 1;
        public static final int BUNDLE_VERSION_FIELD_NUMBER = 2;
        public static final int CPU_COUNT_FIELD_NUMBER = 17;
        public static final int CPU_MODEL_FIELD_NUMBER = 16;
        private static final StaticDeviceInfo DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 6;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 7;
        public static final int GPU_MODEL_FIELD_NUMBER = 18;
        public static final int IOS_FIELD_NUMBER = 20;
        public static final int OS_VERSION_FIELD_NUMBER = 5;
        private static volatile Parser<StaticDeviceInfo> PARSER = null;
        public static final int ROOTED_FIELD_NUMBER = 4;
        public static final int SCREEN_DENSITY_FIELD_NUMBER = 9;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 11;
        public static final int SCREEN_SIZE_FIELD_NUMBER = 12;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 10;
        public static final int STORES_FIELD_NUMBER = 13;
        public static final int TOTAL_DISK_SPACE_FIELD_NUMBER = 14;
        public static final int TOTAL_RAM_MEMORY_FIELD_NUMBER = 15;
        public static final int WEBVIEW_UA_FIELD_NUMBER = 8;
        private boolean appDebuggable_;
        private int bitField0_;
        private long cpuCount_;
        private Object platformSpecific_;
        private boolean rooted_;
        private int screenDensity_;
        private int screenHeight_;
        private int screenSize_;
        private int screenWidth_;
        private long totalDiskSpace_;
        private long totalRamMemory_;
        private int platformSpecificCase_ = 0;
        private String bundleId_ = "";
        private String bundleVersion_ = "";
        private String osVersion_ = "";
        private String deviceMake_ = "";
        private String deviceModel_ = "";
        private String webviewUa_ = "";
        private Internal.ProtobufList<String> stores_ = GeneratedMessageLite.emptyProtobufList();
        private String cpuModel_ = "";
        private String gpuModel_ = "";

        public interface AndroidOrBuilder extends MessageLiteOrBuilder {
            String getAndroidFingerprint();

            ByteString getAndroidFingerprintBytes();

            int getApiLevel();

            String getApkDeveloperSigningCertificateHash();

            ByteString getApkDeveloperSigningCertificateHashBytes();

            String getAppInstaller();

            ByteString getAppInstallerBytes();

            String getBuildBoard();

            ByteString getBuildBoardBytes();

            String getBuildBootloader();

            ByteString getBuildBootloaderBytes();

            String getBuildBrand();

            ByteString getBuildBrandBytes();

            String getBuildDevice();

            ByteString getBuildDeviceBytes();

            String getBuildDisplay();

            ByteString getBuildDisplayBytes();

            String getBuildFingerprint();

            ByteString getBuildFingerprintBytes();

            String getBuildHardware();

            ByteString getBuildHardwareBytes();

            String getBuildHost();

            ByteString getBuildHostBytes();

            String getBuildId();

            ByteString getBuildIdBytes();

            String getBuildProduct();

            ByteString getBuildProductBytes();

            int getExtensionVersion();

            int getVersionCode();

            boolean hasAndroidFingerprint();

            boolean hasApiLevel();

            boolean hasApkDeveloperSigningCertificateHash();

            boolean hasAppInstaller();

            boolean hasBuildBoard();

            boolean hasBuildBootloader();

            boolean hasBuildBrand();

            boolean hasBuildDevice();

            boolean hasBuildDisplay();

            boolean hasBuildFingerprint();

            boolean hasBuildHardware();

            boolean hasBuildHost();

            boolean hasBuildId();

            boolean hasBuildProduct();

            boolean hasExtensionVersion();

            boolean hasVersionCode();
        }

        public interface IosOrBuilder extends MessageLiteOrBuilder {
            String getBuiltSdkVersion();

            ByteString getBuiltSdkVersionBytes();

            boolean getCanMakePayments();

            int getScreenScale();

            boolean getSimulator();

            String getSkadnetworkId(int i);

            ByteString getSkadnetworkIdBytes(int i);

            int getSkadnetworkIdCount();

            List<String> getSkadnetworkIdList();

            long getSystemBootTime();

            boolean hasBuiltSdkVersion();

            boolean hasCanMakePayments();

            boolean hasScreenScale();

            boolean hasSimulator();

            boolean hasSystemBootTime();
        }

        private StaticDeviceInfo() {
        }

        public static final class Android extends GeneratedMessageLite<Android, Builder> implements AndroidOrBuilder {
            public static final int ANDROID_FINGERPRINT_FIELD_NUMBER = 3;
            public static final int API_LEVEL_FIELD_NUMBER = 1;
            public static final int APK_DEVELOPER_SIGNING_CERTIFICATE_HASH_FIELD_NUMBER = 5;
            public static final int APP_INSTALLER_FIELD_NUMBER = 4;
            public static final int BUILD_BOARD_FIELD_NUMBER = 6;
            public static final int BUILD_BOOTLOADER_FIELD_NUMBER = 13;
            public static final int BUILD_BRAND_FIELD_NUMBER = 7;
            public static final int BUILD_DEVICE_FIELD_NUMBER = 8;
            public static final int BUILD_DISPLAY_FIELD_NUMBER = 9;
            public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 10;
            public static final int BUILD_HARDWARE_FIELD_NUMBER = 11;
            public static final int BUILD_HOST_FIELD_NUMBER = 12;
            public static final int BUILD_ID_FIELD_NUMBER = 15;
            public static final int BUILD_PRODUCT_FIELD_NUMBER = 14;
            private static final Android DEFAULT_INSTANCE;
            public static final int EXTENSION_VERSION_FIELD_NUMBER = 16;
            private static volatile Parser<Android> PARSER = null;
            public static final int VERSION_CODE_FIELD_NUMBER = 2;
            private int apiLevel_;
            private int bitField0_;
            private int extensionVersion_;
            private int versionCode_;
            private String androidFingerprint_ = "";
            private String appInstaller_ = "";
            private String apkDeveloperSigningCertificateHash_ = "";
            private String buildBoard_ = "";
            private String buildBrand_ = "";
            private String buildDevice_ = "";
            private String buildDisplay_ = "";
            private String buildFingerprint_ = "";
            private String buildHardware_ = "";
            private String buildHost_ = "";
            private String buildBootloader_ = "";
            private String buildProduct_ = "";
            private String buildId_ = "";

            private Android() {
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasApiLevel() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public int getApiLevel() {
                return this.apiLevel_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setApiLevel(int i) {
                this.bitField0_ |= 1;
                this.apiLevel_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearApiLevel() {
                this.bitField0_ &= -2;
                this.apiLevel_ = 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasVersionCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public int getVersionCode() {
                return this.versionCode_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVersionCode(int i) {
                this.bitField0_ |= 2;
                this.versionCode_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVersionCode() {
                this.bitField0_ &= -3;
                this.versionCode_ = 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasAndroidFingerprint() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getAndroidFingerprint() {
                return this.androidFingerprint_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getAndroidFingerprintBytes() {
                return ByteString.copyFromUtf8(this.androidFingerprint_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAndroidFingerprint(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.androidFingerprint_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAndroidFingerprint() {
                this.bitField0_ &= -5;
                this.androidFingerprint_ = getDefaultInstance().getAndroidFingerprint();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAndroidFingerprintBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.androidFingerprint_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasAppInstaller() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getAppInstaller() {
                return this.appInstaller_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getAppInstallerBytes() {
                return ByteString.copyFromUtf8(this.appInstaller_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAppInstaller(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.appInstaller_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAppInstaller() {
                this.bitField0_ &= -9;
                this.appInstaller_ = getDefaultInstance().getAppInstaller();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAppInstallerBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.appInstaller_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasApkDeveloperSigningCertificateHash() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getApkDeveloperSigningCertificateHash() {
                return this.apkDeveloperSigningCertificateHash_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getApkDeveloperSigningCertificateHashBytes() {
                return ByteString.copyFromUtf8(this.apkDeveloperSigningCertificateHash_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setApkDeveloperSigningCertificateHash(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.apkDeveloperSigningCertificateHash_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearApkDeveloperSigningCertificateHash() {
                this.bitField0_ &= -17;
                this.apkDeveloperSigningCertificateHash_ = getDefaultInstance().getApkDeveloperSigningCertificateHash();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setApkDeveloperSigningCertificateHashBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.apkDeveloperSigningCertificateHash_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildBoard() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getBuildBoard() {
                return this.buildBoard_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getBuildBoardBytes() {
                return ByteString.copyFromUtf8(this.buildBoard_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBoard(String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.buildBoard_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildBoard() {
                this.bitField0_ &= -33;
                this.buildBoard_ = getDefaultInstance().getBuildBoard();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBoardBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildBoard_ = byteString.toStringUtf8();
                this.bitField0_ |= 32;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildBrand() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getBuildBrand() {
                return this.buildBrand_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getBuildBrandBytes() {
                return ByteString.copyFromUtf8(this.buildBrand_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBrand(String str) {
                str.getClass();
                this.bitField0_ |= 64;
                this.buildBrand_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildBrand() {
                this.bitField0_ &= -65;
                this.buildBrand_ = getDefaultInstance().getBuildBrand();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBrandBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildBrand_ = byteString.toStringUtf8();
                this.bitField0_ |= 64;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildDevice() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getBuildDevice() {
                return this.buildDevice_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getBuildDeviceBytes() {
                return ByteString.copyFromUtf8(this.buildDevice_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildDevice(String str) {
                str.getClass();
                this.bitField0_ |= 128;
                this.buildDevice_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildDevice() {
                this.bitField0_ &= -129;
                this.buildDevice_ = getDefaultInstance().getBuildDevice();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildDeviceBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildDevice_ = byteString.toStringUtf8();
                this.bitField0_ |= 128;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildDisplay() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getBuildDisplay() {
                return this.buildDisplay_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getBuildDisplayBytes() {
                return ByteString.copyFromUtf8(this.buildDisplay_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildDisplay(String str) {
                str.getClass();
                this.bitField0_ |= 256;
                this.buildDisplay_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildDisplay() {
                this.bitField0_ &= -257;
                this.buildDisplay_ = getDefaultInstance().getBuildDisplay();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildDisplayBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildDisplay_ = byteString.toStringUtf8();
                this.bitField0_ |= 256;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildFingerprint() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getBuildFingerprint() {
                return this.buildFingerprint_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getBuildFingerprintBytes() {
                return ByteString.copyFromUtf8(this.buildFingerprint_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildFingerprint(String str) {
                str.getClass();
                this.bitField0_ |= 512;
                this.buildFingerprint_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildFingerprint() {
                this.bitField0_ &= -513;
                this.buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildFingerprintBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildFingerprint_ = byteString.toStringUtf8();
                this.bitField0_ |= 512;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildHardware() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getBuildHardware() {
                return this.buildHardware_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getBuildHardwareBytes() {
                return ByteString.copyFromUtf8(this.buildHardware_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildHardware(String str) {
                str.getClass();
                this.bitField0_ |= 1024;
                this.buildHardware_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildHardware() {
                this.bitField0_ &= -1025;
                this.buildHardware_ = getDefaultInstance().getBuildHardware();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildHardwareBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildHardware_ = byteString.toStringUtf8();
                this.bitField0_ |= 1024;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildHost() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getBuildHost() {
                return this.buildHost_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getBuildHostBytes() {
                return ByteString.copyFromUtf8(this.buildHost_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildHost(String str) {
                str.getClass();
                this.bitField0_ |= 2048;
                this.buildHost_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildHost() {
                this.bitField0_ &= -2049;
                this.buildHost_ = getDefaultInstance().getBuildHost();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildHostBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildHost_ = byteString.toStringUtf8();
                this.bitField0_ |= 2048;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildBootloader() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getBuildBootloader() {
                return this.buildBootloader_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getBuildBootloaderBytes() {
                return ByteString.copyFromUtf8(this.buildBootloader_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBootloader(String str) {
                str.getClass();
                this.bitField0_ |= 4096;
                this.buildBootloader_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildBootloader() {
                this.bitField0_ &= -4097;
                this.buildBootloader_ = getDefaultInstance().getBuildBootloader();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildBootloaderBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildBootloader_ = byteString.toStringUtf8();
                this.bitField0_ |= 4096;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildProduct() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getBuildProduct() {
                return this.buildProduct_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getBuildProductBytes() {
                return ByteString.copyFromUtf8(this.buildProduct_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildProduct(String str) {
                str.getClass();
                this.bitField0_ |= 8192;
                this.buildProduct_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildProduct() {
                this.bitField0_ &= -8193;
                this.buildProduct_ = getDefaultInstance().getBuildProduct();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildProductBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildProduct_ = byteString.toStringUtf8();
                this.bitField0_ |= 8192;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasBuildId() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public String getBuildId() {
                return this.buildId_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public ByteString getBuildIdBytes() {
                return ByteString.copyFromUtf8(this.buildId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildId(String str) {
                str.getClass();
                this.bitField0_ |= 16384;
                this.buildId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuildId() {
                this.bitField0_ &= -16385;
                this.buildId_ = getDefaultInstance().getBuildId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuildIdBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.buildId_ = byteString.toStringUtf8();
                this.bitField0_ |= 16384;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public boolean hasExtensionVersion() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
            public int getExtensionVersion() {
                return this.extensionVersion_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setExtensionVersion(int i) {
                this.bitField0_ |= 32768;
                this.extensionVersion_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearExtensionVersion() {
                this.bitField0_ &= -32769;
                this.extensionVersion_ = 0;
            }

            public static Android parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Android parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Android parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Android parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Android parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Android parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Android parseFrom(InputStream inputStream) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Android parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Android parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Android) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Android parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Android parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Android parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Android android2) {
                return DEFAULT_INSTANCE.createBuilder(android2);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Android, Builder> implements AndroidOrBuilder {
                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(Android.DEFAULT_INSTANCE);
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasApiLevel() {
                    return ((Android) this.instance).hasApiLevel();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public int getApiLevel() {
                    return ((Android) this.instance).getApiLevel();
                }

                public Builder setApiLevel(int i) {
                    copyOnWrite();
                    ((Android) this.instance).setApiLevel(i);
                    return this;
                }

                public Builder clearApiLevel() {
                    copyOnWrite();
                    ((Android) this.instance).clearApiLevel();
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasVersionCode() {
                    return ((Android) this.instance).hasVersionCode();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public int getVersionCode() {
                    return ((Android) this.instance).getVersionCode();
                }

                public Builder setVersionCode(int i) {
                    copyOnWrite();
                    ((Android) this.instance).setVersionCode(i);
                    return this;
                }

                public Builder clearVersionCode() {
                    copyOnWrite();
                    ((Android) this.instance).clearVersionCode();
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasAndroidFingerprint() {
                    return ((Android) this.instance).hasAndroidFingerprint();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getAndroidFingerprint() {
                    return ((Android) this.instance).getAndroidFingerprint();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getAndroidFingerprintBytes() {
                    return ((Android) this.instance).getAndroidFingerprintBytes();
                }

                public Builder setAndroidFingerprint(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setAndroidFingerprint(str);
                    return this;
                }

                public Builder clearAndroidFingerprint() {
                    copyOnWrite();
                    ((Android) this.instance).clearAndroidFingerprint();
                    return this;
                }

                public Builder setAndroidFingerprintBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setAndroidFingerprintBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasAppInstaller() {
                    return ((Android) this.instance).hasAppInstaller();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getAppInstaller() {
                    return ((Android) this.instance).getAppInstaller();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getAppInstallerBytes() {
                    return ((Android) this.instance).getAppInstallerBytes();
                }

                public Builder setAppInstaller(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setAppInstaller(str);
                    return this;
                }

                public Builder clearAppInstaller() {
                    copyOnWrite();
                    ((Android) this.instance).clearAppInstaller();
                    return this;
                }

                public Builder setAppInstallerBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setAppInstallerBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasApkDeveloperSigningCertificateHash() {
                    return ((Android) this.instance).hasApkDeveloperSigningCertificateHash();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getApkDeveloperSigningCertificateHash() {
                    return ((Android) this.instance).getApkDeveloperSigningCertificateHash();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getApkDeveloperSigningCertificateHashBytes() {
                    return ((Android) this.instance).getApkDeveloperSigningCertificateHashBytes();
                }

                public Builder setApkDeveloperSigningCertificateHash(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setApkDeveloperSigningCertificateHash(str);
                    return this;
                }

                public Builder clearApkDeveloperSigningCertificateHash() {
                    copyOnWrite();
                    ((Android) this.instance).clearApkDeveloperSigningCertificateHash();
                    return this;
                }

                public Builder setApkDeveloperSigningCertificateHashBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setApkDeveloperSigningCertificateHashBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildBoard() {
                    return ((Android) this.instance).hasBuildBoard();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getBuildBoard() {
                    return ((Android) this.instance).getBuildBoard();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getBuildBoardBytes() {
                    return ((Android) this.instance).getBuildBoardBytes();
                }

                public Builder setBuildBoard(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildBoard(str);
                    return this;
                }

                public Builder clearBuildBoard() {
                    copyOnWrite();
                    ((Android) this.instance).clearBuildBoard();
                    return this;
                }

                public Builder setBuildBoardBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildBoardBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildBrand() {
                    return ((Android) this.instance).hasBuildBrand();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getBuildBrand() {
                    return ((Android) this.instance).getBuildBrand();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getBuildBrandBytes() {
                    return ((Android) this.instance).getBuildBrandBytes();
                }

                public Builder setBuildBrand(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildBrand(str);
                    return this;
                }

                public Builder clearBuildBrand() {
                    copyOnWrite();
                    ((Android) this.instance).clearBuildBrand();
                    return this;
                }

                public Builder setBuildBrandBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildBrandBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildDevice() {
                    return ((Android) this.instance).hasBuildDevice();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getBuildDevice() {
                    return ((Android) this.instance).getBuildDevice();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getBuildDeviceBytes() {
                    return ((Android) this.instance).getBuildDeviceBytes();
                }

                public Builder setBuildDevice(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildDevice(str);
                    return this;
                }

                public Builder clearBuildDevice() {
                    copyOnWrite();
                    ((Android) this.instance).clearBuildDevice();
                    return this;
                }

                public Builder setBuildDeviceBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildDeviceBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildDisplay() {
                    return ((Android) this.instance).hasBuildDisplay();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getBuildDisplay() {
                    return ((Android) this.instance).getBuildDisplay();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getBuildDisplayBytes() {
                    return ((Android) this.instance).getBuildDisplayBytes();
                }

                public Builder setBuildDisplay(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildDisplay(str);
                    return this;
                }

                public Builder clearBuildDisplay() {
                    copyOnWrite();
                    ((Android) this.instance).clearBuildDisplay();
                    return this;
                }

                public Builder setBuildDisplayBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildDisplayBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildFingerprint() {
                    return ((Android) this.instance).hasBuildFingerprint();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getBuildFingerprint() {
                    return ((Android) this.instance).getBuildFingerprint();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getBuildFingerprintBytes() {
                    return ((Android) this.instance).getBuildFingerprintBytes();
                }

                public Builder setBuildFingerprint(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildFingerprint(str);
                    return this;
                }

                public Builder clearBuildFingerprint() {
                    copyOnWrite();
                    ((Android) this.instance).clearBuildFingerprint();
                    return this;
                }

                public Builder setBuildFingerprintBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildFingerprintBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildHardware() {
                    return ((Android) this.instance).hasBuildHardware();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getBuildHardware() {
                    return ((Android) this.instance).getBuildHardware();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getBuildHardwareBytes() {
                    return ((Android) this.instance).getBuildHardwareBytes();
                }

                public Builder setBuildHardware(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildHardware(str);
                    return this;
                }

                public Builder clearBuildHardware() {
                    copyOnWrite();
                    ((Android) this.instance).clearBuildHardware();
                    return this;
                }

                public Builder setBuildHardwareBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildHardwareBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildHost() {
                    return ((Android) this.instance).hasBuildHost();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getBuildHost() {
                    return ((Android) this.instance).getBuildHost();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getBuildHostBytes() {
                    return ((Android) this.instance).getBuildHostBytes();
                }

                public Builder setBuildHost(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildHost(str);
                    return this;
                }

                public Builder clearBuildHost() {
                    copyOnWrite();
                    ((Android) this.instance).clearBuildHost();
                    return this;
                }

                public Builder setBuildHostBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildHostBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildBootloader() {
                    return ((Android) this.instance).hasBuildBootloader();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getBuildBootloader() {
                    return ((Android) this.instance).getBuildBootloader();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getBuildBootloaderBytes() {
                    return ((Android) this.instance).getBuildBootloaderBytes();
                }

                public Builder setBuildBootloader(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildBootloader(str);
                    return this;
                }

                public Builder clearBuildBootloader() {
                    copyOnWrite();
                    ((Android) this.instance).clearBuildBootloader();
                    return this;
                }

                public Builder setBuildBootloaderBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildBootloaderBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildProduct() {
                    return ((Android) this.instance).hasBuildProduct();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getBuildProduct() {
                    return ((Android) this.instance).getBuildProduct();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getBuildProductBytes() {
                    return ((Android) this.instance).getBuildProductBytes();
                }

                public Builder setBuildProduct(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildProduct(str);
                    return this;
                }

                public Builder clearBuildProduct() {
                    copyOnWrite();
                    ((Android) this.instance).clearBuildProduct();
                    return this;
                }

                public Builder setBuildProductBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildProductBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasBuildId() {
                    return ((Android) this.instance).hasBuildId();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public String getBuildId() {
                    return ((Android) this.instance).getBuildId();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public ByteString getBuildIdBytes() {
                    return ((Android) this.instance).getBuildIdBytes();
                }

                public Builder setBuildId(String str) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildId(str);
                    return this;
                }

                public Builder clearBuildId() {
                    copyOnWrite();
                    ((Android) this.instance).clearBuildId();
                    return this;
                }

                public Builder setBuildIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Android) this.instance).setBuildIdBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public boolean hasExtensionVersion() {
                    return ((Android) this.instance).hasExtensionVersion();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.AndroidOrBuilder
                public int getExtensionVersion() {
                    return ((Android) this.instance).getExtensionVersion();
                }

                public Builder setExtensionVersion(int i) {
                    copyOnWrite();
                    ((Android) this.instance).setExtensionVersion(i);
                    return this;
                }

                public Builder clearExtensionVersion() {
                    copyOnWrite();
                    ((Android) this.instance).clearExtensionVersion();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Android();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t\u000bለ\n\fለ\u000b\rለ\f\u000eለ\r\u000fለ\u000e\u0010ဋ\u000f", new Object[]{"bitField0_", "apiLevel_", "versionCode_", "androidFingerprint_", "appInstaller_", "apkDeveloperSigningCertificateHash_", "buildBoard_", "buildBrand_", "buildDevice_", "buildDisplay_", "buildFingerprint_", "buildHardware_", "buildHost_", "buildBootloader_", "buildProduct_", "buildId_", "extensionVersion_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Android> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (Android.class) {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                Android android2 = new Android();
                DEFAULT_INSTANCE = android2;
                GeneratedMessageLite.registerDefaultInstance(Android.class, android2);
            }

            public static Android getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Android> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class Ios extends GeneratedMessageLite<Ios, Builder> implements IosOrBuilder {
            public static final int BUILT_SDK_VERSION_FIELD_NUMBER = 3;
            public static final int CAN_MAKE_PAYMENTS_FIELD_NUMBER = 6;
            private static final Ios DEFAULT_INSTANCE;
            private static volatile Parser<Ios> PARSER = null;
            public static final int SCREEN_SCALE_FIELD_NUMBER = 5;
            public static final int SIMULATOR_FIELD_NUMBER = 2;
            public static final int SKADNETWORK_ID_FIELD_NUMBER = 4;
            public static final int SYSTEM_BOOT_TIME_FIELD_NUMBER = 1;
            private int bitField0_;
            private boolean canMakePayments_;
            private int screenScale_;
            private boolean simulator_;
            private long systemBootTime_;
            private String builtSdkVersion_ = "";
            private Internal.ProtobufList<String> skadnetworkId_ = GeneratedMessageLite.emptyProtobufList();

            private Ios() {
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasSystemBootTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public long getSystemBootTime() {
                return this.systemBootTime_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSystemBootTime(long j) {
                this.bitField0_ |= 1;
                this.systemBootTime_ = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSystemBootTime() {
                this.bitField0_ &= -2;
                this.systemBootTime_ = 0L;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasSimulator() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean getSimulator() {
                return this.simulator_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSimulator(boolean z) {
                this.bitField0_ |= 2;
                this.simulator_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSimulator() {
                this.bitField0_ &= -3;
                this.simulator_ = false;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasBuiltSdkVersion() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public String getBuiltSdkVersion() {
                return this.builtSdkVersion_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public ByteString getBuiltSdkVersionBytes() {
                return ByteString.copyFromUtf8(this.builtSdkVersion_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuiltSdkVersion(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.builtSdkVersion_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBuiltSdkVersion() {
                this.bitField0_ &= -5;
                this.builtSdkVersion_ = getDefaultInstance().getBuiltSdkVersion();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBuiltSdkVersionBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                this.builtSdkVersion_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public List<String> getSkadnetworkIdList() {
                return this.skadnetworkId_;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public int getSkadnetworkIdCount() {
                return this.skadnetworkId_.size();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public String getSkadnetworkId(int i) {
                return this.skadnetworkId_.get(i);
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public ByteString getSkadnetworkIdBytes(int i) {
                return ByteString.copyFromUtf8(this.skadnetworkId_.get(i));
            }

            private void ensureSkadnetworkIdIsMutable() {
                Internal.ProtobufList<String> protobufList = this.skadnetworkId_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.skadnetworkId_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSkadnetworkId(int i, String str) {
                str.getClass();
                ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.set(i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addSkadnetworkId(String str) {
                str.getClass();
                ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllSkadnetworkId(Iterable<String> iterable) {
                ensureSkadnetworkIdIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.skadnetworkId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSkadnetworkId() {
                this.skadnetworkId_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addSkadnetworkIdBytes(ByteString byteString) {
                checkByteStringIsUtf8(byteString);
                ensureSkadnetworkIdIsMutable();
                this.skadnetworkId_.add(byteString.toStringUtf8());
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasScreenScale() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public int getScreenScale() {
                return this.screenScale_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setScreenScale(int i) {
                this.bitField0_ |= 8;
                this.screenScale_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearScreenScale() {
                this.bitField0_ &= -9;
                this.screenScale_ = 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean hasCanMakePayments() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
            public boolean getCanMakePayments() {
                return this.canMakePayments_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCanMakePayments(boolean z) {
                this.bitField0_ |= 16;
                this.canMakePayments_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCanMakePayments() {
                this.bitField0_ &= -17;
                this.canMakePayments_ = false;
            }

            public static Ios parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Ios parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Ios parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Ios parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Ios parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Ios parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Ios parseFrom(InputStream inputStream) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ios parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ios parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Ios) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ios parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Ios parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Ios ios) {
                return DEFAULT_INSTANCE.createBuilder(ios);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Ios, Builder> implements IosOrBuilder {
                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    super(Ios.DEFAULT_INSTANCE);
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasSystemBootTime() {
                    return ((Ios) this.instance).hasSystemBootTime();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public long getSystemBootTime() {
                    return ((Ios) this.instance).getSystemBootTime();
                }

                public Builder setSystemBootTime(long j) {
                    copyOnWrite();
                    ((Ios) this.instance).setSystemBootTime(j);
                    return this;
                }

                public Builder clearSystemBootTime() {
                    copyOnWrite();
                    ((Ios) this.instance).clearSystemBootTime();
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasSimulator() {
                    return ((Ios) this.instance).hasSimulator();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean getSimulator() {
                    return ((Ios) this.instance).getSimulator();
                }

                public Builder setSimulator(boolean z) {
                    copyOnWrite();
                    ((Ios) this.instance).setSimulator(z);
                    return this;
                }

                public Builder clearSimulator() {
                    copyOnWrite();
                    ((Ios) this.instance).clearSimulator();
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasBuiltSdkVersion() {
                    return ((Ios) this.instance).hasBuiltSdkVersion();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public String getBuiltSdkVersion() {
                    return ((Ios) this.instance).getBuiltSdkVersion();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public ByteString getBuiltSdkVersionBytes() {
                    return ((Ios) this.instance).getBuiltSdkVersionBytes();
                }

                public Builder setBuiltSdkVersion(String str) {
                    copyOnWrite();
                    ((Ios) this.instance).setBuiltSdkVersion(str);
                    return this;
                }

                public Builder clearBuiltSdkVersion() {
                    copyOnWrite();
                    ((Ios) this.instance).clearBuiltSdkVersion();
                    return this;
                }

                public Builder setBuiltSdkVersionBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Ios) this.instance).setBuiltSdkVersionBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public List<String> getSkadnetworkIdList() {
                    return Collections.unmodifiableList(((Ios) this.instance).getSkadnetworkIdList());
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public int getSkadnetworkIdCount() {
                    return ((Ios) this.instance).getSkadnetworkIdCount();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public String getSkadnetworkId(int i) {
                    return ((Ios) this.instance).getSkadnetworkId(i);
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public ByteString getSkadnetworkIdBytes(int i) {
                    return ((Ios) this.instance).getSkadnetworkIdBytes(i);
                }

                public Builder setSkadnetworkId(int i, String str) {
                    copyOnWrite();
                    ((Ios) this.instance).setSkadnetworkId(i, str);
                    return this;
                }

                public Builder addSkadnetworkId(String str) {
                    copyOnWrite();
                    ((Ios) this.instance).addSkadnetworkId(str);
                    return this;
                }

                public Builder addAllSkadnetworkId(Iterable<String> iterable) {
                    copyOnWrite();
                    ((Ios) this.instance).addAllSkadnetworkId(iterable);
                    return this;
                }

                public Builder clearSkadnetworkId() {
                    copyOnWrite();
                    ((Ios) this.instance).clearSkadnetworkId();
                    return this;
                }

                public Builder addSkadnetworkIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Ios) this.instance).addSkadnetworkIdBytes(byteString);
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasScreenScale() {
                    return ((Ios) this.instance).hasScreenScale();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public int getScreenScale() {
                    return ((Ios) this.instance).getScreenScale();
                }

                public Builder setScreenScale(int i) {
                    copyOnWrite();
                    ((Ios) this.instance).setScreenScale(i);
                    return this;
                }

                public Builder clearScreenScale() {
                    copyOnWrite();
                    ((Ios) this.instance).clearScreenScale();
                    return this;
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean hasCanMakePayments() {
                    return ((Ios) this.instance).hasCanMakePayments();
                }

                @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.IosOrBuilder
                public boolean getCanMakePayments() {
                    return ((Ios) this.instance).getCanMakePayments();
                }

                public Builder setCanMakePayments(boolean z) {
                    copyOnWrite();
                    ((Ios) this.instance).setCanMakePayments(z);
                    return this;
                }

                public Builder clearCanMakePayments() {
                    copyOnWrite();
                    ((Ios) this.instance).clearCanMakePayments();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Ios();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ለ\u0002\u0004Ț\u0005ဋ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "systemBootTime_", "simulator_", "builtSdkVersion_", "skadnetworkId_", "screenScale_", "canMakePayments_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Ios> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (Ios.class) {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                Ios ios = new Ios();
                DEFAULT_INSTANCE = ios;
                GeneratedMessageLite.registerDefaultInstance(Ios.class, ios);
            }

            public static Ios getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Ios> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public enum PlatformSpecificCase {
            ANDROID(19),
            IOS(20),
            PLATFORMSPECIFIC_NOT_SET(0);

            private final int value;

            PlatformSpecificCase(int i) {
                this.value = i;
            }

            @Deprecated
            public static PlatformSpecificCase valueOf(int i) {
                return forNumber(i);
            }

            public static PlatformSpecificCase forNumber(int i) {
                if (i == 0) {
                    return PLATFORMSPECIFIC_NOT_SET;
                }
                if (i == 19) {
                    return ANDROID;
                }
                if (i != 20) {
                    return null;
                }
                return IOS;
            }

            public int getNumber() {
                return this.value;
            }
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public PlatformSpecificCase getPlatformSpecificCase() {
            return PlatformSpecificCase.forNumber(this.platformSpecificCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatformSpecific() {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasBundleId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public String getBundleId() {
            return this.bundleId_;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public ByteString getBundleIdBytes() {
            return ByteString.copyFromUtf8(this.bundleId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.bundleId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBundleId() {
            this.bitField0_ &= -2;
            this.bundleId_ = getDefaultInstance().getBundleId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleIdBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.bundleId_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasBundleVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public String getBundleVersion() {
            return this.bundleVersion_;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public ByteString getBundleVersionBytes() {
            return ByteString.copyFromUtf8(this.bundleVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.bundleVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBundleVersion() {
            this.bitField0_ &= -3;
            this.bundleVersion_ = getDefaultInstance().getBundleVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleVersionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.bundleVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasAppDebuggable() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean getAppDebuggable() {
            return this.appDebuggable_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppDebuggable(boolean z) {
            this.bitField0_ |= 4;
            this.appDebuggable_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppDebuggable() {
            this.bitField0_ &= -5;
            this.appDebuggable_ = false;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasRooted() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean getRooted() {
            return this.rooted_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRooted(boolean z) {
            this.bitField0_ |= 8;
            this.rooted_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRooted() {
            this.bitField0_ &= -9;
            this.rooted_ = false;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasOsVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.bitField0_ &= -17;
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasDeviceMake() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public String getDeviceMake() {
            return this.deviceMake_;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public ByteString getDeviceMakeBytes() {
            return ByteString.copyFromUtf8(this.deviceMake_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMake(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.deviceMake_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceMake() {
            this.bitField0_ &= -33;
            this.deviceMake_ = getDefaultInstance().getDeviceMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceMakeBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.deviceMake_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasDeviceModel() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public String getDeviceModel() {
            return this.deviceModel_;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModel(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.deviceModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceModel() {
            this.bitField0_ &= -65;
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceModelBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasWebviewUa() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public String getWebviewUa() {
            return this.webviewUa_;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public ByteString getWebviewUaBytes() {
            return ByteString.copyFromUtf8(this.webviewUa_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewUa(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.webviewUa_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewUa() {
            this.bitField0_ &= -129;
            this.webviewUa_ = getDefaultInstance().getWebviewUa();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewUaBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.webviewUa_ = byteString.toStringUtf8();
            this.bitField0_ |= 128;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasScreenDensity() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public int getScreenDensity() {
            return this.screenDensity_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenDensity(int i) {
            this.bitField0_ |= 256;
            this.screenDensity_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenDensity() {
            this.bitField0_ &= -257;
            this.screenDensity_ = 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasScreenWidth() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public int getScreenWidth() {
            return this.screenWidth_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenWidth(int i) {
            this.bitField0_ |= 512;
            this.screenWidth_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenWidth() {
            this.bitField0_ &= -513;
            this.screenWidth_ = 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasScreenHeight() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public int getScreenHeight() {
            return this.screenHeight_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenHeight(int i) {
            this.bitField0_ |= 1024;
            this.screenHeight_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenHeight() {
            this.bitField0_ &= -1025;
            this.screenHeight_ = 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasScreenSize() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public int getScreenSize() {
            return this.screenSize_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenSize(int i) {
            this.bitField0_ |= 2048;
            this.screenSize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenSize() {
            this.bitField0_ &= -2049;
            this.screenSize_ = 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public List<String> getStoresList() {
            return this.stores_;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public int getStoresCount() {
            return this.stores_.size();
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public String getStores(int i) {
            return this.stores_.get(i);
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public ByteString getStoresBytes(int i) {
            return ByteString.copyFromUtf8(this.stores_.get(i));
        }

        private void ensureStoresIsMutable() {
            Internal.ProtobufList<String> protobufList = this.stores_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.stores_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStores(int i, String str) {
            str.getClass();
            ensureStoresIsMutable();
            this.stores_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStores(String str) {
            str.getClass();
            ensureStoresIsMutable();
            this.stores_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllStores(Iterable<String> iterable) {
            ensureStoresIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.stores_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStores() {
            this.stores_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStoresBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            ensureStoresIsMutable();
            this.stores_.add(byteString.toStringUtf8());
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasTotalDiskSpace() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public long getTotalDiskSpace() {
            return this.totalDiskSpace_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalDiskSpace(long j) {
            this.bitField0_ |= 4096;
            this.totalDiskSpace_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalDiskSpace() {
            this.bitField0_ &= -4097;
            this.totalDiskSpace_ = 0L;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasTotalRamMemory() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public long getTotalRamMemory() {
            return this.totalRamMemory_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalRamMemory(long j) {
            this.bitField0_ |= 8192;
            this.totalRamMemory_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalRamMemory() {
            this.bitField0_ &= -8193;
            this.totalRamMemory_ = 0L;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasCpuModel() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public String getCpuModel() {
            return this.cpuModel_;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public ByteString getCpuModelBytes() {
            return ByteString.copyFromUtf8(this.cpuModel_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuModel(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.cpuModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCpuModel() {
            this.bitField0_ &= -16385;
            this.cpuModel_ = getDefaultInstance().getCpuModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuModelBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.cpuModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 16384;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasCpuCount() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public long getCpuCount() {
            return this.cpuCount_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuCount(long j) {
            this.bitField0_ |= 32768;
            this.cpuCount_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCpuCount() {
            this.bitField0_ &= -32769;
            this.cpuCount_ = 0L;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasGpuModel() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public String getGpuModel() {
            return this.gpuModel_;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public ByteString getGpuModelBytes() {
            return ByteString.copyFromUtf8(this.gpuModel_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGpuModel(String str) {
            str.getClass();
            this.bitField0_ |= 65536;
            this.gpuModel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGpuModel() {
            this.bitField0_ &= -65537;
            this.gpuModel_ = getDefaultInstance().getGpuModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGpuModelBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.gpuModel_ = byteString.toStringUtf8();
            this.bitField0_ |= 65536;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasAndroid() {
            return this.platformSpecificCase_ == 19;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public Android getAndroid() {
            if (this.platformSpecificCase_ == 19) {
                return (Android) this.platformSpecific_;
            }
            return Android.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAndroid(Android android2) {
            android2.getClass();
            this.platformSpecific_ = android2;
            this.platformSpecificCase_ = 19;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAndroid(Android android2) {
            android2.getClass();
            if (this.platformSpecificCase_ == 19 && this.platformSpecific_ != Android.getDefaultInstance()) {
                this.platformSpecific_ = Android.newBuilder((Android) this.platformSpecific_).mergeFrom((Android.Builder) android2).buildPartial();
            } else {
                this.platformSpecific_ = android2;
            }
            this.platformSpecificCase_ = 19;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAndroid() {
            if (this.platformSpecificCase_ == 19) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public boolean hasIos() {
            return this.platformSpecificCase_ == 20;
        }

        @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
        public Ios getIos() {
            if (this.platformSpecificCase_ == 20) {
                return (Ios) this.platformSpecific_;
            }
            return Ios.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIos(Ios ios) {
            ios.getClass();
            this.platformSpecific_ = ios;
            this.platformSpecificCase_ = 20;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIos(Ios ios) {
            ios.getClass();
            if (this.platformSpecificCase_ == 20 && this.platformSpecific_ != Ios.getDefaultInstance()) {
                this.platformSpecific_ = Ios.newBuilder((Ios) this.platformSpecific_).mergeFrom((Ios.Builder) ios).buildPartial();
            } else {
                this.platformSpecific_ = ios;
            }
            this.platformSpecificCase_ = 20;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIos() {
            if (this.platformSpecificCase_ == 20) {
                this.platformSpecificCase_ = 0;
                this.platformSpecific_ = null;
            }
        }

        public static StaticDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static StaticDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StaticDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StaticDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(InputStream inputStream) throws IOException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StaticDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StaticDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StaticDeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StaticDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StaticDeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StaticDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StaticDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(StaticDeviceInfo staticDeviceInfo) {
            return DEFAULT_INSTANCE.createBuilder(staticDeviceInfo);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StaticDeviceInfo, Builder> implements StaticDeviceInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(StaticDeviceInfo.DEFAULT_INSTANCE);
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public PlatformSpecificCase getPlatformSpecificCase() {
                return ((StaticDeviceInfo) this.instance).getPlatformSpecificCase();
            }

            public Builder clearPlatformSpecific() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearPlatformSpecific();
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasBundleId() {
                return ((StaticDeviceInfo) this.instance).hasBundleId();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public String getBundleId() {
                return ((StaticDeviceInfo) this.instance).getBundleId();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public ByteString getBundleIdBytes() {
                return ((StaticDeviceInfo) this.instance).getBundleIdBytes();
            }

            public Builder setBundleId(String str) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setBundleId(str);
                return this;
            }

            public Builder clearBundleId() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearBundleId();
                return this;
            }

            public Builder setBundleIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setBundleIdBytes(byteString);
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasBundleVersion() {
                return ((StaticDeviceInfo) this.instance).hasBundleVersion();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public String getBundleVersion() {
                return ((StaticDeviceInfo) this.instance).getBundleVersion();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public ByteString getBundleVersionBytes() {
                return ((StaticDeviceInfo) this.instance).getBundleVersionBytes();
            }

            public Builder setBundleVersion(String str) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setBundleVersion(str);
                return this;
            }

            public Builder clearBundleVersion() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearBundleVersion();
                return this;
            }

            public Builder setBundleVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setBundleVersionBytes(byteString);
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasAppDebuggable() {
                return ((StaticDeviceInfo) this.instance).hasAppDebuggable();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean getAppDebuggable() {
                return ((StaticDeviceInfo) this.instance).getAppDebuggable();
            }

            public Builder setAppDebuggable(boolean z) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setAppDebuggable(z);
                return this;
            }

            public Builder clearAppDebuggable() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearAppDebuggable();
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasRooted() {
                return ((StaticDeviceInfo) this.instance).hasRooted();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean getRooted() {
                return ((StaticDeviceInfo) this.instance).getRooted();
            }

            public Builder setRooted(boolean z) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setRooted(z);
                return this;
            }

            public Builder clearRooted() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearRooted();
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasOsVersion() {
                return ((StaticDeviceInfo) this.instance).hasOsVersion();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public String getOsVersion() {
                return ((StaticDeviceInfo) this.instance).getOsVersion();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public ByteString getOsVersionBytes() {
                return ((StaticDeviceInfo) this.instance).getOsVersionBytes();
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setOsVersion(str);
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearOsVersion();
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setOsVersionBytes(byteString);
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasDeviceMake() {
                return ((StaticDeviceInfo) this.instance).hasDeviceMake();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public String getDeviceMake() {
                return ((StaticDeviceInfo) this.instance).getDeviceMake();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public ByteString getDeviceMakeBytes() {
                return ((StaticDeviceInfo) this.instance).getDeviceMakeBytes();
            }

            public Builder setDeviceMake(String str) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setDeviceMake(str);
                return this;
            }

            public Builder clearDeviceMake() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearDeviceMake();
                return this;
            }

            public Builder setDeviceMakeBytes(ByteString byteString) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setDeviceMakeBytes(byteString);
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasDeviceModel() {
                return ((StaticDeviceInfo) this.instance).hasDeviceModel();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public String getDeviceModel() {
                return ((StaticDeviceInfo) this.instance).getDeviceModel();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public ByteString getDeviceModelBytes() {
                return ((StaticDeviceInfo) this.instance).getDeviceModelBytes();
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setDeviceModel(str);
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearDeviceModel();
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setDeviceModelBytes(byteString);
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasWebviewUa() {
                return ((StaticDeviceInfo) this.instance).hasWebviewUa();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public String getWebviewUa() {
                return ((StaticDeviceInfo) this.instance).getWebviewUa();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public ByteString getWebviewUaBytes() {
                return ((StaticDeviceInfo) this.instance).getWebviewUaBytes();
            }

            public Builder setWebviewUa(String str) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setWebviewUa(str);
                return this;
            }

            public Builder clearWebviewUa() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearWebviewUa();
                return this;
            }

            public Builder setWebviewUaBytes(ByteString byteString) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setWebviewUaBytes(byteString);
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasScreenDensity() {
                return ((StaticDeviceInfo) this.instance).hasScreenDensity();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public int getScreenDensity() {
                return ((StaticDeviceInfo) this.instance).getScreenDensity();
            }

            public Builder setScreenDensity(int i) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setScreenDensity(i);
                return this;
            }

            public Builder clearScreenDensity() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearScreenDensity();
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasScreenWidth() {
                return ((StaticDeviceInfo) this.instance).hasScreenWidth();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public int getScreenWidth() {
                return ((StaticDeviceInfo) this.instance).getScreenWidth();
            }

            public Builder setScreenWidth(int i) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setScreenWidth(i);
                return this;
            }

            public Builder clearScreenWidth() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearScreenWidth();
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasScreenHeight() {
                return ((StaticDeviceInfo) this.instance).hasScreenHeight();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public int getScreenHeight() {
                return ((StaticDeviceInfo) this.instance).getScreenHeight();
            }

            public Builder setScreenHeight(int i) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setScreenHeight(i);
                return this;
            }

            public Builder clearScreenHeight() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearScreenHeight();
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasScreenSize() {
                return ((StaticDeviceInfo) this.instance).hasScreenSize();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public int getScreenSize() {
                return ((StaticDeviceInfo) this.instance).getScreenSize();
            }

            public Builder setScreenSize(int i) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setScreenSize(i);
                return this;
            }

            public Builder clearScreenSize() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearScreenSize();
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public List<String> getStoresList() {
                return Collections.unmodifiableList(((StaticDeviceInfo) this.instance).getStoresList());
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public int getStoresCount() {
                return ((StaticDeviceInfo) this.instance).getStoresCount();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public String getStores(int i) {
                return ((StaticDeviceInfo) this.instance).getStores(i);
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public ByteString getStoresBytes(int i) {
                return ((StaticDeviceInfo) this.instance).getStoresBytes(i);
            }

            public Builder setStores(int i, String str) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setStores(i, str);
                return this;
            }

            public Builder addStores(String str) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).addStores(str);
                return this;
            }

            public Builder addAllStores(Iterable<String> iterable) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).addAllStores(iterable);
                return this;
            }

            public Builder clearStores() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearStores();
                return this;
            }

            public Builder addStoresBytes(ByteString byteString) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).addStoresBytes(byteString);
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasTotalDiskSpace() {
                return ((StaticDeviceInfo) this.instance).hasTotalDiskSpace();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public long getTotalDiskSpace() {
                return ((StaticDeviceInfo) this.instance).getTotalDiskSpace();
            }

            public Builder setTotalDiskSpace(long j) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setTotalDiskSpace(j);
                return this;
            }

            public Builder clearTotalDiskSpace() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearTotalDiskSpace();
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasTotalRamMemory() {
                return ((StaticDeviceInfo) this.instance).hasTotalRamMemory();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public long getTotalRamMemory() {
                return ((StaticDeviceInfo) this.instance).getTotalRamMemory();
            }

            public Builder setTotalRamMemory(long j) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setTotalRamMemory(j);
                return this;
            }

            public Builder clearTotalRamMemory() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearTotalRamMemory();
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasCpuModel() {
                return ((StaticDeviceInfo) this.instance).hasCpuModel();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public String getCpuModel() {
                return ((StaticDeviceInfo) this.instance).getCpuModel();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public ByteString getCpuModelBytes() {
                return ((StaticDeviceInfo) this.instance).getCpuModelBytes();
            }

            public Builder setCpuModel(String str) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setCpuModel(str);
                return this;
            }

            public Builder clearCpuModel() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearCpuModel();
                return this;
            }

            public Builder setCpuModelBytes(ByteString byteString) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setCpuModelBytes(byteString);
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasCpuCount() {
                return ((StaticDeviceInfo) this.instance).hasCpuCount();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public long getCpuCount() {
                return ((StaticDeviceInfo) this.instance).getCpuCount();
            }

            public Builder setCpuCount(long j) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setCpuCount(j);
                return this;
            }

            public Builder clearCpuCount() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearCpuCount();
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasGpuModel() {
                return ((StaticDeviceInfo) this.instance).hasGpuModel();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public String getGpuModel() {
                return ((StaticDeviceInfo) this.instance).getGpuModel();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public ByteString getGpuModelBytes() {
                return ((StaticDeviceInfo) this.instance).getGpuModelBytes();
            }

            public Builder setGpuModel(String str) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setGpuModel(str);
                return this;
            }

            public Builder clearGpuModel() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearGpuModel();
                return this;
            }

            public Builder setGpuModelBytes(ByteString byteString) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setGpuModelBytes(byteString);
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasAndroid() {
                return ((StaticDeviceInfo) this.instance).hasAndroid();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public Android getAndroid() {
                return ((StaticDeviceInfo) this.instance).getAndroid();
            }

            public Builder setAndroid(Android android2) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setAndroid(android2);
                return this;
            }

            public Builder setAndroid(Android.Builder builder) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setAndroid(builder.build());
                return this;
            }

            public Builder mergeAndroid(Android android2) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).mergeAndroid(android2);
                return this;
            }

            public Builder clearAndroid() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearAndroid();
                return this;
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public boolean hasIos() {
                return ((StaticDeviceInfo) this.instance).hasIos();
            }

            @Override // gateway.v1.StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder
            public Ios getIos() {
                return ((StaticDeviceInfo) this.instance).getIos();
            }

            public Builder setIos(Ios ios) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setIos(ios);
                return this;
            }

            public Builder setIos(Ios.Builder builder) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).setIos(builder.build());
                return this;
            }

            public Builder mergeIos(Ios ios) {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).mergeIos(ios);
                return this;
            }

            public Builder clearIos() {
                copyOnWrite();
                ((StaticDeviceInfo) this.instance).clearIos();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StaticDeviceInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0001\u0001\u0014\u0014\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rȚ\u000eဂ\f\u000fဂ\r\u0010ለ\u000e\u0011ဂ\u000f\u0012ለ\u0010\u0013<\u0000\u0014<\u0000", new Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "bundleId_", "bundleVersion_", "appDebuggable_", "rooted_", "osVersion_", "deviceMake_", "deviceModel_", "webviewUa_", "screenDensity_", "screenWidth_", "screenHeight_", "screenSize_", "stores_", "totalDiskSpace_", "totalRamMemory_", "cpuModel_", "cpuCount_", "gpuModel_", Android.class, Ios.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StaticDeviceInfo> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (StaticDeviceInfo.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            StaticDeviceInfo staticDeviceInfo = new StaticDeviceInfo();
            DEFAULT_INSTANCE = staticDeviceInfo;
            GeneratedMessageLite.registerDefaultInstance(StaticDeviceInfo.class, staticDeviceInfo);
        }

        public static StaticDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<StaticDeviceInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gateway.v1.StaticDeviceInfoOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
