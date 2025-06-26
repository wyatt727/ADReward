FROM node:20-slim AS builder

# Install build dependencies
RUN apt-get update && apt-get install -y \
    build-essential \
    python3 \
    && rm -rf /var/lib/apt/lists/*

# Install pnpm
RUN npm install -g pnpm@latest

# Set working directory
WORKDIR /app

# Copy package files
COPY package.json pnpm-workspace.yaml pnpm-lock.yaml ./
COPY packages/core/package.json ./packages/core/
COPY packages/server/package.json ./packages/server/

# Install dependencies
RUN pnpm install --frozen-lockfile

# Copy source files
COPY tsconfig.base.json ./
COPY packages/core ./packages/core
COPY packages/server ./packages/server

# Build packages
RUN pnpm run -r build

# Create a smaller production image
FROM node:20-slim

# Install runtime dependencies
RUN apt-get update && apt-get install -y \
    android-tools-adb \
    openjdk-17-jre-headless \
    && rm -rf /var/lib/apt/lists/*

# Set working directory
WORKDIR /app

# Install pnpm
RUN npm install -g pnpm@latest

# Copy built packages
COPY --from=builder /app/package.json /app/pnpm-workspace.yaml /app/
COPY --from=builder /app/packages/core/package.json /app/packages/core/
COPY --from=builder /app/packages/server/package.json /app/packages/server/
COPY --from=builder /app/packages/core/dist /app/packages/core/dist
COPY --from=builder /app/packages/server/dist /app/packages/server/dist

# Set up directories
RUN mkdir -p /app/analysis /app/uploads /app/jars

# Copy jars needed for Kotlin IR scanner
COPY jars/ /app/jars/

# Install production dependencies only
RUN pnpm install --prod --frozen-lockfile

# Expose API port
EXPOSE 3100

# Environment variables
ENV NODE_ENV=production
ENV PORT=3100

# Start the server
CMD ["node", "packages/server/dist/index.js"] 