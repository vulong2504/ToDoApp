// Generated by Dagger (https://dagger.dev).
package vulong.todoapp.data.repositories;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataStoreRepository_Factory implements Factory<DataStoreRepository> {
  private final Provider<Context> contextProvider;

  public DataStoreRepository_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DataStoreRepository get() {
    return newInstance(contextProvider.get());
  }

  public static DataStoreRepository_Factory create(Provider<Context> contextProvider) {
    return new DataStoreRepository_Factory(contextProvider);
  }

  public static DataStoreRepository newInstance(Context context) {
    return new DataStoreRepository(context);
  }
}
