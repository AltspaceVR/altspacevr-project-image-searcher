package testsample.altvr.com.testsample;

import android.content.Context;

import retrofit.ErrorHandler;
import retrofit.RetrofitError;
import retrofit.converter.JacksonConverter;
import retrofit.RestAdapter;
import testsample.altvr.com.testsample.util.LogUtil;
import testsample.altvr.com.testsample.vo.ApiErrorVo;

import java.util.HashMap;


public class RetrofitAdapter {
    private static LogUtil log = new LogUtil(RetrofitAdapter.class.getSimpleName());

    private static String API_ENDPOINT_URL = "https://pixabay.com";
    private static String API_KEY = "2387134-2e9952af7d840c1d7abc947b1";

    public static PixabayRetrofitService getRestService(Context context) {
        JacksonConverter converter = new JacksonConverter();
        return new RestAdapter.Builder()
                .setEndpoint(API_ENDPOINT_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setConverter(converter)
                .setErrorHandler(new RetrofitErrorHandler(context))
                .build()
                .create(PixabayRetrofitService.class);
    }

    private static class RetrofitErrorHandler implements ErrorHandler {

        private Context mContext;
        public RetrofitErrorHandler(Context context) {
            mContext = context;
        }

        @Override
        public Throwable handleError(RetrofitError cause) {
            log.e(cause.getCause(), "handleError", "kind=" + cause.getKind());
            String errorDescription;

            if (cause.getKind() == RetrofitError.Kind.NETWORK) {
                errorDescription = mContext.getString(R.string.network_error);
            } else {
                if (cause.getResponse() == null) {
                    errorDescription = mContext.getString(R.string.no_response_error);
                } else {
                    try {
                        ApiErrorVo error = (ApiErrorVo) cause.getBodyAs(ApiErrorVo.class);

                        if (error.error != null) {
                            errorDescription = error.error;
                        } else {
                            errorDescription = getFirstKey(error.errors) + " " + getFirstValue(error.errors); // Display first error to user. They will fix it, then they can fix the next one the next time.
                        }
                    } catch (Exception e) {
                        try {
                            errorDescription = mContext.getString(R.string.network_http_error, cause.getResponse().getStatus());
                        } catch (Exception network_http_error) {
                            errorDescription = mContext.getString(R.string.unknown_error);
                        }
                    }
                }
            }

            return new Error(errorDescription);
        }
    }

    private static String getFirstKey(HashMap<String, String[]> hashMap) {
        return hashMap.entrySet().iterator().next().getKey();
    }

    private static String getFirstValue(HashMap<String, String[]> hashMap) {
        return hashMap.entrySet().iterator().next().getValue()[0];
    }
}




