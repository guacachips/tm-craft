# TMCraft (Guaca Fork)

This is a fork of [TMCraft](https://github.com/KiwiFlavoredApollo/tm-craft), a Cobblemon side mod that adds TMs with recipes. The intent of this fork is to implement daily rotating inventory for the Move Tutor villager with tier-based pricing and full move pool access.

For build, versioning, and release instructions, see [DEVELOPERS.md](DEVELOPERS.md).

## Fork Feature: Daily Rotating Move Tutor with Full Pool

### Pool

All 929 tutor moves are available. No move is excluded from any villager level. Every day, any move can appear at any level.

### Pricing

Each move has a price based on its tier (determined by power, rarity, or some classification). The price is intrinsic to the move itself — it costs the same whether sold by a Novice or Master villager. A weak status move is cheap; Dragon Ascent is expensive. The villager level does not affect pricing.

### Villager Level = Number of Slots

The villager's profession level controls how many moves are on sale at once:

| Level      | Moves on Sale |
|------------|---------------|
| Novice     | 1             |
| Apprentice | 2             |
| Journeyman | 3             |
| Expert     | 4             |
| Master     | 5             |

### Daily Rotation

Each in-game day, the villager's entire inventory is rerolled. New random moves are selected from the full 929 pool. The selection is independent — you could get 5 Master-tier moves at a Master villager by luck, or 5 cheap ones.

### Quantity

Each move on sale has exactly 1 stock. Once a player buys it, it's gone until the next day's rotation. No restocking during the same day.

### Behavior Summary

A Master-level Move Tutor villager wakes up each morning with 5 random moves for sale, each priced by the move's inherent tier, each with 1 copy available. Next morning, completely different selection.

### Open Design Questions

- **Tiering system**: How to classify the 929 moves into price tiers (base power thresholds, manual curation, or Cobblemon move metadata).
- **Deterministic vs independent rotation**: Should all Move Tutor villagers in the world offer the same daily selection, or should each villager roll independently?

---

# Original TMCraft README

TMCraft is a Cobblemon side mod that add TMs with recipes. Mods like EMI is highly recommended for viewing recipes. This mod is not a unique work of mine and heavily motivated by SimpleTMs made by Dragomordor. Most of the heavy lifting is done by Dragomordor. Here are few things different from SimpleTMs.

- Removed feature wild Pokémon dropping TMs when fainted
- Replaced TM textures with those based on Cobblemon Assets

By the term TM, the mod follows Gen IX. Which means TMs are consumed after being used. Pokémon will not be able to learn egg moves and tutor moves with TMs.

## Recipes

As of 1.4.2, all TM recipes for all generation have been added.

- [TM Recipe Progress - Google Spreadsheet](https://docs.google.com/spreadsheets/d/1dSF5yGApMBniT_dNG_7rBsOzZgVQqpY8qVZWKixdT1Y/edit?usp=sharing)
- [TMCraft Missing Recipes](https://github.com/KiwiFlavoredApollo/tmcraft-missing-recipes)

TMCraft Missing Recipes is a data pack that adds recipes which are not meant to be included in the mod. Server admins can use this as a template.

If your favorite TMs do not have recipes and if you have an idea, feel free to contact me and give suggestions.

`norecipe` version is no longer provided.

## Blank Discs

- Copper Blank Disc [0, 30)
- Iron Blank Disc [30, 60)
- Gold Blank Disc [60, 90)
- Diamond Blank Disc [90, 120)
- Netherite Blank Disc 120+
- Emerald Blank Disc (for status moves)

Move Upgrade Smithing Template is used when upgrading tiers. Blank Discs are used as ingredients for crafting TMs.

Starting from 1.3.0, Move Upgrade Smithing Template replaces Netherite Upgrade Smithing Template.

## TM Move Items

TM Move Items teach moves that are learned by using TMs.

## Egg Move Items

Egg Move Items teach moves that are learned via breeding.

## Tutor Move Items

Tutor Move Items teach moves that are learned by Move Tutors.

## Star Move Items

Star Move Items teach moves even if the Pokémon are not supposed to learn them. These are basically cheating so use them at your own risk. With great power comes great responsibility.

## Move Recorders

When used, Move Recorder converts to corresponding TM/Egg/Tutor/Star move item.

## Move Tutor Villager

Move Tutor villagers sell Tutor Moves Items. (>=1.4.4)

## Pokémon Breeder Villager

Pokémon Breeder villagers sell Egg Move Items. (>=1.4.6)

## Game Rule

### `consumeMoveItemOnUse`

If set to `true` (default), Move Items are consumed when used. Affects globally to TM Move Items, Egg Move Items, Tutor Move Items and Star Move Items. 

## LICENSE

### GPL 3.0
- Source Code

### CC BY-NC-SA 4.0 International
- Assets

## Translation

- [Voldir](https://discordapp.com/users/291233979196243968) (French)

## Credits
- [SimpleTMsFabric](https://github.com/Dragomordor/SimpleTMsFabric)
- [Cobblemon Assets](https://gitlab.com/cable-mc/cobblemon-assets)