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

if [ "$1" = "--datagen" ]; then
    echo "Running datagen..."
    ./gradlew runDatagen --console=plain
    echo ""
fi

echo "Starting dev client..."
./gradlew runClient --console=plain
