import express from 'express';
import request from 'supertest';
import healthRouter from '../dist/routes/health.js';

describe('Health API routes', () => {
  let app;

  beforeEach(() => {
    app = express();
    app.use(express.json());
    app.use('/api/health', healthRouter);
  });

  it('GET /api/health should return status ok', async () => {
    const response = await request(app).get('/api/health');
    
    expect(response.status).toBe(200);
    expect(response.body).toHaveProperty('status', 'ok');
    expect(response.body).toHaveProperty('timestamp');
    expect(response.body).toHaveProperty('version');
  });
  
  it('GET /api/health/jobs should return jobs array', async () => {
    const response = await request(app).get('/api/health/jobs');
    
    expect(response.status).toBe(200);
    expect(response.body).toHaveProperty('jobs');
    expect(Array.isArray(response.body.jobs)).toBe(true);
  });
  
  it('GET /api/health/jobs/:id with invalid ID should return 404', async () => {
    const response = await request(app).get('/api/health/jobs/non-existent-id');
    
    expect(response.status).toBe(404);
    expect(response.body).toHaveProperty('error');
    expect(response.body.error).toHaveProperty('code', 'JOB_NOT_FOUND');
  });
}); 