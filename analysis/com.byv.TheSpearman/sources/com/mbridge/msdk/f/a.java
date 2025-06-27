package com.mbridge.msdk.f;

import android.text.TextUtils;

/* compiled from: AllTypeErrorMsgToCodeUtils.java */
/* loaded from: classes4.dex */
public final class a {
    public static int a(int i, String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        try {
            if (TextUtils.isEmpty(str)) {
                return i;
            }
            if (str.startsWith("errorCode: ") && str.length() > 16) {
                return Integer.parseInt(str.substring(11, 15));
            }
            if (!str.equals("do not have sorceList")) {
                if (!str.equals("Network error,UnknownHostException")) {
                    if (!str.equals("v3 is timeout")) {
                        if (!str.equals("Current unit is loading!") && !str.equals("current unit is loading")) {
                            if (!str.equals("Network error,I/O exception response null")) {
                                if (!str.equals("Network error,ConnectException")) {
                                    if (!str.equals("Network error,socket timeout exception")) {
                                        if (!str.equals("Network error,disconnected network exception")) {
                                            if (!str.equals("Network error,timeout exception")) {
                                                if (!str.startsWith("Network error,please check state code")) {
                                                    if (!str.equals("Network error,I/O exception contents null")) {
                                                        if (str.equals("Network unknown error")) {
                                                            i5 = i + 600;
                                                        } else {
                                                            if (str.equals("Network error,I/O exception")) {
                                                                return i + 600 + 13;
                                                            }
                                                            if (str.equals("web env is not support")) {
                                                                return i + 600 + 14;
                                                            }
                                                            if (str.equals("Network error,unknown")) {
                                                                return i + 600 + 15;
                                                            }
                                                            if (str.equals("Network error，sslp exception")) {
                                                                return i + 600 + 16;
                                                            }
                                                            if (str.startsWith("Cast exception, return data")) {
                                                                return i + 600 + 17;
                                                            }
                                                            if (str.equals("REQUEST_TIMEOUT")) {
                                                                i13 = i + 700;
                                                            } else if (str.startsWith("The server returns an exception")) {
                                                                i12 = i + 700;
                                                            } else if (str.equals("APP ALREADY INSTALLED") || str.equals("Need show campaign list is NULL!")) {
                                                                i3 = i + 700;
                                                            } else if (str.startsWith("load no ad")) {
                                                                i2 = i + 700;
                                                            } else if (str.equals("EXCEPTION_UNIT_NOT_FOUND_IN_APP")) {
                                                                i11 = i + 700;
                                                            } else if (str.equals("EXCEPTION_UNIT_BIDDING_TYPE_ERROR")) {
                                                                i10 = i + 700;
                                                            } else if (str.equals("No video campaign")) {
                                                                i9 = i + 700;
                                                            } else if (str.equals("EXCEPTION_RETURN_EMPTY")) {
                                                                i4 = i + 700;
                                                            } else if (str.equals("EXCEPTION_APP_PLATFORM_ERROR")) {
                                                                i8 = i + 700;
                                                            } else if (str.equals("EXCEPTION_SERVICE_REQUEST_OS_VERSION_REQUIRED")) {
                                                                i7 = i + 700;
                                                            } else if (str.equals("banner res load failed")) {
                                                                i13 = i + 800;
                                                            } else if (str.equals("resource load timeout is tpl: false")) {
                                                                i12 = i + 800;
                                                            } else if (str.startsWith("resource download failed")) {
                                                                i3 = i + 800;
                                                            } else if (str.equals("temp preload success but isReady false")) {
                                                                i2 = i + 800;
                                                            } else if (str.equals("temp resource download failed")) {
                                                                i11 = i + 800;
                                                            } else if (str.equals("tpl temp resource download failed")) {
                                                                i10 = i + 800;
                                                            } else if (str.equals("resource load timeout is tpl: true")) {
                                                                i9 = i + 800;
                                                            } else {
                                                                if (!str.startsWith("https://") && !str.startsWith("http://")) {
                                                                    if (str.equals("mraid resource write fail")) {
                                                                        i8 = i + 800;
                                                                    } else if (str.startsWith("data save failed:")) {
                                                                        i7 = i + 800;
                                                                    } else if (str.equals("resource load timeout")) {
                                                                        i6 = i + 800;
                                                                    } else {
                                                                        if (!str.startsWith("tpl temp preload failed")) {
                                                                            return i;
                                                                        }
                                                                        i5 = i + 800;
                                                                    }
                                                                }
                                                                i4 = i + 800;
                                                            }
                                                        }
                                                        return i5 + 12;
                                                    }
                                                    i6 = i + 600;
                                                    return i6 + 11;
                                                }
                                                i7 = i + 600;
                                                return i7 + 10;
                                            }
                                            i8 = i + 600;
                                            return i8 + 9;
                                        }
                                        i4 = i + 600;
                                        return i4 + 8;
                                    }
                                    i9 = i + 600;
                                    return i9 + 7;
                                }
                                i10 = i + 600;
                                return i10 + 6;
                            }
                            i11 = i + 600;
                            return i11 + 5;
                        }
                        i2 = i + 600;
                        return i2 + 4;
                    }
                    i3 = i + 600;
                    return i3 + 3;
                }
                i12 = i + 600;
                return i12 + 2;
            }
            i13 = i + 600;
            return i13 + 1;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }
}
