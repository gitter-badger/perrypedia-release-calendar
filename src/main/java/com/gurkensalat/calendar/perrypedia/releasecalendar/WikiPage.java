package com.gurkensalat.calendar.perrypedia.releasecalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WikiPage
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public WikiPage()
    {
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }
}
