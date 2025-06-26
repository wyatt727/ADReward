/** @type {import('jest').Config} */
const config = {
  testEnvironment: 'node',
  transform: {},
  extensionsToTreatAsEsm: ['.js', '.ts'],
  moduleNameMapper: {
    '^@adreward/(.*)$': '<rootDir>/packages/$1/src'
  },
  testMatch: ['**/test/**/*.js', '**/test/**/*.ts', '**/*.test.js', '**/*.spec.js'],
  transformIgnorePatterns: [
    '/node_modules/'
  ],
  passWithNoTests: true
};

export default config; 