#!/bin/bash

# Start the Minecraft client with TM Craft mod loaded
# This builds the mod and launches a dev Minecraft instance
# Usage: ./dev.sh [--datagen]

set -e

cd "$(dirname "$0")"

echo ""
echo "========================================="
echo "  TM Craft (Guaca Fork) - Dev Client"
echo "========================================="
echo ""

# Stop any lingering Gradle daemons from previous runs to avoid lock/state issues
echo "Stopping Gradle daemons..."
./gradlew --stop
echo ""

if [ "$1" = "--datagen" ]; then
    echo "Running datagen..."
    # timeout 120s: Cobblemon Showdown spawns a non-daemon thread that prevents JVM exit after datagen completes
    timeout 120 ./gradlew runDatagen --console=plain || true
    echo ""
fi

echo "Starting dev client..."
./gradlew runClient --console=plain
