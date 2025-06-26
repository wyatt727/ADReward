import { Router } from 'express';
import { v4 as uuidv4 } from 'uuid';
import path from 'path';
import fs from 'fs/promises';
import multer from 'multer';
import { acquire, requireDevice, logger } from '@adreward/core';
import { jobQueue, JobType, JobStatus } from '../queue.js';

const router = Router();

// Define storage for uploaded APK files
const storage = multer.diskStorage({
  destination: async (req, file, cb) => {
    const uploadDir = path.join(process.cwd(), 'uploads');
    try {
      await fs.mkdir(uploadDir, { recursive: true });
      cb(null, uploadDir);
    } catch (err) {
      cb(err as Error, uploadDir);
    }
  },
  filename: (req, file, cb) => {
    const uniqueSuffix = Date.now() + '-' + Math.round(Math.random() * 1E9);
    cb(null, uniqueSuffix + '-' + file.originalname);
  }
});

const upload = multer({ storage });

interface AcquireApkRequest {
  packageName: string;
  deviceId?: string;
  outputDir?: string;
  pull?: boolean;
}

/**
 * POST /api/apk/acquire
 * Acquire an APK from a device
 */
router.post('/acquire', async (req, res, next) => {
  try {
    const { packageName, deviceId, outputDir, pull } = req.body as AcquireApkRequest;
    
    if (!packageName) {
      return res.status(400).json({
        error: {
          message: 'Package name is required',
          code: 'MISSING_PACKAGE_NAME'
        }
      });
    }
    
    const jobId = uuidv4();
    const outDir = outputDir || path.join(process.cwd(), 'analysis', packageName);
    
    // Create job
    const job = {
      id: jobId,
      type: JobType.APK_ACQUISITION,
      priority: 1,
      status: JobStatus.PENDING,
      data: {
        packageName,
        deviceId,
        outDir,
        pull: pull || false
      }
    };
    
    // Queue job
    jobQueue.addJob(job, async (data) => {
      // Ensure output directory exists
      await fs.mkdir(data.outDir, { recursive: true });
      
      // Get device
      const device = await requireDevice(data.deviceId);
      logger.info(`Using device ${device} for APK acquisition`);
      
      // Acquire APK
      const apkPath = await acquire(data.packageName, device, {
        pull: data.pull,
        out: data.outDir
      });
      
      return { apkPath };
    }).catch(next);
    
    // Return job ID immediately
    res.status(202).json({
      jobId,
      message: `APK acquisition for ${packageName} has been queued`,
      status: JobStatus.PENDING,
      statusUrl: `/api/health/jobs/${jobId}`
    });
  } catch (error) {
    next(error);
  }
});

/**
 * POST /api/apk/upload
 * Upload an APK file
 */
router.post('/upload', upload.single('apk'), async (req, res, next) => {
  try {
    const file = req.file;
    
    if (!file) {
      return res.status(400).json({
        error: {
          message: 'No APK file provided',
          code: 'MISSING_APK_FILE'
        }
      });
    }
    
    // Generate package name from the filename if not provided
    const packageName = req.body.packageName || 
      path.basename(file.originalname, path.extname(file.originalname));
    
    const targetDir = path.join(process.cwd(), 'analysis', packageName);
    const targetPath = path.join(targetDir, `${packageName}.apk`);
    
    await fs.mkdir(targetDir, { recursive: true });
    await fs.copyFile(file.path, targetPath);
    
    res.status(201).json({
      message: 'APK uploaded successfully',
      packageName,
      apkPath: targetPath
    });
  } catch (error) {
    next(error);
  }
});

export const apkRouter = router; 