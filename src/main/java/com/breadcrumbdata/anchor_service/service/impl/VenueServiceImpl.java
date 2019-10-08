package com.breadcrumbdata.anchor_service.service.impl;

import com.breadcrumbdata.anchor_service.dataobject.OrganizationVenue;
import com.breadcrumbdata.anchor_service.dataobject.Venue;
import com.breadcrumbdata.anchor_service.repository.OrganizationVenueRepository;
import com.breadcrumbdata.anchor_service.repository.VenueRepository;
import com.breadcrumbdata.anchor_service.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VenueServiceImpl implements VenueService{

    @Autowired
    private VenueRepository venueRepository;

    @Autowired
    private OrganizationVenueRepository organizationVenueRepository;

    @Override
    public List<Venue> findVenuesByOrganizationId(Integer organizationId) {
        List<OrganizationVenue> organizationVenueList = organizationVenueRepository.findByOrganizationId(organizationId);
        List<Venue> venueList = new ArrayList<>();
        for (OrganizationVenue organizationVenue : organizationVenueList) {
            Venue venue = venueRepository.findVenueById(organizationVenue.getVenueId());
            venueList.add(venue);
        }
        return venueList;
    }

    @Override
    public Venue create(String name, Integer organizationId) {
        Venue venue = new Venue();
        venue.setName(name);
        Venue savedVenue = venueRepository.save(venue);
        OrganizationVenue organizationVenue = new OrganizationVenue();
        organizationVenue.setOrganizationId(organizationId);
        organizationVenue.setVenueId(savedVenue.getId());
        organizationVenueRepository.save(organizationVenue);
        return savedVenue;
    }
}
