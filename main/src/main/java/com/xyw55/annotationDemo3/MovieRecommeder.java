package com.xyw55.annotationDemo3;

import com.xyw55.annotationDemo2.Genre;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiayiwei on 16/9/8.
 */
public class MovieRecommeder {
    @Autowired
    @MovieQualifier(genre = "Action", format = Format.VHS)
    private MovieCatalog actionMovieCatalog;


    @Autowired
    @MovieQualifier(genre = "Comedy", format = Format.VHS)
    private MovieCatalog comedyMovieCatalog;

    @Autowired
    @MovieQualifier(genre = "Action", format = Format.DVD)
    private MovieCatalog actionDVDCatalog;

    @Autowired
    @MovieQualifier(genre = "Comedy", format = Format.BLUERAY)
    private MovieCatalog comedyBlueRayCatalog;


    public void show() {
        if (null != actionMovieCatalog) {
            System.out.println(actionMovieCatalog.getCate());
        }
        if (null != actionDVDCatalog) {
            System.out.println(actionDVDCatalog.getCate());
        }

        if (null != comedyMovieCatalog) {
            System.out.println(comedyMovieCatalog.getCate());
        }
        if (null != comedyBlueRayCatalog) {
            System.out.println(comedyBlueRayCatalog.getCate());
        }
    }
}
