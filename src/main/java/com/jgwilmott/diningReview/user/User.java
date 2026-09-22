package com.jgwilmott.diningReview.user;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name="USERS")
public class User {

    @Id
    @GeneratedValue
    @Getter @Setter
    private Long id;

    @Column(name="DISPLAY_NAME", unique = true)
    @Getter @Setter
    private String displayName;

    @Column(name="CITY")
    @Getter @Setter
    private String city;

    @Column(name="STATE")
    @Getter @Setter
    private String state;

    @Column(name="POSTAL_CODE")
    @Getter @Setter
    private String postalCode;

    @Column(name="HAS_PEANUT_ALLERGY")
    @Getter @Setter
    private Boolean hasPeanutAllergy;

    @Column(name="HAS_EGG_ALLERGY")
    @Getter @Setter
    private Boolean hasEggAllergy;

    @Column(name="HAS_DAIRY_ALLERGY")
    @Getter @Setter
    private Boolean hasDairyAllergy;
}
