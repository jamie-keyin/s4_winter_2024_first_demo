package com.keyin.blood.donor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "donor", path = "donor")
public interface DonorRESTAPI extends JpaRepository<Donor, Long> {
    public List<Donor> findDonorsByLastName(@RequestParam("lastName") String lastName);
}