package com.hackfse.skilltracker.userprofileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackfse.skilltracker.userprofileservice.model.UserProfile;
import com.hackfse.skilltracker.userprofileservice.service.UserProfileService;

@RestController
public class UserProfileController {

	@Autowired
	private UserProfileService profileService;

	@PostMapping(path = "/api/v1/engineer/add-profile", consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserProfile saveProfileAndSkills(@RequestBody UserProfile profile) {
		System.out.println(profile.getAssociateid());
		return profileService.saveProfile(profile);
	}
}
