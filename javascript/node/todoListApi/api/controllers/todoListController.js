import mongoose from 'mongoose';

const Task = mongoose.model('Tasks');

const listAllTasks = (req, res) => {
  Task.find({}, (err, task) => {
    if (err) {
      res.send(err);
    }
    res.json(task)
  })
}

const createTask = (req, res) => {
  const newTask = new Task(req.body);

  newTask.save((err, task) => {
    if (err) {
      res.send(err);
    }
    res.json(task);
  })
}

const readTask = (req, res) => {
  Task.remove(
    {'_id': req.params.taskId},
    (err, task) => {
      if (err) {
        res.send(err);
      }
      res.json(task)
    }
  )
}

const updateTask = (req, res) => {
  Task.findOneAndUpdate(
    {'_id': req.params.taskId},
    req.body,
    {'new': true},
    (err, task) => {
      if (err) {
        res.send(err)
      }
      res.json(task)
    }
  )
}

const deleteTask = (req, res) => {
  Task.remove(
    {'_id': req.params.taskId},
    (err, task) => {
      if (err) {
        res.send(err);
      }
      res.json({
        'message': 'Task successfully deleted',
        task
      })
    }
  )
}

export {
  createTask,
  deleteTask,
  listAllTasks,
  readTask,
  updateTask
}
