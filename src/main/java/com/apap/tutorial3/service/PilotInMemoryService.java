package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.apap.tutorial3.model.PilotModel;
import org.springframework.stereotype.Service;

@Service
public class PilotInMemoryService implements PilotService {
	private List<PilotModel> archivePilot;
	
	public PilotInMemoryService() {
		archivePilot = new ArrayList<>();
	}

	@Override
	public void addPilot(PilotModel pilot) {
		archivePilot.add(pilot);
	}
	
	@Override
	public List<PilotModel> getPilotList() {
		return archivePilot;
	}
	
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		PilotModel pilot = null;
		for(PilotModel p : archivePilot) {
			if(p.getLicenseNumber().equals(licenseNumber)) {
				pilot = p;
			}
		}
		return pilot;
	}
}
