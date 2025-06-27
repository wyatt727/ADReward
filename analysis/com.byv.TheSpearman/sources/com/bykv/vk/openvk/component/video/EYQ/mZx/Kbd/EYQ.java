package com.bykv.vk.openvk.component.video.EYQ.mZx.Kbd;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bykv.vk.openvk.component.video.EYQ.mZx.HX;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.nearby.messages.Strategy;
import java.io.InputStream;
import java.util.List;

/* compiled from: AbsResponseWrapper.java */
/* loaded from: classes.dex */
public abstract class EYQ {
    List<HX.mZx> EYQ;
    Kbd mZx;

    public abstract int EYQ();

    protected String EYQ(int i) {
        switch (i) {
            case 200:
                return "OK";
            case 201:
                return "Created";
            case 202:
                return "Accepted";
            case 203:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case 205:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (i) {
                    case Strategy.TTL_SECONDS_DEFAULT /* 300 */:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case 302:
                        return "Temporary Redirect";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case 305:
                        return "Use Proxy";
                    default:
                        switch (i) {
                            case 400:
                                return "Bad Request";
                            case 401:
                                return "Unauthorized";
                            case 402:
                                return "Payment Required";
                            case 403:
                                return "Forbidden";
                            case 404:
                                return "Not Found";
                            case 405:
                                return "Method Not Allowed";
                            case 406:
                                return "Not Acceptable";
                            case TTAdConstant.DOWNLOAD_APP_INFO_CODE /* 407 */:
                                return "Proxy Authentication Required";
                            case TTAdConstant.DOWNLOAD_URL_CODE /* 408 */:
                                return "Request Time-Out";
                            case TTAdConstant.IMAGE_LIST_CODE /* 409 */:
                                return "Conflict";
                            case TTAdConstant.IMAGE_LIST_SIZE_CODE /* 410 */:
                                return "Gone";
                            case TTAdConstant.IMAGE_CODE /* 411 */:
                                return "Length Required";
                            case TTAdConstant.IMAGE_URL_CODE /* 412 */:
                                return "Precondition Failed";
                            case TTAdConstant.VIDEO_INFO_CODE /* 413 */:
                                return "Request Entity Too Large";
                            case TTAdConstant.VIDEO_URL_CODE /* 414 */:
                                return "Request-URI Too Large";
                            case TTAdConstant.VIDEO_COVER_URL_CODE /* 415 */:
                                return "Unsupported Media Type";
                            default:
                                switch (i) {
                                    case 500:
                                        return "Internal Server Error";
                                    case 501:
                                        return "Not Implemented";
                                    case 502:
                                        return "Bad Gateway";
                                    case TypedValues.PositionType.TYPE_PERCENT_WIDTH /* 503 */:
                                        return "Service Unavailable";
                                    case TypedValues.PositionType.TYPE_PERCENT_HEIGHT /* 504 */:
                                        return "Gateway Timeout";
                                    case 505:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    public abstract String EYQ(String str, String str2);

    public abstract String IPb();

    public abstract String Kbd();

    public abstract InputStream Pm();

    public abstract List<HX.mZx> Td();

    public abstract boolean mZx();

    public Kbd VwS() {
        return this.mZx;
    }

    protected HX.mZx EYQ(String str) {
        List<HX.mZx> list;
        if (str != null && (list = this.EYQ) != null && list.size() > 0) {
            for (HX.mZx mzx : this.EYQ) {
                if (str.equals(mzx.EYQ)) {
                    return mzx;
                }
            }
        }
        return null;
    }
}
