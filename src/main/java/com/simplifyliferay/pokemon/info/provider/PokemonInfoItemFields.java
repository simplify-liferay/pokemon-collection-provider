package com.simplifyliferay.pokemon.info.provider;

import com.liferay.info.field.InfoField;
import com.liferay.info.field.type.ImageInfoFieldType;
import com.liferay.info.field.type.NumberInfoFieldType;
import com.liferay.info.field.type.TextInfoFieldType;
import com.liferay.info.field.type.URLInfoFieldType;
import com.liferay.info.localized.InfoLocalizedValue;
import com.simplifyliferay.pokemon.model.Pokemon;

public class PokemonInfoItemFields {

    public static final InfoField<NumberInfoFieldType> idInfoField =
            InfoField.builder(Pokemon.class.getName())
                    .infoFieldType(NumberInfoFieldType.INSTANCE)
                    .name("id")
                    .labelInfoLocalizedValue(InfoLocalizedValue.localize(PokemonInfoItemFields.class, "id"))
                    .build();

    public static final InfoField<TextInfoFieldType> nameInfoField =
            InfoField.builder(Pokemon.class.getName())
                    .infoFieldType(TextInfoFieldType.INSTANCE)
                    .name("name")
                    .labelInfoLocalizedValue(InfoLocalizedValue.localize(PokemonInfoItemFields.class, "name"))
                    .build();

    public static final InfoField<TextInfoFieldType> descriptionInfoField =
            InfoField.builder(Pokemon.class.getName())
                    .infoFieldType(TextInfoFieldType.INSTANCE)
                    .name("description")
                    .labelInfoLocalizedValue(InfoLocalizedValue.localize(PokemonInfoItemFields.class, "description"))
                    .build();

    public static final InfoField<URLInfoFieldType> imageUrlInfoField =
            InfoField.builder(Pokemon.class.getName())
                    .infoFieldType(URLInfoFieldType.INSTANCE)
                    .name("imageUrl")
                    .labelInfoLocalizedValue(InfoLocalizedValue.localize(PokemonInfoItemFields.class, "imageUrl"))
                    .build();

    public static final InfoField<ImageInfoFieldType> imageInfoField =
            InfoField.builder(Pokemon.class.getName())
                    .infoFieldType(ImageInfoFieldType.INSTANCE)
                    .name("image")
                    .labelInfoLocalizedValue(InfoLocalizedValue.localize(PokemonInfoItemFields.class, "image"))
                    .build();
}
