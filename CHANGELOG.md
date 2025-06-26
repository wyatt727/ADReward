# Changelog

## 2.5.0 (2025-07-01)

### Hook Families
- **Added** IronSource reward detection for both IR and Smali scanning
- **Added** AppLovin MAX reward detection for both IR and Smali scanning
- **Added** Vungle reward detection for both IR and Smali scanning
- **Added** Facebook Audience Network reward detection for both IR and Smali scanning
- **Added** Google Play Billing detection for purchase validation and reward flow

### Build and CI
- **Fixed** Runtime crash from incorrect retry pattern usage
- **Added** GitHub Actions CI workflow for automated testing
- **Improved** Build process to ensure ktir-scanner.jar is correctly packaged
- **Added** Prepublish hook to build Kotlin IR scanner before publishing

### Documentation
- **Updated** README with comprehensive hook family documentation
- **Improved** API documentation for all new features

## 2.4.0 (2025-06-25)

### Features
- **Added** REST API Gateway for headless operation
- **Added** Job queue system for handling long-running operations
- **Added** Docker containerization for easy deployment
- **Added** Health and monitoring endpoints

### Improvements
- **Enhanced** API authentication and security headers
- **Improved** Error handling in all API routes
- **Added** Graceful shutdown hooks

## 2.3.0 (2025-06-05)

### Features
- **Added** Plugin architecture with lifecycle hooks
- **Added** Plugin loader for dynamic discovery
- **Added** Self-update command
- **Added** CSV Reporter plugin as example

### Improvements
- **Enhanced** CLI command registration
- **Improved** Update notifications

## 2.2.0 (2025-05-15)

### Features
- **Added** Generic retry helper with exponential backoff
- **Added** Crash reporter for better diagnostics
- **Added** Robust ADB command execution

### Improvements
- **Enhanced** Frida server management
- **Improved** APK processing with fallback options
- **Added** Better error messages and recovery behavior

## 2.1.0 (2025-05-01)

### Features
- **Added** Incremental decompile cache
- **Added** Shared worker pool using Piscina
- **Added** Structured timing system

### Improvements
- **Enhanced** Performance for large APKs
- **Added** Worker utilization tracking
- **Improved** CLI flags for timing information

## 2.0.0 (2025-04-15)

### Features
- **Added** Kotlin IR scanning for obfuscated apps
- **Redesigned** Core architecture for better extensibility
- **Added** Support for modern Android app bundles (AABs)

### Improvements
- **Enhanced** Hook detection accuracy
- **Improved** Decompilation reliability
- **Modernized** Javascript codebase to ESM 