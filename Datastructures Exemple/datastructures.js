//forEach 
/*
o explain the syntax, the forEach() method accepts a function that will work on each array item. 
That function's first parameter is the current array item itself, and the second (optional) parameter is the index.
*/
const fruits = ['kiwi','mango','apple','pear'];
function appendIndex(fruit, index) {
    console.log(`${index}. ${fruit}`)
}
fruits.forEach(appendIndex);
console.log("---------");
const veggies = ['onion', 'garlic', 'potato'];
veggies.forEach( function(veggie, index) {
    console.log(`${index}. ${veggie}`);
});
console.log("----------");
//filter
/*Another very useful method on the array is the filter() method.
 It filters your arrays based on a specific test. Those array items that pass the test are returned.
*/const nums = [0,10,20,30,40,50];
let result = nums.filter( function(num) {
    return num > 20;
})
console.log(result);
// map
/*
Finally, there's a very useful map method. 
This method is used to map each array item over to another array's item, 
based on whatever work is performed inside the function that is passed-in to the map as a parameter.
*/
console.log("----------");
 result = nums.map( function(num) {
    return num / 20;
})
console.log(result);
console.log("----------");
//Working with Objects in JavaScript
//This task is to convert an object to an array:
const results = [];
const drone = {
    speed: 100,
    color: 'yellow'
}
const droneKeys = Object.keys(drone);
droneKeys.forEach( function(key) {
    results.push(key, drone[key])
})
console.log(results)

//Map
console.log("-----------");
let bestBoxers = new Map();
bestBoxers.set(1, "The Champion");
bestBoxers.set(2, "The Runner-up");
bestBoxers.set(3, "The third place");

console.log(bestBoxers);

//To get a specific value, you need to use the get() method. For example:  
console.log(bestBoxers.get(1));

//Working with Sets in JavaScript 
//A set is a collection of unique values.

const repetitiveFruits = ['apple','pear','apple','pear','plum', 'apple'];
const uniqueFruits = new Set(repetitiveFruits);
console.log(uniqueFruits);

