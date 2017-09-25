import {
  createTask,
  deleteTask,
  listAllTasks,
  readTask,
  updateTask
} from '../controllers/todoListController';

export default function (app) {

  app.route('/tasks')
    .get(listAllTasks)
    .post(createTask);

  app.route('/tasks/:taskId')
    .get(readTask)
    .put(updateTask)
    .delete(deleteTask);

}
