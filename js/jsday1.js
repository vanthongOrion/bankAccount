function caculateAge(yearBorn) {
	var dateTime = new Date();
	var currentYear = dateTime.getFullYear();
	return currentYear - yearBorn;
}

var name = prompt("What is your name?:")
var yearBorn = prompt("When were you born?:");
var age;
age = caculateAge(yearBorn);
console.log(name + " is " + age + " years old.");

var message = "";
if (age < 15) {
	message += "And you are";
	var i=0;
	while (i<5) {
		message += " very";
		i++;
	} message += " young."
	if ((age <= 10) && (age >= 2)) {
		message = "And you are a kid!";
	}
} else if (age < 50) {
	message = "And you are young.";
} else {
	message = "And you are over 50 years old."
}
console.log(message);

var genDer = prompt("Are you male? (male/female): ")
var reply;
switch (genDer) {
	case "male":
		reply = "You are a man.";
		break;
	case "female":
		reply = "You are a woman";
		break;
	default:
		reply = "Wrong input";
}
console.log(reply);

var isClose = confirm("Do you want to close current page?")
var reply = "";
if (isClose) {
	for (var i = 0; i < 5; i++) {
		reply += " Bye";
	}
} else {
	reply += "Thanks you for staying with you!";
}
console.log(reply)