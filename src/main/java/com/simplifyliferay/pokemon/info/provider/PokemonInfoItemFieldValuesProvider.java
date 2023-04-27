package com.simplifyliferay.pokemon.info.provider;

import com.liferay.info.field.InfoField;
import com.liferay.info.field.InfoFieldSet;
import com.liferay.info.field.InfoFieldValue;
import com.liferay.info.field.type.NumberInfoFieldType;
import com.liferay.info.field.type.TextInfoFieldType;
import com.liferay.info.item.InfoItemFieldValues;
import com.liferay.info.item.InfoItemReference;
import com.liferay.info.item.provider.InfoItemFieldValuesProvider;
import com.liferay.info.localized.InfoLocalizedValue;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.template.info.item.provider.TemplateInfoItemFieldSetProvider;
import com.simplifyliferay.pokemon.model.Pokemon;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.propertytypes.ServiceRanking;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@Component(
        immediate = true,
        property = Constants.SERVICE_RANKING + ":Integer=10",
        service = InfoItemFieldValuesProvider.class
)
public class PokemonInfoItemFieldValuesProvider implements InfoItemFieldValuesProvider<Pokemon> {

    @Override
    public InfoFieldValue<Object> getInfoFieldValue(Pokemon pokemon, String fieldName) {
        if (_log.isDebugEnabled())
            _log.debug(MessageFormat.format("fieldName: {0}", fieldName));

        return getInfoItemFieldValues(pokemon).getInfoFieldValue(fieldName);
    }

    @Override
    public InfoItemFieldValues getInfoItemFieldValues(Pokemon pokemon) {
        return InfoItemFieldValues.builder(
        ).infoFieldValues(
                _getPokemonInfoFieldValues(pokemon)
        ).infoFieldValues(
                _templateInfoItemFieldSetProvider.getInfoFieldValues(Pokemon.class.getName(), pokemon)
        ).infoItemReference(
                new InfoItemReference(Pokemon.class.getName(), pokemon.getId())
        ).build();
    }

    private List<InfoFieldValue<Object>> _getPokemonInfoFieldValues(Pokemon pokemon) {
        List<InfoFieldValue<Object>> pokemonFieldValues = new ArrayList<>();

        pokemonFieldValues.add(new InfoFieldValue<>(PokemonInfoItemFields.idInfoField, pokemon.getId()));
        pokemonFieldValues.add(new InfoFieldValue<>(PokemonInfoItemFields.nameInfoField, pokemon.getName()));
        pokemonFieldValues.add(new InfoFieldValue<>(PokemonInfoItemFields.descriptionInfoField, pokemon.getDescription()));
        pokemonFieldValues.add(new InfoFieldValue<>(PokemonInfoItemFields.imageUrlInfoField, pokemon.getImageUrl()));
        pokemonFieldValues.add(new InfoFieldValue<>(PokemonInfoItemFields.imageInfoField, pokemon.getImageUrl()));

        return pokemonFieldValues;
    }

    private static final Log _log = LogFactoryUtil.getLog(PokemonInfoItemFieldValuesProvider.class);

    @Reference
    private TemplateInfoItemFieldSetProvider _templateInfoItemFieldSetProvider;
}
