import { Router } from 'express';
import { v4 as uuidv4 } from 'uuid';
import path from 'path';
import fs from 'fs/promises';
import { ensureFridaServer, generateFrida, logger } from '@adreward/core';
import { jobQueue, JobType, JobStatus } from '../queue.js';

const router = Router();

interface FridaGenerateRequest {
  packageName: string;
  components: Record<string, any[]>;
  deviceId?: string;
  outputDir?: string;
}

/**
 * POST /api/frida/generate
 * Generate a Frida script for a package
 */
router.post('/generate', async (req, res, next) => {
  try {
    const { packageName, components, outputDir } = req.body as FridaGenerateRequest;
    
    if (!packageName) {
      return res.status(400).json({
        error: {
          message: 'Package name is required',
          code: 'MISSING_PACKAGE_NAME'
        }
      });
    }
    
    if (!components || Object.keys(components).length === 0) {
      return res.status(400).json({
        error: {
          message: 'Component map is required',
          code: 'MISSING_COMPONENTS'
        }
      });
    }
    
    const jobId = uuidv4();
    const outDir = outputDir || path.join(process.cwd(), 'analysis');
    
    // Create job
    const job = {
      id: jobId,
      type: JobType.FRIDA,
      priority: 1,
      status: JobStatus.PENDING,
      data: {
        packageName,
        components,
        outDir
      }
    };
    
    // Queue job
    jobQueue.addJob(job, async (data) => {
      // Generate Frida script
      const scriptPaths = await generateFrida(data.packageName, data.components, data.outDir);
      
      return {
        scriptPath: scriptPaths.script,
        deployPath: scriptPaths.deploy
      };
    }).catch(next);
    
    // Return job ID immediately
    res.status(202).json({
      jobId,
      message: `Frida script generation for ${packageName} has been queued`,
      status: JobStatus.PENDING,
      statusUrl: `/api/health/jobs/${jobId}`
    });
  } catch (error) {
    next(error);
  }
});

/**
 * POST /api/frida/ensure-server
 * Ensure Frida server is running on the device
 */
router.post('/ensure-server', async (req, res, next) => {
  try {
    const { deviceId } = req.body;
    
    const jobId = uuidv4();
    
    // Create job
    const job = {
      id: jobId,
      type: JobType.FRIDA,
      priority: 1,
      status: JobStatus.PENDING,
      data: {
        deviceId
      }
    };
    
    // Queue job
    jobQueue.addJob(job, async (data) => {
      // Ensure Frida server is running
      await ensureFridaServer(data.deviceId);
      return { success: true };
    }).catch(next);
    
    // Return job ID immediately
    res.status(202).json({
      jobId,
      message: `Ensuring Frida server on device ${deviceId || 'default'} has been queued`,
      status: JobStatus.PENDING,
      statusUrl: `/api/health/jobs/${jobId}`
    });
  } catch (error) {
    next(error);
  }
});

/**
 * GET /api/frida/script/:packageName
 * Get the generated Frida script for a package
 */
router.get('/script/:packageName', async (req, res, next) => {
  try {
    const packageName = req.params.packageName;
    const scriptPath = path.join(process.cwd(), 'analysis', packageName, 'auto-ad-bypass.js');
    
    try {
      await fs.access(scriptPath);
    } catch (error) {
      return res.status(404).json({
        error: {
          message: `Frida script not found for package ${packageName}`,
          code: 'SCRIPT_NOT_FOUND'
        }
      });
    }
    
    const scriptContent = await fs.readFile(scriptPath, 'utf-8');
    
    res.json({
      packageName,
      scriptPath,
      scriptContent
    });
  } catch (error) {
    next(error);
  }
});

// Export the router
export const fridaRouter: import('express').Router = router; 