package hendrawd.smartrds.network;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Interceptor yang digunakan untuk menambahkan API KEY secara dynamic saat request
 *
 * @author hendrawd on 7/31/17
 */

public class AccessTokenAdderInterceptor implements Interceptor {
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        final HttpUrl url = chain.request()
                .url()
                .newBuilder()
                .addQueryParameter("access_token", "URUPKZ3CfBnMtksywIEmoDCIBKqYoWq9Op1cdAn4E5fo7yhJVPmH6zVvwhgrthtW")
                .build();
        final Request request = chain.request().newBuilder().url(url).build();
        return chain.proceed(request);
    }
}
