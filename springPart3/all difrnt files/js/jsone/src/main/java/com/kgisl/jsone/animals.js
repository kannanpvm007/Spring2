

// Shifting Elements

animals = ['dog', 'rat', 'cat '];
console.log(animals);
animals.push('monkey');// push add last possion to new elemants
console.log(animals)
animals.pop();  // Removes the last element ("monkey") from animals
console.log(animals);




// animals.shift();
console.log(animals);  //(shift)Removes the first element "dog" from animals
animals.unshift('lion');
console.log(animals); // (unshift) add the 1st posion to new elements



// Changing Elements

animals[2] = 'tiger';
console.log(animals); //hanges the (index) element of fruits to "tiger"

animals[animals.lentgh] = "got";
console.log(animals);  //  Changes the first element in fruits to undefined

delete animals[0];
console.log(animals); // delete the element (index)



// Splicing an Array

animals.splice(4, 5, "onfe", "two"); //the splice() method can be used to add new items to an array:
console.log(animals);

animals.splice(1, 1);
console.log("animals:" + animals); //With clever parameter setting, you can use splice() to remove elements without leaving "holes" in the array:


//    Merging (Concatenating) Arrays
console.log("Merging (Concatenating) Arrays");

computer = ["key", "cpu"];
anicom = animals.concat(computer);
console.log(anicom);


var arr1 = ["Cecilie", "Lone"];
var arr2 = ["Emil", "Tobias", "Linus"];
var arr3 = ["Robin", "Morgan"];
var myChildren = arr1.concat(arr2, arr3);   // Concatenates arr1 with arr2 and arr3
console.log(myChildren);
myChildren = myChildren.concat(["maven"]);
console.log(myChildren);


//     Slicing an Array
// The slice() method slices out a piece of an array into a new array.

// This example slices out a part of an array starting from array element 1 ("Orange"):


var fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
var citrus = fruits.slice(1);//This example slices out a part of an array starting from array element 1 ("Orange"):
console.log(citrus);

//sorting
var fruits1 = ["Banana", "Orange", "Apple", "Mango"];
// // document.getElementById("demo").innerHTML = citrus1.toString();
// document.getElementById("citrus").innerHTML = fruits1.toString();

console.log(fruits1.sort());
console.log(fruits1.reverse());

var points = [40, 100, 1, 5, 25, 10];
console.log(points.sort(function (x, y) { return x - y }


));



