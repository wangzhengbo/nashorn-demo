if ((typeof console === 'undefined') && (typeof print !== 'undefined')) {
	console = {
		debug: print,
		log: print,
		warn: print,
		error: print
	}
}

//var hello = require('./src/main/resources/simple/my-module');
var hello = null;
try {
	hello = require('./my-module');
} catch(e) {
	hello = require('./src/main/resources/simple/my-module');
}
	
hello('Bob!');
