package com.fms.sds_movie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ScoreDTO {

    private Long movieId;
    private String email;
    private Double score;
}
