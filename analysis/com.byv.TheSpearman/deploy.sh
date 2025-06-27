#!/bin/bash

# Package name
PACKAGE_NAME="com.byv.TheSpearman"

# Check for attach mode
if [ "$1" == "attach" ]; then
    echo "Running in attach mode - connecting to existing app instance..."
    # Verify the app is already running
    APP_RUNNING=$(adb shell "ps -A | grep $PACKAGE_NAME")
    
    if [ -z "$APP_RUNNING" ]; then
        echo "App is not running. Please launch the app manually first."
        exit 1
    fi
    
    echo "App is running. Attaching Frida..."
    frida -U -n "$PACKAGE_NAME" -l "auto-ad-bypass.js"
    exit 0
fi

# Normal mode - close and relaunch app
# Make sure any existing instances are closed
echo "Stopping any running instances of the app..."
adb shell am force-stop $PACKAGE_NAME
sleep 2

# Launch the app normally
echo "Launching app normally..."
adb shell am start -n $PACKAGE_NAME/.MainActivity  # Try to use main activity directly
sleep 2

# Verify that app is running
echo "Verifying app is running..."
APP_RUNNING=$(adb shell "ps -A | grep $PACKAGE_NAME")

if [ -z "$APP_RUNNING" ]; then
    echo "App is not running, trying alternative launch method..."
    adb shell monkey -p $PACKAGE_NAME -c android.intent.category.LAUNCHER 1
    sleep 3
    
    APP_RUNNING=$(adb shell "ps -A | grep $PACKAGE_NAME")
    if [ -z "$APP_RUNNING" ]; then
        echo "ERROR: App is still not running. It may be crashing on startup."
        echo "Try launching the app manually first, then run this command:"
        echo "frida -U -n \"$PACKAGE_NAME\" -l \"auto-ad-bypass.js\""
        exit 1
    fi
fi

echo "App is running! Attaching Frida..."
frida -U -n "$PACKAGE_NAME" -l "auto-ad-bypass.js"

# Note: The script itself will detect when Java is ready using dlopen interception