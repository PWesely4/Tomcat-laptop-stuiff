package moviefan;

public class FavoritesManager {
String favoriteMovie = "Iron Man";
String favoriteActor = "Robert Downey Jr";

public boolean checkFavoriteMovie(String favMovie) {

    return favMovie.equals(favoriteMovie);
}

public boolean checkFavoriteActor(String favActor) {

    return favActor.equals(favoriteActor);
}

}
