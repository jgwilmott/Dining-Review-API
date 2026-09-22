package com.jgwilmott.diningReview.review;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;


@Entity
@Table(name="REVIEWS")
public class Review {
    @Id
    @GeneratedValue
    @Getter @Setter
    private Long id;

    @Column(name="USER")
    @Getter @Setter
    private String user;

    @Column(name="RESTAURANT_ID")
    @Getter @Setter
    private Long restaurantId;

    @Column(name="PEANUT_SCORE")
    @Min(1) @Max(5)
    @Getter @Setter
    private Integer peanutScore;

    @Column(name="EGG_SCORE")
    @Min(1) @Max(5)
    @Getter @Setter
    private Integer eggScore;

    @Column(name="DAIRY_SCORE")
    @Min(1) @Max(5)
    @Getter @Setter
    private Integer dairyScore;

    @Column(name="COMMENTS")
    @Getter @Setter
    private String comments;
}
