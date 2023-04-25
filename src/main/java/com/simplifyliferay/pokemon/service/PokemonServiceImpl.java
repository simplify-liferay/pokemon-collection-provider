package com.simplifyliferay.pokemon.service;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.simplifyliferay.pokemon.constants.PokemonInfoProviderConstants;
import com.simplifyliferay.pokemon.model.Pokemon;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

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

    @Override
    public List<Pokemon> fetchAllPokemons() {
        ArrayList<Pokemon> pokemons = new ArrayList<>();

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(PokemonInfoProviderConstants.POKEMON_EXTERNAL_API_URL))
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            if (Validator.isNotNull(response.body())) {
                String json = response.body();
                JSONArray jsonArray = JSONFactoryUtil.createJSONArray(json);

                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject object = jsonArray.getJSONObject(i);

                    if (Validator.isNotNull(object))
                        pokemons.add(_toPokemon(object));
                }
            }

        } catch (Exception e) {
            _log.error(MessageFormat.format("error occurred while trying to fetch pokémon service information " +
                    ":: error => {0}", e.getMessage()));

            if (_log.isDebugEnabled())
                _log.debug(e);
        }

        return pokemons;
    }

    @Override
    public Pokemon fetchPokemon(long id) {
        return fetchAllPokemons().stream().filter(pokemon -> pokemon.getId() == id).findAny().orElse(null);
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
