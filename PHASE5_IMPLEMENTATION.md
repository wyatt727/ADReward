# Phase 5 Implementation - REST API Gateway

## 1. Overview

Phase 5 implemented a REST API Gateway for ADReward, following the roadmap outlined in the upgrade plan. This phase creates a headless API server that enables integration with other systems and automation pipelines. The REST API exposes all the core functionality of ADReward through standard HTTP endpoints.

## 2. API Server Implementation

### 2.1 Express Integration

We implemented a REST API server using Express, a popular Node.js web framework. The server is designed to be run either standalone or in a Docker container:

```typescript
import express from 'express';
import cors from 'cors';
import helmet from 'helmet';
import morgan from 'morgan';

export async function startServer(port: number = 3100) {
  const app = express();
  
  // Security and logging middleware
  app.use(helmet());
  app.use(cors());
  app.use(morgan('dev'));
  app.use(express.json());
  
  // API routes
  app.use('/api/health', healthRouter);
  app.use('/api/apk', apkRouter);
  app.use('/api/scan', scanRouter);
  app.use('/api/frida', fridaRouter);
  
  // Start listening
  return new Promise<express.Express>((resolve) => {
    const server = app.listen(port, () => {
      logger.info(`ADReward API server listening on port ${port}`);
      resolve(app);
    });
  });
}
```

### 2.2 Asynchronous Job Queue

To handle potentially long-running operations without blocking the API, we implemented a job queue system using `p-queue`:

```typescript
class QueueSystem {
  private queues: Record<JobType, PQueue> = {
    [JobType.APK_ACQUISITION]: new PQueue({ concurrency: 2 }),
    [JobType.DECOMPILE]: new PQueue({ concurrency: 1 }),
    [JobType.SCAN]: new PQueue({ concurrency: 1 }),
    [JobType.FRIDA]: new PQueue({ concurrency: 2 })
  };
  
  async addJob<T, R>(job: Job<T, R>, task: (data: T) => Promise<R>): Promise<Job<T, R>> {
    // Queue implementation...
  }
}
```

The queue system provides:
- Different concurrency limits for different operation types
- Job status tracking and progress updates
- Error handling and retry logic

### 2.3 API Endpoints

We implemented the following API routes:

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

## 3. Docker Containerization

### 3.1 Multi-stage Dockerfile

We created a multi-stage Dockerfile to produce a minimal production image:

```dockerfile
# Build stage
FROM node:20-slim AS builder
# Build dependencies and compile TypeScript...

# Production stage
FROM node:20-slim
# Install runtime dependencies...
# Copy built files...
EXPOSE 3100
CMD ["node", "packages/server/dist/index.js"]
```

### 3.2 Container Features

The Docker container includes:
- ADB tools for device communication
- OpenJDK for running tools like Bundletool and ktir-scanner
- Proper volume mounts for persistent storage
- Security hardening via Helmet middleware

## 4. API Design and Usage

### 4.1 Asynchronous Processing Model

All long-running operations follow an asynchronous pattern:
1. Client submits a job
2. Server immediately returns a job ID
3. Client polls for job status or receives webhook notifications
4. Results are made available when the job completes

Example flow:
```
POST /api/apk/acquire
→ 202 Accepted, { jobId: '123abc', statusUrl: '/api/health/jobs/123abc' }

GET /api/health/jobs/123abc
→ 200 OK, { status: 'completed', result: { apkPath: '/path/to/file.apk' } }
```

### 4.2 Error Handling

Robust error handling throughout the API:
- Standardized error format
- HTTP status codes aligned with semantics
- Detailed error messages and codes

```json
{
  "error": {
    "message": "APK file not found",
    "code": "APK_NOT_FOUND"
  }
}
```

## 5. Integration into Core Pipeline

### 5.1 Core Functionality

The API server uses the core ADReward functionality directly:
- `acquire` - For APK acquisition
- `decompile` - For APK decompilation
- `scan` - For hook scanning
- `generateFrida` - For script generation

This ensures that the API and CLI share the same underlying implementation and behavior.

### 5.2 Dockerization and Deployment

The server can be easily deployed in various environments:

```bash
# Build the Docker image
pnpm docker:build

# Run the container
pnpm docker:run

# The API is now available at http://localhost:3100
```

## 6. Benefits and Improvements

### 6.1 Automation

- **CI/CD Integration**: Deploy hooks to devices automatically through CI pipelines
- **Batch Processing**: Analyze multiple APKs through API calls
- **Webhooks**: Get notifications when long-running jobs complete

### 6.2 Headless Operation

- **Server Mode**: Run without a UI, ideal for server environments
- **Remote Access**: Control ADReward from other machines
- **Containerization**: Deploy in cloud environments

### 6.3 Scalability

- **Job Queuing**: Handle multiple requests without overloading resources
- **Concurrent Processing**: Process multiple APKs in parallel
- **Stateless Design**: Allow horizontal scaling across multiple instances

## 7. Testing

Tested the implementation with the following scenarios:

1. **Functional Testing**: Verified all endpoints work as expected
2. **Load Testing**: Ensured proper queueing under load
3. **Error Handling**: Validated error responses and recovery
4. **Docker Deployment**: Verified container operation

## 8. Next Steps

With the REST API gateway now implemented, future enhancements could include:

1. **Authentication**: Add JWT or API key authentication
2. **Metrics Collection**: Implement Prometheus metrics
3. **WebSocket Support**: Real-time job status updates
4. **Rate Limiting**: Protect against API abuse
5. **Documentation**: Generate OpenAPI/Swagger documentation

## 9. Conclusion

Phase 5 successfully implemented a REST API gateway for ADReward, enabling headless operation and integration with other systems. The API follows RESTful design principles, with asynchronous job processing and robust error handling. The Docker container provides an easy way to deploy the API in various environments. 