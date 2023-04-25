package com.simplifyliferay.pokemon.info.provider;

import com.liferay.info.exception.NoSuchInfoItemException;
import com.liferay.info.form.InfoForm;
import com.liferay.info.item.provider.InfoItemFormProvider;
import com.liferay.info.item.provider.InfoItemObjectProvider;
import com.liferay.info.localized.InfoLocalizedValue;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.simplifyliferay.pokemon.model.Pokemon;
import com.simplifyliferay.pokemon.service.PokemonService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Set;

@Component(
        immediate = true,
        property = "service.ranking:Integer=100",
        service = InfoItemObjectProvider.class
)
public class PokemonInfoItemObjectProvider implements InfoItemObjectProvider<Pokemon> {

    @Override
    public Pokemon getInfoItem(long pokemonId) throws NoSuchInfoItemException {
        if (_log.isDebugEnabled())
            _log.debug(MessageFormat.format("getInfoItem {0}", Long.toString(pokemonId)));

        return _pokemonService.fetchPokemon(pokemonId);
    }

    private static final Log _log = LogFactoryUtil.getLog(PokemonInfoItemObjectProvider.class);

    @Reference
    private PokemonService _pokemonService;
}
