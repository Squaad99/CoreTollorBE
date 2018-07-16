package coretollor.coretollor.service;

import coretollor.coretollor.entity.Addon;
import coretollor.coretollor.entity.Product;
import coretollor.coretollor.model.AddonModel;
import coretollor.coretollor.model.ProductModel;
import coretollor.coretollor.repository.AddonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddonService {

    private final AddonRepository addonRepository;

    @Autowired
    public AddonService(AddonRepository addonRepository) {
        this.addonRepository = addonRepository;
    }

    public AddonModel addAddon(AddonModel addonModel){
        Addon newAddon = addonRepository.save(new Addon(addonModel));
        return new AddonModel(addonModel);
    }

    public void deleteAddon(Long id){
        addonRepository.deleteById(id);
    }

    public List<AddonModel> getAllAddons(){
        List<Addon> addons = addonRepository.findAll();
        List<AddonModel> addonModels = new ArrayList<>();
        for(Addon adddon: addons) {
            addonModels.add(new AddonModel(adddon));
        }
        return addonModels;
    }

    public Addon updateAddon(AddonModel addonModel) {
        Addon addon = addonRepository.findById(addonModel.getId()).get();

        addon.setBaseP(addonModel.getBaseP());
        addon.setBaseM(addonModel.getBaseM());
        addon.setCompartmentP(addonModel.getCompartmentP());
        addon.setCompartmentM(addonModel.getCompartmentM());
        return addonRepository.save(addon);
    }
}