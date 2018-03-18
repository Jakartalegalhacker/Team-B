package hendrawd.smartrds.network;

import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * @author hendrawd on 7/30/17
 */

public interface AppService {

    @POST("movie/{category}")
    Call<MovieResponse> getMovies(@Path("category") String category);

    // @GET("movie/{movie_id}/reviews?language=en-US&page=1")
    // Call<ReviewResponse> getReviews(@Path("movie_id") Integer movieId);
    //
    // @GET("movie/{movie_id}/videos")
    // Call<VideoResponse> getVideos(@Path("movie_id") Integer movieId);
}
