package br.com.movieflix.controller.request;

import br.com.movieflix.entity.Category;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;
import java.util.List;

public record MovieRequest(@NotEmpty(message = "O nome do filme é obrigatorio!") String title,
                           String description,

                           @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
                           LocalDate releaseDate,

                           double rating,
                           List<Long> categories,
                           List<Long> streamings) {
}
