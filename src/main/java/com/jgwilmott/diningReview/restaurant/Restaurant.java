package com.jgwilmott.diningReview.restaurant;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name="RESTAURANTS")
public class Restaurant {

    @Id
    @GeneratedValue
    @Getter @Setter
    private Long id;

    @Column(name="NAME")
    @Getter @Setter
    private String name;

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

    @Column(name="OVERALL_SCORE")
    @Min(1) @Max(5)
    @Getter
    private Double overallScore;

    public void setOverallScore() {
        List<Integer> allergyScores = Arrays.asList(
                peanutScore,
                eggScore,
                dairyScore
        );
        int total = 0;
        int count = 0;
        for (Integer score: allergyScores) {
            if (score != null) {
                total += score;
                count++;
            }
        }
        this.overallScore = (count > 0) ? (total / count) : 0.0;
    }
}
