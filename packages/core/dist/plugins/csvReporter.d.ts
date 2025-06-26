import { Plugin, PluginDescriptor, pipelineHooks } from '../hooks.js';
/**
 * Plugin that exports scanning results to CSV format
 */
export default class CsvReporterPlugin implements Plugin {
    /**
     * Register the plugin with the pipeline hooks
     */
    register(hooks: typeof pipelineHooks): PluginDescriptor;
    /**
     * Generate a CSV report of the hooks found
     */
    private generateCsvReport;
}
