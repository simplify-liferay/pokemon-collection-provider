package com.simplifyliferay.pokemon.info.provider;

import com.liferay.info.field.InfoFieldSet;
import com.liferay.info.form.InfoForm;
import com.liferay.info.item.provider.InfoItemFormProvider;
import com.liferay.info.localized.InfoLocalizedValue;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.simplifyliferay.pokemon.model.Pokemon;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Locale;
import java.util.Set;

@Component(
        immediate = true,
        service = InfoItemFormProvider.class
)
public class PokemonInfoItemFormProvider implements InfoItemFormProvider<Pokemon> {

    @Override
    public InfoForm getInfoForm() {
        Set<Locale> availableLocales = LanguageUtil.getAvailableLocales();

        InfoLocalizedValue.Builder infoLocalizedValueBuilder = InfoLocalizedValue.builder();

        for (Locale locale : availableLocales) {
            infoLocalizedValueBuilder.value(
                    locale,
                    ResourceActionsUtil.getModelResource(locale, Pokemon.class.getName())
            );
        }

        return InfoForm.builder(
        ).infoFieldSetEntry(
                _pokemonInfoItemFieldSetProvider.getInfoFieldSet()
        ).labelInfoLocalizedValue(
                infoLocalizedValueBuilder.build()
        ).name(
                Pokemon.class.getName()
        ).build();
    }

    @Reference
    private PokemonInfoItemFieldSetProvider _pokemonInfoItemFieldSetProvider;
}
