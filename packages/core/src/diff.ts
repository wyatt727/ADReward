import deepDiff from 'deep-diff';
import fs from 'fs/promises';
import chalk from 'chalk';
import { ComponentMap } from './ktir.js';
import { logger } from './utils/logger.js';

const { diff } = deepDiff;

/**
 * Interface for diff result stats
 */
export interface DiffStats {
  added: number;
  removed: number;
  changed: number;
  unchanged: number;
}

/**
 * Options for generating diffs
 */
export interface DiffOptions {
  /**
   * Whether to show unchanged items
   */
  showUnchanged?: boolean;
  /**
   * Whether to save the diff to a file
   */
  saveToFile?: boolean;
  /**
   * Output file path if saving
   */
  outputPath?: string;
}

/**
 * Compare two component maps and generate a diff
 * @param oldComponents Old component map
 * @param newComponents New component map
 * @param options Diff options
 * @returns Stats about the diff
 */
export async function diffComponents(
  oldComponents: ComponentMap,
  newComponents: ComponentMap,
  options: DiffOptions = {}
): Promise<DiffStats> {
  // Initialize stats
  const stats: DiffStats = {
    added: 0,
    removed: 0,
    changed: 0,
    unchanged: 0
  };
  
  // Prepare results object
  const results: Record<string, any> = {};
  
  // Get all unique family names from both maps
  const families = new Set([
    ...Object.keys(oldComponents), 
    ...Object.keys(newComponents)
  ]);
  
  // Process each family
  for (const family of families) {
    const oldHooks = oldComponents[family] || [];
    const newHooks = newComponents[family] || [];
    
    // If family is missing in either source, mark all as added/removed
    if (!oldComponents[family]) {
      results[family] = {
        added: newHooks,
        removed: [],
        changed: [],
        unchanged: []
      };
      stats.added += newHooks.length;
      continue;
    }
    
    if (!newComponents[family]) {
      results[family] = {
        added: [],
        removed: oldHooks,
        changed: [],
        unchanged: []
      };
      stats.removed += oldHooks.length;
      continue;
    }
    
    // Compare hooks within the same family
    const familyResults = {
      added: [] as any[],
      removed: [] as any[],
      changed: [] as any[],
      unchanged: [] as any[]
    };
    
    // Find removed hooks (in old but not in new)
    for (const oldHook of oldHooks) {
      const matchIndex = newHooks.findIndex(h => 
        h.className === oldHook.className && 
        h.methodName === oldHook.methodName
      );
      
      if (matchIndex === -1) {
        familyResults.removed.push(oldHook);
        stats.removed++;
      } else {
        // Check if any details changed
        const newHook = newHooks[matchIndex];
        const differences = diff(oldHook, newHook);
        
        if (differences && differences.length > 0) {
          familyResults.changed.push({
            old: oldHook,
            new: newHook,
            diffs: differences
          });
          stats.changed++;
        } else {
          familyResults.unchanged.push(oldHook);
          stats.unchanged++;
        }
      }
    }
    
    // Find added hooks (in new but not in old)
    for (const newHook of newHooks) {
      const exists = oldHooks.some(h => 
        h.className === newHook.className && 
        h.methodName === newHook.methodName
      );
      
      if (!exists) {
        familyResults.added.push(newHook);
        stats.added++;
      }
    }
    
    results[family] = familyResults;
  }
  
  // Generate formatted output
  let output = '\n=== Hook Component Diff ===\n\n';
  
  for (const family of families) {
    const familyResults = results[family];
    if (!familyResults) continue;
    
    output += `\nFamily: ${chalk.blue(family)}\n`;
    output += `${chalk.green('+')} Added: ${familyResults.added.length}\n`;
    output += `${chalk.red('-')} Removed: ${familyResults.removed.length}\n`;
    output += `${chalk.yellow('~')} Changed: ${familyResults.changed.length}\n`;
    output += `${chalk.gray('=')} Unchanged: ${familyResults.unchanged.length}\n`;
    
    if (familyResults.added.length > 0) {
      output += `\n${chalk.green('Added hooks:')}\n`;
      for (const hook of familyResults.added) {
        output += `  ${chalk.green('+')} ${hook.className}.${hook.methodName}\n`;
      }
    }
    
    if (familyResults.removed.length > 0) {
      output += `\n${chalk.red('Removed hooks:')}\n`;
      for (const hook of familyResults.removed) {
        output += `  ${chalk.red('-')} ${hook.className}.${hook.methodName}\n`;
      }
    }
    
    if (familyResults.changed.length > 0) {
      output += `\n${chalk.yellow('Changed hooks:')}\n`;
      for (const item of familyResults.changed) {
        output += `  ${chalk.yellow('~')} ${item.old.className}.${item.old.methodName}\n`;
        for (const d of item.diffs) {
          if (d.kind === 'E' && d.path) {
            output += `    ${chalk.gray(d.path.join('.'))} changed: ${d.lhs} → ${d.rhs}\n`;
          }
        }
      }
    }
    
    if (options.showUnchanged && familyResults.unchanged.length > 0) {
      output += `\n${chalk.gray('Unchanged hooks:')}\n`;
      for (const hook of familyResults.unchanged) {
        output += `  ${chalk.gray('=')} ${hook.className}.${hook.methodName}\n`;
      }
    }
  }
  
  // Add summary
  output += `\n=== Summary ===\n`;
  output += `${chalk.green('+')} Added: ${stats.added}\n`;
  output += `${chalk.red('-')} Removed: ${stats.removed}\n`;
  output += `${chalk.yellow('~')} Changed: ${stats.changed}\n`;
  output += `${chalk.gray('=')} Unchanged: ${stats.unchanged}\n`;
  
  // Print to console
  console.log(output);
  
  // Save to file if requested
  if (options.saveToFile && options.outputPath) {
    try {
      await fs.writeFile(options.outputPath, output);
      logger.info(`Diff saved to: ${options.outputPath}`);
      
      // Also save raw JSON data
      await fs.writeFile(
        options.outputPath.replace(/\.txt$/, '') + '.json', 
        JSON.stringify(results, null, 2)
      );
    } catch (error) {
      logger.error(`Failed to save diff: ${error}`);
    }
  }
  
  return stats;
}

/**
 * Compare components from two JSON files
 * @param oldPath Path to old components JSON file
 * @param newPath Path to new components JSON file
 * @param options Diff options
 * @returns Stats about the diff
 */
export async function diffComponentFiles(
  oldPath: string,
  newPath: string,
  options: DiffOptions = {}
): Promise<DiffStats> {
  try {
    // Read files
    const oldContent = await fs.readFile(oldPath, 'utf-8');
    const newContent = await fs.readFile(newPath, 'utf-8');
    
    // Parse JSON
    const oldComponents = JSON.parse(oldContent) as ComponentMap;
    const newComponents = JSON.parse(newContent) as ComponentMap;
    
    // Generate diff
    return diffComponents(oldComponents, newComponents, options);
  } catch (error) {
    logger.error(`Error comparing component files: ${error}`);
    throw error;
  }
} 