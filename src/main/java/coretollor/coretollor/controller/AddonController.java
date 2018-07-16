package coretollor.coretollor.controller;

import coretollor.coretollor.model.AddonModel;
import coretollor.coretollor.service.AddonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/addon")
public class AddonController {

    private  final AddonService addonService;

    public AddonController(AddonService addonService) {
        this.addonService = addonService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<AddonModel> addAddon(@RequestBody AddonModel addonModel){
        addonService.addAddon(addonModel);
        return new ResponseEntity<>(addonModel, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<List<AddonModel>> getAllAddons() {
        return new ResponseEntity<>(addonService.getAllAddons(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{addonId}", method = RequestMethod.DELETE)
    private ResponseEntity deleteAddonById(@PathVariable("addonId") Long id) {
        addonService.deleteAddon(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    private ResponseEntity<AddonModel> updateAddon(@RequestBody AddonModel addonModel) {
        return new ResponseEntity<>(new AddonModel(addonService.updateAddon(addonModel)), HttpStatus.OK);
    }





}
