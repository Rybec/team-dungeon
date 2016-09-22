# team-dungeon
An attempt to make Minecraft more cooperative, in the way that Terraria is.

Priorities

1. Magic mirror that takes character to spawn (bed if the player has one, world spawn otherwise).
2. Something that brings a character to another character (like wormhole potion in Terraria).

3. Better NPCs (villagers).

4. Events (zombie invasions, skeleton invasions, if we are masochists, creeper invasions, etc...)

5. Dungeons

6. Bosses

Ideas

Using the magic mirror takes the character to wherever he or she would go upon death.  Typically this is a bed or the world spawn.  It should probably consume some small amount of XP or some resource, though this is not strictly necessary.

The something that brings a character to another character could be a potion, as in Terraria, only because MC does not have a world map like Terraria, selecting the target player would likely present an issue.  Unless we want to display a menu of target characters to pick from, perhaps the item should be targeted to a specific player upon creation.  A good strategy might be for the player that creates the item to be the target.  One option could be to use the magic mirrors for this as well.  If the user is not the creator, instead of bringing the user to his or her own spawn, the mirror could bring the user to the creator of the mirror (or, if the creator is not logged in, perhaps to the creator's spawn).

Villagers have a lot of room for improvement.  They are currently used primarily for getting emeralds, and for obtaining a very small subset of items they sell that are difficult to get.  Rarely, they sell enchanted books or items that are worth purchasing.  We could easily add more powerful (and more expensive) magical items and more difficult to obtain crafting materials.  This would increase the value of villagers, giving players a greater incentive to build and protect villages.

Events would be much like Terraria events.  They could even use existing mechanics to track how far through an event the players have gotten (alternatively, they could just be time based).  The most obvious event would be the zombie invasion, though instead of always centering the invasion on a village, it could be centered on PCs or it could start in a region near a PC and stay in that region even if the PC leaves.  One hallmark of invasions might be that the invasion mobs spawn in higher light levels (9, 10, or 11).  We could also include skeleton invasions, creeper invasions, witch invasions, slime invasions, and zombie pigman invasions.  Some of these could be limited to specific biomes (witches and slimes might be limited to swamp), times of day (zombies and skeltons at night), local difficulty (creepers, witches, and zombie pigmen), and weather (creepers during thunderstorms).  Zombie pigmen invasions (where the zombie pigmen are hostile by default) might start with the spawning of a nether portal, around which the invasion is centered.

Dungeons are sadly lacking in MC, with the fortress being the only real one and being sadly small at that.  Larger, more dangerous dungeons could improve cooperative play.  Features might include mob spawns at higher light levels.  Mob spawners could be more common.  Chests would likely be more common as well (dungeons need good loot).  And dungeons could come with dugeon bosses (presumably guarding treasure rooms).

World bosses are one of the big coop challenges in Terraria, but MC only has a few bosses.  One, the Whither, only spawns when summoned by players.  The Ender Dragon is found in a very specific location that is rather out of the way.  These are easy to avoid, and neither benefits from base or arena building.  In Terraria, the first major boss occasionally spawns randomly at night.  A boss or two like this would definitely improve cooperative play, especially with items that allow players to group to one another very quickly.  World bosses could randomly spawn when certain conditions are met, much like events.  For example, if we can create a boss with a shrunk Ender Dragon model, we could have a boss that occasionally spawns in mountainous biomes.  The giant zombie model already existing in the game might be usable to make a boss that spawns on flatter, unwooded biomes, at night (perhaps only during full moons or new moons).  A large gelatinous cube mob might be possible to make from a slime model and behavior, which would spawn in swamps.

Additional mobs could also be added to the game.  It was pointed out that MC has a very limited selection of mobs.  The problem with this is that coding behavior AI is more difficult than most of the above features, so this is not currently even on the priority list.  Perhaps it would be possible to palette shift some of the existing mob textures to make more or less dangerous variations on existing mobs, if we get desperate for some new mobs before we get this far though.


Notes

Moving characters long distances may prove problematic, because an anti-cheating mechanic in the vanilla server generally kicks characters that move too quickly.  I read somewhere that a way to circumvent this check is to bounce the character off of another dimension.  For example, to move a character to a distant location in the overworld (perhaps using the magic mirror item mentioned above), you would first change the character's dimension to the nether, then change the character's dimension back to the overworld at the desired coordinates.
