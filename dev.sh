#!/bin/bash

# Start the Minecraft client with TM Craft mod loaded
# This builds the mod and launches a dev Minecraft instance
# Usage: ./dev.sh

set -e

cd "$(dirname "$0")"

echo ""
echo "========================================="
echo "  TM Craft (Guaca Fork) - Dev Client"
echo "========================================="
echo ""

./gradlew runClient --console=plain
