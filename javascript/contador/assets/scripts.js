let count = 0;

var CURRENT_NUMBER = document.getElementById('currentNumber');

function increment() {
	count++;
	CURRENT_NUMBER.innerHTML = count;
	
	// testes
	
	if (count === 10) {
		alert("Limite atingido")
			
	}
}
function decrement() {
	count--;
	CURRENT_NUMBER.innerHTML = count;
	if (count < 0) {		
		document.body.style.backgroundColor = 'Red'
	}
}

function test() {
	kdowkdpo;
}