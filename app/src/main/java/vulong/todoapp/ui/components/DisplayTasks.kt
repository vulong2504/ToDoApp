package vulong.todoapp.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import vulong.todoapp.data.models.ToDoTask
import vulong.todoapp.ui.theme.LARGE_PADDING
import vulong.todoapp.ui.theme.PRIORITY_INDICATOR_SIZE
import vulong.todoapp.ui.theme.taskItemTextColor


@Composable
fun DisplayTasks(
    toDoTasks: List<ToDoTask>,
    navigate: (taskId: Int) -> Unit,
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        itemsIndexed(
            items = toDoTasks,
            itemContent = { index, task ->
                TaskItem(
                    taskIndex = index,
                    toDoTask = task,
                    navigate = navigate
                )
                Divider()
            },
        )
    }
}

@Composable
fun TaskItem(
    taskIndex: Int,
    toDoTask: ToDoTask,
    navigate: (taskId: Int) -> Unit,
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(
                onClick = {
                    navigate(taskIndex)
                }
            ),
//        color = MaterialTheme.colors.taskItemBackgroundColor,
        shape = RectangleShape,
        elevation = 0.dp,
    ) {
        Column(
            modifier = Modifier
                .padding(LARGE_PADDING)
                .fillMaxWidth(),
        ) {
            Row() {
                Text(
                    modifier = Modifier.weight(8f),
                    text = toDoTask.title,
                    color = MaterialTheme.colors.taskItemTextColor,
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                )
                Box(
                    modifier = Modifier.weight(1f),
                ) {
                    Canvas(
                        modifier = Modifier
                            .size(PRIORITY_INDICATOR_SIZE)
                            .align(Alignment.TopEnd),
                        onDraw = {
                            drawCircle(color = toDoTask.priority.color)
                        },
                    )
                }
            }
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = toDoTask.description,
                color = MaterialTheme.colors.taskItemTextColor,
                style = MaterialTheme.typography.subtitle1,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}