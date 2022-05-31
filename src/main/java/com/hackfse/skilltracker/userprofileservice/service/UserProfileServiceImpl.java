package com.hackfse.skilltracker.userprofileservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackfse.skilltracker.userprofileservice.dao.UserProfileRepository;
import com.hackfse.skilltracker.userprofileservice.model.UserProfile;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	UserProfileRepository userProfileRepository;

	@Override
	public UserProfile saveProfile(UserProfile profile) {
		profile.getListOfUserNonTechnicalSkill().forEach(nonTechSkill->nonTechSkill.setUserProfile(profile));
		profile.getListOfUserTechnicalSkill().forEach(techSkill->techSkill.setUserProfile(profile));
		return userProfileRepository.save(profile);
	}

}
