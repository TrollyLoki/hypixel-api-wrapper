package net.trollyloki.hypixelapiwrapper.enums;

public enum ItemType {
	AIR(0, 0, "Air"), STONE(1, 0, "Stone"), GRANITE(1, 1, "Granite"), POLISHED_GRANITE(1, 2, "Polished Granite"),
	DIORITE(1, 3, "Diorite"), POLISHED_DIORITE(1, 4, "Polished Diorite"), ANDESITE(1, 5, "Andesite"),
	POLISHED_ANDESITE(1, 6, "Polished Andesite"), GRASS(2, 0, "Grass"), DIRT(3, 0, "Dirt"),
	COARSE_DIRT(3, 1, "Coarse Dirt"), PODZOL(3, 2, "Podzol"), COBBLESTONE(4, 0, "Cobblestone"),
	OAK_PLANKS(5, 0, "Oak Wood Plank"), SPRUCE_PLANKS(5, 1, "Spruce Wood Plank"),
	BIRCH_PLANKS(5, 2, "Birch Wood Plank"), JUNGLE_PLANKS(5, 3, "Jungle Wood Plank"),
	ACACIA_PLANKS(5, 4, "Acacia Wood Plank"), DARK_OAK_PLANKS(5, 5, "Dark Oak Wood Plank"),
	OAK_SAPLING(6, 0, "Oak Sapling"), SPRUCE_SAPLING(6, 1, "Spruce Sapling"), BIRCH_SAPLING(6, 2, "Birch Sapling"),
	JUNGLE_SAPLING(6, 3, "Jungle Sapling"), ACACIA_SAPLING(6, 4, "Acacia Sapling"),
	DARK_OAK_SAPLING(6, 5, "Dark Oak Sapling"), BEDROCK(7, 0, "Bedrock"), FLOWING_WATER(8, 0, "Flowing Water"),
	WATER(9, 0, "Still Water"), FLOWING_LAVA(10, 0, "Flowing Lava"), LAVA(11, 0, "Still Lava"), SAND(12, 0, "Sand"),
	RED_SAND(12, 1, "Red Sand"), GRAVEL(13, 0, "Gravel"), GOLD_ORE(14, 0, "Gold Ore"), IRON_ORE(15, 0, "Iron Ore"),
	COAL_ORE(16, 0, "Coal Ore"), OAK_LOG(17, 0, "Oak Wood"), SPRUCE_LOG(17, 1, "Spruce Wood"),
	BIRCH_LOG(17, 2, "Birch Wood"), JUNGLE_LOG(17, 3, "Jungle Wood"), OAK_LEAVES(18, 0, "Oak Leaves"),
	SPRUCE_LEAVES(18, 1, "Spruce Leaves"), BIRCH_LEAVES(18, 2, "Birch Leaves"), JUNGLE_LEAVES(18, 3, "Jungle Leaves"),
	SPONGE(19, 0, "Sponge"), WET_SPONGE(19, 1, "Wet Sponge"), GLASS(20, 0, "Glass"),
	LAPIS_ORE(21, 0, "Lapis Lazuli Ore"), LAPIS_BLOCK(22, 0, "Lapis Lazuli Block"), DISPENSER(23, 0, "Dispenser"),
	SANDSTONE(24, 0, "Sandstone"), CHISELED_SANDSTONE(24, 1, "Chiseled Sandstone"),
	SMOOTH_SANDSTONE(24, 2, "Smooth Sandstone"), NOTEBLOCK(25, 0, "Note Block"), BED_BLOCK(26, 0, "Bed"),
	GOLDEN_RAIL(27, 0, "Powered Rail"), DETECTOR_RAIL(28, 0, "Detector Rail"), STICKY_PISTON(29, 0, "Sticky Piston"),
	WEB(30, 0, "Cobweb"), DEAD_SHRUB(31, 0, "Dead Shrub"), TALLGRASS(31, 1, "Grass"), FERN(31, 2, "Fern"),
	DEADBUSH(32, 0, "Dead Bush"), PISTON(33, 0, "Piston"), PISTON_HEAD(34, 0, "Piston Head"),
	WHITE_WOOL(35, 0, "White Wool"), ORANGE_WOOL(35, 1, "Orange Wool"), MAGENTA_WOOL(35, 2, "Magenta Wool"),
	LIGHT_BLUE_WOOL(35, 3, "Light Blue Wool"), YELLOW_WOOL(35, 4, "Yellow Wool"), LIME_WOOL(35, 5, "Lime Wool"),
	PINK_WOOL(35, 6, "Pink Wool"), GRAY_WOOL(35, 7, "Gray Wool"), LIGHT_GRAY_WOOL(35, 8, "Light Gray Wool"),
	CYAN_WOOL(35, 9, "Cyan Wool"), PURPLE_WOOL(35, 10, "Purple Wool"), BLUE_WOOL(35, 11, "Blue Wool"),
	BROWN_WOOL(35, 12, "Brown Wool"), GREEN_WOOL(35, 13, "Green Wool"), RED_WOOL(35, 14, "Red Wool"),
	BLACK_WOOL(35, 15, "Black Wool"), DANDELION(37, 0, "Dandelion"), POPPY(38, 0, "Poppy"),
	BLUE_ORCHID(38, 1, "Blue Orchid"), ALLIUM(38, 2, "Allium"), AZURE_BLUET(38, 3, "Azure Bluet"),
	RED_TULIP(38, 4, "Red Tulip"), ORANGE_TULIP(38, 5, "Orange Tulip"), WHITE_TULIP(38, 6, "White Tulip"),
	PINK_TULIP(38, 7, "Pink Tulip"), OXEYE_DAISY(38, 8, "Oxeye Daisy"), BROWN_MUSHROOM(39, 0, "Brown Mushroom"),
	RED_MUSHROOM(40, 0, "Red Mushroom"), GOLD_BLOCK(41, 0, "Gold Block"), IRON_BLOCK(42, 0, "Iron Block"),
	DOUBLE_STONE_SLAB(43, 0, "Double Stone Slab"), DOUBLE_SANDSTONE_SLAB(43, 1, "Double Sandstone Slab"),
	DOUBLE_WOODEN_SLAB(43, 2, "Double Wooden Slab"), DOUBLE_COBBLESTONE_SLAB(43, 3, "Double Cobblestone Slab"),
	DOUBLE_BRICK_SLAB(43, 4, "Double Brick Slab"), DOUBLE_STONEBRICK_SLAB(43, 5, "Double Stone Brick Slab"),
	DOUBLE_NETHER_BRICK_SLAB(43, 6, "Double Nether Brick Slab"), DOUBLE_QUARTZ_SLAB(43, 7, "Double Quartz Slab"),
	STONE_SLAB(44, 0, "Stone Slab"), SANDSTONE_SLAB(44, 1, "Sandstone Slab"), WOODEN_SLAB(44, 2, "Wooden Slab"),
	COBBLESTONE_SLAB(44, 3, "Cobblestone Slab"), BRICK_SLAB(44, 4, "Brick Slab"),
	STONEBRICK_SLAB(44, 5, "Stone Brick Slab"), NETHER_BRICK_SLAB(44, 6, "Nether Brick Slab"),
	QUARTZ_SLAB(44, 7, "Quartz Slab"), BRICK_BLOCK(45, 0, "Bricks"), TNT(46, 0, "TNT"), BOOKSHELF(47, 0, "Bookshelf"),
	MOSSY_COBBLESTONE(48, 0, "Moss Stone"), OBSIDIAN(49, 0, "Obsidian"), TORCH(50, 0, "Torch"), FIRE(51, 0, "Fire"),
	MOB_SPAWNER(52, 0, "Monster Spawner"), OAK_STAIRS(53, 0, "Oak Wood Stairs"), CHEST(54, 0, "Chest"),
	REDSTONE_WIRE(55, 0, "Redstone Wire"), DIAMOND_ORE(56, 0, "Diamond Ore"), DIAMOND_BLOCK(57, 0, "Diamond Block"),
	CRAFTING_TABLE(58, 0, "Crafting Table"), WHEAT_CROPS(59, 0, "Wheat Crops"), FARMLAND(60, 0, "Farmland"),
	FURNACE(61, 0, "Furnace"), LIT_FURNACE(62, 0, "Burning Furnace"), STANDING_SIGN(63, 0, "Standing Sign Block"),
	WOODEN_DOOR(64, 0, "Oak Door Block"), LADDER(65, 0, "Ladder"), RAIL(66, 0, "Rail"),
	STONE_STAIRS(67, 0, "Cobblestone Stairs"), WALL_SIGN(68, 0, "Wall-mounted Sign Block"), LEVER(69, 0, "Lever"),
	STONE_PRESSURE_PLATE(70, 0, "Stone Pressure Plate"), IRON_DOOR_BLOCK(71, 0, "Iron Door Block"),
	WOODEN_PRESSURE_PLATE(72, 0, "Wooden Pressure Plate"), REDSTONE_ORE(73, 0, "Redstone Ore"),
	LIT_REDSTONE_ORE(74, 0, "Glowing Redstone Ore"), UNLIT_REDSTONE_TORCH(75, 0, "Redstone Torch (off)"),
	REDSTONE_TORCH(76, 0, "Redstone Torch (on)"), STONE_BUTTON(77, 0, "Stone Button"), SNOW_LAYER(78, 0, "Snow"),
	ICE(79, 0, "Ice"), SNOW(80, 0, "Snow Block"), CACTUS(81, 0, "Cactus"), CLAY(82, 0, "Clay"),
	REEDS_BLOCK(83, 0, "Sugar Canes"), JUKEBOX(84, 0, "Jukebox"), FENCE(85, 0, "Oak Fence"), PUMPKIN(86, 0, "Pumpkin"),
	NETHERRACK(87, 0, "Netherrack"), SOUL_SAND(88, 0, "Soul Sand"), GLOWSTONE(89, 0, "Glowstone"),
	PORTAL(90, 0, "Nether Portal"), LIT_PUMPKIN(91, 0, "Jack o'Lantern"), CAKE_BLOCK(92, 0, "Cake Block"),
	UNPOWERED_REPEATER(93, 0, "Redstone Repeater Block (off)"), POWERED_REPEATER(94, 0, "Redstone Repeater Block (on)"),
	WHITE_STAINED_GLASS(95, 0, "White Stained Glass"), ORANGE_STAINED_GLASS(95, 1, "Orange Stained Glass"),
	MAGENTA_STAINED_GLASS(95, 2, "Magenta Stained Glass"), LIGHT_BLUE_STAINED_GLASS(95, 3, "Light Blue Stained Glass"),
	YELLOW_STAINED_GLASS(95, 4, "Yellow Stained Glass"), LIME_STAINED_GLASS(95, 5, "Lime Stained Glass"),
	PINK_STAINED_GLASS(95, 6, "Pink Stained Glass"), GRAY_STAINED_GLASS(95, 7, "Gray Stained Glass"),
	LIGHT_GRAY_STAINED_GLASS(95, 8, "Light Gray Stained Glass"), CYAN_STAINED_GLASS(95, 9, "Cyan Stained Glass"),
	PURPLE_STAINED_GLASS(95, 10, "Purple Stained Glass"), BLUE_STAINED_GLASS(95, 11, "Blue Stained Glass"),
	BROWN_STAINED_GLASS(95, 12, "Brown Stained Glass"), GREEN_STAINED_GLASS(95, 13, "Green Stained Glass"),
	RED_STAINED_GLASS(95, 14, "Red Stained Glass"), BLACK_STAINED_GLASS(95, 15, "Black Stained Glass"),
	TRAPDOOR(96, 0, "Wooden Trapdoor"), STONE_MONSTER_EGG(97, 0, "Stone Monster Egg"),
	COBBLESTONE_MONSTER_EGG(97, 1, "Cobblestone Monster Egg"), STONEBRICK_MONSTER_EGG(97, 2, "Stone Brick Monster Egg"),
	MOSSY_STONEBRICK_MONSTER_EGG(97, 3, "Mossy Stone Brick Monster Egg"),
	CRACKED_STONEBRICK_MONSTER_EGG(97, 4, "Cracked Stone Brick Monster Egg"),
	CHISELED_STONEBRICK_MONSTER_EGG(97, 5, "Chiseled Stone Brick Monster Egg"), STONEBRICK(98, 0, "Stone Bricks"),
	MOSSY_STONEBRICK(98, 1, "Mossy Stone Bricks"), CRACKED_STONEBRICK(98, 2, "Cracked Stone Bricks"),
	CHISELED_STONEBRICK(98, 3, "Chiseled Stone Bricks"), BROWN_MUSHROOM_BLOCK(99, 0, "Brown Mushroom Block"),
	RED_MUSHROOM_BLOCK(100, 0, "Red Mushroom Block"), IRON_BARS(101, 0, "Iron Bars"), GLASS_PANE(102, 0, "Glass Pane"),
	MELON_BLOCK(103, 0, "Melon Block"), PUMPKIN_STEM(104, 0, "Pumpkin Stem"), MELON_STEM(105, 0, "Melon Stem"),
	VINE(106, 0, "Vines"), FENCE_GATE(107, 0, "Oak Fence Gate"), BRICK_STAIRS(108, 0, "Brick Stairs"),
	STONE_BRICK_STAIRS(109, 0, "Stone Brick Stairs"), MYCELIUM(110, 0, "Mycelium"), WATERLILY(111, 0, "Lily Pad"),
	NETHER_BRICK(112, 0, "Nether Brick"), NETHER_BRICK_FENCE(113, 0, "Nether Brick Fence"),
	NETHER_BRICK_STAIRS(114, 0, "Nether Brick Stairs"), NETHER_WART_CROPS(115, 0, "Nether Wart"),
	ENCHANTING_TABLE(116, 0, "Enchantment Table"), BREWING_STAND_BLOCK(117, 0, "Brewing Stand"),
	CAULDRON_BLOCK(118, 0, "Cauldron"), END_PORTAL(119, 0, "End Portal"), END_PORTAL_FRAME(120, 0, "End Portal Frame"),
	END_STONE(121, 0, "End Stone"), DRAGON_EGG(122, 0, "Dragon Egg"), REDSTONE_LAMP(123, 0, "Redstone Lamp (inactive)"),
	LIT_REDSTONE_LAMP(124, 0, "Redstone Lamp (active)"), DOUBLE_OAK_SLAB(125, 0, "Double Oak Wood Slab"),
	DOUBLE_SPRUCE_SLAB(125, 1, "Double Spruce Wood Slab"), DOUBLE_BIRCH_SLAB(125, 2, "Double Birch Wood Slab"),
	DOUBLE_JUNGLE_SLAB(125, 3, "Double Jungle Wood Slab"), DOUBLE_ACACIA_SLAB(125, 4, "Double Acacia Wood Slab"),
	DOUBLE_DARK_OAK_SLAB(125, 5, "Double Dark Oak Wood Slab"), OAK_SLAB(126, 0, "Oak Wood Slab"),
	SPRUCE_SLAB(126, 1, "Spruce Wood Slab"), BIRCH_SLAB(126, 2, "Birch Wood Slab"),
	JUNGLE_SLAB(126, 3, "Jungle Wood Slab"), ACACIA_SLAB(126, 4, "Acacia Wood Slab"),
	DARK_OAK_SLAB(126, 5, "Dark Oak Wood Slab"), COCOA(127, 0, "Cocoa"), SANDSTONE_STAIRS(128, 0, "Sandstone Stairs"),
	EMERALD_ORE(129, 0, "Emerald Ore"), ENDER_CHEST(130, 0, "Ender Chest"), TRIPWIRE_HOOK(131, 0, "Tripwire Hook"),
	TRIPWIRE(132, 0, "Tripwire"), EMERALD_BLOCK(133, 0, "Emerald Block"), SPRUCE_STAIRS(134, 0, "Spruce Wood Stairs"),
	BIRCH_STAIRS(135, 0, "Birch Wood Stairs"), JUNGLE_STAIRS(136, 0, "Jungle Wood Stairs"),
	COMMAND_BLOCK(137, 0, "Command Block"), BEACON(138, 0, "Beacon"), COBBLESTONE_WALL(139, 0, "Cobblestone Wall"),
	MOSSY_COBBLESTONE_WALL(139, 1, "Mossy Cobblestone Wall"), FLOWER_POT_BLOCK(140, 0, "Flower Pot"),
	CARROTS(141, 0, "Carrots"), POTATOES(142, 0, "Potatoes"), WOODEN_BUTTON(143, 0, "Wooden Button"),
	SKULL_BLOCK(144, 0, "Mob Head"), ANVIL(145, 0, "Anvil"), TRAPPED_CHEST(146, 0, "Trapped Chest"),
	LIGHT_WEIGHTED_PRESSURE_PLATE(147, 0, "Weighted Pressure Plate (light)"),
	HEAVY_WEIGHTED_PRESSURE_PLATE(148, 0, "Weighted Pressure Plate (heavy)"),
	UNPOWERED_COMPARATOR(149, 0, "Redstone Comparator (inactive)"),
	POWERED_COMPARATOR(150, 0, "Redstone Comparator (active)"), DAYLIGHT_DETECTOR(151, 0, "Daylight Sensor"),
	REDSTONE_BLOCK(152, 0, "Redstone Block"), QUARTZ_ORE(153, 0, "Nether Quartz Ore"), HOPPER(154, 0, "Hopper"),
	QUARTZ_BLOCK(155, 0, "Quartz Block"), CHISELED_QUARTZ_BLOCK(155, 1, "Chiseled Quartz Block"),
	PILLAR_QUARTZ_BLOCK(155, 2, "Pillar Quartz Block"), QUARTZ_STAIRS(156, 0, "Quartz Stairs"),
	ACTIVATOR_RAIL(157, 0, "Activator Rail"), DROPPER(158, 0, "Dropper"),
	WHITE_STAINED_HARDENED_CLAY(159, 0, "White Stained Hardened Clay"),
	ORANGE_STAINED_HARDENED_CLAY(159, 1, "Orange Stained Hardened Clay"),
	MAGENTA_STAINED_HARDENED_CLAY(159, 2, "Magenta Stained Hardened Clay"),
	LIGHT_BLUE_STAINED_HARDENED_CLAY(159, 3, "Light Blue Stained Hardened Clay"),
	YELLOW_STAINED_HARDENED_CLAY(159, 4, "Yellow Stained Hardened Clay"),
	LIME_STAINED_HARDENED_CLAY(159, 5, "Lime Stained Hardened Clay"),
	PINK_STAINED_HARDENED_CLAY(159, 6, "Pink Stained Hardened Clay"),
	GRAY_STAINED_HARDENED_CLAY(159, 7, "Gray Stained Hardened Clay"),
	LIGHT_GRAY_STAINED_HARDENED_CLAY(159, 8, "Light Gray Stained Hardened Clay"),
	CYAN_STAINED_HARDENED_CLAY(159, 9, "Cyan Stained Hardened Clay"),
	PURPLE_STAINED_HARDENED_CLAY(159, 10, "Purple Stained Hardened Clay"),
	BLUE_STAINED_HARDENED_CLAY(159, 11, "Blue Stained Hardened Clay"),
	BROWN_STAINED_HARDENED_CLAY(159, 12, "Brown Stained Hardened Clay"),
	GREEN_STAINED_HARDENED_CLAY(159, 13, "Green Stained Hardened Clay"),
	RED_STAINED_HARDENED_CLAY(159, 14, "Red Stained Hardened Clay"),
	BLACK_STAINED_HARDENED_CLAY(159, 15, "Black Stained Hardened Clay"),
	WHITE_STAINED_GLASS_PANE(160, 0, "White Stained Glass Pane"),
	ORANGE_STAINED_GLASS_PANE(160, 1, "Orange Stained Glass Pane"),
	MAGENTA_STAINED_GLASS_PANE(160, 2, "Magenta Stained Glass Pane"),
	LIGHT_BLUE_STAINED_GLASS_PANE(160, 3, "Light Blue Stained Glass Pane"),
	YELLOW_STAINED_GLASS_PANE(160, 4, "Yellow Stained Glass Pane"),
	LIME_STAINED_GLASS_PANE(160, 5, "Lime Stained Glass Pane"),
	PINK_STAINED_GLASS_PANE(160, 6, "Pink Stained Glass Pane"),
	GRAY_STAINED_GLASS_PANE(160, 7, "Gray Stained Glass Pane"),
	LIGHT_GRAY_STAINED_GLASS_PANE(160, 8, "Light Gray Stained Glass Pane"),
	CYAN_STAINED_GLASS_PANE(160, 9, "Cyan Stained Glass Pane"),
	PURPLE_STAINED_GLASS_PANE(160, 10, "Purple Stained Glass Pane"),
	BLUE_STAINED_GLASS_PANE(160, 11, "Blue Stained Glass Pane"),
	BROWN_STAINED_GLASS_PANE(160, 12, "Brown Stained Glass Pane"),
	GREEN_STAINED_GLASS_PANE(160, 13, "Green Stained Glass Pane"),
	RED_STAINED_GLASS_PANE(160, 14, "Red Stained Glass Pane"),
	BLACK_STAINED_GLASS_PANE(160, 15, "Black Stained Glass Pane"), ACACIA_LEAVES(161, 0, "Acacia Leaves"),
	DARK_OAK_LEAVES(161, 1, "Dark Oak Leaves"), ACACIA_LOG(162, 0, "Acacia Wood"),
	DARK_OAK_LOG(162, 1, "Dark Oak Wood"), ACACIA_STAIRS(163, 0, "Acacia Wood Stairs"),
	DARK_OAK_STAIRS(164, 0, "Dark Oak Wood Stairs"), SLIME(165, 0, "Slime Block"), BARRIER(166, 0, "Barrier"),
	IRON_TRAPDOOR(167, 0, "Iron Trapdoor"), PRISMARINE(168, 0, "Prismarine"),
	PRISMARINE_BRICKS(168, 1, "Prismarine Bricks"), DARK_PRISMARINE(168, 2, "Dark Prismarine"),
	SEA_LANTERN(169, 0, "Sea Lantern"), HAY_BLOCK(170, 0, "Hay Bale"), WHITE_CARPET(171, 0, "White Carpet"),
	ORANGE_CARPET(171, 1, "Orange Carpet"), MAGENTA_CARPET(171, 2, "Magenta Carpet"),
	LIGHT_BLUE_CARPET(171, 3, "Light Blue Carpet"), YELLOW_CARPET(171, 4, "Yellow Carpet"),
	LIME_CARPET(171, 5, "Lime Carpet"), PINK_CARPET(171, 6, "Pink Carpet"), GRAY_CARPET(171, 7, "Gray Carpet"),
	LIGHT_GRAY_CARPET(171, 8, "Light Gray Carpet"), CYAN_CARPET(171, 9, "Cyan Carpet"),
	PURPLE_CARPET(171, 10, "Purple Carpet"), BLUE_CARPET(171, 11, "Blue Carpet"), BROWN_CARPET(171, 12, "Brown Carpet"),
	GREEN_CARPET(171, 13, "Green Carpet"), RED_CARPET(171, 14, "Red Carpet"), BLACK_CARPET(171, 15, "Black Carpet"),
	HARDENED_CLAY(172, 0, "Hardened Clay"), COAL_BLOCK(173, 0, "Block of Coal"), PACKED_ICE(174, 0, "Packed Ice"),
	SUNFLOWER(175, 0, "Sunflower"), LILAC(175, 1, "Lilac"), DOUBLE_TALLGRASS(175, 2, "Double Tallgrass"),
	LARGE_FERN(175, 3, "Large Fern"), ROSE_BUSH(175, 4, "Rose Bush"), PEONY(175, 5, "Peony"),
	STANDING_BANNER(176, 0, "Free-standing Banner"), WALL_BANNER(177, 0, "Wall-mounted Banner"),
	DAYLIGHT_DETECTOR_INVERTED(178, 0, "Inverted Daylight Sensor"), RED_SANDSTONE(179, 0, "Red Sandstone"),
	CHISELED_RED_SANDSTONE(179, 1, "Chiseled Red Sandstone"), SMOOTH_RED_SANDSTONE(179, 2, "Smooth Red Sandstone"),
	RED_SANDSTONE_STAIRS(180, 0, "Red Sandstone Stairs"), DOUBLE_STONE_SLAB2(181, 0, "Double Red Sandstone Slab"),
	STONE_SLAB2(182, 0, "Red Sandstone Slab"), SPRUCE_FENCE_GATE(183, 0, "Spruce Fence Gate"),
	BIRCH_FENCE_GATE(184, 0, "Birch Fence Gate"), JUNGLE_FENCE_GATE(185, 0, "Jungle Fence Gate"),
	DARK_OAK_FENCE_GATE(186, 0, "Dark Oak Fence Gate"), ACACIA_FENCE_GATE(187, 0, "Acacia Fence Gate"),
	SPRUCE_FENCE(188, 0, "Spruce Fence"), BIRCH_FENCE(189, 0, "Birch Fence"), JUNGLE_FENCE(190, 0, "Jungle Fence"),
	DARK_OAK_FENCE(191, 0, "Dark Oak Fence"), ACACIA_FENCE(192, 0, "Acacia Fence"),
	SPRUCE_DOOR_BLOCK(193, 0, "Spruce Door Block"), BIRCH_DOOR_BLOCK(194, 0, "Birch Door Block"),
	JUNGLE_DOOR_BLOCK(195, 0, "Jungle Door Block"), ACACIA_DOOR_BLOCK(196, 0, "Acacia Door Block"),
	DARK_OAK_DOOR_BLOCK(197, 0, "Dark Oak Door Block"), IRON_SHOVEL(256, 0, "Iron Shovel"),
	IRON_PICKAXE(257, 0, "Iron Pickaxe"), IRON_AXE(258, 0, "Iron Axe"), FLINT_AND_STEEL(259, 0, "Flint and Steel"),
	APPLE(260, 0, "Apple"), BOW(261, 0, "Bow"), ARROW(262, 0, "Arrow"), COAL(263, 0, "Coal"),
	CHARCOAL(263, 1, "Charcoal"), DIAMOND(264, 0, "Diamond"), IRON_INGOT(265, 0, "Iron Ingot"),
	GOLD_INGOT(266, 0, "Gold Ingot"), IRON_SWORD(267, 0, "Iron Sword"), WOODEN_SWORD(268, 0, "Wooden Sword"),
	WOODEN_SHOVEL(269, 0, "Wooden Shovel"), WOODEN_PICKAXE(270, 0, "Wooden Pickaxe"), WOODEN_AXE(271, 0, "Wooden Axe"),
	STONE_SWORD(272, 0, "Stone Sword"), STONE_SHOVEL(273, 0, "Stone Shovel"), STONE_PICKAXE(274, 0, "Stone Pickaxe"),
	STONE_AXE(275, 0, "Stone Axe"), DIAMOND_SWORD(276, 0, "Diamond Sword"), DIAMOND_SHOVEL(277, 0, "Diamond Shovel"),
	DIAMOND_PICKAXE(278, 0, "Diamond Pickaxe"), DIAMOND_AXE(279, 0, "Diamond Axe"), STICK(280, 0, "Stick"),
	BOWL(281, 0, "Bowl"), MUSHROOM_STEW(282, 0, "Mushroom Stew"), GOLDEN_SWORD(283, 0, "Golden Sword"),
	GOLDEN_SHOVEL(284, 0, "Golden Shovel"), GOLDEN_PICKAXE(285, 0, "Golden Pickaxe"), GOLDEN_AXE(286, 0, "Golden Axe"),
	STRING(287, 0, "String"), FEATHER(288, 0, "Feather"), GUNPOWDER(289, 0, "Gunpowder"),
	WOODEN_HOE(290, 0, "Wooden Hoe"), STONE_HOE(291, 0, "Stone Hoe"), IRON_HOE(292, 0, "Iron Hoe"),
	DIAMOND_HOE(293, 0, "Diamond Hoe"), GOLDEN_HOE(294, 0, "Golden Hoe"), WHEAT_SEEDS(295, 0, "Wheat Seeds"),
	WHEAT(296, 0, "Wheat"), BREAD(297, 0, "Bread"), LEATHER_HELMET(298, 0, "Leather Helmet"),
	LEATHER_CHESTPLATE(299, 0, "Leather Tunic"), LEATHER_LEGGINGS(300, 0, "Leather Pants"),
	LEATHER_BOOTS(301, 0, "Leather Boots"), CHAINMAIL_HELMET(302, 0, "Chainmail Helmet"),
	CHAINMAIL_CHESTPLATE(303, 0, "Chainmail Chestplate"), CHAINMAIL_LEGGINGS(304, 0, "Chainmail Leggings"),
	CHAINMAIL_BOOTS(305, 0, "Chainmail Boots"), IRON_HELMET(306, 0, "Iron Helmet"),
	IRON_CHESTPLATE(307, 0, "Iron Chestplate"), IRON_LEGGINGS(308, 0, "Iron Leggings"),
	IRON_BOOTS(309, 0, "Iron Boots"), DIAMOND_HELMET(310, 0, "Diamond Helmet"),
	DIAMOND_CHESTPLATE(311, 0, "Diamond Chestplate"), DIAMOND_LEGGINGS(312, 0, "Diamond Leggings"),
	DIAMOND_BOOTS(313, 0, "Diamond Boots"), GOLDEN_HELMET(314, 0, "Golden Helmet"),
	GOLDEN_CHESTPLATE(315, 0, "Golden Chestplate"), GOLDEN_LEGGINGS(316, 0, "Golden Leggings"),
	GOLDEN_BOOTS(317, 0, "Golden Boots"), FLINT(318, 0, "Flint"), PORKCHOP(319, 0, "Raw Porkchop"),
	COOKED_PORKCHOP(320, 0, "Cooked Porkchop"), PAINTING(321, 0, "Painting"), GOLDEN_APPLE(322, 0, "Golden Apple"),
	ENCHANTED_GOLDEN_APPLE(322, 1, "Enchanted Golden Apple"), SIGN(323, 0, "Sign"), OAK_DOOR(324, 0, "Oak Door"),
	BUCKET(325, 0, "Bucket"), WATER_BUCKET(326, 0, "Water Bucket"), LAVA_BUCKET(327, 0, "Lava Bucket"),
	MINECART(328, 0, "Minecart"), SADDLE(329, 0, "Saddle"), IRON_DOOR(330, 0, "Iron Door"),
	REDSTONE(331, 0, "Redstone"), SNOWBALL(332, 0, "Snowball"), BOAT(333, 0, "Oak Boat"), LEATHER(334, 0, "Leather"),
	MILK_BUCKET(335, 0, "Milk Bucket"), BRICK(336, 0, "Brick"), CLAY_BALL(337, 0, "Clay"), REEDS(338, 0, "Sugar Canes"),
	PAPER(339, 0, "Paper"), BOOK(340, 0, "Book"), SLIME_BALL(341, 0, "Slimeball"),
	CHEST_MINECART(342, 0, "Minecart with Chest"), FURNACE_MINECART(343, 0, "Minecart with Furnace"),
	EGG(344, 0, "Egg"), COMPASS(345, 0, "Compass"), FISHING_ROD(346, 0, "Fishing Rod"), CLOCK(347, 0, "Clock"),
	GLOWSTONE_DUST(348, 0, "Glowstone Dust"), FISH(349, 0, "Raw Fish"), SALMON(349, 1, "Raw Salmon"),
	CLOWNFISH(349, 2, "Clownfish"), PUFFERFISH(349, 3, "Pufferfish"), COOKED_FISH(350, 0, "Cooked Fish"),
	COOKED_SALMON(350, 1, "Cooked Salmon"), INK_SACK(351, 0, "Ink Sack"), ROSE_RED(351, 1, "Rose Red"),
	CACTUS_GREEN(351, 2, "Cactus Green"), COCO_BEANS(351, 3, "Coco Beans"), LAPIS_LAZULI(351, 4, "Lapis Lazuli"),
	PURPLE_DYE(351, 5, "Purple Dye"), CYAN_DYE(351, 6, "Cyan Dye"), LIGHT_GRAY_DYE(351, 7, "Light Gray Dye"),
	GRAY_DYE(351, 8, "Gray Dye"), PINK_DYE(351, 9, "Pink Dye"), LIME_DYE(351, 10, "Lime Dye"),
	DANDELION_YELLOW(351, 11, "Dandelion Yellow"), LIGHT_BLUE_DYE(351, 12, "Light Blue Dye"),
	MAGENTA_DYE(351, 13, "Magenta Dye"), ORANGE_DYE(351, 14, "Orange Dye"), BONE_MEAL(351, 15, "Bone Meal"),
	BONE(352, 0, "Bone"), SUGAR(353, 0, "Sugar"), CAKE(354, 0, "Cake"), BED(355, 0, "Bed"),
	REPEATER(356, 0, "Redstone Repeater"), COOKIE(357, 0, "Cookie"), FILLED_MAP(358, 0, "Map"),
	SHEARS(359, 0, "Shears"), MELON(360, 0, "Melon"), PUMPKIN_SEEDS(361, 0, "Pumpkin Seeds"),
	MELON_SEEDS(362, 0, "Melon Seeds"), BEEF(363, 0, "Raw Beef"), COOKED_BEEF(364, 0, "Steak"),
	CHICKEN(365, 0, "Raw Chicken"), COOKED_CHICKEN(366, 0, "Cooked Chicken"), ROTTEN_FLESH(367, 0, "Rotten Flesh"),
	ENDER_PEARL(368, 0, "Ender Pearl"), BLAZE_ROD(369, 0, "Blaze Rod"), GHAST_TEAR(370, 0, "Ghast Tear"),
	GOLD_NUGGET(371, 0, "Gold Nugget"), NETHER_WART(372, 0, "Nether Wart"), POTION(373, 0, "Potion"),
	GLASS_BOTTLE(374, 0, "Glass Bottle"), SPIDER_EYE(375, 0, "Spider Eye"),
	FERMENTED_SPIDER_EYE(376, 0, "Fermented Spider Eye"), BLAZE_POWDER(377, 0, "Blaze Powder"),
	MAGMA_CREAM(378, 0, "Magma Cream"), BREWING_STAND(379, 0, "Brewing Stand"), CAULDRON(380, 0, "Cauldron"),
	ENDER_EYE(381, 0, "Eye of Ender"), SPECKLED_MELON(382, 0, "Glistering Melon"),
	ELDER_GUARDIAN_SPAWN_EGG(383, 4, "Spawn Elder Guardian"),
	WITHER_SKELETON_SPAWN_EGG(383, 5, "Spawn Wither Skeleton"),
	ZOMBIE_VILLAGER_SPAWN_EGG(383, 27, "Spawn Zombie Villager"),
	SKELETON_HORSE_SPAWN_EGG(383, 28, "Spawn Skeleton Horse"), ZOMBIE_HORSE_SPAWN_EGG(383, 29, "Spawn Zombie Horse"),
	DONKEY_SPAWN_EGG(383, 31, "Spawn Donkey"), MULE_SPAWN_EGG(383, 32, "Spawn Mule"),
	CREEPER_SPAWN_EGG(383, 50, "Spawn Creeper"), SKELETON_SPAWN_EGG(383, 51, "Spawn Skeleton"),
	SPIDER_SPAWN_EGG(383, 52, "Spawn Spider"), ZOMBIE_SPAWN_EGG(383, 54, "Spawn Zombie"),
	SLIME_SPAWN_EGG(383, 55, "Spawn Slime"), GHAST_SPAWN_EGG(383, 56, "Spawn Ghast"),
	ZOMBIE_PIGMAN_SPAWN_EGG(383, 57, "Spawn Zombie Pigman"), ENDERMAN_SPAWN_EGG(383, 58, "Spawn Enderman"),
	CAVE_SPIDER_SPAWN_EGG(383, 59, "Spawn Cave Spider"), SILVERFISH_SPAWN_EGG(383, 60, "Spawn Silverfish"),
	BLAZE_SPAWN_EGG(383, 61, "Spawn Blaze"), MAGMA_CUBE_SPAWN_EGG(383, 62, "Spawn Magma Cube"),
	BAT_SPAWN_EGG(383, 65, "Spawn Bat"), WITCH_SPAWN_EGG(383, 66, "Spawn Witch"),
	ENDERMITE_SPAWN_EGG(383, 67, "Spawn Endermite"), GUARDIAN_SPAWN_EGG(383, 68, "Spawn Guardian"),
	PIG_SPAWN_EGG(383, 90, "Spawn Pig"), SHEEP_SPAWN_EGG(383, 91, "Spawn Sheep"), COW_SPAWN_EGG(383, 92, "Spawn Cow"),
	CHICKEN_SPAWN_EGG(383, 93, "Spawn Chicken"), SQUID_SPAWN_EGG(383, 94, "Spawn Squid"),
	WOLF_SPAWN_EGG(383, 95, "Spawn Wolf"), MOOSHROOM_SPAWN_EGG(383, 96, "Spawn Mooshroom"),
	OCELOT_SPAWN_EGG(383, 98, "Spawn Ocelot"), HORSE_SPAWN_EGG(383, 100, "Spawn Horse"),
	RABBIT_SPAWN_EGG(383, 101, "Spawn Rabbit"), VILLAGER_SPAWN_EGG(383, 120, "Spawn Villager"),
	EXPERIENCE_BOTTLE(384, 0, "Bottle o' Enchanting"), FIRE_CHARGE(385, 0, "Fire Charge"),
	WRITABLE_BOOK(386, 0, "Book and Quill"), WRITTEN_BOOK(387, 0, "Written Book"), EMERALD(388, 0, "Emerald"),
	ITEM_FRAME(389, 0, "Item Frame"), FLOWER_POT(390, 0, "Flower Pot"), CARROT(391, 0, "Carrot"),
	POTATO(392, 0, "Potato"), BAKED_POTATO(393, 0, "Baked Potato"), POISONOUS_POTATO(394, 0, "Poisonous Potato"),
	MAP(395, 0, "Empty Map"), GOLDEN_CARROT(396, 0, "Golden Carrot"), SKELETON_SKULL(397, 0, "Mob Head (Skeleton)"),
	WITHER_SKELETON_SKULL(397, 1, "Mob Head (Wither Skeleton)"), ZOMBIE_SKULL(397, 2, "Mob Head (Zombie)"),
	HUMAN_SKULL(397, 3, "Mob Head (Human)"), CREEPER_SKULL(397, 4, "Mob Head (Creeper)"),
	CARROT_ON_A_STICK(398, 0, "Carrot on a Stick"), NETHER_STAR(399, 0, "Nether Star"),
	PUMPKIN_PIE(400, 0, "Pumpkin Pie"), FIREWORKS(401, 0, "Firework Rocket"), FIREWORK_CHARGE(402, 0, "Firework Star"),
	ENCHANTED_BOOK(403, 0, "Enchanted Book"), COMPARATOR(404, 0, "Redstone Comparator"),
	NETHERBRICK(405, 0, "Nether Brick"), QUARTZ(406, 0, "Nether Quartz"), TNT_MINECART(407, 0, "Minecart with TNT"),
	HOPPER_MINECART(408, 0, "Minecart with Hopper"), PRISMARINE_SHARD(409, 0, "Prismarine Shard"),
	PRISMARINE_CRYSTALS(410, 0, "Prismarine Crystals"), RABBIT(411, 0, "Raw Rabbit"),
	COOKED_RABBIT(412, 0, "Cooked Rabbit"), RABBIT_STEW(413, 0, "Rabbit Stew"), RABBIT_FOOT(414, 0, "Rabbit's Foot"),
	RABBIT_HIDE(415, 0, "Rabbit Hide"), ARMOR_STAND(416, 0, "Armor Stand"),
	IRON_HORSE_ARMOR(417, 0, "Iron Horse Armor"), GOLDEN_HORSE_ARMOR(418, 0, "Golden Horse Armor"),
	DIAMOND_HORSE_ARMOR(419, 0, "Diamond Horse Armor"), LEAD(420, 0, "Lead"), NAME_TAG(421, 0, "Name Tag"),
	COMMAND_BLOCK_MINECART(422, 0, "Minecart with Command Block"), MUTTON(423, 0, "Raw Mutton"),
	COOKED_MUTTON(424, 0, "Cooked Mutton"), BANNER(425, 0, "Banner"), END_CRYSTAL(426, 0, "End Crystal"),
	SPRUCE_DOOR(427, 0, "Spruce Door"), BIRCH_DOOR(428, 0, "Birch Door"), JUNGLE_DOOR(429, 0, "Jungle Door"),
	ACACIA_DOOR(430, 0, "Acacia Door"), DARK_OAK_DOOR(431, 0, "Dark Oak Door"), RECORD_13(2256, 0, "13 Disc"),
	RECORD_CAT(2257, 0, "Cat Disc"), RECORD_BLOCKS(2258, 0, "Blocks Disc"), RECORD_CHIRP(2259, 0, "Chirp Disc"),
	RECORD_FAR(2260, 0, "Far Disc"), RECORD_MALL(2261, 0, "Mall Disc"), RECORD_MELLOHI(2262, 0, "Mellohi Disc"),
	RECORD_STAL(2263, 0, "Stal Disc"), RECORD_STRAD(2264, 0, "Strad Disc"), RECORD_WARD(2265, 0, "Ward Disc"),
	RECORD_11(2266, 0, "11 Disc"), RECORD_WAIT(2267, 0, "Wait Disc");

	private final short id, damage;
	private final String name;

	private ItemType(short id, short damage, String name) {
		this.id = id;
		this.damage = damage;
		this.name = name;
	}

	private ItemType(int id, int damage, String name) {
		this((short) id, (short) damage, name);
	}

	public short getId() {
		return id;
	}

	public short getDamage() {
		return damage;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ItemType{id=" + id + ", damage=" + damage + ", name=" + name + "}";
	}

	public static ItemType getById(short id, short damage) {
		for (ItemType type : values()) {
			if (type.getId() == id && type.getDamage() == damage)
				return type;
		}
		return null;
	}
}
