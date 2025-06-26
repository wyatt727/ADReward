# ADReward Test Failures Report

## Summary
Testing the ADReward project encountered several issues that prevented successful test execution. This document outlines the specific problems identified and potential solutions.

## Build Failures

### TypeScript Compilation Errors
Running `pnpm build` failed with the following TypeScript errors:

1. **Error in src/apk.ts**:
   - Lines 89, 102: `error TS2349: This expression is not callable`
   - Issues with retry pattern usage

2. **Error in src/cli.ts**:
   - Lines 1-3: `error TS2304: Cannot find name 'program'`

3. **Error in src/hooks.ts**:
   - Line 127: `error TS2451: Cannot redeclare block-scoped variable 'pipelineHooks'`
   - Line 301: `error TS2451: Cannot redeclare block-scoped variable 'pipelineHooks'`

4. **Error in src/index.ts**:
   - Line 12: `error TS2308: Module './hooks.js' has already exported a member named 'registerPlugin'`

5. **Error in src/pluginLoader.ts**:
   - Lines 96, 164: `error TS2769: No overload matches this call`
   - Missing 'registerPlugin' property in PipelineHooks type

6. **Error in src/utils/workerPool.ts**:
   - Line 9: `error TS2709: Cannot use namespace 'Piscina' as a type`
   - Line 20: `error TS2709: Cannot use namespace 'Piscina' as a type`
   - Line 30: `error TS2351: This expression is not constructable`
   - Issues with Piscina typing

## Test Execution Failures

### Missing Dependencies
Tests failed to run due to missing package dependencies:

1. **Core package tests**:
   - Cannot find package `@adreward/hooks-base` imported from test files
   - The packages need to be built and linked properly before tests can run

### Test File Issues

1. **test-diff.js**:
   - ReferenceError: describe is not defined
   - The tests are using Jest style but Jest isn't properly configured

2. **test-hooks.js**:
   - Error finding `@adreward/hooks-base` package

3. **test-plugin-hooks.js**:
   - Cannot find module '../src/hooks.js'

4. **test-retry.js**:
   - Cannot find module '../src/utils/retry.js'

5. **test-watch.js**:
   - SyntaxError: Identifier 'fs' has already been declared

## Server Package Issues

1. **No tests specified**:
   - The server package has a test script that immediately exits with an error: `Error: no test specified`

## Kotlin IR Scanner Tests

The Kotlin IR Scanner package tests were the only successful tests:

```
./gradlew test

BUILD SUCCESSFUL in 10s
6 actionable tasks: 5 executed, 1 up-to-date
```

However, there was one warning in the code that should be addressed:
- `file:///Users/pentester/Tools/ADReward/packages/ktir-scanner/src/main/kotlin/com/adreward/ktir/families/UnityIR.kt:25:13 Variable 'parentClass' is never used`

## CLI Smoke Test

Running a basic CLI smoke test also failed:

```
$ node packages/cli/dist/cli.js --help
file:///Users/pentester/Tools/ADReward/packages/core/dist/hooks.js:140
export const pipelineHooks = new PipelineHooks();
             ^

SyntaxError: Identifier 'pipelineHooks' has already been declared
```

This confirms the issue with duplicate declarations in the hooks.js file that was detected during the build phase.

## Linting Issues

Running `pnpm lint` shows that the linting scripts are not properly set up:

```
> adreward@2.5.0 lint /Users/pentester/Tools/ADReward
> pnpm run -r lint

Scope: 4 of 5 workspace projects
None of the selected packages has a "lint" script
```

Despite the CI pipeline referencing a lint step, none of the packages actually have a lint script defined in their package.json files.

## CI Configuration

The project's CI workflow (.github/workflows/ci.yml) shows the expected test process:

1. Build the Kotlin IR scanner with Gradle
2. Run linting with `pnpm lint`
3. Build TypeScript with `pnpm build`
4. Run tests with `pnpm test`
5. Additional matrix tests for various features

## Recommendations

To fix the test issues:

1. **Fix TypeScript errors**:
   - Address all TS errors in the codebase to enable successful builds
   - Particularly fix the duplicate declarations of 'pipelineHooks' in hooks.js

2. **Set up proper module resolution**:
   - Ensure all workspace packages are properly linked with pnpm

3. **Configure Jest properly**:
   - Update Jest configuration to recognize the ESM test files
   - Fix the tests to use proper imports

4. **Set up test scripts in package.json**:
   - Add proper test scripts for each package

5. **Fix individual test files**:
   - Address specific issues in each test file, especially duplicate imports and missing dependencies 

6. **Fix warning in Kotlin code**:
   - Address the unused 'parentClass' variable in UnityIR.kt

7. **Set up proper linting**:
   - Add lint scripts to each package's package.json
   - Configure ESLint with appropriate rules for the project 