package com.flowbulgaria.flow.controllers.rest;

import com.flowbulgaria.flow.models.Campaign;
import com.flowbulgaria.flow.services.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {

    private CampaignService campaignService;

    @Autowired
    public CampaignController (CampaignService service) {
        this.campaignService = service;
    }

    @PostMapping
    public Campaign create(@RequestBody Campaign campaign) {
        return null;
        //campaignService.create(campaign);
    }

}
