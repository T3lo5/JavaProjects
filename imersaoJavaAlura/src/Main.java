import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main( String[] args) throws IOException, InterruptedException {

        // TODO: catch http request and find top movies by best rating
        String url = "https://api.themoviedb.org/3/movie/top_rated?api_key=0e3c0cb6a3e5281e8c12d19a80fed4a4";
        URI uri = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(uri).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

        // TODO: extract movie title, rating, and link to movie page
        var parser = new JsonParser();
        List<Map<String, String>> movies = parser.parse(body);
        System.out.println(movies.size());
        System.out.println(movies.get(0));

        // TODO: create a list of movies
        for (Map<String, String> movie : movies) {
            System.out.println(movie.get("title"));
            Number rating = Float.parseFloat(movie.get("vote_average"));
            System.out.println(movie.get("poster_path"));
        }
    }
}