package vulong.todoapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lvulong/todoapp/util/Constants;", "", "()V", "DATABASE_NAME", "", "DATABASE_TABLE", "LIST_ARGUMENT_KEY", "LIST_SCREEN", "TASK_ARGUMENT_KEY", "TASK_SCREEN", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final vulong.todoapp.util.Constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_TABLE = "todo_table";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "todo_database";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIST_SCREEN = "list/{action}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TASK_SCREEN = "task/{taskId}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIST_ARGUMENT_KEY = "action";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TASK_ARGUMENT_KEY = "taskId";
    
    private Constants() {
        super();
    }
}