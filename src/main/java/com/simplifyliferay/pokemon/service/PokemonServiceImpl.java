package com.simplifyliferay.pokemon.service;

import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.simplifyliferay.pokemon.model.Pokemon;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.*;

@Component(
        immediate = true,
        service = PokemonService.class
)
public class PokemonServiceImpl implements PokemonService {

    @Override
    public List<Pokemon> fetchAllPokemons() {
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(testingPokemon);
        return pokemons;
    }

    @Override
    public Pokemon fetchPokemon(long id) {
        return testingPokemon;
    }

    private  static final Log _log = LogFactoryUtil.getLog(PokemonServiceImpl.class);

    @Reference
    private JSONFactory _jsonFactory;

    static final Pokemon testingPokemon = new Pokemon();

    static {
        testingPokemon.setDescription("Charizard is a Fire/Flying type Pokémon introduced in Generation 1. It is known " +
                "as the Flame Pokémon.");
        testingPokemon.setName("Charizard");
        testingPokemon.setGeneration(1);
        testingPokemon.setHeight(170.20f);
        testingPokemon.setWeight(90.50f);
        testingPokemon.setImageUrl("https://nexus.traction.one/images/pokemon/pokemon/6.png");
        testingPokemon.setTypes(new String[] { "fire", "flying" });
        testingPokemon.setId(5);
    }
}
