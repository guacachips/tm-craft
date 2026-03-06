#!/bin/bash

# Build production JAR for TM Craft
# Runs datagen first to ensure generated files (recipes, tags, loot tables) are up to date
# Usage: ./build.sh

set -e

cd "$(dirname "$0")"

echo ""
echo "========================================="
echo "  TM Craft (Guaca Fork) - Build"
echo "========================================="
echo ""

echo "[1/2] Running datagen..."
./gradlew runDatagen --console=plain

echo ""
echo "[2/2] Building JAR..."
./gradlew build --console=plain

echo ""
echo "Done. Output JARs in build/libs/"
ls -1 build/libs/*.jar
