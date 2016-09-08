package com.xyw55.annotationDemo2;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiayiwei on 16/9/8.
 */
public class MovieRecommeder {

    @Autowired
    @Genre("Action")
    private MovieCatalog actionMovieCatalog;
    private MovieCatalog comedyMovieCatalog;

    @Autowired
    public void setComedyMovieCatalog(@Genre("Comedy") MovieCatalog comedyMovieCatalog) {
        this.comedyMovieCatalog = comedyMovieCatalog;
    }

    public MovieCatalog getActionMovieCatalog() {
        return actionMovieCatalog;
    }

    public MovieCatalog getComedyMovieCatalog() {
        return comedyMovieCatalog;
    }
}
