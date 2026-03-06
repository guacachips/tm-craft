#!/bin/bash

# Build production JAR for TM Craft
# Runs datagen first to ensure generated files (recipes, tags, loot tables) are up to date
# Usage: ./build.sh [--skip-datagen]

set -e

cd "$(dirname "$0")"

echo ""
echo "========================================="
echo "  TM Craft (Guaca Fork) - Build"
echo "========================================="
echo ""

# Stop any lingering Gradle daemons from previous runs to avoid lock/state issues
echo "Stopping Gradle daemons..."
./gradlew --stop
echo ""

if [ "$1" = "--skip-datagen" ]; then
    echo "Skipping datagen (--skip-datagen)"
else
    echo "[1/2] Running datagen..."
    # timeout 120s: Cobblemon Showdown spawns a non-daemon thread that prevents JVM exit after datagen completes
    timeout 120 ./gradlew runDatagen --console=plain || true
    echo ""
fi

echo "[2/2] Building JAR..."
./gradlew build --console=plain

echo ""
echo "Done. Output JARs in build/libs/"
ls -1 build/libs/*.jar
