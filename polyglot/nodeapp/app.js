// Example of a minimal Node.js application.

// Uses express for the API.
var express = require('express');
var app = express();

const hostname = '127.0.0.1';
const port = 3000;

// Setup the app.
const server = app.listen(port);

// Common configuration for all API endpoints.
app.use(function (req, res, next) {
  res.header('Content-Type', 'application/json');
  next();
});

// Mimic the Actuator health endpoint.
// This will be invoked from the Sidecar application.
app.get('/actuator/health', function (req, res) {

  // Always UP. Should the Node.js app not answer,
  // the Sidecar will set its status to DOWN.
  res.send('{ "status": "UP" }');
});

// Example endpoint.
app.get('/helloworld', function (req, res) {
  res.send('Hello from the Node.js app!!!');
});

// Start the server.
server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});
