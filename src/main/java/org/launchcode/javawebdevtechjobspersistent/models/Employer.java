package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    public String location;

    @OneToMany(mappedBy = "employer")
    private final List<Job> jobs = new ArrayList<>();

    public Employer(@NotBlank String location) {
        this.location = location;
    }

    public Employer() {};

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
