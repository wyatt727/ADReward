#!/bin/bash

# Set the package name
PACKAGE_NAME="com.byv.TheSpearman"
APK_PATH="com.byv.TheSpearman.apk"

# Decompile APK with Apktool if not already decompiled
if [ ! -d "${PACKAGE_NAME}_decompiled" ]; then
    echo "[+] Decompiling ${APK_PATH}..."
    apktool d ${APK_PATH} -o ${PACKAGE_NAME}_decompiled
else
    echo "[*] ${PACKAGE_NAME}_decompiled directory already exists"
fi

# Check if decompilation was successful
if [ ! -d "${PACKAGE_NAME}_decompiled" ]; then
    echo "[-] Failed to decompile APK"
    exit 1
fi

# Find Unity ad classes
echo "[+] Searching for Unity ad classes..."
find ${PACKAGE_NAME}_decompiled -name "*.smali" -exec grep -l "UnityAds" {} \;

# Find Google ad classes
echo "[+] Searching for Google ad classes..."
find ${PACKAGE_NAME}_decompiled -name "*.smali" -exec grep -l "com/google/android/gms/ads" {} \;

# Function to backup and modify file
patch_file() {
    local FILE="$1"
    local SEARCH="$2"
    local REPLACE="$3"
    
    # Check if file exists
    if [ ! -f "$FILE" ]; then
        echo "[-] File not found: $FILE"
        return 1
    fi
    
    # Create backup
    cp "$FILE" "${FILE}.bak"
    
    # Make replacement
    sed -i'' -e "s|$SEARCH|$REPLACE|g" "$FILE"
    
    echo "[+] Patched: $FILE"
}

# This is where you would add specific patches for UnityAds or Google Ads
# You'd need to find and modify smali classes that contain ad logic

echo "[+] To patch specific ad classes:"
echo "    1. Find the smali files with ad logic"
echo "    2. Use the patch_file function to modify them"
echo "    3. Add patches for specific ad classes below"

# Example patch (uncomment and customize once you've found files to patch):
# patch_file "${PACKAGE_NAME}_decompiled/path/to/UnityAds.smali" \
#     "invoke-virtual {.*}, Lcom/unity3d/ads/UnityAds;->isReady(Ljava/lang/String;)Z" \
#     "const/4 v0, 0x1\nreturn v0"

echo "[+] Build the patched APK with: apktool b ${PACKAGE_NAME}_decompiled -o ${PACKAGE_NAME}_patched.apk" 