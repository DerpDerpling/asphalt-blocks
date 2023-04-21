execute as @a at @s if block ~ ~-0.35 ~ asphaltblocks:asphalt_block run attribute @s minecraft:generic.movement_speed base set 0.25
execute as @a at @s if block ~ ~ ~ asphaltblocks:asphalt_carpet run attribute @s minecraft:generic.movement_speed base set 0.25
execute as @a at @s if block ~ ~-0.35 ~ asphaltblocks:asphalt_slab run attribute @s minecraft:generic.movement_speed base set 0.25
execute as @a at @s unless block ~ ~-0.35 ~ asphaltblocks:asphalt_block unless block ~ ~ ~ asphaltblocks:asphalt_carpet unless block ~ ~-0.35 ~ asphaltblocks:asphalt_slab run attribute @s minecraft:generic.movement_speed base set 0.1
