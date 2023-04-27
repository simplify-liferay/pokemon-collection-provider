package com.simplifyliferay.pokemon.service;

public class PokemonData {

    // TODO delete this class when pokemon data is being fetch from API
    public static final String ALL_POKEMONS_JSON = "[\n" +
            "    {\n" +
            "        \"number\": \"1\",\n" +
            "        \"name\": \"Bulbasaur\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"2'04\\\"\",\n" +
            "        \"weight\": \"15.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"While it is young, it uses the nutrients that are stored in the seeds on its back in order to grow.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"2\",\n" +
            "        \"name\": \"Ivysaur\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"28.7 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The bulb on its back grows as it absorbs nutrients. The bulb gives off a pleasant aroma when it blooms.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"3\",\n" +
            "        \"name\": \"Venusaur\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"6'07\\\"\",\n" +
            "        \"weight\": \"220.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"As it warms itself and absorbs the sunlight, its flower petals release a pleasant fragrance.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"4\",\n" +
            "        \"name\": \"Charmander\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\"\n" +
            "        ],\n" +
            "        \"height\": \"2'\",\n" +
            "        \"weight\": \"18.7 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"If it's healthy, the flame on the tip of its tail will burn vigorously, even if it gets a bit wet.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"5\",\n" +
            "        \"name\": \"Charmeleon\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\"\n" +
            "        ],\n" +
            "        \"height\": \"3'07\\\"\",\n" +
            "        \"weight\": \"41.9 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"If it becomes agitated during battle, it spouts intense flames, incinerating its surroundings.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"6\",\n" +
            "        \"name\": \"Charizard\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"5'07\\\"\",\n" +
            "        \"weight\": \"199.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It uses its wings to fly high. The temperature of its fire increases as it gains experience in battle.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"7\",\n" +
            "        \"name\": \"Squirtle\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"1'08\\\"\",\n" +
            "        \"weight\": \"19.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When it feels threatened, it draws its legs inside its shell and sprays water from its mouth.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"8\",\n" +
            "        \"name\": \"Wartortle\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"49.6 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Its long, furry tail is a symbol of longevity, making it quite popular among older people.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"9\",\n" +
            "        \"name\": \"Blastoise\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"5'03\\\"\",\n" +
            "        \"weight\": \"188.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It firmly plants its feet on the ground before shooting water from the jets on its back.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"10\",\n" +
            "        \"name\": \"Caterpie\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\"\n" +
            "        ],\n" +
            "        \"height\": \"1'\",\n" +
            "        \"weight\": \"6.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It crawls into foliage where it camouflages itself among leaves that are the same color as its body.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"11\",\n" +
            "        \"name\": \"Metapod\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\"\n" +
            "        ],\n" +
            "        \"height\": \"2'04\\\"\",\n" +
            "        \"weight\": \"21.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"This is its pre-evolved form. At this stage, it can only harden, so it remains motionless to avoid attack.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"12\",\n" +
            "        \"name\": \"Butterfree\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"4'07\\\"\",\n" +
            "        \"weight\": \"70.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It flits from flower to flower, collecting honey. It can even identify distant flowers in bloom.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"13\",\n" +
            "        \"name\": \"Weedle\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"1'\",\n" +
            "        \"weight\": \"7.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The barb on top of its head secretes a strong poison. It uses this toxic barb to protect itself.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/13.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"14\",\n" +
            "        \"name\": \"Kakuna\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"2'\",\n" +
            "        \"weight\": \"22 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Nearly incapable of movement, it leans against stout trees while waiting for its evolution.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/14.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"15\",\n" +
            "        \"name\": \"Beedrill\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"65 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It uses sharp, poisonous stings to defeat prey, then takes the victim back to its nest for food.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"16\",\n" +
            "        \"name\": \"Pidgey\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"1'\",\n" +
            "        \"weight\": \"4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It rapidly flaps its wings in the grass, stirring up a dust cloud that drives insect prey out into the open.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/16.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"17\",\n" +
            "        \"name\": \"Pidgeotto\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"3'07\\\"\",\n" +
            "        \"weight\": \"66.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It slowly flies in a circular pattern, all the while keeping a sharp lookout for prey.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/17.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"18\",\n" +
            "        \"name\": \"Pidgeot\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"4'11\\\"\",\n" +
            "        \"weight\": \"87.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Its outstanding vision allows it to spot splashing MAGIKARP, even while flying at 3300 feet.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/18.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"19\",\n" +
            "        \"name\": \"Rattata\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"1'\",\n" +
            "        \"weight\": \"7.7 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"This Pok\\u00e9mon's impressive vitality allows it to live anywhere. It also multiplies very quickly.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/19.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"20\",\n" +
            "        \"name\": \"Raticate\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"2'04\\\"\",\n" +
            "        \"weight\": \"40.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The webs on its hind legs enable it to cross rivers. It searches wide areas for food.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/20.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"21\",\n" +
            "        \"name\": \"Spearow\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"1'\",\n" +
            "        \"weight\": \"4.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"To protect its territory, it flies around ceaselessly, making high-pitched cries.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/21.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"22\",\n" +
            "        \"name\": \"Fearow\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"3'11\\\"\",\n" +
            "        \"weight\": \"83.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It uses its long beak to attack. It has a surprisingly long reach, so it must be treated with caution.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/22.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"23\",\n" +
            "        \"name\": \"Ekans\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"6'07\\\"\",\n" +
            "        \"weight\": \"15.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It flutters the tip of its tongue to seek out the scent of prey, then swallows the prey whole.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/23.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"24\",\n" +
            "        \"name\": \"Arbok\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"11'06\\\"\",\n" +
            "        \"weight\": \"143.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"To intimidate foes, it spreads its chest wide and makes eerie sounds by expelling air from its mouth.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/24.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"25\",\n" +
            "        \"name\": \"Pikachu\",\n" +
            "        \"types\": [\n" +
            "            \"Electric\"\n" +
            "        ],\n" +
            "        \"height\": \"1'04\\\"\",\n" +
            "        \"weight\": \"13.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When it is angered, it immediately discharges the energy stored in the pouches in its cheeks.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"26\",\n" +
            "        \"name\": \"Raichu\",\n" +
            "        \"types\": [\n" +
            "            \"Electric\"\n" +
            "        ],\n" +
            "        \"height\": \"2'07\\\"\",\n" +
            "        \"weight\": \"66.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"If its electric pouches run empty, it raises its tail to gather electricity from the atmosphere.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/26.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"27\",\n" +
            "        \"name\": \"Sandshrew\",\n" +
            "        \"types\": [\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"2'\",\n" +
            "        \"weight\": \"26.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It prefers dry, sandy places because it uses the sand to protect itself when threatened.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/27.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"28\",\n" +
            "        \"name\": \"Sandslash\",\n" +
            "        \"types\": [\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"65 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Adept at climbing trees, it rolls into a spiny ball, then attacks its enemies from above.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/28.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"29\",\n" +
            "        \"name\": \"Nidoran\\u2640\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"1'04\\\"\",\n" +
            "        \"weight\": \"15.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Small and very docile, it protects itself with its small, poisonous horn when attacked.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/29.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"30\",\n" +
            "        \"name\": \"Nidorina\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"2'07\\\"\",\n" +
            "        \"weight\": \"44.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It has a docile nature. If it is threatened with attack, it raises the barbs that are all over its body.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/30.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"31\",\n" +
            "        \"name\": \"Nidoqueen\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\",\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"4'03\\\"\",\n" +
            "        \"weight\": \"132.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The hard scales that cover its strong body serve as excellent protection from any attack.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/31.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"32\",\n" +
            "        \"name\": \"Nidoran\\u2642\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"1'08\\\"\",\n" +
            "        \"weight\": \"19.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It constantly moves its large ears in many directions in order to detect danger right away.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/32.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"33\",\n" +
            "        \"name\": \"Nidorino\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"2'11\\\"\",\n" +
            "        \"weight\": \"43 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It is easily agitated and uses its horn for offense as soon as it notices an attacker.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/33.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"34\",\n" +
            "        \"name\": \"Nidoking\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\",\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"4'07\\\"\",\n" +
            "        \"weight\": \"136.7 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It uses its thick arms, legs and tail to attack forcefully. Melee combat is its specialty.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/34.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"35\",\n" +
            "        \"name\": \"Clefairy\",\n" +
            "        \"types\": [\n" +
            "            \"Fairy\"\n" +
            "        ],\n" +
            "        \"height\": \"2'\",\n" +
            "        \"weight\": \"16.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Though rarely seen, it becomes easier to spot, for some reason, on the night of a full moon.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/35.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"36\",\n" +
            "        \"name\": \"Clefable\",\n" +
            "        \"types\": [\n" +
            "            \"Fairy\"\n" +
            "        ],\n" +
            "        \"height\": \"4'03\\\"\",\n" +
            "        \"weight\": \"88.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Said to live in quiet, remote mountains, this type of fairy has a strong aversion to being seen.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/36.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"37\",\n" +
            "        \"name\": \"Vulpix\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\"\n" +
            "        ],\n" +
            "        \"height\": \"2'\",\n" +
            "        \"weight\": \"21.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"As its body grows larger, its six warm tails become more beautiful, with a more luxurious coat of fur.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/37.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"38\",\n" +
            "        \"name\": \"Ninetales\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\"\n" +
            "        ],\n" +
            "        \"height\": \"3'07\\\"\",\n" +
            "        \"weight\": \"43.9 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It is said to live a thousand years, and each of its tails is loaded with supernatural powers.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/38.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"39\",\n" +
            "        \"name\": \"Jigglypuff\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\",\n" +
            "            \"Fairy\"\n" +
            "        ],\n" +
            "        \"height\": \"1'08\\\"\",\n" +
            "        \"weight\": \"12.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It rolls its cute eyes as it sings a soothing lullaby. Its gentle song puts anyone who hears it to sleep.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/39.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"40\",\n" +
            "        \"name\": \"Wigglytuff\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\",\n" +
            "            \"Fairy\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"26.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The rich, fluffy fur that covers its body feels so good that anyone who feels it can't stop touching it.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/40.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"41\",\n" +
            "        \"name\": \"Zubat\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"2'07\\\"\",\n" +
            "        \"weight\": \"16.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"During the day, it gathers with others and hangs from the ceilings of old buildings and caves.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/41.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"42\",\n" +
            "        \"name\": \"Golbat\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"5'03\\\"\",\n" +
            "        \"weight\": \"121.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When it plunges its fangs into its prey, it instantly draws and gulps down more than ten ounces of blood.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/42.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"43\",\n" +
            "        \"name\": \"Oddish\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"1'08\\\"\",\n" +
            "        \"weight\": \"11.9 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"During the day, it stays in the cold underground to avoid the sun. It grows by bathing in moonlight.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/43.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"44\",\n" +
            "        \"name\": \"Gloom\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"2'07\\\"\",\n" +
            "        \"weight\": \"19 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The smell from its drool-like syrup and the pollen on its petals is so bad, it may make opponents faint.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/44.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"45\",\n" +
            "        \"name\": \"Vileplume\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"3'11\\\"\",\n" +
            "        \"weight\": \"41 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"By shaking its big petals, it scatters toxic pollen into the air, turning the air yellow.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/45.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"46\",\n" +
            "        \"name\": \"Paras\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\",\n" +
            "            \"Grass\"\n" +
            "        ],\n" +
            "        \"height\": \"1'\",\n" +
            "        \"weight\": \"11.9 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The tochukaso growing on this POK\\u00e9MON's back orders it to extract juice from tree trunks.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/46.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"47\",\n" +
            "        \"name\": \"Parasect\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\",\n" +
            "            \"Grass\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"65 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When nothing's left to extract from the bug, the mushrooms on its back leave spores on the bug's egg.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/47.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"48\",\n" +
            "        \"name\": \"Venonat\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"66.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The small bugs it eats appear only at night, so it sleeps in a hole in a tree until night falls.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/48.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"49\",\n" +
            "        \"name\": \"Venomoth\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"4'11\\\"\",\n" +
            "        \"weight\": \"27.6 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The scales it scatters will paralyze anyone who touches them, making that person unable to stand.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/49.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"50\",\n" +
            "        \"name\": \"Diglett\",\n" +
            "        \"types\": [\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"0'08\\\"\",\n" +
            "        \"weight\": \"1.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It digs underground and chews on tree roots, sticking its head out only when the sun isn't bright.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/50.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"51\",\n" +
            "        \"name\": \"Dugtrio\",\n" +
            "        \"types\": [\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"2'04\\\"\",\n" +
            "        \"weight\": \"73.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"These DIGLETT triplets dig over 60 miles below sea level. No one knows what it's like underground.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/51.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"52\",\n" +
            "        \"name\": \"Meowth\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"1'04\\\"\",\n" +
            "        \"weight\": \"9.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It loves things that sparkle. When it sees a shiny object, the gold coin on its head shines too.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/52.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"53\",\n" +
            "        \"name\": \"Persian\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"70.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Behind its lithe, elegant appearance lies a barbaric side. It will tear apart its prey on a mere whim.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/53.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"54\",\n" +
            "        \"name\": \"Psyduck\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"2'07\\\"\",\n" +
            "        \"weight\": \"43.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The only time it can use its psychic power is when its sleeping brain cells happen to wake.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/54.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"55\",\n" +
            "        \"name\": \"Golduck\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"5'07\\\"\",\n" +
            "        \"weight\": \"168.9 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It swims gracefully along on the quiet, slow-moving rivers and lakes of which it is so fond.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/55.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"56\",\n" +
            "        \"name\": \"Mankey\",\n" +
            "        \"types\": [\n" +
            "            \"Fighting\"\n" +
            "        ],\n" +
            "        \"height\": \"1'08\\\"\",\n" +
            "        \"weight\": \"61.7 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It lives in groups in the treetops. If it loses sight of its group, it becomes infuriated by its loneliness.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/56.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"57\",\n" +
            "        \"name\": \"Primeape\",\n" +
            "        \"types\": [\n" +
            "            \"Fighting\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"70.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It will beat up anyone who makes it mad, even if it has to chase them until the end of the world.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/57.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"58\",\n" +
            "        \"name\": \"Growlithe\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\"\n" +
            "        ],\n" +
            "        \"height\": \"2'04\\\"\",\n" +
            "        \"weight\": \"41.9 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It controls a big territory. If it detects an unknown smell, it roars loudly to force out the intruder.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/58.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"59\",\n" +
            "        \"name\": \"Arcanine\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\"\n" +
            "        ],\n" +
            "        \"height\": \"6'03\\\"\",\n" +
            "        \"weight\": \"341.7 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"An ancient picture scroll shows that people were attracted to its movement as it ran through prairies.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/59.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"60\",\n" +
            "        \"name\": \"Poliwag\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"2'\",\n" +
            "        \"weight\": \"27.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The swirl on its belly is its insides showing through the skin. It looks clearer after it eats.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/60.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"61\",\n" +
            "        \"name\": \"Poliwhirl\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"44.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Though it is skilled at walking, it prefers to live underwater where there is less danger.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/61.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"62\",\n" +
            "        \"name\": \"Poliwrath\",\n" +
            "        \"types\": [\n" +
            "            \"Water\",\n" +
            "            \"Fighting\"\n" +
            "        ],\n" +
            "        \"height\": \"4'03\\\"\",\n" +
            "        \"weight\": \"119 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It can use its well-developed arms and legs to run on the surface of the water for a split second.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/62.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"63\",\n" +
            "        \"name\": \"Abra\",\n" +
            "        \"types\": [\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"2'11\\\"\",\n" +
            "        \"weight\": \"43 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It hypnotizes itself so that it can teleport away when it senses danger, even if it is asleep.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/63.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"64\",\n" +
            "        \"name\": \"Kadabra\",\n" +
            "        \"types\": [\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"4'03\\\"\",\n" +
            "        \"weight\": \"124.6 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When it closes its eyes, twice as many alpha particles come out of the surface of its body.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/64.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"65\",\n" +
            "        \"name\": \"Alakazam\",\n" +
            "        \"types\": [\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"4'11\\\"\",\n" +
            "        \"weight\": \"105.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It has an IQ of 5000. It calculates many things in order to gain the edge in every battle.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/65.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"66\",\n" +
            "        \"name\": \"Machop\",\n" +
            "        \"types\": [\n" +
            "            \"Fighting\"\n" +
            "        ],\n" +
            "        \"height\": \"2'07\\\"\",\n" +
            "        \"weight\": \"43 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It trains by lifting rocks in the mountains. It can even pick up a GRAVELER with ease.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/66.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"67\",\n" +
            "        \"name\": \"Machoke\",\n" +
            "        \"types\": [\n" +
            "            \"Fighting\"\n" +
            "        ],\n" +
            "        \"height\": \"4'11\\\"\",\n" +
            "        \"weight\": \"155.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"This tough POK\\u00e9MON always stays in the zone. Its muscles become thicker after every battle.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/67.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"68\",\n" +
            "        \"name\": \"Machamp\",\n" +
            "        \"types\": [\n" +
            "            \"Fighting\"\n" +
            "        ],\n" +
            "        \"height\": \"5'03\\\"\",\n" +
            "        \"weight\": \"286.6 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"With four arms that react more quickly than it can think, it can execute many punches at once.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/68.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"69\",\n" +
            "        \"name\": \"Bellsprout\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"2'04\\\"\",\n" +
            "        \"weight\": \"8.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"If it notices anything that moves, it immediately flings its vine at the object.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/69.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"70\",\n" +
            "        \"name\": \"Weepinbell\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"14.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When it's hungry, it swings its razor-sharp leaves, slicing up any unlucky object nearby for food.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/70.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"71\",\n" +
            "        \"name\": \"Victreebel\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"5'07\\\"\",\n" +
            "        \"weight\": \"34.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Once ingested into this POK\\u00e9MON's body, even the hardest object will melt into nothing.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/71.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"72\",\n" +
            "        \"name\": \"Tentacool\",\n" +
            "        \"types\": [\n" +
            "            \"Water\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"2'11\\\"\",\n" +
            "        \"weight\": \"100.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"As it floats along on the waves, it uses its toxic feelers to stab anything it touches.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/72.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"73\",\n" +
            "        \"name\": \"Tentacruel\",\n" +
            "        \"types\": [\n" +
            "            \"Water\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"5'03\\\"\",\n" +
            "        \"weight\": \"121.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When its 80 feelers absorb water, it stretches to become like a net to entangle its prey.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/73.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"74\",\n" +
            "        \"name\": \"Geodude\",\n" +
            "        \"types\": [\n" +
            "            \"Rock\",\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"1'04\\\"\",\n" +
            "        \"weight\": \"44.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Proud of their sturdy bodies, they bash against each other in a contest to prove whose is harder.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/74.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"75\",\n" +
            "        \"name\": \"Graveler\",\n" +
            "        \"types\": [\n" +
            "            \"Rock\",\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"231.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It travels by rolling on mountain paths. If it gains too much speed, it stops by running into huge rocks.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/75.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"76\",\n" +
            "        \"name\": \"Golem\",\n" +
            "        \"types\": [\n" +
            "            \"Rock\",\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"4'07\\\"\",\n" +
            "        \"weight\": \"661.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Its rock-like body is so durable, even high-powered dynamite blasts fail to scratch its rugged hide.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/76.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"77\",\n" +
            "        \"name\": \"Ponyta\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"66.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Training by jumping over grass that grows longer every day has made it a world-class jumper.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/77.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"78\",\n" +
            "        \"name\": \"Rapidash\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\"\n" +
            "        ],\n" +
            "        \"height\": \"5'07\\\"\",\n" +
            "        \"weight\": \"209.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It just loves to gallop. The faster it goes, the longer the swaying flames of its mane will become.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/78.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"79\",\n" +
            "        \"name\": \"Slowpoke\",\n" +
            "        \"types\": [\n" +
            "            \"Water\",\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"3'11\\\"\",\n" +
            "        \"weight\": \"79.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It is always so absent-minded that it won't react, even if its flavorful tail is bitten.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/79.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"80\",\n" +
            "        \"name\": \"Slowbro\",\n" +
            "        \"types\": [\n" +
            "            \"Water\",\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"5'03\\\"\",\n" +
            "        \"weight\": \"173.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"An attached SHELLDER won't let go because of the tasty flavor that oozes out of its tail.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/80.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"81\",\n" +
            "        \"name\": \"Magnemite\",\n" +
            "        \"types\": [\n" +
            "            \"Electric\",\n" +
            "            \"Steel\"\n" +
            "        ],\n" +
            "        \"height\": \"1'\",\n" +
            "        \"weight\": \"13.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The electricity emitted by the units on each side of its body cause it to become a strong magnet.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/81.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"82\",\n" +
            "        \"name\": \"Magneton\",\n" +
            "        \"types\": [\n" +
            "            \"Electric\",\n" +
            "            \"Steel\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"132.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When many MAGNETON gather together, the resulting magnetic storm disrupts radio waves.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/82.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"83\",\n" +
            "        \"name\": \"Farfetch'd\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"2'07\\\"\",\n" +
            "        \"weight\": \"33.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"In order to prevent their extinction, more people have made an effort to breed these POK\\u00e9MON.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/83.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"84\",\n" +
            "        \"name\": \"Doduo\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"4'07\\\"\",\n" +
            "        \"weight\": \"86.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It lives on a grassy plain where it can see a long way. If it sees an enemy, it runs away at 60 mph.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/84.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"85\",\n" +
            "        \"name\": \"Dodrio\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"5'11\\\"\",\n" +
            "        \"weight\": \"187.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"An enemy that takes its eyes off any of the three heads--even for a second--will get pecked severely.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/85.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"86\",\n" +
            "        \"name\": \"Seel\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"3'07\\\"\",\n" +
            "        \"weight\": \"198.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The light blue fur that covers it keeps it protected against the cold. It loves iceberg-filled oceans.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/86.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"87\",\n" +
            "        \"name\": \"Dewgong\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"5'07\\\"\",\n" +
            "        \"weight\": \"264.6 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It sleeps under shallow ocean waters during the day, then looks for food at night when it's cold.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/87.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"88\",\n" +
            "        \"name\": \"Grimer\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"2'11\\\"\",\n" +
            "        \"weight\": \"66.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When two of these POK\\u00e9MON's bodies are combined together, new poisons are created.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/88.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"89\",\n" +
            "        \"name\": \"Muk\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"3'11\\\"\",\n" +
            "        \"weight\": \"66.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"As it moves, a very strong poison leaks from it, making the ground there barren for three years.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/89.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"90\",\n" +
            "        \"name\": \"Shellder\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"1'\",\n" +
            "        \"weight\": \"8.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Clamping on to an opponent reveals its vulnerable parts, so it uses this move only as a last resort.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/90.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"91\",\n" +
            "        \"name\": \"Cloyster\",\n" +
            "        \"types\": [\n" +
            "            \"Water\",\n" +
            "            \"Ice\"\n" +
            "        ],\n" +
            "        \"height\": \"4'11\\\"\",\n" +
            "        \"weight\": \"292.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Even a missile can't break the spikes it uses to stab opponents. They're even harder than its shell.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/91.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"92\",\n" +
            "        \"name\": \"Gastly\",\n" +
            "        \"types\": [\n" +
            "            \"Ghost\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"4'03\\\"\",\n" +
            "        \"weight\": \"0.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It wraps its opponent in its gas-like body, slowly weakening its prey by poisoning it through the skin.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/92.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"93\",\n" +
            "        \"name\": \"Haunter\",\n" +
            "        \"types\": [\n" +
            "            \"Ghost\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"5'03\\\"\",\n" +
            "        \"weight\": \"0.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It hides in the dark, planning to take the life of the next living thing that wanders close by.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/93.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"94\",\n" +
            "        \"name\": \"Gengar\",\n" +
            "        \"types\": [\n" +
            "            \"Ghost\",\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"4'11\\\"\",\n" +
            "        \"weight\": \"89.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Hiding in people's shadows at night, it absorbs their heat. The chill it causes makes the victims shake.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/94.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"95\",\n" +
            "        \"name\": \"Onix\",\n" +
            "        \"types\": [\n" +
            "            \"Rock\",\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"28'10\\\"\",\n" +
            "        \"weight\": \"463 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"As it digs through the ground, it absorbs many hard objects. This is what makes its body so solid.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/95.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"96\",\n" +
            "        \"name\": \"Drowzee\",\n" +
            "        \"types\": [\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"71.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When it twitches its nose, it can tell where someone is sleeping and what that person is dreaming about.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/96.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"97\",\n" +
            "        \"name\": \"Hypno\",\n" +
            "        \"types\": [\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"5'03\\\"\",\n" +
            "        \"weight\": \"166.7 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The longer it swings its pendulum, the longer the effects of its hypnosis last.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/97.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"98\",\n" +
            "        \"name\": \"Krabby\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"1'04\\\"\",\n" +
            "        \"weight\": \"14.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"If it is unable to find food, it will absorb nutrients by swallowing a mouthful of sand.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/98.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"99\",\n" +
            "        \"name\": \"Kingler\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"4'03\\\"\",\n" +
            "        \"weight\": \"132.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Its oversized claw is very powerful, but when it's not in battle, the claw just gets in the way.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/99.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"100\",\n" +
            "        \"name\": \"Voltorb\",\n" +
            "        \"types\": [\n" +
            "            \"Electric\"\n" +
            "        ],\n" +
            "        \"height\": \"1'08\\\"\",\n" +
            "        \"weight\": \"22.9 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"During the study of this POK\\u00e9MON, it was discovered that its components are not found in nature.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/100.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"101\",\n" +
            "        \"name\": \"Electrode\",\n" +
            "        \"types\": [\n" +
            "            \"Electric\"\n" +
            "        ],\n" +
            "        \"height\": \"3'11\\\"\",\n" +
            "        \"weight\": \"146.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The more energy it charges up, the faster it gets. But this also makes it more likely to explode.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/101.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"102\",\n" +
            "        \"name\": \"Exeggcute\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\",\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"1'04\\\"\",\n" +
            "        \"weight\": \"5.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"If even one is separated from the group, the energy bond between the six will make them rejoin instantly.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/102.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"103\",\n" +
            "        \"name\": \"Exeggutor\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\",\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"6'07\\\"\",\n" +
            "        \"weight\": \"264.6 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Living in a good environment makes it grow lots of heads. A head that drops off becomes an EXEGGCUTE.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/103.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"104\",\n" +
            "        \"name\": \"Cubone\",\n" +
            "        \"types\": [\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"1'04'`\\\"\",\n" +
            "        \"weight\": \"14.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It lost its mother after its birth. It wears its mother's skull, never revealing its true face.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/104.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"105\",\n" +
            "        \"name\": \"Marowak\",\n" +
            "        \"types\": [\n" +
            "            \"Ground\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03'`\\\"\",\n" +
            "        \"weight\": \"99.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Somewhere in the world is a cemetery just for MAROWAK. It gets its bones from those graves.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/105.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"106\",\n" +
            "        \"name\": \"Hitmonlee\",\n" +
            "        \"types\": [\n" +
            "            \"Fighting\"\n" +
            "        ],\n" +
            "        \"height\": \"4'11\\\"\",\n" +
            "        \"weight\": \"109.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It is also called the Kick Master. It uses its elastic legs to execute every known kick.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/106.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"107\",\n" +
            "        \"name\": \"Hitmonchan\",\n" +
            "        \"types\": [\n" +
            "            \"Fighting\"\n" +
            "        ],\n" +
            "        \"height\": \"4'07\\\"\",\n" +
            "        \"weight\": \"110.7 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"To increase the strength of all its punch moves, it spins its arms just before making contact.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/107.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"108\",\n" +
            "        \"name\": \"Lickitung\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"3'11\\\"\",\n" +
            "        \"weight\": \"144.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It has a tongue that is over 6\\u20196\\u2019\\u2019 long. It uses this long tongue to lick its body clean.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/108.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"109\",\n" +
            "        \"name\": \"Koffing\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"2'\",\n" +
            "        \"weight\": \"2.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"If one gets close enough to it when it expels poisonous gas, the gas swirling inside it can be seen.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/109.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"110\",\n" +
            "        \"name\": \"Weezing\",\n" +
            "        \"types\": [\n" +
            "            \"Poison\"\n" +
            "        ],\n" +
            "        \"height\": \"3'11\\\"\",\n" +
            "        \"weight\": \"20.9 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When it inhales poisonous gases from garbage, its body expands, and its insides smell much worse.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/110.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"111\",\n" +
            "        \"name\": \"Rhyhorn\",\n" +
            "        \"types\": [\n" +
            "            \"Ground\",\n" +
            "            \"Rock\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"253.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It can remember only one thing at a time. Once it starts rushing, it forgets why it started.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/111.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"112\",\n" +
            "        \"name\": \"Rhyhorn\",\n" +
            "        \"types\": [\n" +
            "            \"Ground\",\n" +
            "            \"Rock\"\n" +
            "        ],\n" +
            "        \"height\": \"6'03\\\"\",\n" +
            "        \"weight\": \"264.6 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"By lightly spinning its drill-like horn, it can easily shatter even a diamond in the rough.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/112.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"113\",\n" +
            "        \"name\": \"Chansey\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"3'07\\\"\",\n" +
            "        \"weight\": \"76.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"People try to catch it for its extremely nutritious eggs, but it rarely can be found.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/113.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"114\",\n" +
            "        \"name\": \"Tangela\",\n" +
            "        \"types\": [\n" +
            "            \"Grass\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"77.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"During battle, it constantly moves the vines that cover its body in order to annoy its opponent.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/114.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"115\",\n" +
            "        \"name\": \"Kangaskhan\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"7'03\\\"\",\n" +
            "        \"weight\": \"176.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"To avoid crushing the baby it carries in its pouch, it always sleeps standing up.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/115.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"116\",\n" +
            "        \"name\": \"Horsea\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"1'04\\\"\",\n" +
            "        \"weight\": \"17.6 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When they're in a safe location, they can be seen playfully tangling their tails together.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/116.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"117\",\n" +
            "        \"name\": \"Seadra\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"3'11\\\"\",\n" +
            "        \"weight\": \"55.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The male raises the young. If it is approached, it uses its toxic spikes to fend off the intruder.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/117.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"118\",\n" +
            "        \"name\": \"Goldeen\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"2'\",\n" +
            "        \"weight\": \"33.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"During spawning season, they swim gracefully in the water, searching for their perfect mate.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/118.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"119\",\n" +
            "        \"name\": \"Seaking\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"4'03\\\"\",\n" +
            "        \"weight\": \"86 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When autumn comes, the males patrol the area around their nests in order to protect their offspring.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/119.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"120\",\n" +
            "        \"name\": \"Staryu\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"2'07\\\"\",\n" +
            "        \"weight\": \"76.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When the stars twinkle at night, it floats up from the sea floor, and its body's center core flickers.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/120.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"121\",\n" +
            "        \"name\": \"Starmie\",\n" +
            "        \"types\": [\n" +
            "            \"Water\",\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"3'07\\\"\",\n" +
            "        \"weight\": \"176.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It is said that it uses the seven-colored core of its body to send electric waves into outer space.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/121.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"122\",\n" +
            "        \"name\": \"Mr. Mime\",\n" +
            "        \"types\": [\n" +
            "            \"Psychic\",\n" +
            "            \"Fairy\"\n" +
            "        ],\n" +
            "        \"height\": \"4'03\\\"\",\n" +
            "        \"weight\": \"120 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It uses the mysterious power it has in its fingers to solidify air into an invisible wall.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/122.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"123\",\n" +
            "        \"name\": \"Scyther\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"4'11\\\"\",\n" +
            "        \"weight\": \"123.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It's very proud of its speed. It moves so fast that its opponent does not even know what knocked it down.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/123.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"124\",\n" +
            "        \"name\": \"Jynx\",\n" +
            "        \"types\": [\n" +
            "            \"Ice\",\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"4'07\\\"\",\n" +
            "        \"weight\": \"89.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It has several different cry patterns, each of which seems to have its own meaning.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/124.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"125\",\n" +
            "        \"name\": \"Electabuzz\",\n" +
            "        \"types\": [\n" +
            "            \"Electric\"\n" +
            "        ],\n" +
            "        \"height\": \"3'07\\\"\",\n" +
            "        \"weight\": \"66.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When two ELECTABUZZ touch, they control the electric currents to communicate their feelings.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/125.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"126\",\n" +
            "        \"name\": \"Magmar\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\"\n" +
            "        ],\n" +
            "        \"height\": \"4'03\\\"\",\n" +
            "        \"weight\": \"98.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It moves more frequently in hot areas. It can heal itself by dipping its wound into lava.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/126.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"127\",\n" +
            "        \"name\": \"Pinsir\",\n" +
            "        \"types\": [\n" +
            "            \"Bug\"\n" +
            "        ],\n" +
            "        \"height\": \"4'11\\\"\",\n" +
            "        \"weight\": \"121.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When the temperature drops at night, it sleeps on treetops or among roots where it is well hidden.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/127.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"128\",\n" +
            "        \"name\": \"Tauros\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"4'07\\\"\",\n" +
            "        \"weight\": \"194.9 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"These violent POK\\u00e9MON fight with other members of their herd in order to prove their strength.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/128.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"129\",\n" +
            "        \"name\": \"Magikarp\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"2'11\\\"\",\n" +
            "        \"weight\": \"22 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"This weak and pathetic POK\\u00e9MON gets easily pushed along rivers when there are strong currents.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/129.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"130\",\n" +
            "        \"name\": \"Gyarados\",\n" +
            "        \"types\": [\n" +
            "            \"Water\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"21'04\\\"\",\n" +
            "        \"weight\": \"518.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It appears whenever there is world conflict, burning down any place it travels through.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/130.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"131\",\n" +
            "        \"name\": \"Lapras\",\n" +
            "        \"types\": [\n" +
            "            \"Water\",\n" +
            "            \"Ice\"\n" +
            "        ],\n" +
            "        \"height\": \"8'02\\\"\",\n" +
            "        \"weight\": \"485 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"This gentle POK\\u00e9MON loves to give people rides and provides a very comfortable way to get around.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/131.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"132\",\n" +
            "        \"name\": \"Ditto\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"1'\",\n" +
            "        \"weight\": \"8.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"When it encounters another DITTO, it will move faster than normal to duplicate that opponent exactly.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"133\",\n" +
            "        \"name\": \"Eevee\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"1'\",\n" +
            "        \"weight\": \"14.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Its ability to evolve into many forms allows it to adapt smoothly and perfectly to any environment.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/133.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"134\",\n" +
            "        \"name\": \"Vaporeon\",\n" +
            "        \"types\": [\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"63.9 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"As it uses the fins on the tip of its tail to swim, it blends with the water perfectly.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/134.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"135\",\n" +
            "        \"name\": \"Jolteon\",\n" +
            "        \"types\": [\n" +
            "            \"Electric\"\n" +
            "        ],\n" +
            "        \"height\": \"2'07\\\"\",\n" +
            "        \"weight\": \"54 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"The negatively charged ions generated in its fur create a constant sparking noise.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/135.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"136\",\n" +
            "        \"name\": \"Flareon\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\"\n" +
            "        ],\n" +
            "        \"height\": \"2'11\\\"\",\n" +
            "        \"weight\": \"55.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Once it has stored up enough heat, this POK\\u00e9MON's body temperature can reach up to 1700 degrees.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/136.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"137\",\n" +
            "        \"name\": \"Porygon\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"2'07\\\"\",\n" +
            "        \"weight\": \"80.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"An artificial POK\\u00e9MON created due to extensive research, it can perform only what is in its program.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/137.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"138\",\n" +
            "        \"name\": \"Omanyte\",\n" +
            "        \"types\": [\n" +
            "            \"Rock\",\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"1'04\\\"\",\n" +
            "        \"weight\": \"16.5 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"In prehistoric times, it swam on the sea floor, eating plankton. Its fossils are sometimes found.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/138.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"139\",\n" +
            "        \"name\": \"Omastar\",\n" +
            "        \"types\": [\n" +
            "            \"Rock\",\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"3'03\\\"\",\n" +
            "        \"weight\": \"77.2 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Its heavy shell allowed it to reach only nearby food. This could be the reason it is extinct.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/139.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"140\",\n" +
            "        \"name\": \"Kabuto\",\n" +
            "        \"types\": [\n" +
            "            \"Rock\",\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"1'08\\\"\",\n" +
            "        \"weight\": \"25.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Three hundred million years ago, it hid on the sea floor. It also has eyes on its back that glow.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/140.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"141\",\n" +
            "        \"name\": \"Kabutops\",\n" +
            "        \"types\": [\n" +
            "            \"Rock\",\n" +
            "            \"Water\"\n" +
            "        ],\n" +
            "        \"height\": \"4'03\\\"\",\n" +
            "        \"weight\": \"89.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It was able to swim quickly through the water by compactly folding up its razor-sharp sickles.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/141.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"142\",\n" +
            "        \"name\": \"Aerodactyl\",\n" +
            "        \"types\": [\n" +
            "            \"Rock\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"5'11\\\"\",\n" +
            "        \"weight\": \"130.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"In prehistoric times, this POK\\u00e9MON flew freely and fearlessly through the skies.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/142.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"143\",\n" +
            "        \"name\": \"Snorlax\",\n" +
            "        \"types\": [\n" +
            "            \"Normal\"\n" +
            "        ],\n" +
            "        \"height\": \"6'11\\\"\",\n" +
            "        \"weight\": \"1014.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"This POK\\u00e9MON's stomach is so strong, even eating moldy or rotten food will not affect it.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/143.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"144\",\n" +
            "        \"name\": \"Articuno\",\n" +
            "        \"types\": [\n" +
            "            \"Ice\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"5'07\\\"\",\n" +
            "        \"weight\": \"122.1 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Legendary bird POK\\u00e9MON. As it flies through the sky, it cools the air, causing snow to fall.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/144.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"145\",\n" +
            "        \"name\": \"Zapdos\",\n" +
            "        \"types\": [\n" +
            "            \"Electric\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"5'03\\\"\",\n" +
            "        \"weight\": \"116 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Legendary bird POK\\u00e9MON. They say lightning caused by the flapping of its wings causes summer storms.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/145.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"146\",\n" +
            "        \"name\": \"Moltres\",\n" +
            "        \"types\": [\n" +
            "            \"Fire\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"6'07\\\"\",\n" +
            "        \"weight\": \"132.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Legendary bird POK\\u00e9MON. It is said to migrate from the south along with the spring.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/146.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"147\",\n" +
            "        \"name\": \"Dratini\",\n" +
            "        \"types\": [\n" +
            "            \"Dragon\"\n" +
            "        ],\n" +
            "        \"height\": \"5'11\\\"\",\n" +
            "        \"weight\": \"7.3 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It sheds many layers of skin as it grows larger. During this process, it is protected by a rapid waterfall.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/147.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"148\",\n" +
            "        \"name\": \"Dragonair\",\n" +
            "        \"types\": [\n" +
            "            \"Dragon\"\n" +
            "        ],\n" +
            "        \"height\": \"13'01\\\"\",\n" +
            "        \"weight\": \"36.4 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It is called the divine POK\\u00e9MON. When its entire body brightens slightly, the weather changes.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/148.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"149\",\n" +
            "        \"name\": \"Dragonite\",\n" +
            "        \"types\": [\n" +
            "            \"Dragon\",\n" +
            "            \"Flying\"\n" +
            "        ],\n" +
            "        \"height\": \"7'03\\\"\",\n" +
            "        \"weight\": \"463 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"It is said that somewhere in the ocean lies an island where these gather. Only they live there.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/149.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"150\",\n" +
            "        \"name\": \"Mewtwo\",\n" +
            "        \"types\": [\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"6'07\\\"\",\n" +
            "        \"weight\": \"269 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Said to rest quietly in an undiscovered cave, this POK\\u00e9MON was created solely for battling.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/150.png\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"number\": \"151\",\n" +
            "        \"name\": \"Mew\",\n" +
            "        \"types\": [\n" +
            "            \"Psychic\"\n" +
            "        ],\n" +
            "        \"height\": \"1'04\\\"\",\n" +
            "        \"weight\": \"8.8 lbs.\",\n" +
            "        \"gen\": 1,\n" +
            "        \"description\": \"Because it can learn any move, some people began research to see if it is the ancestor of all POK\\u00e9MON.\",\n" +
            "        \"sprite\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/151.png\"\n" +
            "    }\n" +
            "]";

}
