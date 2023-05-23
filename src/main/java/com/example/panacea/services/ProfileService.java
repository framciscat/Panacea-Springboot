package com.example.panacea.services;

import com.example.panacea.models.Profile;
import com.example.panacea.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    public List<Profile> getProfiles(){
        return  profileRepository.findAll();
    }

    public Optional<Profile> getProfiles(Long id){
        return  profileRepository.findById(id);
    }

    public void saveOrUpdate(Profile profile){
        profileRepository.save(profile);
    }

    public void delete(Long id){
        profileRepository.deleteById(id);
    }


}
