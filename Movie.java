package Project2021;

public class Movie {

    private String title;
    private String genere;
    private int duration;
    private String director;

    public Movie(String title, String genere, int duration, String director){
        this.title=title;
        this.genere=genere;
        this.duration=duration;
        this.director=director;
    }

    public String getTitle(){
        return title;
    }

    public String getGenere(){
        return genere;
    }
    public int getduration(){
        return duration;
    }
    public String getDirector(){
        return director;
    }
    public void  setTitle(String title){
        this.title=title;
    }
    public void setGenere(String genere){
        this.genere=genere;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    public void setDirectore(String director){
        this.director=director;
    }

}