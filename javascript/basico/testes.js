// testes estruturas js

function returnEvenValues(array) {
    let evenNums = [];
    for (let i = 0; i < array.length; i++) {
        if (array[i] % 2 === 0) {
            evenNums.push(array[i]);
        } else {
            console.log(`${array[i]} não é par`);
        }
    }  
    
}
let array = [1, 2, 4, 8, 9, 13, 17, 22, 30, 33];

returnEvenValues(array);


