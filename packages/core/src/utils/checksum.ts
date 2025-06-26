import crypto from 'crypto';
import fs from 'fs';

export function fileHash(fp: string): string {
  const h = crypto.createHash('sha256');
  h.update(fs.readFileSync(fp));
  return h.digest('hex');
} 