package com.simplifyliferay.pokemon.info.provider;

import com.liferay.info.field.InfoField;
import com.liferay.info.field.InfoFieldSet;
import com.liferay.info.field.type.NumberInfoFieldType;
import com.liferay.info.field.type.TextInfoFieldType;
import com.liferay.info.localized.InfoLocalizedValue;
import com.simplifyliferay.pokemon.model.Pokemon;
import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        service = PokemonInfoItemFieldSetProvider.class
)
public class PokemonInfoItemFieldSetProvider {

    public InfoFieldSet getInfoFieldSet() {
        return InfoFieldSet.builder()
                .infoFieldSetEntry(PokemonInfoItemFields.idInfoField)
                .infoFieldSetEntry(PokemonInfoItemFields.nameInfoField)
                .infoFieldSetEntry(PokemonInfoItemFields.descriptionInfoField)
                .labelInfoLocalizedValue(InfoLocalizedValue.localize(getClass(), "pokemon"))
                .name("pokemon")
                .build();
    }
}
