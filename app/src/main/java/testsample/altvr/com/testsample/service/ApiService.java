package testsample.altvr.com.testsample.service;

import android.content.Context;

import org.greenrobot.eventbus.EventBus;

import testsample.altvr.com.testsample.RetrofitAdapter;
import testsample.altvr.com.testsample.PixabayRetrofitService;
import testsample.altvr.com.testsample.util.LogUtil;

public class ApiService {
    private LogUtil log = new LogUtil(ApiService.class);
    private static String PIXABAY_API_KEY = "2387134-2e9952af7d840c1d7abc947b1";
    private static int MIN_IMAGE_WIDTH = 1000;
    private static int MIN_IMAGE_HEIGHT = 1000;
    private static String IMAGE_TYPE = "photo";

    private PixabayRetrofitService mService;
    private EventBus mEventBus;

    public ApiService(Context context) {
        mService = RetrofitAdapter.getRestService(context);
        mEventBus = EventBus.getDefault();
    }

    /**
     * YOUR CODE HERE
     *
     * For part 1a, you should implement getDefaultPhotos and searchPhotos. These calls should make the proper
     * API calls to Pixabay and post PhotosEvents to the event bus for the fragments to fill themselves in.
     *
     * We provide a Retrofit API adapter here you can use, or you can roll your own using the HTTP library
     * of your choice.
     */
}
