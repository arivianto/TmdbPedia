package indo.dev.tmdbpedia;

/**
 * Created by User on 29-Oct-18.
 */

public class Movies {
    private String title;

    private String overview;

    private String release;

    private String vote;

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease_date(String release) {
        this.release = release;
    }

    public String vote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    private String poster_path;
}
