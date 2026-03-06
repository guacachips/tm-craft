# Developers Guide — TM Craft (Guaca Fork)

## Build

```bash
./dev.sh                   # Launch dev Minecraft client
./dev.sh --datagen         # Regenerate data files, then launch dev Minecraft client
./build.sh                 # Run datagen, build production JAR
./build.sh --skip-datagen  # Build production JAR (skip datagen)
```

Both scripts stop all Gradle daemons at startup to prevent lock issues from previously killed runs.

### When to run datagen

Run datagen whenever you change:
- Recipe generators in `src/main/java/kiwiapollo/tmcraft/datagen/`
- Item tags (`ItemTagProvider`, `ModTagRegistry`)
- Loot tables (`LootTableProvider`)
- The Minecraft or Cobblemon version in `gradle.properties`

Generated files live in `src/main/generated/` and must be committed.

> **Known issue**: Cobblemon Showdown spawns a non-daemon thread that prevents JVM exit after
> datagen completes. The scripts use `timeout 120` to kill the process once generation finishes.

## Release

1. Do all work commits
2. Bump `mod_version` in `gradle.properties` to the next `guaca.N`
3. Commit: `Bump version to <version>` (one line, no co-author)
4. Build: `./build.sh --skip-datagen`
5. Tag the version bump commit: `git tag v<version>`
6. Push: `git push origin master && git push origin v<version>`
7. Create GitHub Release with the JAR and sources JAR from `build/libs/`

The version bump commit must always be last before tagging so the tag and commit are aligned.
