function reverseWordsInSentence(sentence) {
   
    var words = sentence.split(' ');

    
    var reversedWords = words.map(function(word) {
        return word.split('').reverse().join('');
    });

   
    var reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}


var inputSentence = "Hello World";
var reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence); // Output: "olleH dlroW"
