package testsample.altvr.com.testsample;

import retrofit.Callback;

import retrofit.http.GET;
import retrofit.http.Query;
import testsample.altvr.com.testsample.vo.PhotoResponseVo;

public interface PixabayRetrofitService {

    @GET("/api")
    void getDefaultPhotos(@Query("key") String key, @Query("min_width") int minWidth, @Query("min_height") int minHeight, @Query("image_type") String imageType, Callback<PhotoResponseVo> callback);

    @GET("/api")
    void searchPhotos(@Query("key") String key, @Query("q") String searchString, @Query("min_width") int minWidth, @Query("min_height") int minHeight, @Query("image_type") String imageType, Callback<PhotoResponseVo> callback);

}
