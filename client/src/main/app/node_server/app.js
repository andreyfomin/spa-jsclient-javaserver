var express = require('express');
var bodyParser = require('body-parser');
var cors = require('cors');
var app_data = require('./data/jsons');
var app = express();
require('sugar');


app.use(cors());

// parse application/x-www-form-urlencoded
app.use(bodyParser.urlencoded({ extended: false }))

// parse application/json
app.use(bodyParser.json())

// parse application/vnd.api+json as json
app.use(bodyParser.json({ type: 'application/vnd.api+json' }))

// http://localhost:3000/distributor/list
app.get('/distributor/list', function (req, res) {
    res.send(app_data.distributors);
});


// http://localhost:3000/markup_rules/distributor/300/list
app.get('/markup_rules/distributor/:id/list', function (req, res) {
    var distributorId = req.params.id;
    res.send(app_data.markup_rules[distributorId]);
});

// http://localhost:3000/markup_rules/distributor/300/rule/102/subrules/list
app.get('/markup_rules/distributor/:distributorId/rule/:ruleId/subrules/list', function (req, res) {

    if (app_data.subrules[req.params.distributorId] != undefined &&
        app_data.subrules[req.params.distributorId][req.params.ruleId] != undefined)
        res.send(app_data.subrules[req.params.distributorId][req.params.ruleId]);
    else
        res.send([]);
});

// http://localhost:3000/markup_rules/distributor/300/rule/update
app.post('/markup_rules/distributor/:distributorId/rule/update', function(req, res) {
    console.log("distributorId: " + req.params.distributorId);
    console.log("Update Rule: " + JSON.stringify(req.body));
    // ...
});

// http://localhost:3000/products/tenors
app.get('/products/tenors', function (req, res) {
    res.send(app_data.tenors);
});

// http://localhost:3000/customer_floors/traders/300/list
app.get('/customer_floors/traders/:customerFloorId/list', function (req, res) {

	if (app_data.floors[req.params.customerFloorId] != undefined)
		res.send(app_data.floors[req.params.customerFloorId].traders);
	else
		res.send([]);
});

var server = app.listen(3000, function () {

    var host = server.address().address;
    var port = server.address().port;

    console.log('Example app listening at http://%s:%s', host, port);
});