package at.ac.fh_kufstein.uebung_04;

import java.util.Date;

public class Paperbook extends Book
{   //referenzvariable
    private String series;
    private String month;


    public Paperbook(int pages, Date released, String title, String series, String month)
    {   //greife hier auf die variablen der vererbten klasse zu
        super(pages, released, title, "0000-000000-0000"); //jedes buch hat dieselbe isbn deshalb hier definiert

        //greife auf neue Referenzvariablen zu
        this.series=series;
        this.month=month;

    }


    //getter und setter der neuen Variablen
    public String getSeries()
    {
        return series;
    }

    public void setSeries(String series)
    {
        this.series = series;
    }

    public String getMonth()
    {
        return month;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }
}
