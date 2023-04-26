package com.simplifyliferay.pokemon.info.provider;

import com.liferay.info.collection.provider.CollectionQuery;
import com.liferay.info.collection.provider.InfoCollectionProvider;
import com.liferay.info.pagination.InfoPage;
import com.liferay.info.pagination.Pagination;
import com.liferay.portal.kernel.language.Language;
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
        Pagination pagination = collectionQuery.getPagination();
        List<Pokemon> pokemons = _pokemonService.fetchPokemons(pagination.getStart(), pagination.getEnd());
        int totalCount = _pokemonService.countPokemons();

        return InfoPage.of(pokemons, pagination, totalCount);
    }

    @Override
    public String getLabel(Locale locale) {
        return _language.get(locale, "pokemons-collection-provider");
    }

    @Reference
    private Language _language;

    @Reference
    private PokemonService _pokemonService;
}
