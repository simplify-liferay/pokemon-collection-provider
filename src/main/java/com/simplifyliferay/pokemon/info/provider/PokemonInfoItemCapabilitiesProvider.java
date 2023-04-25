package com.simplifyliferay.pokemon.info.provider;

import com.liferay.info.exception.NoSuchInfoItemException;
import com.liferay.info.item.capability.InfoItemCapability;
import com.liferay.info.item.provider.InfoItemCapabilitiesProvider;
import com.liferay.info.item.provider.InfoItemObjectProvider;
import com.liferay.layout.page.template.info.item.capability.DisplayPageInfoItemCapability;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.template.info.item.capability.TemplateInfoItemCapability;
import com.simplifyliferay.pokemon.model.Pokemon;
import com.simplifyliferay.pokemon.service.PokemonService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.text.MessageFormat;
import java.util.List;

@Component(
        immediate = true,
        service = InfoItemCapabilitiesProvider.class
)
public class PokemonInfoItemCapabilitiesProvider implements InfoItemCapabilitiesProvider<Pokemon> {

    @Override
    public List<InfoItemCapability> getInfoItemCapabilities() {
        return ListUtil.fromArray(_displayPageInfoItemCapability, _templateInfoItemCapability);
    }

    @Reference
    private DisplayPageInfoItemCapability _displayPageInfoItemCapability;

    @Reference
    private TemplateInfoItemCapability _templateInfoItemCapability;
}
