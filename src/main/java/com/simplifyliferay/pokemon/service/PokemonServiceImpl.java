package com.simplifyliferay.pokemon.service;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.simplifyliferay.pokemon.constants.PokemonInfoProviderConstants;
import com.simplifyliferay.pokemon.model.Pokemon;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@Component(
        immediate = true,
        service = PokemonService.class
)
public class PokemonServiceImpl implements PokemonService {

    private final List<Pokemon> pokemons = new ArrayList<>();

    @Override
    public List<Pokemon> fetchPokemons(int start, int end) {
        return pokemons.subList(start, end);
    }

    @Override
    public int countPokemons() {
        return pokemons.size();
    }

    @Override
    public Pokemon fetchPokemon(long id) {
        return pokemons.stream().filter(pokemon -> pokemon.getId() == id).findAny().orElse(null);
    }

    @Activate
    private void _fetchAllPokemons() {
        ArrayList<Pokemon> pokemons = new ArrayList<>();

        try {

            // TODO fetch pokémons from an API
            JSONArray allPokemonsJson = JSONFactoryUtil.createJSONArray(PokemonData.ALL_POKEMONS_JSON);
            for (int i = 0; i < allPokemonsJson.length(); i++) {
                JSONObject object = allPokemonsJson.getJSONObject(i);

                if (Validator.isNotNull(object))
                    pokemons.add(_toPokemon(object));
            }

        } catch (Exception e) {
            _log.error(MessageFormat.format("error occurred while trying to fetch pokémon information " +
                    ":: error => {0}", e.getMessage()));

            if (_log.isDebugEnabled())
                _log.debug(e);
        }

        this.pokemons.addAll(pokemons);
    }

    private Pokemon _toPokemon(JSONObject json) {
        Pokemon pokemon = new Pokemon();

        pokemon.setId(json.getLong("number"));
        pokemon.setName(json.getString("name"));
        pokemon.setDescription(json.getString("description"));
        pokemon.setImageUrl(json.getString("sprite"));
        pokemon.setGeneration(json.getInt("gen"));

        return pokemon;
    }

    private  static final Log _log = LogFactoryUtil.getLog(PokemonServiceImpl.class);
}
