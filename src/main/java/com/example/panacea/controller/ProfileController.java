package com.example.panacea.controller;
import com.example.panacea.models.Profile;
import com.example.panacea.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "profiles")
@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;
    @GetMapping
    public List<Profile> getAll(){
        return profileService.getProfiles();
    }

    @GetMapping("/{profileId}")
    public Optional<Profile> getById(@PathVariable("profileId")Long profileId){
        return profileService.getProfiles(profileId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Profile profile){
         profileService.saveOrUpdate(profile);
    }

    @DeleteMapping("/{profileId}")
    public void saveUpdate(@PathVariable("profileId") Long profileId){
        profileService.delete(profileId);
    }

}
