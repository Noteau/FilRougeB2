var express = require('express');
var app = express();

//Page d'accueil
app.get('/', function(req, res){
  res.send({"Message":'Bienvenue sur notre API'});
});

//PARTIE USERS

//Get all users
app.get('/users',function(req,res){
	//récupération des utilisateurs de ldap
	res.send({"Users":'liste des users'});
})

//Get one user
app.get('/users/:id',function(req,res){
	//récupération de l'utilisateur dont l'id correspond
	res.send({"Succes":"200"});
})

//Modify a user
app.put('/users/:name/modify',function(req,res){
	//Création d'un utilisateur dans ldap à faire, en incluant le req.query.orgunit_name en nom de OU et
	//req.query.group_name en nom de group et 
	//var noms = [req.query.new_name,req.query.orgunit_name,req.query.group_name,req.query.is_admin]

	//renvois des informations dans le send de l'utilisateur nouvelle crée
	res.send({"Succes":204});
})

//Create a user
app.post('/users/create',function(req,res){
	//Récuparation du nom, nom d'OU , de groupe et le booléan is_admin dans la requete
	var noms = [req.query.name,req.query.orgunit_name,req.query.group_name,req.query.is_admin]
	//Création de l'utilisateur dans le ldap à faire

	//renvois du status de la requete
	res.send({"succes_code":201})
})



app.listen(3000);