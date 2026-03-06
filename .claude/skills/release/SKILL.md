---
name: release
description: Publish a new guaca release of the TM Craft fork
disable-model-invocation: true
argument-hint: [guaca.N]
---

Publish a new release of the TM Craft (Guaca Fork) mod for the `master` branch (1.21.1 / Cobblemon 1.7.2).

## Steps

1. **Verify clean state**
   - Run `git status` — working tree must be clean (no uncommitted changes)
   - Confirm we are on `master` branch
   - If $ARGUMENTS is provided, use it as the new guaca suffix (e.g. `guaca.4`). Otherwise read the current `mod_version` from `gradle.properties` and increment the guaca number by 1.

2. **Bump version**
   - Update `mod_version` in `gradle.properties` to `1.4.18-<new-guaca>+1.7.2`
   - Commit: `Bump version to 1.4.18-<new-guaca>+1.7.2`  (one line, no co-author)

3. **Build**
   - Stop Gradle daemons: `./gradlew --stop`
   - Build: `./gradlew build --console=plain`
   - Confirm `build/libs/tmcraft-1.4.18-<new-guaca>+1.7.2.jar` exists

4. **Tag and push**
   - `git tag v1.4.18-<new-guaca>`
   - `git push origin master`
   - `git push origin v1.4.18-<new-guaca>`

5. **Create GitHub Release**
   - Use `gh release create` with:
     - Tag: `v1.4.18-<new-guaca>`
     - Title: `v1.4.18-<new-guaca>`
     - Attach: `build/libs/tmcraft-1.4.18-<new-guaca>+1.7.2.jar` and `build/libs/tmcraft-1.4.18-<new-guaca>+1.7.2-sources.jar`
     - Notes: table of JAR → Minecraft/Cobblemon versions, plus a bullet list of changes since the previous release tag (use `git log` to derive them)

6. **Report**
   - Print the release URL

## Rules

- Never skip the clean state check — a dirty tree means uncommitted work would be silently excluded
- The version bump commit must be the last commit before the tag, so the tag and commit are aligned
- Do not push unless the build succeeds
- Only release from `master`
