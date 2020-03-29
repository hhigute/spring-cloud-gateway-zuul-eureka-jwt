use Authorization

// create user/pass to be used during authentication (email@email.com / password)
db.user.insertOne( {
	"_id" : ObjectId("5e7c3465a6e89602435af543"),
	"email" : "email@email.com",
	"password" : "$2a$12$7yDXb27mnkm9Je5QBOg3COkJpqrsVmgtzzGW6f4lFhYKR93DciYFi",
	"name" : "nameee",
	"lastName" : "last",
	"active" : 1,
	"isLoacked" : false,
	"isExpired" : false,
	"isEnabled" : true,
	"role" : [
		{
			"_id" : 1,
			"role" : "ADMIN"
		}
	],
	"_class" : "com.h3b.investment.gateway.bean.auth.User"
} )