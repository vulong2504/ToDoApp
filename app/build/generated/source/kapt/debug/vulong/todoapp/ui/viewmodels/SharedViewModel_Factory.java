// Generated by Dagger (https://dagger.dev).
package vulong.todoapp.ui.viewmodels;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import vulong.todoapp.data.repositories.ToDoRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedViewModel_Factory implements Factory<SharedViewModel> {
  private final Provider<ToDoRepository> repositoryProvider;

  private final Provider<Context> contextProvider;

  public SharedViewModel_Factory(Provider<ToDoRepository> repositoryProvider,
      Provider<Context> contextProvider) {
    this.repositoryProvider = repositoryProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedViewModel get() {
    return newInstance(repositoryProvider.get(), contextProvider.get());
  }

  public static SharedViewModel_Factory create(Provider<ToDoRepository> repositoryProvider,
      Provider<Context> contextProvider) {
    return new SharedViewModel_Factory(repositoryProvider, contextProvider);
  }

  public static SharedViewModel newInstance(ToDoRepository repository, Context context) {
    return new SharedViewModel(repository, context);
  }
}
