#!/usr/bin/env node

import express from 'express';
import cors from 'cors';
import helmet from 'helmet';
import morgan from 'morgan';

// Simple logger instead of using the core package
const logger = {
  info: (msg) => console.log(`[INFO] ${typeof msg === 'object' ? JSON.stringify(msg) : msg}`),
  error: (msg) => console.error(`[ERROR] ${typeof msg === 'object' ? JSON.stringify(msg) : msg}`),
  debug: (msg) => console.debug(`[DEBUG] ${typeof msg === 'object' ? JSON.stringify(msg) : msg}`),
  warn: (msg) => console.warn(`[WARN] ${typeof msg === 'object' ? JSON.stringify(msg) : msg}`)
};

const app = express();
const DEFAULT_PORT = 3100;

// Apply middleware
app.use(helmet());
app.use(cors());
app.use(morgan('dev'));
app.use(express.json());

// Demo endpoints
app.get('/api/health', (req, res) => {
  res.json({
    status: 'ok',
    timestamp: new Date().toISOString(),
    version: '2.5.0',
    queues: {
      active: 0,
      pending: 0
    }
  });
});

app.post('/api/echo', (req, res) => {
  res.json({
    message: 'Echo endpoint',
    receivedData: req.body
  });
});

// Documentation endpoint
app.get('/api', (req, res) => {
  res.json({
    message: 'ADReward API Server',
    version: '2.5.0',
    endpoints: [
      { path: '/api/health', method: 'GET', description: 'Health check endpoint' },
      { path: '/api/echo', method: 'POST', description: 'Echo test endpoint' }
    ],
    documentation: 'See PHASE5_IMPLEMENTATION.md for full API documentation'
  });
});

// Start the server
const port = parseInt(process.env.PORT || DEFAULT_PORT.toString(), 10);
const server = app.listen(port, () => {
  logger.info(`ADReward API server listening on port ${port}`);
});

// Handle graceful shutdown
process.on('SIGTERM', () => {
  logger.info('SIGTERM received, shutting down gracefully');
  server.close(() => {
    logger.info('Server closed');
    process.exit(0);
  });
}); 