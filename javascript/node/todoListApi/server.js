import Task from './api/models/todoListModel'
import bodyParser from 'body-parser';
import express from 'express'
import mongoose from 'mongoose';
import routes from './api/routes/todoListRoutes'

const app = express();
const port = process.env.PORT || 3000;

console.log('it worked on port:' + port);

mongoose.Promise = global.Promise;
mongoose.connect('mongodb://localhost/Tododb');


app.use(bodyParser.urlencoded({'extended': true}));
app.use(bodyParser.json());

routes(app);

app.listen(port);

/*
Guide
https://www.codementor.io/
olatundegaruba/nodejs-restful-apis-in-10-minutes-q0sgsfhbd
*/
