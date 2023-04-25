package com.simplifyliferay.pokemon.service;

import com.simplifyliferay.pokemon.model.Pokemon;

import java.util.List;

public interface PokemonService {
    List<Pokemon> fetchAllPokemons();
    Pokemon fetchPokemon(long id);
}
