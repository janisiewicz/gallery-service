package pl.com.ergosoft.galleryservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Gallery {
    private int id;
    private List<Object> images;

    public Gallery(int galleryId) {
        this.id = galleryId;
    }
}
