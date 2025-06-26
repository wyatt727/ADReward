# Phase 1 Implementation Report: Performance & Developer Experience

This document outlines the implementation details for Phase 1 of the ADReward codebase upgrade, focusing on performance improvements and developer experience enhancements.

## 1. Incremental Decompile Cache

### Implementation Details

- **Location**: `packages/core/src/decompile.ts`
- **Features**:
  - Added SHA-256 hash checksum for APK files to detect changes
  - Created `dex.hash.json` cache file containing hash information for all decompiled files
  - Added logic to skip decompilation when APK is unchanged
  - Implemented `--force-decompile` CLI flag to bypass cache

### Technical Approach

The implementation uses the following approach:
1. Calculate SHA-256 hash of the APK file
2. Check if a cache file exists and compare the stored APK hash
3. If the APK hash matches, reuse the existing decompilation
4. After decompilation, store file hashes in a JSON cache file
5. The cache includes:
   - APK hash
   - Timestamp of decompilation
   - Individual file hashes for all .smali and .java files

### CLI Integration

Added `--force-decompile` flag to the CLI to bypass the cache and force a full redecompilation.

## 2. Shared Worker Pool

### Implementation Details

- **Location**: `packages/core/src/utils/workerPool.ts`
- **Features**:
  - Created singleton `WorkerPool` class using Piscina
  - Replaced Worker Threads implementation with Piscina pool in `scan.ts`
  - Limited maximum threads to CPU count or 8, whichever is smaller
  - Added utilization tracking

### Technical Approach

1. Created a singleton worker pool that can be shared across the application
2. Made the scanWorker.ts compatible with both Worker Threads and Piscina
3. Implemented proper generic types for worker data and results

## 3. Structured Timings

### Implementation Details

- **Location**: `packages/core/src/utils/timing.ts`
- **Features**:
  - Created singleton `Timing` class using `perf_hooks`
  - Implemented phase timing for major operations
  - Added `time()` and `timeSync()` helper methods for timing code blocks
  - Added `--timings` CLI flag

### Technical Approach

1. Used Node's `PerformanceObserver` to track and report timing metrics
2. Wrapped key operations in timing phases:
   - `scan-total`: Overall scan time
   - `kotlin-metadata-check`: Time to check for Kotlin metadata
   - `kotlin-ir-setup`: Time to set up Kotlin IR scanner
   - `kotlin-ir-scan`: Time for the Kotlin IR scan to complete
   - `smali-scan`: Time for the Smali scan
   - `smali-file-discovery`: Time to find all Smali files
   - `smali-worker-processing`: Time to process files in worker threads
   - `results-merge`: Time to merge Kotlin IR and Smali results

### Integration Points

The timing utility is integrated with:
- Worker pool utilization metrics
- CLI via the `--timings` flag
- Detailed phase timing in logs

## Performance Improvements

- **Decompile Cache**: Eliminates redundant decompilation when APK is unchanged
- **Worker Pool**: More efficient thread management and resource utilization
- **Timings**: Provides insights into bottlenecks and performance characteristics

## Next Steps

Phase 1 implementation is now complete. The next phases will focus on:

1. **Phase 2: Reliability**
   - Generic retry helper
   - Crash reporter

2. **Phase 3: Plugin Architecture**
   - Lifecycle hooks
   - Plugin loader
   - Self-update command 