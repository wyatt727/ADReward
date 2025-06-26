import fs from 'fs/promises';
import path from 'path';
import { logger } from '../utils/logger.js';
/**
 * Plugin that exports scanning results to CSV format
 */
export default class CsvReporterPlugin {
    /**
     * Register the plugin with the pipeline hooks
     */
    register(hooks) {
        // Register for the afterScan hook
        hooks.afterScan.tapPromise('CsvReporter', async (context, components) => {
            await this.generateCsvReport(context, components);
        });
        return {
            name: 'csv-reporter',
            version: '1.0.0',
            description: 'Exports hooks to CSV format for easy analysis and sharing',
            author: 'ADReward Team'
        };
    }
    /**
     * Generate a CSV report of the hooks found
     */
    async generateCsvReport(context, components) {
        try {
            if (!components || Object.keys(components).length === 0) {
                logger.debug('No components to export to CSV');
                return;
            }
            const timestamp = new Date().toISOString().replace(/[:.]/g, '-');
            const outputDir = path.join(path.dirname(context.dexDir), 'reports');
            await fs.mkdir(outputDir, { recursive: true });
            const outputPath = path.join(outputDir, `hooks-${timestamp}.csv`);
            // Build CSV header
            let csvContent = 'Family,Class,Method,Description,Kotlin Signature\n';
            // Add rows for each hook
            for (const [family, hooks] of Object.entries(components)) {
                for (const hook of hooks) {
                    const row = [
                        family,
                        hook.className,
                        hook.methodName,
                        hook.desc || '',
                        hook.kotlinSig || ''
                    ];
                    // Quote fields and escape quotes within fields
                    const quotedFields = row.map(field => {
                        const escaped = String(field).replace(/"/g, '""');
                        return `"${escaped}"`;
                    });
                    csvContent += quotedFields.join(',') + '\n';
                }
            }
            // Write CSV file
            await fs.writeFile(outputPath, csvContent);
            logger.info(`Exported ${csvContent.split('\n').length - 2} hooks to CSV: ${outputPath}`);
        }
        catch (error) {
            logger.error(`Error generating CSV report: ${error instanceof Error ? error.message : String(error)}`);
        }
    }
}
//# sourceMappingURL=csvReporter.js.map