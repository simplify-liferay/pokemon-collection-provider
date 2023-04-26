package com.simplifyliferay.pokemon.service;

import com.simplifyliferay.pokemon.model.Pokemon;

import java.util.List;

public interface PokemonService {
    List<Pokemon> fetchPokemons(int start, int end);
    int countPokemons();
    Pokemon fetchPokemon(long id);
}
