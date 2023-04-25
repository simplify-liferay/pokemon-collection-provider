package com.simplifyliferay.pokemon.info.provider;

import com.liferay.info.collection.provider.CollectionQuery;
import com.liferay.info.collection.provider.InfoCollectionProvider;
import com.liferay.info.pagination.InfoPage;
import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.simplifyliferay.pokemon.model.Pokemon;
import com.simplifyliferay.pokemon.service.PokemonService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;
import java.util.Locale;

@Component(
        immediate = true,
        service = InfoCollectionProvider.class
)
public class PokemonsInfoCollectionProvider implements InfoCollectionProvider<Pokemon> {
    @Override
    public InfoPage<Pokemon> getCollectionInfoPage(CollectionQuery collectionQuery) {
        List<Pokemon> pokemons = _pokemonService.fetchAllPokemons();
        return InfoPage.of(pokemons);
    }

    @Override
    public String getLabel(Locale locale) {
        return _language.get(locale, "pokemons-collection-provider");
    }

    private static final Log _log = LogFactoryUtil.getLog(PokemonsInfoCollectionProvider.class);

    @Reference
    private Language _language;

    @Reference
    private PokemonService _pokemonService;
}
