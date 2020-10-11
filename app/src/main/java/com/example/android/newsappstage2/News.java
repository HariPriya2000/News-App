package com.example.android.newsappstage2;

import java.util.ArrayList;

class News {
    private String Title;
    private String Section;
    private String WebPublicationDateAndTime;
    private String WebUrl;
    private String Thumbnail;
    private ArrayList<String> Authors;

    News(String title, String section, String webPublicationDateAndTime, String webUrl, String thumbnail, ArrayList<String> authors) {
        this.Title = title;
        this.Section = section;
        this.WebPublicationDateAndTime = webPublicationDateAndTime;
        this.WebUrl = webUrl;
        this.Thumbnail = thumbnail;
        this.Authors = authors;
    }

    String getTitle() {
        return Title;
    }

    String getSection() {
        return Section;
    }

    String getWebPublicationDateAndTime() {
        return WebPublicationDateAndTime;
    }

    String getWebUrl() {
        return WebUrl;
    }

    String getThumbnail() {
        return Thumbnail;
    }

    ArrayList<String> getAuthors() {
        return Authors;
    }
}
