package com.fms.sds_movie.dto;

import java.io.Serializable;

import com.fms.sds_movie.entities.Movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class MovieDTO implements Serializable {

    private Long id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public MovieDTO(Movie entity){
        id = entity.getId();
        score = entity.getScore();
        count = entity.getCount();
        image = entity.getImage();
        title = entity.getTitle();
    }
}
