import os from 'os';
import fs from 'fs';
import path from 'path';

export function tmpdir(): string {
  const dir = path.join(os.tmpdir(), 'apk-frida');
  if (!fs.existsSync(dir)) fs.mkdirSync(dir, { recursive: true });
  return dir;
} 