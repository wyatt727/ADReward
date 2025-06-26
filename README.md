# ADReward

ADReward (formerly APK-Frida) is a powerful tool for analyzing and bypassing ad reward mechanisms in Android applications. It automatically extracts APKs from connected devices, decompiles them, discovers monetization hooks, and generates ready-to-run Frida scripts.

## Features

- 🔌 **Device discovery** - Finds connected ADB devices and validates their state
- 📦 **APK / AAB extraction** - Pulls apps directly from the device; handles split APKs and bundles
- ♻️ **Incremental cache** - Skips redundant operations when checksum unchanged
- 🪄 **Decompilation** - Converts APK to Smali using JADX
- ⚡ **Parallel pattern scan** - Multi-threaded analysis for speed
- 🪙 **Hook discovery** - Locates AdMob, Unity Ads, and other reward handlers
- 🏗 **Pluggable hook families** - Easily extend with new ad SDK patterns
- 🏃 **Frida-server lifecycle** - Auto-downloads, installs, and manages Frida server
- 📝 **Frida script generation** - Creates interception stubs that fire genuine reward callbacks
- 🚀 **Deploy helper** - Generates ready-to-run deployment scripts
- 🔍 **Kotlin IR scanner** - Advanced analysis of Kotlin bytecode to find obfuscated hooks

## New Features in v2.4.0

### Live Watch / Hot-Reload

The new watch mode allows you to automatically reload your Frida script when it changes, making development and debugging much faster.

```bash
adreward --package com.example.app --gen-script --watch
```

This will:
1. Generate a Frida script as usual
2. Start Frida with the target app
3. Watch the generated script for changes
4. Automatically reload the script when it changes

If you have Frida v16+, it will use the `--reload` flag for seamless updates. For older versions, it will restart the Frida process each time the script changes.

### Diff-Mode Reporting

Compare two component scan files to see what changed between versions:

```bash
adreward diff ./analysis/scan-results/components-old.json ./analysis/scan-results/components-new.json
```

This will show:
- Added hooks (new in the second file)
- Removed hooks (only in the first file)
- Changed hooks (same class/method but different attributes)
- Summary statistics

Options:
- `--show-unchanged`: Also show unchanged hooks
- `--output <path>`: Save the diff to a file

### Automatic Scan Result Storage

When using `--analyze`, component maps are now automatically saved to:

```
./analysis/<package>/scan-results/components-<timestamp>.json
```

This makes it easy to track changes between versions and use the diff command.

## REST API Server

ADReward now includes a REST API server that allows headless operation and integration with other systems.

### Starting the API Server

```bash
# Install dependencies
pnpm install

# Build all packages
pnpm build

# Start the API server
pnpm server
```

The API server will be available at `http://localhost:3100`.

### Docker Container

ADReward can be run in a Docker container:

```bash
# Build the Docker image
pnpm docker:build

# Run the container
pnpm docker:run

# The API is now available at http://localhost:3100
```

### API Endpoints

The API provides the following main endpoints:

1. **APK Operations**
   - `POST /api/apk/acquire` - Pull APK from a connected device
   - `POST /api/apk/upload` - Upload an APK file

2. **Scan Operations**
   - `POST /api/scan/decompile` - Decompile an APK
   - `POST /api/scan/analyze` - Scan a decompiled APK for hooks
   - `GET /api/scan/results/:jobId` - Get scan results

3. **Frida Operations**
   - `POST /api/frida/generate` - Generate a Frida script
   - `POST /api/frida/ensure-server` - Ensure Frida server is running
   - `GET /api/frida/script/:packageName` - Get a generated script

4. **Health and Monitoring**
   - `GET /api/health` - Server status and queue stats
   - `GET /api/health/jobs` - List all jobs
   - `GET /api/health/jobs/:id` - Get specific job status

For more details, see the [Phase 5 implementation documentation](./PHASE5_IMPLEMENTATION.md).

## Installation

```bash
# Clone the repository
git clone https://github.com/your-username/adreward.git
cd adreward

# Install dependencies
pnpm install

# Build the project
pnpm build
```

## Usage

```bash
# Basic usage
node packages/cli/dist/cli.js --package com.example.app

# Pull APK, analyze, and generate script
node packages/cli/dist/cli.js --package com.example.app --pull --analyze --gen-script

# Specify a device
node packages/cli/dist/cli.js --package com.example.app --device emulator-5554

# Use Kotlin IR scanner for advanced detection
node packages/cli/dist/cli.js --package com.example.app --ktir

# Verbose logging
node packages/cli/dist/cli.js --package com.example.app --verbose
```

### Options

- `-p, --package <n>`: Android package name
- `-d, --device <id>`: ADB device ID (uses first online device if omitted)
- `--pull`: Pull APK/AAB from device (default: false)
- `--analyze`: Decompile & scan (default: true)
- `--gen-script`: Generate Frida hook (default: true)
- `--hooks <list>`: Hook families as CSV (default: "admob,unity")
- `-o, --out <dir>`: Output directory (default: "./analysis")
- `-v, --verbose`: Verbose logging
- `--ktir`: Use Kotlin IR scanner (requires d2j-dex2jar)

## Requirements

- Node.js 20+
- pnpm
- ADB
- JADX
- Frida
- dex2jar (optional, for Kotlin IR scanning)

## Project Structure

```
adreward/
├── packages/
│   ├── cli/         # Command-line interface
│   ├── core/        # Core functionality
│   ├── hooks-base/  # Built-in hook families
│   └── ktir-scanner/ # Kotlin IR scanner
├── jars/
│   └── ktir-scanner.jar # Compiled Kotlin IR scanner
```

## Kotlin IR Scanner

The Kotlin IR scanner is an advanced feature that allows ADReward to analyze the Kotlin Intermediate Representation (IR) of an application. This enables detection of hooks even in heavily obfuscated Kotlin code, where traditional bytecode analysis might fail.

To use the Kotlin IR scanner:

1. Install dex2jar: `brew install dex2jar` (macOS) or download from [GitHub](https://github.com/pxb1988/dex2jar)
2. Run ADReward with the `--ktir` flag

## License

MIT

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request. 