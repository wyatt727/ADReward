import crypto from 'crypto';
import fs from 'fs';
export function fileHash(fp) {
    const h = crypto.createHash('sha256');
    h.update(fs.readFileSync(fp));
    return h.digest('hex');
}
//# sourceMappingURL=checksum.js.map