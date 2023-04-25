package com.simplifyliferay.pokemon.info.provider;

import com.liferay.info.item.InfoItemClassDetails;
import com.liferay.info.item.InfoItemDetails;
import com.liferay.info.item.InfoItemReference;
import com.liferay.info.item.provider.InfoItemDetailsProvider;


import com.simplifyliferay.pokemon.model.Pokemon;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;


@Component(
		immediate = true,
		property = Constants.SERVICE_RANKING + ":Integer=10",
		service = InfoItemDetailsProvider.class
)
public class PokemonInfoItemDetailsProvider
	implements InfoItemDetailsProvider<Pokemon> {

	@Override
	public InfoItemClassDetails getInfoItemClassDetails() {
		return new InfoItemClassDetails(Pokemon.class.getName());
	}

	@Override
	public InfoItemDetails getInfoItemDetails(Pokemon pokemon) {
		return new InfoItemDetails(
			getInfoItemClassDetails(),
			new InfoItemReference(
				Pokemon.class.getName(),
				pokemon.getId()));
	}

}