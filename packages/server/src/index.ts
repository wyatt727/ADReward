import express from 'express';
import cors from 'cors';
import helmet from 'helmet';
import morgan from 'morgan';
import { logger } from '@adreward/core';
import { apkRouter } from './routes/apk.js';
import { scanRouter } from './routes/scan.js';
import { fridaRouter } from './routes/frida.js';
import healthRouter from './routes/health.js';

const DEFAULT_PORT = 3100;

/**
 * Start the ADReward REST API server
 * @param port Port number to listen on
 * @returns Express server instance
 */
export async function startServer(port: number = DEFAULT_PORT) {
  const app = express();

  // Apply middleware
  app.use(helmet());
  app.use(cors());
  app.use(morgan('dev'));
  app.use(express.json());
  
  // Register routes
  app.use('/api/health', healthRouter);
  app.use('/api/apk', apkRouter);
  app.use('/api/scan', scanRouter);
  app.use('/api/frida', fridaRouter);
  
  // Error handling middleware
  app.use((err: any, req: express.Request, res: express.Response, next: express.NextFunction) => {
    logger.error(`API error: ${err.message}`);
    res.status(err.status || 500).json({
      error: {
        message: err.message,
        code: err.code || 'SERVER_ERROR'
      }
    });
  });

  // Start the server
  return new Promise<express.Express>((resolve) => {
    const server = app.listen(port, () => {
      logger.info(`ADReward API server listening on port ${port}`);
      resolve(app);
    });
    
    // Handle graceful shutdown
    process.on('SIGTERM', () => {
      logger.info('SIGTERM received, shutting down gracefully');
      server.close(() => {
        logger.info('Server closed');
        process.exit(0);
      });
    });
  });
}

// Start the server if this file is run directly
if (process.argv[1] === import.meta.url || process.env.NODE_ENV === 'production') {
  const port = parseInt(process.env.PORT || DEFAULT_PORT.toString(), 10);
  startServer(port).catch((error) => {
    logger.error(`Failed to start server: ${error.message}`);
    process.exit(1);
  });
} 